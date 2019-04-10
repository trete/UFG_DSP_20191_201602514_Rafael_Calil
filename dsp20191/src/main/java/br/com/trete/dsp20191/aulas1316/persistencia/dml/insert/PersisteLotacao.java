package br.com.trete.dsp20191.aulas1316.persistencia.dml.insert;

import br.com.trete.dsp20191.aulas1316.model.Lotacao;
import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;

public class PersisteLotacao extends PersistenciaJdbc {

    public boolean persisteLotacao(Lotacao lotacao) throws Exception{

        preparaPersistencia();

        String sql = "INSERT INTO DISCIPLINAS " +
                "VALUES('" + lotacao.getId() +
                "','" + lotacao.getDataInicial() +
                "','" + lotacao.getDataFinal() +
                "','" + lotacao.getCargo().getId() +
                "','" + lotacao.getDepartamento().getId() +
                "')";

        stmt.executeUpdate(sql);
        System.out.println("A Disciplina foi persistida corretamente!");
        stmt.close();
        connection.close();

        return true;
    }
}
