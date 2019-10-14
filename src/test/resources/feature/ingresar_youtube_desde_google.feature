Feature: Se desea ingrear a youtube desde una busqueda en Google

  Scenario: Ingresar desde Google Colombia
    Given Jorge carga los datos de la prueba
    When ingresa a google y realiza la busqueda
    Then deberia ver la pagina principal de youtube