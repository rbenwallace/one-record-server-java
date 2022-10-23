# product item number and item name
import requests
import json
import csv


url = "http://localhost:8081/companies/test1234/los/Product_191339"

payload = ""
headers = {
  'Content-Type': 'application/json'
}

response = requests.request("GET", url, headers=headers, data=payload)

print(response.text)

y = json.loads(response.text)

with open('dict.csv', 'w') as csv_file:  
    writer = csv.writer(csv_file)
    for key, value in y.items():
       if key == 'https://onerecord.iata.org/product:commodityItemNumber' or key == 'https://onerecord.iata.org/product:hsCommodityName':
        key_split = key.split('product:', 1)
        writer.writerow([key_split[1], value])