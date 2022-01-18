package DAO;

import model.ModelUnidades;
import util.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/**
*
* @author Mariana Barretto
*/
public class DAOUnidades extends ConexaoSQLite {

    /**
    * grava Unidades
    * @param pModelUnidades
    * @return int
    */
    public boolean salvarUnidadesDAO(ModelUnidades pModelUnidades){
        this.conectar();
        String sql = 
            "INSERT INTO tbl_unidades ("
                    + "identificacao,"
                    + "proprietario,"
                    + "condominio,"
                    + "endereco"
                + ") VALUES (?,?,?,?);"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            preparedStatement.setString(1, pModelUnidades.getIdentificacao());
            preparedStatement.setString(2, pModelUnidades.getProprietario());
            preparedStatement.setString(3, pModelUnidades.getCondominio());
            preparedStatement.setString(4, pModelUnidades.getEndereco());
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
    * recupera Unidades
    * @param pIdUnidades
    * @return ModelUnidades
    */
    public ModelUnidades getUnidadesDAO(int pIdUnidades){
        ModelUnidades modelUnidades = null;

        String sql = "SELECT "
                    + "pk_id_unidades,"
                    + "identificacao,"
                    + "proprietario,"
                    + "condominio,"
                    + "endereco"
                 + " FROM"
                     + " tbl_unidades"
                 + " WHERE"
                     + " pk_id_unidades = ?"
                + ";"
            ;

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            
            preparedStatement.setInt(1, pIdUnidades);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {modelUnidades = new ModelUnidades();
                modelUnidades.setIdUnidades(resultSet.getInt(1));
                modelUnidades.setIdentificacao(resultSet.getString(2));
                modelUnidades.setProprietario(resultSet.getString(3));
                modelUnidades.setCondominio(resultSet.getString(4));
                modelUnidades.setEndereco(resultSet.getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return modelUnidades;
    }

    /**
    * recupera uma lista de Unidades
        * @return ArrayList
    */
    public ArrayList<ModelUnidades> getListaUnidadesDAO(){
        ArrayList<ModelUnidades> listamodelUnidades = new ArrayList();
        ModelUnidades modelUnidades = null;

        String sql = "SELECT "
                    + "pk_id_unidades,"
                    + "identificacao,"
                    + "proprietario,"
                    + "condominio,"
                    + "endereco"
                 + " FROM"
                     + " tbl_unidades"
                + ";";

        this.conectar();

        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                modelUnidades = new ModelUnidades();
                modelUnidades.setIdUnidades(resultSet.getInt(1));
                modelUnidades.setIdentificacao(resultSet.getString(2));
                modelUnidades.setProprietario(resultSet.getString(3));
                modelUnidades.setCondominio(resultSet.getString(4));
                modelUnidades.setEndereco(resultSet.getString(5));
                listamodelUnidades.add(modelUnidades);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.desconectar();
        }
        return listamodelUnidades;
    }

    /**
    * atualiza Unidades
    * @param pModelUnidades
    * @return boolean
    */
    public boolean atualizarUnidadesDAO(ModelUnidades pModelUnidades){
        this.conectar();
        String sql = 
            "UPDATE tbl_unidades SET "
                    + "pk_id_unidades = ?,"
                    + "identificacao = ?,"
                    + "proprietario = ?,"
                    + "condominio = ?,"
                    + "endereco = ?"
                + " WHERE pk_id_unidades = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pModelUnidades.getIdUnidades());
            preparedStatement.setString(2, pModelUnidades.getIdentificacao());
            preparedStatement.setString(3, pModelUnidades.getProprietario());
            preparedStatement.setString(4, pModelUnidades.getCondominio());
            preparedStatement.setString(5, pModelUnidades.getEndereco());
            preparedStatement.setInt(6, pModelUnidades.getIdUnidades());
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }
/**
    * exclui Unidades
    * @param pIdUnidades
    * @return boolean
    */
    public boolean excluirUnidadesDAO(int pIdUnidades){
        this.conectar();
        String sql = 
            "DELETE FROM tbl_unidades "
                + " WHERE pk_id_unidades = ? "
                +";"
            ;
        
        try (PreparedStatement preparedStatement = criarPreparedStatement(sql)){
            preparedStatement.setInt(1, pIdUnidades);
            return preparedStatement.executeUpdate() > 0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.desconectar();
        }

    }

}