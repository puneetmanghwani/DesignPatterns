default size = 16 and always size is in 2^power for better collision management

whenever we do map.put(1,"hi") it first calculated the hashcode of key (1) from that we get index for where to put in hashmap and
internally it stores a list at every index and in that list int contains all collided keys and values


for one value hashcode will always be same and for different value there can be same value
if two objects are equal then there hashcode will be same and if two objects are not same there hashcode be same or not

load capacity- lets say it 0.75 so this means when size of hashmap reaches 75% we have to resize it

from java 8 it maintains list of nodes till treeify threshold after list will be converted into binary search tree to decrease
search time from o(n) to o(logn)