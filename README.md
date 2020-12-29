# Functional Programming 

## Intro for junior devs to a more declarative style of engineering


### Some properties of Functional Programming


#### No state 
Should not depend on any other state. Should not mutate state. 

#### Pure Functions
Should not depend on value of a variable. If there is a dependency on global variable, it and impure function which 
should not be used within functional programming.
Should be completely self-contained.

####No side effects 
No effect on anything else other than the body of your function - i.e. cannot set things, should deal with immutable objects

####Higher order functions
The function takes one or more functions as parameters.
The function returns another function as a result - combinator pattern.
