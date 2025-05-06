package STEPS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;

@Given("User launch chrome browser")
public void user_launch_chrome_browser() {

	driver=new ChromeDriver();
	driver.manage().window().maximize();

}


@When("User opens URL {string}")
public void user_opens_url(String TestURL) {

driver.get(TestURL);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


}


@When("User enters username as {string} and password as {string}")
public void user_enters_username_as_and_password_as(String UserName, String PassWord) {

	driver.findElement(By.name("username")).sendKeys(UserName);
	  driver.findElement(By.name("password")).sendKeys(PassWord);
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

}



@Then("Go to Skill Page")
public void go_to_skill_page() {

	 driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("	//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();


}



@When("Add skills with skillname as {string} and skilldescription as {string}")
public void add_skills_with_skillname_as_and_skilldescription_as(String SkillName, String SkillDescr) {

	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr);
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	

}



@When("Click on logout button")
public void click_on_logout_button() {

}


@Then("Close Browser")
public void close_browser() {

driver.close();
	
}


@Then("Go to Natioanlity Page")
public void go_to_natioanlity_page() {
	
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
	  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		
}


@When("Add Nationality as {string}")
public void add_nationality_as(String NationalityText) throws InterruptedException {
	
	
	 driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(NationalityText);
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	 Thread.sleep(5000);

}
	
	



@When("Log into Application with below credentials")
public void log_into_application_with_below_credentials(io.cucumber.datatable.DataTable dataTable) {
   
	
	
	String username=dataTable.cell(0, 0);
	String password=dataTable.cell(0, 1);
	
	 driver.findElement(By.name("username")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	
	
	
}



@Then("Creted Skills Record")
public void creted_skills_record(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

	
	List<List<String>> SkillsData=dataTable.cells();
	
	for(int i=0;i<SkillsData.size();i++) {  //0<3,1<3,2<3,3<3
		
		String SkillName=SkillsData.get(i).get(0);  //0,0
		String SkillDescr=SkillsData.get(i).get(1); //0,1
		
		 driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		  driver.findElement(By.xpath("	//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();

		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr);
		 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		

		  Thread.sleep(5000);
		
		}
	
	
	
	
	
}














}
