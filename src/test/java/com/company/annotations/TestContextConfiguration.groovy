package com.company.annotations

import com.company.config.AppConfiguration
import com.company.config.RestConfiguration
import com.company.config.TestAppConfiguration;
import groovy.transform.AnnotationCollector;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(loader = AnnotationConfigWebContextLoader, classes = [TestAppConfiguration, RestConfiguration, AppConfiguration])
@WebAppConfiguration
@AnnotationCollector
public @interface TestContextConfiguration {
}
