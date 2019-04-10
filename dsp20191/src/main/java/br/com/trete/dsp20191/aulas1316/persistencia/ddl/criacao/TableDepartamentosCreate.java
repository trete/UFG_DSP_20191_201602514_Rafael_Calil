package br.com.trete.dsp20191.aulas1316.persistencia.ddl.criacao;


import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class TableDepartamentosCreate extends PersistenciaJdbc {

    public boolean criaTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Criando a tabela Departamentos");

        String sql = "CREATE TABLE IF NOT EXISTS DEPARTAMENTOS(\n" +
                "ID_DEPARTAMENTO VARCHAR(15) NOT NULL PRIMARY KEY,\n" +
                "NOME VARCHAR(100) NOT NULL\n" +
                ")";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Departamentos criada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }

}
