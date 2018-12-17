package org.bell.myretail.model

data class RetailProduct(val id: String,
                         val name: String?,
                         val current_price: Current_Price)

data class Current_Price(val value: String, val currency_code: String)
