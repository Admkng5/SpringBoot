package ru.javapro;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product.getUserId(), product.getAccountNumber(), product.getBalance(), product.getType());
    }

    @GetMapping("/user/{userId}")
    public List<Product> getProductsByUserId(@PathVariable Long userId) {
        return productService.getProductsByUserId(userId);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }
}
