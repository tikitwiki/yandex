Feature: Searh Smartphone

  Scenario: Param search

    Then TimeoutClick
    Then clickPhone
    Then SalesScrollTo
    When Model "Xiaomi" Click
    Then Xiaomivisibleu
    When  Memory "6 Гб" Click
    When Operat "" Click
    When Expansion "1920×1080 (Full HD)" Click
    When InputClick "1920×1080" Click
    Then ScreenClick
    Then HeaderScroll
    When Input "Смартфон Xiaomi Mi 6 6/64GB" Click
    Then ScrAlt
    When DescriptionParameter
    When ProcessorParameter
    When Usbparameter












