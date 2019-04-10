package br.com.trete.dsp20191.aulas1316.persistencia.dml.query;

import br.com.trete.dsp20191.aulas1316.model.Cargo;
import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaCargo extends PersistenciaJdbc {

    private Cargo cargo;

    public ConsultaCargo(){
        cargo = new Cargo();
    }

    public Cargo consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM CARGOS WHERE ID_CARGO = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery(  );
        while(rs.next()){
            cargo.setId(rs.getString("ID_CARGO"));
            cargo.setSalario(rs.getDouble("SALARIO"));
            cargo.setNome(rs.getString("NOME"));
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return cargo;
    }
}
