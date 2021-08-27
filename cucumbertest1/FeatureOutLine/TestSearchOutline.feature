Feature: Funcionalidad de busqueda de productos outline
  Scenario Outline: Busqueda en search tool
    Given Abre el web browser Chrome y direcciona a la aplicacion
    When Ingreso el nombre del producto a buscar "<dato>"
    Then Visualizo resultado de la busqueda
    And Cierro el Browser

    Examples:
    |dato|
    |blouse|
    |shoes|
    |hat|