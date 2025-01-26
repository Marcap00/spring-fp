package dev.capp.config;

import dev.capp.repository.TrainRepository;
import dev.capp.service.TrainService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean("trainService")
    public TrainService getTrainService() {
        return new TrainService(getTrainRepository());
    }

    @Bean("trainRepository")
    public TrainRepository getTrainRepository() {
        return new TrainRepository();
    }


}
