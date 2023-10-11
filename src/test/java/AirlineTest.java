import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import restUtils.RestUtils;
import utils.JsonUtils;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlineTest {

    @Test
    public void createAirline() throws IOException {
        String env = System.getProperty("env") == null ? "qa":System.getProperty("env");
        Map<String,String> data = JsonUtils.getJsonDataAsMap("airlines/" +env+"/AirlinesApiData.json");
        String endPoint = data.get("createAirLineEndpoint");
        Map<String,Object> payload = Payloads.getCreateAirlinePayloadFromMap("28346","AirlinePluto5","China","Logo5","Slogan5","Shangai","Website5","2003");
        Response response = RestUtils.performPost(endPoint,payload,new HashMap<>());
        Assert.assertEquals(response.statusCode(),200);
    }


}
