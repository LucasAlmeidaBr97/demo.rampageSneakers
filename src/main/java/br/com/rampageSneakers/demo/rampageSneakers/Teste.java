package br.com.rampageSneakers.demo.rampageSneakers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/teste")
public class Teste {

    @GetMapping
    public String testeRetorno(){
        return "Olá, este é o retorno do teste";
    }


}
