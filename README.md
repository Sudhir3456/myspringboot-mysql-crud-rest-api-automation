 
<h1 align="center">🛒Product API : API Automation Framework</h1>
 
🚀 A scalable and efficient API automation framework designed to validate and test Product API services, ensuring seamless integration, data integrity, and performance.


### 🎯 Objectives
✔ Automate end-to-end API testing with CRUD operations <br>
✔ Validate API responses and data accuracy <br>
✔ Implement data-driven testing for broader coverage <br>
✔ Generate detailed execution reports with Extent Reports <br>
✔ Ensure modular, maintainable, and scalable framework design <br>

![WhatsApp Image 2025-05-23 at 20 37 18_592d0402](https://github.com/user-attachments/assets/d7d24e0e-a1da-449b-b79a-24312a7a60e2)

 

![WhatsApp Image 2025-05-23 at 20 35 39_0a1c84f6](https://github.com/user-attachments/assets/583fea34-e73b-4939-842b-25bab2de5298)



 <h1 align="center">📂 Project Structure  :</h1>

![Product Api Eclips Folder structure](https://github.com/user-attachments/assets/26acb9fe-4ac3-45f3-a23a-5a2992dbe895)

 # 📝Folder Structure Overview :

 ```plaintext
myspringboot-mysql-crud-rest-api-automations
├── src
│   ├── test/java
│   │   ├── api.endpoints               # Handles API endpoints
│   │   │   ├── Routes.java             # Defines base and endpoint routes
│   │   │   ├── ProductEndPoints.java   # Product-related API operations
│   │   ├── api.payload                 # POJO classes for payloads
│   │   │   ├── Product.java            # Product data model
│   │   ├── api.test                    # Test scripts for API testing
│   │   │   ├── ProductTests.java       # Test cases for Product API
│   │   │   ├── DDProductTests.java     # Data-driven product tests
│   │   ├── api.utilities               # Utility classes for testing framework
│   │   │   ├── DataProviders.java      # Excel data providers
│   │   │   ├── ExtentReportManager.java# Manages HTML reports
│   │   │   ├── XLUtility.java          # Excel read/write utilities
│   ├── test/resources
│   │   ├── log4j2.xml                  # Logging configuration
│   │   ├── routes.properties           # API routes for easy config
├── logs
│   ├── automation.log                  # Log file for execution tracking
├── reports
│   ├── Test-Report-YYYY.MM.DD.HH.MM.SS.html  # Time-stamped HTML reports
├── testData
│   ├── ProductData.xlsx                # Test data for product scenarios
├── test-output                         # TestNG generated output
├── pom.xml                             # Maven configuration with dependencies
├── testng.xml                          # TestNG suite configuration

```
 

   <h1 align="center">📂 Project Phases  :</h1>


| Phase-1: Implementation | Phase-2: Execution | Phase-3: Maintenance |
|--------------|-------------|------------|
| Create Maven Project                     |Run test cases with Maven pom.xml.                         |Creating repository in GITHUB.  |
| Update pom.xml                           |Run test cases through Maven CLI. (Command Line Interface) |Commit the project code in local repository. |
| Create Page Objects                      |Run test cases using run. bat.                             |Push the project code to GITHUB remote repository from local GIT repository. |
| Create Basic Test case                   |Run test cases using Jenkins. (using bat file)             |Addressing issues and updates to automation scripts.
| Add logs to test case                    |Review test results and identify defects.                  |Reporting on automation performance and improvements. 
| Read common values from properties file  |Defect logging and management
| Run test case on desired browser         |
| Add extent report                        |
| Create Data Driven test case             | 
| Adding new test case                     | 
 
  <h1 align="center">🌐 Technologies Used:</h1>
 

- **Java (JDK 1.7+)** is being used as Programming language.

- **Eclipse IDE** is used to develop the automated scripts.

- **RestAssured** is used for API automation.

- **JSON** is used for JSON parsing.

- **Jackson/Gson** is used to develop the automated scripts.

- **Log4j2** is used for logging test execution details.

- **Apache POI** is used for logging test execution details Data Handling & Utilities.

- **Jackson/Gson** is used for reading/writing Excel test data.

- **Properties file** is used for configuration management.
 
- **Build tool Maven** is used for build, execution and dependency purpose.

- **TestNG framework** is used for organizing the scripts.
 
- **Test data** is read from Excel sheet at run time.

- **Git and Github** is used for version control management.

- **Cl tool Jenkins** is used to run the scripts.

- **Extent Spark Report** test results are generated for each run.

<h1 align="center">✨ Key Features :</h1>

- >> Modular Design: Structured packages for API endpoints, payloads, tests, and utilities.
- >>REST API Automation: Uses RestAssured for API testing (GET, POST, PUT, DELETE).
- >>Data-Driven Testing: Reads test data from Excel (Apache POI) and uses TestNG DataProviders.
- >> Hybrid Framework: Combines Data-Driven, Modular, and Utility-Based approaches.
- >> Configuration Management: Stores API routes in properties files for easy updates.
- >> Assertions & Error Handling: Uses TestNG assertions for response validation.
- >> Maven-Based Build: Manages dependencies and execution via pom.xml.
- >> Automated Test Reports: Saves execution logs and generates detailed HTML reports.



<h1 align="center">  💼 Reporting :</h1>

  - TestNG Reports :
 
![Screenshot 2025-05-26 082606](https://github.com/user-attachments/assets/542da2f0-e3a9-4ba2-86a7-84438df6f8b0)
 
![Product Api report](https://github.com/user-attachments/assets/ac9b52e0-01b4-4816-b111-e8a15527b921)
 

 <h1 align="center">🤝 Contributing :</h1>

- Contributions are welcome! Feel free to submit issues and pull requests.
 



    
