package com.movierental.app;

import com.movierental.app.customer.CustomerDTO;
import com.movierental.app.customer.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DBPopulator implements CommandLineRunner {

    DBPopulator(CustomerService customerService) {
    }
    @Override
    public void run(String... args) {
//        CustomerDTO customerDTO = new CustomerDTO("John", "Smith", "jsmith@mail.com", LocalDateTime.now());
//        CustomerDTO customerDTO1 = new CustomerDTO("Josh", "Virginia", "jsmith@mail.com", LocalDateTime.now());
//        customerService.savePerson(customerDTO);
//        customerService.savePerson(customerDTO1);
    }
}
