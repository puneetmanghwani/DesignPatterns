Facade is used when we have to hide the system complexity from client

ex-car - like user/client driving a car and he press accelerates or brakes speed goes up or down so as client we know functionality
but we don't know the system complexity or classes or logic to accelerates or brakes.

facade is not necessary if client want to use direct classes or complexity he can


DAO - data access object - a class which interact with db



Facade vs Proxy pattern - in proxy pattern the proxy class is implement the same interface as the real class and only take care of
object of real class but in facade the facade class takes care of many classes.

Facade vs adapter pattern - in adapter client and original interface is incompatible so we create a adapter in mid so client can
talk to adapter and adapter to original but in facade client can interact original class but we use facade just to hide complexity.