public class inheritance {
    public inheritance(String string, int i, String string2, int j) {
    }

    static void ninja() {
        System.out.println(" speed is unlimted");
    }

    public class pulsar extends inheritance {
        private String headlight;
        private int speed;
        private String grade;
        private int ratio;

        public pulsar(String headlight, int speed, String grade, int ratio) {
            this.headlight = headlight;
            this.speed = speed;
            this.grade = grade;
            this.ratio = ratio;
        }

    }

    public static void main(String[] arrgs) {
        inheritance inheritance = new inheritance("red", 200, "a", 5);
        ninja();

    }
}