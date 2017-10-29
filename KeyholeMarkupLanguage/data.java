package KeyholeMarkupLanguage;
//jian pan 5728309
public class data {
    private  String longtitude;
    private String latitude;

    public data(){
        longtitude = "";
        latitude = "";

    }

    public data(String longtitude, String latitude){
        this.longtitude = longtitude;
        this.latitude = latitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }


}
