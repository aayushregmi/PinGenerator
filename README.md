# PinGenetaor

To generate specified number of pins:

Create an object of PinGenerator class and call the function getNumberOfPins with the parameter as the number of pins you require:

Example:
PinGenerator pinGenerator = new PinGenerator();
List<Integer> requiredPins = pinGenerator.getNumberOfPins(100);
  
This would generate 100 unique 4 digit pins.
