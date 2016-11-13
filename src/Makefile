all: compile run

compile:
	javac -cp lib/commons-collections4-4.1.jar Main.java Entries.java Fifo.java Lru.java Otm.java

run:
	java -cp .:lib/commons-collections4-4.1.jar Main < inputs/input1.in
	java -cp .:lib/commons-collections4-4.1.jar Main < inputs/input2.in
	java -cp .:lib/commons-collections4-4.1.jar Main < inputs/input3.in

test1: compile
	java -cp .:lib/commons-collections4-4.1.jar Main < inputs/input1.in
	

		
