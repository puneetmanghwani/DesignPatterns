whenever client request a real object we introduce a
proxy object in between so every request which goes to real object
go through proxy object and this is called proxy design

ex-access restriction - whenever you visit a website many times it go through a proxy which
sometimes contains blocked list

ex-caching - user want to access a real object it goes through proxy which
is a cache so it will check does object is in cache or not

ex-preprocessing and postprocessing - when client request a object
and you want to process something before actual call or after actual call
like logging , publish event etc .

imp - in spring boot when we make a bean , internally it's proxy is created.
