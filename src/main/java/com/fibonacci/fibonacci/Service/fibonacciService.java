package com.fibonacci.fibonacci.Service;

import java.util.ArrayList;
import java.time.LocalTime;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.Collections;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class fibonacciService {

    public LocalTime ObtenerHora(){
 
        LocalTime hora= LocalTime.now();
        return hora;
     }

     public List<Integer> CalcularSerie() {
        List<Integer> serieValor = new ArrayList<>(); // Creamos una nueva lista en cada llamada
        LocalTime hora = LocalTime.now();
        int minutos = hora.getMinute();
        int segundo = hora.getSecond();
        int semillaX = minutos / 10;
        int semillaY = minutos % 10;
        serieValor.add(semillaX);
        serieValor.add(semillaY);
  
        for (int i = 2; i < segundo + 2; i++) {
         serieValor.add(serieValor.get(i - 1) + serieValor.get(i - 2));
        }
  
        Collections.sort(serieValor, Collections.reverseOrder());
        return serieValor;
   }
}
