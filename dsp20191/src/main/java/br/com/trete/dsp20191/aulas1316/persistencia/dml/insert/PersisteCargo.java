package br.com.trete.dsp20191.aulas1316.persistencia.dml.insert;

import br.com.trete.dsp20191.aulas1316.model.Cargo;
import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class PersisteCargo extends PersistenciaJdbc {

    public boolean persisteCargo(Cargo cargo) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO CARGOS " +
                "VALUES('" + cargo.getId() +
                "','" + cargo.getNome() +
                "','" + cargo.getSalario() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("O Cargo foi persistido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }
}
