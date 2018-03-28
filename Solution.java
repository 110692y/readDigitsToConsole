import java.io.*;
import java.util.TreeSet;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(reader.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        int data;

        while (inStream.available() > 0) {
            data = Character.getNumericValue(inStream.read());
            if (data % 2 == 0)
                set.add(data);
        }
        for (int i : set)
            System.out.println(i);
    }
}
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        try {
//            String fileName = reader.readLine();
//            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
//            while (fileReader.ready()){
//                int i = Integer.parseInt(fileReader.readLine());
//                if (i % 2 == 0)
//                    list.add(i);
//            }
//            fileReader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (Integer i : list){
//            System.out.println(i);
//        }
//    }






//        BufferedReader readFileName = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> stringList = new ArrayList<>();
//        ArrayList<Integer> evenList = new ArrayList<>();
//        BufferedReader readFile = new BufferedReader(new InputStreamReader(new FileInputStream(readFileName.readLine())));
//
//        try {
//            String str = "";
//            while (readFile.ready()) {
//                str = readFile.readLine();
//            }
//            String[] parts = str.split(" ");
//            for (String st : parts) {
//                stringList.add(st);
//            }
//            for (String s:stringList)
//                System.out.println(s);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            int temp=0;
//            for (String str:stringList){
//                 temp = Integer.parseInt(str);
//                if (temp%2==0)
//                    evenList.add(temp);}
//            for (Integer i:evenList)
//            System.out.println(i);
//            readFile.close();
//            readFileName.close();
//        }
//    }
//}
