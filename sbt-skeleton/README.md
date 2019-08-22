# Running the code with SBT

This is a simple Scala example intended to demonstrate how to use
the sbt tools to build and test your Scala code.

The program simply applies the identity function to each of the
command-line arguments.
You can compile the program by opening a terminal, changing to this
directory, and typing 
```
sbt compile
```

This compiles the project, and outputs error messages if the build
failed for any reason.  To run the code, you can type
```
sbt run
```

Note that doing "run" will automatically compile if necessary, so
you don't necessarily need to do the "compile" step.

Just running our program with no arguments will not produce any
output.  We can try it with a more interesting input:
```
sbt "run 1 2 3 4"
```

This provides the program with four arguments, namely the strings
"1", "2", "3", and "4".  The sbt tool(s( automatically finds our
main method in Identity.scala, and this is the code that runs when
we execute the above command.  The output in this case is
the four command-line arguments.

# Testing the code with SBT

We have defined some test cases to make sure that our list-
summation functionality actually works as expected.  These are
in the IdentityTest.scala file.  We can run the test cases by doing
```
sbt test
```
