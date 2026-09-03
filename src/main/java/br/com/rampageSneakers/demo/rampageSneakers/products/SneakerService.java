package br.com.rampageSneakers.demo.rampageSneakers.products;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SneakerService {

    private final SneakerRepository sneakerRepository;

    private final ModelMapper modelMapper;

    public SneakerResponseDTO createSneaker(SneakerCreateRequestDTO dto) {
        Sneaker sneaker = modelMapper.map(dto, Sneaker.class);
        Sneaker savedSneaker = sneakerRepository.save(sneaker);
        return toResponseDTO(savedSneaker);
    }


    private SneakerResponseDTO toResponseDTO(Sneaker sneaker) {
        return new SneakerResponseDTO(
                sneaker.getId(),
                sneaker.getProductName(),
                sneaker.getProductPrice(),
                sneaker.getBrand(),
                sneaker.getGender(),
                sneaker.getType(),
                sneaker.getShaftHeight());
    }

}
