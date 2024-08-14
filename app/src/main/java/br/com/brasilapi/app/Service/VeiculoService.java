package br.com.brasilapi.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.brasilapi.app.Model.VeiculoFipe;
import br.com.brasilapi.app.Model.VeiculoType;

@Service
public class VeiculoService {


    public List<VeiculoFipe> searchVehiclesbyFipe(String fipe){
        String url = "https://brasilapi.com.br/api/fipe/preco/v1/"+ fipe;
        RestTemplate restTemplate = new RestTemplate();
        VeiculoFipe[] veiculosArray = restTemplate.getForObject(url, VeiculoFipe[].class);
        return List.of(veiculosArray);
    }
    public List<VeiculoType> searchVehiclesbyType(String type){
        String url = "https://brasilapi.com.br/api/fipe/marcas/v1/"+ type;
        RestTemplate restTemplate = new RestTemplate();
        VeiculoType[] veiculosArray = restTemplate.getForObject(url, VeiculoType[].class);
        return List.of(veiculosArray);
    }
}