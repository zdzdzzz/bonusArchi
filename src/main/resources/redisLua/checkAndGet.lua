if redis.call('hexists', KEYS[3], KEYS[4]) ~= 0 then
	--放入已消费HASH，如果不存在该用户，则新建并置2，否则自增1
	if redis.call('hexists', KEYS[5], KEYS[4]) ~= 0 then
		local num = tonumber(redis.call('hget', KEYS[5], KEYS[4]))+1;
		redis.call('hset', KEYS[5], KEYS[4], num);
	else
		redis.call('hset', KEYS[5], KEYS[4], 2);
		return nil
	end
else
	--先取出一个小红包
	local bonus = redis.call('rpop', KEYS[1]);
	if bonus then
		--把用户ID放到去重的set里
		redis.call('hset', KEYS[3], KEYS[4], bonus);
		--把红包放到已消费队列里
		redis.call('lpush', KEYS[2], bonus);
		return bonus;
	end
end
return nil