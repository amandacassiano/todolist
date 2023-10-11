package br.com.amandacassiano.todolist.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller é um componenete que utilizamos para ser a camada entre a requisição e as demais camadas. Ex: Quem irá receber a requisição dos users é a Controller. 
//Controller = Estrutura de páginas
//RestController = Estrutura de API Rest, retorna uma api

@RestController
@RequestMapping("/firstRoute")
public class MyFirstController {
    @GetMapping("/")

    public String firstMessage(){
        return "Primeira mensagem";
    }

    
}
