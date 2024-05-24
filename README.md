Lava

A Java application that calculates the maximum amount of hot lava that can be trapped between rock formations in a valley.
Overview

This project simulates a volcanic eruption scenario where lava is trapped between rock formations. The program takes an array of integers representing the heights of rock formations and calculates the maximum volume of lava that can be trapped between these rocks.
Getting Started
Prerequisites

    Java Development Kit (JDK) installed on your system.
    A Java Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans.

Installation

    Clone the repository:

    bash

    git clone https://github.com/hosafxd/lava.git

    Open the project in your preferred Java IDE.

Usage

    Run the Lava class.
    Enter 10 integers representing the rock formations in the valley when prompted.

Example

plaintext

Enter 10 numbers representing the rock formations in the valley: 
8 3 2 1 6 0 7 3 2 5
There can be maximum observable amount of hot lava is (in cells): 28

Code Explanation

The Lava class contains the main method which reads user input, processes the array of rock formations, and calculates the maximum amount of trapped lava.
Key Methods

    main: The entry point of the application. It reads the input, initializes the arrays, and calculates the trapped lava.
    puddle: This method (to be implemented) will contain the logic to compute the maximum trapped lava given a 1D array of rock heights.

Algorithm

    Input Handling: The program reads 10 integers from the user, representing the rock heights.
    Reversal and Initial Processing: The input array is processed to find the maximum height and its position.
    Lava Calculation: The algorithm calculates the volume of lava that can be trapped by iterating through the array and using the heights of rocks to determine potential trapped volumes.

Future Enhancements

    Implement the puddle method to encapsulate the lava calculation logic.
    Add input validation to ensure correct data entry.
    Extend the program to handle arrays of different lengths.

Contributing

Feel free to fork the repository and submit pull requests. Contributions are welcome!
License

This project is licensed under the MIT License - see the LICENSE file for details.
Author

Furkan Öztürk
