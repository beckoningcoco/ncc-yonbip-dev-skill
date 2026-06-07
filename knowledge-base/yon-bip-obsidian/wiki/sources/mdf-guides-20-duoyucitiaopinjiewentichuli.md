---
title: "多语词条拼接问题处理（新）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-duoyucitiaopinjiewentichuli"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 多语词条拼接问题处理（新）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-duoyucitiaopinjiewentichuli | 所属：指南

# [](#多语词条拼接问题处理新)多语词条拼接问题处理（新）

## [](#1-问题背景)1. 问题背景

大家在编写代码的时候会遇到一些文案，有时候文案是一句完整的话，有时候是需要接入变量，这里提供一种针对后者的多语处理办法。

## [](#2-问题介绍)2. 问题介绍

这里先来个错误示范，也是大家最常用的写法：

let num = 0;

// 经过一段逻辑处理

num = 123;

// 经过一段逻辑处理

const msg = `操作数量为[${num}]的行`;

// 或者更简单粗暴

const string = '操作数量为[' + num + ']的行';

 

cb.utils.alert(msg, 'error');

上面的写法会导致多语无法翻译，因为在其他语种的语境中，语序不是这样的，这种问题就叫做多语拼接问题，那么如何解决此问题呢？请看下面解决方法。

## [](#3-处理方式)3. 处理方式

首先，创建一个多语词条，在测试环境中的翻译工作台新增；路径为：翻译工作台（链接从群里找）→ 新增→按要求新增一个中文文案，保存即可；

[https://bip-test.yonyoucloud.com/iuap-apcom-i18n/ucf-wh/vendor/index.html#/dev](https://bip-test.yonyoucloud.com/iuap-apcom-i18n/ucf-wh/vendor/index.html#/dev)

**中文文案为（就拿上面的例子）：操作数量为[<%=rowNum%>]的行**

这个时候你会生成一个多语词条的uuid，例如：UID:P_FW_174E6ADA05280057

然后在自己项目pack.js文件内，加上这个拼接词条（非MDF项目一样）：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/duoyucitiaopinjiewentichuli(xin)_image1.0efb26f6.png)

像上面的图一样，添加UID以及文案，准备工作就做好了，然后修改提示处的代码。

let num = 0;

// 经过一段逻辑处理

num = 123;

// 经过一段逻辑处理（非MDF项目用lang.localeUuid(....)）

const msg = cb.localeUuid('UID开头的多语编码', { rowNum: num }, '默认值');

 

cb.utils.alert(msg, 'error');

到这一步，我们的工作就做完了，剩下的就是找产品经理确认多语词条，然后等待翻译工作台的同事翻译即可。

## [](#4-特殊的拼接)4. 特殊的拼接

### [](#41-中文和字符串dom拼接)4.1. 中文和字符串dom拼接

<div

 dangerouslySetInnerHTML={{

 __html: cb.localeUuid('uuid***', {

 name: `<span class=${styles.u_mdf_filename}>${fileList[0]?.name}</span>`

 })

 }}

 ></div>

### [](#42-中文和输入框拼接)4.2. 中文和输入框拼接

 比如你需要用户录入一个值，类似
"第行"这种非纯字符串拼接的场景，则需要先按上面拼接词条方式，新增一个'第<%=line%>行' 
的拼接词条

返回一个UID:P_MDF-COMPS_1B37588A04100009词条编码，则按下图方式，做dom拼接处理

const langStr = cb.lang.templateByUuid('UID:P_MDF-COMPS_1B37588A04100009') || '第<%=line%>行';

const inputNumber = <InputNumber onChange={this.handleChange}/>

const newStr = langStr?.replace('<%=line%>', '@');

const domArr = newStr?.split('') || [];

const newDom = [];

domArr.map((item) => {

 if (item == '@') {

 newDom.push(inputNumber);

 } else {

 newDom.push(item);

 }

})

// 完整代码在下图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/duoyucitiaopinjiewentichuli(xin)_image2.a8233841.png)