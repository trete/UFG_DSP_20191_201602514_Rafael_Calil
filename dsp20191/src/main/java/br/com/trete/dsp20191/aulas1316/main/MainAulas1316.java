package br.com.trete.dsp20191.aulas1316.main;

import br.com.trete.dsp20191.aulas1316.exceptions.InvalidDataBaseTypeException;
import br.com.trete.dsp20191.aulas1316.model.Cargo;
import br.com.trete.dsp20191.aulas1316.model.Departamento;
import br.com.trete.dsp20191.aulas1316.model.Funcionario;
import br.com.trete.dsp20191.aulas1316.model.Lotacao;
import br.com.trete.dsp20191.aulas1316.persistencia.base.CriaConexao;
import br.com.trete.dsp20191.aulas1316.persistencia.ddl.criacao.TableCargosCreate;
import br.com.trete.dsp20191.aulas1316.persistencia.ddl.criacao.TableDepartamentosCreate;
import br.com.trete.dsp20191.aulas1316.persistencia.ddl.criacao.TableFuncionariosCreate;
import br.com.trete.dsp20191.aulas1316.persistencia.ddl.criacao.TableLotacoesCreate;
import br.com.trete.dsp20191.aulas1316.persistencia.dml.insert.PersisteCargo;
import br.com.trete.dsp20191.aulas1316.persistencia.dml.insert.PersisteDepartamento;
import br.com.trete.dsp20191.aulas1316.persistencia.dml.insert.PersisteFuncionario;
import br.com.trete.dsp20191.aulas1316.persistencia.dml.insert.PersisteLotacao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MainAulas1316 {
    public static void main(String[] args){
        CriaConexao conexao = new CriaConexao();
        try{
            conexao.getConnection("file");
        }catch(InvalidDataBaseTypeException e){
            e.printStackTrace();
        }
        TableCargosCreate criaCargos = new TableCargosCreate();

        try{
            criaCargos.criaTabela();
        }catch(Exception e){
            e.printStackTrace();
        }

        TableDepartamentosCreate criaDepartamentos = new TableDepartamentosCreate();

        try{
            criaDepartamentos.criaTabela();
        }catch(Exception e){
            e.printStackTrace();
        }
        TableFuncionariosCreate criaFuncionarios = new TableFuncionariosCreate();

        try{
            criaDepartamentos.criaTabela();
        }catch(Exception e){
            e.printStackTrace();
        }
        TableLotacoesCreate criaLotacoes = new TableLotacoesCreate();

        try{
            criaLotacoes.criaTabela();
        }catch(Exception e){
            e.printStackTrace();
        }

        PersisteCargo persisteCargo = new PersisteCargo();
        PersisteDepartamento persisteDepartamento = new PersisteDepartamento();
        PersisteFuncionario persisteFuncionario = new PersisteFuncionario();
        PersisteLotacao persisteLotacao = new PersisteLotacao();

        Long idLong = 100000L;
        Long matricula = 2000000L;
        String idString = idLong.toString();
        String nome = "nome_" + idLong.toString();
        Date dataInicial = new Date((long) 20001010);
        Date dataFinal = new Date((long) 20101010);
        double salario = idLong.doubleValue();

        List<Cargo> listaCargo = new ArrayList<>();
        List<Departamento> listaDepartamento = new ArrayList<>();
        List<Funcionario> listaFuncionario = new ArrayList<>();
        List<Lotacao> listaLotacao = new ArrayList<>();

        int i;
        for(i = 0; i <= 2;  i++){
            listaCargo.add(new Cargo(idString, nome, salario));
            try{
                persisteCargo.persisteCargo(listaCargo.get(i));
            }catch(Exception e){
                e.printStackTrace();
            }
            idLong++;
            idString = idLong.toString();
            nome = "nome" + idString;
            salario += salario;
        }

        for(i = 0; i<= 3; i++){
            listaDepartamento.add(new Departamento(idString, nome));
            try{
                persisteDepartamento.persisteDepartamento(listaDepartamento.get(i));
            }catch(Exception e){
                e.printStackTrace();
            }
            idLong++;
            idString = idLong.toString();
            nome = "nome" + idString;
        }

        for(i = 0; i <=9; i++){
            listaFuncionario.add(new Funcionario(idLong, nome, matricula));
            try{
                persisteFuncionario.persisteFuncionario(listaFuncionario.get(i));
            }catch(Exception e){
                e.printStackTrace();
            }
            idLong++;
            matricula++;
            idString = idLong.toString();
            nome = "nome" + idString;
        }

        for(i = 0; i<= 9; i++){
            listaLotacao.add(new Lotacao(idLong, dataInicial, dataFinal, listaCargo.get(i), listaDepartamento.get(i)));
            try{
                persisteLotacao.persisteLotacao(listaLotacao.get(i));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
