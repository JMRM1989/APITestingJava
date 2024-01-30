# Demo Explanation
The code is a test class for updating a user using the HTTP PUT method in a Playwright-based API testing framework. The test scenario involves:

* Creating a user using a POST request.
* Extracting the created user's details.
* Updating the user's status and name using a PUT request.
* Verifying the updated user's details using a GET request.

# Technical Solution
### Java and Playwright:

* The project is written in Java, a widely-used programming language.
* Playwright, a browser automation library, is utilized for making API requests.

### POJO and Lombok:

* Plain Old Java Objects (POJOs) are employed to model user data (e.g., Users class).
* Lombok is used to reduce boilerplate code with annotations such as @Builder, @Getter, and @Setter.

### ObjectMapper (Jackson):

* The ObjectMapper class from the Jackson library is used for converting JSON responses to Java objects and vice versa.

### API Testing Approach:

* The test follows the common approach in API testing: Create a user, update the user, and verify the updates.
* Assertions are used to validate the expected behavior of the API responses.

# Implementation
* The UpdateUserPUTCallWithPojoLombokTest class extends BaseScript, which sets up the Playwright environment and provides methods for making API requests.
* The createUsersTest method is a JUnit test method that performs the following steps:
* Creates a new user with a POST request and asserts the response.
* Extracts the created user's details from the response.
* Updates the user's status and name.
* Sends a PUT request to update the user and asserts the response.
* Verifies the updated user's details with a GET request.