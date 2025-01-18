# Mars Rover Project 

## Overview
The Mars Rover project simulates the movement and navigation of rovers on a Martian plateau. The rovers can be positioned on a grid, turned, and moved forward based on a series of instructions. The simulation checks if the rover's new positions are within the boundaries of the plateau.

## Features
* Define a plateau with specific dimensions.
* Place rovers on the plateau with initial positions and orientations.
* Control rover movement using commands: Left (L), Right (R), and Move Forward (M).
* Ensure rovers do not move outside the plateau boundaries.
* Get the final position and orientation of the rovers after executing commands.

## Technologies Used
* **Java**: Java: Programming language used for implementation.
* **JUnit**: Testing framework used for unit testing.

## Installation
### 1. Clone the repository:
```bash
git clone https://github.com/JannelJ/mars-rover.git
```
### 2. Navigate to the project directory
```bash 
cd mars-rover 
```
### 3. Build the project
Ensure you have [Maven](url) installed. Run the following command to build the project:

```bash
mvn clean install
```
Alternatively, if you're using Gradle, run:

```bash
./gradlew build
```
## Usage
### 1. Run the application:
After building the project, you can run the application with:
```bash
mvn exec:java -Dexec.mainClass="org.example.Main"
```
Or if you're using Gradle:
```bash
./gradlew run
```
### 2. Provide Input:
The application will prompt you for inputs such as the plateau size, rover names, initial positions, and movement instructions. Follow the instructions provided by the application.

- **Plateau Size**: Enter the width and height of the plateau
- **Rover Initial Position**: Enter the starting coordinates and direction (North (N), East (E), South (S), West (W))
- **Movement Instructions**: Enter a string of movement instructions (L, R, M):

* L: Spins the Rover 90 degrees Left without moving from the current coordinate point
* R: Spins the Rover 90 degrees Right without moving from the current coordinate point
* M: Moves the Rover forward by one grid point, maintaining the same heading/orientation

 ## Contributing
If you'd like to contribute to this project, please fork the repository and submit a pull request with your changes. Ensure that you include tests for any new functionality or bug fixes.

## License
This project is licensed under the MIT License - see the [LICENSE](url) file for details.

## Acknowledgements
Special thanks to all contributors and open-source libraries used in this project.
Feel free to adjust the content, especially the repository URL, license, and contributing section, according to your project's specific details and guidelines.
