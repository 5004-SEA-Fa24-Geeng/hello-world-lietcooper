# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment.


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].

```mermaid
---
title: Aloha World UML
---
classDiagram
    direction LR
    AlohaWorld --> Greeter
    AlohaWorld --> ConsoleView: uses
    ConsoleView --> Greeter: uses
    class AlohaWorld {
        -AlohaWorld()
        +main(String[] args): void
    }
    class ConsoleView {
        -Scanner SCANNER
        -List<String> LOCALITY_OPTIONS
        +ConsoleView()
        +getName(): String
        +getLocality(): int
        +checkRunAgain(): boolean
        +printGreeting(): void
    }
    class Greeter {
        -String name
        -int locality
        -List<String> loaclityList
        -int HAWAII
        -int CHINA
        -int ITALY
        -int DEFAULT_LOCALITY
        +Greeter(String name)
        +Greeter(String name, int loality)
        +getName(): String
        +getLocality(): int
        +setLocality(int locality): void
        +greet(): String
        +greet(boolean asciiOnly): String
        +getLocalityString(): String
        +hashCOde(): int
        +equals(Object obj): boolean
        +toString(): String
        +getLocalityList(): List<String>
        
    }
```

### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).

Run the main program *AlohaWorld* and it initiates *ConsoleView* to get the name and the locality of the user. Then it instansiate a *Greeter* and print the greeting to the screen according to the user's information and asks user whether to greet again. 

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   - `final class`
   - `Scanner SCANNER = new Scanner(System.in); SCANNER.nextLine()`
   - `String.format()`

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
    * The `Scanner(System.in)` takes input from the computer[^3].
    * `String.format()` returns the formatted string in the parenthesis[^4].

3. What does `main` do in Java? 

   `main` is the directory for the java class source code whereas the `test` contains the test code for each class. The `main` class serves as the driver of the entire program and starts it by `main` method. 

4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

    `toString()` returns the String value of the object. Doing so makes it easier to debug.

5. What is javadoc style commenting? What is it used for? 

    It is multiple-line comments explaining the function, parameters, and return value of methods.

6. Describe Test Driving Development (TDD) in your own words. 

    Create tests for each testable method in each class and make sure that all tests are passed in order to properly run the program.    

7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?

   It is easier to maintain the project and without direct access to the atrributes and methods in other classes. 


2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.
   
   Define a method `addLanguage()` that takes in the language name and its greeting and return to a new list of languages.


> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.

[^3]: Class Scanner (Java SE 8). https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html. Accessed: 2025-01-22.

[^4]: Strings (Java Tutorials). https://docs.oracle.com/javase/tutorial/java/data/strings.html. Accessed 2025-01-22. 

<!-- This is a comment, below this link the links in the document are placed here to make it easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java