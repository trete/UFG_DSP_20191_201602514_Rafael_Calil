package br.com.trete.dsp20191.aulas1316.persistencia.dml.query;

import br.com.trete.dsp20191.aulas1316.model.Lotacao;
import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaLotacao extends PersistenciaJdbc {

    private Lotacao lotacao;

    public ConsultaLotacao(){

        lotacao = new Lotacao();
    }

    public Lotacao consultaPorId(Long id) throws Exception{

        preparaPersistencia();

        String sql = "SELECT * FROM LOTACOES WHERE ID_LOTACAO = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1,id);

        ResultSet rs = pstmt.executeQuery(  );
        while(rs.next()){
            lotacao.setId(rs.getLong("ID_PROFESSOR"));
            lotacao.getDepartamento().setId(rs.getString("MATRICULA"));
            lotacao.getCargo().setId(rs.getString("NOME"));
            lotacao.setDataFinal(rs.getDate("DATAFINAL"));
            lotacao.setDataInicial(rs.getDate("DATAINICIAL"));
        }

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
        return lotacao;
    }
}
