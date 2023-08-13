# Python Documentation

# JSON Beautifier

This Python script is designed to take a JSON string as an input and output a beautified version of the same JSON string. The beautified JSON string is easier to read and understand as it is properly indented and the keys are sorted.

## Libraries Used

- `json`: This is a standard Python library for working with JSON data. It provides functions for parsing JSON strings, converting Python objects to JSON, and vice versa.

- `sys`: This is another standard Python library that provides access to some variables used or maintained by the Python interpreter and to functions that interact strongly with the interpreter. In this script, it is used to read command-line arguments.

## How to Use

The script is designed to be run from the command line and takes one argument - the JSON string that you want to beautify. Here is the usage:

```bash
python script.py <json_string>
```

Replace `<json_string>` with the JSON string that you want to beautify. The script will print the beautified JSON string to the console.

## Functions

- `beautify_json(json_string)`: This function takes a JSON string as an argument, parses it into a Python object, and then converts it back into a JSON string with indentation and sorted keys. The beautified JSON string is returned.

- `main()`: This is the main function that is run when the script is executed. It checks that the correct number of command-line arguments have been provided, and if so, it calls the `beautify_json()` function with the provided JSON string and prints the result. If the correct number of arguments have not been provided, it prints a usage message and exits.

## Note

This script does not handle errors that may occur if the provided JSON string is not valid. If you provide an invalid JSON string, the script will raise a `json.JSONDecodeError`.

---

# C# Documentation

# JSON Beautifier in C#

This repository contains a simple C# script that takes a JSON string as input and outputs a beautified version of the same JSON string. The script is designed to be user-friendly and easy to use, even for those who are not familiar with JSON or C#.

## Script Description

The script starts by prompting the user to enter a JSON text. It then attempts to parse the input text as JSON. If the parsing is successful, the script will output a beautified version of the JSON text. If the parsing fails (i.e., if the input text is not valid JSON), the script will output an error message.

## Imported Libraries

The script uses two libraries:

1. **System**: This is a built-in .NET library that provides fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions.

2. **Newtonsoft.Json**: This is a popular high-performance JSON framework for .NET. It is used to serialize objects to JSON and to deserialize JSON to objects. In this script, it is used to parse the input text as JSON and to beautify the parsed JSON.

## Code Explanation

```CSharp
using System;
using Newtonsoft.Json;
```
These lines import the required libraries.

```CSharp
class Program
{
    static void Main(string[] args)
    {
```
This is the main entry point of the script.

```CSharp
        Console.WriteLine("Enter JSON text:");
        string jsonInput = Console.ReadLine();
```
These lines prompt the user to enter a JSON text and read the user's input.

```CSharp
        try
        {
            var parsedJson = JsonConvert.DeserializeObject(jsonInput);
            string beautifiedJson = JsonConvert.SerializeObject(parsedJson, Formatting.Indented);
            Console.WriteLine("Beautified JSON:");
            Console.WriteLine(beautifiedJson);
        }
```
These lines attempt to parse the input text as JSON and output a beautified version of the JSON text.

```CSharp
        catch (Exception)
        {
            Console.WriteLine("Invalid JSON");
        }
    }
}
```
These lines catch any exceptions that occur during the parsing and output an error message.

---

# Java Documentation

# JSON Beautifier

This Java script is designed to beautify JSON input. It reads JSON input from the standard input, formats it in a more readable and pretty format, and then prints the result to the standard output.

## Libraries Used

The script uses the following libraries:

- **com.google.gson.Gson**: This is a Java library that can be used to convert Java Objects into their JSON representation. It can also be used to convert a JSON string to an equivalent Java object.

- **com.google.gson.GsonBuilder**: This is a builder of Gson instances. It provides a number of configuration methods such as `setPrettyPrinting()` which configures Gson to output Json that is easy to read for a human.

- **com.google.gson.JsonElement**: This is the base class for all elements of the abstract syntax tree for JSON. It can be used to parse and manipulate JSON data.

- **com.google.gson.JsonParser**: This is a parser to parse Json into a parse tree of `JsonElement`s.

- **java.io.BufferedReader**: This class reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.

- **java.io.InputStreamReader**: This class is a bridge from byte streams to character streams. It reads bytes and decodes them into characters using a specified charset.

## How to Run

To run this script, you need to have the Gson library in your classpath. If you are using Maven, you can add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.6</version>
</dependency>
```

Then, you can compile and run the script using the Java compiler (`javac`) and Java interpreter (`java`).

## Example

Here is an example of how to use this script:

1. Run the script.
2. Enter your JSON input. For example: `{"name":"John","age":30,"city":"New York"}`
3. Press `Ctrl+D` to indicate the end of the input.
4. The script will print the beautified JSON: 

```json
{
  "name": "John",
  "age": 30,
  "city": "New York"
}
```

---
