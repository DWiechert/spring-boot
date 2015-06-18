package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
    	final SpringApplication app = new SpringApplication(DemoApplication.class);
    	app.setBanner(new KTBanner());
    	app.run(args);
//        SpringApplication.run(DemoApplication.class, args);
    }
}
