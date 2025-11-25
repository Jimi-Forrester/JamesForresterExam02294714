public class Wing {
    private int humidtyPercentage;
    private int idealHumidityPercentage;
    private int pollutionLevel;
    private int idealPollutionLevel;

    public Wing(){
    }

    public void setHumidtyPercentage(int percentage){
        this.humidtyPercentage = percentage;
    }

    public int getHumidtyPercentage(){
        return humidtyPercentage;
    }

    public void setIdealHumidityPercentage(int percentage){
        this.idealHumidityPercentage = percentage;
    }

    public int getIdealHumidityPercentage(){
        return idealHumidityPercentage;
    }
}
