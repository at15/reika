package me.at15.reika.compiler.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class SourceFile {
    abstract public InputStream getStream();

    public static class ResourceFile extends SourceFile {
        private String path;
        private InputStream stream;

        public ResourceFile(String path, InputStream stream) {
            this.path = path;
            this.stream = stream;
        }

        public InputStream getStream() {
            return this.stream;
        }
    }

    // TODO: DiskFile class is exactly same as resource file
    public static class DiskFile extends SourceFile {
        private String path;
        private InputStream stream;

        public DiskFile(String path, InputStream stream) {
            this.path = path;
            this.stream = stream;
        }

        public InputStream getStream() {
            return this.stream;
        }

//        public static class
    }

//    public static

    public static DiskFile fromFile(String path) throws FileNotFoundException {
        Path file = Paths.get(path);
        try {
            InputStream stream = Files.newInputStream(file);
            return new DiskFile(path, stream);
        } catch (IOException ex) {
            throw new FileNotFoundException("file: " + path);
        }
    }

    public static ResourceFile fromResource(String path) throws FileNotFoundException {
        ClassLoader classLoader = SourceFile.class.getClassLoader();
        InputStream stream = classLoader.getResourceAsStream(path);
        if (stream == null) {
            throw new FileNotFoundException("resource:" + path);
        }
        return new ResourceFile(path, stream);
    }
}
