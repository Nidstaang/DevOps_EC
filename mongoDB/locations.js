
db.createCollection("locations",{
    validator: {
        $jsonSchema: {
            bsonType: "object",
            required: ["id", "country", "address"]
            properties: {
                id:{
                    bsonType: "int"
                    }
                country: {
                    bsonType: "string"
                   }
                address: {
                    bsonType : "string"
                    }
                }
                
            }
      validationLEvel: "moderate"
      }
}
