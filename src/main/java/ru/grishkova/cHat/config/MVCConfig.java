package ru.grishkova.cHat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MVCConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/styles/**")
                .addResourceLocations("classpath:/static/styles/");
        registry.addResourceHandler("/static/images/**")
                .addResourceLocations("classpath:/static/images/");
        registry.addResourceHandler("/static/js/**")
                .addResourceLocations("classpath:/static/js/");
    }
}
