package com.viva.config;

//import com.viva.authentication.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.AbstractClientHttpRequestFactoryWrapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configure {



    @Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public JwtAuthenticationFilter authenticationTokenFilterBean() throws Exception{
//        return new JwtAuthenticationFilter();
//    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
