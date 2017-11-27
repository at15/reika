package me.at15.reika.type;

public abstract class Primitive extends Ty {
    abstract public boolean equals(Ty ty);

    public static class Int extends Primitive {
        @Override
        public boolean equals(Ty ty) {
            return ty instanceof Int;
        }

        @Override
        public String toString() {
            return "Int";
        }
    }

    public static class Double extends Primitive {
        @Override
        public boolean equals(Ty ty) {
            return ty instanceof Double;
        }

        @Override
        public String toString() {
            return "Double";
        }
    }

    public static class Bool extends Primitive {
        @Override
        public boolean equals(Ty ty) {
            return ty instanceof Bool;
        }

        @Override
        public String toString() {
            return "Bool";
        }
    }

}
