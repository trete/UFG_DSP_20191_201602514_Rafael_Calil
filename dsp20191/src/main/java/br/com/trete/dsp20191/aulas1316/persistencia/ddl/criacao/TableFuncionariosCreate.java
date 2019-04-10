package br.com.trete.dsp20191.aulas1316.persistencia.ddl.criacao;


import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class TableFuncionariosCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a Tabela Funcionarios");

        String sql = "CREATE TABLE IF NOT EXISTS FUNCIONARIOS(\n" +
                "ID_FUNCIONARIO LONG NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL,\n" +
                "MATRICULA LONG NOT NULL" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Funcionarios criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();

        return true;
    }
}
