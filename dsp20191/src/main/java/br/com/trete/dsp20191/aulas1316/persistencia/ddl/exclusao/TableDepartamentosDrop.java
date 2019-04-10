package br.com.trete.dsp20191.aulas1316.persistencia.ddl.exclusao;


import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class TableDepartamentosDrop extends PersistenciaJdbc {

    public boolean excluiTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Excluindo a tabela Departamentos");

        String sql = "DROP TABLE IF EXISTS DEPARTAMENTOS";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Departamentos excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;
    }

}
