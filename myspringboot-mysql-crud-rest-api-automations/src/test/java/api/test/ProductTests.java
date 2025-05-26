package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.ProductEndPoints;
import api.payload.Product;
import io.restassured.response.Response;

public class ProductTests {

	Faker faker;
	Product productPayload;

	public Logger logger; // for logs

	@BeforeClass
	public void setup() {
		faker = new Faker();
		productPayload = new Product();

		productPayload.setId(faker.idNumber().hashCode());
		productPayload.setName(faker.commerce().productName());
		productPayload.setColor(faker.color().name());
		// productPayload.setPrice(faker.commerce().price());
		productPayload.setPrice(faker.number().randomDouble(2, 100, 1000));

		// logs
		logger = LogManager.getLogger(this.getClass());

		logger.debug("debugging.....");

	}

	@Test(priority = 1)
	public void testPostProduct() {
		logger.info("********** Creating Product  ***************");
		Response response = ProductEndPoints.createProduct(productPayload);
		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);

		logger.info("**********Product is creatged  ***************");

	}

	@Test(priority = 2)
	public void testGetProductByid() {
		System.out.println("********** Reading Product Info ***************");

		logger.info("********** Reading Product Info ***************");

		Response response = ProductEndPoints.readProduct(this.productPayload.getId());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);

		logger.info("**********Product info  is displayed ***************");

	}

	@Test(priority = 3)
	public void testUpdateProductById() {
		logger.info("********** Updating Product ***************");

		// update data using payload
		productPayload.setName(faker.commerce().productName());
		productPayload.setColor(faker.color().name());
		// productPayload.setPrice(faker.commerce().price());
		productPayload.setPrice(faker.number().randomDouble(2, 100, 1000));

		Response response = ProductEndPoints.updateProduct(this.productPayload.getId(), productPayload);
		response.then().log().body();

		Assert.assertEquals(response.getStatusCode(), 200);

		logger.info("********** Product updated ***************");
		// Checking data after update
		Response responseAfterupdate = ProductEndPoints.readProduct(this.productPayload.getId());
		Assert.assertEquals(responseAfterupdate.getStatusCode(), 200);

	}

	@Test(priority = 4)
	public void testDeleteProductByName() {
		logger.info("**********   Delete Product  ***************");

		Response response = ProductEndPoints.deleteProduct(this.productPayload.getPrice());
		Assert.assertEquals(response.getStatusCode(), 200);

		logger.info("********** Product deleted ***************");
	}

}
