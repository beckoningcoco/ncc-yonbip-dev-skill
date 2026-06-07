---
title: "MDF框架禁令 ☆"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/03-mdf-stop"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# MDF框架禁令 ☆

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/03-mdf-stop | 所属：协议

# [](#mdf框架禁令-)MDF框架禁令 ☆

## [](#1-模板配置禁令)1. 模板配置禁令

- 同一个页面下的相同实体下的属性如果在模板中存在多个显示字段，需要保证只有一个bVmExclude为0，其它的bVmExclude设置为2
- 确保MDF框架脚手架package.json中的name属性值唯一，推荐使用 微服务编码
或 domainKey 或 引擎编码 作为name的值
- 虚拟实体只支持在列表中使用，不允许卡片页配置虚拟实体
- bill_states可配置常规显隐，也可配置多个带条件的state，带条件的配置会跟常规进行合并配置需要谨慎
- 配置cFormatData属性时，需要确保bEnableFormat为true，否则格式走全局租户级配置cFormatData不会生效

## [](#2-扩展代码禁令)2. 扩展代码禁令

- 扩展样式建议以domainKey-billno-templateName等作为特殊class隔离扩展样式，禁止不加作用域直接覆盖钉耙等样式
- 不允许在扩展脚本中书写yya、yys等相关代码
- 禁止在循环中调用框架的set方法，如循环中调用setCellValue和setCellState
- 禁止使用cb.events.on做事件挂载机制
- 不推荐使用afterLoadData之前调用同步接口，会阻塞页面渲染
- 扩展组件尽量避免操作dom而造成重绘和重排