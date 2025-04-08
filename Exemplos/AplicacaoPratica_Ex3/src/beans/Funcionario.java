package beans;

import java.util.Date;


public class Funcionario {
    private int id;
    private String nomefunc;
    private Empresa empresaid; // Ao invés de esse atributo ser int, aqui criamos ele do tipo Objeto e fazemos uma associação devido a chave estrangeira
    private Date dataadmissao; 
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomefunc() {
        return nomefunc;
    }

    public void setNomefunc(String nomefunc) {
        this.nomefunc = nomefunc;
    }

    public Empresa getEmpresaid() {
        return empresaid;
    }

    public void setEmpresaid(Empresa empresaid) {
        this.empresaid = empresaid;
    }

    public Date getDataadmissao() {
        return dataadmissao;
    }

    public void setDataadmissao(Date dataadmissao) {
        this.dataadmissao = dataadmissao;
    }
    
    
    
}
