stacks: Address.java Student.java Stack.java Driver.java
	javac Address.java Student.java Stack.java Driver.java -o stacks

clean:
	rm -f *.class
	rm stacks

run:
	java stacks
