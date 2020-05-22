Feature: Searh Smartphone

  Scenario: Product search

    Then TimeoutClick
      #электроника
    Then clickPhone
       #мобилы
    Then SalesScrollTo
      #снять продажи
    Then XiaomiClickc
      #выб сиаоми
    Then Xiaomivisibleu
       # сиамои видим
    When RamClickparameter
       #64гб
    When RampClickparameter
      #6 гб
    When ChooseExtension
      #показать все
    When InputParameter
      #вводим парам экрана
    Then ScreenClick
      #кликнули по размеру
    Then HeaderScroll
      #проскроллили вверх до заголовка
    Then XiaomiMiClick
    #кликнули по самому тел
    Then ScrAlt
    #проскроллили до характеристик
    When DescriptionParameter
    #все характеристики
    When ProcessorParameter
    # видимый процессор
    When Usbparameter
    #видимый usb




