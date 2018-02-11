package me.at15.reika;

import com.google.common.io.CharStreams;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public interface TestBase {
    default String readResourceText(String path) throws IOException {
        ClassLoader classLoader = TestBase.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(path);
        return CharStreams.toString(new InputStreamReader(is, StandardCharsets.UTF_8));
    }

    default InputStream readResourceStream(String path) throws IOException {
        ClassLoader classLoader = TestBase.class.getClassLoader();
        return classLoader.getResourceAsStream(path);
    }
}
