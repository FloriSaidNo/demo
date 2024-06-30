### 切换文件夹  cd /d  要切换的文件路径

### 显示目录下所有文件  dir

### tomcat和jetty都是web容器
### 默认是tomcat，但是可用exclusions标签排除tomcat:`<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
<exclusions>
<exclusion>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-tomcat</artifactId>
</exclusion>
</exclusions>
</dependency>`

### 这时候启动会报错，因为没有web容器
### 再加上jetty的依赖就行了
`<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-jetty</artifactId>
</dependency>`

### spring-boot配置文件有三个后缀：优先级是.properties\.yml\.yaml

### yml配置文件里 用数组要用-在前面区分
jl:
sex: man
cm: 183
kg: 80
year:
- 1
- 2
- 3

### 请求路径里有变量，可以通过注解@PathVariable 获取
比如根据不同的id做不同处理，或者做默认处理

### 可以通过创建一个class类，来获取yml里的配置数据，会自动把配置装配到同名class上
### 或者通过Environment类的getProperty方法获取配置参数
### 通过手动赋值，用注解@ConfigurationProperties(prefix = "jl333")；prefix用来指定将什么前缀的配置数据赋给当前class。配合@Component组件注解使用
### idea里alt+enter在变量名上，快速构建对应类的get和set方法
### @Override 重写，字类重写父类方法。toString()方法是String类的，可以重写
### yml配置文件里配置不同生产测试开发环境的配置文件，只需要改一个地方就能直接切换对应环境配置数据。spring.config.activate.on-profile设置环境名称,不需要来回替换文件，把所有环境配置文件都放在自己环境下就行，每次设置要用的环境
 在yml配置文件里，用---分隔每个环境的配置、
 然后切换不同环境配置时，修改spring-profiles-active：加上环境别名，来决定用哪个环境配置
### 。properties类型的配置文件，不同环境就需要创建不同的文件,比如application.properties\applicaiton-dev.properties\application-test.properties
sprigboot默认加载application.properties,所以要在application.properties文件里配置用什么环境，也是用spring.profiles.active=

## 已经打成jar包之后，启动时怎么切换环境配置呢？？
通过启动命令指定配置，例如：java -jar jl_test.jar -spring.profiles.active=test 就指定用测试配置
因此java启动命令里是可以加spring配置指令的，比如修改启动端口 java -jar jl.jar -server.port=7070 优先级比配置文件里的端口高

### 配置文件按放在不同位置，优先级也不同
1级：classpath：application.yml
2级：classpath：config/application.yml
3级：file ：application.yml
4级：file ：config/application.yml
就是jar包外所在目录下优先级高于jar里的配置、同一个级别，比如都是jar包里，优先级是config目录下的配置高
### 所以手机银行的配置文件是在jar外的config目录下，这个优先级最高












