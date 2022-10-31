import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Document document = Jsoup.connect("https://yandex.ru/pogoda").get();
            Element now = document.select("div.fact").first();
            String tim = now.select("time.time").text();
            String tem = now.select("div.fact__temp_size_s").text();
            String wind = now.select("div.fact__wind-speed > div.term__value").text();
            String vl = now.select("div.fact__humidity > div.term__value").text();
            String pres = now.select("div.fact__pressure > div.term__value").text();
            System.out.println(tim);
            System.out.println(tem);
            System.out.println(wind);
            System.out.println(vl);
            System.out.println(pres);

            Elements day = document.select("div.swiper-container");

            for (Element name : day) {
                String daes = name.select("div.fact__hour-label").text(); //день неделт
                String temp = name.select("div.fact__hour-temp").text(); //день недели
                System.out.println(daes);
                System.out.println(temp);
            }
////////////////////////////////////////////////////////////////////
            Elements date = document.select("a.forecast-briefly__day-link"); //time.forecast-briefly__date
            Elements tenpen = document.select("div.forecast-briefly__days");

            for (Element name : date) {
                String dates = name.select("time.forecast-briefly__date").text(); //день неделт
                String days = name.select("div.forecast-briefly__name").text(); //день неделт
                System.out.println(dates + " " +  days);
            }
            for (Element name : tenpen) {
                String tmp = name.select("div.forecast-briefly__temp_day").text(); //темпа днем
                System.out.println(tmp);
            }
            for (Element name : tenpen) {
                String tmph = name.select("div.forecast-briefly__temp_night").text(); //темпа ночью
                System.out.println(tmph);
            }

        }
        catch (Exception e){}

    }
}