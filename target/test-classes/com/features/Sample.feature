Feature: Learning concepts of Automation

@SearchCarsMethod1
Scenario: Starting up

Given The browser is launched
Then The user views the home screen and searches the desired car 



@SearchCarsMethod2
Scenario: Starting up

Given The browser is launched
Then The user views the home screen and searches the desired car using New Cars option 
And the user searches Audi in search field and clicks on search icon
Then The user clicks on Audi A3 car
Then The user clicks on All Specifications link of Audi A3 car
And The user clicks on images link
Then The user click on Exterior Images View All Link
	
	


 