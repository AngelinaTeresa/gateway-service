package com.shopping.gateway.config;

import com.shopping.gateway.util.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Autowired
    private JwtAuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user", r -> r.path("/user/**").filters(f -> f.filter(filter)).uri("lb://user"))
                .route("cart", r -> r.path("/cart/**").filters(f -> f.filter(filter)).uri("lb://cart"))
                .route("product", r -> r.path("/products/**").filters(f -> f.filter(filter)).uri("lb://product"))
                .route("review", r -> r.path("/review/**").filters(f -> f.filter(filter)).uri("lb://review")).build();
    }

}
