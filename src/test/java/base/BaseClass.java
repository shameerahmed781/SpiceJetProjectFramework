package base;

import org.testng.annotations.BeforeMethod;

import utilities.Utility;

import org.testng.annotations.AfterMethod;
public class BaseClass extends Utility {
 
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  driver=initializeDriver();
	  driver.get(prop.getProperty("url"));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
