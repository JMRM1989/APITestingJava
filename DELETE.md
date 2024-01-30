# Demo
Let's consider the scenario where we have a User Management API, and we want to test the functionality of creating, updating, and deleting users using Playwright in a Java environment.

### Create User:

* The createUsersTest method creates a new user by making a POST request to the specified API endpoint.
* It asserts that the response status is 201 (Created) and extracts the created user's details from the response.

### Update User:

* After creating the user, the test updates the user's details (status and name) using a PUT request.
* It asserts that the response status is 200 (OK) and verifies the updated details by making a GET request to fetch the user.

### Delete User:

* The test then deletes the user using a DELETE request.
* It asserts that the response status is 204 (No Content) after deletion.
* Finally, it checks if the user is not found (404 status) by making another GET request.

# Technical Solution

### Java and Playwright:

* Java is chosen as the programming language for its readability, maintainability, and wide adoption in the industry.
* Playwright is used as the browser automation library, allowing interaction with web APIs.

### POJO and Lombok:

* Plain Old Java Objects (POJOs) are used to model user data (e.g., Users and User classes).
* Lombok is employed for reducing boilerplate code, with annotations such as @Builder, @Getter, and @Setter for cleaner code.

### ObjectMapper (Jackson):

* The ObjectMapper class from the Jackson library is used for converting JSON responses to Java objects and vice versa.

### API Testing Approach:

* The tests follow a common approach in API testing: Create, Update, and Delete (CRUD).
* Assertions are used to validate the expected behavior of the API responses.

# Implementation
* The base script (BaseScript) sets up the Playwright environment and provides methods for making API requests.
* Separate classes (createUserCallWithPojoLombokTest, UpdateUserPUTCallWithPojoLombokTest, DeleteUserAPITest) contain JUnit test methods for each operation.
* These test classes use common methods to create, update, and delete users, demonstrating modular and reusable test code.