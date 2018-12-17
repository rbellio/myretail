package org.bell.myretail.controller

import org.junit.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

class ProductControllerTest : ControllerBaseTest() {
    @Test
    fun getRetailProductTest(){
        logger.info("Begin getRetailProductTest")

        val expectedJson = "{\"id\": \"13860428\","  +
                            "\"name\": \"The Big Lebowski (Blu-ray)\"," +
                            "\"current_price\": {" +
                                "\"value\": \"9.29\"," +
                            "\"currency_code\": \"USD\" } }"
        .trimMargin()

        mvc.perform(MockMvcRequestBuilders.get("/product/13860428"))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.content().json(expectedJson))
    }
    companion object {
        val logger: Logger = LoggerFactory.getLogger(ProductControllerTest::class.java)
    }
}