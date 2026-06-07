---
title: "CN项目前端多语接入"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-cnxiangmuqianduanduoyujieru"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# CN项目前端多语接入

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-cnxiangmuqianduanduoyujieru | 所属：指南

# [](#cn项目前端多语接入)CN项目前端多语接入

## [](#1-联系赵东升先进行多语分组注册)1 联系赵东升先进行多语分组注册

- [1.2.8.3 多语平台使用手册 （总体 )](file:////pages/viewpage.action%3fpageId=12156444)
- [多语新模型升级抽取工具2.0](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365)

## [](#2-多语抽取)2 多语抽取

[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=177952301](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=177952301) 

## [](#3-使用用-ac-lang-cn-组件)3 使用用 ac-lang-cn 组件

[https://package.yonyoucloud.com/package/detail/ac-lang-cn](https://package.yonyoucloud.com/package/detail/ac-lang-cn) （不推荐使用）

// 安装

ynpm install ac-lang-cn --save

 

// 引入

import lang from "ac-lang-cn";

 

// 使用 pack.js保留拼接词条即可

const pack = require('components/lang/pack').default;

 lang.init(pack, null);

 // xx指的是你们的groupCode url指的YMS统一域名（如测试环境：bip-test.yyuap.com）

 lang.jsonpUuid(tenantid, 'xx,xx','url',()=>{

 //返回多语词条后 再加载你们入口代码

}); //url不传 默认生产地址

console.log(" ************************多语加载成功!***************************");

 

...

 

render(){

 let _title = `${lang.templateByUuid("YS_FI_FP_0000033576")}`/* 我是变量的多余! */;

 return(<div>{_title}</div>)

}

优先获取 url 上的 locale=zh_CN（建议url上拼接上当前语种信息）

其次 获取 上下文 window.globalization.locale 或者
window.cb.globalization.locale

然后获取浏览器语种

默认中文

## [](#4-使用ynf-fw-i18n-api)4 使用ynf-fw-i18n-api

开启TNS服务

// 直接引入

import lang from "ynf-fw-i18n-api";

 

// 使用 pack.js保留拼接词条即可

const pack = require('components/lang/pack').default;

 lang.init(pack, null);

 // xx指的是你们的groupCode url指的YMS统一域名（如测试环境：bip-test.yyuap.com）

 lang.jsonpUuid(tenantid, 'xx,xx','url',()=>{

 //返回多语词条后 再加载你们入口代码

}); //url不传 默认生产地址

console.log(" ************************多语加载成功!***************************");

 

...

 

render(){

 let _title = `${lang.templateByUuid("YS_FI_FP_0000033576")}`/* 我是变量的多余! */;

 return(<div>{_title}</div>)

}

## [](#5-常见问题)5 常见问题：

Q1：为什么本地调试时报找不到ynf-fw-i18n-api？

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuqianduanduoyujieru_image1.ba6a9dc3.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuqianduanduoyujieru_image2.60684b37.png)

A：

TNSPlugin中入参设置修改一下，

验证测试环境时添加如下配置：{providerEnv: test}

验证日常环境时添加如下配置：{providerEnv: daily}

注：流水线中会读取当前环境变量，无需关注此处配置。

Q2：为什么本地调试配置了入参设置仍然存在拉取不到资源的情况？

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuqianduanduoyujieru_image3.debe3e43.png)

A：TNS团队老师给出了两个方案，出现此问题时：

1.配置全局变量，类似window.TNS_BASE_HOST = 'https://bip-test.yyuap.com'

2.配置项目启动项中host，指向线上环境