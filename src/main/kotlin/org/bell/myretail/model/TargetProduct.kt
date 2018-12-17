package org.bell.myretail.model

import com.beust.klaxon.Json
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties(ignoreUnknown = true)
data class TargetProduct(
        val product: Product)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Product(val item: Item)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Item(
        @Json(name="tcin")
        val productId : String,
        @Json(name="product_description")
        val productDescription : ProductDescription)

@JsonIgnoreProperties(ignoreUnknown = true)
data class ProductDescription(val title : String)

