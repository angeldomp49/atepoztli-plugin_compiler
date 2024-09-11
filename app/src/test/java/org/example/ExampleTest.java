package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExampleTest {

    @Test
    public void test() throws IOException {
        var dirPath = ExampleTest.class.getClassLoader().getResource("build").getPath();

        Files.walk(Paths.get(dirPath)).filter(subPath -> !Files.isDirectory(subPath)).forEach(System.out::println);
    }

}
