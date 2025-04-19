package br.cm.senac.financasjpa_ex5;

import br.com.senac.financasjpa.gui.Principal;
import br.com.senac.financasjpa_ex5.persistencia.Conta;
import br.com.senac.financasjpa_ex5.persistencia.ContaDAO;
import br.com.senac.financasjpa_ex5.persistencia.Despesa;
import br.com.senac.financasjpa_ex5.persistencia.DespesaDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class FinancasJPA_Ex5 {

    public static void main(String[] args) {
//        EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("financas-pu");
//        EntityManager manager = fabricaEntidade.createEntityManager();
//    
//        // Criando o objeto a ser inserido no banco
//        Despesa gasto = new Despesa();
//        gasto.setDescricao("Primeira despesa");
//        gasto.setValor(10.50);
//        gasto.setData(LocalDate.of(2022, 5, 30));
//        
//        // Inserindo o objeto no banco de dados (CREATE)
//        manager.getTransaction().begin();
//        manager.persist(gasto);
//        manager.getTransaction().commit();
        
//        // Recuperando dados do banco via JPA (READ)
//        Despesa gasto = manager.find(Despesa.class, 1);
//        System.out.println(gasto.getDescricao());
//        
//        // Atualizando dados do banco via JPA (UPDATE)
//        Despesa gasto = manager.find(Despesa.class, 1);
//
//        manager.getTransaction().begin();
//        gasto.setDescricao("Despesa atualizada");
//        manager.getTransaction().commit();
//
//        // Atualizando com merge() - se não for conveniente lidar com um objeto gerenciável do Entity Manager
//        Despesa gasto = new Despesa();
//        gasto.setId(1);
//        gasto.setDescricao("Atualizado com Merge");
//        gasto.setData(LocalDate.of(2022, 5, 30));
//        // Como não foi atribuido nenhum valor para a coluna 'valor', ela foi atualizada com o double padrao 0.0
//
//        manager.getTransaction().begin();
//        manager.merge(gasto);
//        manager.getTransaction().commit();
//        
//        // Deletando dados do banco (DELETE)
//        Despesa gasto = manager.find(Despesa.class, 1);
//        manager.getTransaction().begin();
//        manager.remove(gasto);
//        manager.getTransaction().commit();
        
//        // Fechando a conexão e a fábrica
//        manager.close();
//        fabricaEntidade.close();

//        DespesaDAO despesaDao = new DespesaDAO();
//        
//        Despesa d = new Despesa();
//        d.setDescricao("Compras de mercado");
//        d.setValor(165.70);
//        d.setData(LocalDate.of(2022, 11, 15));
//        
//        despesaDao.cadastrar(d);
        
//        ContaDAO cDao = new ContaDAO();
//        List<Conta> lista = cDao.listar();
//        for (Conta c : lista) {
//            System.out.println(c.getNome());
//        }
//        
//        DespesaDAO despDao = new DespesaDAO();
//        List<Despesa> despesas = despDao.listar();
//        for (Despesa d : despesas)
//            System.out.println(d.getId() + " - " + d.getDescricao());
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }  
}
