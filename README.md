# Post Application

- ## Frameworks and Language used
  - #### Spring Boot Framework
  - #### Java language
- ## Data Flow
  - ### PostController
     - ##### _addPost( )_   
     - ##### _getPost( )_       
     - ##### _setPost( )_          

   - ### PostService
     - ##### _addPost( )_  
     - ##### _getPost( )_ 
 
   - ### PostRepository
     - ##### _findAll( )_
     - ##### _save( )_

- ## Database Used
  - #### MySQL Database : dbpost
  
- ## Project Summary
  In this project we have created a model namely; Post. We have provided two endpoints and also in this section below we have given our API. Using this API we can perform the GET and POST operations accordingly.
  
  
  > http://15.207.22.94/:8080/api/v1/
  
  End Points:
    - ##### /add-post  
   
    - ##### /get-post
    
    We can also hit the swagger link as given below to get an interface which will provide us all the endpoints :
    > http://15.207.22.94:8080/swagger-ui/index.html
