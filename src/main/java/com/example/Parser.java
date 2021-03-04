package com.example;

@FunctionalInterface
public interface Parser {
    String parse(byte[] value);
}
