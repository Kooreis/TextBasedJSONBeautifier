```CSharp
using System;
using Newtonsoft.Json;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter JSON text:");
        string jsonInput = Console.ReadLine();
        try
        {
            var parsedJson = JsonConvert.DeserializeObject(jsonInput);
            string beautifiedJson = JsonConvert.SerializeObject(parsedJson, Formatting.Indented);
            Console.WriteLine("Beautified JSON:");
            Console.WriteLine(beautifiedJson);
        }
        catch (Exception)
        {
            Console.WriteLine("Invalid JSON");
        }
    }
}
```