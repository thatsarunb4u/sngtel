#Solution A
##Rational for chosen design
Keeping scalability in mind, various interfaces have been created for each of their behavior. the method walk is taken away from Animal entity since not animals can walk.

In the overall requirements, the walk method is not customizable. Hence, a concrete class has been created by name "Typical Walker" and walk method is implemented to be common to anybody who can walk. In other words, there is no variation of walk.