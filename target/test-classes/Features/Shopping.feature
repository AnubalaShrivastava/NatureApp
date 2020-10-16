Feature: Test end to end shopping of Nature Store App

Scenario: Login in to the app
Given I have app
When I click on my account
And click on login and Register text
And I enter email
And I enter password
When I click login button
Then I am successfully login

Scenario: From Home page I should be able to select category
Given I am on Home page
When I choose Category 
Then I navigated to category page


Scenario: adding product into cart 
Given I am on fresh fruits product page
When I select cucumber from Ambikastore 
And add to cart
Then shopping cart should be updated


Scenario: Check out 
when I navigate to my cart
And I proceed to check out
Then I navigated to shipping address
When I enter valid shipping entries
And submit the form
And I choose same shipping address
And I choose Free Shipping option
And choose Cash On delivery Payment option
And complete the shopping

Scenario: logout from app
When I click on  account
And click on logout
Then I should be successfully log out



