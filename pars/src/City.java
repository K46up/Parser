public enum City {
    Сочи("sochi"), Москва("moscow"), Адлер("adler"),
    Калининград("kaliningrad"), Анапа("anapa"), Кисловодск("kislovodsk"),
    Краснодар("krasnodar"), Казань("kazan"), Лазаревское("lazarevskoye"),
    Екатеринбург("yekaterinburg"), Геленджик("gelendgik"), Новосибирск("novosibirsk"),
    Махачкала("makhachkala"), Волгоград("volgograd"), Крым("krym"),
    Владивосток ("vladivostok"), Ялта("yalta"), Донецк("donetsk");
    private String transcript;
    City(String transcript){
        this.transcript = transcript;
    }
    public String getTranscript(){
        return transcript;
    }
}
