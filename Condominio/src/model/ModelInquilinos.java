package model;
/**
*
* @author Mariana Barretto
*/
public class ModelInquilinos {

    private int IdInquilinos;
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;
    private String email;

    /**
    * Construtor
    */
    public ModelInquilinos(){}

    /**
    * seta o valor de IdInquilinos
    * @param pIdInquilinos
    */
    public void setIdInquilinos(int pIdInquilinos){
        this.IdInquilinos = pIdInquilinos;
    }
    /**
    * @return pk_IdInquilinos
    */
    public int getIdInquilinos(){
        return this.IdInquilinos;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * @return nome
    */
    public String getNome(){
        return this.nome;
    }

    /**
    * seta o valor de idade
    * @param pIdade
    */
    public void setIdade(int pIdade){
        this.idade = pIdade;
    }
    /**
    * @return idade
    */
    public int getIdade(){
        return this.idade;
    }

    /**
    * seta o valor de sexo
    * @param pSexo
    */
    public void setSexo(String pSexo){
        this.sexo = pSexo;
    }
    /**
    * @return sexo
    */
    public String getSexo(){
        return this.sexo;
    }

    /**
    * seta o valor de telefone
    * @param pTelefone
    */
    public void setTelefone(String pTelefone){
        this.telefone = pTelefone;
    }
    /**
    * @return telefone
    */
    public String getTelefone(){
        return this.telefone;
    }

    /**
    * seta o valor de email
    * @param pEmail
    */
    public void setEmail(String pEmail){
        this.email = pEmail;
    }
    /**
    * @return email
    */
    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString(){
        return "ModelInquilinos {" + "::IdInquilinos = " + this.IdInquilinos + "::nome = " + this.nome + "::idade = " + this.idade + "::sexo = " + this.sexo + "::telefone = " + this.telefone + "::email = " + this.email +  "}";
    }
}