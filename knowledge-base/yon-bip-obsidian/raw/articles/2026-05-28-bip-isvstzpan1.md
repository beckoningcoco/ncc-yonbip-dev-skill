公有云ISV生态产品制盘及安装
最后更新时间：2025-08-21
概述
适用范围
部署方案	开发类型	是否适用
公有云	客户化定制开发	否
私有云	客户化定制开发	否
专属云	客户化定制开发	否
本地部署	客户化定制开发	否
公有云	ISV生态开发	否
私有云	ISV生态开发	是
专属云	ISV生态开发	是
本地部署	ISV生态开发	是
业务场景

部分ISV产品需要同时支持公有云和私有云，私有云项目需要通过产品盘的方式来安装交付。本文档描述在商开环境如何制作ISV产品盘，制盘后在私有云环境如何安装以及安装后如何配置，需要注意的是当前ISV产品只支持应用构建专业版产品制盘，应用构建标准版产品不支持制盘。

关键词

ISV生态产品盘、微服务基础档案、YPR制品仓库、用友产品赋能对接人、用友开发赋能对接人。

制盘前准备

制作ISV产品盘的前提条件是相应ISV产品已经在ISV管理租户验证通过并在产品包管理中发布，且配置好私有云规格计量，产品包发布后，还需要做一些其他配置，主要包括配置微服务基础档案，配置前后端脚手架、流水线、YMS以及安装模式，本章主要描述这些内容。

微服务基础档案配置

微服务基础档案配置主要包括产品地图配置和微服务基础档案配置，当前统一由【用友产品赋能对接人】在商开环境【ISV流水线】租户进行配置，菜单路径为【云平台】-【YMS Cloud】-【DevOps服务】-【微服务基础档案】。

产品地图

产品地图维护了ISV产品所属的领域云、领域、应用和产品线等信息。

微服务基础档案(产品)

微服务基础档案维护了ISV产品所关联的微服务和流水线信息，一个微服务关联一条流水线，通常来讲，一个ISV产品包含一条后端微服务和一条前端微服务数据，分别关联后端流水线和前端流水线。

盘模版管理

通过盘模版管理可以添加和修改产品盘模版，产品盘模版创建后，可以直接从产品盘模版进行制盘操作。

1、选择【里程碑】（如“R6_2407”），点击【新增】-【产品盘模版】；

2、填写产品盘【基本信息】；

3、添加前后端微服务，可以打开左侧的产品地图树或者直接搜索微服务编码选择确认添加；

4、在【中间件】区域点击【添加】，选择【数据源】、【Nginx】、【Redis】确认添加，

5、点击【保存】保存产品盘模版设置。

6、添加完产品盘模版后，可以通过【权限管理】按钮给其他人授权，否则看不到“制盘”、“编辑”等按钮。

前端脚手架及流水线配置
前端脚手架配置

1、检查module.xml文件中module配置是否正确（name应为微服务基础档案配置中前端微服务编码）；

<?xml version="1.0" encoding="UTF-8"?>
<module name="yonbip-yisv-ipc-pvmt-dev-fe" description="生态-商开-全流程验证-MDD-前端">
<nginx_mode>mdf</nginx_mode>
</module>



2、检查前端脚手架根目录下是否有ypr.sh文件，没有则新建并添加以下文件内容。

# !/bin/bash
# 前端扩展资源产生YPR制品
# 需要外部提供变量 SERVER_ENV 、 DOMAIN 和 DOMAIN_KEY
function initEnv() {
echo -e "=======SERVER_ENV:${SERVER_ENV}、DOMAIN:${DOMAIN}、DOMAIN_KEY:${DOMAIN_KEY}======="
env=private # ${SERVER_ENV}
domain=${DOMAIN}
domainKey=${DOMAIN_KEY}
commitId=`git rev-parse --short HEAD`
version=`date +%Y%m%d%H%M%S`_${commitId}
versionJsonName=${env}_version.json
if [ ${domainKey} ];then
appName=.${domainKey}
zipSourceName=${domainKey}
else
domainKey=${domain}
zipSourceName=${domain}
fi
sourceDir=/design/static/public/${domainKey}
targetDir=/yonyoucloud-buildproduct/${domainKey}
echo -e "=======appName:${appName}、zipSourceName:${zipSourceName}======="
}
function updateVersionJson() {
# 拷贝目录
mkdir -p /yonyoucloud-buildproduct
cp -r ${sourceDir} ${targetDir}
# 更新版本
sed -i 's#\("version": "\).*#\1'"$version"'"#g' ${targetDir}/version.json
echo -e "=======修改${targetDir}/version.json文件======="
}
function copyResource() {
mkdir -p ${targetDir}/version
mkdir -p ${targetDir}/${version}
cp module.xml ${targetDir}/module.xml
cp ${targetDir}/version.json ${targetDir}/${version}/version.json
mv ${targetDir}/version.json ${targetDir}/version/${versionJsonName}
mv ${targetDir}/javascripts ${targetDir}/stylesheets ${targetDir}/${version}
}
function buildProduct() {
cd /yonyoucloud-buildproduct
zip -r /yonyoucloud-buildproduct/${domain}${appName}-fe.zip ./${zipSourceName}
cd /design
rm -rf /yonyoucloud-buildproduct/${domainKey}
}
# 执行方法
initEnv
updateVersionJson
copyResource
buildProduct


前端流水线配置

1、前端流水线应用配置中应用类型必须为Node应用；

2、确认前端流水线工作流配置中是否有【同步YPR】节点，没有则添加：

在【流水线详情】编辑中打开相应工作流编辑页面，

点击工作流加号，选择【同步YPR】阶段（注意：构建类型为Node应用），点击添加，保存工作流。

保存后，点击执行流水线，选择出盘流程执行。

注意：

出盘流程不需要部署阶段；

如果脚手架脚本内容有修改，需要重新执行出盘流水线。

后端脚手架及流水线配置
后端脚手架配置

1、在后端脚手架bootstrap模块中建立脚本目录(如：scripts/db/patch/rdb/0001_p-ipc-pu-p00c-pvmt/0020_self/DDL)，添加业务数据库表结构脚本（如产品盘中的数据库表初始化脚本，每次都需要追加新的SQL脚本文件），脚本文件目录如下，目录规范参考补丁脚本目录规范：

注意：所有脚本都需要保证幂等性。

2、检查DBDescribe.xml（scripts/db目录下）文件中的逻辑数据源配置是否正确，逻辑数据源应与YMS中的逻辑数据源编码一致（如果ISV没有YMS账号，由用友开发赋能对接人联系运维开通）。

DBDescribe.xml文件内容为（注意：p-i-pmd-p000-mpcf需要替换为具体ISV产品相应微服务编码）：

<?xml version="1.0" encoding="UTF-8"?><service>
<serviceName>p-i-pmd-p000-mpcf</serviceName>
<dbScripts>
<dbScript>
<!-- 如果是单一数据源，那只配置逻辑数据源编码即可，不需要指定ddl/dml的路径 -->
<dbType>rdb</dbType>
<type>init</type>
<!--逻辑数据源编码-->
<logicDataSource>p-i-pmd-p000-mpcf\_mainDataSource</logicDataSource>
<!--可以直接指定到目录，如果没有要执行的脚本，请不要增加此标签-->
<!-- <ddl>mysql/init/iuap-yonbuilder-engine/DDL/0010\_iuap\_yonbuilder\_engine-20210827/0010\_iuap\_yonbuilder\_engine-20210827.sql</ddl>-->
</dbScript>
<dbScript>
<!-- 如果是单一数据源，那只配置逻辑数据源编码即可，不需要指定ddl/dml的路径 -->
<dbType>rdb</dbType>
<type>patch</type>
<!--逻辑数据源编码-->
<logicDataSource>p-i-pmd-p000-mpcf\_mainDataSource</logicDataSource>
<!--可以直接指定到目录，如果没有要执行的脚本，请不要增加此标签-->
<!-- <ddl>mysql/init/iuap-yonbuilder-engine/DDL/0010\_iuap\_yonbuilder\_engine-20210827/0010\_iuap\_yonbuilder\_engine-20210827.sql</ddl>-->
<ddl></ddl>
<dml></dml>
</dbScript>
<dbScript>
<!-- 如果是单一数据源，那只配置逻辑数据源编码即可，不需要指定ddl/dml的路径 -->
<dbType>rdb</dbType>
<type>upgrade</type>
<name>YonBIP202105升级YonBIP20211</name>
<code>YonBIP202105-YonBIP20211</code>
<fromVersion>YonBIP202105</fromVersion>
<upgradeOrder>202105</upgradeOrder>
<!--逻辑数据源编码-->
<logicDataSource>p-i-pmd-p000-mpcf\_mainDataSource</logicDataSource>
<!--可以指定到目录，如果没有要执行的脚本，请不要增加此标签-->
<path>YonBIP202105-YonBIP202111</path>
</dbScript>
<dbScript>
<dbType>rdb</dbType>
<type>patch</type>
<logicDataSource>p-i-pmd-p000-mpcf\_mainDataSource</logicDataSource>
</dbScript>
<dbScript>
<dbType>rdb</dbType>
<type>upgrade</type>
<logicDataSource>p-i-pmd-p000-mpcf\_mainDataSource</logicDataSource>
<path>iuap.V6.R1\_2208-iuap.V6.R2\_2302</path>
<name>patch</name>
<fromVersion>YonBIP202105;YonBIP202111;YonBIP202203;iuap.V6.R1\_2205;iuap.V6.R1\_2207;iuap.V6.R1\_2208;iuap.V6.R1\_2209;iuap.V6.R1\_2211;iuap.V6.R1\_2212</fromVersion>
</dbScript>
</dbScripts>
</service>


后端流水线配置

1、后端流水线应用配置中应用类型必须为YMS应用；

2、确认后端流水线工作流配置中是否有【同步YPR】节点，没有则添加：

在【流水线详情】编辑中打开相应工作流编辑页面，

点击工作流加号，选择【同步YPR】阶段（注意：构建类型为YMS应用），点击添加，保存工作流。

保存后，点击执行流水线，选择出盘流程执行。

注意：

出盘流程不需要部署阶段；

如果脚手架内容有修改，需要重新执行出盘流水线。

YMS配置

由于私有云和公有云的YMS配置并不完全相同，制盘时抽取的YMS配置需要由【用友开发赋能对接人】在【生态产品赋能租户】的【配置管理】菜单中进行配置维护。（在【生态数据中心】中的【生态-测试环境】中进行配置，配置内容包括【微服务配置】中的配置项、日志、YMS-HTTP,【中间件配置】中的逻辑数据源、Redis客户端等等，根据具体项目内容进行配置） ；

与公有云YMS配置相比，“是否专属化”需要开启，否则不会拉取相应配置，如果私有云环境涉及多数据库，“专属化启用路由”需要开启，“专属化更新开关”根据是否需要更新私有云YMS配置选择是否开启。 在【Redis客户端】中，需要分配数据库序号。

安装模式配置

安装模式配置在standard.xml文件中，用来描述产品盘在装盘环境的启动信息，按照规定目录存放，在制盘时需要配置相关GIT信息，规定目录为：

Git根目录/deployment/产品编码

其中，deployment为固定值，产品编码为产品盘模版中的产品编码。

如以下示例：

standard.xml文件内容为（注意：deployment和module节点需要改为具体ISV产品相应微服务编码，且必须一致）：

<?xml version="1.0" encoding="UTF-8"?>
<deployments>
<deployment name="p-ipc-pu-p00c-pvmt" description="p-ipc-pu-p00c-pvmt">
<baseImage>java:8-jdk-alpine-Slim</baseImage>
<cpus>2</cpus>
<mem>2500</mem>
<minCpus>0.1</minCpus>
<minMem>800.0</minMem>
<cmd>java -jar $CATALINA_OPTS $JAVA_OPTS /app/yms.jar</cmd>
<healthChecks>
<protocol>HTTP</protocol>
<path>/extend/healthycheck</path>
<gracePeriodSeconds>200</gracePeriodSeconds>
<intervalSeconds>20</intervalSeconds>
<port>8080</port>
<timeoutSeconds>20</timeoutSeconds>
<maxConsecutiveFailures>20</maxConsecutiveFailures>
</healthChecks>
<envs/>
<modules>
<module description="p-ipc-pu-p00c-pvmt" name="p-ipc-pu-p00c-pvmt"/>
</modules>
<ports>
<port>
<containerPort>8080</containerPort>
<hostPort>0</hostPort>
<protocol>tcp</protocol>
<outerPort>false</outerPort>
<accessMode>HTTP</accessMode>
<accessRange>OUTER</accessRange>
</port>
</ports>
<developerAppLogs>/data/logs/app/</developerAppLogs>
</deployment>

</deployments>


制作ISV产品盘

本章节主要描述ISV产品盘的制作过程，同一ISV产品的产品盘每制作一次，流水号会加一。其菜单路径为【云平台】-【YMS Cloud】-【YPR制品仓库】。

产品盘制作
上传产品包至微服务

1、从产品包管理下载产品包并解压（注意：一定要解压，否则上传会报错）；

2、 把平台基础包（数字化建模）相关规格脚本（由用友产品赋能对接人导出）解压后合并到解压的产品包中，产品包相关路径为\resources\db\patch\rdb\V3_R6_2407\0001_iuap_dms\0010_iuap_common\DML\0040_iuap_workbench_register：

3、在【YPR制品仓库】-【制品原材料】的【插件】页签中，点击上传按钮上传解压产品包；

上传完成后会自动制作为微服务并在微服务页签中显示，点击【构建记录】可查看历史上传制作记录；

注意： 私有云规格扩展配置参考制品相关文档。

配置制盘信息及制盘

配置完产品盘模版并在【制品原材料】中上传产品包后，可在【盘模版管理】中点击【制盘】进行制盘信息配置；

1、配置安装模式GIT信息；（注意：安装模式具体配置信息参考2.6）

2、选择YMS配置信息（配置详情参考2.5）；

3、如果UI内容有变化，【是否清理Redis缓存】需要选择是；

4、选择产品盘模版中配置的微服务流水号（每次执行流水线，都会产生一个新的微服务流水号）；

5、点击【添加微服务】，添加产品包微服务，

确定后，选择微服务流水号；

5、点击【制盘】制作产品盘；

6、在【YPR制品仓库】中查看制盘进度，制盘结束后，点击【下载】下载产品盘。

产品盘安装及配置

产品盘制作完成后，需要在测试环境安装配置（不能用于商业客户安装及配置，商业客户安装及配置另有说明）后进行业务验证，本章主要描述产品盘在测试环境的安装及配置流程。

产品盘下载和安装

1、在【YPR制品仓库】-制品盘中下载产品盘；

2、登录安装器，在【全部产品】中上传产品盘；

3、上传后，在【安装管理】中点击安装环境（安装到一半或者有问题的可以点击【安装任务】继续安装或者移除安装任务）；

4、点击【产品安装】；

5、选择安装产品（只选择需要安装的产品），点击下一步；

6、选择产品微服务的主机资源（选择应用资源池或者业务资源池），点击下一步；

7、点击【YMS控制台】，确认数据库和Redis是否规划，如果没有，添加相应规划并发布配置（注意：修改配置后一定要发布配置）；

8、点击【安装】开始安装；

9、安装完成后，打开技术平台确认微服务是否正常。

安装ISV REST API 路由插件

注意：8.2.106版本之前的脚手架需要安装此插件，8.2.106及后续版本不需要。

安装插件补丁
下载补丁，补丁下载地址：http://pan.yonyou.com/s/uPmkohcYT9Q 密码：rukh；

2、在安装器【全部产品】中上传补丁；

3、在相应环境点击【补丁安装】；

4、点击【下一步】进行安装补丁。（注意：补丁类型QP）

5、安装完成后，可以在相应环境补丁列表中进行查看。

发布路由接口

部署插件后，需要发布相应路由接口。

1、登录开放平台管理端，登录地址为（注意：是否开启SSL，协议不同）：

https://{工作台域名}/iuap-ipaas-base/ucf-wh/portal-fe/index.html#/

2、点击【API管理】>【API发布】（注意：只能在开放平台管理端发布）；

3、创建或者选择三级或者以下末级分类，JSON导入如下文件（另存为JSON文件，自定义文件名）；

[
{
"id":"8b0129352f874343a2dbb1c9febde477",
"name":"ISV REST API 路由",
"description":"",
"productClassifyId":"yonsuite",
"productClassifyCode":"yonbip",
"productClassifyName":"用友 YonBIP",
"productId":"4d12434dd5de42c2b6fffd093e31e074",
"productCode":"digitalModel",
"productName":"数字化建模",
"apiClassifyId":"ea8bf4dc0c5e4279a4c192d44d2e6861",
"apiClassifyName":"应用构建",
"apiClassifyCode":"",
"apiCode":"8b0129352f874343a2dbb1c9febde477",
"appCode":"",
"requestProtocol":"CUSTOM",
"openApi":1,
"idempotent":"non",
"preset":0,
"ucgSchema":"HTTPS",
"userIDPassthrough":0,
"sort":10,
"fixedUrl":"/yonbip/digitalModelisv",
"customUrl":"/rest/api",
"pathMatch":1,
"paramTransferMode":2,
"contentType":"application/json",
"httpRequestType":"POST",
"requestParamsDemo":"",
"arrayParam":0,
"paramDTOS":[],
"microServiceCode":"",
"connectUrl":"http://www.aaa.com",
"pathJoin":0,
"serviceHttpMethod":"POST",
"timeOut":"60",
"rpcAppName":"",
"rpcMethodName":"",
"rpcServiceName":"",
"rpcServiceUrl":"",
"functionId":"",
"routingStgy":0,
"routingStgyList":[],
"paramConstDTOS":[],
"paramMapDTOS":[],
"responseResultPassthrough":0,
"returnFormatType":"JSON",
"mock":0,
"paramReturnDTOS":[],
"authPluginName":"",
"authPluginStrategyName":"",
"tokenPluginName":"",
"resultParsePluginName":"",
"resultParsePluginStrategyName":"",
"apiDemoReturnRight":"",
"apiDemoReturnError":"",
"errorCodeDTOS":[]
}
]




4、导入成功后，点击【编辑】>【下一步】…，在【业务扩展插件】中选择部署的ISV路由插件；

如果看不到插件，可在数据库中执行以下SQL：

INSERT INTO `iuap_ipaas`.`ucg_base_plugin_info` (`id`, `isv_id`, `class_path`, `code`, `use_scene`, `configurable`, `default_plugin`, `description`, `expansion_conf`, `name`, `open_status`, `plugin_level`, `plugin_type`, `plugin_type_name`, `gmt_create`, `visible`, `gmt_update`, `dr`, `package_path`, `run_status`, `run_version`, `to_deploy`, `level_publishapp`, `level_system`, `level_app`, `level_api`, `custom`, `ytenant_id`) VALUES ('841cd235e7384c22aa06c3dc4c751304', '0', 'com.yonyou.ucg.plugin.isv.router.ISVRequestRouterPlugin', NULL, 1, 1, 0, 'ISV路由插件（外部访问内部）', NULL, 'ISV路由插件（外部访问内部）', 1, 'publishapp', 'auth', '业务扩展插件', '2020-05-23 16:46:16.000', 1, '2025-01-22 15:09:45.000', 0, NULL, 'run', '20231128134202317', 0, 1, 1, 1, 1, 1, '0');


5、返回值插件选择【返回参数转换插件】；

6、保存并发布接口。

配置统一Node

登录项目级配置地址：

https://{工作台域名}/mdf-node/nodeConfig

（注意：是否开启SSL，协议不同）

保存成功后配置将立即生效：

注意：

替换appServer值，features中的值需要保留；

当前新盘制作时配置已加入其中，可以只修改appServer值和添加useOSS属性。

{
"useOSS": true,
"dependencies": [
"developplatform"
],
"features": [
"UImobans",
"newMovePrevOrNext",
"batchExportWithCondition",
"unShowTempManager",
"mergeAllConditionStates",
"getTplIdFirst"
],
"appServer": "/p-ipc-pu-p00c-pvmt",
"env": {
"__PRINT_META__": {
"subPath": "print/getTemplateContent"
}
}
}


配置Nginx和Ingress

如果微服务编码以p-或者i-或者c-开头，不需要配置，否则需要通过nginx自动配置插件或者手动进行配置，以下分别介绍两种配置方式。

Nginx自动配置插件

1、确认在【YPR制品仓库】-【制品原材料】-【插件】中是否有相应引擎的插件，如果没有联系【用友开发赋能对接人】进行制作；

2、在【盘模版管理】编辑中添加此插件依赖后进行制盘；

3、在【YPR制品仓库】-【制品原材料】-【插件】中下载插件后，在本地部署环境安装器【全部产品】-【插件】上传此插件（注意：如果产品盘依赖于此插件，一定要在安装产品盘前上传插件，否则会报错）；

4、安装产品盘，最后一个步骤为安装此插件；

手动配置

1、在nginx配置文件/data/iuap/middleware/nginx/locations/ext/builder-location.conf， 添加以下配置(注意：替换微服务编码)；

location  ~ ^/p-i-pmd-p000-mpcf/(?P<YYBIPURI>.*) {
set $app_code 'p-i-pmd-p000-mpcf';
proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
proxy_set_header X-Forwarded-Host $http_host;
proxy_http_version 1.1;
proxy_set_header Connection "";
if ( $nginx-flag = "out-nginx"){
set $yonyoubipnginx "public";
}
proxy_set_header x-network-type $yonyoubipnginx;
proxy_set_header x-app-code $app_code;
proxy_set_header Host $real_host_ext;
proxy_pass http://$target_backend_ext/$YYBIPURI$is_args$args;
}



2、在nginx 配置文件/data/iuap/middleware/nginx/sites-enabled 添加C_maps.conf 配置文件，内容如下(注意：替换app_code及real_host_ext的值)；

map $app_code $real_host_ext {
'p-i-pmd-p000-mpcf' 'test-p-i-pmd-p000-mpcf.prod1.yonyoucloud-k8s.com';
}



3、在nginx 配置文件/data/iuap/middleware/nginx/sites-enabled 添加D_maps.conf 配置文件， 内容如下(注意：替换app_code及target_backend_ext的值)。

map $app_code $target_backend_ext {
'p-i-pmd-p000-mpcf' 'test-p-i-pmd-p000-mpcf.prod1.yonyoucloud-k8s.com';
}



注意：2、3中的real_host_ext和target_backend_ext的值可以从 /data/iuap/middleware/nginx/sites-enabled/upstreams-apps.conf文件中获取。

租户开通激活

1、登录工作台，切换租户至【系统管理】；

2、打开菜单【租户开通激活】，可以通过【新建企业账号】新建租户测试，也可以对已存在租户进行【产品开通激活】。

以新增租户为例，点击【新建企业账号】，填写企业账号名称和编码，点击【确认】；

点击【产品开通激活】，选择相关应用，点击【开通激活】，

点击【查看详情】查看开通进程（如果报错，针对错误进行分析处理）；

3、开通完成后切换至开通租户，在我的应用和菜单管理中可以看到开通的应用和服务，分配角色和授权后进行业务验证。

YMS配置

开通租户后，需要在YMS进行相关配置。

1、切换至开通租户，在【企业信息】中获取开通租户的租户ID；

2、打开菜单【API调用】，获取相应生态产品的AppKey和appSecret，并在API授权中添加“ISV REST API 路由”接口。

3、登录YMS控制台，选择相应环境，查询引擎，修改ucf.mdd.open-api.app-key、ucf.mdd.open-api.app-secret和ucf.mdd.open-api.tenant-id为开通租户中的相应值，如果有具体域名相关的变量，也需要调整。

常见问题
制盘时未找到微服务

问题：制盘时，需要添加在微服务中上传的产品包解压包，但是查询不到？

答案：选择添加微服务后，需要先点击【查看YBD服务】，再查询添加微服务。

未找到最新流水号

问题：前端制盘流水线重新执行后，在微服务流水号中未查询到最新日期的？

答案： 检查前端流水线是否有YPR阶段，检查前端脚手架module.xml文件中module的name是否与微服务基础档案中的微服务编码一致。

产品盘信息生成失败

问题：制盘时提示错误：下载安装模式配置文件失败:当前安装模式配置地址下没有对应的产品盘编码路径,请核对后重新制作？

答案：检查确认安装模式配置文件standard.xml路径是否正确，可参考2.6。

私有云环境无YMS配置

问题：安装完产品盘后，登录YMS配置，无相应ISV产品数据源配置和Redis配置？

答案：配置管理中的YMS配置中，“是否专属化”开关没有打开，需要打开后重新发布制盘安装。

ISV产品业务库和表未创建

问题：ISV产品盘在私有云环境安装完成后，其业务库和表未创建？

答案：由于私有云环境是多数据库环境，需要打开YMS逻辑数据源配置中的“专属化启用路由”开关后，重新发布制盘安装。

ISV产品安装报三方包校验失败

问题：安装ISV产品盘过程中报三方包校验失败，请确认是否刷新系统扩展包？

答案：在【YPR制品仓库】菜单中，点击【导出】-【导出】，选择并添加导出产品盘后点击下一步，选择【芯片架构】，选择【三方包】（已选产品盘和系统扩展包均需取消），

点击确认等待包导出，

进度成功后，点击下载（鼠标移到进度列），在下载包sh文件中找到包地址进行下载。（如果如法下载，联系用友开发赋能对接人进行下载）；

下载后在私有云环境安装器中上传，继续安装产品盘。