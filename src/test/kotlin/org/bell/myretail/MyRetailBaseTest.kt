package org.bell.myretail

import org.bell.myretail.model.Price
import org.bell.myretail.model.PricedProduct
import org.bell.myretail.repository.PriceProductRepository
import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
abstract class MyRetailBaseTest(val initializeTestData:Boolean = true){
    @Autowired
    lateinit var priceProductRepository: PriceProductRepository

    @Before
    fun setupTestDatabase(){
        if(initializeTestData){
            priceProductRepository.save(TEST_PRICE_1)
        }
    }

    companion object{
        val TEST_PRICE_1 = PricedProduct("13860428", Price(9.29.toBigDecimal(), "USD"))
    }
}