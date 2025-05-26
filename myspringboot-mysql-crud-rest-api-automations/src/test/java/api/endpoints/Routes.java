package api.endpoints;

/* 
Swagger URI --> http://localhost:8090/swagger-ui/index.html

Create user(Post) : https://petstore.swagger.io/v2/user
Get user (Get): https://petstore.swagger.io/v2/user/{username}
Update user (Put) : https://petstore.swagger.io/v2/user/{username}
Delete user (Delete) : https://petstore.swagger.io/v2/user/{username}

*/

/**
 * 
 * 
 * This class contains endpoints
 * 
 */

public class Routes {

	public static String base_url="http://localhost:8090/product" ;
	
	//Product module
	
	public static String post_url=base_url+"/saveProduct";
    public static String get_url=base_url+"/getProduct/{id}";
    public static String update_url=base_url+"/updateProduct/{id}";
    public static String delete_url=base_url+"/deleteProductByPrice/{price}";
    
    //Store module
    
		//Here you will create Store module URL's

    // module
    		//Here you will create Any module URL's
    
    
}
