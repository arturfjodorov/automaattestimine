import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * Created by artur on 25.09.2017.
 */
public class LocationWeatherTest {

    @Test
    public void testWeatherMinTemperatureIsNotNull() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertNotNull(weatherequest.getMinTemperature());
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }
    }
    @Test
    public void testWeatherMaxTemperatureIsNotNull() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertNotNull(weatherequest.getMaxTemperature());
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }
    }

    @Test
    public void testWeatherKelvinMinAndMaxPossibleTemperature() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertTrue(weatherequest.getMinTemperature() >= 173 && weatherequest.getMaxTemperature() <= 340);
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }


    }
    @Test
    public void testWeatherTemperatureMinIsSmallerThanMax() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertTrue(weatherequest.getMinTemperature() < weatherequest.getMaxTemperature());
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }
    }
    @Test
    public void testWeatherTemperatureMaxIsBiggerThanMin() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertTrue(weatherequest.getMaxTemperature() > weatherequest.getMinTemperature());
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }
    }
    @Test
    public void testLocationByCoordinatesCountryCode(){
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437,24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertEquals("EE", weatherequest.getCountryCode());
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }

    }
    @Test
    public void testLocationByTown() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertEquals("Tallinn", weatherequest.getCity());
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }
    }
    @Test
    public void testLocationByCoordinatesLatitude() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertEquals(59.437, weatherequest.getCoordinatesLatitude());
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());
        }
    }
    @Test
    public void testLocationByCoordinatesLongtitude() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertEquals("24.7535", weatherequest.getCoordinatesLongtitude());
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());
        }
    }
    @Test
    public void testLatitudeIsNotTooBig() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertTrue(weatherequest.getCoordinatesLatitude() < 180);
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }
    }
    @Test
    public void testLatitudeIsNotTooSmall() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertTrue(weatherequest.getCoordinatesLatitude() > -180);
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }

    }
    @Test
    public void testLongtitideIsNotTooBig() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertTrue(weatherequest.getCoordinatesLongtitude() < 90);
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }
    }
    @Test
    public void testLongtitudeIsNotTooBig() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertTrue(weatherequest.getCoordinatesLongtitude() > -90);
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }
    }
    @Test
    public void testCurrentTemperature() {
        try {
            WeatherRepository repository = new WeatherRepository("Tallinn", "EE", 59.437, 24.7535);
            CurrentWeather weatherequest = repository.getCurrentWeather();
            assertEquals(20, weatherequest.getCurrentTemperature());
        } catch(Exception e) {
            fail("Failured, because: " + e.getMessage());

        }
    }

}
