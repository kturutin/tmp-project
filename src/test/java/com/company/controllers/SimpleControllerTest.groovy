package com.company.controllers

import com.company.annotations.TestContextConfiguration
import com.company.dao.FirstDao
import com.company.dao.SecondDao
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@TestContextConfiguration
class SimpleControllerTest extends Specification {

    @Autowired
    FirstDao firstDao
    SimpleController healthController
    SecondDao secondDao = Mock(SecondDao)

    def setup() {
         healthController = new SimpleController(firstDao, secondDao)
    }

    def "dummy test"() {
        given:
        def expectedResult = "TestField"
        secondDao.testField >> expectedResult

        when:
        def result = healthController.simpleEndpoint()

        then:
        result == expectedResult
    }
}
