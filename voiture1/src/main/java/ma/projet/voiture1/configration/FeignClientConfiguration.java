package ma.projet.voiture1.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Retryer;

@Configuration
public class FeignClientConfiguration {
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default();
    }
}
