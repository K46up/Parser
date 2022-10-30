import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Document document = Jsoup.connect("https://ru-meteo.ru").get();
            //Elements time = document.select("body > div.content > div.wrap_content > div.last-report > div.current-temp");
            Elements temp = document.select("div.current-temp");
            //(ветер+давление)Elements wind = document.select("body > div.content > div.wrap_content > div.last-report > div.conditions > div.main > ul");
            //Elements tempmorning = document.select("span.ext-cond");
            //Elements tempnight = document.select("span.ext-cond");
            //Elements dayweek = document.select("table#forecast");
            Element table = document.select("table#forecast").first();
            Elements dates = table.select("div.dt");
            String tem = temp.select("div.current-temp").text();
            System.out.println(tem);

            for (Element name : dates) {
                String date = name.select("div.dt").text();
                System.out.println(date + "  Температура Явления Ночью Вертер Давление Влажность");
                //System.out.println(date);
            }

        }
        catch (Exception e){}

    }
}