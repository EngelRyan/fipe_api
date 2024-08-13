package br.com.brasilapi.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.brasilapi.app.Model.Veiculo;
import br.com.brasilapi.app.Service.VeiculoService;

@Controller
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/buscarVeiculo")
    public String buscarVeiculo(@RequestParam ("fipe") String fipe, Model model){

       List<Veiculo> veiculos = veiculoService.buscaVeiculos(fipe);
        model.addAttribute("veiculos", veiculos);
        return "index";
    }    
}
