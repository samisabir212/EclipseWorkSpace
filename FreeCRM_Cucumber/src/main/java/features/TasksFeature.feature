Feature: Tasks Feature

Background: 
Given I log in with my "<username>" and "<password>"
And I click the login button
Then I should be at the Landing Page "<LandingPageURL>"
When I hover my mouse on the Tasks link on the navbar
Then The create new task link should appear


Scenario Outline:


	Examples: