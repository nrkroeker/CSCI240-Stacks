// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

stacks: Address.java Student.java Stack.java Driver.java
	javac Address.java Student.java Stack.java Driver.java -o stacks

clean:
	rm -f *.class
	rm stacks

run:
	java stacks
