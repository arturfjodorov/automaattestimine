public class CurrentWeather {
    private String city;
    private String countryCode;
    private double coordinatesLatitude;
    private double coordinatesLongtitude;
    private int currentTemperature;
    private int maxTemp;
    private int minTemp;

    public String getCity() {
        return city;
    }
    public String getCountryCode() {
        return countryCode;
    }

    public double getCoordinatesLatitude() {
        return coordinatesLatitude;
    }

    public double getCoordinatesLongtitude() {
        return coordinatesLongtitude;
    }
    public int getCurrentTemperature() {
        return currentTemperature;

    }
    public int getMaxTemperature() {
        return maxTemp;
    }
    public int getMinTemperature() {
        return minTemp;
    }
}
