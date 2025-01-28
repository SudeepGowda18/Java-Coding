public class fieldTrip {
    public static int maxStuds(int n, int[] students_id) {
        int even_count = 0;
        int odd_count = 0;
        for (int id : students_id) {
            if (id % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        return Math.min(even_count, odd_count);
    }

    public static void main(String[] args) {
        int n = 7;
        int[] students_id = { 2, 4, 5, 9, 6, 7, 1 };
        System.out.println(maxStuds(n, students_id));
    }
}
