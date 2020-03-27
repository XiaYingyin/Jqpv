package cn.ruc.xyy.jpev.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").
                allowedOrigins("*").
                allowedMethods("GET", "HEAD", "POST","PUT", "DELETE", "OPTIONS").
                allowedHeaders("Content-Type","Access-Control-Allow-Headers","Authorization","X-Requested-With").
                allowCredentials(true);
    }
}