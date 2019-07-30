# my_spring_heima03

## spring创建对象
    id，唯一标识，class，全限定类名
    
## spring对bean的管理细节
### 创建bean的三种方式
#### 默认构造函数
        在spring配置文件中，使用bean标签，配以id和class属性，且没有其他属性和标签时，使用的就是默认构造函数创建bean对象
        如果类中没有默认构造函数，对象无法创建。
        反射创建对象，需要默认构造函数
        
#### 使用普通工厂中的方法创建对象，
    （或者使用某个类中的方法创建对象，并存入spring容器）
#### 使用普通工厂中的静态方法创建对象，
    （或者使用某个类中的静态方法创建对象，并存入spring容器）

### bean对象的作用范围
    scope：指定bean的作用范围.
        取值：singleton：单例，默认
              prototype：多例
              request：web请求范围
              session：web的会话范围
              global-session：集群环境的会话范围（全局会话范围），如果不是集群范围，等同 session
        
### bean对象的生命周期
        singleton：
            出生：容器启动
            存活：容器运行
            死亡：容器销毁
            总结：和容器的周期一致
        prototype：
            出生：使用对象时，spring来创建
            存活：对象只要被使用，就一直存活
            死亡：长时间不使用，也没被别的对象引用，由java垃圾回收器回收
