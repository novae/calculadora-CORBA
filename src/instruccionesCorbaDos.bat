///corba calculadora

cd C:\Users\TEC\Dropbox\IAD\entregarIAD\calculadoraCORBA\src
idlj -fall suma.idl 
javac *.java
orbd -ORBInitialPort 1080


cd C:\Users\TEC\Dropbox\IAD\entregarIAD\calculadoraCORBA\src
java SumaServer -ORBInitialPort 1080 -ORBInitialHost localhost

cd C:\Users\TEC\Dropbox\IAD\entregarIAD\calculadoraCORBA\src
java GUICalculadora -ORBInitialPort 1080 -ORBInitialHost localhost