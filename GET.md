# Demo Explanation
The code is a test class for making GET requests to a User Management API using Playwright in a Java environment. The test scenarios include:

### Get Users API Test:

* Performs a basic GET request to the API endpoint specified by baseURL.
* Verifies that the response status is 200 (OK) and prints the status text.
* Prints the plain text response content to the console.

### Get Specific User API Test:

* Makes a GET request to the API endpoint with additional query parameters (id and status).
* Verifies that the response status is 200 (OK) and prints the status text.
* Prints the plain text response content to the console.

# Technical Solution
### Java and Playwright:

* The project is written in Java, a widely-used programming language.
* Playwright, a browser automation library, is utilized for making API requests.

### API Testing Approach:

* The test class follows a common approach in API testing: making GET requests to the API and validating the responses.
* Assertions are used to ensure that the API responses meet the expected criteria.

### ObjectMapper (Playwright):

The APIResponse class from Playwright is used to represent the response of an API request.

# Implementation
* The GETAPICall class extends BaseScript, which sets up the Playwright environment and provides methods for making API requests.
* Two JUnit test methods (getUsersApiTest and getSpecificUserApiTest) are defined to test different scenarios.
* Each test method uses the apiRequestContext.get method to perform a GET request and validates the response using assertions.
* The console outputs the response status, status text, and plain text content for verification and debugging.
