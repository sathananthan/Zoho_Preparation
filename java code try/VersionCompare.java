public class VersionCompare {

    public static String compareVersion(String v1, String v2) {

        String[] a = v1.split("\\.");
        String[] b = v2.split("\\.");

        int n = Math.max(a.length, b.length);

        for (int i = 0; i < n; i++) {
            int num1 = i < a.length ? Integer.parseInt(a[i]) : 0;
            int num2 = i < b.length ? Integer.parseInt(b[i]) : 0;

            if (num1 < num2) return "Upgraded";
            if (num1 > num2) return "Downgraded";
        }

        return "Same Version";
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("4.8", "4.8.4"));
        System.out.println(compareVersion("4.0.2", "4.8.4"));
        System.out.println(compareVersion("4.8.2", "4.8.2"));
    }
}