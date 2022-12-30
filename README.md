
#Create Currency Conversion Using SOAP web service 

You can convert the currencies. Therefore you can give the amount and what Currency convert from to what. So this is the soap based and you will be able to see request and responseby using SOAP UI software easily.

Firstly you have to run the WebServer. To do that you can press the run button after that give the comand in terminal section. Command is, "
wsimport.exe -keep -d ..\DemoWebServiceClient\Stub -p com.sltc.soa.client.stub http://localhost:8888/ CurrencyConversionService
?wsdl "

After that you can see run the server then run the webServiceClient and give the user Inputs Correctly.

To do that recomond to use " intellij IDEA "

Required the SDK 1.8
