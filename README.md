# 📚 RIWAQ – Community & Social Features

> Social reading platform that allows readers to share thoughts, reviews, and reading progress while connecting with other readers through friendships, discussions, and AI-powered post analysis.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![OpenAI](https://img.shields.io/badge/OpenAI-AI-purple)
![Google Books](https://img.shields.io/badge/Google_Books-API-red)

---

## 👨‍💻 My Contribution

| Module           | Features                                                     |
| ---------------- | ------------------------------------------------------------ |
| 📝 Post          | CRUD Operations, Reader Discussions, Friend Feed, Book Posts |
| 👍 Post Like     | Like Management, Post Engagement                             |
| ⭐ Review         | CRUD Operations, Rating System, Review Filtering             |
| 🤝 Friendship    | Friend Requests, Accept/Reject Requests, Social Connections  |
| 🧠 Post Analysis | AI Post Summarization, Content Classification                |
| 🔔 Notifications | Smart Reading Progress Notifications, Email Notifications    |

---

## 🔗 Custom APIs

### 📝 Post APIs

| API                       | Path                                          |
| ------------------------- | --------------------------------------------- |
| Get Posts By Book         | `/api/v1/post/book/{bookId}`                  |
| Get Posts By Current Page | `/api/v1/post/get/page/{bookId}/{pageNumber}` |
| Get Friends Posts         | `/api/v1/post/friends/{userId}`               |
| Most Liked Posts          | `/api/v1/post/filter/most-liked`              |

---

### ⭐ Review APIs

| API                   | Path                                 |
| --------------------- | ------------------------------------ |
| Get Reviews By Book   | `/api/v1/review/get/book/{bookId}`   |
| Get Reviews By User   | `/api/v1/review/get/user/{userId}`   |
| Highest Rated Reviews | `/api/v1/review/filter/highestRated` |
| Lowest Rated Reviews  | `/api/v1/review/filter/lowestRated`  |
| Recent Reviews        | `/api/v1/review/filter/recent`       |

---

### 🤝 Friendship APIs

| API                   | Path                                                |
| --------------------- | --------------------------------------------------- |
| Send Friend Request   | `/api/v1/friendship/add/{senderId}/{receiverId}`    |
| Accept Friend Request | `/api/v1/friendship/accept/{senderId}/{receiverId}` |
| Reject Friend Request | `/api/v1/friendship/reject/{senderId}/{receiverId}` |
| Pending Requests      | `/api/v1/friendship/pending/{userId}`               |

---

### 👍 Post Like APIs

| API       | Path                                      |
| --------- | ----------------------------------------- |
| Like Post | `/api/v1/post-like/add/{userId}/{postId}` |

---

### 🧠 Post Analysis APIs

| API                 | Path                                     |
| ------------------- | ---------------------------------------- |
| Analyze Post        | `/api/v1/post-analysis/analyze/{postId}` |
| Get Analysis Result | `/api/v1/post-analysis/post/{postId}`    |

---

## 📊 API Statistics

| Metric              | Status        |
| ------------------- | ------------- |
| Custom APIs         | 14            |
| CRUD Operations     | ✅ Implemented |
| OpenAI API          | ✅ Integrated  |
| Email Notifications | ✅ Implemented |
| Social Features     | ✅ Implemented |
| AI Analysis         | ✅ Implemented |

---

## 🤖 AI Features

### 🧠 Post Analysis System

Analyze reader posts using OpenAI and generate:

* Automatic post summarization
* Content classification
* Reader discussion insights
* Language-aware summaries
* Structured AI-generated results

### 🏷️ Supported Post Types

* Recommendation
* Criticism
* Discussion
* Question
* Reflection
* Other

### 🌍 Smart Language Handling

* Arabic posts → Arabic summaries
* English posts → English summaries
* Preserves original writing style
* No automatic translation

---

## 👥 Social Reading Features

### 🤝 Friendship System

* Send friend requests
* Accept or reject requests
* Build reading communities
* Follow friends' reading activities

### 📝 Reader Posts

* Share reading thoughts
* Discuss books by page progress
* View posts from friends
* Discover popular discussions

### ⭐ Reviews & Ratings

* Create book reviews
* Rate books
* Browse highest-rated reviews
* View recent reader feedback

---

## 🔔 Smart Notifications

### Reading Progress Notifications

When a reader publishes a post about a book:

* Readers currently reading the same book receive notifications
* Notifications are triggered when the post page number matches or is behind the reader's current progress
* Helps readers discover relevant discussions without spoilers

### Email Notifications

✅ New Book Discussion Notifications

✅ Reading Activity Alerts

✅ Community Engagement Updates

---

## 🏗️ Controllers Implemented

* PostController
* PostLikeController
* ReviewController
* FriendshipController
* PostAnalysisController

---

## 🛠️ Technologies Used

* Java 17
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* MySQL
* OpenAI API
* Maven

---

## 🎯 Key Achievement

Built the social layer of RIWAQ by enabling readers to interact through friendships, reviews, discussions, likes, smart notifications, and AI-powered post analysis, transforming the platform from a personal reading tracker into a collaborative reading community.
