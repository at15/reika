package me.at15.reika.compiler.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class SourceFile {
    abstract public InputStream getStream();

    public static class LocalFile extends SourceFile {
        private String path;
        private URL url;
        private InputStream stream;

        public LocalFile(URL url, String path, InputStream stream) {
            this.url = url;
            this.path = path;
            this.stream = stream;
        }

        @Override
        public InputStream getStream() {
            return this.stream;
        }
    }

    public static class SingleLine extends SourceFile {
        private String line;

        public SingleLine(String line) {
            this.line = line;
        }

        @Override
        public InputStream getStream() {
            return new ByteArrayInputStream(line.getBytes());
        }
    }

    public static LocalFile fromFile(String path) throws FileNotFoundException {
        Path file = Paths.get(path);
        try {
            InputStream stream = Files.newInputStream(file);
            // https://stackoverflow.com/questions/6098472/pass-a-local-file-in-to-url-in-java
            return new LocalFile(file.toUri().toURL(), path, stream);
        } catch (IOException ex) {
            throw new FileNotFoundException("file: " + path);
        }
    }

    public static LocalFile fromResource(String path) throws FileNotFoundException {
        ClassLoader classLoader = SourceFile.class.getClassLoader();
        URL url = classLoader.getResource(path);
        if (url == null) {
            throw new FileNotFoundException("resource:" + path);
        }
        try {
            InputStream stream = url.openStream();
            return new LocalFile(url, path, stream);
        } catch (IOException ex) {
            throw new FileNotFoundException("resource:" + path, ex);
        }
    }
}
