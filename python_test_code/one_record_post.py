#!/usr/bin/env python
# coding: utf-8

# In[12]:


# post a bunch product 
import requests
import json
# !!! one record used here !!!
url = "http://localhost:8081/companies/test1234/los"
num_products = 5
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

for x in range(num_items):
    response = requests.request("POST", url, headers=headers, data=payload)


# post a bunch of items
# !!! one record used here !!!
url = "http://localhost:8081/companies/test1234/los"
num_items = 5

payload = json.dumps({
  "@context": {
    "iata": "https://onerecord.iata.org/"
  },
  "@type": "iata:Item",
  "iata:item:dimensions": {
    "@id": "iata:Dimensions/thisObjectId",
    "@type": "iata:Dimensions"
  },
  "iata:item:isInPiece": {
    "@id": "iata:Piece/thisObjectId",
    "@type": "iata:Piece"
  },
  "iata:item:otherIdentifiers": {
    "@id": "iata:OtherIdentifier/thisObjectId",
    "@type": "iata:OtherIdentifier"
  },
  "iata:item:product": {
    "@id": "iata:Product/thisObjectId",
    "@type": "iata:Product"
  },
  "iata:item:productionCountry": {
    "@id": "iata:Country/thisObjectId",
    "@type": "iata:Country"
  },
  "iata:item:quantity": {
    "@id": "iata:Value/thisObjectId",
    "@type": "iata:Value"
  },
  "iata:item:targetCountry": {
    "@id": "iata:Country/thisObjectId",
    "@type": "iata:Country"
  },
  "iata:item:unitPrice": {
    "@id": "iata:Value/thisObjectId",
    "@type": "iata:Value"
  },
  "iata:item:weight": {
    "@id": "iata:Value/thisObjectId",
    "@type": "iata:Value"
  },
  "iata:item:batchNumber": "string",
  "iata:item:lotNumber": "string",
  "iata:item:productExpiryDate": "dateTime",
  "iata:item:productionDate": "dateTime",
  "iata:item:quantityForUnitPrice": "double"
})
headers = {
  'Content-Type': 'application/ld+json'
}
for x in range(num_items):
    response = requests.request("POST", url, headers=headers, data=payload)
print(response.text)


# post a bunch of locations
# !!! one record used here !!!
url = "http://localhost:8081/companies/test1234/los"
num_locations = 5

payload = json.dumps({
  "@context": {
    "iata": "https://onerecord.iata.org/"
  },
  "@type": "iata:SensorGeoloc",
  "iata:sensorGeoloc:val": {
    "@id": "iata:MeasurementsGeoloc/thisObjectId",
    "@type": "iata:MeasurementsGeoloc"
  }
})
headers = {
  'Content-Type': 'application/ld+json'
}
for x in range(num_items):
    response = requests.request("POST", url, headers=headers, data=payload)
print(response.text)





