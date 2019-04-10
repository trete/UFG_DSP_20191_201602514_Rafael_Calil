package br.com.trete.dsp20191.aulas1316.persistencia.ddl.exclusao;


import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class TableFuncionariosDrop extends PersistenciaJdbc {

    public boolean excluiTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Excluindo a Tabela Funcionarios");

        String sql = "DROP TABLE IF EXISTS FUNCIONARIOS";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Funcionarios excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;
    }
}
