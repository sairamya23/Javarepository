Feature: Adactln Functionality Validation
Background:
Given User launches the browser and hit the url
Given User enters the user name and password
|sairamya23|dhanvin@1|
Given User clicks the login button
 
Scenario: Verify login functionality of the Application
Then User verifies the page title is displayed as "AdactIn.com - Search Hotel"

Scenario: Verify if check-out date field accepts a later date than checkin date.
When User enter invalid dates 
|Location|Hotel|roomtype|noofrooms|datein|dateout|adults|children|
|Sydney|Hotel Creek|Standard|1|28/03/2020|26/03/2020|2|2|
When User clicks search button
Then User verifies if an error message is reported

Scenario: Verify if an error is reported if check-out date is the past.
When User enters the checkin and checkout date in the past 
|Location|Hotel|roomtype|noofrooms|datein|dateout|adults|children|
|Sydney|Hotel Creek|Standard|1|12/03/2020|15/03/2020|2|2|
When User clicks search button
Then User verifies if an error message is reported
@Search
Scenario: Verify if all the data in search hotel page gets matched with select hotel page
When User enters valid checkin and checkout date 
|Location|Hotel|roomtype|noofrooms|datein|dateout|adults|children|
|Sydney|Hotel Creek|Standard|1|21/04/2020|25/04/2020|2|2|
When User clicks search button
Then User verifies if the page title is "AdactIn.com - Select Hotel"
And User verifies if data in search hotel page gets matched with select hotel page

