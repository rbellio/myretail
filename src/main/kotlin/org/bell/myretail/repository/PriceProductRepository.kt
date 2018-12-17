package org.bell.myretail.repository

import org.bell.myretail.model.PricedProduct
import org.springframework.data.repository.CrudRepository

interface PriceProductRepository : CrudRepository<PricedProduct, String>