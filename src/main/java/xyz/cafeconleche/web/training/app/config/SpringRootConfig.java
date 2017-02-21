package xyz.cafeconleche.web.training.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "xyz.cafeconleche.web.training.dev.*" })
public class SpringRootConfig {

}
