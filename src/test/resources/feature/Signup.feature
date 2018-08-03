@regression @signup

Feature: Signup feature

  Background:
    Given I am on Registration page

  @signup-1
  Scenario: Verify a new user can register with a valid email address
    When  I enter name as testuser email as test@test1.com password as test12345
    And   I click submit button
    Then  I am signed-in as a new user

  @signup-2
  Scenario Outline: Verify invalid email on registration
    When  I enter name as <testuser> email as <email> password as <password>
    And   I click submit button
    Then  I verify invalid email address


    Examples:
      | testuser           | email              | password           |
      | suni0amm           | test.com           | Password filo      |
      | //sdio90Miau       | testtest@ gmail.com| 191900DinoFirst    |
      | Bibuye rahmanaj df | test@testtest.com  | Pas@$niouyt        |
      | cameron De Costa   | testtesttest.com   | open123456         |
      | Teco Ticom         | @yahoo.com         | 123456             |
      |   12 12 23 rIl.com?|   0 5@aol.com?     | 123456   op0000    |
      | sadddddddddddd.gov | sadddddddddddd.gov | Uop@gt&8<_Oops     |
      | te150Banargy       | te150=@hotmail.aol | !@first            |
      | hotmail.com,hotmai | Nemays88@gmail.com | oopnuiopQ__Slm     |
      | Nicolas Sarcojy    | Siyya800@@test.com | Password filo      |
      | Alfred banard 9087 | Yaho._@}@test. com |         t@test.com |
      | Huan Carlos        | mdrahma @gmail.com | 222)(0  t@test.com |
