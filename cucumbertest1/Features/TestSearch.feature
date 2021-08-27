Feature: Funcionalidad de busqueda de productos
  Scenario: Busqueda en search tool de blusas
    Given Abre el web browser Chrome y direcciona a la aplicacion
    When Ingreso el nombre del producto a buscar blouse
    Then Visualizo resultado de la busqueda
    And Cierro el Browser

  Scenario: Busqueda en search tool de zapatos
    Given Abre el web browser Chrome y direcciona a la aplicacion
    When Ingreso el nombre del producto a buscar shoes
    Then Visualizo resultado de la busqueda
    And Cierro el Browser