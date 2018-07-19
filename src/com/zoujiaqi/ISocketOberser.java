package com.zoujiaqi;
/**
 * @author zoujiaqi
 * 
 */
public interface ISocketOberser
{
	void notifyConn(boolean isConnect);
	void notifyDescript(String info);
}
