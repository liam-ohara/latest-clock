# The Latest Clock
This application was written as a solution to the *The latest clock* kata [published](https://www.codewars.com/kata/58925dcb71f43f30cd00005f) on the *Codewars* website.

This application will accept four postive single digits as an input from the user, and return a string of the latest possible time that can be created with those digits.

## Installation and Setup
### Prerequisites
* [Java 21 or above](https://www.oracle.com/uk/java/technologies/downloads/)
* Access to command line interface / terminal

### Installation
1. Download `latest-clock.jar` from the `/out/artifacts/latest-clock_jar/` directory of this repository.
2. Move the downloaded file to another local directory on your device of your choosing.
3. Open your command line interface / terminal and navigate to the local location of `latest-clock.jar`.
4. Run the application with the following command:
> java -jar latest-clock.jar

## Usage
Once you have run the application with the command above, you will be shown the following text:

>==Latest Clock==<br />
>----------------<br />
>Returns the latest valid time based on your input of four digits.<br />
>Please enter digit #1: <br />

### Examples

#### Correct use

>==Latest Clock==<br />
>----------------<br />
>Returns the latest valid time based on your input of four digits.<br />
>Please enter digit #1: <br />
>2 <br />
>Please enter digit #2: <br />
>9 <br />
>Please enter digit #3: <br />
>5 <br />
>Please enter digit #4: <br />
>3 <br />
>The latest valid time possible with those four digits is: 23:59<br />

#### Invalid input 
>==Latest Clock==<br />
>----------------<br />
>Returns the latest valid time based on your input of four digits.<br />
>Please enter digit #1: <br />
>A <br />
>Invalid entry. Please only enter single positive digits.<br />
>Input will now reset from the start.<br /><br />
>Please enter digit #1: <br />
