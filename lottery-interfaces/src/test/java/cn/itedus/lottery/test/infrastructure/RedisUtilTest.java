package cn.itedus.lottery.test.infrastructure;

import cn.itedus.lottery.infrastructure.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description: Redis 使用测试
 * @author: 小傅哥，微信：fustack
 * @date: 2021/11/20
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisUtilTest {

    private Logger logger = LoggerFactory.getLogger(RedisUtilTest.class);

    @Resource
    private RedisUtil redisUtil;

    @Test
    public void test_set() {
        redisUtil.set("lottery_user_key","xiaofuge");
    }


    @Test
    public void test_get() {
        Object user = redisUtil.get("lottery_user_key");
        logger.info("测试结果：{}", JSON.toJSONString(user));

        /**
         * org.springframework.data.redis.RedisConnectionFailureException: Unable to connect to Redis; nested exception is io.lettuce.core.RedisConnectionException: Unable to connect to 39.96.73.167:6379
         *
         * 	at org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory$ExceptionTranslatingConnectionProvider.translateException(LettuceConnectionFactory.java:1689)
         * 	at org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory$ExceptionTranslatingConnectionProvider.getConnection(LettuceConnectionFactory.java:1597)
         * 	at org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory$SharedConnection.getNativeConnection(LettuceConnectionFactory.java:1383)
         * 	at org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory$SharedConnection.getConnection(LettuceConnectionFactory.java:1366)
         * 	at org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory.getSharedConnection(LettuceConnectionFactory.java:1093)
         * 	at org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory.getConnection(LettuceConnectionFactory.java:421)
         * 	at org.springframework.data.redis.core.RedisConnectionUtils.fetchConnection(RedisConnectionUtils.java:193)
         * 	at org.springframework.data.redis.core.RedisConnectionUtils.doGetConnection(RedisConnectionUtils.java:144)
         * 	at org.springframework.data.redis.core.RedisConnectionUtils.getConnection(RedisConnectionUtils.java:105)
         * 	at org.springframework.data.redis.core.RedisTemplate.execute(RedisTemplate.java:210)
         * 	at org.springframework.data.redis.core.RedisTemplate.execute(RedisTemplate.java:190)
         * 	at org.springframework.data.redis.core.AbstractOperations.execute(AbstractOperations.java:97)
         * 	at org.springframework.data.redis.core.DefaultValueOperations.get(DefaultValueOperations.java:54)
         * 	at cn.itedus.lottery.infrastructure.util.RedisUtil.get(RedisUtil.java:101)
         * 	at cn.itedus.lottery.test.infrastructure.RedisUtilTest.test_get(RedisUtilTest.java:37)
         * 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
         * 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
         * 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
         * 	at java.lang.reflect.Method.invoke(Method.java:498)
         * 	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
         * 	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
         * 	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
         * 	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
         * 	at org.springframework.test.context.junit4.statements.RunBeforeTestExecutionCallbacks.evaluate(RunBeforeTestExecutionCallbacks.java:74)
         * 	at org.springframework.test.context.junit4.statements.RunAfterTestExecutionCallbacks.evaluate(RunAfterTestExecutionCallbacks.java:84)
         * 	at org.springframework.test.context.junit4.statements.RunBeforeTestMethodCallbacks.evaluate(RunBeforeTestMethodCallbacks.java:75)
         * 	at org.springframework.test.context.junit4.statements.RunAfterTestMethodCallbacks.evaluate(RunAfterTestMethodCallbacks.java:86)
         * 	at org.springframework.test.context.junit4.statements.SpringRepeat.evaluate(SpringRepeat.java:84)
         * 	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
         * 	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:251)
         * 	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:97)
         * 	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
         * 	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
         * 	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
         * 	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
         * 	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
         * 	at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61)
         * 	at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:70)
         * 	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
         * 	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:190)
         * 	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
         * 	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
         * 	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)
         * 	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)
         * 	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)
         * Caused by: io.lettuce.core.RedisConnectionException: Unable to connect to 39.96.73.167:6379
         * 	at io.lettuce.core.RedisConnectionException.create(RedisConnectionException.java:78)
         * 	at io.lettuce.core.RedisConnectionException.create(RedisConnectionException.java:56)
         * 	at io.lettuce.core.AbstractRedisClient.getConnection(AbstractRedisClient.java:330)
         * 	at io.lettuce.core.RedisClient.connect(RedisClient.java:216)
         * 	at org.springframework.data.redis.connection.lettuce.StandaloneConnectionProvider.lambda$getConnection$1(StandaloneConnectionProvider.java:115)
         * 	at java.util.Optional.orElseGet(Optional.java:267)
         * 	at org.springframework.data.redis.connection.lettuce.StandaloneConnectionProvider.getConnection(StandaloneConnectionProvider.java:115)
         * 	at org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory$ExceptionTranslatingConnectionProvider.getConnection(LettuceConnectionFactory.java:1595)
         * 	... 43 more
         * Caused by: io.netty.channel.ConnectTimeoutException: connection timed out: /39.96.73.167:6379
         * 	at io.netty.channel.kqueue.AbstractKQueueChannel$AbstractKQueueUnsafe$2.run(AbstractKQueueChannel.java:561)
         * 	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
         * 	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:170)
         * 	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
         * 	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
         * 	at io.netty.channel.kqueue.KQueueEventLoop.run(KQueueEventLoop.java:293)
         * 	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
         * 	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
         * 	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
         * 	at java.lang.Thread.run(Thread.java:748)
         */
    }

}
