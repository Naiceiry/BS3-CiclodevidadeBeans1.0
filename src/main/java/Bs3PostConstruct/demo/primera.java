package Bs3PostConstruct.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class primera {
        @PostConstruct
        public void construidoBean(){
            System.out.println("***************  Ya se ha construido el Bean  ***************");
            System.out.println("- - - - - - - -   Hola desde clase Inicial   - - - - - - - - - ");
        }

}
