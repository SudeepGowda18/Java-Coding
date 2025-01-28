public class countChar {
    public static int countChars(String str, int Len, char charFind) {
        if (str.length() != Len) {
            return -1;
        }
        
        int count = 0;
        for(char c : str.toCharArray()){
            if (c ==  charFind){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "sudeep";
        int Len = 6;
        char charFind = 'e';
        int output = countChars(str, Len, charFind);
        System.out.println(output);
    }
}
