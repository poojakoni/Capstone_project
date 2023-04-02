Feature: Add Category and Check Database Scenario
Background: 
Given I have launched the application

@test
Scenario: Add a new category, verify it's added in the database, remove the new category 
	Given I login as an admin
	When I click on Manage Product i will land product manage page
	And I click on Add New Category button
	Then I enter Name 
	Then I enter Description 
	Then I click Save button
	Then I verify the new category is added to the database
