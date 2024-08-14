package br.com.brasilapi.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.brasilapi.app.Model.VeiculoFipe;
import br.com.brasilapi.app.Model.VeiculoType;
import br.com.brasilapi.app.Service.VeiculoService;

@Controller
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/searchByFipe")
    public String searchByFipe(){
        return "searchFipe";
    }

    @PostMapping("/tabelaFipe")
    public String searchByFipe(@RequestParam ("fipe") String fipe, Model model){
       List<VeiculoFipe> veiculosFipe = veiculoService.searchVehiclesbyFipe(fipe);
        model.addAttribute("veiculosFipe", veiculosFipe);
        return "searchFipe";
    }

    @GetMapping("/searchByType")
    public String searchByType(){
        return "searchType";
    }
    @PostMapping("/tabelaTipos")
    public String searchByType(@RequestParam ("type") String type, Model model){
       List<VeiculoType> veiculosType = veiculoService.searchVehiclesbyType(type);
        model.addAttribute("veiculosType", veiculosType);
        return "searchType";
    }
}
