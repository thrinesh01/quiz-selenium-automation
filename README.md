# Dynamic Quiz Application – Selenium Automation Testing

This repository contains the **Selenium automation test code** for the **Dynamic Quiz Application with Timer and Result Analysis**.

The automation validates the end-to-end functionality of the quiz application, including quiz start, question navigation, timer behavior, and result analysis.



## 🛠️ Tools & Technologies Used

- **Programming Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Build Tool:** Maven  
- **IDE:** IntelliJ IDEA  
- **Browser:** Google Chrome  
- **Operating System:** Windows  



## 📌 Application Under Test

**Dynamic Quiz Application** developed using:
- HTML
- CSS
- JavaScript  

### Key Features Tested:
- Quiz landing page load
- Category and difficulty selection
- Quiz start and navigation
- Automatic answer selection
- Result analysis display (correct, incorrect, performance)


## 🧪 Test Scenario Automated

The following test scenario is automated using Selenium WebDriver:

1. Launch the quiz application URL  
2. Verify the page URL and title  
3. Select quiz category and difficulty  
4. Click on the **Start Quiz** button  
5. Automatically answer all quiz questions  
6. Navigate to the result page  
7. Verify the result analysis details  



## ▶️ How to Run the Automation Test

### Prerequisites:
- Java JDK 11 or higher
- IntelliJ IDEA
- Google Chrome browser
- Maven installed

### Steps:
1. Clone this repository:
   ```bash
   git clone https://github.com/<your-username>/quiz-selenium-automation.git


2. Open the project in **IntelliJ IDEA**
3. Allow Maven dependencies to download
4. Navigate to:


   src/test/java/quiz/automation/QuizTest.java
 
5. Update the quiz application file path inside the test:

   ```java
   driver.get("file:///C:/path-to-your-project/index.html");
   ```
6. Right-click on `QuizTest.java` → **Run**



## 📊 Test Output

During execution:

* Google Chrome launches automatically
* Quiz is started and completed
* Result analysis is displayed
* Console logs show:

  * Application URL
  * Page title
  * Quiz result summary

---

## 📁 Project Structure


quiz-selenium-automation
│
├── pom.xml
└── src
    └── test
        └── java
            └── quiz
                └── automation
                    └── QuizTest.java



## ✅ Test Result

**Status:** PASS
The automation successfully validates the quiz application workflow and result analysis.


## 👤 Author

**Name:** Thrinesh
**Project Type:** Assignment


## 📎 Notes

* Selenium Manager is used for automatic ChromeDriver management.
* Any CDP warnings during execution do not affect test results.
* This repository contains only the automation code (quiz UI code is separate).


