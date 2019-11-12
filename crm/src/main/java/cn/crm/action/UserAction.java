package cn.crm.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.crm.biz.IUserBiz;
import cn.crm.entity.SysUser;

/**
 * @ClassName: UserAction
 * @author: ycs
 * @date: 2019年11月10日 下午9:35:46 
 * @Description:UserAction层,
 * ModelDriven<SysUser>模型驱动，放JavaBean对象
 *  实现getModel()方法
 */
public class UserAction extends ActionSupport implements ModelDriven<SysUser>{

	private IUserBiz iUserBiz;

	public void setiUserBiz(IUserBiz iUserBiz) {
		this.iUserBiz = iUserBiz;
	}

	private SysUser sysUser=new SysUser();//模型驱动使用的对象
	
	public SysUser getSysUser() {
		return sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}

	@Override
	public SysUser getModel() {
		return sysUser;
	}

	/**   
	 * @Title: login   
	 * @Description: 注册
	 * @param: @return      
	 * @return: String      
	 * @throws   
	 */  
	public String regist() {
		System.out.println("进入注册") ;
		iUserBiz.regist(sysUser);
		return LOGIN;
	}

	
	/**   
	 * @Title: login   
	 * @Description: 登录
	 * @param: @return      
	 * @return: String      
	 * @throws   
	 */  
	public String login() {
		System.out.println("进入登录") ;
	    SysUser user=iUserBiz.login(sysUser);
	    if(null==user) {
	    	this.addActionError("用户名或密码错误");
	    	return LOGIN;//没有登录，返回LOGIN
	    }else {
	    	ActionContext.getContext().getSession().put("user", "user");
	    	this.addActionMessage("登录成功！");
	    	return SUCCESS;//登录成功，返回SUCCESS
	    }
	}

}
