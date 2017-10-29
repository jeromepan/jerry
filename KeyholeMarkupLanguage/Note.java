package KeyholeMarkupLanguage;
//jian pan 5728309
import java.util.ArrayList;

public class Note {
    private String fileHead;
    private String fileT;
    private String replace1;
    private String replace2;
    private String replace3;
    private ArrayList<data> list;

    Note(){


        fileHead = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "\n" +
                "<kml xmlns=\"http://earth.google.com/kml/2.1\">\n" +
                "\n" +
                "<Document>\n" +
                "\n" +
                "\t<name>Mystery Locations</name>\n" ;

        fileT = "\n" +
                "</Document>\n" +
                "\n" +
                "</kml>";

        replace1="\t<Placemark>\n" +
                "\n" +
                "\t\t<name>Location ";
        replace2="</name>\n" +
                "\n" +
                "\t\t<Point>\n" +
                "\n" +
                "\t\t\t<coordinates>" ;
        replace3="0</coordinates>\n" +
                "\n" +
                "\t\t</Point>\n" +
                "\n" +
                "\t</Placemark>\n" +
                "\n" ;
    }


    public void setFileHead(String fileHead) {
        this.fileHead = fileHead;
    }



    public String getFileHead() {
        return fileHead;
    }

    public String getReplace1() {
        return replace1;
    }

    public String getReplace2() {
        return replace2;
    }

    public String getReplace3() {
        return replace3;
    }

    public void setReplace1(String replace1) {
        this.replace1 = replace1;
    }

    public void setReplace2(String replace2) {
        this.replace2 = replace2;
    }

    public void setReplace3(String replace3) {
        this.replace3 = replace3;
    }

    public String getFileT() {
        return fileT;
    }

    public void setFileT(String fileT) {
        this.fileT = fileT;
    }

    public void setList(ArrayList<data> list) {
        this.list = list;
    }

    public ArrayList<data> getList() {
        return list;
    }



}
