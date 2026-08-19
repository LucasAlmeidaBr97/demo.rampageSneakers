package br.com.rampageSneakers.demo.rampageSneakers.products;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SneakerService {

    private final SneakerRepository sneakerRepository;

    private final ModelMapper modelMapper;

    public SneakerCreateRequestDTO createSneaker(SneakerCreateRequestDTO dto) {
        Sneaker sneaker = modelMapper.map(dto, Sneaker.class);
        sneakerRepository.save(sneaker);
        return modelMapper.map(sneaker,SneakerCreateRequestDTO.class);
    }

}
