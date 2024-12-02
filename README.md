How to instructions :

Set up:
1) Install Eclipse IDE with Spring Tool Suite
2) Clone the repository - https://github.com/abhishek-2588/teleport-stngapi
3) Import the project in your IDE.

Run:
For running the application in local, simply Run-As Spring Boot Application
For deploying the changes to cloud(Google App Engine) - 
mvn clean package app-engine:deploy

Test the application: 
Localy Running Application-
Hit the GET endpoint directly on the browser: http://localhost:8080/stngapi/v1/next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2018-11-20T19:29:32&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBoxLogistics&customer_slug=redbox-logistics
Or You can use Postman also

Deployed application: https://macro-campaign-443507-s8.uc.r.appspot.com/stngapi/v1/next-tracking-number?origin_country_id=MY&destination_country_id=ID&weight=1.234&created_at=2018-11-20T19:29:32&customer_id=de619854-b59b-425e-9db4-943979e1bd49&customer_name=RedBoxLogistics&customer_slug=redbox-logistics
