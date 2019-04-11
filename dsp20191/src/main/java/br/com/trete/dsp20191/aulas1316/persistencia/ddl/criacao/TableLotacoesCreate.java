package br.com.trete.dsp20191.aulas1316.persistencia.ddl.criacao;


import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class TableLotacoesCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a tabela Lotacoes");

        String sql = "CREATE TABLE IF NOT EXISTS LOTACOES(\n" +
                "ID_LOTACAO LONG NOT NULL PRIMARY KEY,\n" +
                "DATAINICIAL DATE NOT NULL,\n" +
                "DATAFINAL DATE NOT NULL,\n" +
                "CARGO LONG NOT NULL,\n" +
                "DEPARTAMENTO LONG NOT NULL," +
                "FUNCIONARIO LONG NOT NULL" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Lotacoes criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;
    }

}
