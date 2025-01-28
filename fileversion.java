import java.util.*;
public class fileversion {
    public static int maxFileVersion(String[] s , int n) {
        int maxVersion = -1;
        for(int i = 0;i<n;i++){
            String filename = s[i];
                if(filename.startsWith("File_")){
                    try{
                        int version = Integer.parseInt(filename.substring(5));
                    if(version > 0){
                        maxVersion = Math.max(maxVersion, version);
                    }
                    }catch(NumberFormatException e){
                    }
            }
        }
        return maxVersion;
    }

    public static void main(String[] args) {
        String[] files = {"File_5", "File_3", "File_2","File_1"};
        int n = files.length;
        System.out.println(maxFileVersion(files, n));
    }
}
