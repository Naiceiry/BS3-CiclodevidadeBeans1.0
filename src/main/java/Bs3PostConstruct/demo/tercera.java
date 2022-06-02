package Bs3PostConstruct.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.annotation.PreDestroy;
//https://webcache.googleusercontent.com/search?q=cache:pEbG1jSMINwJ:https://programmerclick.com/article/6483110418/+&cd=2&hl=es&ct=clnk&gl=es
@SpringBootApplication
public class tercera implements CommandLineRunner {

    public void print(){
        System.out.println(":> :> :> :> :> :> :> * Soy la tercera clase * <: <: <: <: <: <: <: ");
    }


    // Se llama a este método después de inicializar el entorno Spring
    @Override
    public void run(String... args) throws Exception {
        for (String argValue : args) {	// Recorrer los valores en la lista de parámetros

            System.out.println("El valor del parámetro es:" + argValue);
        }
        this.print();
    }

    @PreDestroy
    public void Antesdedestrui1(){
        System.out.println("---------------> Bean se destruira en 5..4..3..2..1 <-------------------------");
    }
}
