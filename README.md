# MenuDistribution


Program use:
The program can be run through command line. You can either run
the Chewse_food_distribution_service.jar from the out/artifacts directory via java -jar. This jar
was compiled using java 8, if you wish to use a different version, you can compile from
command line via javac from the src directory.

As for the input itself. The program works based on the initial parameters granted to the
assignment. The user input a combination of meal items and the ratio tied to them. Followed by a
quantity. The function “distributeFood” then determines the best possibly way to match these
ratios given the allotted quantity.

Tooling:

Java 8:
This program was written using jdk 8. It does not take advantage of any java 8 specific features
and should compile/run on java versions 6-8.

jUnit:
This program uses jUnit, a common unit testing suite, in order to quickly generate and run test
scenarios for the program.

Logger:
This program uses a java Logger utility. In order to quickly generate output for a user during
unexpected conditions.

Next steps:

Improve input:
I would like to expand this program to run using input beyond integer values. I personally feel a
more meaningful “key” value such as “Chicken”, “Fish”, “Vegetarian” would yield a more
useful program.

Improve error handling:
As noted above, the programs input is very specific given the initial write up. I’d argue that users
may want to use a variety of inputs, and building a program to handle these cases would be
useful.

UI client:
Command line tools are useful for developers, less so for customers. Given more time and the
handling of the prior improvements. I’d recommend a basic UI to give this utility significant
more value.