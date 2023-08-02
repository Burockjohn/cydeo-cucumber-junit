Feature: Wikipedia search functionality and verifications

  #WSF-194861
  @wip
  Scenario: Wikipedia Search fFunctionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User should see "Steve Jobs" in the wiki title