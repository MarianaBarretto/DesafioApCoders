package model;
/**
*
* @author Mariana Barretto
*/
public class ModelDespesas {

    private int idDespesas;
    private String descricao;
    private String tipoDespesa;
    private double valor;
    private String vencimentoFatura;
    private String statusPagamento;
    private String condominio;

    /**
    * Construtor
    */
    public ModelDespesas(){}

    /**
    * seta o valor de idDespesas
    * @param pIdDespesas
    */
    public void setIdDespesas(int pIdDespesas){
        this.idDespesas = pIdDespesas;
    }
    /**
    * @return pk_idDespesas
    */
    public int getIdDespesas(){
        return this.idDespesas;
    }

    /**
    * seta o valor de descricao
    * @param pDescricao
    */
    public void setDescricao(String pDescricao){
        this.descricao = pDescricao;
    }
    /**
    * @return descricao
    */
    public String getDescricao(){
        return this.descricao;
    }

    /**
    * seta o valor de tipoDespesa
    * @param pTipoDespesa
    */
    public void setTipoDespesa(String pTipoDespesa){
        this.tipoDespesa = pTipoDespesa;
    }
    /**
    * @return tipoDespesa
    */
    public String getTipoDespesa(){
        return this.tipoDespesa;
    }

    /**
    * seta o valor de valor
    * @param pValor
    */
    public void setValor(double pValor){
        this.valor = pValor;
    }
    /**
    * @return valor
    */
    public double getValor(){
        return this.valor;
    }

    /**
    * seta o valor de vencimentoFatura
    * @param pVencimentoFatura
    */
    public void setVencimentoFatura(String pVencimentoFatura){
        this.vencimentoFatura = pVencimentoFatura;
    }
    /**
    * @return vencimentoFatura
    */
    public String getVencimentoFatura(){
        return this.vencimentoFatura;
    }

    /**
    * seta o valor de statusPagamento
    * @param pStatusPagamento
    */
    public void setStatusPagamento(String pStatusPagamento){
        this.statusPagamento = pStatusPagamento;
    }
    /**
    * @return condominio
    */
    public String getStatusPagamento(){
        return this.statusPagamento;
    }
    public void setCondominio(String pCondominio){
        this.condominio = pCondominio;
    }
    /**
    * @return condominio
    */
    public String getCondominio(){
        return this.condominio;
    }
    @Override
    public String toString(){
        return "ModelDespesas {" + "::idDespesas = " + this.idDespesas + "::descricao = " + this.descricao + "::tipoDespesa = " + this.tipoDespesa + "::valor = " + this.valor + "::vencimentoFatura = " + this.vencimentoFatura + "::statusPagamento = " + this.statusPagamento + "::condominio = " + this.condominio +  "}";
    }
}