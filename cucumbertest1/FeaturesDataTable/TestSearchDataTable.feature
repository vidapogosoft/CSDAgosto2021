Feature: Funcionalidad de busqueda de productos con data table
  Scenario: Busqueda en search tool
    Given Abre el web browser Chrome y direcciona a la aplicacion
    When Ingreso el nombre del producto a buscar:
      |dato|
      |blouse|
      |shoes|
      |hat|
    Then Visualizo resultado de la busqueda
    And Cierro el Browser
