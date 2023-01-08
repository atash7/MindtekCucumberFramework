Feature: Validating search functionality

  @RTB-7
  Scenario: Validating authors all books
    Given user navigates to "RedShelf" application
    When user searches author "Seth Godin"
    Then user validates all books having author "Seth Godin"