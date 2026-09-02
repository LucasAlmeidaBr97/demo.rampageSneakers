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

        System.out.println("DTO: " + dto);
        System.out.println("SNEAKER: " + sneaker);
        return toResponseDTO(savedSneaker);
    }

    private SneakerResponseDTO toResponseDTO(Sneaker sneaker) {
        return new SneakerResponseDTO(
                sneaker.getId(),
                sneaker.getProductName(),
                sneaker.getProductDetails(),
                sneaker.getProductPrice(),
                sneaker.isStatus(),
                sneaker.getBrand(),
                sneaker.getAvaliation(),
                sneaker.getGender(),
                sneaker.getSole(),
                sneaker.getMaterial(),
                sneaker.getSuitableFor(),
                sneaker.getType(),
                sneaker.getSneakerClosing(),
                sneaker.getShaftHeight());
    }

}
