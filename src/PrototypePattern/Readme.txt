it is used to make copy/clone from existing object.
assume your original object is robot and it is very expensive to create a robot object so you want almost same object with minor changes
so make a clone out of original object and make changes.


1-See 1st picture you can clone like that but if there are private members like that so this method will fail also we have
to know all the fields we have to copy so what to do when there are hunderds of variables how would we know which to copy we have to
write

2-So the cloning logic which fields should be set they should not be the responsibility of client they should be responsibility
of class itself .

3-see 2nd picture for prototype method

4-see 3rd and 4th for code