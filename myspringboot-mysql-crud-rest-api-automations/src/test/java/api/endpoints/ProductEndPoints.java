package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.Product;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//ProductEndPints.java
// Created for perform Create, Read, Update, Delete requests  the product API.

public class ProductEndPoints {

	public static Response createProduct(Product payload) {
		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.post(Routes.post_url);

		return response;
	}

	public static Response readProduct(int id) {
		Response response = given().pathParam("id", id).when().get(Routes.get_url);

		System.out.println("============================");
		
		System.out.println(response);
		
		return response;
	}

	public static Response updateProduct(int id, Product payload) {
		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON)
				.pathParam("id", id).body(payload).when().put(Routes.update_url);

		return response;
	}

	public static Response deleteProduct(Double price) {
		Response response = given().pathParam("price", price).when().delete(Routes.delete_url);

		return response;
	}

}
