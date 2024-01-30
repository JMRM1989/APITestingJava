# API Test Automation with Playwright

This Java project demonstrates basic API test automation using the Playwright library. It includes two test methods for making GET requests to a sample API.

### Configuration
Provide a valid access token for `Authorization` in the test code.

# GET
## GETAPICall
### getUsersApiTest
This test method makes a GET request to the base URL and asserts that the response status code is 200.

``` java
@Test
public void getUsersApiTest() {
// Test logic here...
}
```

### getSpecificUserApiTest
This test method makes a GET request to the base URL with specific query parameters and asserts that the response status code is 200.

``` java
@Test
public void getSpecificUserApiTest() {
    // Test logic here...
}
```

## APIHeadersTest
This test method makes a GET request to the base URL and checks the response status code, headers using both Map and List representations.

``` java
@Test
public void APIHeadersTest() {
    // Test logic here...
}
```
The test includes the following verifications:

1. Validates that the response status code is 200.

2. Retrieves and prints response headers using a Map.

3. Validates specific headers using assertions (e.g., "server" should be "cloudflare" and "content-type" should be "application/json; charset=utf-8").

4. Retrieves and prints response headers using a List.

## APIDisposeTest
This test method makes a GET request to the base URL, retrieves and prints information about the API response, and then disposes of the response object.
``` java
@Test
public void disposeResponse() {
    // Test logic here...
}
```

The test includes the following steps:

1. Makes a GET request to the base URL and checks the response status code.

2. Retrieves and prints the response status text.

3. Prints the API response with plain text.

4. Disposes of the API response.

5. Attempts to access the response status after disposal.

# POST
## createUsersPostCallTest
This test method makes a POST request to the base URL to create a user, and then makes a GET request to retrieve the same user's details.

The test includes the following steps:

1. Generates a random email address for user creation.

2. Constructs a JSON payload with user data (name, email, gender, and status).

3. Makes a POST request to create a user and asserts the response status code and status text.

4. Parses the POST API response and extracts the user ID.

5. Makes a GET request to fetch the user by ID and asserts the response status code and status text.

6. Verifies the details of the retrieved user, including the user ID and email.

## createUserTestWithJSONTest
This test method makes a POST request to the base URL to create a user using a JSON payload, and then makes a GET request to retrieve the same user's details.

The test includes the following steps:

1. Constructs a JSON payload for user creation.

2. Makes a POST request to create a user and asserts the response status code and status text.

3. Parses the POST API response and extracts the user ID.

4. Makes a GET request to fetch the user by ID and asserts the response status code and status text.

5. Verifies the details of the retrieved user, including the user ID.

## createUserWithJSONFileTest
This test method reads user data from a JSON file, makes a POST request to the base URL to create a user, and then makes a GET request to retrieve the same user's details.

The test includes the following steps:

1. Reads user data from a JSON file located at ./src/test/data/user.json.

2. Makes a POST request to create a user and asserts the response status code and status text.

3. Parses the POST API response and extracts the user ID.

4. Makes a GET request to fetch the user by ID and asserts the response status code and status text.

5. Verifies the details of the retrieved user, including the user ID.

## createUserPostCallWithPojoTest
This test method creates a `User` object, makes a POST request to the base URL to create a user, and then verifies the user's details using assertions against the converted POJO.

The test includes the following steps:

1. Creates a User object with the necessary user data.

2. Makes a POST request to create a user and asserts the response status code and status text.

3. Converts the API response text to a User POJO using Jackson ObjectMapper.

4. Asserts that the attributes of the created User match the expected values.

Ensure the `User` class has the necessary attributes (name, email, gender, status, and id) and a constructor for creating instances.

## createUserCallWithPojoLombokTest

This test method creates a `Users` object using Lombok annotations, makes a POST request to the base URL to create a user, and then verifies the user's details using assertions against the converted POJO.

The test includes the following steps:

1. Creates a Users object with the necessary user data using Lombok annotations.

2. Makes a POST request to create a user and asserts the response status code and status text.

3. Converts the API response text to a User POJO using Jackson ObjectMapper.

4. Asserts that the attributes of the created User match the expected values.

### Lombok Annotations
Ensure you have Lombok annotations properly configured in your IDE or build tool to enable features like @Builder, @Getter, and @Setter.

``` java
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Users {
    // Class definition here...
}
```

# PUT
## UpdateUserPUTCallWithPojoLombokTest
This test method creates a Users object using Lombok annotations, makes a POST request to the base URL to create a user, updates the user's details with a PUT request, and then verifies the updated user's details using assertions.

The test includes the following steps:

1. Creates a Users object with the necessary user data using Lombok annotations.

2. Makes a POST request to create a user and asserts the response status code and status text.

3. Converts the API response text to a User POJO using Jackson ObjectMapper.

4. Asserts that the attributes of the created User match the expected values.

5. Updates the user's status to "inactive" and name to "Manual Perez".

6. Makes a PUT request to update the user's details and asserts the response status code.

7. Converts the PUT API response text to a Users POJO using Jackson ObjectMapper.

8. Verifies the updated user's details, including the user ID, status, and name.

9. Makes a GET request to fetch the updated user by ID and asserts the response status code.

10. Converts the GET API response text to a Users POJO using Jackson ObjectMapper.

11. Verifies the details of the fetched user, including the user ID, status, and name.

# DELETE

## DeleteUserAPITest

This test method creates a Users object, makes a POST request to the base URL to create a user, deletes the user with a DELETE request, and then verifies the user's deletion.

The test includes the following steps:

1. Creates a Users object with the necessary user data using Lombok annotations.

2. Makes a POST request to create a user and asserts the response status code.

3. Converts the API response text to a User POJO using Jackson ObjectMapper.

4. Asserts that the user ID is not null.

5. Deletes the user with a DELETE request and asserts the response status code.

6. Prints the response body of the DELETE request.

7. Makes a GET request to fetch the deleted user by ID and asserts the response status code.

8. Verifies that the user is not found (status 404) with assertions.








