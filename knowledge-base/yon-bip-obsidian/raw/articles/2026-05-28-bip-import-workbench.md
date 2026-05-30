参照
导入导出
统一导入工作台
在导出工作台配置导出类型
打印
对象建模
编码规则
调度任务
监控与预警
日志
消息平台
工作台
事件中心
文件服务
YonBuilder应用开发
前端开发
后端开发
移动开发
安全
数据库
DevOps技术
容器云技术
区块链云技术
YMS开发
智能应用开发
专项开发
成果迁移
技术方案
最佳实践
参考手册
常见问题
视频教程
专业开发/开发指南/导入导出/统一导入工作台
统一导入工作台
最后更新时间：2024-02-20
基本概念
背景

云业务在国内已是常用态，不同规模公司都逐渐云业务量增多。面对如此上线实施工作量趋势，统一导入服务工作台提供给客户便捷管理的系统初始化导入数据工作台。

对于一些中小企业来说，没有多余的资金为实施付费，也不愿意为实施付费。统一导入服务工作台采用引导式交互，对掌握系统数据结构快速入门。

企业的业务发展迅速，只有加快实施速度才能跟住业务的步伐，满足企业管理的迫切需要。统一导入服务工作台提供集中的数据导入快捷入口。

名词解释

统一导入服务：统一导入服务工作台对应微服务。

业务服务：与统一导入服务进行功能对接的服务统称

导入工作台：统一导入服务展示/设计模板功能模块统称

系统模板：统一导入服务模板管理功能中从领域获取的模板

自定义模板：统一导入服务模板管理功能中租户/用户自行创建的模板

UI模板：MDF用作页面展示的模型，支持领域存储和低代码存储

ViewModel：导入中使用的UI模板抽象模型

产品亮点
百万数据导入/导出支持。
导入自定义模板设计

1）主持批量勾选、批量取消列入模板、必填设置。

2）支持子/孙集不列入模板。

3）展示领域单据所有属性的字段。

4）单页签导入模板下载。

易懂易用的导入导出能力
导入工作台、模板下载模板弹框形式切换成卡片页面的设计形式。
数据导入节点导入基于领域对接适配，升级为导入模板管理和任务管理。
技术架构
总体架构设计
产品架构设计

产品架构设计

基于背景需求，统一导入服务工作台产品能力主要分为两大块-批量新增导入和批量更新导入，同时为方便不同的人群和场景使用，产品还支持自定义导入模板(单/多页签两种模式)、支持图片/附件导入、支持自定义项导入、支持特征导入。

微服务架构设计

微服务架构设计

基于产品设计需求和功能要求，服务架构拆分为两个微服务：统一导入微服务和业务微服务。

● 统一导入微服务主要实现的能力如下：

1.excel解析，采用POI事件驱动模式，提升效率降低内存占用

2.数据校验，采用边解析边校验的模式，降低时间复杂度提高效率

数据组装，将行数据按元数据依赖关系组装成主子孙结构的BizObject对象
数据拆分，按照业务负责程度对数据进行拆分，防止后续业务服务一次拉取大量数据出现超时等异常
事件分发，基于EOS实现数据导入任务智能分发到业务服务多实例

● 业务微服务主要实现的能力如下：

1.批数据处理，主要完成数据的前置处理，对数据进行业务加工，支持扩展

行数据处理，主要完成行数据保存和事务控制，支持扩展
微服务能力边界

能力边界

导出时序图

导出能力时序图

功能介绍
功能概述

统一导入提供从导入模板设计到数据解析再到数据存储这一整套的能力，主要应对大量业务数据的快速录入场景，提供人性化的设计和操作界面，导入进度实施查看，自动记录导入日志。

统一导入服务主要功能包括：模板管理，导入工作台，导入日志。

模板管理

主要实现导入模板的列表展示、自定义模板、模板操作和模板下载，具体功能展示如下：

模板列表

展示单据所有可用的导入模板，包括系统模板和自定义模板

模板列表

自定义模板

租户和用户可根据不同的业务场景自定义模板，可自定义模板版本号和名称，也可自定义实体中字段顺序、是否必填、是否列入模板，由此创建个性化导入模板

自定义模板

模板操作

租户和用户针对模板可进行多种操作，包括预览、查看、编辑、发布/取消发布、删除。

● 针对不同的模板类型，可执行的操作不同，系统模板不支持编辑、发布和删除功能。

系统模板操作

● 自定义模板针对不同状态，可执行的操作也不同，未发布的模板支持所有操作，发布后的模板不支持编辑和删除，取消发布后可支持所有操作

自定义模板操作

模板下载

点击下载模板按钮可按照用户选择的模板导出为Excel供用户录入数据

模板下载

导入工作台

点击导入按钮弹出导入工作台界面，可在该功能节点完成文件上传、文件解析和数据校验功能

文件上传

点击上传按钮可完成文件上传

文件上传

文件解析

上传完成后自动开始进行文件解析

文件解析

数据校验

解析过程中根据模板配置对数据进行必要的校验，校验未通过给出相应提示

数据校验

异步导出

点击Excel导出按钮，开始进行异步导出

数据校验

导入/导出日志

导入/导出开始后，导入服务会自动生成导入日志并存储本次导入使用的原始文件，根据导入进度对日志数据进行补充，用户可在导入日志界面查看/检索导入批次信息，导入/导出完成后可下载相应的错误文件

导入日志

导出日志

开发示例
数据库配置注册
领域配置注册

各领域对接导入服务工作台，需要注册必要的领域信息，数据模型设计参照数据库设计部分import_domain_config表相关

日志配置注册

各领域对接导入日志，需要注册必要的领域信息，数据模型设计参照数据库设计部分import_object表相关

配置文件

统一导入服务针对不同的场景需要领域进行部分配置，只要配置类型如下

导入全局配置注册
数据分批的单位，默认：50

batchImportNumber=500

是否需要开启事件导入，默认：false（不开启事件导入）

isEventImport=true

默认cpu核心数,如需禁用多线程操作配置为1

mdd.import.request.maxsize=10

默认cpu核心数

import.event.num=10

域名配置，如果领域对接YMS了(MDD3084版本)可不配置

mdd.applytool.net.address=https://xxxxx/exceltrain

mdd.applyTool.domain=ucf-mdf-exceltrain

导入领域/单据配置注册
导入单据串行处理，配置的值为billno，如果是多个，用逗号隔开

import.billnum.notParallelHandle=a,b,c

树结构配置注册
树形一般情况下需要实现ITree（ucfbase.ucfbaseItf.ITree），如果未实现ITree，

则在配置文件中增加如下配置：

tree.itf.fullname=xxx.xxx.xxx

增加如下配置，即可使用优化的树形结构导入

treeFieldMappingConfig=[{"billNo":xx,"treeParentField":aaa,"treeField":bbb}]

导出配置注册
导出支持的最大数据量配置
单次导出最大值，默认值50000，支持billnum级别配置
不带billnum表示服务级配置，单据级别配置参照如下

mdd.export.max.size=50000

单据级别配置，只需在服务级配置前增加billnum.前缀即可，billnum值自行替换

voucher_orderlist.mdd.export.max.size=200000

大数据导出分页大小配置
默认值1000，支持billnum级别配置
不带billnum表示服务级配置，单据级别配置参照如下

mdd.export.paging.read.pageSize=1000

单据级别配置，只需在服务级配置前增加billnum.前缀即可，billnum值自行替换

voucher_orderlist.mdd.export.paging.read.pageSize=10000

大数据导出开启的阈值，小于配置值强制关闭
默认值10000，支持billnum级别配置
不带billnum表示服务级配置，单据级别配置参照如下

mdd.export.paging.read.minimum=10000

单据级别配置，只需在服务级配置前增加billnum.前缀即可，billnum值自行替换

voucher_orderlist.mdd.mdd.export.paging.read.minimum=10000

事件配置注册

统一导入服务功能实现依赖事件中心，事件类型和事件监听注册请参照事件中心红皮书部分。

导入事件配置注册

导入事件注册相关参考配置如下表

名称	值	描述
事件源	EventBatchImport	导入事件源
事件类型	systemCode+EventBatchImport	请大家确定好systemCode，否则事件消费不了
事件接受策略	FORBID	不容许重试，导入失败了就记录失败，不再重复消费
实现类	com.yonyou.iuap.event.mq.listener.RPCListener	rpc接收事件
事件接收地址	rpc://yonbip-mkt-mkc2b@c87e2267-1001-4c70-bb2a-ab41f3b81aa3/importDataEventReceiveService	rpc://应用名称/@租户ID/importDataEventReceiveService(应用名称和租户指的开发者中心的信息)
导入完成事件配置注册

导入完成事件注册相关参考配置如下表

名称	值	描述
事件源	importCompleteEventSource	导入完成事件类型
事件类型	systemCode+importCompleteEventType	请大家确定好systemCode，否则事件消费不了
事件接受策略	FORBID	不容许重试，导入失败了就记录失败，不再重复消费
实现类	com.yonyou.iuap.event.mq.listener.RPCListener	rpc接收事件
事件接收地址	rpc://ucf-amc-ambd@c87e2267-1001-4c70-bb2a-ab41f3b81aa3/importCompleteEventReceiveService	rpc://应用名称/@租户ID/importCompleteEventReceiveService(应用名称和租户指的开发者中心的信息)
导出日志事件配置注册

导出日志事件注册相关参考配置如下表

名称	值	描述
事件源	exportExcelEventSourcce	导出日志事件源
事件类型	exportExcelEventType	导出日志事件类型
事件接受策略	FORBID	不容许重试，失败了就记录失败，不再重复消费
实现类	com.yonyou.iuap.event.mq.listener.RPCListener	rpc接收事件
事件接收地址	rpc://ucf-mdf-exceltrain@c87e2267-1001-4c70-bb2a-ab41f3b81aa3/excelExportLogEventReveiveService	rpc://应用名称/@租户ID/excelExportLogEventReveiveService(应用名称和租户指的开发者中心的信息)
文件存储服务配置注册
文件客户端实现注册
阿里OSS

@ConditionalOnProperty(prefix = "fileserver", name = "name", havingValue = "alioss", matchIfMissing = false)

@ConditionalOnMissingBean({Object.IObject.class})

@Bean("alioss")

@DependsOn("mainAppContext")

public Object.IObject alioss() {

return new AliOss();

}

FastDFS

@ConditionalOnProperty(prefix = "fileserver", name = "name", havingValue = "fastdfs", matchIfMissing = false)

@ConditionalOnMissingBean({Object.IObject.class})

@Bean("fastdfs")

@DependsOn("mainAppContext")

public Object.IObject fastdfs() {

return new FastDFS();

}

华为OBS

@ConditionalOnProperty(prefix = "fileserver", name = "name", havingValue = "huaweiobs", matchIfMissing = false)

@ConditionalOnMissingBean({Object.IObject.class})

@Bean("huaweiobs")

@DependsOn("mainAppContext")

public Object.IObject huaweiobs() {

return new HuaweiObs();

}

华为OBS3

@ConditionalOnProperty(prefix = "fileserver", name = "name", havingValue = "huaweiobs3", matchIfMissing = false)

@ConditionalOnMissingBean({Object.IObject.class})

@Bean("huaweiobs3")

@DependsOn("mainAppContext")

public Object.IObject huaweiobs3() {

return new HuaweiObs3();

}

七牛云

@ConditionalOnProperty(prefix = "fileserver", name = "name", havingValue = "qiniu", matchIfMissing = false)

@ConditionalOnMissingBean({Object.IObject.class})

@Bean("qiniu")

@DependsOn("mainAppContext")

public Object.IObject qiniu() {

return new Qiniu();

}

文件客户配置注册
场景1：领域接入YMS，可直接在YMS配置文件存储客户端，配置自动注入容器
场景2：领域未接入YMS，参考配置如下
阿里OSS

OSS.ACCESS_ID=xxxxxxxxxx

OSS.ACCESS_KEY=xxxxxxxxxx

OSS.BUCKET_NAME=xxxxxx

OSS.ENDPOINT=http://xxxxx.aliyuncs.com

OSS.FILE_SERVER=http://xxxxx.xxxxxx.aliyuncs.com

FastDFS

fdfsread_server=https://xxxxxxx

tracker_server=172.20.33.179:25005

tracker_server=172.20.55.165:25005

fileserver.name=fastdfs

华为OBS/OBS3

OBS.SECRET_KEY=xxxxxxxx

OBS.ACCESS_KEY=xxxxxxxx

OBS.BUCKET_NAME=xxxxxx

OBS.ENDPOINT=xxxxxx

OBS.REGION=xxxxx

OBS.FILE_SERVER=http://xxxxx.xxxxxx.xxxxxx.com

七牛云

QINIU.SECRET.KEY=xxxxxxxx

QINIU.ACCESS_KEY=xxxxxxxx

QINIU.BUCKET_NAME=xxxxxx

QINIU.FILE_SERVER=http://xxxxx.xxxxx.com

典型业务场景介绍
自定义模板

进入导入工作台，可实现自定义租户/用户导入模板的新增、编辑。

模板新增/编辑

数据验重

图13中标注1部分，模板编号自动基于时间戳生成保证唯一性，版本号和名称对录入的数据进行后端验重。

（2）属性批量配置

图12中编著2部分，是否设置为必填和是否列入模板支持批量勾选，其中是否列入模板全部取消勾选的场景代码整个页签一并不予列入模板。

模板发布/取消发布

创建的自定义模板默认为未发布状态，该状态下模板支持编辑和删除。

点击发布按钮后，模板状态变为发布，发布状态下的模板禁止编辑和删除，取消发布后可正常编辑和删除。

模板发布/取消发布

开放接口说明
统一导入服务对外开放RESTful接口进行配置注册，基于友户通token验签
统一导入服务与领域服务使用RPC方式进行交互
RESTful接口

任何系统通过API网关可以调用的接口

注册领域信息

（1）请求体：

URl	/exceltrain/insertDomainConfig
Method	POST

（2）请求参数：

参数以json格式提交

{"domainKey":"test","domainUrl":"test","rpcDomain":"test",

"systemCode":"test","appCode":"test"}

（3）请求参数说明：

参数	参数类型	是否必须	说明
domainKey	String	是	前端请求的domainKey
domainUrl	String	是	服务请求的URL
rpcDomain	String	是	RPC域名
systemCode	String	是	导入服务的SystemCode
appCode	String	是	IRIS服务编码

（4）返回值

注册成功：

{"sucess": 1 }

注册失败：

{"sucess": 0 }

获取领域信息

（1）请求体：

URl	/exceltrain/getDomainConfig?domainKey=xxx
Method	GET

（2）请求参数说明：

参数	参数类型	是否必须	说明
domainKey	String	是	前端请求的domainKey

（3）返回值

{"domainKey":"test","domainUrl":"test","rpcDomain":"test",

"systemCode":"test","appCode":"test"}

（4）返回参数说明

参数	参数类型	是否必须	说明
domainKey	String	是	前端请求的domainKey
domainUrl	String	是	服务请求的URL
rpcDomain	String	是	RPC域名
systemCode	String	是	导入服务的SystemCode
appCode	String	是	IRIS服务编码
更新领域信息

（1）请求体：

URl	/exceltrain/updateImportDomainConfig
Method	POST

（2）请求参数：

参数以json格式提交

{"domainKey":"test","domainUrl":"test","rpcDomain":"test",

"systemCode":"test","appCode":"test"}

（3）请求参数说明：

参数	参数类型	是否必须	说明
domainKey	String	是	前端请求的domainKey
domainUrl	String	是	服务请求的URL
rpcDomain	String	是	RPC域名
systemCode	String	是	导入服务的SystemCode
appCode	String	是	IRIS服务编码

（4）返回值

{"domainKey":"test","domainUrl":"test","rpcDomain":"test",

"systemCode":"test","appCode":"test"}

（5）返回参数说明

参数	参数类型	是否必须	说明
domainKey	String	是	前端请求的domainKey
domainUrl	String	是	服务请求的URL
rpcDomain	String	是	RPC域名
systemCode	String	是	导入服务的SystemCode
appCode	String	是	IRIS服务编码
RPC接口

领域间互调通过IRIS调用到的接口

获取领域系统模板

1、调用IPOISupportApi接口中的getSimpleVM4POI()方法。

2、请求参数：

参数以json格式提交

{"billno":"test","tplId":66666,

"isTplExport":true,"params":"{"key1":value1}"}

3、参数说明：

参数	参数类型	是否必须	说明
billno	String	是	单据编码
tplId	Long	否	获取指定模板
isTplExport	Boolean	否	是否敏感Entity表中该属性字段
params	JSON	否	查询ViewModel扩展参数

4、返回值

获取编码成功：

{

"id":"1","code":"001","name":"test",

"entities":""}

5、返回参数说明

参数	参数类型	说明
id	String	单据ID
code	String	单据编码
name	String	单据名称
entities	JSON	实体集合