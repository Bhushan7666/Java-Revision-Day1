---

# Day 1 Notes – Selenium Automation (Calley Project)

## 1. WebDriver

### Definition

WebDriver ek interface hai jo browser ko control karta hai.

### Use

* Browser open karna
* URL open karna
* Click karna
* Text enter karna
* Browser close karna

### Example

```java
driver.get("https://app.getcalley.com/Login.aspx");
```

---

## 2. Driver Object

Driver object browser par actions perform karta hai.

Example

```java
driver.get();
driver.findElement();
driver.close();
driver.quit();
```

---

# 3. Locator

### Definition

Locator Selenium ko batata hai ki webpage par element kahan hai.

### Common Locators

```java
By.id()

By.name()

By.className()

By.cssSelector()

By.xpath()
```

Example

```java
By email = By.id("txtEmailId");
```

Yahan

* email → Variable Name
* id → Locator Strategy
* txtEmailId → id Attribute ki Value

---

# 4. WebElement

### Definition

WebElement webpage ka actual element hota hai.

Jaise

* Button
* Textbox
* Checkbox
* Dropdown

Example

```java
WebElement emailBox = driver.findElement(email);
```

---

## Difference Between Locator and WebElement

Locator

* Sirf address hota hai.
* Action perform nahi kar sakta.

Example

```java
By email = By.id("txtEmailId");
```

WebElement

* Actual element hota hai.
* Is par click(), sendKeys(), clear() perform kar sakte hain.

Example

```java
WebElement emailBox = driver.findElement(email);
```

---

# 5. findElement()

### Definition

Locator ki help se webpage se actual element dhoondta hai.

Example

```java
driver.findElement(email);
```

---

# 6. click()

Click WebElement par perform hota hai.

Example

```java
driver.findElement(email).click();
```

Flow

```
Locator

↓

findElement()

↓

WebElement

↓

click()
```

---

# 7. Constructor

### Definition

Constructor object create hote hi automatically call hota hai.

### Rules

* Constructor ka naam class ke naam jaisa hota hai.
* Return type nahi hota.

Example

```java
public LoginPage(WebDriver driver){

}
```

---

# 8. this Keyword

Example

```java
this.driver = driver;
```

Meaning

Left side

```java
this.driver
```

Class ka variable

Right side

```java
driver
```

Constructor ka parameter

Iska matlab

Constructor me jo driver aaya hai usko class ke driver variable me store kar do.

---

# 9. Login Method

Example

```java
public void login(String email,String password)
```

Meaning

Ye method login karega.

Isme

* email
* password

bahar se milenge.

---

# 10. CSS Selector

## ID

HTML

```html
<input id="txtEmailId">
```

CSS

```java
#txtEmailId
```

Ya

```java
input#txtEmailId
```

---

## Class

HTML

```html
<input class="form-control">
```

CSS

```java
.form-control
```

Ya

```java
input.form-control
```

---

## Name

HTML

```html
<input name="email">
```

CSS

```java
[name='email']
```

Ya

```java
input[name='email']
```

---

## Type

HTML

```html
<input type="password">
```

CSS

```java
[type='password']
```

---

## Multiple Attributes

```java
input[name='email'][type='text']
```

---

# CSS Selector Formula
  
| HTML Attribute         | CSS Selector          |
| ---------------------- | --------------------- |
| `id="login"`           | `#login`              |
| `class="form-control"` | `.form-control`       |
| `name="email"`         | `[name='email']`      |
| `type="text"`          | `[type='text']`       |
| `input name="email"`   | `input[name='email']` |

---

# 11. POM (Page Object Model)

Har webpage ki alag class banate hain.

Example

```
LoginPage

RegistrationPage

AgentPage

UploadPage
```

Har page me

* Locators
* Methods

rakhe jate hain.

---

# 12. Project Structure

```
src/main/java

    base

    pages

    utils

src/test/java

    tests

src/main/resources

src/test/resources
```

---

# 13. Test Class

Example

```java
LoginPage loginPage = new LoginPage(driver);
```

Meaning

LoginPage ka object banaya.

---

# 14. Java Concepts Revised

✅ Object

✅ Constructor

✅ Method

✅ Parameter

✅ Variable

✅ Class

✅ Package

---

# Interview Questions Prepared

### Q1. WebDriver kya hai?

Browser ko automate karne ke liye interface.

---

### Q2. Locator kya hai?

Element ka address.

---

### Q3. WebElement kya hai?

Actual webpage element.

---

### Q4. Locator aur WebElement me difference?

Locator address hai.

WebElement actual element hai.

---

### Q5. findElement() kya karta hai?

Locator ki help se actual WebElement dhoondta hai.

---

### Q6. Constructor kya hai?

Object create hote hi automatically execute hone wala special method.

---

### Q7. this keyword kyu use karte hain?

Class variable aur parameter me difference batane ke liye.

---

## ✅ Kal ka Plan (Day 2)

1. LoginPage complete karna.
2. Khud se locators inspect karna (F12).
3. CSS Selector aur ID locator practice.
4. `login()` method banana.
5. Login test successfully run karna.
6. POM ko aur strong banana.

---
