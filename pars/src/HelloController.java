import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField id_Search;

    @FXML
    private Button id_buttonFind;

    @FXML
    private Label id_city;

    @FXML
    private Label id_currentDegree;

    @FXML
    private Label id_date1;

    @FXML
    private Label id_date2;

    @FXML
    private Label id_date3;

    @FXML
    private Label id_date4;

    @FXML
    private Label id_date5;

    @FXML
    private Label id_date6;

    @FXML
    private Label id_date7;

    @FXML
    private Label id_date8;

    @FXML
    private ImageView id_dayImage1;

    @FXML
    private ImageView id_dayImage2;

    @FXML
    private ImageView id_dayImage3;

    @FXML
    private ImageView id_dayImage4;

    @FXML
    private ImageView id_dayImage5;

    @FXML
    private ImageView id_dayImage6;

    @FXML
    private ImageView id_dayImage7;

    @FXML
    private ImageView id_dayImage8;

    @FXML
    private Label id_dayWeek1;

    @FXML
    private Label id_dayWeek2;

    @FXML
    private Label id_dayWeek3;

    @FXML
    private Label id_dayWeek4;

    @FXML
    private Label id_dayWeek5;

    @FXML
    private Label id_dayWeek6;

    @FXML
    private Label id_dayWeek7;

    @FXML
    private Label id_dayWeek8;

    @FXML
    private Label id_degreesEvening1;

    @FXML
    private Label id_degreesEvening2;

    @FXML
    private Label id_degreesEvening3;

    @FXML
    private Label id_degreesEvening4;

    @FXML
    private Label id_degreesEvening5;

    @FXML
    private Label id_degreesEvening6;

    @FXML
    private Label id_degreesEvening7;

    @FXML
    private Label id_degreesEvening8;

    @FXML
    private Label id_degreesMorning1;

    @FXML
    private Label id_degreesMorning2;

    @FXML
    private Label id_degreesMorning3;

    @FXML
    private Label id_degreesMorning4;

    @FXML
    private Label id_degreesMorning5;

    @FXML
    private Label id_degreesMorning6;

    @FXML
    private Label id_degreesMorning7;

    @FXML
    private Label id_degreesMorning8;

    @FXML
    private Label id_eighteen;

    @FXML
    private ImageView id_eighteenImage;

    @FXML
    private Label id_fifteen;

    @FXML
    private ImageView id_fifteenImage;

    @FXML
    private Label id_humidity;

    @FXML
    private Label id_nine;

    @FXML
    private ImageView id_nineImage;

    @FXML
    private Label id_pressure;

    @FXML
    private Label id_six;

    @FXML
    private ImageView id_sixImage;

    @FXML
    private Label id_three;

    @FXML
    private ImageView id_threeImage;

    @FXML
    private Label id_time;

    @FXML
    private Label id_time1;

    @FXML
    private Label id_time2;

    @FXML
    private Label id_time3;

    @FXML
    private Label id_time4;

    @FXML
    private Label id_time5;

    @FXML
    private Label id_time6;

    @FXML
    private Label id_time7;

    @FXML
    private Label id_time8;

    @FXML
    private Label id_twelve;

    @FXML
    private ImageView id_twelveImage;

    @FXML
    private Label id_twentyOne;

    @FXML
    private ImageView id_twentyOneImage;

    @FXML
    private Label id_weater1;

    @FXML
    private Label id_weater2;

    @FXML
    private Label id_weater3;

    @FXML
    private Label id_weater4;

    @FXML
    private Label id_weater5;

    @FXML
    private Label id_weater6;

    @FXML
    private Label id_weater7;

    @FXML
    private Label id_weater8;

    @FXML
    private Label id_wind;

    @FXML
    private Label id_zero;

    @FXML
    private ImageView id_zeroImage;

    @FXML
    void initialize() {
        id_buttonFind.setOnAction(actionEvent -> { //getTime()
            String city = id_Search.getText().trim();
            Weather weather = new Weather(city);
            id_time.setText(weather.getTime());
            id_wind.setText(weather.getWind());
            id_humidity.setText(weather.getVl());
            id_pressure.setText(weather.getPress());
            id_currentDegree.setText(weather.getTemp());

            //по часовая getDay
            ////////////////////////////////////////////////////////////////////////////////////////////////////
            List<WeatherConstructor> weatherTime = weather.getDay();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherTime.get(0);
                id_time1.setText(summary.getTime());
                id_zero.setText(summary.getTemp());
            }

            List<WeatherConstructor> weatherTime1 = weather.getDay();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherTime1.get(1);
                id_time2.setText(summary.getTime());
                id_three.setText(summary.getTemp());
            }

            List<WeatherConstructor> weatherTime2 = weather.getDay();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherTime2.get(2);
                id_time3.setText(summary.getTime());
                id_six.setText(summary.getTemp());
            }

            List<WeatherConstructor> weatherTime3 = weather.getDay();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherTime3.get(3);
                id_time4.setText(summary.getTime());
                id_nine.setText(summary.getTemp());
            }

            List<WeatherConstructor> weatherTime4 = weather.getDay();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherTime4.get(4);
                id_time5.setText(summary.getTime());
                id_twelve.setText(summary.getTemp());
            }

            List<WeatherConstructor> weatherTime5 = weather.getDay();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherTime5.get(5);
                id_time6.setText(summary.getTime());
                id_fifteen.setText(summary.getTemp());
            }

            List<WeatherConstructor> weatherTime6 = weather.getDay();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherTime6.get(6);
                id_time7.setText(summary.getTime());
                id_eighteen.setText(summary.getTemp());
            }

            List<WeatherConstructor> weatherTime7 = weather.getDay();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherTime7.get(7);
                id_time8.setText(summary.getTime());
                id_twentyOne.setText(summary.getTemp());
            }



            //по дням недели
            ////////////////////////////////////////////////////////////////////////////////////////////////////

            List<WeatherConstructor> weatherWeek1 = weather.getWeek();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherWeek1.get(0);
                id_date1.setText(summary.getDate());
                id_dayWeek1.setText(summary.getDay());
                id_degreesMorning1.setText(summary.getTemp());
                id_degreesEvening1.setText(summary.getTempH());
                id_weater1.setText(summary.getCl());
            }

            List<WeatherConstructor> weatherWeek2 = weather.getWeek();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherWeek2.get(1);
                id_date2.setText(summary.getDate());
                id_dayWeek2.setText(summary.getDay());
                id_degreesMorning2.setText(summary.getTemp());
                id_degreesEvening2.setText(summary.getTempH());
                id_weater2.setText(summary.getCl());
            }

            List<WeatherConstructor> weatherWeek3 = weather.getWeek();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherWeek3.get(2);
                id_date3.setText(summary.getDate());
                id_dayWeek3.setText(summary.getDay());
                id_degreesMorning3.setText(summary.getTemp());
                id_degreesEvening3.setText(summary.getTempH());
                id_weater3.setText(summary.getCl());
            }

            List<WeatherConstructor> weatherWeek4 = weather.getWeek();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherWeek4.get(3);
                id_date4.setText(summary.getDate());
                id_dayWeek4.setText(summary.getDay());
                id_degreesMorning4.setText(summary.getTemp());
                id_degreesEvening4.setText(summary.getTempH());
                id_weater4.setText(summary.getCl());
            }

            List<WeatherConstructor> weatherWeek5 = weather.getWeek();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherWeek5.get(4);
                id_date5.setText(summary.getDate());
                id_dayWeek5.setText(summary.getDay());
                id_degreesMorning5.setText(summary.getTemp());
                id_degreesEvening5.setText(summary.getTempH());
                id_weater5.setText(summary.getCl());
            }

            List<WeatherConstructor> weatherWeek6 = weather.getWeek();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherWeek6.get(5);
                id_date6.setText(summary.getDate());
                id_dayWeek6.setText(summary.getDay());
                id_degreesMorning6.setText(summary.getTemp());
                id_degreesEvening6.setText(summary.getTempH());
                id_weater6.setText(summary.getCl());
            }

            List<WeatherConstructor> weatherWeek7 = weather.getWeek();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherWeek7.get(6);
                id_date7.setText(summary.getDate());
                id_dayWeek7.setText(summary.getDay());
                id_degreesMorning7.setText(summary.getTemp());
                id_degreesEvening7.setText(summary.getTempH());
                id_weater7.setText(summary.getCl());
            }

            List<WeatherConstructor> weatherWeek8 = weather.getWeek();
            for (int i = 0; i < 8; i++) {
                WeatherConstructor summary = weatherWeek8.get(7);
                id_date8.setText(summary.getDate());
                id_dayWeek8.setText(summary.getDay());
                id_degreesMorning8.setText(summary.getTemp());
                id_degreesEvening8.setText(summary.getTempH());
                id_weater8.setText(summary.getCl());
            }

        });

    }

}
