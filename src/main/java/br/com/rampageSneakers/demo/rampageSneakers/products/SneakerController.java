package br.com.rampageSneakers.demo.rampageSneakers.products;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(name = "/sneakers")
@RequiredArgsConstructor
public class SneakerController {

    private final SneakerService sneakerService;

    @PostMapping("/")
    public void register(@RequestBody SneakerCreateRequestDTO sneakerDTO) {
        sneakerService.createSneaker(sneakerDTO);
    }
}
