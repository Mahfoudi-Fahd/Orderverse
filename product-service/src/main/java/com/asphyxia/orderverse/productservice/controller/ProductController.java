package com.asphyxia.orderverse.productservice.controller;

import com.asphyxia.orderverse.productservice.domain.entities.Product;
import com.asphyxia.orderverse.productservice.dto.productDTO.ProductCreationRequestDto;
import com.asphyxia.orderverse.productservice.dto.productDTO.ProductResponseDto;
import com.asphyxia.orderverse.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDto> getAll() {
        return ProductResponseDto.fromProducts(productService.getAll());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductResponseDto getById(@PathVariable Long id) {
        return ProductResponseDto.fromProduct(productService.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody ProductCreationRequestDto productDto) {
        productService.save(productDto.toProduct());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
