---
title: "加密解密插件@mdf/crypto"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-mdf-pako-and-crypto"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 加密解密插件@mdf/crypto

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-mdf-pako-and-crypto | 所属：介绍

# [](#加密解密插件mdfcrypto)加密解密插件@mdf/crypto

MDF服务已经支持加密解密，其他服务如果想接入加密解密可以安装插件，加上适配代码即可。

## [](#1-插件安装)1. 插件安装

### [](#11-1安装插件)1.1. 1、安装插件

ynpm install @mdf/crypto

## [](#2-代码适配)2. 代码适配

### [](#21-前端代码适配)2.1. 前端代码适配

**注意：**

- RSA公私钥Node端维护，公钥从node端传到前端
- 对称密钥推荐使用用户token，每次重新登录会失效。MDF使用的**yht_access_token**作为对称密钥
- 请求参数加密，返回数据解密

接口调用处，处理请求参数和返回值

import Crypto from '@mdf/crypto/lib/index';

const isEncrypt = () => window?.__MDF_FEATURE_CONFIG__?.encrypt =='~' || window?.__MDF_FEATURE_CONFIG__?.encrypt?.includes?.(cb.context.getTenantId());

const MDFCrypto = new Crypto({

 reqEncrypt: isEncrypt(), // 请求参数是否加密, 默认false

 resEncrypt: isEncrypt(), // 返回值是否加密, 默认false

 debug: false, // 是否开启调试

 publicKey: cb.env.getPublicKey(), // 公钥，node端传过来的

 decryptKey: cb.context.getYhtAccessToken(), // 对称密钥，用的token，用于前端解密，node加密

});

请求参数加密：

queryJson = MDFCrypto.encrypt(queryJson); 

xhr.send(queryJson);

返回值解密-返回值示例：

jaxResult = {

 code: 200,

 data: '*&^*&%%^#$#((111119(*&*^*%', // 加密后数据

 isEncrypt: true, // 加密数据标识

}

MDFCrypto.decrypt(ajaxResult);

### [](#22-3node端代码适配)2.2. 3、Node端代码适配

**注意：**

- 公钥通过ctx，客户端加载动态生成的js，将变量放到window上
- Node解密用的yht_access_token，跟客户端保持一致
- 请求参数解密，返回体加密

添加中间件crpyto.js，koa2写法如下：

import CryptoNode from '@mdf/crypto/lib/node';

import { getCookie } from '@mdf/plugin-meta/lib/helper'

// import * as als from 'async-local-storage'

const crypto = new CryptoNode();

export default async (ctx, next) => {

 ctx.MDF_PUBLIC_KEY = crypto.RSA_KEY.publicKey; //公钥放到ctx上，node动态生成js，挂到window上，前端通过window获取

 if (ctx.req.headers['enable-encrypt'] && ctx.request.body) {

 // const startTime = new Date().getTime();

 ctx.request.body = crypto.decrypt(ctx.request.body);

 // const currentTime = new Date().getTime();

 // if (als.get('debugger')) als.get('debugger').debug('decrypt duration:' + (currentTime - startTime) + 'ms')

 }

 await next()

 if (ctx.req.headers['enable-encrypt'] && ctx.response.status === 200 && ctx.body.data !== undefined) {

 // const startTime = new Date().getTime();

 ctx.body = crypto.encrypt(ctx.body, getCookie(ctx.req.headers.cookie ?? '', 'yht_access_token'));

 // const currentTime = new Date().getTime();

 // if (als.get('debugger')) als.get('debugger').debug('encrypt duration:' + (currentTime - startTime) + 'ms')

 }

}

引用中间件

import cryptoMiddleware from './middlewares/crypto';

app.use(cryptoMiddleware);

## [](#3-原理时序图)3. 原理时序图

插件实现功能时序图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiamijiemichajian_mdf_crypto_image1.1cfe9124.png)

## [](#4-设计方案pdf)4. 设计方案PDF

[https://docs.yonyoucloud.com/l/119edef372e5](https://docs.yonyoucloud.com/l/119edef372e5) 【友空间云文档】MDF数据压缩混淆及加密保护方案