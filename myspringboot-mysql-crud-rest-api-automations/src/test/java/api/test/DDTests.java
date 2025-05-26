package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.ProductEndPoints;
import api.payload.Product;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DDTests {

	@Test(priority = 1, dataProvider = "Data", dataProviderClass = DataProviders.class)
	public void testPostuser(String productID, String productName, String color, String price) {
		Product productPayload = new Product();

		productPayload.setId(Integer.parseInt(productID));
		productPayload.setName(productName);
		productPayload.setColor(color);
		productPayload.setPrice(Double.parseDouble(price));
	 

		Response response = ProductEndPoints.createProduct(productPayload);
		Assert.assertEquals(response.getStatusCode(), 200);

	}
	
	@Test(priority = 2, dataProvider = "Productid", dataProviderClass = DataProviders.class)
	public void testDeleteProductById(String ProductID) {
		Response response = ProductEndPoints.deleteProduct(Double.parseDouble(ProductID));
		Assert.assertEquals(response.getStatusCode(), 200);

	}
 
}
