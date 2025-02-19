/*
Interface till jdk 1.7:

 Definition -> Interface is an abstract view of a class
 
   Interface keyword -> Interface is a keyword in java and it is used to define Interface
     
      Interface name rules ->
1-> same as class name rules
2-> Interface naming conventions 
 -> Interface name should be meaningful.
 -> Interface name should be in camelCase
 -> Interface name should be in UpperCase when we use abbreviation, acronym or     numeronym (W3C)
 -> Interface name should be an adjective.
      
           Interface Excessibility:
1-> Outer Interface cannot be private and protected can only public and default.
2-> Inner Interface and nested Interface are static by default
3-> Nested Interfaces declared inside class can take any excess modifier. However Nested Interface declared inside Interface is public implicitly.
  
              Interface Methods:
1-> Interface contains only abstract methods whether we are declaring it abstract or not.
2-> Interface methods cannot have body.
3-> Interface methods must be public. Whether we are declaring it public or not.
4-> Interface methods cannot be static because abstract and static are opposite keywords.
5-> Interface methods cannot be private protected and default. If we do not pass any excess modifier then java compiler bydefault declare it as public.
6-> Interface method cannot be final because abstract and final are opposite keyword.
7-> Interface method cannot be strictfp(keyword).
8-> Interface method cannot be synchronised.
9-> Interface method cannot be native.
10-> Interface method must be Overriden.

                    Interface Attributes 
Interface attributes must be public whether we are declaring it public or not.
Interface attribute must be static whether we are declaring static or not.
Interface attributes must be final whether we are declaring it final or not.
Interface contains only constants.
Interface does not have variables.
Interface attributes must be initialized.
Interface does not have non static attributes.
Interface attributes cannot be private, protected and default.
Interface attributes cannot be transient.
Interface attribute must be class level attribute.

                        Interface constructor
Interface does not have constructor because Constructors are used initialize instance variable.
Interface does not instance variable. So Interface does not have constructors.

                          Interface inheritance
->one Interface may extends multiple Interfaces by using extends keywords.
->java does not support the concept of multiple inheritance in case of classes but java supports multiple inheritance in case of Interfaces.
-> one class may implements multiple Interfaces by using implements keyword.
-> one Interface never implements rather Interface by using implements keyword.


                              Interface Block
->Interface does not have static block.
->Interface does not have instance block. Because both blocks are initializers and are used to initialize variables but Interface does not have variables that's why Interface does not have blocks.
->Interface does not have Synchronized block because synchronized blocks are generally define inside a method body and method does not have any body inside Interface.

                              Interface UML
->Interface diagram is same as class diagram unlike.
->Interface diagram is represented by dotted line or dashed line.


                              Interface Advantages
->without bothering about the implementation part we can achieve the security of the implementation.
-> Multiple inheritance is not allowed in java however we can use an Interface to make use of it as you can implement more than one Interface.
-> it is use to achieve total abstraction
-> it is use to achieve loose coupling.
-> it is use to achieve bridge design pattern.

NOTE --->>>>> Interface is also known as 100% abstract class.
*/

public interface Arithmetic{
public abstract void add(int a, intb);
abstract void sub(int a, int b);
public void mul(int a, int b);
void div(int a,int b);
 
}




   
   