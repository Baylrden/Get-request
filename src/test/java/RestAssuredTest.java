import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class RestAssuredTest {

    @Test
    public void get_Test() {

        when().get("https://generator.swagger.io/")
                .then().statusCode(200);

    }

}
