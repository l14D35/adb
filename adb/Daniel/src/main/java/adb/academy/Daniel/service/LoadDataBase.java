package adb.academy.Daniel.service;


import adb.academy.Daniel.api.PersonRepository;
import adb.academy.Daniel.model.PersonEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Configuration
@Slf4j
public class LoadDataBase {
    private DateFormat df = new SimpleDateFormat("MM-dd-yyyy");

    @JsonFormat(pattern = "yyyy-MM-dd")

    @Bean
    CommandLineRunner initDatabase(PersonRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new PersonEntity("Mark", "Zuckerberg", df.parse("10-10-2000"), 43)));
            log.info("Preloading " + repository.save(new PersonEntity("Kram", "Zuckerberg", df.parse("2-3-1994"), 3)));
        };
    }
}
