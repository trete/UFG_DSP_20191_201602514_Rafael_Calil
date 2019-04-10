package br.com.trete.dsp20191.aulas1316.persistencia.dml.delete;

import br.com.trete.dsp20191.aulas1316.model.Funcionario;
import br.com.trete.dsp20191.aulas1316.persistencia.base.PersistenciaJdbc;
import br.com.trete.dsp20191.aulas1316.persistencia.dml.query.ConsultaFuncionario;

import java.sql.PreparedStatement;

public class DeletaFuncionario extends PersistenciaJdbc {

    public boolean deletaFuncionario(Long id){
        boolean result = false;
        try {
            Funcionario funcionario = new ConsultaFuncionario().consultaPorId(id);
            if (funcionario.getId() != null){
                preparaPersistencia();

                String sql = "DELETE FROM FUNCIONARIOS WHERE ID_FUNCIONARIO = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1,id);
                pstmt.executeUpdate();
                result = true;
                System.out.println("O Funcionario foi excluido corretamente!");
                pstmt.close();
            }else{
                System.out.println("Não foi encontrado funcionario com id = " + id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
