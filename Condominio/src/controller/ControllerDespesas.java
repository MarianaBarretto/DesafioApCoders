package controller;

import model.ModelDespesas;
import DAO.DAODespesas;
import java.util.ArrayList;

/**
*
* @author Mariana Barretto
*/
public class ControllerDespesas {

    private DAODespesas daoDespesas = new DAODespesas();

    /**
    * grava Despesas
    * @param pModelDespesas
    * @return int
    */
    public boolean salvarDespesasController(ModelDespesas pModelDespesas){
        return this.daoDespesas.salvarDespesasDAO(pModelDespesas);
    }

    /**
    * recupera Despesas
    * @param pIdDespesas
    * @return ModelDespesas
    */
    public ModelDespesas getDespesasController(int pIdDespesas){
        return this.daoDespesas.getDespesasDAO(pIdDespesas);
    }

    /**
    * recupera uma lista deDespesas
    * @param pIdDespesas
    * @return ArrayList
    */
    public ArrayList<ModelDespesas> getListaDespesasController(){
        return this.daoDespesas.getListaDespesasDAO();
    }

    /**
    * atualiza Despesas
    * @param pModelDespesas
    * @return boolean
    */
    public boolean atualizarDespesasController(ModelDespesas pModelDespesas){
        return this.daoDespesas.atualizarDespesasDAO(pModelDespesas);
    }

    /**
    * exclui Despesas
    * @param pIdDespesas
    * @return boolean
    */
    public boolean excluirDespesasController(int pIdDespesas){
        return this.daoDespesas.excluirDespesasDAO(pIdDespesas);
    }
}