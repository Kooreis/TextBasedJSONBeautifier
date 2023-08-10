```java
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JsonBeautifier {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder jsonInput = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                jsonInput.append(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
            System.exit(1);
        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(jsonInput.toString());
        String prettyJsonString = gson.toJson(je);
        System.out.println(prettyJsonString);
    }
}
```

Please note that this code requires the Gson library. You can add it to your project using Maven or Gradle. Here is the Maven dependency:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.6</version>
</dependency>
```