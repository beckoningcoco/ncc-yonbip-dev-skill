---
title: "业务单元单职能启用"
apiId: "2247585471592923136"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务单元单职能启用

> `ContentType	application/json` 请求方式	GET | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/funcorg/enablesinglefunc

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| funcType | string | query | 是 | 职能类型 adminorg-行政组织； salesorg-销售组织；purchaseorg-采购组织；inventoryorg-库存组织；factoryorg-工厂组织；researchdeveloporg-研发组织；planorg：计划组织；qualityorg：质检组织；financeorg：会计主体；taxpayerorg：纳税主体；assetsorg-资产组织；maintainorg-维修组织；serviceorg：服务组织；logisticsorg-物流组织；safetyorg：安环组织； en    示例: adminorg |
| id | string | query | 否 | 业务单元职能id，与code两者必须输入一个，同时录入时，以id为准    示例: 2007198273752268805 |
| code | string | query | 否 | 业务单元职能编码 ，与id两者必须输入一个，同时录入时，以id为准    示例: 123 |
| timelineDate | string | query | 否 | 业务日期，开启时间轴时可录入，默认当天时间    示例: 2025-01-01 |

## 3. 请求示例

Url: /yonbip/digitalModel/funcorg/enablesinglefunc?access_token=访问令牌&funcType=adminorg&id=2007198273752268805&code=123&timelineDate=2025-01-01

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | boolean | 否 | data 示例：true |
| uploadable | string | 否 | uploadable 示例：0 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": true,
	"uploadable": "0",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000003

上级非启用状态，请先启用上级


## 7. 错误返回码

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

