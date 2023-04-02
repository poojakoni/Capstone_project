$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featurefile/API.feature");
formatter.feature({
  "name": "To perform API calls",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To perform the most-viewed products call",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The base URI is \"http://localhost:8080/medicare/json/data/mv/products\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.API_stepdef.the_base_URI_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I perform the Get operation",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.API_stepdef.i_perform_the_Get_operation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Response code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.API_stepdef.response_code_should_be(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "UI displays the corresponding products",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.API_stepdef.ui_displays_the_corresponding_products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/featurefile/admin.feature");
formatter.feature({
  "name": "Login Feature Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to login as admin and managing product and creating new medicine Category",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "i clcik on login link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.Adminpage.i_clcik_on_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter the correct username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.Adminpage.i_enter_the_correct_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i clcik on login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Adminpage.i_clcik_on_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on manage product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Adminpage.i_click_on_manage_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "in product management page i enter Name and Brand name and Discription and Unit price and Quantity",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Adminpage.in_product_management_page_i_enter_Name_and_Brand_name_and_Discription_and_Unit_price_and_Quantity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i upload file regards product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Adminpage.i_upload_file_regards_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on add new Category",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Adminpage.i_click_on_add_new_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter new productname and Discription  and i will save the product Category",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Adminpage.i_enter_new_productname_and_Discription_and_i_will_save_the_product_Category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Adminpage.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i clcik on ViewProduct to recheck the new category",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Adminpage.i_clcik_on_ViewProduct_to_recheck_the_new_category()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/featurefile/database.feature");
formatter.feature({
  "name": "Add Category and Check Database Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new category, verify it\u0027s added in the database, remove the new category",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I login as an admin",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.database_stepdef.i_login_as_an_admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Manage Product i will land product manage page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.database_stepdef.i_click_on_Manage_Product_i_will_land_product_manage_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add New Category button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.database_stepdef.i_click_on_Add_New_Category_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Name",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.database_stepdef.i_enter_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Description",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.database_stepdef.i_enter_Description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.database_stepdef.i_click_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the new category is added to the database",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.database_stepdef.i_verify_the_new_category_is_added_to_the_database()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/featurefile/medicare.feature");
formatter.feature({
  "name": "Login Feature Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_have_launched_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the sign up and login and order prodcut and payment.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "i clcik on sign up link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_clcik_on_sign_up_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter the firstname and lastname and email and contactno and password and confirm passowrd  and select role as user in radio button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_enter_the_firstname_and_lastname_and_email_and_contactno_and_password_and_confirm_passowrd_and_select_role_as_user_in_radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i clcik on next-billing Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_clcik_on_next_billing_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter the addresslineone and addresslinetwo  and city  and postal code  and state as  and country as",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_enter_the_addresslineone_and_addresslinetwo_and_city_and_postal_code_and_state_as_and_country_as()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on next-confirm button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_click_on_next_confirm_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on confirm button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_click_on_confirm_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on Login Here button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_click_on_Login_Here_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the username and password as",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_enter_the_username_and_password_as()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i clcik on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_clcik_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select product and clcik on view product",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_select_product_and_clcik_on_view_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i clcik on addcart Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_clcik_on_addcart_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i clcik on checkout Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_clcik_on_checkout_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clcik on saved address detilas",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_clcik_on_saved_address_detilas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter card no  and expmonth and expyear and cvv",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_enter_card_no_and_expmonth_and_expyear_and_cvv()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i clcik on pay Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.Signup_page_stepdef.i_clcik_on_pay_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});