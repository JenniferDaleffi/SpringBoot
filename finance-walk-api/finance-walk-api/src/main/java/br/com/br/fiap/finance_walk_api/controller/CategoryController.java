package br.com.br.fiap.finance_walk_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.br.fiap.finance_walk_api.model.Category;

@RestController
public class CategoryController {

    private list <Category> repository = new ArrayList<>();

    // Listar todas as categorias
    // GET :8080/categories
    @GetMapping("/categories")
    public List<Category> index() {
        return List.of(
                new Category(1L, "Educação", "book"),
                new Category(2L, "Lazer", "casino"),
                new Category(3L, "Salário", "payments"));
    }

    // Cadastrar categoria
    @PostMapping("/categories")
    public void create(@RequestBody Category category){

        repository.add(category);
        System.out.println("Cadastrando categoria" + category.getName());

    }

    // Apagar uma categoria

}