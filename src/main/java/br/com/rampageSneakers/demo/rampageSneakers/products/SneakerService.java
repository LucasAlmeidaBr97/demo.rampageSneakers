package br.com.rampageSneakers.demo.rampageSneakers.products;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SneakerService {
    
    private final SneakerRepository sneakerRepository;

    private final ModelMapper modelMapper;
}
