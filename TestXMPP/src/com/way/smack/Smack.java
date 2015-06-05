package com.way.smack;

import com.way.exception.XXException;

public interface Smack {
    //用户登陆
	public boolean login(String account, String password) throws XXException;
    //退出
	public boolean logout();
    //
	public boolean isAuthenticated();
    //添加联系人选项
	public void addRosterItem(String user, String alias, String group)
			throws XXException;
    //移除联系人
	public void removeRosterItem(String user) throws XXException;
    //重命名联系人
	public void renameRosterItem(String user, String newName)
			throws XXException;
    //移除联系人组
	public void moveRosterItemToGroup(String user, String group)
			throws XXException;
    //重命名联系人组
	public void renameRosterGroup(String group, String newGroup);
    //验证联系人组
	public void requestAuthorizationForRosterItem(String user);
    //添加联系人组
	public void addRosterGroup(String group);
    //设置状态
	public void setStatusFromConfig();
    //发送消息
	public void sendMessage(String user, String message);
    //ping服务器
	public void sendServerPing();
    //根据JID获取用户名
	public String getNameForJID(String jid);
}
