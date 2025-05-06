package runner;
	
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

@RunWith(JUnitPlatform.class)
@IncludeTags(value= {"FunctionalTest"})
@ExcludeTags(value= {"SmokeTest | RegressionTest | End2End"})
public class testrunner5 {
    
}


//https://www.youtube.com/watch?v=2YBEFV4DFxo
//https://junit.org/junit5/docs/snapshot/user-guide/
//https://junit.org/junit5/docs/snapshot/user-guide/#running-tests

//https://junit.org/junit5/docs/snapshot/user-guide/#running-tests-tags
//https://junit.org/junit5/docs/snapshot/user-guide/#running-tests-tag-expressions
//https://junit.org/junit5/docs/snapshot/user-guide/#running-tests-tag-expressions

//@IncludeTags(value= {"SmokeTest | RegressionTest"}) 
//@IncludeTags(value= {"SmokeTest & RegressionTest"})

//@IncludeTags(value= {"FunctionalTest & !SmokeTest"}) 
//Execute all tests of the feature tagged as @FunctionalTest but skip scenarios tagged as @SmokeTest


//@IncludeTags(value= {"!SmokeTest"}) 
//@ExcludeTags(value= {"SmokeTest | RegressionTest"})

//@IncludeTags(value= {"FunctionalTest"}) 
//@IncludeTags(value= {"FunctionalTest & !(SmokeTest|RegressionTest|End2End)"}) 
//@ExcludeTags(value= {"SmokeTest | RegressionTest | End2End"})
//Execute all tests other than SmokeTest | RegressionTest | End2End

//@IncludeTags(value= {"FunctionalTest"})
//@ExcludeTags(value= {"SmokeTest | RegressionTest | End2End"})


/*
 Execute all tests tagged as @SmokeTests
 Execute all tests tagged as @End2End
 Execute all tests of a Feature tagged as @FunctionalTest
 @SmokeTest OR @RegressionTest.
 @SmokeTest AND @RegressionTest
 Execute all tests of the feature tagged as @FunctionalTest but skip scenarios tagged as @SmokeTest
 Execute all tests which are not at all tagged in all the Features
 
 
 
 */






