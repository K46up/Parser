import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;

public class Weather {

    private String url;
    private Document document;

    public Weather(String city){
        this.url = "https://yandex.ru/pogoda/" + city;
        try{
            this.document = Jsoup.connect(url).get();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(getTime());
        System.out.println(getTemp());
        System.out.println(getWind());
        System.out.println(getVl());
        System.out.println(getPress());

    }
    public String getTemp(){
        try{
            Element element = this.document.select("div.fact").first();

            String result = element.select("div.fact__temp_size_s").text();

            return result;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    public String getTime(){
        try{
            Element element = this.document.select("div.fact").first();

            String result = element.select("time.time").text();

            return result;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    public String getWind(){
        try{
            Element element = this.document.select("div.fact").first();

            String result = element.select("div.fact__wind-speed > div.term__value").text();

            return result;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    public String getVl(){
        try{
            Element element = this.document.select("div.fact").first();

            String result = element.select("div.fact__humidity > div.term__value").text();

            return result;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    public String getPress(){
        try{
            Element element = this.document.select("div.fact").first();

            String result = element.select("div.fact__pressure > div.term__value").text();

            return result;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    /**По часовая**/
    public List getDay(){
        List<WeatherConstructor> weatherDay = new LinkedList<>();
        try{
            Element element = this.document.select("div.swiper-container").first();
            Elements time = element.select("div.fact__hour-label");
            Elements temp = element.select("div.fact__hour-temp");

            for (int i = 0; i < time.size(); i++) {
                weatherDay.add(new WeatherConstructor(time.get(i).text(), temp.get(i).ownText()));
            }

            return weatherDay;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return weatherDay;
    }
    /**На неделю**/
    public List getWeek(){
        List<WeatherConstructor> weatherWeek = new LinkedList<WeatherConstructor>();
        try {
            Elements weatherBlock = document.select("a.forecast-briefly__day-link");

            Elements day = weatherBlock.select("div.forecast-briefly__name");
            Elements date = weatherBlock.select("time.forecast-briefly__date");
            Elements temp = weatherBlock.select("div.forecast-briefly__temp_day");
            Elements tempH = weatherBlock.select("div.forecast-briefly__temp_night");
            Elements cl = weatherBlock.select("div.forecast-briefly__condition");


            for (int i = 0; i < date.size(); i++) {
                weatherWeek.add(new WeatherConstructor(date.get(i).text(), day.get(i).text(), temp.get(i).text(), tempH.get(i).text(), cl.get(i).text()));
            }

            return weatherWeek;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weatherWeek;
    }
}
