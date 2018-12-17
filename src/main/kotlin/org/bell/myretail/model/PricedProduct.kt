package org.bell.myretail.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias
import java.math.BigDecimal

@TypeAlias("pricedProduct")
data class PricedProduct(@Id val id: String,
                         val current_price: Price)

data class Price(val value: BigDecimal = 0.toBigDecimal(), val currency_code : String = "" )