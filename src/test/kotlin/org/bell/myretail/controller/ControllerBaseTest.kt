package org.bell.myretail.controller

import org.bell.myretail.MyRetailBaseTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.test.web.client.MockMvcClientHttpRequestFactory
import org.springframework.test.web.servlet.MockMvc

@AutoConfigureMockMvc
abstract class ControllerBaseTest(initializeTestData:Boolean=true) : MyRetailBaseTest(initializeTestData){
    @Autowired
    lateinit var mvc: MockMvc
}