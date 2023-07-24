package com.spring.hplus.controllers;

import com.spring.hplus.beans.Product;
import com.spring.hplus.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model){

        System.out.println("Search controller...");
        System.out.println("Search term: "+ search);

        List<Product> products= new ArrayList<>();
        products = productRepository.serachByName(search);
        model.addAttribute("products",products);

        return "search";
    }
}
