---
title: "YNF项目多语接入"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-ynfprojectduoyujieshu"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# YNF项目多语接入

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-ynfprojectduoyujieshu | 所属：指南

# [](#ynf项目多语接入)YNF项目多语接入

## [](#1-升级ynf-dx-cli脚手架至最新建议nodejs使用1620及之前的版本)1. 升级ynf-dx-cli脚手架至最新（建议nodejs使用16.20及之前的版本）

## [](#2-在工程的ynfconfigjs文件中添加multilangconfig配置项)2. 在工程的ynf.config.js文件中添加multilangConfig配置项

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YNFxiangmuduoyujieshu_image1.1625ec50.png)

注：此处配置项为必备项，无配置项将会读取项目中已存在的multilangconfig.properties文件

优先级： ynf.config.js  > multilangconfig.properties > none

## [](#3-已支持的参数)3. 已支持的参数

||属性名称||类型||默认值||备注|
||属性名称||类型||默认值||备注|
||**产品线（productline）**||string|||||
||**领域（domain）**||string|||||
||**项目标识（project）**||string|||||
||项目资源类型（type）||string||ts.tsx.js.jsx||后缀名称使用逗号分隔，例：‘ts,tsx’|
||文件路径排除(excludepath)||string|||||
||行排除（lineexclude）||string||console.*|||
||替换规则（replace）||string|||||
||替换规则新（newreplace）||string||{"js":"lang.templateByUuid('%resid', '%resvalue')","jsx":"lang.templateByUuid('%resid', '%resvalue')","ts":"lang.templateByUuid('%resid', '%resvalue')","tsx":"lang.templateByUuid('%resid', '%resvalue')"}|||
||**groupCode**||string||||可根据表格前三项自动生成|
||tenantId||string||0|||
||开发层次（gradation）||number||1||0代表公共，1代表水平产品，2代表行业，3代表客开|
||扩展层级(extgradation)||number||0||对开发层次做一个补充，同样是层级越高优先级越高|
||数据抽取方式(extractiontype)||number||2||1:全部新增resid 2:增量|
||资源id复用逻辑(share)||string||product||all,product,domain,project|
||资源id查找逻辑(search)||string||product,domain,project||all,product,domain,project|
||**路径（path）**||string||工程中src目录位置|||
||**配置路径（configpath）**||string||工程中生成multilangconfig.properties文件位置|||

注：表格中加粗的参数为重要参数，请慎重修改

## [](#4-执行抽取命令启动多语抽取服务)4. 执行抽取命令，启动多语抽取服务

- 在项目根目录下执行ynf translate启动
- 因为文件占用原则，请勿同时启动多个抽取服务
- **函数体外、类外、自执行函数定义的中文  (core中的文件需要注意)  建议调整位置后再抽取，以免影响运行时多语加载。无法调整的请引入"ac-lang-cn": "^5.0.0"**
-  关于运行时全局变量lang导致eslint在debug/build时报错的问题，可参考下图解决：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YNFxiangmuduoyujieshu_image2.26ad6b1d.png)

- 注：MACOS系统的电脑如果在抽取过程中如果存在权限错误，请使用sudo命令授权即可
- 注：提交已抽取完的词条到git时，请删除multilangconfig.properties文件

## [](#5-扩展脚本领域使用拼接词条方法)5. 扩展脚本（领域）使用拼接词条方法

### [](#51-申请测试环境相应groupcode的多语维护权限联系张甜甜开通)5.1. 申请测试环境相应groupCode的多语维护权限，联系张甜甜开通

### [](#52-生成词条方法)5.2. 生成词条方法

||API||说明||类型||默认值/参数|
||||统一处理多语词条拼接问题||function(string,obj)||function(key,data)key:对应多语服务的词条编码data: 当前词条中需要插入的变量|

**示例一:  普通词条**

 let text = "确定要删除XX员工吗?"

 先拼接出词条 ： let text = "确定要删除<%=abandonText%>员工吗?"

- 打开
- 目标语言切换到简体中文，并点击新增
- ![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YNFxiangmuduoyujieshu_image3.0d07c6ce.png)
- 点击确定，将生成的uuid复制一下，在代码中调用 lang.localeUuid(uuid, {abandonText:text}) 即可(API中已经做了为空处理)。
- 确认运行环境ac-lang-cn的版本，5.0.0之后不需要初始化资源
- 针对5.0.0前的版本，尽量工程内维护一份简体中文资源，调用lang.init( { zh_CN: { uuid: 词条内容 } } )即可

**示例二： 包含多个词条处理**

UID: P_YS_FED_XX_0001026024: '<%=text%> 上传失败！<%=code%> : <%=message%>',

调用 lang.localeUuid('UID: P_YS_FED_XX_0001026024',{text:"xx",code:'xx',message:'xx'})

## [](#6-多语运行时加载)6. 多语运行时加载

配置如图所示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YNFxiangmuduoyujieshu_image4.60cea2fd.png)

### [](#61-根据工作台的多语加载参数决定是否拉取多语)6.1.  根据工作台的多语加载参数决定是否拉取多语

### [](#62-对于画布区暂不接入多语预览态与工作台节点内会按照上述条件拉取资源)6.2.  对于画布区，暂不接入多语。预览态与工作台节点内会按照上述条件拉取资源

## [](#7-多语问题排查)7. 多语问题排查

### [](#71-中文存在其他语种未翻译的情况)7.1.  中文存在、其他语种未翻译的情况：

- 确认词条是否提交至词条库
- 确认是否未待确认状态：多语运维租户、各位产品老师均有确认权限。其中产品老师每天下午4点会收到多语待确认的表格
-  确认是否测试环境已翻译，日常未翻译： 联系相关开发同学抽取测试多语脚本，在对应的后端服务daily、release分支添加并执行流水线，确认sql即可
-  确认groupCode返回的多语词条请求的入参正确，并验证UUID是否在返回数据中： 其他语种下，返回的词条为中文，请联系肖小勇、赵东升老师协助排查

### [](#72-显示乱码uuid的情况)7.2.  显示乱码（UUID）的情况

确认是否为拼接词条，如果是，在调用lang.localeUuid('UID: P_YS_FED_XX_0001026024',{text:"xx",code:'xx',message:'xx'}, '<%=text%> 上传失败！<%=code%> : <%=message%>')时，加上第三个参数