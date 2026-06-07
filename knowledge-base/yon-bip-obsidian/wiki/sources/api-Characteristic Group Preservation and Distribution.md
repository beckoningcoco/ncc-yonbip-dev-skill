---
title: "特征组保存并分配"
apiId: "1665024783496511493"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Characteristic"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Characteristic]
platform_version: "BIP"
source_type: community-api-docs
---

# 特征组保存并分配

> `ContentType	application/json` 请求方式	POST | 分类: Characteristic (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/iuap-metadata-extend/ICharacterSaveSyncService/saveAndSyncCharateristics

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| characterIds | long | 是 | 是 | 特征id |
| mappingId | string | 否 | 否 | mappingId |
| code | string | 否 | 是 | 特征组编码 |
| name | string | 否 | 是 | 特征组名称 |
| characteristicsType | long | 否 | 是 | 特征组类型 |

## 3. 请求示例

Url: /yonbip/digitalModel/iuap-metadata-extend/ICharacterSaveSyncService/saveAndSyncCharateristics?access_token=访问令牌
Body: [{
	"characterIds": [
		0
	],
	"mappingId": "",
	"code": "",
	"name": "",
	"characteristicsType": 0
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-02

更新

请求说明

更新

请求参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

