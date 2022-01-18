package controller;

import model.ModelInquilinos;
import DAO.DAOInquilinos;
import java.util.ArrayList;

/**
*
* @author Mariana Barretto
*/
public class ControllerInquilinos {

    private DAOInquilinos daoInquilinos = new DAOInquilinos();

    /**
    * grava Inquilinos
    * @param pModelInquilinos
    * @return int
    */
    public boolean salvarInquilinosController(ModelInquilinos pModelInquilinos){
        return this.daoInquilinos.salvarInquilinosDAO(pModelInquilinos);
    }

    /**
    * recupera Inquilinos
    * @param pIdInquilinos
    * @return ModelInquilinos
    */
    public ModelInquilinos getInquilinosController(int pIdInquilinos){
        return this.daoInquilinos.getInquilinosDAO(pIdInquilinos);
    }

    /**
    * recupera uma lista deInquilinos
    * @param pIdInquilinos
    * @return ArrayList
    */
    public ArrayList<ModelInquilinos> getListaInquilinosController(){
        return this.daoInquilinos.getListaInquilinosDAO();
    }

    /**
    * atualiza Inquilinos
    * @param pModelInquilinos
    * @return boolean
    */
    public boolean atualizarInquilinosController(ModelInquilinos pModelInquilinos){
        return this.daoInquilinos.atualizarInquilinosDAO(pModelInquilinos);
    }

    /**
    * exclui Inquilinos
    * @param pIdInquilinos
    * @return boolean
    */
    public boolean excluirInquilinosController(int pIdInquilinos){
        return this.daoInquilinos.excluirInquilinosDAO(pIdInquilinos);
    }
}