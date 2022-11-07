import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите город: ");
        String city = scanner.nextLine();
        Weather weather = new Weather(city);

        List<WeatherConstructor> weatherTime = weather.getDay();
        for (int i = 0; i < 8; i++) {
            WeatherConstructor summary = weatherTime.get(i);
            System.out.println(summary.getTime());
            System.out.println(summary.getTemp());
            System.out.println();

        }

        List<WeatherConstructor> weatherWeek = weather.getWeek();
        for (int i = 0; i < 8; i++) {
            WeatherConstructor summary = weatherWeek.get(i);
            System.out.println(summary.getDate());
            System.out.println(summary.getDay());
            System.out.println(summary.getTemp());
            System.out.println(summary.getTempH());
            System.out.println(summary.getCl());
            System.out.println();
        }
    }
}
