package br.com.trete.dsp20191.aulas1316.persistencia.dml.query;

import br.com.trete.dsp20191.aulas1316.model.Funcionario;
import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaFuncionario extends PersistenciaJdbc {

    private Funcionario funcionario;

    public ConsultaFuncionario(){

        funcionario = new Funcionario();
    }

    public Funcionario consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM FUNCIONARIO WHERE ID_FUNCIONARIO= ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery(  );
        while(rs.next()){
            funcionario.setId(rs.getLong("ID_FUNCIONARIO"));
            funcionario.setNome(rs.getString("NOME"));
            funcionario.setMatricula(rs.getLong("MATRICULA"));
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return funcionario;
    }
}
