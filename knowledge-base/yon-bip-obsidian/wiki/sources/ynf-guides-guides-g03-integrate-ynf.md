---
title: "集成 YNF"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g03-integrate-ynf"
section: "YNF-开发指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 开发指南]
platform_version: "BIP V5"
source_type: ynf-docs
images: 1
---

# 集成 YNF

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g03-integrate-ynf | 所属：YNF-开发指南

# [](#集成-ynf)集成 YNF

`YNF`框架提供了一套方案，当其他前端页面想要展示`YNF`页面时，能通过调用组件的方式或者`api`的方式，在指定`dom`渲染一个`YNF`页面或者打开一个`YNF`弹窗。避免因为使用`iframe`的方式暴力接入，影响页面性能

## [](#1接入tns的脚手架工程里集成ynf的页面)1.接入tns的脚手架工程里集成YNF的页面

如何判断自己的脚手架里集成了`tns`呢？当你的脚手架执行`npm run build`的时候控制台打印了如下信息，表示你接入了`tns`

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-integrate-ynf-1.48a57920.png)
如果判断自己的脚手架里已经接入了`tns`，则可以用如下方式调用`YNF`的`page`组件渲染`YNF`页面

import { Page } from 'ynf-lib-base'

<Page

  pageBillNo={billNo}  // billNo

  pageDomainKey={"developplatform"}

  pageBusiObj={busiObj}

  pageOtherParams={{

    xxx: 'xxx'

  }}

></Page>

使用者可以基于自己的场景，在指定`dom`里渲染`page`组件。如果想要在弹窗里引用，可以自己写弹窗的`dom`或者使用`tinper`的弹窗组件，将`page`组件传入，下面以调用`tinper`的弹窗组件为例

import { Modal } from '@tinper/next-ui';

import { Page } from 'ynf-lib-base'

// modal组件的其他传参，查看tinper官网

<Modal visible={true}>

  <Modal.Body>

    <Page

      pageBillNo={billNo}  // billNo

      pageDomainKey={"developplatform"}

      pageBusiObj={busiObj}

      pageOtherParams={{

        xxx: 'xxx'

      }}

    ></Page>

  </Modal.Body>

</Modal>

## [](#2设计器脚本或者其他自定义扩展脚本里集成ynf页面)2.设计器脚本或者其他自定义扩展脚本里集成YNF页面

当没有自己的脚手架工程，无法用`import`的方式引入`ynf`组件时，`YNF`还提供了一种`api`的方式在指定`dom`上渲染`YNF`页面的方式

- 引入一段`js`，`js`的地址如下：

`${ymshost}/ynf-core-engine/ucf-wh/ynfBuilder.js`

注：`ymshost`大部分情况下就是业务中台的地址，多域名情况下要取`yms`那配置的`host`

2. 引入`js`之后，在写如下代码即可实现在指定`dom`上画`ynf`页面或者打开一个`ynf`页面的弹窗

const ynf = new YNFBuilder();

// 在指定dom上画

ynf.renderBill('你的dom', {

 billNo: 'xxx',

 query: { domainKey:'developplatform',terminalType: '1' }

})

// 弹出ynf页面的弹窗

ynf.renderModalBill('你的dom', {

 billNo: 'xxx',

 query: { domainKey:'developplatform',terminalType: '1' }

})

`YNFBuilder`类支持的参数如下：

const ynf = new YNFBuilder({

 host: 'xxxx', // 资源host地址，不传默认走集团标准的逻辑

 reactUrl: 'react资源的引用地址', // 不传默认引用集团cdn的react地址

 reactDOMUrl: 'reactDOM资源的引用地址', // 不传默认引用集团cdn的reactDOM地址

 tinperNextUrl: 'tinper资源的引用地址', // 不传默认引用集团cdn的tinper地址

 tinperNextCssUrl: 'tinper样式资源的引用地址', // 不传默认引用集团cdn的tinper样式地址

 tnsSdkUrl: 'tnssdk资源的引用地址' // 不传默认引用集团cdn的tnssdk地址

});