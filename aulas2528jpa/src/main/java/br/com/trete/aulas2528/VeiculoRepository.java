package br.com.trete.aulas2528;

import java.util.List;

public interface VeiculoRepository {
    Veiculo create(Veiculo veiculo);

    Veiculo read(Long id);

    List<Veiculo> findByBrand(String marca);

    Veiculo update(Veiculo veiculo);

    void delete(Veiculo veiculo);

    void close();
}
