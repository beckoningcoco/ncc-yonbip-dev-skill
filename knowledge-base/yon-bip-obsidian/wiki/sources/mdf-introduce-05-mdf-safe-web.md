---
title: "使用MDF框架加强Web安全防护设计"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-mdf-safe-web"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# 使用MDF框架加强Web安全防护设计

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-mdf-safe-web | 所属：介绍

# [](#使用mdf框架加强web安全防护设计)使用MDF框架加强Web安全防护设计

## [](#1-描述)1. 描述

针对安全部门发起的修复xsrf问题的处理方案（见参考文档），目前mdf框架已经适配了相关功能，即所有使用mdf公共方法调接口框架会自动处理，包括使用如下等方法：

- viewmodel.setProxy()
- cb.rest.ajax()
- cb.rest.DynamicProxy.create()

**此文档仅针对使用了mdf框架转发(接口中包含/mdf-node)的接口，如果没有使用框架提供的公共请求接口方法的领域，需要进行检查和调整**。

## [](#2-检查)2. 检查

按照以下方式检查自己的接口是否走的mdf的接口或者是否调用了mdf框架的方法

### [](#21-如何检查)2.1. 如何检查？

- **接口中是否含有 `/mdf-node`字样**
- **是否自己创建的ajax，或者使用的axios等第3方网络请求库，或者第3方组件(附件上传)调接口**

**如果 `同时命中这2项`就需要自行处理了**

### [](#22-如何检验)2.2. 如何检验？

包含/mdf-node字样的接口，cookie里和请求报文里headers里的XSRF-TOKEN和X-XSRF-TOKEN的值是必须一致的，值的开头3个字母是MDF，如果一致了就说明没有问题了。

示例：MDF_IM13HW9X2KKFGX3DTYRNUQFH709TRN1A

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shiyongMDFkuangjiajiaqiangWebanquanfanghusheji_image1.2f140cce.png)

## [](#3-处理方法)3. 处理方法

处理方式分为2种，一种是自己创建的ajax，第2种是使用的第3方库网络请求库或者第3方组件(附件上传)调接口

如果页面没有cb?.rest这个变量，请直接对接<参考文档>

### [](#31-自建ajax)3.1. 自建ajax

自己创建的ajax

const xhr = new XMLHttpRequest()

需要在xhr.send()方法前调用cb.rest.setXsrfToken(xhr) ，参数为定义的xhr

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shiyongMDFkuangjiajiaqiangWebanquanfanghusheji_image2.89364f2f.png)

### [](#32-第3方网络请求库或第3方组件附件上传调接口)3.2. 第3方网络请求库或第3方组件(附件上传)调接口

以axios为例，调用cb.rest.setXsrfToken()不传参数，然后把返回值写入headers里

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shiyongMDFkuangjiajiaqiangWebanquanfanghusheji_image3.cc6541a1.png)

附件同理

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shiyongMDFkuangjiajiaqiangWebanquanfanghusheji_image4.dd4c511f.png)

到这里就处理完了，处理完后可以按照**检查**里的<**如何检验?**>验证下是否修改正确

## [](#4-补充)4. 补充

### [](#41-统一node端加强csrf攻击防护)4.1. 统一node端加强csrf攻击防护

现在专属化使用的同一套校验csrf的ng

即客户端--->node端，node端--->领域的node端(包括到各领域后端)共用一套，都会校验csrf

本文前面章节讲的都是客户端到node端的适配，现在如果有在统一node里配置proxyRoutes参数的，需要自己检查下有没有报错的情况，(可以到new5环境测试)。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shiyongMDFkuangjiajiaqiangWebanquanfanghusheji_image5.9de39589.png)

**报错提示**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shiyongMDFkuangjiajiaqiangWebanquanfanghusheji_image6.997357db.png)

**解决方案:** 在框架node端传给领域node端的请求头里，接收到框架传来的header里的参数cookie和x-xsrf-token参数后，在调后端接口

**目标：** 传给后端的header里的参数包含cookie和x-xsrf-token参数

**以上情况也同样适用于走了node端后，领域自己服务器端访问其他服务器的服务时，也应该将框架传来的header里的参数cookie和x-xsrf-token接收到，继续往下传递。**

### [](#42-统一node端加强xss攻击防护)4.2. 统一node端加强xss攻击防护

具体设计：在Node.js端增加一道中间件拦截，遇到带有潜在危险字符的参数，将其自动转码，确保参数不会引发XSS攻击，从而保障Web应用的安全性。

- 

**中间件设计：**

开发一个自定义的中间件，用于拦截所有入站请求。
- 在中间件中检查请求体和查询参数中的潜在危险字符。

- 

**字符转码：**

使用安全的转码库（如xss）来转码潜在的危险字符。
- 确保所有用户提交的数据都经过转码处理，以防止XSS攻击。

- 

**统一处理：**

在中间件中统一处理所有请求，确保所有数据在进入业务逻辑层之前都被正确处理。

通过这样的设计，可以在Node.js端有效地拦截和防御XSS攻击，提高Web应用的安全性。

### [](#43-统一node端加强nodejs端注入攻击防护)4.3. 统一node端加强nodejs端注入攻击防护

具体设计：在Node.js端增加一道中间件拦截，遇到带有可疑字符的参数，将其自动删除，并记录相关日志，确保参数不会引发注入攻击，从而保障Web应用的安全性。

- **中间件设计：**
开发一个自定义的中间件，用于拦截所有入站请求。
- 在中间件中检查请求url参数中的可疑字符。

- **可疑字符处理：**
自动删除检测到的可疑字符，以防止注入攻击的发生。

- **日志记录：**
当检测到可疑字符时，记录详细的日志信息，包括请求的URL、参数、后端微服务名，单据编码

- **统一处理：**
在中间件中统一处理所有请求，确保所有数据在进入业务逻辑层之前都被正确处理。

通过这样的设计，可以在Node.js端有效地拦截和防御注入攻击，提高Web应用的安全性。