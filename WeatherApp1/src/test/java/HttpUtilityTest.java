import org.junit.Test;

//import java.HttpUtilities;
import java.io.IOException;
import java.net.HttpURLConnection;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;


// Created by artur on 11.09.2017.
public class HttpUtilityTest {
    @Test
    public void testHttpConnectionExampleApi(){
        try {
            String requestUrl = "API REQUEST URL";
            HttpURLConnection con = HttpUtilities.makeHttpGetRequest(requestUrl);
            assertEquals(con.getResponseCode(), 200);
        } catch (IOException ioq) {
            fail("HTTP connection threw error:" + ioq.getLocalizedMessage());
        }
    }


}
