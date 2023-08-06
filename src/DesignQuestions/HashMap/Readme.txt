default size = 16 and always size is in 2^power for better collision management

whenever we do map.put(1,"hi") it first calculated the hashcode of key (1) from that we get index for where to put in hashmap and
internally it stores a list at every index and in that list int contains all collided keys and values