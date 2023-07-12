# Peach State Euro Backend
  This is a simple Spring backend application built for the Peach State Euro frontend. This application can be modified or used as an example to meet other api needs. 

  ## Libraries/Frameworks
  [<img src="https://4.bp.blogspot.com/-9kYSwCDRbms/W-qSUvwnFWI/AAAAAAAAEsE/j4EeFEPQHBc-QpxMV9l3gQAaLAuG2WhTgCLcBGAs/s1600/spring-framework.png" width="100"/>](https://spring.io/projects/spring-framework)
  
  [<img src="https://www.drupal.org/files/project-images/logo_191.png" width="100"/>](https://cloudinary.com)

  <img src="https://d1.awsstatic.com/asset-repository/products/amazon-rds/1024px-MySQL.ff87215b43fd7292af172e2a5d9b844217262571.png" width="100"/>

  ## Requirements
  - MySql Database
  - Cloudinary Account
    
  ## Docker Hub Instruction for Windows
  **Be sure to update the application.properties file with your database credentials**
  1. Run the following commands in your terminal:
  ```
  ./mvnw clean package
  docker build -t [image name] .
  ```
  2. Open Docker Hub and click on Images.
  3. Click run on the Image that was created in the previous step.
  4. Select Optional Setting
  5. Enter container name
  6. Enter 8083 for host port
  7. Select Run
  
