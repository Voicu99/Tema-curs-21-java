Spring Boot Greeting and User Account Application
This is a simple Spring Boot application that provides a personalized greeting service and a user account creation service. The application exposes two main functionalities: greeting users and creating/checking user accounts.

Project Structure
Greeting API: Generates a personalized greeting message.
Account API: Allows users to create an account and check account details.
Email Service: Simulates sending an email confirmation when a user creates an account (using mock data).
Endpoints
1. Greet User
   Description: Generate a personalized greeting message.

Method: GET
URL: http://localhost:8080/greet/{name}
Example:http://localhost:8080/greet/John
Response:Hello, John!


2. Create User Account
   Description: Create a new user account. The system generates a unique ID for each user, and a confirmation email is sent (mock).

Method: POST

URL: http://localhost:8080/user/create

Parameters:
firstName: First name of the user (minimum 2 characters)
lastName: Last name of the user (minimum 2 characters)
email: Valid email address (e.g., john.doe@example.com)
Example using curl: curl -X POST "http://localhost:8080/user/create?firstName=John&lastName=Doe&email=john.doe@example.com"
Response:
{
"id": "random-generated-uuid",
"firstName": "John",
"lastName": "Doe",
"email": "john.doe@example.com",
"createdAt": "2024-10-19T14:30:00"
}

3. Retrieve User Account by ID
   Description: Fetch the details of a user by their unique ID.

Method: GET
URL: http://localhost:8080/user/{id}
Example:http://localhost:8080/user/random-generated-uuid
Response:
User details:
ID: random-generated-uuid
Name: Mock User

