---
title: "关于Avatar组件的3种模式"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-guanyu-avatarzujiande3zhongmoshi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 关于Avatar组件的3种模式

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-guanyu-avatarzujiande3zhongmoshi | 所属：指南

# [](#关于avatar组件的3种模式)关于Avatar组件的3种模式

## [](#1-模式一简强废弃)1. 模式一（简强废弃）

模式一一般是旧文件服务存储的，如1.1；也有个别领域自己在后端切了文件服务，如：1.2

### [](#11-通过upload接口上传-后端接入的旧文件)1.1. 通过/upload接口上传 后端接入的旧文件

字段存储的值：图片的url

### [](#12-通过upload接口上传-后端接入协同服务)1.2. 通过/upload接口上传 后端接入协同服务

字段存储的值：'fileid: /xxx'

## [](#2-模式二)2. 模式二

模式二需要打开useNewAvatar特性开关

### [](#21-开启usenewavatar特性-前端直接调用协同接口上传)2.1. 开启useNewAvatar特性 前端直接调用协同接口上传

字段存储的值：businessid

### [](#22-开启usenewavatar特性-注意事项)2.2. 开启useNewAvatar特性 注意事项

- 首先检查一下老数据是否正常展示
- 检查是否有自定义组件或者自定义逻辑对老数据的格式有使用，如果有，需要兼容uuid这种格式的数据

## [](#3-模式三)3. 模式三

模式三需要在组件的cStyle里配置useFileId:true

### [](#31-配置usefileid前端直接调用协同接口上传)3.1. 配置useFileId 前端直接调用协同接口上传

字段存储的值：'fileid: /xxx'