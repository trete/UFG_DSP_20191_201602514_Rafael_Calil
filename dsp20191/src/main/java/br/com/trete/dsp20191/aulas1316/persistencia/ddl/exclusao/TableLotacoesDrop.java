package br.com.trete.dsp20191.aulas1316.persistencia.ddl.exclusao;


import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class TableLotacoesDrop extends PersistenciaJdbc {

    public boolean excluiTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Excluindo a tabela Lotacoes");

        String sql = "DROP TABLE IF EXISTS LOTACOES";

        stmt.executeUpdate(sql);

        System.out.println("Tabela LOTACOES excluida com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;
    }

}
