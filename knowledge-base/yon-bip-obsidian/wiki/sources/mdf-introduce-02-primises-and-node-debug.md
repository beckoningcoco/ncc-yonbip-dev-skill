---
title: "专属化与Node调试 ③"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-primises-and-node-debug"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 专属化与Node调试 ③

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-primises-and-node-debug | 所属：介绍

# [](#专属化与node调试-)专属化与Node调试 ③

## [](#1-调试源码)1. 调试源码

专属化默认屏蔽了所有sourcemap，如需调试进行以下操作：

- [https://xxx/mdf-node/sourcemap/mdfjs/666666](https://xxx/mdf-node/sourcemap/mdfjs/666666)  
 浏览器访问开启源码（包含框架和领域的）
- [https://xxx/?debug=true](https://xxx/?debug=true)    开启调试模式和高品质源码（仅框架的）(R6废弃)

## [](#2-查看node转发)2. 查看Node转发

可查看Node转发路径及后端返回数据

- 浏览器控制台查看network，拷贝接口的cRUL
- 粘贴到POSTNAM工具上
- url上添加 &debugNode=true

此方法可以不仅查看Java端返回的数据，还可以查看转发后的路径以及请求耗时等