# KatasFromCodeWars
Katas from Code Wars

My Languages
Your task
You are given a dictionary/hash/object containing some 
languages and your test results in the given languages. 
Return the list of languages where your test score is at least 60, 
in descending order of the results.

Note: the scores will always be unique (so no duplicate values)

Examples
{"Java" => 10, "Ruby" => 80, "Python" => 65}   -->  ["Ruby", "Python"]
{"Hindi" => 60, "Dutch" => 93, "Greek" => 71}  -->  ["Dutch", "Greek", "Hindi"]
{"C++" => 50, "ASM" => 10, "Haskell" => 20}    -->  []

*******************************************************************************

Halving Sum
Task
Given a positive integer n, calculate the following sum:

n + n/2 + n/4 + n/8 + ...
All elements of the sum are the results of integer division.

Example
25  =>  25 + 12 + 6 + 3 + 1 = 47

*******************************************************************************

BasicCalculator

Write a function called calculate that takes 3 values. T
he first and third values are numbers. The second value is a character. 
If the character is "+" , "-", "*", or "/", 
the function will return the result of the corresponding mathematical function on the two numbers. 
If the string is not one of the specified characters, 
the function should return null (throw an ArgumentException in C#).

calculate(2,"+", 4); //Should return 6
calculate(6,"-", 1.5); //Should return 4.5
calculate(-4,"*", 8); //Should return -32
calculate(49,"/", -7); //Should return -7
calculate(8,"m", 2); //Should return null
calculate(4,"/",0) //should return null
Keep in mind, you cannot divide by zero. If an attempt to divide by zero is made, 
return null (throw an ArgumentException in C#).

*******************************************************************************

ResponsibleDrinking

Welcome to the Codewars Bar!
Codewars Bar recommends you drink 1 glass of water per standard drink so you're not hungover tomorrow morning.

Your fellow coders have bought you several drinks tonight in the form of a string. Return a string suggesting how many glasses of water you should drink to not be hungover.

Examples
"1 beer"  =>  "1 glass of water"
"1 shot, 5 beers and 1 glass of wine"  =>  "7 glasses of water"
Notes
To keep the things simple, we'll consider that anything with a number in front of it is a drink: "1 bear" => "1 glass of water" or "1 chainsaw and 2 pools" => "3 glasses of water"
The number in front of each drink lies in range [1; 9]


*******************************************************************************

Largest 5 digit number in a series
In the following 6 digit number:
283910
91 is the greatest sequence of 2 consecutive digits.
In the following 10 digit number:
1234567890
67890 is the greatest sequence of 5 consecutive digits.
Complete the solution so that it returns the greatest sequence of five consecutive digits 
found within the number given. The number will be passed in as a string of only digits. 
It should return a five digit integer. 
The number passed may be as large as 1000 digits.
Adapted from 