
Task
---
- https://www.amazon.com.tr/ sitesi açılır.
- Ana sayfanın açıldığı kontrol edilir.
- Çerez tercihlerinden Çerezleri kabul et seçilir.
- Arama alanına  -searchKeyword- yazıp arama butonuna tıklanır.
- -searchKeyword- öğesinin başarıyla listelendiğini kontrol edilir.

---


## 👨🏿‍💻 Senaryo

```cucumber
Feature:Amazon Search Test

  Scenario Outline: Searching for a product
    Given I visit <url>
    And   I check that the home page is opened
    And   I choose Accept Cookies from the cookie preferences
    When  I type "<searchKeyword>" in the search field and click the search button
    Then  I checking that "<searchKeyword>" successfully listed


    Examples:
    |searchKeyword | url                         |
    | msi          |"https://www.amazon.com.tr/" |
```

