# 0️⃣→💯

## This file is prepared for fast 🆙 to preparing Google,Meta and Amazon Live Coding Interview


### Table of Contents

* [1 - Data Types](#1---data-types)
    * [1.1 - Primitive data types](#11---primitive-data-types)
    * [1.2 - Non-Primitive data types](#12---non-primitive-data-types)
* [2 - Type Conversion](#2---type-conversion)
    * [2.1 - Primitive Data Types and String](#21---primitive-data-types-and-string)
        * [`floating point number` to `int`](#floating-point-number-to-int)
        * [`boolean` to `int`](#boolean-to-int)
        * [`int` to `boolean`](#int-to-boolean)
        * [`char` to `int`](#char-to-int)
        * [`int` to `char`](#int-to-char)
        * [`char` to `String`](#char-to-string)
        * [`String` to `char`](#string-to-char)
        * [`int` to `String`](#int-to-string)
        * [`String` to `int`](#string-to-int)
    * [2.2 -  Array and String](#22----array-and-string)
        * [`String` to `Array (char)`](#string-to-array-char)
        * [`Array (char)` to `String`](#array-char-to-string)
    * [2.3 - Array and List](#23---array-and-list)
        * [`Array` to `ArrayList`](#array-to-arraylist)
        * [`ArrayList` to `Array`](#arraylist-to-array)
* [3 - Practice Data Types (1 points / %1)](#3---practice-data-types-1-points--1)
* [4 - Default Values of Data Types in Java)](#4---default-values-of-data-types-in-java)
    * [4.1 - Default Values of Non-Primitive Data Types](#41---default-values-of-non-primitive-data-types)
    * [4.2 - Default Values of Primitive Data Types](#42---default-values-of-primitive-data-types)
* [5 - Practice Type Conversion (5 points / %5))](#5---practice-type-conversion-5-points--5)
    * [5.1 - Primitive Data Types and String](#51---primitive-data-types-and-string)
        * [`floating point number` to `int`](#511-floating-point-number-to-int)
        * [`boolean` to `int`](#512-boolean-to-int)
        * [`int` to `boolean`](#513-int-to-boolean)
        * [`char` to `int`](#514-char-to-int)
        * [`int` to `char`](#515-int-to-char)
        * [`char` to `String`](#516-char-to-string)
        * [`String` to `char`](#517-string-to-char)
        * [`int` to `String`](#518-int-to-string)
        * [`String` to `int`](#519-string-to-int)
    * [5.2 -  Array and String](#52----array-and-string)
        * [`String` to `Array (char)`](#521-string-to-array-char)
        * [`Array (char)` to `String`](#522-array-char-to-string)
    * [5.3 - Array and List](#53---array-and-list)
        * [`Array` to `ArrayList`](#531-array-to-arraylist)
        * [`ArrayList` to `Array`](#532-arraylist-to-array)
* [6 - User Input (Scanner)](#6---user-input-scanner)
    * [6.1 - Import Scanner](#61---import-scanner)
    * [6.2 - Create Scanner Object](#62---create-scanner-object)
    * [6.3 - Read Values from Keyboard Using Scanner Object](#63---read-values-from-keyboard-using-scanner-object)
    
## Instructions

### Create a file with following format.

```
day-month-year-succes_rate-point-enable_time_challenge-minutes_to_finish.java

if you do not enable time challenge minutes_to_finish = 0 default.

Example:
30-07-2024-60-75-0-0.java
30-07-2024-60-75-1-107.java

💛 WE LOVE!
```

## 1 - Data Types

### 1.1 - Primitive data types

| Data Type         | Size                    | Example                    | Description                    |
| --------------- | ------------------------------ |------------------------------ |------------------------------ |
| `byte`   | 1 byte   | byte myByte = 5;   |from -128 to 127|
| `short`     | 2 byte         | short myShort = 5;   |from -32,768 to 32,767|
| `int`     | 4 byte         | int myNum = 5;   |from -2,147,483,648 to 2,147,483,647|
| `float`     | 4 byte         | float myFloatNum = 1.1f;   |Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits|
| `double`     | 8 byte         | double myDoubleNum = 19.99;   |Stores fractional numbers. Sufficient for storing 15 decimal digits |
| `long`     | 8 byte         | long myLong = 5;   |from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
| `char`     | 2 byte         |  char myChar = 'e';   |Stores a single character/letter or ASCII values|
| `boolean`     | 1 byte         |  boolean myBool = true;   |true or false|

### 1.2 - Non-Primitive data types


| Data Type         |When and Why?| Example 1                    | Example 2                   | Example 3 | Example 4 | Example 5 |
| --------------- | ------------------------------ |------------------------------ |------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `String`   | | String myString = new String("Hello, world!");   | String myString2 = "Hello, world!";   |
| `ArrayList`     |for storing and accessing data | ArrayList<<String>String> cars = new ArrayList<<String>String>();   |
| `LinkedList`     |for manipulate data, Implementing a queue or a stack | LinkedList<<String>String> tractors = new LinkedList<<String>String>(); |
| `HashMap`     | storing user information with their unique user IDs as keys | HashMap<String, String> capitals = new HashMap<String, String>();   |
| `HashSet`     |keeping a set of unique tags associated with a blog post| HashSet<<String>String> cars = new HashSet<<String>String>();   |      
| `Array`     | | String[] myCars = {"Volvo", "BMW", "Ford", "Mazda"};   | String[] myPhones = new String[10]; | int[] myNumbers = {10, 20, 30, 40}; | String[][] myLovers = new String[3][5]; | String[][] myGames = { {"The Witcher 3: Wild Hunt", "Gta 5", "Forza Horizon 5", "60 Seconds"}, {"Brawl Stars", "Clash Of Clans", "Clash Royale"} };|
| `Vector` | | Vector<<String>String> cars = new Vector<<String>String>(); |

#### [🔙GO TO Table of Contents](#table-of-contents)
## 2 - Type conversion

### 2.1 - Primitive Data Types and String

####  `floating point number` to `int`

```java
int myNumber = (int) 10.9; //converted to 10
```

#### `boolean` to `int`

```java
boolean myCondition = false;
int myNumber = myCondition ? 1: 0; //converted to 1 or 0
```

#### `int` to `boolean`

```java
int myInt = 0;
boolean myBoolean = (myInt == 1) ? true : false;
```

#### `char` to `int`

```java
char myChar = 't';
int myNumber = (int) myChar; // converted to 116
```
#### `int` to `char`

```java
int myInt = 65; // ASCII code for 'A'
char myChar = (char) myInt;
```

#### `char` to `String`

```java
char myChar = 't';
String myString = "" + myChar;
```

```java
char myChar = 't';
String myString = String.valueOf(myChar);
```

```java
char myChar = 't';
String myString = Character.toString(myChar);
```

#### `String` to `char`

```java
String myString = "Hello";
char myChar = myString.charAt(0);
```

#### `int` to `String`

```java
int myInt = 10;
String myString  = Integer.toString(myInt);
```

```java
int myInt = 10;
String myString  = String.valueOf(myInt);
```

```java
int myInt = 10;
String myString  = "" + myInt;
```

```java
int myInt = 10;
String myString  = String.format("%02d", myInt);
```

#### `String` to `int`

```java
String myString = "10";
int myInt  = Integer.parseInt(myString);
```

```java
String myString = "10";
int myInt  = Integer.valueOf(myString);
```

#### 2.2 -  Array and String

#### `String` to `Array (char)`

```java
String myString = "Hello";
char[] myCharArray = myString.toCharArray();
```

#### `Array (char)` to `String`

```java
char[] myCharArray = {'H','e','l','l','o'};
String myString = new String(myCharArray);
```

#### 2.3 - Array and List

#### `Array` to `ArrayList`

```java
String[] myStringArray = {"apple", "banana", "orange"};
List<String> myArrayList = new ArrayList<>();
for (String element : myStringArray) {
myArrayList.add(element);
}
```

```java
String[] myStringArray = {"apple", "banana", "orange"};
List<String> myArrayList = new ArrayList<>(Arrays.asList(myStringArray));
```


#### `ArrayList` to `Array`

```java
ArrayList<String> myArrayList = new ArrayList<String>();
myArrayList.add("apple");
myArrayList.add("banana");
myArrayList.add("orange");

String[] myStringArray = new String[myArrayList.size()];

myStringArray = myArrayList.toArray(myStringArray);
System.out.println("Array: " + Arrays.toString(myStringArray));
```
#### [🔙GO TO Table of Contents](#table-of-contents)

## 3 - Practice Data Types (1 points / %1)
`Copy Code and Paste it in main method`
```
//Create a variable in byte data type with max value.
//Create a variable in byte data type with min value.
//Create a variable in short data type with max value.
//Create a variable in short data type with min value.
//Create a variable in int data type with max value.
//Create a variable in int data type with min value.
//Create a variable in float data type with max value.
//Create a variable in float data type with min value.
//Create a variable in double data type with max value.
//Create a variable in double data type with min value.
//Create a variable in long data type with max value.
//Create a variable in long data type with min value.
//Create a variable in char data type with Different Values (Values Depends on You).
//Create two variables in boolean data type to store values with different values.
```
#### [🔙GO TO Table of Contents](#table-of-contents)

## 4 - Default Values of Data Types in Java

### 4.1 - Default Values of Non-Primitive Data Types
```
The default value of any Object is null
```
### 4.2 - Default Values of Primitive Data Types
```
boolean -> false

byte, char, short, int, long -> 0

float, double -> 0.0
```
#### [🔙GO TO Table of Contents](#table-of-contents)

## 5 - Practice Type Conversion (5 points / %5)
### 5.1 - Primitive Data Types and String

####  5.1.1 `floating point number` to `int`

```java
Convert 10.9 to int
```

#### 5.1.2 `boolean` to `int`

```java
Convert boolean to int (1 represents true, 0 represents false)
```

#### 5.1.3 `int` to `boolean`

```java
Convert int to boolean (1 represents true, 0 represents false)
```

#### 5.1.4 `char` to `int`

```java
Create a variable in char typed with 't' value and convert it int.
```
#### 5.1.5 `int` to `char`

```java
Create int typed variable with value 65 and convert it char.
```

#### 5.1.6 `char` to `String`

```java
//It has 3 solutions.
Create a variable in char typed with 't' value and convert it String.
```

#### 5.1.7 `String` to `char`

```java
Create a String with Hello value and convert it char.
```

#### 5.1.8 `int` to `String`

```java
//It has 4 solutions.
Create int typed variable with value 10 and convert it String.
```

#### 5.1.9 `String` to `int`

```java
//It has 2 solutions.
Create String typed variable with value 10 and convert it int.
```

#### 5.2 -  Array and String

#### 5.2.1 `String` to `Array (char)`

```java
Create a String with Hello value and convert it char array.
```

#### 5.2.2 `Array (char)` to `String`

```java
Create a char array with letters of Hello and convert it String.
```

#### 5.3 - Array and List

#### 5.3.1 `Array` to `ArrayList`

```java
//It has 2 solutions.
Create a String array with apple, banana, orange values and convert it ArrayList.
```


#### 5.3.2 `ArrayList` to `Array`

```java
Create a String ArrayList with apple, banana, orange values and convert it array.
```
#### [🔙GO TO Table of Contents](#table-of-contents)

## 6 - User Input (Scanner)

#### 6.1 - Import Scanner
```
import java.util.Scanner;
```

#### 6.2 - Create Scanner Object
```
Scanner read = new Scanner(System.in);
```

#### 6.3 - Read Values from Keyboard Using Scanner Object
```Java
import java.util.Scanner;  // Import the Scanner class

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username, lastname and school: ");

	    String userName = read.nextLine();  // Read  Line
	    String lastName = read.next(); // Read Next Value
	    String schoolName = read.next();
	    
	    System.out.println("Username is: " + userName);  // Output user input
	    System.out.println("Lastname is: " + lastName);
	    System.out.println("School name is: " + schoolName);

	}

}
```

#### [🔙GO TO Table of Contents](#table-of-contents)

## 6 - User Input (Scanner)

#### [🔙GO TO Table of Contents](#table-of-contents)