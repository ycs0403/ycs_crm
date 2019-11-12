package cn.crm.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.crm.dao.IUserDao;
import cn.crm.entity.SysUser;

/**
 * @ClassName: UserDao
 * @author: ycs
 * @date: 2019年11月10日 下午9:29:03 
 * @Description:IUserDao层接口实现类
 * Mysql的sql语句不区分大小写，Oracle的hql建议大写
 */
public class UserDao extends HibernateDaoSupport implements IUserDao{

	@Override
	public void save(SysUser sysUser) {
		this.getHibernateTemplate().save(sysUser);
	}

	@Override
	public SysUser login(SysUser sysUser) {
		String sql="from SysUser where userCode=? and userPassword=?";
		List<SysUser> list=(List<SysUser>) this.getHibernateTemplate().find(sql, sysUser.getUserCode(),sysUser.getUserPassword());
		if(list.size()>0) {
			return list.get(0);
		}
		return null;
	}

}
