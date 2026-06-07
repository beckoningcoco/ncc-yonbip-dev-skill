---
title: "默认采购委托关系查询接口"
apiId: "312bc2efcf9a483c88cf475559c6acaf"
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

# 默认采购委托关系查询接口

> `ContentType	application/json` 请求方式	GET | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/purchasedelegate/qrydefaultdelegate

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| inventoryOrg | string | query | 是 | 需求组织 id    示例: 2174891959276032 |
| product | string | query | 否 | 物料 id    示例: 2312312 |
| managementClass | string | query | 否 | 物料分类 id    示例: 21312312 |
| fields | string | query | 是 | 查询字段purchaseOrg采购组织,inventoryOrg需求组织,managementClass物料分类,product物料,receiveOrg默认收货组织,billingOrg开票组织    示例: id,purchaseOrg,inventoryOrg,product,managementClass |

## 3. 请求示例

Url: /yonbip/digitalModel/purchasedelegate/qrydefaultdelegate?access_token=访问令牌&inventoryOrg=2174891959276032&product=2312312&managementClass=21312312&fields=id%2CpurchaseOrg%2CinventoryOrg%2Cproduct%2CmanagementClass

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态值编码 |
| message | string | 否 | 返回信息 |
| data | object | 否 | 返回数据，返回数据为采购组织id |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000512

查询数据为空


## 7. 错误返回码

500	查询错误	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level

删除

错误码 200


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

