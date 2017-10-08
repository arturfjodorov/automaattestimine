public class CurrentWeather {
    private String city;
    private String countryCode;
    private double coordinatesLatitude;
    private double coordinatesLongtitude;
    private double currentTemperature;
    private double maxTemp;
    private double minTemp;

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    /*public String getCountryCode() {
        return countryCode;
    }*/
    public void setCoordinatesLatitude(double coordinatesLatitude) {
        this.coordinatesLatitude = coordinatesLatitude;

    }

    public double getCoordinatesLatitude() {
        return coordinatesLatitude;
    }


    public void setCoordinatesLongtitude(double coordinatesLongtitude) {
        this.coordinatesLongtitude = coordinatesLongtitude;
    }

    public double getCoordinatesLongtitude() {
        return coordinatesLongtitude;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getCurrentTemperature() {
        return currentTemperature;

    }
    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }
    public double getMaxTemperature() {
        return maxTemp;
    }

    public  void setMinTemp(double maxTemp) {
        this.maxTemp = minTemp;
    }
    public double getMinTemperature() {
        return minTemp;
    }
}
