---
title: "汇率类型启用"
apiId: "6c6a98b72fb14264996a0007f80f30d4"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Exchange Rate Type"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Exchange Rate Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 汇率类型启用

> `ContentType	application/json` 请求方式	POST | 分类: Exchange Rate Type (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/exchangeratetype/enable

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
| data | object | 否 | 是 | 业务数据 |
| id | string | 否 | 是 | 主键 示例：1981342580757504 |

## 3. 请求示例

Url: /yonbip/digitalModel/exchangeratetype/enable?access_token=访问令牌
Body: {
	"data": {
		"id": "1981342580757504"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 200成功 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 业务数据 |
| _entityName | string | 否 | 实体名称，框架信息可忽略 |
| _keyName | string | 否 | 标识名称，框架信息可忽略 |
| enable | long | 否 | 启用状态，0初始化 1启用 2停用 示例：1 |
| id | string | 否 | 主键 示例：2320714022932736 |
| pubts | string | 否 | 时间戳，格式yyyy-MM-dd HH:mm:ss 示例：2021-06-28 14:30:49 |
| _status | string | 否 | 操作标识，非新增更新操作值为空，可忽略 |
| yhtTenantId | string | 否 | 友互通租户标识 示例：0000KQDIE5OADA8EBP0000 |
| yhtTenant | string | 否 | 友互通租户 示例：0000KQDIE5OADA8EBP0000 |
| tenant | string | 否 | 租户标识 示例：0000KQDIE5OADA8EBP0000 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"_entityName": "",
		"_keyName": "",
		"enable": 1,
		"id": "2320714022932736",
		"pubts": "2021-06-28 14:30:49",
		"_status": "",
		"yhtTenantId": "0000KQDIE5OADA8EBP0000",
		"yhtTenant": "0000KQDIE5OADA8EBP0000",
		"tenant": "0000KQDIE5OADA8EBP0000"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败	请检查请求路径和参数是否正确，确认请求数据是否存在，如若无误联系管理员确认服务是否异常？


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

