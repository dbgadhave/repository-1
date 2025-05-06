Feature: I am doing automation functionality of Add Jobs in Orange HRM application
	
Background: Common steps
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: Create SKills Record
    And Log into Application with below credentials
    			|Admin|admin123|
    Then Creted Skills Record
					|Sales200|Sales200 descr|
					|Sales210|Sales210 descr|
					|Sales220|Sales220 descr|
    When Click on logout button
    Then Close Browser