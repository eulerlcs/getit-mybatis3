# study-mybatis3 @ 2020.03.18

## 准备  
1. mysql
    ```shell script
    docker pull mysql:5.7.29
    ```  
2. mysql docker-compose.yml
    ```yaml
    version: '3.3'
    services:
      db:
        build: ./docker/mysql
        image: mysql:5.7
        restart: always
        environment:
          MYSQL_DATABASE: sample_db
          MYSQL_USER: user
          MYSQL_PASSWORD: password
          MYSQL_ROOT_PASSWORD: rootpassword
        ports:
          - "33061:3306"
        volumes:
          - ./docker/mysql/var/lib/mysql:/var/lib/mysql
          - ./docker/mysql/initdb.d:/docker-entrypoint-initdb.d
          - ./docker/mysql/etc/mysql/conf.d:/etc/mysql/conf.d
          - ./docker/mysql/var/log/mysql:/var/log/mysql
   ```
2. sqlyog   傻瓜式安装  
    [sqlyog-community](https://github.com/webyog/sqlyog-community/wiki/Downloads)

3. db script
    ```sql
    create database mybatis3;
    use mybatis3;
    
    ```

## 学习资源
| 资源分类 | 作者 | 链接 |
| ---- | ---- | ---- |
| github |      | [mybatis-3](https://github.com/mybatis/mybatis-3) |
| wiki |      | [mybatis-3](https://mybatis.org/mybatis-3/) |
| bilibili | 狂神 | [Mybatis最新完整教程](https://www.bilibili.com/video/av69742084?from=search&seid=17826521436689739148) |


  
 
