@grid
Feature: grid_feature

  @edge
  Scenario: TC01_edge_test
    Given kullanici "https://techproeducation.com/" adresine "edge" ile gider
    When  kullanici basligin "TechPro Education" icerdigini dogrular
    Then  kullanici sayfayi kapatir

  @chrome
  Scenario: TC02_chrome_test
    Given kullanici "https://techproeducation.com/" adresine "chrome" ile gider
    When  kullanici basligin "TechPro Education" icerdigini dogrular
    Then  kullanici sayfayi kapatir