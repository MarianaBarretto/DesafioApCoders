package controller;

import model.ModelUnidades;
import DAO.DAOUnidades;
import java.util.ArrayList;

/**
*
* @author Mariana Barretto
*/
public class ControllerUnidades {

    private DAOUnidades daoUnidades = new DAOUnidades();

    /**
    * grava Unidades
    * @param pModelUnidades
    * @return int
    */
    public boolean salvarUnidadesController(ModelUnidades pModelUnidades){
        return this.daoUnidades.salvarUnidadesDAO(pModelUnidades);
    }

    /**
    * recupera Unidades
    * @param pIdUnidades
    * @return ModelUnidades
    */
    public ModelUnidades getUnidadesController(int pIdUnidades){
        return this.daoUnidades.getUnidadesDAO(pIdUnidades);
    }

    /**
    * recupera uma lista deUnidades
    * @param pIdUnidades
    * @return ArrayList
    */
    public ArrayList<ModelUnidades> getListaUnidadesController(){
        return this.daoUnidades.getListaUnidadesDAO();
    }
//    public ArrayList<ModelUnidades> getListaUnidadesComFiltroController(String tipoFatura){
//        return this.daoUnidades.getListaUnidadesComFiltroDAO(tipoFatura);
//    }
    /**
    * atualiza Unidades
    * @param pModelUnidades
    * @return boolean
    */
    public boolean atualizarUnidadesController(ModelUnidades pModelUnidades){
        return this.daoUnidades.atualizarUnidadesDAO(pModelUnidades);
    }

    /**
    * exclui Unidades
    * @param pIdUnidades
    * @return boolean
    */
    public boolean excluirUnidadesController(int pIdUnidades){
        return this.daoUnidades.excluirUnidadesDAO(pIdUnidades);
    }
}