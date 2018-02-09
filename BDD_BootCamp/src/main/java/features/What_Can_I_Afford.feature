Feature: What can i afford Calc

@Smoke
Scenario Outline: user should be able to calculate the ideal range for buying a car

Given user navigates to the Edmunds Calculator webapp page
Then user enters "<monthly_payment>" in the what can i afford field
Then user clicks the Go button
And user is navigated to the calculators affordability
Then user enters the "<zipcode>"
Then user enters "<cash_down_payment>"
Then user clicks calculate button

	
	Examples: 
	| monthly_payment | zipcode |
	| 350 | 22042 | 5000 |
	

