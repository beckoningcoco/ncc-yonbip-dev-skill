---
title: "全局缓存 Cache"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-cache"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 全局缓存 Cache

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-cache | 所属：API

# [](#全局缓存-cache)全局缓存 Cache

## [](#1-通用缓存)1. 通用缓存

### [](#11-设置缓存)1.1. 设置缓存

`cb.cache.set`

// 设置缓存

cb.cache.set('cacheName', 'value')

### [](#12-批量设置缓存)1.2. 批量设置缓存

`cb.cache.setAll`

// 批量设置缓存

cb.cache.set('cacheObj')

### [](#13-获取缓存)1.3. 获取缓存

`cb.cache.get`

// 获取缓存

cb.cache.get('cacheName')

### [](#14-清除缓存)1.4. 清除缓存

`cb.cache.clear`

// 清除指定缓存

cb.cache.clear('cacheName')

 

// 清除全部缓存

cb.cache.clear()

## [](#2-领域基础地址)2. 领域基础地址

### [](#21-获取领域基础地址)2.1. 获取领域基础地址

获取领域前端基础地址

`cb.cache.baseUrls.get`

// 获取缓存

cb.cache.baseUrls.get('domainKey')

## [](#3-接口地址缓存)3. 接口地址缓存

### [](#31-清除接口地址缓存)3.1. 清除接口地址缓存

扩展脚本调用扩展接口时，需要先清除接口地址缓存，再调用，否则会走缓存中的地址

`cb.cache.cacheUrls.clear`

// 获取缓存

cb.cache.baseUrls.clear()

## [](#4-模板id缓存)4. 模板ID缓存

### [](#41-清除模板id缓存)4.1. 清除模板ID缓存

`cb.cache.cacheTplids.clear`

// 获取缓存

cb.cache.cacheTplids.clear()