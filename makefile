stacks:
	javac Address.java Student.java Stack.java Driver.java

clean:
	rm -f *.class
	rm stacks

run:
	java Driver
