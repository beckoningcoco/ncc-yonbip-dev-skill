---
title: "参照收藏功能使用配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaoshoucanggongnengshiyongpeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 参照收藏功能使用配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaoshoucanggongnengshiyongpeizhi | 所属：指南

# [](#参照收藏功能使用配置)参照收藏功能使用配置

## [](#1-领域mdd适配)1. 领域MDD适配

执行框架脚本流水线，脚本名称：0048_pub_ref_hot_z20220519.sql

-- 参照热点数据

CREATE TABLE IF NOT EXISTS `pub_ref_hot` (

 `id` bigint(20) NOT NULL COMMENT 'ID',

 `billnum` varchar(200) NOT NULL,

 `refid` varchar(100) NOT NULL,

 `refcode` varchar(100) NOT NULL,

 `hot_count` int(4) NOT NULL DEFAULT 0 ,

 `hot_type` int(4) NOT NULL DEFAULT 0,

 `tenant_id` VARCHAR(36) NOT NULL DEFAULT '0' COMMENT '友户通租户ID',

 `user_id` VARCHAR(100) NOT NULL DEFAULT '0' COMMENT '友户通用户ID',

 `pubts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳',

 `ytenant_id` varchar(36) NOT NULL DEFAULT '~',

 PRIMARY KEY (`id`),

 KEY `idx_ytenant_id` (`ytenant_id`),

 KEY `bizindex1` (`refCode`,`tenant_id`,`user_id`),

 KEY `biz_refId`(`refId`,`refCode`,`tenant_id`,`user_id`,`hot_type`)

) ENGINE=InnoDB ROW_FORMAT=DYNAMIC;

执行流水线，获取最新代码（如果web和service分开的请都执行）
打开热点开关,yms配置：mdd.open.refHot=true

## [](#2-mdf前端配置)2. MDF前端配置

配个前端特性：referCollect

[MDF服务配置中心权限](#/node/02-config-item-desc)

开了特性后，如果想隐藏个别参照的收藏功能，可在参照模型的cStyle配置hideCollect: true

cn项目单独使用参照时需要将参照收藏功能禁用（没有billnum会报错）

new cb.models.ReferModel({

 cRefType: props.refcode || '', // 参照编码 必填

 ...

 domainKey:'***' // 用来统一node转发使用，找参照提供方要

 cStyle:JSON.stringify({hideCollect: true})

 });

如果参照在查询区里面，没有cStyle， 可在extendField里配置和cStyle里格式参数一样

## [](#3-参照热点id的取值规则)3. 参照热点id的取值规则

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoshoucanggongnengshiyongpeizhiimage1.b6e51e9d.png)

热点id的值最终存到 参照模型上（refKeyFieldHot）

- 默认会先取参照meta（getRefMeta接口） 上 refEntity.cEntityKeyFld
- 如果 refEntity.extendField 里面配了 realCEntityKeyFld 取这个
- 如果 refEntity.extendField 里面没有配 realCEntityKeyFld，则取 refEntity.cEntityKeyFld

通过扩展实现：

referModel.on('afterInitVm',function(arg){

 const vm = arg.vm;

 vm.on('getRefMetaReady',function(){

 referModel.setState('refKeyFieldHot', ***); // ***为收藏主键

 })

 

})

这些配置在参照的 pub_ref 表上配置