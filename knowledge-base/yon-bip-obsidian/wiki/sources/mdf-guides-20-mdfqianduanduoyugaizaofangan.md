---
title: "MDF前端多语改造方案（2023）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-mdfqianduanduoyugaizaofangan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# MDF前端多语改造方案（2023）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-mdfqianduanduoyugaizaofangan | 所属：指南

# [](#mdf前端多语改造方案2023)MDF前端多语改造方案（2023）

**注意：改造完如果上专属化必须确认MDF框架已经上**

## [](#改造背景)改造背景

     
原有多语方案，同一个中文对应的是相同的多语词条，而对于相同的中文，不同的场景，翻译成不同的外文能力支持有限。

## [](#整体改造方案)整体改造方案

- 多语资源抽取由流水线抽取，改成本地抽取，抽取后的代码，直接提交到git上。
- 多语资源id每一个中文（无论是否相同），均对应一个唯一的uuid资源编码
- 支持复数，比如：前端的 "**个苹果" 如果一个苹果，英文翻译为 one apple 如果两个苹果，英文翻译为 two  apples
- 支持所见即所得翻译

## [](#mdf工程)MDF工程

### [](#1-更新工具)1. 更新工具

基于测试环境分支切一个分支，下载最新抽取工具

[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365)

工具下载完以后，按下面视频一步步操作即可

![](data:image/png;base64,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)

### [](#2-工具中更改抽取替换规则)2. 工具中更改抽取替换规则

#### [](#21-批量处理非拼接字段抽取工具-展开更多-替换规则)2.1. 批量处理非拼接字段（抽取工具-》展开更多-》替换规则）

// 修改前

replace={"java":"com.yonyou.iuap.ucf.common.i18n.MessageUtils.getMessage("%resid", "%resvalue") /* "%resvalue" */","js":"cb.lang.template("%resid", "%resvalue") /* "%resvalue" */","jsx":"cb.lang.template("%resid", "%resvalue") /* "%resvalue" */","ts":"cb.lang.template("%resid", "%resvalue") /* "%resvalue" */"}

 

// 修改后

replace={"java":"com.yonyou.iuap.ucf.common.i18n.MessageUtils.getMessage('%resid', '%resvalue')","js":"cb.lang.template('%resid', '%resvalue')","jsx":"cb.lang.template('%resid', '%resvalue')","ts":"cb.lang.template('%resid', '%resvalue')"}

newreplace={"java":"com.yonyou.iuap.ucf.common.i18n.MessageUtils.getMessage('%resid', '%resvalue)","js":"cb.lang.templateByUuid('%resid', '%resvalue')","jsx":"cb.lang.templateByUuid('%resid', '%resvalue')","ts":"cb.lang.templateByUuid('%resid', '%resvalue')"}

抽取完以后，const text = '你好' 会改成 const text = cb.lang.templateByUuid('uuid', '你好')；确认没问题后，直接提交到git上。

#### [](#22-批量处理处理拼接字段抽取工具-展开更多-替换规则)2.2. 批量处理处理拼接字段（抽取工具-》展开更多-》替换规则）

处理完非拼接字段后，将replace和newreplace注释掉，将下面新的replace和newreplace复制到新的位置，处理拼接字段

// 将第一条处理非拼接字段的 replace 和newreplae注释掉

// 修改为

replace={"js": "cb.locale('%resid',","jsx":"cb.locale('%resid',"}

newreplace={"js":"cb.localeUuid('%resid',","jsx":"cb.localeUuid('%resid',"}

抽取完以后cb.locale('P_YS_FED_FW_0001219575', {text: caption}) 

会改成  cb.localeUuid('UID:P_FW_1674830313993797637', {text: caption})

为了支持多语短路的情况，需要手动为cb.localeUuid添加第三个参数，cb.localeUuid('UID:P_FW_1674830313993797637', {text: caption}，'test<%=caption%>1111')

确认都替换完毕以后，提交到git上

#### [](#23-去掉流水线抽取命令)2.3. 去掉流水线抽取命令

将上图我圈的多语抽取命令删除即可

## [](#复数适配)复数适配

### [](#3-在新的翻译工作台开发态新增词条)3. 在新的翻译工作台开发态，新增词条

新增一个拼接词条（如果已经有拼接词条，可不新增）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfqianduanduoyugaizaofangan(2023)_image2.95146353.png)

找到这个拼接词条，点击复数拆分

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfqianduanduoyugaizaofangan(2023)_image3.5fbd1c7f.png)

录入单复数翻译

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfqianduanduoyugaizaofangan(2023)_image4.952a2812.png)

源码中换成

cb.templatePlural('UID:P_TRS-FE_1740CCB604B00004', { num: num },

num)即可

比如一个复数资源： `{p_icu_arg, plural, one {Save and Continue %s task}

other{Save and Continue %s tasks}}`

增加请求复数参数

cb.lang.registerLang(process.env.__DOMAINKEY__,

require("../../pack"), "YS_CRM_CRM-FE,YS_SD_DGYL-FE", "YS", false,

{needPlural: true});

## [](#所见即所得翻译适配)所见即所得翻译适配

MDF节点无需适配，详细功能见一下文档：[https://package.yonyoucloud.com/package/detail/yyuap-instantTranslation](https://package.yonyoucloud.com/package/detail/yyuap-instantTranslation)

## [](#常见问题)常见问题：

- 中文和dom拼接怎么处理？

跟拼接词条一样，参考如下：

<div

 className={styles.u_mdf_successmsg}

 dangerouslySetInnerHTML={{

 __html: cb.localeUuid('uuid***', {

 name: `<span class=${styles.u_mdf_filename}>${fileList[0]?.name}</span>`

 })

 }}

></div>

- 需要删除的流水线配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdfqianduanduoyugaizaofangan(2023)_image5.799c6259.png)