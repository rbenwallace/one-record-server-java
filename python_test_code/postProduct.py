# post a product 
import requests
import json

url = "http://localhost:8081/companies/test1234/los"

payload = json.dumps({
  "@context": {
    "iata": "https://onerecord.iata.org/"
  },
  "@type": "iata:Product",
  "iata:product:characteristics": {
    "@id": "iata:Characteristics/thisObjectId",
    "@type": "iata:Characteristics"
  },
  "iata:product:isInItems": {
    "@id": "iata:Item/thisObjectId",
    "@type": "iata:Item"
  },
  "iata:product:isInPieces": {
    "@id": "iata:Piece/thisObjectId",
    "@type": "iata:Piece"
  },
  "iata:product:manufacturer": {
    "@id": "iata:Company/thisObjectId",
    "@type": "iata:Company"
  },
  "iata:product:otherIdentifier": {
    "@id": "iata:OtherIdentifier/thisObjectId",
    "@type": "iata:OtherIdentifier"
  },
  "iata:product:commodityItemNumber": "string",
  "iata:product:hsCode": "string",
  "iata:product:hsCommodityDescription": "string",
  "iata:product:hsCommodityName": "string",
  "iata:product:hsType": "string",
  "iata:product:productDescription": "string",
  "iata:product:productIdentifier": "string"
})
headers = {
  'Content-Type': 'application/ld+json'
}

response = requests.request("POST", url, headers=headers, data=payload)

print(response.text)