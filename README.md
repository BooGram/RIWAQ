# 📚 RIWAQ – system

> Intelligent reading platform that helps users manage their books, track reading progress, and organize their reading journey through personalized insights and smart recommendations.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Google Books](https://img.shields.io/badge/Google_Books-API-red)
![OpenAI](https://img.shields.io/badge/OpenAI-AI-purple)


---

## 👩‍💻 My Contribution

| Module          | Features                                        |
| --------------- | ----------------------------------------------- |
| 👤 User         | CRUD Operations, Username Validation            |
| 📚 Book         | CRUD Operations, Book Dashboard, Similar Books  |
| 📖 UserBook     | Progress Tracking, Reading Dashboard, Reminders |
| 🔎 Google Books | Search & Import Books                           |

---

## 🔗 Custom APIs

### 👤 User APIs

| API                  | Path                               |
| -------------------- | ---------------------------------- |
| Get User By Username | `/api/v1/user/username/{username}` |
| Get User By Email    | `/api/v1/user/email/{email}`       |

---

### 📚 Book APIs

| API                          | Path                                      |
| ---------------------------- | ----------------------------------------- |
| Get Books By User            | `/api/v1/book/user/{userId}`              |
| Get Books By Author          | `/api/v1/book/author/{author}`            |
| Add Book From Google         | `/api/v1/book/add-google/{userId}?title=` |
| Book Dashboard               | `/api/v1/book/dashboard/{bookId}`         |
| Similar Books Recommendation | `/api/v1/book/similar/{bookId}`           |

---

### 🔎 Google Books APIs

| API                 | Path                                |
| ------------------- | ----------------------------------- |
| Search Google Books | `/api/v1/google-book/search?title=` |

---

### 📖 UserBook APIs

| API                     | Path                                                  |
| ----------------------- | ----------------------------------------------------- |
| Get Books By Status     | `/api/v1/user-book/status/{userId}/{status}`          |
| User Dashboard          | `/api/v1/user-book/dashboard/{userId}`                |
| Get Books Between Dates | `/api/v1/user-book/between-dates?startDate=&endDate=` |
| Almost Completed Books  | `/api/v1/user-book/almost-complete/{userId}`          |
| Check Reading Reminders | `/api/v1/user-book/check-reminders`                   |

---

### 🔔 Notification APIs

| API                    | Path                        |
| ---------------------- | --------------------------- |
| Get Notification By Id | `/api/v1/notification/{id}` |

---

## 📊 API Statistics

| Metric              | Status        |
| ------------------- | ------------- |
| Custom APIs         | 14            |
| CRUD Operations     | ✅ Implemented |
| Google Books API    | ✅ Integrated  |
| OpenAI API          | ✅ Integrated  |
| Email Notifications | ✅ Implemented |


---

## 🤖 AI Features

### 🧠 Reader Dashboard Analysis

* Reader Profile Generation
* Personalized Reading Advice
* Reading Streak Insights
* Review Activity Analysis

### 📈 Book Dashboard Analysis

* Reader Engagement Analysis
* Activity Summary Generation
* Reading Recommendations

### 📚 Similar Book Recommendations

* Generate 5 similar books after completing a book

---

## 🔔 Notifications & Email

✅ Welcome Messages

✅ Book Added Notifications

✅ Book Completion Notifications

✅ Similar Book Recommendations

✅ Reading Reminder Notifications

---

## 📖 Google Books API

* Search books by title
* Retrieve book information automatically
* Import books directly into the platform

Retrieved information:

* Title
* Author
* Description
* Page Count 
