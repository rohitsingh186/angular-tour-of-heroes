Feature: Detail view page for a Hero

  Scenario: View Hero details page
    Given I am on the home page "http://localhost:3000/dashboard"
    When I click on "Captain America"
    Then I should see the hero detail page for "Captain America"