javac Compiling.java # Compiles Compiling.java; catches error below.
# Compiling.java:6: error: ';' expected
#     System.out.println("Java statements end with a semicolon.")
#                                                                ^
# 1 error

ls # Lists source files where errors have been caught.
# Compiling.java

javac CompilingFixed.java # Successfully compiles CompilingFixed.java into CompilingFixed.class,
#  after fixing the previouly caught error.

java CompilingFixed # Runs a compiled CompilingFixed.class file, whose output is shown below.
# Java is a class-based language.
# Java classes have a 'main' method.
# Java statements end with a semicolon.
# Programming is... fun!
