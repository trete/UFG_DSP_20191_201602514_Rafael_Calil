package br.com.trete.dsp20191.aulas1316.persistencia.dml.query;

import br.com.trete.dsp20191.aulas1316.model.Departamento;
import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDepartamento extends PersistenciaJdbc {

    private Departamento departamento;

    public ConsultaDepartamento(){
        departamento = new Departamento();
    }

    public Departamento consultaPorId(long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM DEPARTAMENTOS WHERE ID_DEPARTAMENTO = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,new Long(id));

        ResultSet rs = pstmt.executeQuery(  );
        while(rs.next()){
            departamento.setId(rs.getString("ID_DEPARTAMENTO"));
            departamento.setNome(rs.getString("NOME"));
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return departamento;
    }

    public List<Departamento> consultaPorNome(String nomeCurso) throws Exception{
        List<Departamento> cursos = new ArrayList<Departamento>();
        preparaPersistencia();

        String sql = "SELECT * FROM CURSOS WHERE NOME = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1,nomeCurso);

        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            cursos.add(new Departamento(rs.getString("ID_CURSO"),rs.getString("NOME")));
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();

        return cursos;
    }
}
