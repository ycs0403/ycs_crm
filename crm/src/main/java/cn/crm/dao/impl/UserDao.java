package cn.crm.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.crm.dao.IUserDao;
import cn.crm.entity.SysUser;

/**
* @ClassName: UserDao
* @author: ycs
* @date: 2019年11月10日 下午9:29:03 
* @Description:IUserDao层接口实现类
*/
public class UserDao extends HibernateDaoSupport implements IUserDao{

	@Override
	public void save(SysUser sysUser) {
		this.getHibernateTemplate().save(sysUser);
	}

}
