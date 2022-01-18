package DAO;

import model.ModelDespesas;
import util.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/**
*
* @author Mariana Barretto
*/
public class DAODespesas extends ConexaoSQLite {

    /**
    * grava Despesas
    * @param pModelDespesas
    * @return int
    */
    public boolean salvarDespesasDAO(ModelDespesas pModelDespesas){
        this.conectar();
        String sql = 
            "INSERT INTO tbl_despesas ("
                    + "descricao,"
                    + "tipo_despesa,"
                    + "valor,"
                    + "vencimento_fatura,"
                    + "status_pagamento"
                + ") VALUES (?,?,?,?,?);"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1, pModelDespesas.getDescricao());
            preparedStatement.setString(2, pModelDespesas.getTipoDespesa());
            preparedStatement.setDouble(3, pModelDespesas.getValor());
            preparedStatement.setString(4, pModelDespesas.getVencimentoFatura());
            preparedStatement.setString(5, pModelDespesas.getStatusPagamento());
            preparedStatement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
            return true;
        }

    }
/**
    * recupera Despesas
    * @param pIdDespesas
    * @return ModelDespesas
    */
    public ModelDespesas getDespesasDAO(int pIdDespesas){
        ModelDespesas modelDespesas = null;

        String sql = "SELECT "
                    + "pk_id_despesas,"
                    + "descricao,"
                    + "tipo_despesa,"
                    + "valor,"
                    + "vencimento_fatura,"
                    + "status_pagamento"
                 + " FROM"
                     + " tbl_despesas"
                 + " WHERE"
                     + " pk_id_despesas = ?"
                + ";"
            ;

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            
            preparedStatement.setInt(1, pIdDespesas);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {modelDespesas = new ModelDespesas();
                modelDespesas.setIdDespesas(resultSet.getInt(1));
                modelDespesas.setDescricao(resultSet.getString(2));
                modelDespesas.setTipoDespesa(resultSet.getString(3));
                modelDespesas.setValor(resultSet.getDouble(4));
                modelDespesas.setVencimentoFatura(resultSet.getString(5));
                modelDespesas.setStatusPagamento(resultSet.getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return modelDespesas;
    }

    /**
    * recupera uma lista de Despesas
        * @return ArrayList
    */
    public ArrayList<ModelDespesas> getListaDespesasDAO(){
        ArrayList<ModelDespesas> listamodelDespesas = new ArrayList();
        ModelDespesas modelDespesas = null;

        String sql = "SELECT "
                    + "pk_id_despesas,"
                    + "descricao,"
                    + "tipo_despesa,"
                    + "valor,"
                    + "vencimento_fatura,"
                    + "status_pagamento"
                 + " FROM"
                     + " tbl_despesas"
                + ";";

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelDespesas = new ModelDespesas();
                modelDespesas.setIdDespesas(resultSet.getInt(1));
                modelDespesas.setDescricao(resultSet.getString(2));
                modelDespesas.setTipoDespesa(resultSet.getString(3));
                modelDespesas.setValor(resultSet.getDouble(4));
                modelDespesas.setVencimentoFatura(resultSet.getString(5));
                modelDespesas.setStatusPagamento(resultSet.getString(6));
                listamodelDespesas.add(modelDespesas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return listamodelDespesas;
    }

    /**
    * atualiza Despesas
    * @param pModelDespesas
    * @return boolean
    */
    public boolean atualizarDespesasDAO(ModelDespesas pModelDespesas){
        this.conectar();
        String sql = 
            "UPDATE tbl_despesas SET "
                    + "pk_id_despesas = ?,"
                    + "descricao = ?,"
                    + "tipo_despesa = ?,"
                    + "valor = ?,"
                    + "vencimento_fatura = ?,"
                    + "status_pagamento = ?"
                + " WHERE pk_id_despesas = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pModelDespesas.getIdDespesas());
            preparedStatement.setString(2, pModelDespesas.getDescricao());
            preparedStatement.setString(3, pModelDespesas.getTipoDespesa());
            preparedStatement.setDouble(4, pModelDespesas.getValor());
            preparedStatement.setString(5, pModelDespesas.getVencimentoFatura());
            preparedStatement.setString(6, pModelDespesas.getStatusPagamento());
            preparedStatement.setInt(7, pModelDespesas.getIdDespesas());
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }
/**
    * exclui Despesas
    * @param pIdDespesas
    * @return boolean
    */
    public boolean excluirDespesasDAO(int pIdDespesas){
        this.conectar();
        String sql = 
            "DELETE FROM tbl_despesas "
                + " WHERE pk_id_despesas = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pIdDespesas);
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }

}