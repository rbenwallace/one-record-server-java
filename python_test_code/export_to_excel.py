

# export all from mongoDB
import json
import csv
from pymongo import MongoClient
if __name__ == '__main__':
    client = MongoClient("mongodb+srv://iata:Onerecord!@cluster0-pzdav.mongodb.net/testdb1?retryWrites=true&w=majority")
    db=client.testdb1
    collection=db['logisticsObject']
    cursor = collection.find({})
    list_json = list(cursor)


# export data to excel

with open('dict.csv', 'w') as csv_file:  
    writer = csv.writer(csv_file)
    # write items
    writer.writerow(['item_id','item_product_name','item_quantity','event'])
    for document in list_json:
      if document['_class'] == 'org.iata.cargo.model.Item':
        writer.writerow([document['_id'].split('los/', 1)[1],document['properties']['https://onerecord-DOTiata-DOTorg/item:product'],
                       document['properties']['https://onerecord-DOTiata-DOTorg/item:quantity'],'event'+document['_id'].split('Item', 1)[1]])
    # write products
    writer.writerow([])
    writer.writerow(['product_id','item_product_name'])
    for document in list_json:
      if document['_class'] == 'org.iata.cargo.model.Product':
        writer.writerow([document['_id'].split('los//', 1)[1],document['properties']['https://onerecord-DOTiata-DOTorg/product:productIdentifier']])
    # write locations
    writer.writerow([])
    writer.writerow(['location_id','location_name'])
    for document in list_json:
      if document['_class'] == 'org.iata.cargo.model.SensorGeoloc':
        writer.writerow([document['_id'].split('los/', 1)[1],document['properties']['https://onerecord-DOTiata-DOTorg/sensorGeoloc:val']])
    






