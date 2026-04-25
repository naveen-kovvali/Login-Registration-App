# 🔐 Login & Registration System (Java Servlets + JSP)

## 📌 Overview
This project is a web-based authentication system developed using Java Servlets, JSP, and JDBC following the MVC (Model-View-Controller) architecture.

It allows users to register, log in, maintain sessions, and securely access protected pages.

---

## 🚀 Features

- ✅ User Registration
- ✅ User Login Authentication
- ✅ Session Management
- ✅ Logout Functionality
- ✅ Protected Pages (Session-based access control)

---

## 🛠️ Tech Stack

- **Backend:** Java (Servlets, JSP)
- **Database:** MySQL
- **Connectivity:** JDBC
- **Frontend:** HTML, CSS

---

## 🧠 Architecture (MVC)

This project follows the MVC pattern:

- **Controller:** Servlets (handles requests & responses)
- **Model:** User class (data representation)
- **DAO:** Handles database operations using JDBC
- **View:** JSP & HTML (UI layer)

---

## 🔄 Application Flow

1. User fills registration form → data stored in database  
2. User logs in → credentials validated using DAO  
3. Session is created → user gains access to protected page  
4. Logout → session invalidated → redirected to login  

---

## 🗄️ Database Schema

**Table Name:** `AccountDetails`

| Column | Type |
|------|------|
| fname | VARCHAR |
| lname | VARCHAR |
| email | VARCHAR |
| dob | DATE |
| pass | VARCHAR |

---

## ⚙️ How to Run the Project

1. Clone the repository  
2. Import project into IDE (NetBeans / Eclipse)  
3. Configure MySQL database  
4. Update DB credentials in `DBConnections.java`  
5. Run on server (Apache Tomcat recommended)  

---

## ⚠️ Limitations / Future Improvements

- Password is stored in plain text (can be improved using hashing)
- No advanced validation (can be improved)
- UI can be enhanced
- Duplicate email validation can be added

---

## 📚 What I Learned

- MVC Architecture  
- JDBC Database Connectivity  
- Session Handling in Web Applications  
- Authentication Flow Design  

---

## 👨‍💻 Author

**Naveen Kumar**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
