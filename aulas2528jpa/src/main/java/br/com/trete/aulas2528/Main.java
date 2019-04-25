package br.com.trete.aulas2528;

public class Main {
    public static void main(String[] args) {
        VeiculoRepositoryImpl  repository = new VeiculoRepositoryImpl();
        Veiculo veiculo = new Veiculo();
        veiculo.setAnoFabricacao(2019);
        veiculo.setAnoModelo(1969);
        veiculo.setMarca("Tesla");
        veiculo.setModelo("Trator");
        veiculo.setPotenciaMotor(99999);

        Veiculo novoVeiculo = repository.create(veiculo);
        System.out.println(novoVeiculo);

        repository.close();
    }
}
