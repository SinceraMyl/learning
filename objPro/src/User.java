public class User {
    int id; //id
    String name; //账户名
    String pwd; //密码


    public User(int id,String name){
        this.id = id;
        this.name = name;
    }

    public User(int id,String name,String pwd){
        this(id,name);  //this()可以用于调用其他构造器，且必须位于第一行。
        this.pwd = pwd;

    }


    public void login(){
        System.out.println("登录了:"+this.name);
    }
    public static void main(String[] args) {
        User u1 = new User(100,"高小七");
        u1.login();
    }
}
