package seleniumDay21_ParametDataProvider;

import org.testng.annotations.DataProvider;

public class AllDataProviders {
	 @DataProvider(name="loginData")
		public static Object[][] Data()		//Object[][] is return tyoe if dataprovider
	  	{									//Below are the all test case data to be checked.
		  Object[][] obj= {{"",""},{"kiran@gmail.com",""},{"","123456"},{"kiats@Yajoo.com","54318488"},{"kiran@gmail.com","123456"}};
		  return obj;
		}

}
