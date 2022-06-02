package Bs3PostConstruct.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;


/*Spring @Configuration :Anotación encargada de definir que la clase es una clase de configuración para el framework
Spring @Bean :Anotación que marca como bean cada uno de los métodos de tal forma que esten disponibles para Spring*/
@Configuration
@Order(value= 1) // define el orden de clasificación de un componente o bean anotado.
public class segunda  implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>   Hola desde clase secundaria   <<<<<<<<<<<<<<<<<<<<<");

    }

}
