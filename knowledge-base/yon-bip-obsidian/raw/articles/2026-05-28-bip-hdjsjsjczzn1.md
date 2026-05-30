R6后端脚手架升级操作指南
最后更新时间：2024-09-25
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	否
私有云	客户化定制开发	是
专属云	客户化定制开发	否
公有云	ISV生态开发	否
私有云	ISV生态开发	是
专属云	ISV生态开发	否
业务场景

客开脚手架，非必要可以不升级。

简强架构下，平台对二方包进行了精简治理，二方包坐标产生了变化。

如果遇到以下场景，需要对客开脚手架工程进行升级，具体操作参考第二章内容。

如项目上的目标环境为Standalone安装模式，脚手架需要升级；
如需要新特性新功能，脚手架需要升级。

本文提供客开脚手架升级到简强版本的客开脚手架变动信息，以及平台统一二三方坐标，脚手架客开代码适配问题。

脚手架版本从低版本（MDD>6.0.2-RELEASE,YPD>2.0.0-RELEASE）升级到R6版本，R6发版版本为8.2.100-RELEASE。

<parent>
<groupId>com.yonyou.iuap</groupId>
<artifactId>yonbip-2nd-parent</artifactId>
<version>8.2.100-RELEASE</version>
</parent>


检查当前脚手架MDD版本和YPD版本的方法，检查脚手架父Pom文件，如下图：

关键词

脚手架升级

简强架构

YonBIP-2nd-8脚手架升级适配

yonbip-2nd-parent

MDD脚手架

YPD脚手架

脚手架工程升级
** YonBuilder专业版脚手架工程升级前准备**

由于本次升级涉及二方包坐标变化，涉及脚手架改造内容较多，影响范围较广，所以改造前请做好代码仓库备份管理，建议切出全新分支进行脚手架工程改造，方便快速回滚。

同时在脚手架升级完成后，请在开发环境进行充分验证，覆盖全场景业务。

** **YonBuilder专业版脚手架工程升级

客开脚手架工程升级，推荐使用新脚手架Merge客开代码的方式。

YPD脚手架工程升级

YPD脚手架工程作为当前开发平台的主要框架，升级可以有两种模式如下，可根据实际情况选择。

新建引擎，以该引擎的脚手架为模板，把老脚手架中的代码合并到新脚手架中。
直接修改脚手架pom.xml及脚手架相关代码。

项目在开发环境升级到R6后，可以从应用引擎里新建一个工程（具体方法参考[YonBIP社区文档中心-专业开发-环境准备-引擎部署](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html" \l "/detail/YQBS11?nodeId24c6b903-112c-4a49-a17f-4aa7aba93758&productlineCommunityDoc&shareHrefId0_%E4%B8%9A%E5%8A%A1%E5%9C%BA%E6%99%AF)）进行代码Merge，也可以使用手工修改工程的方式进行升级。

YPD脚手架yonbip-2nd-parent，8.2.100-RELEASE示例工程地址如下，如果需要请通过第四章的方法进行申请。

http://kkgit.yyrd.com/YONBIP/KKFN/KKSLDM/ypd82100demo.git

代码Merge过程如有问题可以参考以下操作内容。

注：仅为脚手架工程本身升级，不涉及客开代码的改造。客开代码改造请参照2.4 小节。

** 新下载脚手架模式**
下载新脚手架版本

从业务中台应用引擎功能节点下载新的脚手架压缩包。

** 合并**客开代码

将老工程内的客开相关代码，合并到新工程对应的目录内，代码变化参考2.4小节内容。

** 合并非二三方Jar包引用**

此处的jar包主要指项目特有的需由客开工程引入的jar包，比如与三方系统对接的jar包、内部安全jar包等。

平台二三方包已包含开发常用的jar包，代码有引用需求时应优先考虑平台已支持的二三方包，尽量不引用二三方包范围以外的jar包。

** 合并参数配置**

在合并老工程到新工程时，请注意仅合并自己添加的内容。其他参数配置应以新工程为准，如对框架配置参数有修改，请明确项目上的使用范围，与平台进行沟通。

修改参数清单如下：

模块	路径	参数	状态
bootstrap	application.properties	yms.lock.redisClientCode=@engineCode@_redis	新增
bootstrap	application.properties	iuap.boot.redis.refs.defaultDef=@engineCode@_redis	新增
bootstrap	application.properties	mdd.import.event.v2.switch=true	新增

示例如下：

** 手工修改工程模式**
pom修改
父pom修改

修改：

groupId由com.yonyou.ypd，变为com.yonyou.iuap;

atrifactId由ypd-starter-parent，变为yonbip-2nd-parent;

version统一改为8.2.100-RELEASE

修改：

新版本剔除mobile目录，该目录也一直为空目录，如项目上在该目录写有客开代码，可以迁移到其他目录，或保留。

修改：

移除<ypd.version>配置。

修改：

去掉ypd-boot-starter的引用。

service目录pom修改

因为service目录下有原坐标的引用，需要进行替换。

<dependency>
<groupId>com.yonyou.iuap</groupId>
<artifactId>iuap-ap-ypd-starter</artifactId>
<exclusions>
<exclusion>
<artifactId>iuap-ap-bizflow_mdd-sdk</artifactId>
<groupId>com.yonyou.iuap</groupId>
</exclusion>
</exclusions>
</dependency>


明确下排除的意义

** 框架代码修改**
MDFApplication改动

删除excluded配置；

精简启动命令，增加启动成功日志打印；

MdfSmartLifecycle改动

增加IEnvService注解；

使用iEnvService替换AppContext方法（AppContext不再引用）；

删除bootstrap目录下其他框架代码

仅保留MDFApplication、MdfSmartLifecycle两个类

** mobile工程目录删除**

mobile目录在新版脚手架已不存在，如果项目有客开代码存放，可以考虑根据功能移动到api、app、service等目录下。

** 客开代码适配**

改变pom依赖后的客开代码适配，具体参照3.5小节进行适配调整。

** bootstrap模块scripts目录**

以新工程内容为准，可以检查客开脚手架DB内，框架表的字段是否完整。

** **MDD脚手架工程升级

MDD脚手架工程在R5版本开始，已不随平台更新带入到应用引擎内，所以目前只能使用手工修改工程的方式进行升级。我们提供一个新版本的MDD脚手架工程，可供项目进行MDD脚手架工程的比对升级操作。

MDD脚手架yonbip-2nd-parent，8.2.100-RELEASE示例工程地址如下，如果需要请通过第四章的方法进行申请。

http://kkgit.yyrd.com/YONBIP/KKFN/KKSLDM/mdd82100demo.git

pom修改
api目录pom修改

dependencies里不再引用app目录，引用对应的conf目录，同时去掉version；

exclusions里的内容删除掉；

app目录pom修改

清理原有引用，仅引用工程domain目录及jakarta.servlet-api；

bootstrap目录pom修改

dependencies里仅保留api、app、tools的引用

plugins里yms-module-maven-plugin的groupId由com.yonyou.iuap.yms改为com.yonyou.iuap

conf目录pom修改

dependencies里仅使用iuap-ap-mdd-starter的引用

domain目录pom修改

dependencies里仅使用iuap-ap-mdd-impl和conf目录的引用

** 框架代码修改**

MDD脚手架工程存在比较多的框架代码，需要进行对应改动。下面仅展示需要改动的类，具体改动内容，请使用提供的样例工程进行比对。建议方法为：

整理出框架代码中扩展的客开代码并做好相关记录
把旧工程内需改动的类的代码，按照样例工程的代码进行合并，需要改动的类的清单如下表
模块名	类名
app	com.yonyou.ucf.mdf.app.controller.trd.BillController
com.yonyou.ucf.mdf.app.service.impl.FeAuthServiceImpl
com.yonyou.ucf.mdf.app.service.impl.IPOIExtServiceImpl
com.yonyou.ucf.mdf.app.service.impl.MddPrintServiceImpl
com.yonyou.ucf.mdf.app.util.ParamUtils
com.yonyou.ucf.mdf.app.util.RuleEngineUtils
domain	com.yonyou.ucf.mdf.domain.rule.MddBeforeRefDataRule
com.yonyou.ucf.mdf.domain.rule.ProcessCodeJudgeRule
com.yonyou.ucf.mdf.domain.rule.ProcessCodeRule
com.yonyou.ucf.mdf.domain.util.FuncDeleteValidator

以上类名称、方法和实现逻辑只是做了增强，业务上并没有太大变化，结合客开代码原样合并即可。样例工程新增加的类，直接合并即可。

把旧工程需删除的类的代码，检查是否有客开代码，如有就需要适配，需要适配的类的清单如下表
模块名	类名	适配方法
app	com.yonyou.ucf.mdf.app.controller.trd.ExtBillPrintController	如有引用，可以保留
com.yonyou.ucf.mdf.app.controller.BillPrintController	如有引用，可以保留
com.yonyou.ucf.mdf.app.controller.CustomQueryController	如有引用，可以保留
com.yonyou.ucf.mdf.app.rule.MddBeforeRefDataRule	迁移到domain模块
com.yonyou.ucf.mdf.app.service.impl.ApproveOpinionService
com.yonyou.ucf.mdf.app.service.impl.BillCommandServiceImpl
com.yonyou.ucf.mdf.app.service.impl.BillServiceImp
com.yonyou.ucf.mdf.app.service.impl.MetaModelService
com.yonyou.ucf.mdf.app.service.IBillCommandService
com.yonyou.ucf.mdf.app.service.IBillService
bootstrap	com.yonyou.ucf.mdd.ext.util.DomainUtils
com.yonyou.ucf.mdf.extend.CustomDataPermissionHandler
com.yonyou.ucf.mdf.interceptor.LocaleInterceptor
com.yonyou.ucf.mdf.security.SecurityConfig
app目录

BillController.java、FeAuthServiceImpl.java、IPOIExtServiceImpl.java、MddPrintServiceImpl.java、ParamUtils.java、RuleEngineUtils.java代码有改动，Merge时要注意；

ExtBillPrintController.java、BillPrintController.java、CustomQueryController.java、ExtendController.java、MddBeforeRefDataRule.java、ApproveOpinionService.java、BillCommandServiceImpl.java、BillServiceImp.java、MetaModelService.java、IBillCommandService.java、IBillService.java类在新版本剔除，如果在这些类里有客开代码逻辑，可以先保留

其他代码Merge时注意一下。

bootstrap目录

删除DomainUtils.java、CustomDataPermissionHandler.java、LocaleInterceptor.java、SecurityConfig.java

domain目录

修改MddBeforeRefDataRule.java、ProcessCodeJudgeRule.java、ProcessCodeRule.java、FuncDeleteValidator.java的内容

** mobile工程目录删除**

mobile目录在新版脚手架已不存在，如果项目有客开代码存放，可以考虑根据功能移动到api、app、service等目录下。

** 客开代码适配**

改变pom依赖后的客开代码适配，具体参照3.5小节进行适配调整。

bootstrap模块scripts脚本适配

以新工程内容为准，可以检查客开脚手架DB内，框架表的字段是否完整。

客开代码适配关键技术方案
YPD去掉MDD引用后，MetaDaoHelper使用的替换

将MetaDaoHelper替换为YPD框架的接口类 com.yonyou.ypd.bill.infrastructure.service.api.IBillQueryRepository

** **SqlHelper废弃，建议替换使用IYmsJdbcAPI
SqlHelper	IYmsJdbcApi
selectOne(String statement)	queryForObject(String sql, ResultSetProcessor processor)
selectOne(String statement, Object parameter)	queryForObject(String sql, SQLParameter parameter, ResultSetProcessor processor)
selectFirst(String statement)	queryForList(String sql, ResultSetProcessor processor) //自行取0下标数据
selectFirst(String statement, Object parameter)	queryForList(String sql, SQLParameter parameter, ResultSetProcessor processor)//自行取0下标数据
selectList(String statement)	queryForList(String sql, ResultSetProcessor processor)
selectList(String statement, Object parameter)	queryForList(String sql, SQLParameter parameter, ResultSetProcessor processor)
insert(String statement)	insert(T vo)
insert(String statement, Object parameter)	insert(T vo)
update(String statement)	int update(String sql)
update(String statement, Object parameter)	int update(String sql, SQLParameter parameter)
delete(String statement)	remove(T vo)
delete(String statement, Object parameter)	removeByClause(BaseEntity baseEntity, String clauseSql, boolean isLogic)
** **非框架二三方包引入处理

平台使用经过验证能持续维护的二三方包，一般情况下正常开发无需引入其他jar包，如果项目有特殊性需要引入，可以配置bootstrap模块的pom文件，在打包插件的configuration里开启自定义工程属性。

** **Mybatis改造成YMS-JDBC

具体内容可以参考以下社区文档:

[YonBIP社区文档中心-专业开发-最佳实践-后端开发-持久化（yms-jdbc）](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html" \l "/detail/ISVJSJSP1?nodeIdd0fec310-b29c-46af-9711-7c23bc54a592&productlineCommunityDoc&shareHrefId5)

** **二方包精简坐标改造

具体改造内容请参考[YonBIP旗舰版专业开发服务-最佳实践-后端开发-脚手架(YonBIP-2nd-8)二方包坐标变更清单](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html" \l "/)

客开赋能资源申请

源码申请 和 培训赋能申请 请参考在线最新信息：

【客开赋能资源申请使用说明】

https://community.yonyou.com/article/detail/8486