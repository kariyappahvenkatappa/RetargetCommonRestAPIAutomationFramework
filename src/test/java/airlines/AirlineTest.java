package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtils;
import utils.JsonUtils;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlineTest extends AirlineAPIs{

    @Test
    public void createAirline() throws IOException {

        //Map<String,Object> payload = Payloads.getCreateAirlinePayloadFromMap("283423","AirlinePluto5","China","Logo5","Slogan5","Shangai","Website5","2003");
        Map<String,Object> payload = Payloads.getCreateAirlinePayloadFromMap();
        Response response = createAirline(payload);
        Assert.assertEquals(response.statusCode(),200);
    }


}
