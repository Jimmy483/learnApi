Momo (Spring Boot)

Overview

Momo is a Spring Boot–based web application that allows users to view, manage, and update food item prices. The system includes role-based access control to provide different privileges for regular users, moderators, and administrators.
It supports secure user registration, messaging between users, and administrative tools for managing users and application data.

Features

User Features

1. View and check prices of food items with sorting.
2. Update personal information (e.g., profile picture, password).
3. Message other logged-in users.
4. Change application theme (light/dark, etc.).


Moderator Features

1. Add new food items.
2. Edit or delete existing food items.
3. Moderate user-generated content or messages.
4. Manage themes and settings.

Admin Features
All moderator permissions, plus:
         1. Manage user roles (upgrade/downgrade roles).
         2. Access a special request generator to invite new users:
                       * Generate a one-time link to the user registration form.
                       * Once used, the link automatically expires.

Tech Stack
     1. Backend: Spring Boot (Java, Spring Web, Spring Security, Spring Data JPA)
     2. Frontend: Thymeleaf / HTML/ Javascript/ CSS/ Jquery
     3. Database: MySQL
     4. Security: Spring Security, Session-based Authentication
     5. Build Tool: Maven
     6. Other: Lombok, JPA, Validation, etc.

Installation and Setup:
Prerequisites:
1. Java 17+
2. Maven
3. Mysql

Steps:
1. Clone the repository
   git clone https://github.com/Jimmy483/Spring-boot.git
2. Configure the database connection in application.properties:
   url: jdbc:mysql://localhost:3306/test
   username: yourusername
   password: yourpassword

3. run the app
4. go to http://localhost:7071
5. go to http://localhost:7071/createAdminForm to create an admin user(Can be used just once)

Default Roles and Access:
1. Assistant
   View Prices, Send Messages, Change Display picture/ Password
2. Moderator:
   Add Delete Edit food items
3. Admin:
    Manage Roles/ Generate invite links

Key Modules:
1. Dashboard -> Check food item's price 
2. Message Module -> Private messages between users
3. Setting Module -> Update display pictures, password, themes, items, Change roles and generate links to create new users

Screenshots:
<img width="1907" height="875" alt="image" src="https://github.com/user-attachments/assets/d0ae1967-aca3-4e5a-a6c3-2eef55112e1a" />
<img width="1894" height="784" alt="image" src="https://github.com/user-attachments/assets/31c56839-9530-461d-94f9-98a436d8ea9f" />

Future Improvements:

1. Upload and fetch picture from cloud
2. Add slidebar to filter items according to a certain price range
3. Currently refreshing the message module every 3 seconds using ajax and interval to update with new messages. Will use listener to refresh content.
4. use notification after receiving a message






