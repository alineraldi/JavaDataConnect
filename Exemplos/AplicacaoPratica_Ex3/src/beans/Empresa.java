package beans;

public class Empresa {
    private int id;
    private String nomeEmpresa;
    private String areaAtuacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }  
    
    @Override
    public String toString()
    {
        return this.nomeEmpresa;
    }
    
    @Override
    public boolean equals (Object objeto)
    {
        Empresa e = (Empresa) objeto;
        if (this.id == e.getId()) {
            return true;
        } else {
            return false;
        }
    }
}
