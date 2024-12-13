import java.io.*;

public class Test {
 
    public static void main(String[] args) throws Exception {
        int th = 7;
        int tg = 49;
        newFile(th, tg);
    }
 
 
    public static void newFile(int th, int tg) throws Exception {
        FileWriter nFile = new FileWriter("file1.txt");
 
            for(int i = th; i <= tg; i++) {
 
                    nFile.write(i);
 
                }
 
        nFile.close();
    }
}