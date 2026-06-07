---
title: "监控与日志规范"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/03-logger-spec"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 12
---

# 监控与日志规范

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/03-logger-spec | 所属：协议

# [](#监控与日志规范)监控与日志规范

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan1.31b7ef45.png)

## [](#1-日志体系)1. 日志体系

MDF框架代码已经对日志进行了分级控制，并且做了相关的日志的动态输出控制、日志定时存储、信息上报等机制，在MDF框架代码的开发过程中，针对trace、debug、log、info、warn、error六种console日志的输出，不可再使用原生console进行日志打印，需要统一走cb.console.xx进行日志输出，并且要遵守相关输出规则。

### [](#11-前端日志)1.1. 前端日志

#### [](#111-日志输出规范)1.1.1. 日志输出规范

- 开发态的日志不允许上传到任何环境上，本地开发调试完要删除后在提代码
- 所有console方法的第一个参数中不允许出现对象结构，如event对象、error对象、HTMLDOM等，避免因为记录工具无法识别相关内容导致全部日志上报异常，如有需要控制台查看的对象数据，从第二个参数开始打印，如需上报的数据为对象结构，需要通过JSON.stringfy转化成为字符类型
- 如果涉及到中文日志的，需要在后面加一下 // @notranslate跳过多语的翻译，避免多语转化造成性能影响
- 需要使用cb.debug判断为前提打印的，无需书写cb.debug，直接使用cb.console.debug(xxx)代替
- 如果只是json解析的try
catch的catch中error打印，统一使cb.utils.parseCStyle，框架在cb.utils.parseCStyle中有统一的异常捕获等处理

#### [](#112-日志输出推荐及日志内容规范)1.1.2. 日志输出推荐及日志内容规范

- 必要情况下，需要打印并记录接口返回状态的使用cb.console.trace，因trace体积问题，非必要情况尽量使用其他console替代
- 需要输出相关调试信息等的请使用cb.console.debug进行日志输出,输出内容结构为：cb.console.debug('[方法名]：日志内容 +
调试信息'，对象结构的输出数据)
- 需要输出代码运行过程中相关日志，如某个方法调用成功、失败、完成等状态的使用cb.console.log进行日志记录，结构为：cb.console.log([方法名]：日志内容 '， 对象结构的输出数据)
- 需要输出代码运行过程中生命周期等重要信息的场景使用cb.console.info，结构为：cb.console.info('[方法名]:
日志内容 '， 对象结构的输出数据)
- 需要输出代码运行过程中警告错误的场景使用cb.console.warn，结构为：cb.console.warn('[方法名]：警告内容'， 对象结构的输出数据)
- 需要打印代码运行过程中阻塞类错误等相关信息的，使用cb.console.error，结构为：cb.console.error(Error编码, '[文件名]: [方法名]: 日志内容 '，对象结构的输出数据)，第一个参数是错误编码，错误码参见：《[iuap-前端开发规范红皮书](https://docs.diwork.com/l/150b959888b3)》 章节：3.14.2 错误码表

#### [](#113-非标准日志打印代码检查)1.1.3. 非标准日志打印代码检查

目前通过huskey控制的代码范围：

- mdf-app
- mdf-cube
- mdf-baseui
- mdf-baseui-mobile
- mdf-metaui-web
- mdf-metaui-mobile

领域代码目前未进行代码检查管控

#### [](#114-日志上报策略)1.1.4. 日志上报策略

- 日志级别：7个级别，ALL < TRACE < DEBUG < INFO < WARN < ERROR < OFF
- 全局配置项：logLevel，默认ERROR，支持按环境、租户和用户配置
- 其中ERROR级别日志会上报YMC，默认开启
- 其它级别仅会收集到indexedDB，默认不开启，indexedDB中收集的日志受全局日志级别配置项影响

#### [](#115-日志查看)1.1.5. 日志查看

以上通过console.error或cb.console.error打印的日志可以YMC中查看，步骤如下：

- 登录个人账号后打开
[https://ymc.xxx.com](https://ymc.xxx.com/)
，如果提示没有权限请到YMC暖心群里申请权限
- 点击用户洞察 → 错误分析，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan2.9c868ef0.png)

- 按时间和条件查询前端日志，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan3.e0f81b13.png)

### [](#12-node端日志)1.2. Node端日志

- 日志级别：共9个级别，LOG_LEVEL默认ERROR （ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL < MARK < OFF）
- 日志查看：通过YMC在MDF服务中查看日志
- 日志调试：请求URL中添加debugLogs=true可打印本请求所有级别日志（需要打开开关）

## [](#2-监控体系)2. 监控体系

### [](#21-高优异常报警)2.1. 高优异常报警

#### [](#211-前端高优异常报警)2.1.1. 前端高优异常报警

报警信息会推送到「行为日志前端高优异常报警群-核心2生产环境」群，性能优化部门会对监控到的异常录Jira推进解决

#### [](#212-node端高优异常报警)2.1.2. Node端高优异常报警

*实现中*

#### [](#213-大数据量请求预警)2.1.3. 大数据量请求预警

- Node服务对上行流量有50M限制，下行流量无限制但不宜过大
- 上行流量大于3M数据传输打预警日志，下行流量大于8M数据传输打预警日志

### [](#22-使用信息埋点统计)2.2. 使用信息埋点统计

#### [](#221-埋点api)2.2.1. 埋点API

统计某个信息的使用次数,常用于统计某个组件/方法的调用频率，在需要埋点的组件、方法内调用下面的API，当组件被加载/方法被调用的时候就会自动上报，API调用时需要传入一个参数msg，msg为字符串类型，作为要上报的详细内容，常用于说明当前统计的是哪个组件（方法）被使用了，也可传递自定义的内容，API使用示例如下：

cb.uba.frequency(msg)

#### [](#222-统计查看)2.2.2. 统计查看

- 

按照1.1.5的方式进入YMC首页

- 

点击用户洞察-事件查询，如下图：
 
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan4.875d32db.png)

- 

输入事件类型：MDFFrequency

- 

增加其他搜索条件，搜索结果如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan5.a4511746.png)

- 点击详情查看详细内容

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan6.468f3066.png)

- 如果想要查看某个特定的message，可以在最下面的业务扩展里输入扩展条件，K为特定字符"message"，V为API调用时候传入的字符串，此操作支持模糊搜索，示例图如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan7.8afd2949.png)

### [](#23-使用次数埋点统计)2.3. 使用次数埋点统计

#### [](#231-埋点api)2.3.1. 埋点API

统计某个code的使用次数，常用于统计某个Action的调用频率，使用时需要传递一个参数code，code为字符串类型，含义为需要被统计次数的编码，API使用示例如下：

cb.uba.frequencyCount(code)

#### [](#232-统计查看)2.3.2. 统计查看

- 按照1.1.5的方式进入YMC首页
- 点击哈勃监控-行为日志分析

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan8.2ea3af93.png)

- 在下图所示位置录入特定查询sql进行查询，示例sql如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan9.533e2dc5.png)

- 下面示例sql中的ecid为上报时传递的code编码，将ecid修改为对应编码即可，其他sql语句为固定写法

- and en: YCount and ecbiz:MDFFrequencyCount and ecid: roundingdepends
| select ecid, sum(cast(cnt as bigint)) as totalCnt GROUP by ecid order
by totalCnt desc

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan10.26d8d833.png)

- 查询示例图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan11.10783a1b.png)

- 也可通过查询/分析按钮上方的时间范围选择进行扩大/缩小查询周期

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiankongrizhiyuguifan12.04aabaef.png)