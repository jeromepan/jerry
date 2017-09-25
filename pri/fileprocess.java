package pri;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jerry on 9/25/2017.
 */
public class fileprocess {
    public static void main(String [] args) throws Exception{
        File file  = new File("C:\\Users\\lmsj0\\IdeaProjects\\Je\\src\\pri\\periodic.txt");


        List<String> list = new ArrayList<>();
        int t = 0;
        String s = null;
        String a;
        String b;
        String c;
        String d;
        String f;
        String g;

        System.out.println("1.Search by Name\n" +
                "2.Search by Symbol\n" +
                "3.Quit");
        Scanner in = new Scanner(System.in);
        t = in.nextInt();

        while ( t ==1 || t==2) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((s = bufferedReader.readLine()) != null) {
                    list.add(s);
                }

                Scanner input = new Scanner(System.in);
                System.out.print("input the elementname or Symbol: ");
                String h = input.next();
                //System.out.print(list.get(2));
                for (int i = 0; i < list.size(); i++) {
                    String[] data = list.get(i).split(" +");
                    a = data[0];
                    // System.out.print(a);
                    b = data[1];
                    c = data[2];
                    d = data[3];
                    f = data[4];
                    g = data[5];
                    if (h.equals(a) || h.equals(b)) {
                        System.out.println("element name: "+ a + "   symbol: " + b + "  atomic number: " + c + "  period (row #): " + d + "  group (col#):" + f + "  atomic weight " + g);
                    }
                }


                bufferedReader.close();
                fileReader.close();
                bufferedReader.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

            t = 3;
        }
        if(t == 3){
            System.exit(0);
        }
    }
}
