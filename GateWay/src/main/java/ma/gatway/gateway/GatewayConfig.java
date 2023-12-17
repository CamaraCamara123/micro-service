package ma.gatway.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

        @Bean
        public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
                return builder.routes()
                                .route("r1", r -> r
                                                .path("/clients/**")
                                                .uri("http://localhost:8088/"))
                                .route("r2", r -> r
                                                .path("/client/**")
                                                .uri("http://localhost:8088/"))
                                .build();
        }
}
