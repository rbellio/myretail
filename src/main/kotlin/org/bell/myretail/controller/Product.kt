package org.bell.myretail.controller

import com.beust.klaxon.Klaxon
import org.bell.myretail.model.RetailProduct
import org.bell.myretail.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController{
    @Autowired
    lateinit var productService: ProductService

    @GetMapping("product/{id}")
    fun getProduct(@PathVariable id: String) : RetailProduct = productService.productWithPrice(id)
}