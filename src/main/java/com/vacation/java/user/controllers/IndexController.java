package com.vacation.java.user.controllers;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luxin on 2016/7/15.
 */
@RestController
public class IndexController {
   /* @Autowired
    private ManagerDao createManagerDao;
    @Autowired
    private UserDao createUserDao;
    @Autowired
    private WorkRoleDao workRoleDao;
    @Autowired
    private UserTypeDao characterDao;

    @RequestMapping("/")
    public java.lang.String indexShow(){
        return  "Hello Administrator!";
    }

    @RequestMapping("/creatmanager")
    public Object createManager(){
        Manager manager=new Manager("","","","");
        return createManagerDao.save(manager);
    }

    @RequestMapping("/checkmanager")
    public void checkManager(String no,String name){
        Manager manager = new Manager("","","","");
        if(createManagerDao.findByNo(no)==null||createManagerDao.findByName(name)==null){
            System.out.println("注册成功");
            createManagerDao.save(manager);
        }
        else if(createManagerDao.findByNo(no)!=null){
            System.out.println("用户编号已存在，请重新输入");
           // checkManager(no,name);
        }
        else if(createManagerDao.findByName(name)!=null){
            System.out.println("用户名已存在，请重新输入");
           // checkManager(no,name);
        }
    }

    @RequestMapping("/createuser")
    public Object createUser(){
        User user=new User("","","","","","","","");
        return createUserDao.save(user);
    }

    @RequestMapping("/checkuser")
    public Object checkUser(String no,String name){
        return createUserDao.findByNoOrName(no,name);
    }

    @RequestMapping("/showall")
    public Object showAll(){
        return createUserDao.findAll();
    }

    @RequestMapping("/deleteall")
    public void deleteAll(){
        createUserDao.deleteAll();
    }
    @RequestMapping("/character")
    public void ccharacter(String character){
        UserType charact = new UserType();
        charact.setCharacter("家庭用户");
        characterDao.save(charact);
        charact.setCharacter("单位用户" );
        characterDao.save(charact);
        charact.setCharacter("代理商");
        characterDao.save(charact);
        charact.setCharacter("签约用户");
        characterDao.save(charact);
    }
    @RequestMapping("/workrole")
    public void cworkRole(String workrole){
        WorkRole work=new WorkRole();
        work.setWorkrole("客服");
        workRoleDao.save(work);
        work.setWorkrole("报修人员");
        workRoleDao.save(work);
        work.setWorkrole("维修人员");
        workRoleDao.save(work);
        work.setWorkrole("财务");
        workRoleDao.save(work);
        work.setWorkrole("库管");
        workRoleDao.save(work);
        work.setWorkrole("运营监督员");
        workRoleDao.save(work);
    }
   @RequestMapping("/delete")
    public void deleteUser(String no){
        createUserDao.deleteByNo(no);
    }

*/
}
