package com.example;

import javax.inject.Singleton;

import static java.nio.charset.StandardCharsets.US_ASCII;

@Singleton
public class AsciiParser {
    @Parse
    public String parseAsAscii(byte[] value) {
        return new String(value, US_ASCII);
    }
}