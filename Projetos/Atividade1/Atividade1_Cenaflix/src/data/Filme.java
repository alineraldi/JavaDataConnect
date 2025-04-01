package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Filme {
    private int id;
    private String nome;
    private String dataLancamento;
    private String categoria;
    
    public Filme() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.format(sdf.parse(this.dataLancamento)); 
        } catch (ParseException e) {
            System.out.println("Erro ao formatar data: " + e.getMessage());
            return null;
        }
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
