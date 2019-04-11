package br.com.trete.dsp20191.aulas1316.persistencia.ddl.alteracao;


import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class AdicionaFKTabelaLotacoes extends PersistenciaJdbc {

    public boolean alteraTabela() throws Exception{

        preparaPersistencia();

        System.out.println("Alterando a Tabela Lotacoes");

        String sql = "ALTER TABLE LOTACOES ADD FOREIGN KEY (CARGO) REFERENCES CARGOS(ID_CARGO) ON DELETE CASCADE;\n" +
                " ALTER TABLE LOTACOES ADD FOREIGN KEY (DEPARTAMENTO) REFERENCES DEPARTAMENTOS(ID_DEPARTAMENTO) ON DELETE CASCADE;\n" +
                " ALTER TABLE LOTACOES ADD FOREIGN KEY (FUNCIONARIO) REFERENCES FUNCIONARIOS(ID_FUNCIONARIO) ON DELETE CASCADE;";

        stmt.executeUpdate(sql);

        System.out.println("Tabela Lotacoes alterada com sucesso!");

        //STEP 4: Clean-up environment
        stmt.close();
        connection.close();
        return true;
    }
}
