package model;
/**
*
* @author Mariana Barretto
*/
public class ModelUnidades {

    private int idUnidades;
    private String identificacao;
    private String proprietario;
    private String condominio;
    private String endereco;

    /**
    * Construtor
    */
    public ModelUnidades(){}

    /**
    * seta o valor de idUnidades
    * @param pIdUnidades
    */
    public void setIdUnidades(int pIdUnidades){
        this.idUnidades = pIdUnidades;
    }
    /**
    * @return pk_idUnidades
    */
    public int getIdUnidades(){
        return this.idUnidades;
    }

    /**
    * seta o valor de identificacao
    * @param pIdentificacao
    */
    public void setIdentificacao(String pIdentificacao){
        this.identificacao = pIdentificacao;
    }
    /**
    * @return identificacao
    */
    public String getIdentificacao(){
        return this.identificacao;
    }

    /**
    * seta o valor de proprietario
    * @param pProprietario
    */
    public void setProprietario(String pProprietario){
        this.proprietario = pProprietario;
    }
    /**
    * @return proprietario
    */
    public String getProprietario(){
        return this.proprietario;
    }

    /**
    * seta o valor de condominio
    * @param pCondominio
    */
    public void setCondominio(String pCondominio){
        this.condominio = pCondominio;
    }
    /**
    * @return condominio
    */
    public String getCondominio(){
        return this.condominio;
    }

    /**
    * seta o valor de endereco
    * @param pEndereco
    */
    public void setEndereco(String pEndereco){
        this.endereco = pEndereco;
    }
    /**
    * @return endereco
    */
    public String getEndereco(){
        return this.endereco;
    }

    @Override
    public String toString(){
        return "ModelUnidades {" + "::idUnidades = " + this.idUnidades + "::identificacao = " + this.identificacao + "::proprietario = " + this.proprietario + "::condominio = " + this.condominio + "::endereco = " + this.endereco +  "}";
    }
}