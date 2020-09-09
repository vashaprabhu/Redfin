
Feature: RedFin functionality

Scenario Outline: Redfine
Given Connect to "browser"
When open "url" website
Then enter "<place>" to search
Then click on search
Then Did you mean dialogbox pops up
Then select "<city>" you want
Then Check the displayedCity is same as entered "<place>"
Then Enter "<minPrice>" and "<maxPrice>" in the list
Then check listed homes are from the "<SameCity>"

Examples:
|place				| city																					                 | minPrice	|	maxPrice	|	SameCity 				|
|Sunnyvale		| https://www.redfin.com/city/19457/CA/Sunnyvale                 | 25       | 3       	| /CA/Sunnyvale/	|
|Sunnyvale		| https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale | 21       | 4       	| /TX/Dallas/			|
