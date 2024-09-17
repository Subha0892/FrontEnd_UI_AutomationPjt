Feature: Subscription Feature

Scenario Outline: To verify the subscription package type and price for each country 
	Given User is on Subscribe Page
	When User selects the "KSA" location at the right top of the page
  Then User should be able to see "<PlanType>" having "<Cost>" per month
	
Examples:
    |PlanType |Cost  |
    |Lite     |15 SAR|
    |Classic  |25 SAR|
    |Premium  |60 SAR|
    
	Scenario Outline: To verify the subscription package type and price for each country 
	Given User is on Subscribe Page
	When User selects the "Kuwait" location at the right top of the page
  Then User should be able to see "<PlanType>" having "<Cost>" per month
	
Examples:
    |PlanType |Cost   |
    |Lite     |1.2 KWD|
    |Classic  |2.5 KWD|
    |Premium  |4.8 KWD|
    
  Scenario Outline: To verify the subscription package type and price for each country 
	Given User is on Subscribe Page
	When User selects the "Bahrain" location at the right top of the page
  Then User should be able to see "<PlanType>" having "<Cost>" per month
	
Examples:
    |PlanType |Cost |
    |Lite     |2 BHD|
    |Classic  |3 BHD|
    |Premium  |6 BHD|