package br.com.trete.dsp20191.aulas1316.persistencia.dml.insert;

import br.com.trete.dsp20191.aulas1316.model.Funcionario;
import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class PersisteFuncionario extends PersistenciaJdbc {

    public boolean persisteFuncionario(Funcionario funcionario) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO PROFESSORES " +
                "VALUES('" + funcionario.getId() +
                "','" + funcionario.getNome() +
                "','" + funcionario.getMatricula() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Professor foi persistido corretamente!");
        stmt.close();
        connection.close();

        return true;

    }
}
