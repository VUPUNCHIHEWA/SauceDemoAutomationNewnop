# Bug Report - SauceDemo Testing

This report shows the bugs I found when I checked the SauceDemo website using the `problem_user` account.

---

## Bug 1: All product pictures are wrong
* **Severity:** Medium
* **Steps to Reproduce:**
  1. Go to `https://www.saucedemo.com/`
  2. Log in with username `problem_user` and password `secret_sauce`.
  3. Look at the product pictures on the main shop page.
* **Expected Result:** Every product should have its own correct and different picture.
* **Actual Result:** All products show the exact same dog picture. The real product pictures are not loading.

---

## Bug 2: "Add to Cart" button does not work for some items
* **Severity:** High
* **Steps to Reproduce:**
  1. Log in as `problem_user`.
  2. Click the "Add to Cart" button for **Sauce Labs Fleece Jacket** or **Sauce Labs Bolt T-Shirt**.
* **Expected Result:** The item should go into the shopping cart, and the button text should change from "Add to Cart" to "Remove".
* **Actual Result:** Nothing happens when clicking the button. The item is not added, and the shopping cart number does not change.

---

## Bug 3: Cannot finish checkout because "Last Name" field gives an error
* **Severity:** Critical
* **Steps to Reproduce:**
  1. Log in as `problem_user`.
  2. Add a working item (like *Sauce Labs Backpack*) to the cart.
  3. Click the shopping cart icon and click "Checkout".
  4. Type a First Name, Last Name, and Postal Code.
  5. Click the "Continue" button.
* **Expected Result:** The website should accept the data and take the user to the "Checkout: Overview" page.
* **Actual Result:** The website shows a red error message saying `"Error: Last Name is required"`, even though I already typed the Last Name. I cannot go to the next page or finish the order.