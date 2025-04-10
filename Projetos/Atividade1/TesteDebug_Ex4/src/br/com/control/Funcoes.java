package br.com.control;

import br.com.banco.DaoSelect;
import br.com.model.DadosPessoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Funcoes {
    
    public void buscaPessoa() {
        DaoSelect daoSelect = new DaoSelect();
        daoSelect.connect();
        ResultSet rs = daoSelect.selectPessoa();
        
        List<DadosPessoa> listPessoa = new ArrayList<>();
        try {
            while(rs.next()){
                DadosPessoa dadosPessoa = new DadosPessoa();
                dadosPessoa.setCpf(rs.getString("CPF"));
                dadosPessoa.setId(rs.getInt("ID"));
                dadosPessoa.setIdade(rs.getInt("IDADE"));
                dadosPessoa.setNome(rs.getString("NOME"));
                dadosPessoa.setPeso(rs.getDouble("PESO"));
                dadosPessoa.setTelefone(rs.getString("TELEFONE"));
                listPessoa.add(dadosPessoa);
            }
        } catch (SQLException sqle) {
            Logger.getLogger(Funcoes.class.getName()).log(Level.SEVERE, null, sqle);
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        }
        daoSelect.deconnect();
        
        System.out.println(listPessoa.size());
    }
    
    public void inserePessoa() {
        DaoSelect daoSelect = new DaoSelect();
        daoSelect.connect();
        
        DadosPessoa dadosPessoa = new DadosPessoa();
        dadosPessoa.setCpf("1234567891");
        dadosPessoa.setIdade(11);
        dadosPessoa.setNome("Teste");
        dadosPessoa.setPeso(10.0);
        dadosPessoa.setTelefone("12345678911151515");
        
        daoSelect.insertPessoa(dadosPessoa);
        
        daoSelect.deconnect();
    }
}
