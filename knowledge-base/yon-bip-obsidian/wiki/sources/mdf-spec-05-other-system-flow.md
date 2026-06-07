---
title: "跨系统跳转联查"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/05-other-system-flow"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 跨系统跳转联查

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/05-other-system-flow | 所属：协议

# [](#跨系统跳转联查)跨系统跳转联查

### [](#integrationids)integrationIds

少量数据可以通过url携带参数integrationIds，多个id之间使用逗号分隔。

### [](#integrationaction)integrationAction

大量数据通过postMessage传递，参考写法如下：

function openwin(e) {

 // 目标地址

 const targetUrl = 'https://xxx?domainKey=xxx&integrationAction=%27liancha%27'

 const win = window.open(targetUrl);

 let i = 0;

 // 由于开启时间无法预估，需要多次重试

 const interval = setInterval(() => {

 i++;

 // 兜底机制，避免内存泄漏，超过60s认为失败，直接取消，此时间可自行修改

 if (i > 60) {

 clearInterval(interval)

 }

 console.log(new Date().valueOf())

 win.postMessage({ key: 'setIntegrationIds', integrationIds: ['1529892845941424128'] }, targetUrl)

 }, 1000)

 // MDF接收到相关事件后会向来源window对象发出一个中止postMessage的请求，告知对方数据已接收

 window.addEventListener('message', function (e) {

 // key为固定值getIntegrationIds

 if (e.data.key == 'getIntegrationIds' && e.data.from == 'mdf') {

 clearInterval(interval)

 }

 })

}

参考文档：
[NCC与费控云融合联查方案.pdf](https://docs.yonyoucloud.com/l/D8bA1f6424F7)