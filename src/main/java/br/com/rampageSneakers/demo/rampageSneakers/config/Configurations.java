package br.com.rampageSneakers.demo.rampageSneakers.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {
 
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.registerModule(new org.modelmapper.record.RecordModule());
        return modelMapper;
    }
}
