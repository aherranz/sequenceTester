# For building the aedlib.jar jar file the normal way


all: 
	sh ./gradlew jar



# For building the javadocs

javadoc: 
	sh ./gradlew javadoc


# For running the example test

test:
	sh ./gradlew test
