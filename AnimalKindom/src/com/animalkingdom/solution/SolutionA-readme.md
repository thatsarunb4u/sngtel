#Solution A1
##Rational for chosen design
Keeping scalability in mind, various interfaces have been created for each of their behavior. the method walk is taken away from Animal entity since not animals can walk.

In the overall requirements, the walk method is not customizable. Hence, a concrete class has been created by name "Typical Walker" and walk method is implemented to be common to anybody who can walk. In other words, there is no variation of walk.


#Solution A2
##Rational for chosen design
Chicken cannot fly. So, Flyable interface is not implemented. Another way of designing is to have fly method in Bird interface and throwing an "UnsupportedOperationException" exception while being called. The reason for avoiding this design is to minimize runtime error. By following my design, the client wouldn't have an opportunity to call fly() for chicken at all which avoids exception.

#Solution A3
##Rational for chosen design
A rooster shares a sibling relationship with chicken. Its on the same hierarchy level. Rooster can be modeled as an implementation of Bird and Singable interfaces. Another way of emphasizing this relationship could be using a NonFlyable interface and making both Chicken and Rooster implement them.  


#Solution A4
##Rational for chosen design
The Parrot is expected to duplicate the sound of its neighbour. "State Design Pattern" comes very much handy in this design. The sing method changes based on the state of the parent, which in our scenario is the neighbour.