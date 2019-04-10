package br.com.trete.dsp20191.aulas1316.persistencia.ddl.criacao;


import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class TableLotacoesCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a tabela Lotacoes");

        String sql = "CREATE TABLE IF NOT EXISTS LOTACOES(\n" +
                "ID_LOTACAO LONG NOT NULL PRIMARY KEY,\n" +
                "DATAINICAL DATE NOT NULL," +
                "DATAFINAL DATE NOT NULL,\n" +
                "ID_CARGO VARCHAR(15)" +
                "ID_DEPARTAMENTO VARCHAR(15)" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Lotacoes criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;
    }

}
