package br.com.trete.dsp20191.aulas1316.persistencia.ddl.criacao;


import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class TableCargosCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a tabela Cargos");

        String sql = "CREATE TABLE IF NOT EXISTS CARGOS(\n" +
                "ID_CARGO VARCHAR(15) NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(15) NOT NULL," +
                "SALARIO DOUBLE NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Cargos criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}
