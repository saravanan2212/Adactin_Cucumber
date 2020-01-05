Feature: User booking in the adactin hotel website

  Scenario Outline: To validate the website bookable or not
    Given User is in adactin home page
    When User enter the "<userName>", "<password>"
    And User enter the hotel details "<info1>","<info2>","<info3>","<info4>","<info5>","<info6>","<info7>","<info8>"
    And User select the particular hotel
    And User book a ticket with enter the personal details "<inf1>","<inf2>","<inf3>","<inf4>","<inf5>","<inf6>","<inf7>","<inf8>"
    Then User validate the ticket booking successfully or not

    Examples: 
      | userName | password      | info1    | info2        | info3  | info4 | info5      | info6      | info7 | info8 | inf1    | inf2 | inf3       | inf4             | inf5 | inf6  | inf7 | inf8 |
      | Ramjkumar | 556E86 | Adelaide | Hotel Hervey | Double | 1-One | 04/01/2020 | 06/01/2020 | 2-Two | 1-One | Ramkumar | J    | 62,tamilnadu,india | 1234567893214789 | VISA | March | 2021 |  568 |
