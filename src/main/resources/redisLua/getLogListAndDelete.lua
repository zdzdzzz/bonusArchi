local list = {};
--获取list
list = redis.call('LRANGE', KEYS[1], 0, -1);
--删除list
redis.call('DEL', KEYS[1]);
return list;
