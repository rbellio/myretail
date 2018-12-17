package org.bell.myretail.model

data class RetailProduct(val productId: Long,
                         val name: String?,
                         val price: Int = 0)