线程池 yms-executors 实践
最后更新时间：2025-05-20
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	是
私有云	客户化定制开发	是
专属云	客户化定制开发	是
本地部署	客户化定制开发	是
公有云	ISV生态开发	是
私有云	ISV生态开发	是
专属云	ISV生态开发	是
本地部署	ISV生态开发	是
业务场景

通过使用YMS线程池可以做到以下优势（使用场景）：第一：降低资源消耗。通过重复利用已创建的线程降低线程创建和销毁造成的消耗。第二：提高响应速度。当任务到达时，任务可以使用已创建的线程立即执行，降低时间开销。第三：提高线程的可管理性。线程是稀缺资源，如果无限制的创建，不仅会消耗系统资源，还会降低系统的稳定性，使用线程池可以进行统一的分配，调优和监控。

关键词

YMS、线程池、死锁、YmsExecutors

YMS线程池接入
引入Maven依赖

yms线程池默认由yms-basecomp-starter引入，不需要单独引入。如需单独引入，其依赖坐标如下：

<dependency>
<groupId>com.yonyou.iuap</groupId>
<artifactId>yms-basecomp-api</artifactId>
</dependency>
<dependency>
<groupId>com.yonyou.iuap</groupId>
<artifactId>yms-basecomp-sdk</artifactId>
</dependency>

获取YMS线程池

为了减少运行时的线程数量，yms提供了统一线程池。后台持续性或周期性常驻任务建议接入事件中心、调度任务，禁止使用yms线程池执行这些常驻任务。

yms线程池获取入口类：iuap.yms.thread.api.YmsExecutors

目前有6个获取线程池的方法，其获取方式和对应的线程池说明如下：

// 带有上下文传递功能，用于执行短时任务的线程池： ContextExecutor
ExecutorService es = iuap.yms.thread.api.YmsExecutors.getYmsExecutor(); // 8.0.1版本
IYmsExecutorService es = iuap.yms.thread.api.YmsExecutors.getYmsExecutor(); // 8.1.0及后续版本


// 没有上下文传递功能，用于执行短耗时任务的线程池：  OriginExecutor
// 该线程池已不推荐使用，将在未来版本进行移除。请使用ContextExecutor或LongTaskExecutor线程池进行替代。
ExecutorService es = iuap.yms.thread.api.YmsExecutors.originExecutor(); // 8.0.1版本
IYmsExecutorService es = iuap.yms.thread.api.YmsExecutors.originExecutor(); // 8.1.0及后续版本


// 带有上下文传递功能，用于执行长耗时任务的线程池：  LongTaskExecutor
ExecutorService es = iuap.yms.thread.api.YmsExecutors.getLongTaskContextExecutor(); // 8.0.1版本
IYmsExecutorService es = iuap.yms.thread.api.YmsExecutors.getLongTaskContextExecutor(); // 8.1.0及后续版本

// 带有上下文传递功能，加速线程池（队列大小为0，拒绝策略CallerRun，保证提交的任务会立即执行）：ImmediateExecutor
// 注意：此线程池只提供给平台的二方包使用
IYmsExecutorService es = iuap.yms.thread.api.YmsExecutors.getImmediateExecutor(); // 8.1.0及之后版本

// 用于并行计算的线程池，没有上下文传递功能。ForkJoinPool
ForkJoinPool forkJoinPool = iuap.yms.thread.api.YmsExecutors.getYmsForkJoinPool();

// 用于执行定时任务的线程池，没有上下文传递功能。ScheduledExecutor
ScheduledExecutorService ses = iuap.yms.thread.api.YmsExecutors.getYmsScheduledExecutor();  // 8.0.1版本
IYmsScheduledExecutorService ses = iuap.yms.thread.api.YmsExecutors.getYmsScheduledExecutor();  // 8.1.0及后续版本


额外说明：

上下文传递功能指的是在任务执行的线程中可以像主线程一样拿到上下文信息。比如在任务中通过com.yonyou.iuap.context.InvocationInfoProxy#getTenantid方法，可以拿到租户id。没有上下文传递功能，则拿不到租户id。
短耗时和长耗时任务的大致界定范围，耗时小于3秒的为短耗时任务，大于3秒的为长耗时任务。
getLongTaskContextExecutor、getYmsScheduledExecutor这个两个线程池是在iuap-2nd-party 7.10.0、iuap-boot-starter 5.10.0及后续版本开始提供的。
以上提供的yms线程池，均接入了ymc监控。

注意事项：

yms线程池在合包场景下所有服务共享使用的，因此禁止对以上提供的各个线程池执行shutdown()和shutdownNow()操作。
在使用共享线程池的情况下，异步任务中开启新异步任务，且这两类异步任务都使用同一个线程池是一个危险操作。如有这样使用场景的业务方，请一定分析好逻辑是否合理和是否会产生线程池任务死锁。

常见的死锁场景：异步任务A新建了异步任务B，且他们都提交给了同一个线程池，任务A通过get()/join()等方式需要等待B执行完成后才返回结果。此时如果线程池的所有线程被A类任务占据，B类任务被放入到任务队列中，那么B类任务将一直得不到调度，A类任务因为B没有执行完成而一直等待，从而造成线程池中所有线程被阻塞的死锁问题。

YMS线程池使用说明
YMS线程池的类型

YMS线程类型分为：

ExecutorService适用于需要执行大量独立任务，且对任务执行顺序没有严格要求，同时需要管理线程池生命周期的场景；
ForkJoinPool适用于需要执行大量可以分解为子任务的任务，如大规模数据处理、图像处理、科学计算等；
ScheduledExecutorService适用于需要定时或周期性执行任务的场景，如定时备份、定时发送邮件、定时监控系统状态等；
YMS ExecutorService使用说明

这类线程池有三种，分别是：

IYmsExecutorService es =

iuap.yms.thread.api.YmsExecutors.getYmsExecutor();

IYmsExecutorService es =

iuap.yms.thread.api.YmsExecutors.originExecutor();

IYmsExecutorService es =

iuap.yms.thread.api.YmsExecutors.getLongTaskContextExecutor();

IYmsExecutorService是JDK中ExecutorService的子接口，具备ExecutorService的所有功能。同时该接口提供了获取线程池内部状态的各种get方法，具体的方法可以参考源码。

YMS ForkJoinPool使用说明

这类线程池的获取方式：ForkJoinPool forkJoinPool = iuap.yms.thread.api.YmsExecutors.getYmsForkJoinPool();

其使用方式与JDK中的使用方式有略微差异。主要是：

在业务定义RecursiveAction或RecursiveTask的compute()方法内拆分任务时，对新定义的RecursiveAction或RecursiveTask进行包装。

使用YmsContextWrappers#wrapRecursiveAction对业务定义的RecursiveAction包装
使用YmsContextWrappers#wrapRecursiveTask对业务定义的RecursiveTask包装

YmsContextWrappers包装的目的是，将线程加入到ymc监控并设置好相应的classloader（避免合包时出现线程的classloader和所在模块不一致。

拆分任务编程示例如下：

@SneakyThrows
@Test
public void forkJoinPoolTest() {
ForkJoinPool forkJoinPool = YmsExecutors.getYmsForkJoinPool();
// 初始任务不需要进行包装，yms的ForkJoinPool会自动进行包装。
SumRecursiveTask task = new SumRecursiveTask(0, 2000);
Future<Long> future = forkJoinPool.submit(task);
long result = future.get();
Assert.assertEquals(2001000, result);
}

class SumRecursiveTask extends RecursiveTask<Long> {
private static final long THRESHOLD = 100L;
private final long start;
private final long end;

public SumRecursiveTask(long start, long end) {
this.start = start;
this.end = end;
}

@Override
protected Long compute() {
long length = end - start;
//计算
if (length < THRESHOLD) {
long sum = 0;
for (long i = start; i <= end; i++) {
sum += i;
}
return sum;
} else {
//拆分
long middle = (start + end) / 2;
// 新拆分的任务，需要手动进行包装
RecursiveTask<Long> left = YmsContextWrappers.wrapRecursiveTask(new SumRecursiveTask(start, middle));
RecursiveTask<Long> right = YmsContextWrappers.wrapRecursiveTask(new SumRecursiveTask(middle + 1, end));
left.fork();
right.fork();
return left.join() + right.join();
}
}
}

YMS ScheduledExecutorService使用说明

这类线程池的获取方式：IYmsScheduledExecutorService ses = iuap.yms.thread.api.YmsExecutors.getYmsScheduledExecutor();

IYmsScheduledExecutorService是JDK中ScheduledExecutorService的子接口，具有ScheduledExecutorService的所有功能。同时该接口和提供了用户获取线程池内部状态的各种get方法，具体的方法可以参考源码。

YMS线程池增强能力
任务粒度的拒绝策略

由于各个服务对共享线程池的拒绝策略需求不同，统一的设置拒绝策略无法满足各种使用场景，甚至导致业务间相互影响的问题，因此yms线程池的拒绝策略统一使用ABORT_POLICY策略，不再提供外部配置的能力。

同时为了满足个性化的拒绝策略场景，我们针对ContextExecutor、OriginExecutor、LongTaskExecutor提供了任务粒度拒绝策略的支持。

为此我们提供了YmsThreadRunnable和YmsThreadCallable两个包装类，使用方需要把自己的任务和任务相对应的拒绝策略传给包装类。然后使用包装后的任务进行任务提交。

注意：使用YmsThreadRunnable和YmsThreadCallable包装类，一定要确保在提交任务的时候，这两个包装类是最外层的包装。即业务自己的任务包装类，只能包装在YmsThreadRunnable和YmsThreadCallable里面，而不能包装在这两个包装类的外面。

编程示例如下（YmsThreadCallable用法类似）：

// 原任务
Runnable task = () -> {
try {
TimeUnit.SECONDS.sleep(5);
} catch (InterruptedException e) {
throw new RuntimeException(e);
}
};

// 任务粒度的拒绝策略
RejectedExecutionHandler taskHandler = (r, executor) -> {
throw new RuntimeException("true");
};

// 封装任务和拒绝策略
YmsThreadRunnable ymsThreadRunnable = new YmsThreadRunnable(task);
ymsThreadRunnable.setRejectedExecutionHandler(taskHandler);

// 提交任务
YmsExecutors.getYmsExecutor().submit(ymsThreadRunnable);

支持任务Id

Yms线程池都是共享的，会执行不同场景的任务。当任务中打印日志、抛出异常，或任务被拒绝时很难区分任务的来源，因此我们引入了任务Id的功能。与任务粒度拒绝策略一样，任务id同样依赖YmsThreadRunnable和YmsThreadCallable两个包装类。

使用方可以把同一场景的任务使用相同的任务Id进行标识。
当在线程池中打印任务信息时，会附带任务Id，方便区分任务来源。
在执行任务的时候，任务Id也会被设置到线程名中，作为线程名的一部分。这样任务中打印的日志，可以区分不同的任务来源。

任务Id的设置方法示例（YmsThreadCallable用法类似）：

// 原任务
Runnable task = () -> {
try {
TimeUnit.SECONDS.sleep(5);
} catch (InterruptedException e) {
throw new RuntimeException(e);
}
};
// 任务Id
String taskId= "testTaskId";

// 封装任务和任务Id
YmsThreadRunnable ymsThreadRunnable = new YmsThreadRunnable(task, taskId);

// 提交任务
YmsExecutors.getYmsExecutor().submit(ymsThreadRunnable);

获取线程池内部状态

IYmsExecutorService接口还提供了获取线程池内部状态的各个getter方法。例如getPoolSize()、getCompletedTaskCount()等。具体的方法可参考IYmsExecutorService源码。

最大线程数优先

最大线程数优先是在8.1.0开始引入的新特性，默认开启。需要关闭时把对应线程池的配置项maximumPoolSizeFirst置为false即可。具体可参考下文中配置项章节。

传统JDK线程池提交任务时启用线程数的流程是（如下左图）：

当前线程数未达到核心线程数时，启用新线程。
当前线程数达到核心线程数时，如果任务队列未满，则放入队列中。
如果任务队列已满，当前线程数未达到最大线程数时，启用新线程。
如果当前线程数也已达到最大线程数，则触发拒绝策略。

启用了最大线程数优先的yms线程池，提交任务时启用线程数的流程是（如下右图）：

当前线程数未达到核心线程数时，启用新线程。
当前线程数达到核心线程数，但队列长度未达到启用最大线程数的阈值时（此阈值配置，具体参考下文中的线程池配置），放入队列中。
当前线程数达到核心线程数，且列长度达到启用最大线程数的阈值时，但线程数未达到最大线程数，启用新的线程。
当前线程数达到最大线程数，但队列未满，放入队列中。
当前线程数达到最大线程数，且队列已满，则触发拒绝策略。

以上两种线程池超出核心线程数的线程都会在空闲keepAliveTime时间后，被销毁。

YMS线程池健康检查

yms线程池已接入了健康检查功能，使用此功能可以获取到服务当前Yms线程池的状态。

使用方式，直接访问如下地址：http://服务地址/_yms/healthy

注意：此地址中不包含ContextPath，即服务配置了ContextPath，也不应该写在此地址的URL中。

如果服务存在多个实例，想看某个实例的指标结果。可以直接在该实例的容器控制台上执行命令：curl http://localhost:8080/_yms/healthy

任务预警
任务队列水位预警

yms的context、origin、longTask三类线程池支持任务队中达到总容量一定百分比的时候进行预警（日志打印）。此百分比阈值可以进行配置，默认为80%，具体配置详情请参考线程池配置章节。

预警日志样例：

警告：yms线程池**[YmsLongTaskThreadPool]**的任务队列长度达到了总容量的80%，请及时关注！与上次预警间隔：60017ms，期间共超出警戒阈值5216次

当服务中出现这类的日志信息时，就表示可能线程池的配置不能很好的满足当前的业务场景，这时需要及时调整对应线程池的配置。

也可在ymc的日志分析服务上进行预警日志的搜索。测试日常预发环境的Ymc监控中心地址：https://ymc.yyuap.com/#/hubble/log-center/business-log

日志过滤条件：level: ERROR and message: 警告：yms线程池

and logger: "iuap.yms.thread.YmsThreadTaskQueue"

过滤结果示例：

任务拒绝日志打印

yms线程池在任务被拒绝时会打印ERROR级别的日志。

日志样例：

任务被拒绝了，将使用统一的拒绝策略！ThreadPoolName:YmsLongTaskExecutor, 核心参数:[corePoolSize:20,maximumPoolSize:100,queueSize:2000], Task:com.yonyou.iuap.context.YmsContextRunnable@30296827

**任务被拒绝了，将使用自定义的拒绝策略！ThreadPoolName:YmsLongTaskExecutor, 核心参数:[corePoolSize:20,maximumPoolSize:100,queueSize:2000], Task:com.yonyou.iuap.context.YmsContextRunnable@**2b12f418

当服务中出现这类的日志信息时，就表示Yms线程池已出现任务拒绝的情况，需要分析是否对业务会产生影响，并确定是否需要调整线程池的配置。

可在ymc的日志分析服务上进行预警日志的搜索。

日志过滤条件：level: ERROR and message: 任务被拒绝了

and logger: "i.yms.thread.YmsThreadPoolExecutor"

过滤结果示例：

线程池配置
配置方式

iuap-2nd-party 7.10.0版本（对应iuap-boot-starter 5.10.0版本）及之前：只支持从System中取配置，配置位置在yms控制台配置项的YONBIP节点下system类型配置。

iuap-2nd-party 7.11.0版本（对应iuap-boot-starter 5.11.0版本）开始：支持System的全局配置和微服务级别的配置。在合包部署场景下，强制使用YONBIP下system类型的全局配置；在单包部署的场景下，优先使用微服务级的配置，微服务没有的配置项则使用全局的System配置。

iuap-2nd-party 7.11.0版本版本后，在公用云单包部署的场景下，鼓励各领域按照自身实际需求去配置Yms线程池参数。

iuap-2nd-party 8.0.1版本支持了线程池配置的热更新，但热更生效的前提是启用了动态拉取配置：yms.bootstrap.dynamic 该配置项默认为true，只要没有配置false,即为启用动态拉取配置。

配置项和说明

线程池的类型越来越多，为了是配置更清晰，我们对配置项按照线程池类型进行了分组。新的配置项如下：

普通线程池配置：

配置项	说明	默认值
threadPoolName	线程池中的线程名前缀	YmsThreadPool（8.0.0版开始支持）
threadGroup	线程池中线程的线程组名	YmsThreadGrp（8.0.0版开始支持）
corePoolSize	核心线程数	2*CPU核数，且不小于20
prestartAllCoreThreads	是否预启动核心线程	false（8.0.0版开始支持）
keepAliveTime	空闲线程存活时间	60
keepAliveTimeUnit	空闲线程存活时间的单位	SECONDS
maximumPoolSize	最大线程数	200
maxQueueSize	任务队列最大容量	10000
allowCoreThreadTimeOut	是否允许核心线程在空闲keepAliveTime时间后关闭	false（8.0.0版开始支持）

长耗时任务线程池配置：

配置项	说明	默认值
longTaskThreadPoolName	线程池中的线程名前缀	YmsLongTaskThreadPool（8.0.0版开始支持）
longTaskThreadGroup	线程池中线程的线程组名	YmsLongTaskThreadGrp（8.0.0版开始支持）
longTaskCorePoolSize	核心线程数	2*CPU核数，且不小于20
longTaskPrestartAllCoreThreads	是否预启动核心线程	false（8.0.0版开始支持）
longTaskKeepAliveTime	空闲线程存活时间	60
longTaskKeepAliveTimeUnit	空闲线程存活时间的单位	SECONDS
longTaskMaximumPoolSize	最大线程数	200
longTaskMaxQueueSize	任务队列最大容量	10000
longTaskAllowCoreThreadTimeOut	是否允许核心线程在空闲longTaskKeepAliveTime时间后关闭	false（8.0.0版开始支持）

ForkJoinPool任务线程池配置：

配置项	说明	默认值
forkJoinParallelism	并行度级别	10（8.0.0版开始支持）
forkJoinExceptionHandler	由于执行任务时遇到的不可恢复的错误而终止的内部工作线程的处理程序。配置的内容：类的全路径名。	NULL（8.0.0版开始支持）
forkJoinWorkerName	执行任务的worker名前缀。	YmsForkJoinPool-（8.0.0版开始支持）

Scheduled线程池配置：

配置项	说明	默认值
scheduledThreadPoolName	线程池中的线程名前缀	YmsScheduledThreadPool（8.0.0版开始支持）
scheduledThreadGroup	线程池中线程的线程组名	YmsScheduledThreadGrp（8.0.0版开始支持）
scheduledCorePoolSize	核心线程数	2*CPU核数，且不小于20
scheduledPreStartAllCoreThreads	是否预启动核心线程	false（8.0.0版开始支持）
executeExistingDelayedTasksAfterShutdown	在池关闭之后是否继续执行已经存在的延迟任务	true
continueExistingPeriodicTasksAfterShutdown	在池关闭之后是否继续执行已经存在的周期任务	false
removeOnCancel	任务取消后是否应该从队列中移除最大线程数	false
scheduledAllowCoreThreadTimeOut	是否允许核心线程在空闲scheduledKeepAliveTime时间后关闭	false（8.0.0版开始支持）
scheduledKeepAliveTime	空闲线程存活时间，仅在scheduledAllowCoreThreadTimeOut为true时生效，且不能小于0	60（8.0.0版开始支持）
scheduledKeepAliveTimeUnit	空闲线程存活时间的单位，仅在scheduledAllowCoreThreadTimeOut为true时生效	SECONDS（8.0.0版开始支持）

注：目前还兼容8.0.1版本之前的配置项，但在将来版本可能会移除对旧配置项的兼容（8.3.0版本开始已移除），鼓励使用方向新的配置方式上迁移。当某个参数同时存在新旧配置项时，配置项优先级顺序：新配置项>旧配置项>默认值。

新配置项的书写方式：公共前缀.线程池类型.配置项=Value 例如配置普通带上下文传递线程核心线程数：yms.thread.contextExecutor.corePoolSize=20

常见问题
怀疑关于YMS线程池的配置未生效？

线程池的健康检查可以反应出部分指标，可以通过健康检查验证定义配置是否生效。

还想看更加全面的实际线程池配置值的话，可以通过arthas命令：vmtool -x 2 --action getInstances --className iuap.yms.thread.YmsExecutorConfig --express 'instances[0]' 来查看线程池配置对象的属性值。观察配置对象中的属性与自己配置的内容是否一致。

其中关线程池配置对象属性值的部分截图如下：

常见的配置未生效原因：

线程池配置配置在服务的配置项中或配置文件中，这种服务级配置只在单包部署的情况下生效。如果在简强环境是合包部署的情况下，服务级线程配置是不生效的。

如何进行健康检查

通常可以在容器控制台通过命令：curl http://localhost:8080/_yms/healthy 获取yms组件的健康检查信息，其中就包括线程池组件。下面列出的使健康检查输出的部分内容：

# HELP thread-currentThreadCount 当前线程数 piece
# TYPE thread-currentThreadCount GAUGE
thread-currentThreadCount{meterName="YmsThread-ContextExecutor",} 16.0
# HELP thread-coreThreadSize 核心线程数 piece
# TYPE thread-coreThreadSize GAUGE
thread-coreThreadSize{meterName="YmsThread-ContextExecutor",} 16.0
# HELP thread-maxThreadSize 最大线程数 piece
# TYPE thread-maxThreadSize GAUGE
thread-maxThreadSize{meterName="YmsThread-ContextExecutor",} 100.0
# HELP thread-activeThreadCount 正在执行任务的线程数 piece
# TYPE thread-activeThreadCount GAUGE
thread-activeThreadCount{meterName="YmsThread-ContextExecutor",} 0.0
# HELP thread-completedTaskCount 完成任务数 piece
# TYPE thread-completedTaskCount GAUGE
thread-completedTaskCount{meterName="YmsThread-ContextExecutor",} 978.0
# HELP thread-threadAliveTime 空闲线程存活时间 s
# TYPE thread-threadAliveTime GAUGE
thread-threadAliveTime{meterName="YmsThread-ContextExecutor",} 60.0
# HELP thread-queueCurrentCount 任务队列中任务数量 piece
# TYPE thread-queueCurrentCount GAUGE
thread-queueCurrentCount{meterName="YmsThread-ContextExecutor",} 0.0
# HELP thread-queueCapacity 任务队列总容量 piece
# TYPE thread-queueCapacity GAUGE
thread-queueCapacity{meterName="YmsThread-ContextExecutor",} 2000.0
# HELP thread-healthScore 健康分数 piece
# TYPE thread-healthScore GAUGE
thread-healthScore{meterName="YmsThread-ContextExecutor",} 100.0
...


以第一个指标为例

# HELP thread-currentThreadCount 当前线程数 piece
# TYPE thread-currentThreadCount GAUGE
thread-currentThreadCount{meterName="YmsThread-ContextExecutor",} 16.0

第一行表示该指标的中文含义。

第二行表示该指标的类型。

第三行表示该指标的具体内容。其中meterName="YmsThread-ContextExecutor"表示该指标是普通线程池的指标。“16.0”表示Yms普通线程池的当前线程数为16。

其余的指标信息获取类似，其中8.3.0版本对指标的命名有变动，但读取方式是一致的。

YMS线程池阻塞问题如何排查

当发现服务提交的任务一直未执行，通过健康检查发现该线程池的完成任务数也不再变动。或新提交的任务频繁触发拒绝策略。那么该线程池中所有线程大概率都被阻塞了。阻塞的原因可能有：

线程池不当的使用导致了线程池死锁。
线程池被由阻塞等待的任务占满了，且这些任务都处于阻塞状态中，导致线程得不到释放。这个在8.3.0版本增加了任务超时预警功能，在任务执行耗时过长时，线程池会打印任务的相关信息。

解决方式：主动排查阻塞线程

可以通过java自带的jstack命令或arthas的thread命令找出阻塞线程。

其中yms线程池中线程命名前缀如下：

普通带上下文传递线程池：YmsContextExecutor
普通不带上下文传递线程池：YmsOriginExecutor
长耗时任务线程池：YmsLongTaskExecutor
立即执行（加速）线程池：YmsImmediateExecutor
ForkJoin线程池：YmsForkJoinPool
调度线程池：YmsScheduledExecutor

可以通过线程名前缀过滤出关注的线程池线程。重点关注WATING和TIMED_WAITING状态的线程，然后根据线程的调用栈确定线程的阻塞位置。

YMS线程池未传递上下文怎么办

yms线程池不会传递ExtendAttributes中自定义添加的内容。

上下文传递中进行传递的上下文内容有：

MDC、linkTrace、线程的ContextClassLoader
InvocationInfoProxy可以直接获取到的属性和部分ExtendAttributes中内置的内容。

任务的执行实际不是在YMS线程池中。

可以通过调试、日志打印、arthas相关命令等方式确定任务中当前线程名是不是符合Yms线程池中线程的命名规则来确认。

造成此问题的常见的形式有：

一个任务调用了@Async注解修饰的方法，在该方法中发现未传递上下文。

提交的任务是com.yonyou.iuap.context.ContextUnaware接口的实现类。

该接口标识其任务不需要传递上下文，故而Yms线程池对提交的任务进行上下文传递包装时，会忽略掉实现com.yonyou.iuap.context.ContextUnaware的任务。

线程池死锁如何检测日志

日志内容：

“线程池死锁检测：当前任务在往同一个线程池中提交子任务，可能会导致线程死锁的问题。如果确定自己的业务逻辑没有问题，可以忽略此日志。或通过yms.thread.threadDeadlockCheck=false配置来关闭此日志！线程池：{}”

日志说明：

此日志是在一个任务往其线程池中提交子任务时进行的打印（做了频率限制），即该任务和子任务使用同一个线程池时打印此日志。
任务和子任务使用同一个线程池是不推荐的使用方式。如果该任务通过get/join等方法等待子任务执行完成，则会有线程池死锁的风险。如果该任务不需等待子任务执行完成，则没有线程池死锁的风险。
排查自己的业务逻辑，如果没有线程池死锁的风险，且想继续任务和子任务使用同一个线程池。可通过配置项yms.thread.threadDeadlockCheck=false来关闭此日志。
线程池死锁异常如何排查

异常内容：

异常编码：014-040-167048

异常信息：

“当前任务在往同一个线程池中提交子任务，且通过Future的get方法等待任务结果。此操作会在任务量高时，会导致线程池死锁。请及时调整业务逻辑！”

异常说明：

此异常是在任务和子任务使用同一个线程池，且该任务通过get等方法等待子任务执行完成时抛出的。
此操作会在任务量高时，导致线程池死锁的问题。如果出现此异常请务必根据调用栈，确定代码位置，并进行调整。如果是二方包中使用的，请联系相关负责人进行处理。