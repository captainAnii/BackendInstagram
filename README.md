# BackendInstagram

- This project is an Instagram clone, developed with **Spring Boot**, that simulates some of the basic functionalities of the popular social media platform. It includes features such as user registration, user authentication, creating and deleting posts, adding and removing comments, liking posts, and following and unfollowing other users.
----
## Technologies Used

- **Spring Boot**: A powerful Java-based framework for building web applications.
- **MySQL**: As the relational database for storing user and post-related data.
- **Hibernate**: For object-relational mapping (ORM) and database interaction.
- **Maven**: For dependency management and building the project.
- **JSON**: For handling data exchange between the front-end and back-end.
- **Java Mail API**: To send emails, e.g., for password recovery or user verification.
- **JSON Web Tokens (JWT)**: For user authentication and session management.
----
## Project Structure

The project is structured as follows:

1. `Admin`, `AuthenticationToken`, `Comment`, `Follow`, `Like`, `Post`, and `User` are the main entity classes representing different objects in the application.
2. `AdminController` handles administrative operations (if any) for managing the application.
3. `UserController` contains various endpoints for user-related functionalities, such as sign up, sign in, sign out, posting, commenting, liking, and following other users.
4. `SignInInput` and `SignUpOutput` are supporting classes used for request and response payloads.
5. `EmailHandler` is a utility class for sending emails.
6. `PasswordEncrypter` provides a method to encrypt user passwords before storing them in the database.
7. `UserService` is the main service class that implements various operations for user-related functionalities.
8. `UserRepository`, `PostRepository`, `CommentRepository`, `LikeRepository`, `FollowRepository`, etc., are repository classes responsible for data access and interaction with the database for their respective entities.
-----
## Setup and Deployment

1. Clone the project from the repository.
2. Set up the MySQL database and update the database configuration in the `application.properties` file.
3. Build and run the project using Maven or an IDE like IntelliJ or Eclipse.
4. The application should now be running on the specified port (default is 8080).
5. You can interact with the application using HTTP requests to the various endpoints defined in `UserController`.
----
- Please note that this is a basic Instagram clone project meant for learning and practice purposes. It may not include all the functionalities of the actual Instagram application, and security aspects like securing passwords, handling exceptions, and input validation might need further improvement for a production-ready application.
----
## Contribution

- Feel free to contribute to this project by submitting bug reports, feature requests, or pull requests to the repository. We welcome all types of contributions to make the project better and more robust.
----
## Disclaimer

- This project is for educational purposes only and is not affiliated with Instagram or any other social media platform. It is not intended for commercial use or deployment to a production environment without further development and security considerations.
----
## License
- This project is licensed under the MIT License.
----
## Acknowledgments
- OpenAPI Specification - The specification used for documenting the API endpoints.
- Spring Boot - The framework used for building the Music Management System.
- Hibernate - The ORM (Object-Relational Mapping) framework used for interacting with the database.
- MySQL - The relational database management system used for storing music and user data.
----
## Contact
- For any questions or inquiries, please contact:

- Project Maintainer: Aniket Yogesh Gosavi
- Email: `aniket9766228627@gmail.com`
