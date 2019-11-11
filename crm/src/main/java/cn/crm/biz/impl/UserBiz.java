package cn.crm.biz.impl;

import cn.crm.biz.IUserBiz;
import cn.crm.dao.IUserDao;
import cn.crm.entity.SysUser;
import cn.crm.util.MD5Utils;

/**
 * @ClassName: UserBiz
 * @author: ycs
 * @date: 2019年11月10日 下午9:32:01 
 * @Description:IUserBiz
 */
public class UserBiz implements IUserBiz{

	private IUserDao IUserDao;

	public void setIUserDao(IUserDao iUserDao) {
		IUserDao = iUserDao;
	}

	@Override
	public void regist(SysUser sysUser) {
		sysUser.setUserPassword(MD5Utils.md5(sysUser.getUserPassword()));
		sysUser.setUserState(1);
		IUserDao.save(sysUser);
	}

}
