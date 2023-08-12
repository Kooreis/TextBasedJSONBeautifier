def beautify_json(json_string):
    parsed_json = json.loads(json_string)
    return json.dumps(parsed_json, indent=4, sort_keys=True)