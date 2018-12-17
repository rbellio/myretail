package org.bell.myretail.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias

@TypeAlias("pricedProduct")
data class PricedProduct(@Id val productId: Long,
                         val price: Int = 0)