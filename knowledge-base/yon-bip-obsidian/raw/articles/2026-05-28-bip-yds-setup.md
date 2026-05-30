# 基于YDS开发准备及环境搭建

> 来源：YonBIP 社区文档中心 - c2.yonyoucloud.com
> 抓取时间：2026-05-28
> 原始URL：https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/GYYISVHJDJ1
> 注意：58张操作截图

社区文档中心
首页
文档导航
开发者社区
社区论坛
视频教程技术博客
更多
张宏涛
资料中心
专业开发
产品概述
快速入门
环境准备
应用引擎
基于YDS开发准备及环境搭建
应用创建
单据开发入门
应用发布
操作指南
开发指南
最佳实践
参考手册
常见问题
视频教程
专业开发/快速入门/应用引擎/基于YDS开发准备及环境搭建
基于YDS开发准备及环境搭建
最后更新时间：2025-12-29
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	否
私有云	客户化定制开发	否
专属云	客户化定制开发	否
本地部署	客户化定制开发	是
公有云	ISV生态开发	否
私有云	ISV生态开发	否
专属云	ISV生态开发	否
本地部署	ISV生态开发	是

基于YDS开发，需要搭建本地环境，开发成果可以适用于以上所有环境

业务场景

YDS的简称是YonBuilder Developer Studio，提供全面的一站式开发解决方案，涵盖了从项目创建、工程协同调试、部署，到制品生成和补丁制作等关键环节，确保开发服务流程的高效与连贯性。他的优点很多，其中包括：YonBuilder的开发流程集成；云机一体调试，即云上的服务和本地一起调试；前后端一体化开发，支持前端后端同步开发；离线制品制作，其中包括安装盘、补丁；基于云中间件实现分布式服务开发。

针对原生ISV，YDS可以通过搭建多套环境，支持多版本，如V3R6 、BIP5.0不同版本的开发。

关键词

YDS， 前端开发， 后端开发，standalone，云原生， 云机一体调试，专业服务开发，制品，补丁

专业名词术语

VSCode：全称Visual Studio Code，是微软的一款轻量级、跨平台的代码编辑器。

YDS：全称YonBuilder Developer Studio（YDS），为开发者提供全生命周期的研发解决方案；

YMS 中间件（YMS HOME）：YMS HOME 是YMS所需的工程结构，包含yms中间件，数据库驱动等一系列的中间件；

创建微服务工程：自动创建YMS微服务工程（需要提供微服务CODE和group ID）；

同步配置：在简强环境下，从YMS控制台拉取服务配置至本地的config目录，这些配置将放到YMS home的config目录中；

部署微服务：微服务打包编译并且部署至YMS 中间件中；

启动微服务：以非调试模式启动微服务；

调试微服务：调试模式启动YMS 微服务，帮助开发者快速定位代码中的错误和异常；

一起部署的微服务：将外部的微服务（YPR、流水线、客开服务等）和工作区中的微服务一起部署至YMS 中间件中；

一起联调的微服务：把其它环境的服务流量转到本地和工作区中的微服务一起运行联调；

工作区：YDS工程的目录，用于多服务的联调部署；

RDBGA：全称Remote Debug Address，是一种根据上下文进行代理请求地址的技术。云上云下服务通过RDBGA技术提升了开发效率，使开发者能够在本地与云端环境无缝协作，快速测试和调试代码变更，并提供即时数据访问，简化配置，以便迅速模拟真实环境并解决问题.

YDS总体介绍
YDS的总体架构

YDS的主要功能特性
功能	说明
支持云原生（包含标准云原生，简强云原生）和Standalone开发模式	同时支持简强环境开发和云原生环境开发
多工程支持	一个工作区可以支持前后端微服务/二三方包/一方包同时开发和调试
添加本地仓库和ypr仓库	支持将本地文件夹作为仓库或直接引用线上的ypr仓库
支持YMS Cloud微服务视图	以树型结构展示指定环境中正在运行的微服务
支持YMS Cloud流水线视图	以树型结构展示指定环境中的流水线及构建记录
添加一起部署的微服务	支持将仓库中的微服务添加为一起部署的微服务
添加一起联调的微服务	支持将正在运行的微服务添加为依赖进行联调
一键部署YMS中间件	一键完成yms 中间件部署，用于开发和调试
附加YMS源代码	附件yms的源代码到正在开发的项目，调试时使用
一键启动调试	自动创建调试配置并启动
一键打开工作台	打开工作台并自动植入调试配置
安装盘制作	基于开发的项目生成安装盘
QP补丁制作	基于基线生成QP补丁
开发工具配置

YDS是一套用于VSCode开发BIP应用的插件集合。支持YDS分布式开发环境的最低环境版本为BIP5 0315版本和R6 0326合集补丁，本文介绍的是BIP5的环境搭建。

平台提供All in One 安装模式。开发者可以根据自己电脑的操作系统下载对应的安装文件（BIP5环境，需要下载JDK21的版本），All in One安装包集成了整个所需的开发环境依赖（jdk，maven，git等都无需额外安装配置）。

下载地址：YDS下载中心

根据自己的操作系统下载对应的安装文件进行安装，安装成功后（检查下YDS插件是否最新的，如不是可以在插件市场升级下），第一次打开需要选择Maven的settings文件（settings文件需要找专属化环境，运维负责人统一获取，且保证能下载到依赖）。

引擎创建

本文主要介绍基于YDS引擎的创建，也可以直接在工作台创建引擎，方法请参考专业版引擎部署

账号登录

1）打开YDS工具，先选择一个空文件目录（不可以选择带中文目录），如下图：

2） 打开YDS工具，点击左侧YDS图标，提示要先登录技术中台，如下图：

3） 点击YonCTP去登录技术中台（目的是为了拉取yms等环境信息），输入技术中台地址和账号，如下图：

4）登录技术中台成功后，选择系统环境，比如本案例是在开发环境，如下图：

5）技术中台成功配置之后，继续点击业务中台登录，如下图

6）输入业务中台地址和账号，如下图：

7）登录业务中台成功后，选择租户信息和环境信息，如下图：

8）成功登陆业务中台后，如下图：

创建引擎

在使用YDS执行命令动作时，可以借助YDS工具的选择框查找

手动打开方式：

在YDS的搜索框，输入按键 >

快捷键打开方式：

Windows：Ctrl+Shift+P 打开命令选择框

Mac：Command+Shift+P 打开命令选择框

1） 在YDS的搜索框，输入按键 >，搜索“YDS:Create YonBuilder Engine”并点击，如下图：

2） 选中“YDS:Create YonBuilder Engine”，并回车确认，如下图：

3） 先输入引擎名称，并回车，如下图：

4） 然后输入符合规范的引擎编码（【开发规范-引擎规范】），并回车，如下图：

5） 输入引擎编码回车之后，脚手架工程会生成到对应的目录中，如下图：

6） YDS可以把生成的脚手架工程打开，项目结构目录主要包括{引擎名}-be，{引擎名}-fe，ynf-{引擎名}，还有一个符合当前环境，拉取maven依赖的settings.xml文件（如果首次YDS配置的settings.xml里的内容不正确，可以用该文件），如下图：

7） 此时也可以打开业务中台登录验证，菜单搜索：应用引擎，可以看到我们创建的引擎情况，如下图：

注意：除了通过YDS工具能创建应用引擎外，在当前单据里，也支持创建应用引擎

8） 引擎创建成功，YMS相关的信息会自动配置，数据库也会自动创建当前引擎对应的schema，初始化系统表，如下图：

环境搭建
启动后端脚手架

启动后端代码工程，点击功能按钮图标（功能按钮分为二种模式：debug启动、直接启动）来启动后端工程，如下图：

首次启动脚手架时，会弹出需要运行的工程，我们需要勾选，如下图：

勾选之后，点击OK，后端脚手架会先进行编译，编译完后自动启动。同时也可以看下YDS视图工具里，会显示已勾选的工程，如下图：

启动过程中，终端里会详细打印具体日志，如下图：

看到控制台里，显示YMSAllModuleReady时，则服务已经正常启动完毕，如下图：

启动成功之后，可以浏览器输入：http://localhost:62871/_yms/ready，来访问健康检查接口，能正常打印出信息，则证明启动成功，如下图：

启动前端脚手架

功能按钮：该图标按钮是启动本地前端脚手架并打开工作台，然后将云端资源代理到本地，开发调试时选择该按钮，该图标按钮是启动插件的服务，负责将本地的请求代理到云端，是一个降级方案，防止云端网络到本地不通，应用未发布也可以用该按钮调试，如下图：

点击YDS视图工具按钮，选中前端代码工程，点击启动脚手架功能按钮，启动前端脚手架，如下图：

首次启动时会先自动下载node_modules文件到前端工程根目录里，该过程需要等待几分钟，下载完毕后会自动启动，启动过程中终端会详细打印具体日志，如下图：

启动成功后，YDS自动打开内嵌浏览器的工作台，并在浏览器cookie里植入RDBGA（Remote Debug Address)根据上下文进行代理请求后端脚手架的地址，如下图：

前后端本地调试

当前支持两种调试方式，一种通过RDBGA从云端转发到自己的后端，另一种是通过HOST直接访问自己本地后端。

RDBGA调试方式

按照章节5.1和5.2方式启动的前后端脚手架，通过YDS内置浏览器打开的工作台，在访问自建单据时，已具备本地调试的模式，前端请求的接口会由RDBGA技术从云端转发到本地后端接口，其原理图如下：

HOST调试方式

有些场景云端到本地的网络不通，或者62871端口无法访问，如果想前后端调试，则需要配置HOST代理方式调试（需提前配置本地HOST）。

调用本地后端，需要修改前端脚手架 config.env.js 中的相关参数。配置文件位置：xxxxx-fe/src/common/config.env.js ，如下图：

修改内容，如下图：

配置文件修改如下：

/**
* 1. 全局配置的环境变量
* 2. DOMAIN_KEY 领域应用的 domainKey * 3. HTTP_SERVICE_BASEURL Java 服务地址(仅本地调试和独立 Node 需要配置) * 4. HTTP_MAIN_ORIGIN 主站域名（仅本地调试需要配置）
*/
const config = {
DOMAIN_KEY: packageJson.domainKey || '', //后端服务地址，注 local.yyuap.com 为本机 host 配置的回路地址
HTTP_SERVICE_BASEURL: 'http://local.yyuap.com:62871', // 本地调试和独立 Node 时必输
HTTP_MAIN_ORIGIN: 'http://eco-dev.yyuap.com' // 本地调试必输
}


本地前、后端脚手架启动成功之后，验证下相关服务是否正常运行，需要本地访问下自建应用

中的单据页面，以需求单为例，通过预览列表页面获取连接地址：

https://eco-dev.yyuap.com/mdf-node/meta/VoucherList/N22843_myappList?domainKey=c-eco-hqs-app&engine=MDF&busiObj=N22843_myapp&busiObj=N22843_myapp&busiObj=N22843_myapp&designPreview=true&locale=zh_CN

替换连接地址前缀为“http://local.yyuap.com:3003”进行访问，页面正常加载显示数据列表则前后端本地环境搭建成功，如下图：

环境搭建常见问题
启动后端脚手架时，控制台报证书相关的异常

解决：YDS在搜索框输入>，搜索“YDS：Import Workbench Domain Certificate to JVM”并点击，如下图：

YDS开发阶段（YDS打开工作台，RDBGA代理走脚手架服务），预览单据报错，如下图：

解决：首先排健康检查接口，看后端脚手架是否启动

如果接口正常，则需要排查线上服务器端口策略和本地防火墙，看下是否跟本地62871端口能ping通;

后端脚手架启动报FileNotFoundException异常

解决：排查下工程目录是否有中文，目前中文目录下会导致加载不到yms-home里的yms.jar文件。

公有云环境，引擎编码如何申请？
需要在公有云管理租户进行应用编码和微服务申请，一个ISV或客开申请一个微服务编码多个应用编码。
申请通过后即可使用对应的应用编码和微服务编码，如果未审核通过，需要重新更改。

maven下载不到依赖，如何更换settings.xml文件

解决：专属化YDS配置的settings.xml不正确，会导致拉取不到依赖；创建完引擎后，打开的脚手架里，会预制一个专属当前环境的settings.xml，可以修改指定该文件；

修改方式可以在设置里，搜索maven，进行更改，如下图：

还可以编辑打开settings.json进行修改maven.settingsFile路径文件，如下图：

这3个配置同一个地址即可：

maven.settingsFile是vscode-maven插件的配置，工程编译启动、制盘时使用；
java.configuration.maven.userSettings是vscode-java的配置，与maven.settingsFile功能类似，但主要影响Java插件在解析项目依赖、构建路径等过程中对Maven配置的读取；
java.configuration.maven.globalSettings是全局的maven配置，可以不配置，或者配置同上内容；
如果设备为多网卡，需要选择正确的监听IP才能确保流量打到本机。请通过yds.serverBindAddress绑定正确的ip地址。

如果本机安装的chrome浏览器版本较高，YDS工具会弹窗下载低版本chrome插件来支持调试，如果发现YDS打开的浏览器没有override栏，则看下是否本机已经下载过插件，如果已经下载过，需要手动配置下。

解决：如果是window系统，默认下载的插件在
C:\Users\Administrator\.yds\chrome\Chrome-bin，如果是mac系统，默认下载地的插件在/Users/用户名/.yds/chrome/Chromium.app/Contents/MacOS/Chromium，则需要手动指定chrome插件路径，如下图

后端脚手架启动报FSClinet相关错误，创建桶操作失败。如下图：

解决：因为用友部分办公网络禁止了SSH协议连接研发网服务器，因此通过SFTP协议访问的对象存储服务不可用，因此需要换种存储模式，例如改成本地存储，配置方式如下图：

然后覆盖文件内容如下，然后重启服务：

{
  "objectStorage.pools": {
    "local-file-storage": {
      "baseCode": "local-file-storage",
      "clientType": "Local",
      "endpoint": "",
      "secretKeyId": "",
      "accessKeySecret": "",
      "bucketName": "",
      "acl": "",
      "enablePostfix": false,
      "securityToken": "",
      "enableCallback": false,
      "region": "",
      "trackerServers": "",
      "fdfsreadServer": "",
      "charset": "",
      "callbackObject": null,
      "downloadEndpoint": "",
      "uploadEndpoint": "",
      "storeDir": "/Users/shan/yonyou/projects",
      "lastUpdateTime": "1742991312000"
    }
  },
  "objectStorage.clients": {
    "c-isv-hjyz-test_logicStorage": {
      "name": "c-isv-hjyz-test_logicStorage",
      "pool": "local-file-storage",
      "appBucketName": ""
    }
  }
}

如何修改settings.json文件及其各参数介绍

解决：请参考YDS开发settings.json参数介绍

YDS引擎创建失败

解决：检查是否登录了工作台和技术中台，编码规则是否符合规范，是否已经存在；比如如下异常，就是未登录导致；

文档内容是否对您有所帮助？
为帮助文档评分：
页内目录
1. 概述
1.1 适用场景
1.2 业务场景
1.3 关键词
1.4 专业名词术语
2. YDS总体介绍
2.1 YDS的总体架构
2.2 YDS的主要功能特性
3. 开发工具配置
4. 引擎创建
4.1 账号登录
4.2 创建引擎
5. 环境搭建
5.1 启动后端脚手架
5.2 启动前端脚手架
5.3 前后端本地调试
5.3.1 RDBGA调试方式
5.3.2 HOST调试方式
6. 环境搭建常见问题
文档反馈
北京市海淀区北清路68号用友产业园
4006-600-588
友情链接
用友官网用友YonHelp用友iuap平台用友云市场用友云注册协议隐私条款

Copyright ©2020 用友网络科技股份有限公司版权所有京ICP备05007539号-24京公网安备11010802021935号

返回顶部
加载中...