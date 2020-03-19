Today, encryption and decryption algorithms are used everywhere on the Internet to protect our data. This is especially important for sites that handle sensitive data, such as e-commerce sites that accept online card payments and login areas that require users to enter their credentials. To ensure data security, there are complex encryption algorithms behind the scenes.

Program arguments:

-mode    "enc" for encryption ,"dec" for decryption.
-in      to input data from a file put its name after -in.
-out     to choose a name for the output file.
-key     the number of shifts for each letter.
-alg     to specify the algorithm you want to cipher your input with(shift or unicode).

Examples for running the program :

Ex1:
java main -mode enc -in input.txt -out output.txt -key 5 -alg unicode
This command should get input from input.txt, encrypt it using unicode algorithm and then output it to output.txt.


Ex2:
java main -key 5 -data "Welcome" -mode enc -in input.txt
Output:
Bjqhtrj

If there is no specified algorithm, the program will apply "shift" by default. 
If it happens to enter both arguments -in and -data, the program will prefer -data over -in.  
If there is no -data, the program should assume that the data is an empty string.
