package com.github.uniqueck;


import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
class TestContainersTest {

    @Container
    private GenericContainer<?> container = new GenericContainer<>("arvindr226/alpine-ssh");

    @Test
    void test() {
        assertTrue(container.isRunning());

    }

}
