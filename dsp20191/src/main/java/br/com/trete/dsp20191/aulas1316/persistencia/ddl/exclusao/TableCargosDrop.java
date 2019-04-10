package br.com.trete.dsp20191.aulas1316.persistencia.ddl.exclusao;


import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class TableCargosDrop extends PersistenciaJdbc {

    public boolean excluiTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Excluindo a tabela Cargos");

        String sql = "DROP TABLE IF EXISTS CARGOS";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Cargos excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}
