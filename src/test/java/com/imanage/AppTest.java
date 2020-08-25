package com.imanage;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import io.jooby.StatusCode;
import org.junit.ClassRule;
import org.junit.Test;
import io.jooby.MockRouter;
import io.jooby.StatusCode;

/**
 * @author jooby generator
 */
public class AppTest {

  @Test
  public void integrationTest() {
    get("/")
        .then()
        .assertThat()
        .body(equalTo("Hello World!"))
        .statusCode(200)
        .contentType("text/html;charset=UTF-8");
  }

  @Test
  public void unitTest() throws Throwable {
    MockRouter router = new MockRouter(new App());
    router.get("/", rsp -> {
      assertEquals("Hello World!", rsp.value());
      assertEquals(StatusCode.OK, rsp.getStatusCode());
    });
  }

}
