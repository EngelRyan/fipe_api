package br.com.brasilapi.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.brasilapi.app.Model.Veiculo;

@Service
public class VeiculoService {

    public List<Veiculo> buscaVeiculos(String fipe){
        String url = "https://brasilapi.com.br/api/fipe/preco/v1/"+ fipe;
        RestTemplate restTemplate = new RestTemplate();
        Veiculo[] veiculosArray = restTemplate.getForObject(url, Veiculo[].class);
        return List.of(veiculosArray);

    }
    
}