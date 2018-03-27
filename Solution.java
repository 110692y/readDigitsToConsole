import java.io.*;

public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//        String filename = r.readLine();
//
//        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"));
//
//        while (file.ready()) {
//            System.out.println(file.readLine());
//        }
//
//        file.close();
//        r.close();
//    }
//}

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String url = r.readLine();
        InputStream inStream = new FileInputStream(url);

        while (inStream.available() > 0) {

            System.out.print((char)inStream.read());
        }
        System.out.println();

        inStream.close();
        r.close(); //закрываем потоки
    }
}