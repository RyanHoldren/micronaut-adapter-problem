package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static java.nio.charset.StandardCharsets.US_ASCII;
import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class ParserTest {

    private final Parser parser;

    @Inject
    public ParserTest(Parser parser) {
        this.parser = parser;
    }

    @Test
    public void test() {
        assertEquals("applesauce", parser.parse("applesauce".getBytes(US_ASCII)));
    }

}
