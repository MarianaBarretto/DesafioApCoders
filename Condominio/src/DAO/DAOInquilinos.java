package DAO;

import model.ModelInquilinos;
import util.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/**
*
* @author Mariana Barretto
*/
public class DAOInquilinos extends ConexaoSQLite {

    /**
    * grava Inquilinos
    * @param pModelInquilinos
    * @return int
    */
    public boolean salvarInquilinosDAO(ModelInquilinos pModelInquilinos){
        this.conectar();
        String sql = 
            "INSERT INTO tbl_inquilinos ("
                    + "nome,"
                    + "idade,"
                    + "sexo,"
                    + "telefone,"
                    + "email"
                + ") VALUES (?,?,?,?,?);"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1, pModelInquilinos.getNome());
            preparedStatement.setInt(2, pModelInquilinos.getIdade());
            preparedStatement.setString(3, pModelInquilinos.getSexo());
            preparedStatement.setString(4, pModelInquilinos.getTelefone());
            preparedStatement.setString(5, pModelInquilinos.getEmail());
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
    * recupera Inquilinos
    * @param pIdInquilinos
    * @return ModelInquilinos
    */
    public ModelInquilinos getInquilinosDAO(int pIdInquilinos){
        ModelInquilinos modelInquilinos = null;

        String sql = "SELECT "
                    + "pk_id_inquilinos,"
                    + "nome,"
                    + "idade,"
                    + "sexo,"
                    + "telefone,"
                    + "email"
                 + " FROM"
                     + " tbl_inquilinos"
                 + " WHERE"
                     + " pk_id_inquilinos = ?"
                + ";"
            ;

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            
            preparedStatement.setInt(1, pIdInquilinos);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {modelInquilinos = new ModelInquilinos();
                modelInquilinos.setIdInquilinos(resultSet.getInt(1));
                modelInquilinos.setNome(resultSet.getString(2));
                modelInquilinos.setIdade(resultSet.getInt(3));
                modelInquilinos.setSexo(resultSet.getString(4));
                modelInquilinos.setTelefone(resultSet.getString(5));
                modelInquilinos.setEmail(resultSet.getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return modelInquilinos;
    }

    /**
    * recupera uma lista de Inquilinos
        * @return ArrayList
    */
    public ArrayList<ModelInquilinos> getListaInquilinosDAO(){
        ArrayList<ModelInquilinos> listamodelInquilinos = new ArrayList();
        ModelInquilinos modelInquilinos = null;

        String sql = "SELECT "
                    + "pk_id_inquilinos,"
                    + "nome,"
                    + "idade,"
                    + "sexo,"
                    + "telefone,"
                    + "email"
                 + " FROM"
                     + " tbl_inquilinos"
                + ";";

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelInquilinos = new ModelInquilinos();
                modelInquilinos.setIdInquilinos(resultSet.getInt(1));
                modelInquilinos.setNome(resultSet.getString(2));
                modelInquilinos.setIdade(resultSet.getInt(3));
                modelInquilinos.setSexo(resultSet.getString(4));
                modelInquilinos.setTelefone(resultSet.getString(5));
                modelInquilinos.setEmail(resultSet.getString(6));
                listamodelInquilinos.add(modelInquilinos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return listamodelInquilinos;
    }

    /**
    * atualiza Inquilinos
    * @param pModelInquilinos
    * @return boolean
    */
    public boolean atualizarInquilinosDAO(ModelInquilinos pModelInquilinos){
        this.conectar();
        String sql = 
            "UPDATE tbl_inquilinos SET "
                    + "pk_id_inquilinos = ?,"
                    + "nome = ?,"
                    + "idade = ?,"
                    + "sexo = ?,"
                    + "telefone = ?,"
                    + "email = ?"
                + " WHERE pk_id_inquilinos = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pModelInquilinos.getIdInquilinos());
            preparedStatement.setString(2, pModelInquilinos.getNome());
            preparedStatement.setInt(3, pModelInquilinos.getIdade());
            preparedStatement.setString(4, pModelInquilinos.getSexo());
            preparedStatement.setString(5, pModelInquilinos.getTelefone());
            preparedStatement.setString(6, pModelInquilinos.getEmail());
            preparedStatement.setInt(7, pModelInquilinos.getIdInquilinos());
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }
/**
    * exclui Inquilinos
    * @param pIdInquilinos
    * @return boolean
    */
    public boolean excluirInquilinosDAO(int pIdInquilinos){
        this.conectar();
        String sql = 
            "DELETE FROM tbl_inquilinos "
                + " WHERE pk_id_inquilinos = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pIdInquilinos);
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }

}