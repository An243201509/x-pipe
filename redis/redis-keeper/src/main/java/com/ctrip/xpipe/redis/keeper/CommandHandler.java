package com.ctrip.xpipe.redis.keeper;

/**
 * @author wenchao.meng
 *
 * 2016年4月22日 上午11:45:21
 */
public interface CommandHandler {
	
	String[] getCommands();
	
	void handle(String []args, RedisClient redisClient);
	
	boolean isLog(String []args);	
}