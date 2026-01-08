public class LicenseKeyFormatting {
    public static String licenseKeyFormetting(String str, int k) {
        String cleaned = str.replace("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            sb.append(cleaned.charAt(i));
            count++;

            if (count == k && i != 0) {
                sb.append("-");
                count = 0;
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "2-5g-3-J";
        int k = 2;

        System.out.println(licenseKeyFormetting(str, k));
    }
}
