package api.pw.POST;

import api.pw.BaseScript;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.options.RequestOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class createUsersPostCallTest extends BaseScript {

    static String emailId;
    public  static String getRanmdomEmail(){
        emailId =  "test_mail" + System.currentTimeMillis() + "mail.com";
        return emailId;
    }

    @Test
    public void createUsersTest() throws IOException {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("name","Juan");
        data.put("email", getRanmdomEmail());
        data.put("gender","male");
        data.put("status","active");

        //POST Call. create a user
       APIResponse apiResponse = apiRequestContext.post(baseURL,
                RequestOptions.create()
                        .setHeader("Content-Type","application/json")
                        //for the Authorization you will need to login to the api page and use your access token
                        .setHeader("Authorization","")
                        .setData(data));

        System.out.println(apiResponse.status());
        Assertions.assertEquals(apiResponse.status(), 201);
        Assertions.assertEquals(apiResponse.statusText(), "Created");

        System.out.println(apiResponse.text());

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode postAPIJsonResponse =  objectMapper.readTree(apiResponse.body());
        System.out.println(postAPIJsonResponse.toPrettyString());

        //capture id from post JSON response:
        String userID = postAPIJsonResponse.get("id").asText();
        System.out.println("user ID: " + userID);

        // GET Call: fetch the same user by id:
       APIResponse apiGetResponse = apiRequestContext.get(baseURL +"/"+userID,
                RequestOptions.create()
                        .setHeader("Authorization",""));

       Assertions.assertEquals(apiGetResponse.status(),200);
       Assertions.assertEquals(apiGetResponse.statusText(),"OK");

       System.out.println(apiGetResponse.text());
       Assertions.assertTrue(apiGetResponse.text().contains(userID));

        Assertions.assertTrue(apiGetResponse.text().contains(emailId));
    }
}
