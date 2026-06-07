---
title: "CN项目前端多语改造方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-cnxiangmuqianduanduoyugaizaofangan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# CN项目前端多语改造方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-cnxiangmuqianduanduoyugaizaofangan | 所属：指南

# [](#cn项目前端多语改造方案2023)CN项目前端多语改造方案（2023）

注意：

- 改造完去iframe节点如果上专属化必须确认工作台已经升级ac-lang-cn包。          
- 如果项目以组件形式对外提供，需要由适用方拉取多语资源，组件内部不要拉资源**

## [](#1-改造背景)1. 改造背景

原有多语方案，同一个中文对应的是相同的多语词条，而对于相同的中文，不同的场景，翻译成不同的外文能力支持有限。

## [](#2-整体改造方案)2. 整体改造方案

- 多语资源抽取由流水线抽取，改成本地抽取，抽取后的代码，直接提交到git上。
- 多语资源id每一个中文（无论是否相同），均对应一个唯一的uuid资源编码
- 支持复数，比如：前端的 "**个苹果" 如果一个苹果，英文翻译为 one apple 如果两个苹果，英文翻译为 two  apples
- 支持所见即所得翻译

## [](#3-cn工程)3. CN工程

### [](#31-更新ac-lang-cn包版本到506)3.1. 更新ac-lang-cn包版本到5.0.6

[https://package.yonyoucloud.com/package/detail/ac-lang-cn](https://package.yonyoucloud.com/package/detail/ac-lang-cn)

如果依赖的有@mdf/inputmultilang包，需要将@mdf/inputmultilang升级到3.0.28版本

### [](#32-api替换)3.2. api替换

如果是去iframe的CN项目，在工作台内打开的节点，优先用window.lang

// 之前

lang.init('packjs');

lang.jsonp("租户id","groupCode",**)

// 新的

lang.init('packjs');

lang.jsonpUuid("租户id","groupCode",**)

核实groupCode是由productlint_domain_project下划线拼接而来

### [](#33-更新工具)3.3. 更新工具

基于测试环境分支切一个分支，下载最新抽取工具

[多语新模型升级抽取工具2.0 - UCF](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365)

### [](#34-工具中更改抽取替换规则)3.4. 工具中更改抽取替换规则

#### [](#341-批量处理非拼接字段抽取工具-展开更多-替换规则)3.4.1. 批量处理非拼接字段（抽取工具-》展开更多-》替换规则）

// 修改前

replace={"java":"com.yonyou.iuap.ucf.common.i18n.MessageUtils.getMessage("%resid", "%resvalue") /* "%resvalue" */","js":"lang.template("%resid", "%resvalue") /* "%resvalue" */","jsx":"lang.template("%resid", "%resvalue") /* "%resvalue" */","ts":"lang.template("%resid", "%resvalue") /* "%resvalue" */"}

 

// 修改后

replace={"java":"com.yonyou.iuap.ucf.common.i18n.MessageUtils.getMessage('%resid', '%resvalue')","js":"lang.template('%resid', '%resvalue')","jsx":"lang.template('%resid', '%resvalue')","ts":"lang.template('%resid', '%resvalue')"}

newreplace={"java":"com.yonyou.iuap.ucf.common.i18n.MessageUtils.getMessage('%resid', '%resvalue)","js":"lang.templateByUuid('%resid', '%resvalue')","jsx":"lang.templateByUuid('%resid', '%resvalue')","ts":"lang.templateByUuid('%resid', '%resvalue')"}

抽取完以后，const text = '你好' 会改成 const text = lang.templateByUuid('uuid', '你好')；确认没问题后，直接提交到git上。

#### [](#342-批量处理处理拼接字段抽取工具-展开更多-替换规则)3.4.2. 批量处理处理拼接字段（抽取工具-》展开更多-》替换规则）

// 将第一条处理非拼接字段的 replace 和newreplae注释掉

// 修改为

replace={"js":"lang.locale('%resid',","jsx":lang.locale('%resid',"}

newreplace={"js":"lang.localeUuid('%resid',","jsx":"lang.localeUuid('%resid',"}

抽取完以后 lang.locale('P_YS_FED_FW_0001219575', {text: caption})

会改成 lang.localeUuid('UID:P_FW_1674830313993797637', {text: caption})，为了支持多语短路的情况，需要手动为cb.localeUuid添加第三个参数，cb.localeUuid('UID:P_FW_1674830313993797637', {text: caption}，'test<%=caption%>1111')

确认都替换完毕以后，提交到git上

#### [](#343-去掉流水线抽取命令)3.4.3. 去掉流水线抽取命令

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuqianduanduoyugaizaofangan(2023)_image1.799c6259.png)

将上图我圈的多语抽取命令删除即可

## [](#4-复数适配无复数需求可不考虑)4. 复数适配(无复数需求可不考虑)

### [](#41-在新的翻译工作台开发态新增词条)4.1. 在新的翻译工作台开发态，新增词条

新增一个拼接词条（如果已经有拼接词条，可不新增）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuqianduanduoyugaizaofangan(2023)_image2.95146353.png)

找到这个拼接词条，点击复数拆分

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuqianduanduoyugaizaofangan(2023)_image3.5fbd1c7f.png)

录入单复数翻译

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuqianduanduoyugaizaofangan(2023)_image4.952a2812.png)

源码中换成

lang.templatePlural('UID:P_TRS-FE_1740CCB604B00004', { num: num },

num) 即可

增加请求复数参数

lang.jsonpUuid("租户id","groupCode",url, done, 'YS',false, {needPlural: true})

## [](#5-所见即所得翻译适配)5. 所见即所得翻译适配

[https://package.yonyoucloud.com/package/detail/yyuap-instantTranslation](https://package.yonyoucloud.com/package/detail/yyuap-instantTranslation)

注意事项 (需要升级最新tinper next >= 4.4.5)

- 去iframe页面，由工作台接入即时翻译组件，领域不需要再次引入
- 非去iframe页面，根据以下配置指引接入即时翻译组件
- 后端多语及内容多语暂不支持即时翻译

1.安装

npm i -S yyuap-instantTranslation@1.0.14

2.导入

react:

import * as Translation from 'yyuap-instantTranslation'

import 'yyuap-instantTranslation/dist/main.css'

// 以下参数获取方式 jDiwork.getContext(data => data.EnableRealTimeTrans || data.tenantid || data.locale)

Translation.create({

 tenantId: '0',

 enabled: true, 

 locale: 'zh_CN'

});

非react:

import * as Translation from 'yyuap-instantTranslation/lib/main.js'

import 'yyuap-instantTranslation/lib/main.css'

// 以下参数获取方式 jDiwork.getContext(data => data.EnableRealTimeTrans || data.tenantid || data.locale)

Translation.create({

 tenantId: '0',

 enabled: true,

 locale: 'zh_CN'

});

CDN:

方式一:

<script src="/iuap-tns/ucf-wh/share/static/react/16.14.0/umd/react.production.min.js"></script>

<script src="/iuap-tns/ucf-wh/share/static/react-dom/16.14.0/umd/react-dom.production.min.js"></script>

<script src="/iuap-tns/ucf-wh/share/static/tinper-next/4.4.2/tinper-next.min.js"></script>

<link href="/iuap-tns/ucf-wh/share/static/tinper-next/4.4.2/tinper-next.css" type="text/css" rel="stylesheet"/>

<script src="/iuap-apcom-i18n/ucf-wh/instantTranslation/dist/main.js"></script>

<link rel="stylesheet" href="/iuap-apcom-i18n/ucf-wh/instantTranslation/dist/main.css"></link>

// 以下参数获取方式 jDiwork.getContext(data => data.EnableRealTimeTrans || data.tenantid || data.locale)

Translation.create({

 userId: '111',

 tenantId: '0',

 enabled: true,

 locale: 'zh_CN'

});

module.xml 配置依赖的前端服务名及tagName版本标识

<module name="" description="">

 <nginx_mode>ucf</nginx_mode>

 <ucf_engine>

 <dependencies>

 <dependency name="iuap-apcom-i18n-fe" tag="release" />

 </dependencies>

 </ucf_engine>

</module>

方式二（支持vue）:

<script src="/iuap-apcom-i18n/ucf-wh/instantTranslation/lib/main.js"></script>

<link rel="stylesheet" href="/iuap-apcom-i18n/ucf-wh/instantTranslation/lib/main.css"></link>

// 以下参数获取方式 jDiwork.getContext(data => data.EnableRealTimeTrans || data.tenantid || data.locale)

Translation.create({

 userId: '111',

 tenantId: '0',

 enabled: true,

 locale: 'zh_CN'

});

### [](#51-modulexml-配置依赖的前端服务名及tagname版本标识)5.1. module.xml 配置依赖的前端服务名及tagName版本标识

<module name="" description="">

<nginx_mode>ucf</nginx_mode>

<ucf_engine>

<dependencies>

<dependency name="iuap-apcom-i18n-fe" tag="release" />

</dependencies>

</ucf_engine>

</module>

## [](#6-常见兼容问题处理)6. 常见兼容问题处理

工作台菜单 -》 语言设置 -》 开启即时翻译

- 开启即时翻译，title属性，会显示【Object object】、其他需要展示string类型的地方，会显示【Object object】 、下拉列表的option的key值如果是多语词条，onChange取到的内容会是dom对象
问题实例：

title={lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言"}

解决方法：增加参数，返回字符串

title={lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言", undefined, { returnStr: true }}

- 开启即时翻译，placeHolder属性，会显示【Object object】

问题实例：

placeholder={lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言"}

解决方法：

A.如果是使用的钉耙组件，由钉耙中间层处理成字符串

B.如果使用的原生组件，抽取工具替换后，手动添加额外参数，如下所示

placeholder={lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言", undefined, { returnStr: true }}

C.如果是拼接词条，手动修改lang.localeUuid("UID:P_TRS-FE_1671241052790981057", {data, returnStr: true})

- 开启即时翻译,字符串拼接的会显示【Object object】
问题实例：

lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言") + 'test' + lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言")

`${lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言")}test${lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言")}`

解决方法：

A.改为词条拼接的方式（支持即时翻译操作，建议使用）
[多语词条拼接问题处理（新）](#/guides/20-duoyucitiaopinjiewentichuli)

B.改为数组的方式（支持即时翻译操作，但某些场景可能不支持这种写法）

[lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言"), 'test',lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言")]

C.增加参数，返回字符串（不支持即时翻译操作）

lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言", undefined, { returnStr: true }) + 'test' + lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言", undefined, { returnStr: true })

`${lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言", undefined, { returnStr: true })}test${lang.templateByUuid("UID:P_TRS-FE_1671241052790981057", "源语言", undefined, { returnStr: true })}`

试点场景:

店铺装修: gscm-designer、yxcommon

整理所有要升级的代码场景.