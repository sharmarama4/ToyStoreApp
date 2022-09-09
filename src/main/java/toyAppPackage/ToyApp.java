package toy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
public class ToyApp {
    public static void main(String[] args) {
        SpringApplication.run(ToyApp.class,args) ;
    }
}
