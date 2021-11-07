package dwp.DWPTestAutomation;

import org.testng.annotations.Test;

import dwp.DWPTestAutomation.utils.RestAssuredBase;

public class PostApiTest extends BaseTest {
	RestAssuredBase restAssuredBase;

	public PostApiTest() {

		restAssuredBase = new RestAssuredBase();
	}

	@Test
	public void apiname_Name() {
		extentTest=extent.createTest("apiname_Name");
		restAssuredBase.post(EndPoints.endpoint1_name1, "post");
		restAssuredBase.validate200(extentTest);
		System.out.println(restAssuredBase.getReponse());
	}
	@Test
	public void apiname_Name1() {
		extentTest=extent.createTest("apiname_Name1");
		restAssuredBase.post(EndPoints.endpoint1_name1, "post");
		restAssuredBase.validate200(extentTest);
		System.out.println(restAssuredBase.getReponse());
	}

}
