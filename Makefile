.POSIX:
.PHONY: build jar run clean

build:
	javac -d bin $$(find src -name "*.java")

jar: build
	@jar cfe app.jar org.porcellis.Main -C bin .

run: build
	@java -cp bin org.porcellis.Main

clean:
	rm -f bin/*.class
