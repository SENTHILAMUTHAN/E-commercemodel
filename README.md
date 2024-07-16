
# Demoblaze E-commerce Automation

This project automates the process of adding products to the cart, removing a product, and placing an order on the Demoblaze E-commerce website using Selenium and TestNG framework.

## Overview

The automation script performs the following tasks:

1. **Setup:**
   - Launch the browser and maximize the window.
   - Open the Demoblaze website.

2. **Add Products to Cart:**
   - Add an iPhone 6 (32GB) to the cart.
   - Add a Nexus 6 to the cart.
   - Add a Nokia Lumia 1520 to the cart.

3. **Delete Product and Place Order:**
   - Delete the first product from the cart.
   - Place an order with the provided user details.

## Key Features

- Developed automated scripts using the TestNG framework to add three different products to the cart on the Demoblaze E-commerce website.
- Implemented Object-Oriented Programming (OOPS) concepts such as encapsulation, inheritance, and abstraction for robust test script design.
- Validated the correctness of the total price displayed after adding products to the cart.
- Automated the removal of a product from the cart and verified real-time updates of the total price.
- Utilized TestNG assertions to ensure accurate validation of expected outcomes during automated testing.

## Prerequisites

- Java Development Kit (JDK)
- Apache Maven
- TestNG
- Selenium WebDriver

## Project Structure

- **BaseDemblaze.java:** Contains reusable methods for browser actions.
- **Homepojo.java:** Page Object Model class for the homepage elements.
- **DemoblazeRunner.java:** Test class containing test methods for each step of the automation.


## Detailed Explanation of Test Methods

### `setup()`

- Launches the browser and maximizes the window.
- Opens the Demoblaze website.

### `tc1_addIphoneToCart()`

- Navigates to the iPhone 6 (32GB) product page.
- Adds the iPhone to the cart.
- Handles the alert confirmation.
- Navigates back to the homepage.

### `tc2_addNexusToCart()`

- Navigates to the Nexus 6 product page.
- Adds the Nexus to the cart.
- Handles the alert confirmation.
- Navigates back to the homepage.

### `tc3_addNokiaToCart()`

- Navigates to the Nokia Lumia 1520 product page.
- Adds the Nokia to the cart.
- Handles the alert confirmation.
- Navigates back to the homepage.

### `tc4_deleteFirstProductAndPlaceOrder()`

- Navigates to the cart.
- Deletes the first product in the cart.
- Proceeds to place an order.
- Fills in the order details and confirms the purchase.
- Captures a screenshot of the order confirmation.

## Dependencies

- **Java Development Kit (JDK)**
- **Apache Maven**
- **TestNG**
- **Selenium WebDriver**

