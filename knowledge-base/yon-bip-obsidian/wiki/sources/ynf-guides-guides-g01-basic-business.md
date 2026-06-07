---
title: "基础业务"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g01-basic-business"
section: "YNF-开发指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 开发指南]
platform_version: "BIP V5"
source_type: ynf-docs
images: 38
---

# 基础业务

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g01-basic-business | 所属：YNF-开发指南

# [](#基础业务)基础业务

## [](#二ynf项目多语接入)二、YNF项目多语接入

## [](#1-静态资源多语)1 静态资源多语

前端页面中使用到的静态资源多语，可以使用 `终端命令`和使用 `抽取工具`两种方式从前端工程中抽取多语词条。另外，介绍了领域写扩展脚本需要接入多语的情况。

### [](#11-使用终端命令)1.1 使用终端命令

#### [](#111-安装或升级ynf-dx-cli脚手架)1.1.1 安装或升级ynf-dx-cli脚手架

- 将ynf-dx-cli脚手架升级至最新版本。建议nodejs使用16.20及之前的版本。

ynpm install ynf-dx-cli

#### [](#112-在工程的ynfconfigjs文件中添加multilangconfig配置项)1.1.2 在工程的ynf.config.js文件中添加multilangConfig配置项

//YNF项目接入配置

multilangConfig: {

 productline: 'YS',

 domain: 'FED',

 project: 'CORE-YNF-FE',

 lineexclude:'console.*',

 excludepath:'mainfest.js,mainfest.tsx'

},

//需要更多配置参数见下一节的配置参数

- **此处配置项为必备项**，无配置项将会读取项目中已存在的multilangconfig.properties文件
- 文件配置优先级：ynf.config.js > multilangconfig.properties > none。

#### [](#113-配置参数)1.1.3 配置参数

目前已支持的参数包括：

||属性名称||类型||默认值||备注|
||**产品线（productline）**||string|||||
||**领域（domain）**||string|||||
||**项目标识（project）**||string|||||
||项目资源类型（type）||string||ts.tsx.js.jsx||后缀名称使用逗号分隔，例：‘ts,tsx’|
||文件路径排除(excludepath)||string|||||
||行排除（lineexclude）||string||console.*|||
||替换规则（replace）||string|||||
||替换规则新（newreplace）||string||{"js":"lang.templateByUuid()}|||
||tenantId||string||0|||
||开发层次（gradation）||number||1||0代表公共，1代表水平产品，2代表行业，3代表客开|
||扩展层级(extgradation)||number||0||对开发层次做一个补充，同样是层级越高优先级越高|
||数据抽取方式(extractiontype)||number||2||1:全部新增resid 2:增量|
||资源id复用逻辑(share)||string||product||all,product,domain,project|
||资源id查找逻辑(search)||string||product,domain,project||all,product,domain,project|
||**路径（path）**||string||工程中src目录位置|||
||**groupCode**||string||||可根据表格前三项自动生成|
||**配置路径（configpath）**||string||工程中生成multilangconfig.
properties文件位置|||

注：表格中红色加粗的参数为重要参数，请慎重修改

#### [](#114-执行抽取命令)1.1.4 执行抽取命令

- 在项目根目录下执行`ynf translate`命令，启动多语抽取服务。

**注意事项**：

- 因为文件占用原则，请勿同时启动多个抽取服务。
- 函数体外、类外、自执行函数定义的中文 (core中的文件需要注意) 建议调整位置后再抽取，以免影响运行时多语加载。无法调整的请引入"ac-lang-cn": "^5.0.0"。
- 关于运行时全局变量lang导致eslint在debug/build时报错的问题，可以通过在eslint.js文件中添加以下代码解决：

globals: {

 lang: 'writable'

 },

注：MACOS系统的电脑如果在抽取过程中如果存在权限错误，请使用sudo命令授权即可。

注：提交已抽取完的词条到git时，请删除multilangconfig.properties文件。

#### [](#115-确认翻译是否成功)1.1.5 确认翻译是否成功

选择本地模式时，可以通过本地项目工作树，查看本地代码对应词条是否变化，若全变成如下情况，即表明翻译成功

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-success.ccabc078.png)

### [](#12-使用抽取工具)1.2 使用抽取工具

#### [](#121-接入前准备)1.2.1 接入前准备

**项目内多语注册**

如果之前有抽取过多语应该就已经注册过，需要确认下。
在开始抽取多语之前确保（以otd-web为例）文件 hrcloud-otd-web/src/client/web/index.jsx 中第30行的注册多语的第三个参数有正确传入。

// 注册多语，第三个参数不能为空，为空可能会导致页面白屏。 

cb.lang.registerLang(process.env.__DOMAINKEY__, require('../../pack'), 'YS_HR_OTD-FE');

上例中，第三个参数为 YS_HR_OTD-FE。由 产品线名（固定YS）_领域名（固定HR）_项目标识名 组成。

**创建新分支**

基于目标分支去建新分支用于升级多语模型。

#### [](#122-下载多语新模型升级抽取工具20)1.2.2 下载多语新模型升级抽取工具2.0

[macMutilangTool.zip](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365&preview=/188187365/188189432/macMutilangTool.zip) --苹果系统抽取工具
[winMutilangTool.zip](https://uap-wiki.yyrd.com/download/attachments/188187365/winMutilangTool.zip?version=18&modificationDate=1717211981989&api=v2) --安卓系统抽取工具

根据系统下载各自对应的安装包，并进行解压。按抽取工具文档中的说明做具体的配置，抽取代码多语。

#### [](#123-启动脚本)1.2.3 启动脚本

根据各自系统点击start.command（mac）/start.bat（windows）等待程序启动，启动完毕后会自动调取系统默认浏览器进入抽取页面。

#### [](#124-升级前准备)1.2.4 升级前准备

- 确认给定抽取代码来自git项目，系统会自动匹配git项目所在文件夹并且读取.git里面的config文件寻找根目录路径。如果未找到则会抽取失败（**非git项目不支持抽取**）。
- 修改配置文件（非必须，也可以稍后在页面中配置）。

解压安装包后，先启动一下程序，程序启动起来后，在页面上填写完代码所在路径后会在代码根目录下生成一个multilangconfig.properties文件，你可以编辑该文件以配置相关参数（如果你之前使用的是1.0版本的multilangtools-core-XXX-SNAPSHOT.jar工具，你可以直接使用该配置文件覆盖现有的）。

#### [](#125-启动抽取工具)1.2.5 启动抽取工具

设置代码路径页面:填入本地需要抽取的**代码路径（绝对路径）**。

注：需要定位到src目录以下，如果代码里有编译后的代码会导致页面卡主不动。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-setpath.130d2072.png)

#### [](#126-维护配置页面)1.2.6 维护配置页面

里面的配置是原来config.properties里的。可以在这里进行维护。如果需要保存可以点击保存参数设置。系统会保存到confg/config.properties文件里。下次加载即可加载当前配置。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-operlist.8cb2bba3.png)
领域domain：填写项目domain

项目标识project：填写项目project

不清楚domain和project时，如下图，可以到ynf.config.js文件下查找：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-operlist2.c07fe6be.png)
以下是一些配置项的注意事项：

- **replace（旧规则）**：原来如果没有配置过这一项，则新模型下也不用改。如果原来配置过这项配置，则新抽取配置里原来的内容不变。新抽取规则需要放到newreplace项里，这点一定确认！！！！原因：因为升级需要原来的抽取规则进行匹配，所以原来的replace项已经用来匹配老模型正则使用。如果需要自定义新抽取规则，已经改为newreplace配置。
- **newreplace（新规则）**：这是一个新增的配置项，用于替代replace项，专门用于配置新模型下的升级规则。如果你需要更改默认的抽取规则，应该在这个配置项中进行设置。
- **lineexclude（排除行）**：原来lineexclude配置的排除模版方法需要升级为新的模版方法。否则会导致升级后中文参数会再次被抽取为多语资源！！（一般入参需要中文时需要这项配置）。

#### [](#127-选择操作类型)1.2.7 选择操作类型

如果历史数据没有进行过升级，需要先进行历史数据升级后再进行新代码抽取。
**历史数据升级**:会将代码里原来的老模型多语资源升级到现在的新模型。
**新代码抽取**：会将代码里的中文多语内容抽取为新模型下的多语资源。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-opertype.0d29c35a.png)
注：原则上这一项都需要填写，系统不提供默认值。但是如果项目确实已经升级完成了，不想每次都选这个的话，可以在配置文件multilangconfig.properties（路径见开头第一节）里面手动增加配置项opertype=1，重启后就会默认走新代码抽取。

#### [](#128-确认需要翻译的词条)1.2.8 确认需要翻译的词条

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-wordlist.4b0a812f.png)
这个界面需要确认所有抽取的词条是否需要翻译，某一大类不需要的也可以通过1.2.6中配置项进行排除。

#### [](#129-维护词条信息)1.2.9 维护词条信息

维护好词条的终端信息、所属服务(是前边填写domain所对应serviceCode)、详细分类后点击抽取即可将代码抽取为多语内容。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-oper-preserve.1b86296b.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-tool2.4c0ff75d.png)

#### [](#1210-确认本地模式或在线模式)1.2.10 确认本地模式或在线模式

本地模式：本地模式不会连接到翻译工作台，只会替换本地代码，建议正式抽取之间先试用本地模式进行验证。代码确认替换没问题后将代码回滚再进行在线模式。

在线模式：在线模式替换本地代码并连接到翻译工作台。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-extract-way.8d48e119.png)

#### [](#1211-确认翻译是否成功)1.2.11 确认翻译是否成功

选择本地模式时，可以通过本地项目工作树，查看本地代码对应词条是否变化，验证是否抽取成功。
选择在线模式时，可在翻译工作台看到抽取词条。可通过翻译状态看词条是否翻译完成。基本两到三天会就可以验证是否生效。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-tool3.0ee0a199.png)

### [](#13-扩展脚本领域使用拼接词条方法)1.3 扩展脚本（领域）使用拼接词条方法

- 申请测试环境相应groupCode的多语维护权限，联系张甜甜开通。
- 生成词条方法 ：

||API||说明||类型||默认值/参数|
||||统一处理多语词条拼接问题||function
(string,obj)||function(key,data); 
 key:对应多语服务的词条编码;
 data: 当前词条中需要插入的变量|

##### [](#示例一普通词条)示例一：普通词条

let text = "确定要删除XX员工吗?"

- 先拼接出词条 ： let text = "确定要删除<%=abandonText%>员工吗?"
- 目标语言切换到简体中文，并点击新增
- 点击确定，将生成的uuid复制一下，在代码中调用 lang.localeUuid(uuid, {abandonText:text}) 即可(API中已经做了为空处理)。
- 确认运行环境ac-lang-cn的版本，5.0.0之后不需要初始化资源
- 针对5.0.0前版本，尽量工程内维护一份简体中文资源，调用lang.init( { zh_CN: { uuid: 词条内容 } } )即可
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-tool.f75d54c9.png)

##### [](#示例二包含多个词条处理)示例二：包含多个词条处理

UID: P_YS_FED_XX_0001026024: '<%=text%> 上传失败！<%=code%> : <%=message%>'

调用 lang.localeUuid('UID: P_YS_FED_XX_0001026024',{text:"xx",code:'xx',message:'xx'})

#### [](#131-多语运行时加载)1.3.1 多语运行时加载

- 根据工作台的多语加载参数决定是否拉取多语
- 对于画布区，暂不接入多语。预览态与工作台节点内会按照上述条件拉取资源

## [](#2-元数据多语)2 元数据多语

元数据多语抽取的主要方式是通过翻译工作台抽取中文生成多语ID，再通过脚本将多语id回刷入数据库。

### [](#21-访问新翻译工作台)2.1 访问新翻译工作台

[https://bip-test.yonyoucloud.com/iuap-apcom-i18n/ucf-wh/vendor/index.html#/dev](https://bip-test.yonyoucloud.com/iuap-apcom-i18n/ucf-wh/vendor/index.html#/dev)
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/langui-register.bd828bb9.png)

### [](#22-注册ui多语节点要求-ui结尾)2.2 注册UI多语节点（要求-UI结尾）

发邮件给赵东升、肖小勇，邮件内容如图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-ui-register.d2df7b5b.png)
需要提供的信息：

模块对应产品经理：

产品线：

领域： 

固定资产（新）-YNF移动端UI模板： 

所属应用(编码)：

所属微服务(编码)：

### [](#23-注册多语抽取关系)2.3 注册多语抽取关系

发送：董政凯（[dongzhk@yonyou.com](mailto:dongzhk@yonyou.com)）
邮件示例：

YPD(YNF前端)抽取开发租户的多语信息:

UI元数据抽取多语言节点：应收管理(新)-UI模板(EAR-UI)

YPD引擎编码：yonbip-fi-earapbill

UI元数据抽取开发租户：0000L6YQ8AVLFUZPXD0000

UI抽取节点微服务编码(micro_service_code)：yonbip-fi-earapbill

### [](#24-授权多语应用)2.4 授权多语应用

在工作台搜索栏，输入发起流程

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-ui3.0d290cb7.png)
点击”发起流程“，搜索”多语节点权限申请“

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-ui4.a7720d52.png)
申请单填的内容如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-ui2.923978e0.png)

### [](#25-修改ui模板)2.5 修改UI模板

对于需要使用新多语的YPD节点，领域需要在页面设计器中补全微服务编码和领域工作台节点服务编码
⚠️注意：未补充microServiceCode字段的单据不抽取多语。

⚠️注意：参照的页面也需要补充microServiceCode。

微服务编码字段：microServiceCode

工作台服务编码字段：wbServiceCode

说明：微服务编码microServiceCode一般为领域的引擎编码。

工作台服务编码为领域产品预制在工作台的节点信息，参考 服务编码serviceCode。

修改位置为：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/langui-check.0889386f.png)

### [](#26-ui模板同步)2.6 UI模板同步

进入测试环境多语开发页面，找到自己的UI元数据多语节点，点击UI模板同步（新）按钮。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/lang-ui5.ea05e278.png)

等待弹框提示：“导入完成”
一直点击一直点击（这个是个异步过程，点到不报错为止）。

### [](#27-设计器验证效果)2.7 设计器验证效果

等待5分钟回到设计器页面，看开发租户协议中的资源编码是否已经完全替换成UID:P开头的资源编码

**元数据多语要生效需要做两个工作** ：

- 抽取元数据多语后把元数据脚本在对应环境执行；
- 将多语词条同步到对应环境。

## [](#三特征)三、特征

## [](#1-什么是特征特征用来做什么)1 什么是特征？特征用来做什么？

1、特征是用来扩展业务对象属性的，特征提供了在租户实施态对业务对象扩展属性进行统一描述和弹性扩展能力

2、特征有2个应用场景：一是用来扩展档案、单据的自定义项。二是用来弹性扩展业务对象的属性。弹性扩展业务对象属性意思是：通过将多个特征打包放到特征组中，可实现业务对象基于不同业务上下文有不同扩展属性要求，比如不同物料可以定义不同的物料属性、物料自由项、物料选配特征等。

## [](#2-自定义项特征)2 自定义项特征

### [](#21-功能概述)2.1 功能概述

- 对单据字段进行动态的扩展（租户级）
- 自定义项特征组件：controlType: Userdefinegroup

### [](#22-使用示例)2.2 使用示例

#### [](#221-配置自定义项特征组)2.2.1 配置自定义项特征组

![1719920975864](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719920975864.9c684d15.png)

#### [](#222-开启场景支持)2.2.2 开启场景支持

![1719920989387](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719920989387.8087a399.png)

#### [](#223-在特征节点选择启用的特征分配到自定义项实体上)2.2.3 在特征节点选择启用的特征分配到自定义项实体上

![1719921011914](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719921011914.81a36969.png)

#### [](#224-新建页面userdefinegroup组件是占位标绿的字段是分配到该实体的特征)2.2.4 新建页面Userdefinegroup组件是占位，标绿的字段是分配到该实体的特征

![1719921022670](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719921022670.34359fbf.png)

## [](#3-特征组)3 特征组

### [](#31-功能概述)3.1 功能概述

- 对物料字段进行动态的扩展（租户级）
- 物料特征组组件：controlType: Charactteristics

### [](#32-使用示例)3.2 使用示例

#### [](#321-应用构建--对象建模新建物料和特征字段)3.2.1 应用构建--对象建模新建物料和特征字段

![1719921247279](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719921247279.98fff349.png)

#### [](#322-特征组节点--新建特征组)3.2.2 特征组节点--新建特征组

![1719921255683](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719921255683.ffda06c6.png)

#### [](#323-物料模版节点--新建物料模版关联特征组)3.2.3 物料模版节点--新建物料模版关联特征组

![1719921263326](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719921263326.101706ec.png)

#### [](#324-物料创建节点--用物料模版新增物料)3.2.4 物料创建节点--用物料模版新增物料

![1719921270890](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719921270890.0b5d4775.png)

#### [](#325-新建页面模版生成协议即实现对所选物料进行属性的扩展)3.2.5 新建页面，模版生成协议，即实现对所选物料进行属性的扩展

![1719921276915](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719921276915.fcd23934.png)

## [](#四参照)四、参照

## [](#1-功能概述)1 功能概述

- 背景：在界面开发过程中，经常会出现需要引用系统中已定义的数据场景。在编辑界面上一般通过弹出数据选择界面来选择要引用的数据。在开发过程中，会经常重复使用相同的数据选择界面，例如单据上一般都会引用组织。因此需要提供一套统一的数据选择控件及服务，在业务单据开发时，只需要直接使用，减少业务开发的工作量。其次是基于表单模版进行开发时，框架需要一套标准的数据选择控件，已便于动态的进行控制。当需要引用数据时，使用统一的前端控件即可完成数据的选择，而不需要开发。为此，提供了统一公共的数据选择控件及服务框架，简称为参照。
- 参照目前支持三种界面展示样式：树、表、树表。

## [](#2-使用示例)2 使用示例

### [](#21-系统参照)2.1 系统参照

在对象建模中增加实体字段时支持选择公共系统元数据，直接创建参照。

#### [](#211-新建单选引用--多选引用实体字段)2.1.1 新建单选引用 && 多选引用实体字段

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1720401885585.8a990a5d.jpg)

#### [](#212-选择参照的引用实体)2.1.2 选择参照的引用实体

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1720402024146.4f6e406c.jpg)

#### [](#213-创建页面)2.1.3 创建页面

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1720402150044.d64277ce.jpg)

### [](#22-自定义参照)2.2 自定义参照

在页面建模中支持创建参照页面，在“参照”页签下，支持选择已有元数据，自定义创建参照页面并发布为公共参照。

#### [](#221-新建参照选择参照类型)2.2.1 新建参照，选择参照类型

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/自定义参照.adfdc273.png)

#### [](#222-选择参照的数据来源元数据配置参照页面的编码和名称发布类型)2.2.2 选择参照的数据来源元数据，配置参照页面的编码和名称、发布类型

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/新建参照.f1bc3587.png)

#### [](#223-保存或者保存并发布)2.2.3 保存或者保存并发布，

📢注意：保存则生成参照页面，但未发布为公共参照，保存并发布则是保存参照页面的同时发布为公共参照

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/保存或发布参照.8007be8e.png)

#### [](#224-进入参照页面设计器支持设计参照页面的展示)2.2.4 进入参照页面设计器，支持设计参照页面的展示

参照发布后，则可在页面设计器中的参照组件配置参照中的“自建参照”页面中被选中并使用

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/设计器设置参照.d2952a97.png)

## [](#五枚举)五、枚举

## [](#1-功能概述-1)1 功能概述

- 开发中通常使用枚举用于管理和展示预定义的状态、选项或配置，以优化用户体验和系统功能
- 枚举组件：controlType: Enumerate

## [](#2-使用示例-1)2 使用示例

### [](#21-对象建模--枚举管理)2.1 对象建模--枚举管理

#### [](#211-编辑实体新增枚举字段)2.1.1 编辑实体新增枚举字段

在实体编辑页面中，新增属性后，属性类型选择单选/多选时，需要选择枚举字段，在弹窗中列出系统内所有的公共枚举和自建枚举，也可支持快速新增枚举或在枚举管理中新建枚举。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/枚举编辑实体.0b136fb4.png)

#### [](#212-选择枚举源中点击新增枚举进入枚举编辑页面)2.1.2 选择枚举源中点击“新增”枚举，进入枚举编辑页面

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/枚举数据源中新增.6991c066.png)

#### [](#213-也可通过枚举管理中新建枚举)2.1.3 也可通过“枚举管理”中新建枚举

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/枚举管理.b3e42b4d.png)

### [](#22-效果展示)2.2 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1720404064519.f538f48f.jpg)

## [](#六查询方案)六、查询方案

## [](#1-功能概述-2)1 功能概述

- 查询方案一般由前台传入，在预置方案上设置值，用户可以选择查询栏目、查询条件、分组、排序；
- 查询方案类型主要有：系统预置方案、个人/公共方案

## [](#2-使用示例-2)2 使用示例

## [](#qa)Q&A

#### [](#1多语问题排查)1.多语问题排查

**中文存在、其他语种未翻译的情况：**

- 确认词条是否提交至词条库。
- 确认是否未待确认状态：多语运维租户、各位产品老师均有确认权限。其中产品老师每天下午4点会收到多语待确认的表格。
- 确认是否测试环境已翻译，日常未翻译： 联系相关开发同学抽取测试多语脚本，在对应的后端服务daily、release分支添加并执行流水线，确认sql即可。
- 确认groupCode返回的多语词条请求的入参正确，并验证UUID是否在返回数据中： 其他语种下，返回的词条为中文，请联系肖小勇、赵东升老师协助排查。

**显示乱码（UUID）的情况：**

- 确认是否为拼接词条，如果是请联系[zhumchj@yonyou.com](mailto:zhumchj@yonyou.com)添加。

#### [](#2其他多语接入常见问题)2.其他多语接入常见问题

其他多语接入常见问题可以参考以下文档的7.7节：
[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365)

## [](#参考)参考

- [多语平台使用手册 （总体 )](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=96706409)
- [UI元数据多语](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=169869561)
- [多语新模型升级抽取工具2.0](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365)
- [元数据多语抽取](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=197667684)
- [多语抽取文档整理](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=213452297)
- [YNF项目多语接入](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=37821771)