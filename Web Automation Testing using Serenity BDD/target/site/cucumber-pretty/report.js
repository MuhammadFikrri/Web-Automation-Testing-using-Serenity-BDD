$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddToChart.feature");
formatter.feature({
  "line": 2,
  "name": "Feature check out",
  "description": "",
  "id": "feature-check-out",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddToChart"
    }
  ]
});
formatter.before({
  "duration": 4852862300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#    Scenario: Normal login"
    },
    {
      "line": 5,
      "value": "#      Given User open the website sauce demo"
    },
    {
      "line": 6,
      "value": "#      When User input \"standard_user\" as userName and input \"secret_sauce\" as password"
    },
    {
      "line": 7,
      "value": "#      And User pick item Sauce Labs Backpack"
    },
    {
      "line": 8,
      "value": "#"
    },
    {
      "line": 9,
      "value": "#    Scenario: Sort Product and Add Product To Cart"
    },
    {
      "line": 10,
      "value": "#      Given User open the website sauce demo"
    },
    {
      "line": 11,
      "value": "#      When User input \"standard_user\" as userName and input \"secret_sauce\" as password"
    },
    {
      "line": 12,
      "value": "#      Then User already on landing page"
    },
    {
      "line": 13,
      "value": "#      And User sort product by \"Price (low to high)\" as sortBy"
    },
    {
      "line": 14,
      "value": "#      And User pick item Sauce Labs Backpack"
    },
    {
      "line": 15,
      "value": "#"
    },
    {
      "line": 16,
      "value": "#  Scenario Outline: Invalid Login"
    },
    {
      "line": 17,
      "value": "#    Given User open website saucedemo"
    },
    {
      "line": 18,
      "value": "#    When User input \"\u003cusername\u003e\" as userName and input \"\u003cpassword\u003e\" as password"
    },
    {
      "line": 19,
      "value": "#    Then User see error \"\u003cerrorMessage\u003e\" on login page"
    },
    {
      "line": 20,
      "value": "#    Examples:"
    },
    {
      "line": 21,
      "value": "#      | username | password | errorMessage                                                              |"
    },
    {
      "line": 22,
      "value": "#      | dicky    | 123      | Epic sadface: Username and password do not match any user in this service |"
    },
    {
      "line": 23,
      "value": "#      | dicky    |          | Epic sadface: Password is required                                        |"
    },
    {
      "line": 24,
      "value": "#      |          | 123      | Epic sadface: Username is required                                        |"
    }
  ],
  "line": 26,
  "name": "Checkout Product",
  "description": "",
  "id": "feature-check-out;checkout-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "User open website saucedemo",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User already on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User sort product by \"Name (Z to A)\" as sortBy",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User checkout \"Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red)\" as products to cart",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User click on checkout icon",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User verify that \"Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red)\" as products in a list",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User remove \"Test.allTheThings() T-Shirt (Red)\" as products in a list",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User click checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User already on Checkout: Your Information",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User input \"Muhammad\" as First Name , input \"Fikri\" as Last Name and input \"10020\" as Zip/Postal Code",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "User already on Checkout: Overview Page",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "User verify that \"Sauce Labs Onesie\" as products in payment list",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "User verifies the price of goods according to the price displayed",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User already on Checkout: Complete!",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 222109900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 209496600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3060054600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 22
    }
  ],
  "location": "PurchaseSteps.sortProduct(String)"
});
formatter.result({
  "duration": 3091446100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red)",
      "offset": 15
    }
  ],
  "location": "PurchaseSteps.addProductToCart(String)"
});
formatter.result({
  "duration": 6119315300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyCheckOutPage()"
});
formatter.result({
  "duration": 6091441600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red)",
      "offset": 18
    }
  ],
  "location": "CartSteps.verifyListOfProduct(String)"
});
formatter.result({
  "duration": 3083380400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test.allTheThings() T-Shirt (Red)",
      "offset": 13
    }
  ],
  "location": "CartSteps.removeListOfProduct(String)"
});
formatter.result({
  "duration": 5043212600,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.clickCheckOutButton1()"
});
formatter.result({
  "duration": 3048027000,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3019966200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Muhammad",
      "offset": 12
    },
    {
      "val": "Fikri",
      "offset": 45
    },
    {
      "val": "10020",
      "offset": 76
    }
  ],
  "location": "CartSteps.inputCredential(String,String,String)"
});
formatter.result({
  "duration": 6235959400,
  "status": "passed"
});
formatter.match({
  "location": "PaymentSteps.verifyDisplayCheckOutOverview()"
});
formatter.result({
  "duration": 3023276600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Onesie",
      "offset": 18
    }
  ],
  "location": "PaymentSteps.verifyListOfProduct(String)"
});
formatter.result({
  "duration": 3040319200,
  "status": "passed"
});
formatter.match({
  "location": "PaymentSteps.verifyPriceOfProduct()"
});
formatter.result({
  "duration": 3036835200,
  "status": "passed"
});
formatter.match({
  "location": "PaymentSteps.clickFinishButton()"
});
formatter.result({
  "duration": 3056199400,
  "status": "passed"
});
formatter.match({
  "location": "PaymentSteps.verifyDisplayCheckOutComplete()"
});
formatter.result({
  "duration": 3032918300,
  "status": "passed"
});
formatter.after({
  "duration": 659097000,
  "status": "passed"
});
});