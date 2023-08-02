Feature: Wikipedia search functionality and verifications

  #WSF-194861 --> potential jira ticket number
  @wip
  Scenario: Wikipedia Search fFunctionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User should see "Steve Jobs" in the wiki title

  @wip
  Scenario: Wikipedia Search fFunctionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User should see "Steve Jobs" in the main header

  @wip
  Scenario: Wikipedia Search fFunctionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User should see "Steve Jobs" in the image header

  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User should see "<expectedTitle>" in the wiki title
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedImageHeader>" in the image header


    @soccerPlayers
    Examples: search values we are going to be using in this scenario is as below
      | searchValue       | expectedTitle     | expectedMainHeader | expectedImageHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         | Steve Jobs          |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  | Cristiano Ronaldo   |
      | Bob Marley        | Bob Marley        | Bob Marley         | Bob Marley          |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       | Chuck Norris        |
      | Antony Hopkins    | Antony Hopkins    | Antony Hopkins     | Antony Hopkins      |


    @scientists
    Examples:
      | searchValue  | expectedTitle | expectedMainHeader | expectedImageHeader |
      | Marie Curie  | Marie Curie   | Marie Curie        | Marie Curie         |
      | Lady Gaga    | Lady Gaga     | Lady Gaga          | Lady Gaga           |
      | Kate Winslet | Kate Winslet  | Kate Winslet       | Kate Winslet        |