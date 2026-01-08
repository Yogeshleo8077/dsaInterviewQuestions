public class StudentAttendanceRecordI {
    public static boolean checkRecord(String str) {
        int absentCount = 0;
        int consecutiveCount = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'A') {
                absentCount++;
                consecutiveCount = 0;
            } else if (ch == 'L') {
                consecutiveCount++;

                if (consecutiveCount == 3) {
                    return false;
                }
            } else {
                consecutiveCount = 0;
            }

            if (absentCount >= 2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "PPALLP";
        System.out.println(checkRecord(str));
    }
}
