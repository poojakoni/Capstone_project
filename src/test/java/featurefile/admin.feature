Feature: Login Feature Scenario

Background: 
Given I have launched the application

@test
Scenario: This scenario is to login as admin and managing product and creating new medicine Category 
When i clcik on login link
When i enter the correct username and password
And i clcik on login Button
And i click on manage product 
And in product management page i enter Name and Brand name and Discription and Unit price and Quantity 
And i upload file regards product
And i click on add new Category 
And i enter new productname and Discription  and i will save the product Category 
And click on save button
And i clcik on ViewProduct to recheck the new category