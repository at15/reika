package me.at15.reika.type;

public class Primitive extends Ty {
    public static class Int extends Primitive {
        @Override
        public String toString() {
            return "Int";
        }
    }

    public static class Double extends Primitive {
        @Override
        public String toString() {
            return "Double";
        }
    }

    public static class Bool extends Primitive {
        @Override
        public String toString() {
            return "Bool";
        }
    }

}
