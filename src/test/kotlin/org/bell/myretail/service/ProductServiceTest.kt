package org.bell.myretail.service

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNull
import org.bell.myretail.MyRetailBaseTest
import org.junit.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import java.util.concurrent.TimeoutException

class ProductServiceTest : MyRetailBaseTest() {
    @Autowired
    lateinit var productService : ProductService

    @Test
    fun getTargetProduct(){
        logger.info("Begin GetTargetProductTest")

        val expectedProductName = "The Big Lebowski (Blu-ray)"
        val product = productService.productWithPrice(TEST_PRODUCTS[0])

        //assertEquals("Product IDs should match", TEST_PRODUCTS[0], product.productId)
        assertEquals("Product Names should match", expectedProductName, product.name)

        logger.info("End GetTargetProductTest")
    }

//    @Test
//    fun `product id with empty body`(){
//        logger.info("Begin empty body")
//
//        val product = productService.productWithPrice(TEST_PRODUCTS[1])
//
//        assertNull(product.name)
//
//        logger.info("end empty body")
//    }

    companion object {
        val logger: Logger = LoggerFactory.getLogger(ProductServiceTest::class.java)
        val TEST_PRODUCTS : LongArray = longArrayOf(13860428)//
        // , 15117729, 16483589, 16696652, 16752456, 15643793)
    }
}