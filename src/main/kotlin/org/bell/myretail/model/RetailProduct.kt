package org.bell.myretail.model

data class RetailProduct(val productId: String,
                         val name: String?,
                         val price: Int = 0)