package org.bell.myretail.service

import com.beust.klaxon.Klaxon
import org.bell.myretail.model.RetailProduct
import org.bell.myretail.model.TargetProduct
import org.bell.myretail.repository.PriceProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

interface ProductService{
    fun productWithPrice(productId: Long) : RetailProduct
}

@Service("productService")
class ProductServiceImpl : ProductService{
    @Autowired
    lateinit var productRepository : PriceProductRepository

    override fun productWithPrice(productId: Long) : RetailProduct{
        //val pricedProduct = productRepository.getProductById(productId)

        val targetProductSource = RestTemplate().getForObject("https://redsky.target.com/v2/pdp/tcin/$productId?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics",String::class.java)
        val targetProduct =  Klaxon().parse<TargetProduct>(targetProductSource!!)
        return RetailProduct(productId, targetProduct?.product?.item?.productDescription?.title?.trim())
    }
}