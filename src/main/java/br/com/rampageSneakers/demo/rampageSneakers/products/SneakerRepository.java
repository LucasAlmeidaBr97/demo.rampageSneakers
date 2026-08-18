package br.com.rampageSneakers.demo.rampageSneakers.products;

import org.springframework.data.jpa.repository.JpaRepository;




public interface SneakerRepository extends JpaRepository<Sneaker, Long> {
    
}
