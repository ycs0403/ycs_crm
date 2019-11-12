package cn.crm.biz.impl;

import org.springframework.transaction.annotation.Transactional;

import cn.crm.biz.IUserBiz;
import cn.crm.dao.IUserDao;
import cn.crm.entity.SysUser;
import cn.crm.util.MD5Utils;

/**
 * @ClassName: UserBiz
 * @author: ycs
 * @date: 2019年11月10日 下午9:32:01 
 * @Description:IUserBiz实现类
 */
@Transactional
public class UserBiz implements IUserBiz{

	private IUserDao iUserDao;

	public void setiUserDao(IUserDao iUserDao) {
		this.iUserDao = iUserDao;
	}

	@Override
	public void regist(SysUser sysUser) {
		sysUser.setUserPassword(MD5Utils.md5(sysUser.getUserPassword()));
		sysUser.setUserState(1);
		iUserDao.save(sysUser);
	}

	@Override
	public SysUser login(SysUser sysUser) {
		sysUser.setUserPassword(MD5Utils.md5(sysUser.getUserPassword()));
		SysUser user=iUserDao.login(sysUser);
		return user;
	}

	

}
