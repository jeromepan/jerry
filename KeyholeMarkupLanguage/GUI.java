package KeyholeMarkupLanguage;
//jian pan 5728309
import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GUI {
    public static void main(String []args) throws FileNotFoundException {

        JButton open = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("*.kml"));
        fc.setDialogTitle("Choose your location longitude and latitude file: ");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        if(fc.showOpenDialog(open) == JFileChooser.FILES_AND_DIRECTORIES){

        }
        System.out.println("You choose: "+ fc.getSelectedFile().getAbsolutePath());

        String inputLoction ="";
        inputLoction = fc.getSelectedFile().getAbsolutePath();
        System.out.println(inputLoction);

        File file = new File(inputLoction);
        Scanner input = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();

        Note note = new Note();
        while (input.hasNextLine()){
            list.add(input.nextLine());
        }
        //System.out.println(list);
        String s = "";
        String location = "";
        for(int i = 0; i<list.size(); i++){
          s = note.getReplace1() + Integer.toString(i+1);
          String [] arr = list.get(i).split(" ");
          s = s + note.getReplace2()+ arr[0] +","+ arr[1];
          s = s + note.getReplace3();
          location = location + s;
       }

        location = note.getFileHead() + location + note.getFileT();
        //System.out.println(location);


        JButton open1 = new JButton();
        JFileChooser fc1 = new JFileChooser();
        fc1.setCurrentDirectory(new java.io.File("*.kml"));
        fc1.setDialogTitle("Find your Google-KML file:");
        fc1.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        if(fc1.showOpenDialog(open1) == JFileChooser.FILES_AND_DIRECTORIES){

        }
        System.out.println("You choose: "+ fc1.getSelectedFile().getAbsolutePath());

        File file1 = new File(fc1.getSelectedFile().getAbsolutePath());

        PrintWriter output = new PrintWriter(file1);
        output.print(location);
        output.close();
    }
}
