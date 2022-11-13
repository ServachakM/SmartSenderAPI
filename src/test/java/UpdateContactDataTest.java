import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateContactDataTest {

    private final static String URL = "https://api.smartsender.io/";


    @Test
    public void testUpdateContactDataPhoneNumber() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());

        Boolean result = true;
        String requestId = "5d915c22d132d5f45a4e38b8";
        RequestData updateContactData = new RequestData
                ("+15555555", "John Doe", "user@example.com", "+15555555", "myUserId");
        ResponseData info = given()
                .body(updateContactData)
                .when()
                .post("v3/contacts/update")
                .then().log().all()
                .extract().as(ResponseData.class);

        Assert.assertEquals(result, info.getResult());
        Assert.assertEquals(requestId, info.getRequestId());
    }
}