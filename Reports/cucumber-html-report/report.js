$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/shopping.feature");
formatter.feature({
  "name": "Test end to end shopping of Nature Store App",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login in to the app",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have app",
  "keyword": "Given "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_have_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my account",
  "keyword": "When "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_click_on_my_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login and Register text",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.click_on_login_and_Register_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_enter_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am successfully login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_am_successfully_login()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "name");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "From Home page I should be able to select category",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_am_on_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose Category",
  "keyword": "When "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_choose_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to category page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_navigated_to_category_page()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "name");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "adding product into cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on fresh fruits product page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_am_on_fresh_fruits_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select cucumber from Ambikastore",
  "keyword": "When "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_select_cucumber_from_Ambikastore()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "shopping cart should be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.shopping_cart_should_be_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "name");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Check out",
  "description": "when I navigate to my cart",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I proceed to check out",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_proceed_to_check_out()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to shipping address",
  "keyword": "Then "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_navigated_to_shipping_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid shipping entries",
  "keyword": "When "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_enter_valid_shipping_entries()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submit the form",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.submit_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose same shipping address",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_choose_same_shipping_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose Free Shipping option",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_choose_Free_Shipping_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose Cash On delivery Payment option",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.choose_Cash_On_delivery_Payment_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete the shopping",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.complete_the_shopping()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "name");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "logout from app",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click on  account",
  "keyword": "When "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_click_on_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on logout",
  "keyword": "And "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.click_on_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be successfully log out",
  "keyword": "Then "
});
formatter.match({
  "location": "com.C2TA.natural.stepdefinitions.ShoppingSteps.i_should_be_successfully_log_out()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "name");
formatter.after({
  "status": "passed"
});
});