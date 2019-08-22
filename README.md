# Mines CSCI 400 Class Repository

We will use this repository to keep track of code samples
discussed in class.

# Recommended Platform

I would highly recommend using Linux for this class. Either
Ubuntu or Debian should work well (I will be using Ubuntu
for developing the assignments and presenting the in-class
demos).

# Java Installation

Many of the tools we use require the Java JDK behind the scenes.
On Ubuntu, the Java JDK can be installed like this:
```
sudo apt-get install default-jdk
```

# Scala Installation

We will use the Scala programming language in this class.
On Ubuntu, Scala can be installed like this:
```
sudo apt-get install scala
```

# SBT Installation

Scala Build Tool (SBT) is a nice framework for package
management, unit testing, etc. for Scala (similar to
Ant or Maven for Java).
On Ubuntu, SBT can be installed like this:

```
sudo apt-get install gnupg-curl
echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
sudo apt-key adv --keyserver hkps://keyserver.ubuntu.com:443 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
sudo apt-get update
sudo apt-get install sbt
```
