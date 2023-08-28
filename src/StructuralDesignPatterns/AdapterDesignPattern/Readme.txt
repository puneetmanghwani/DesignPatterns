adapter design pattern is a bridge between existing interface expected interface

Ex1- assume client wants to use a interface(existing interface) but can't because they are incompatible so there comes the adapter
which acts as a bridge.

Ex2- xml to json parser - so assume server returns xml and clients want json so we need adapter which converts xml to json

Ex3- weight machine - weight machine returns the weight in pounds assume someone want to see in kg so we will bring an adapter
which will talk to adaptee/existing interface and converts to kg




Adapter method exposes all the methods which client understands and concrete adapter it talks to the existing interface.
Adapter has a existing interface object.

For mobile phone need to charged in socket you need adapter