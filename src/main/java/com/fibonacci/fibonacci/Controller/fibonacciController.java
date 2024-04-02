package com.fibonacci.fibonacci.Controller;

import java.time.LocalTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fibonacci.fibonacci.Service.fibonacciService;
import com.fibonacci.fibonacci.Model.fibonacciModel;

@RestController
@RequestMapping("/fibonacci")

public class fibonacciController {
    @Autowired
    private fibonacciService fs;

    @GetMapping("/serie")
    public fibonacciModel obtenerSerieYHora() {
        List<Integer> serieValor = fs.CalcularSerie();
        LocalTime hora= fs.ObtenerHora();
        return new fibonacciModel(serieValor,hora);
    }
}
