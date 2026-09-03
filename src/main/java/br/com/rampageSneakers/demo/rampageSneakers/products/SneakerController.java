package br.com.rampageSneakers.demo.rampageSneakers.products;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sneakers")
@RequiredArgsConstructor
public class SneakerController {

    private final SneakerService sneakerService;

    @PostMapping
    public void register(@RequestBody SneakerCreateRequestDTO sneakerDTO) {
        System.out.println("NOVO PRODUTO CADASTRADO: " + sneakerService.createSneaker(sneakerDTO));
        System.out.println("====================================================================");
    }
}
