public class reversesb {
    public static void main(String[] args) {
        String str = "Sudeep gowda";
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed String : " + reversed);
    }
}