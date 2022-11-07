

public class WeatherConstructor {
    private String date;
    private String day;
    private String temp;
    private String tempH;
    private String time;
    private String cl;//осадки




    public WeatherConstructor(String date, String day, String temp, String tempH, String cl){
        this.date = date;
        this.day = day;
        this.temp = temp;
        this.tempH = tempH;
        this.cl = cl;
    }

    public WeatherConstructor(String time, String temp){
        this.time = time;
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public String getTemp() {
        return temp;
    }

    public String getTempH() {
        return tempH;
    }

    public String getCl() {
        return cl;
    }

    public String getTime() {
        return time;
    }

}
