package com.company.controllers

import com.company.annotations.TestContextConfiguration
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@TestContextConfiguration
class SimpleControllerTest extends Specification {

    @Autowired
    SimpleController healthController

    def "dummy test"() {
        when:
        def result = healthController.simpleEndpoint()
        then:
        result
    }
}
