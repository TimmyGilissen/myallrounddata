package users;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import users.domain.User;
import users.domain.UserReference;
import users.repository.UserRepository;

import java.util.Arrays;

@EnableDiscoveryClient
@SpringBootApplication
public class UserApplication {

    public static void main (String[] args){
        SpringApplication.run(UserApplication.class,args);
    }

    @Bean
    CommandLineRunner runner(UserRepository rr) {

        return args -> {
            Arrays.asList("Carmen Phlippo,Inge Morbée,Bert Phlippo,Timmy Gilissen".split(","))
                    .forEach(n -> rr.save(new User(new UserReference("ref-" + n.hashCode()), n)));

            rr.findAll().forEach(System.out::println);
        };
    }
}
