public class CategorizeBoxAccordingtoCriteria {
    public static String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = false;
        long volume = (long) length * height * width;

        if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000) {
            isBulky = true;
        }

        boolean isHeavy = mass >= 100;

        if (isBulky && isHeavy) {
            return "Both";
        } else if (isBulky) {
            return "Bulky";
        } else if (isHeavy) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }

    public static void main(String[] args) {
        int length = 1000;
        int width = 35;
        int height = 700;
        int mass = 300;

        System.out.println(categorizeBox(length, width, height, mass));
    }
}
