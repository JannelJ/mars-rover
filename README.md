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
