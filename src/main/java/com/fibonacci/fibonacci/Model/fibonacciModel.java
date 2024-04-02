package com.fibonacci.fibonacci.Model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class fibonacciModel {
    private List<Integer> serieValor = new ArrayList<>();
    private LocalTime hora;

    public fibonacciModel(List<Integer> serieValor, LocalTime hora) {
        this.serieValor = serieValor;
        this.hora = hora;
    }

    @JsonProperty("serieValor")
    public List<Integer> getSerieValor() {
        return serieValor;
    }

    
    @JsonProperty("hora")
    public String getHoraAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Convertir formato de hora deseado
        return hora.format(formatter); 
    }

    public void setSerieValor(List<Integer> serieValor) {
        this.serieValor = serieValor;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
