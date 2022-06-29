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

>` Lottery 抽奖系统` 是一款互联网面向C端人群营销活动类的抽奖系统，主要包含规则引擎过滤，活动玩法，抽奖策略，奖品发放等四大领域模块，在使用的过程中运营人员通过创建概率类奖品的抽奖玩法，对用户进行拉新、促活、留存。

 ### 项目细节

- 构建以DDD分层结构的处理⽅式，搭建整个抽奖系统架构。

- 使用组合模式搭建用于量化人群的规则引擎，用于用户参与活动之前，通过规则引擎过滤性别、年龄、首单消费、消费金额、忠实用户等各类身份来量化出具体可参与的抽奖活动。
- 声明事务领取活动领域开发

- 运用Redis库存分⽚和秒杀滑动库存分块
- 自制路由组件db-router-springboot-starter实现分库分表

- 使用kafka分布式消息组件异步调用，解耦抽奖流程比如：异步更新库存，异步发货，缩短抽奖时间从而提高用户体验。

- 整合xxl-job分布式任务调度以对mq异步发货失败的补偿；扫描并变更活动状态。
- 门面接口封装和对象转换，使用mapstruct进行对象转换，防污处理。

### 启动步骤

1. 启动本地xxl-job任务调度中心。

2. 在云服务器上启动kafka消息队列(注意防火墙有无打开端口，阿里云服务器还需在安全组开设端口)

3. 在云服务器上启动redis（注意端口得在防火墙打开，否则无法连接成功）
4. 最后启动在lottery-interfaces中启动`LotteryApplication.java`（查看lottery-interfaces中application.yml，确保上述三个服务的服务器地址以及mysql数据库的用户名和密码都正确）