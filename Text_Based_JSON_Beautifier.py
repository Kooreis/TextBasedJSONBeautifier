```python
import json
import sys

def beautify_json(json_string):
    parsed_json = json.loads(json_string)
    return json.dumps(parsed_json, indent=4, sort_keys=True)

def main():
    if len(sys.argv) != 2:
        print("Usage: python script.py <json_string>")
        sys.exit(1)

    json_string = sys.argv[1]
    print(beautify_json(json_string))

if __name__ == "__main__":
    main()
```