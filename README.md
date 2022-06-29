# :gift: Lottery 抽奖系统 - 基于领域驱动设计的四层架构实践

![](https://codechina.csdn.net/KnowledgePlanet/Lottery/-/raw/master/doc/_media/首图.png)

<div align="center">
    <a href="https://bugstack.cn" style="text-decoration:none"><img src="https://codechina.csdn.net/KnowledgePlanet/Lottery/-/raw/master/doc/_media/lottery.png" width="128px"></a>
</div>

<div align="center">
<a href="#">互联网</a> •    
<a href="#">C端项目</a> •    
<a href="#">DDD架构</a> •    
<a href="#">分布式</a> •    
<a href="#">规则引擎</a>
</div>

>` Lottery 抽奖系统` 项目是一款互联网面向C端人群营销活动类的抽奖系统，可以提供抽奖活动玩法策略的创建、参与、记账、发奖等逻辑功能。在使用的过程中运营人员通过创建概率类奖品的抽奖玩法，对用户进行拉新、促活、留存，通常这样的系统会用在电商、外卖、出行、公众号运营等各类场景中。By 小傅哥，[《重学Java设计模式》](https://item.jd.com/13218336.html)图书作者，沉淀、分享、成长，让自己和他人都能有所收获！

⛳ **目录**

- [《抽奖系统 | 实战开发小册 • 更新9节》，Go！](https://codechina.csdn.net/KnowledgePlanet/Lottery/-/wikis/home)
- [学习说明](https://codechina.csdn.net/KnowledgePlanet/Lottery#-%E5%AD%A6%E4%B9%A0%E8%AF%B4%E6%98%8E)
- [环境配置 🤔 `重点注意使用SQL按照分支步骤更新，不要用最新的SQL对应最开始的代码`](https://codechina.csdn.net/KnowledgePlanet/Lottery#-%E7%8E%AF%E5%A2%83%E9%85%8D%E7%BD%AE)
- [开发规范(分支、提交)](https://codechina.csdn.net/KnowledgePlanet/Lottery/-/wikis/home#-%E5%BC%80%E5%8F%91%E8%A7%84%E8%8C%83)
- [学习作业 🍁`(留下你的学习足迹，记录、分享、共同成长)`](https://codechina.csdn.net/KnowledgePlanet/Lottery/-/tree/master#-%E5%AD%A6%E4%B9%A0%E4%BD%9C%E4%B8%9A)
- [联系作者](https://codechina.csdn.net/KnowledgePlanet/Lottery#-%E8%81%94%E7%B3%BB%E4%BD%9C%E8%80%85)
- [感谢支持](https://codechina.csdn.net/KnowledgePlanet/Lottery#-%E6%84%9F%E8%B0%A2%E6%94%AF%E6%8C%81)

## 📝 学习说明

在此项目中你会学习到互联网公司关于C端项目开发时候用到的一些，技术、架构、规范等内容。由于项目为实战类编程项目，在学习的过程中需要上手操作，小傅哥会把系统的搭建拉不同的分支列为每一个章节进行设计和实现并记录到开发日记中，读者在学习的过程中可以结合这部分内容边看文章边写代码实践。

- 技术：SpringBoot、Mybatis、Dubbo、MQ、Redis、Mysql、ELK、分库分表、Otter
- 架构：DDD 领域驱动设计、充血模型、设计模式
- 规范：分支提交规范、代码编写规范

## 🎨 环境配置

- **技术栈项**：JDK1.8、Maven3.6.3、Mysql5.7(可升级配置)，SpringBoot、Mybatis、Dubbo 随POM版本
- **建表语句**：[doc/asserts/sql](https://codechina.csdn.net/KnowledgePlanet/Lottery/-/blob/master/doc/assets/sql/lottery.sql) - `建议随非分支内sql版本走，因为需求不断迭代升级优化，直接使用最新的会遇到在各个分支下的代码运行问题`
- **代码仓库**：`2种使用方式`
   - 密码方式：登录的用户ID为 CSDN 个人中心的用户ID，[https://i.csdn.net/#/user-center/profile](https://i.csdn.net/#/user-center/profile) 密码为 CSDN 登录密码。如果没有密码或者忘记，可以在 CSDN 登录页找回密码。
   - SSH 秘钥免登录方式，设置：[https://codechina.csdn.net/-/profile/keys](https://codechina.csdn.net/-/profile/keys) 文档：[生成 SSH 密钥](https://codechina.csdn.net/codechina/help-docs/-/wikis/docs/ssh#%E7%94%9F%E6%88%90-ssh-%E5%AF%86%E9%92%A5)
- **学习使用**：下载代码库后，切换本地分支到wiki中章节对应的分支，这样代码与章节内容是对应的，否则你在master看到的是全量代码。   
- **下载依赖**：[db-router-spring-boot-starter](https://codechina.csdn.net/KnowledgePlanet/db-router-spring-boot-starter) 本项目依赖自研分库分表组件，需要下载后构建

## 📐 开发规范

**分支命名**：日期_姓名首字母缩写_功能单词，如：`210804_xfg_buildFramework`

**提交规范**：`作者，type: desc` 如：`小傅哥，fix：修复查询用户信息逻辑问题` *参考Commit message 规范*

```java
# 主要type
feat:     增加新功能
fix:      修复bug

# 特殊type
docs:     只改动了文档相关的内容
style:    不影响代码含义的改动，例如去掉空格、改变缩进、增删分号
build:    构造工具的或者外部依赖的改动，例如webpack，npm
refactor: 代码重构时使用
revert:   执行git revert打印的message

# 暂不使用type
test:     添加测试或者修改现有测试
perf:     提高性能的改动
ci:       与CI（持续集成服务）有关的改动
chore:    不修改src或者test的其余修改，例如构建过程或辅助工具的变动
```

## 🐾 学习作业

- 你可以在星球APP中提交`作业题目` | 网页提交：[https://t.zsxq.com/MvFYJe2](https://t.zsxq.com/MvFYJe2)

1. 今天的你学到了哪个章节？
2. 遇到什么问题？
3. 怎么解决的？
4. 掌握到了什么知识？

基于大家的学习反馈，小傅哥会在后续的直播中统一解决相关学习问题。加油，这趟车人人有收获！

注意️：按照作业提交频次和质量，小傅哥会组织一波奖品。**按照作业提交数量、质量、点赞、留言，综合评分，送技术图书等奖品。**

<img src="https://codechina.csdn.net/KnowledgePlanet/Lottery/-/raw/master/doc/_media/job.jpg" width="414" height="891"/>

- 也可以提交 issue：[https://codechina.csdn.net/KnowledgePlanet/Lottery/-/issues](https://codechina.csdn.net/KnowledgePlanet/Lottery/-/issues)

## 💬 联系作者

- **加群交流**

    本群的宗旨是给大家提供一个良好的技术学习交流平台，所以杜绝一切广告！由于微信群人满 100 之后无法加入，请扫描下方二维码先添加作者 “小傅哥” 微信(fustack)，备注：`Spring学习加群`。
    
    <img src="https://codechina.csdn.net/KnowledgePlanet/Lottery/-/raw/master/doc/_media/fustack.png" width="180" height="180"/>

- **公众号(bugstack虫洞栈)**

    沉淀、分享、成长，专注于原创专题案例，以最易学习编程的方式分享知识，让自己和他人都能有所收获。目前已完成的专题有；Netty4.x实战专题案例、用Java实现JVM、基于JavaAgent的全链路监控、手写RPC框架、DDD专题案例、源码分析等。
    
## 🎉 感谢支持

参与到项目开发学习过程中的小伙伴，可以通过PR提交个人对项目中学习过程中一些关于，代码优化、逻辑完善、问题修复等各项内容。当你的代码完整的提交以后，我会进行 `review` 通过以后进行合并以及记录你的提交信息。

<a href="#小傅哥">
    <img src="https://codechina.csdn.net/KnowledgePlanet/Lottery/-/raw/master/doc/_media/xiaofuge.jpeg" style="border-radius:5px" width="50px">
</a>
<a href="#倩倩">
    <img src="https://codechina.csdn.net/KnowledgePlanet/Lottery/-/raw/master/doc/_media/h_1.jpeg" style="border-radius:5px" width="50px">
</a>
<a href="#钢球">
    <img src="https://codechina.csdn.net/KnowledgePlanet/Lottery/-/raw/master/doc/_media/h_2.jpeg" style="border-radius:5px" width="50px">
</a>
<a href="#豆豆">
    <img src="https://codechina.csdn.net/KnowledgePlanet/Lottery/-/raw/master/doc/_media/h_3.jpeg" style="border-radius:5px" width="50px">
</a>
