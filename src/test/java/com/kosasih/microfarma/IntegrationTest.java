package com.kosasih.microfarma;

import com.kosasih.microfarma.MicrofarmaApp;
import com.kosasih.microfarma.config.AsyncSyncConfiguration;
import com.kosasih.microfarma.config.EmbeddedElasticsearch;
import com.kosasih.microfarma.config.EmbeddedKafka;
import com.kosasih.microfarma.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { MicrofarmaApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
