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