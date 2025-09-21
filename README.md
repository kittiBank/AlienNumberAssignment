# Alien Number Calculation
This project is about converting specific English characters [A, B, Z, L, C, D, R] into integers based on specific conditions.
It was developed as part of back-end assignment using Java as the primary programming language includes validation and unit test. 

## Features in this project:
- Convert characters into integers based on the given rules.
- Validate input to ensure only allowed characters are accepted.
- Developed together with unit tests to verify conditions.

## Requirements
- Alien numeral mapping:
  - `A = 1`, `B = 5`, `Z = 10`, `L = 50`, `C = 100`, `D = 500`, `R = 1000`
- Subtractive rules (6 cases):
  - `A` before `B` or `Z` → 4, 9  
  - `Z` before `L` or `C` → 40, 90  
  - `C` before `D` or `R` → 400, 900  

## Tech Stack
- Java 17
- Maven
- JUnit 4 (for unit testing)

---

## Project Structure
alien-number-assignment/
- src/
   - main/java/com/example/
       - AlienNumberCalculation.java
- test/
   - test/java/com/example/
       - AlienNumberCalculationTest.java
- pom.xml
- README.md

## How to run
1. Install Prerequisites
   - Java JDK 17+
   - Apache Maven

2. Clone this project
<pre>- git clone https://github.com/yourusername/alien-number-assignment.git
- cd alien-number-assignment </pre>

4. Compile the Project
<pre>- mvn compile</pre>
<img width="500" height="400" alt="image" src="https://github.com/user-attachments/assets/8da69d40-7aea-45d0-afe6-59954a7decb0" />

6. Run the Application
<pre>- mvn exec:java -Dexec.mainClass="com.example.AlienNumberCalculation"</pre>
<img width="500" height="400" alt="image" src="https://github.com/user-attachments/assets/9875c0ae-dda6-4e9b-9975-e8eb5739908f" />

8. Run Unit Tests
<pre>- cd alien-number-assignment 
- mvn test</pre>

