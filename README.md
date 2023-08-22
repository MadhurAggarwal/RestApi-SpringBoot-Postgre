# RestApi-SpringBoot-Postgre

# About
This is an Assignment for LiveEasy Logistics 
I've used Spring-Boot and Maven to create RestApi
The App connects to the Postgresql Database.

# To Run
Clone the Repository
Open it (ensure you have maven installed). The dependencies specified in "springrest/pom.xml" will automatically install
After the dependencies are installed, you can either:
1. Run the outermost springrest folder as a Spring Boot App in STS
2. Or, Run java file: "springrest/src/main/java/com/springrest/springrest/SpringrestApplication.java"

# Ports & other configurations
The App would send requests on port 8082.
Change the port to whatever is required by specifying it in server.port value at top of the "springrest/src/main/resources/application.properties" file
The App expects a Postgresql localhost server running on port 5432 
Change the Database Name, username and password to required values, in the same file to your Postgresql values.
In this same file, the field: "spring.jpa.hibernate.ddl-auto" is specified as update, which means it will retain old values stored in the table with this name, if any such table is present before. Set its value to create to create a new table everytime the app is run.

# Rest Api Mapping:
The Api's are as follows: 
In the file: "springrest/src/main/java/com/springrest/springrest/controller/MyController.java"

## 1. GET Mapping "localhost:8082/allloads"
This would return all load values present in the load table of liveeasy_logistics database
Example: 
```
[
    {
        "loadingPoint": "california",
        "unloadingPoint": "silicon-valley",
        "productType": "iphones",
        "truckType": "siliconTransport",
        "noOfTrucks": 7,
        "weight": 120,
        "comment": "",
        "shipperId": 400,
        "loadId": 92,
        "date": "14-06-2024"
    },
    {
        "loadingPoint": "delhi",
        "unloadingPoint": "jaipur",
        ....
    },
 ....
] ```

## 2. GET "localhost:8082/load?shipperId=145"
This is request mapping using the query paramter. It returns a list of all loads with specified shipper Id
Example: ```
[
    {
        "loadingPoint": "delhi",
        "unloadingPoint": "jaipur",
        "productType": "chemicals",
        "truckType": "canter",
        "noOfTrucks": 1,
        "weight": 100,
        "comment": "",
        "shipperId": 145,
        "loadId": 23,
        "date": "22-08-2023"
    },
    {
        "loadingPoint": "mumbai",
        "unloadingPoint": "delhi",
        "productType": "snacks",
        "truckType": "indian",
        "noOfTrucks": 2,
        "weight": 150,
        "comment": "",
        "shipperId": 145,
        "loadId": 47,
        "date": "01-02-2022"
    }
] ```
## 3. GET "localhost:8082/load/92"
This would return single load with unique Id specfied.
Example: ```
{
    "loadingPoint": "california",
    "unloadingPoint": "silicon-valley",
    "productType": "iphones",
    "truckType": "siliconTransport",
    "noOfTrucks": 7,
    "weight": 120,
    "comment": "",
    "shipperId": 400,
    "loadId": 92,
    "date": "14-06-2024"
} ```

## 4. POST "localhost:8082/load"
This adds the data from the raw json body of the query to the database
Example: ```
{
    "loadingPoint": "jalandhar",
    "unloadingPoint": "ludhiana",
    "productType": "books",
    "truckType": "american",
    "noOfTrucks": 5,
    "weight": 15,
    "comment": "",
    "shipperId": 147,
    "loadId": 11,
    "date": "23-04-2021"
} ```

## 5. PUT "localhost:8082/load/93"
It updates the value of the specified load.
(Load Id may not be provided in the raw json body, it will get it from link)
If date is not specified, it takes current date as default.
Also, if load with given ID does not exists, it will simply add it.
Example: ```
{
    "loadingPoint": "paris",
    "unloadingPoint": "china",
    "productType": "paintings",
    "truckType": "davinciTrucks",
    "noOfTrucks": 5,
    "weight": 420,
    "comment": "",
    "shipperId": 111,
    "loadId": 93,
    "date": "25-12-2020"
} ```

## 6. DELETE "localhost:8082/load/93"
This will delete the load with the given Id.

