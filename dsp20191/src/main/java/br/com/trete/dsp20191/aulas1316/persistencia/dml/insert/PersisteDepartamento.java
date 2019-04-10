package br.com.trete.dsp20191.aulas1316.persistencia.dml.insert;

import br.com.trete.dsp20191.aulas1316.model.Departamento;
import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class PersisteDepartamento extends PersistenciaJdbc {

    Departamento departamento;

    public PersisteDepartamento(){
        departamento = new Departamento();
    }

    public boolean persisteDepartamento(Departamento departamento) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO DEPARTAMENTOS " +
                "VALUES('" + departamento.getId() +
                "','" + departamento.getNome() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Departamento foi persistido corretamente!");
        stmt.close();
        connection.close();

        return true;
    }

}
