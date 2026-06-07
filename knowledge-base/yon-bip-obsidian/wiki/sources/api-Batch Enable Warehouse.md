---
title: "仓库批量启用"
apiId: "86bd1505c173421e80d2b0a1d806fc87"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Warehouse"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Warehouse]
platform_version: "BIP"
source_type: community-api-docs
---

# 仓库批量启用

> `ContentType	application/json` 请求方式	POST | 分类: Warehouse (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/warehouse/unstop

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
| data | object | 是 | 是 | 仓库 |
| id | long | 否 | 是 | 仓库id 示例：1973895263768832 |

## 3. 请求示例

Url: /yonbip/digitalModel/warehouse/unstop?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1973895263768832
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 请求结果数据 |
| _realtype | string | 否 | 真实类型 |
| _entityName | string | 否 | 实体名称 |
| _keyName | string | 否 | 主键字段 |
| iUsed | string | 否 | enable：启用，disable：停用 示例：enable |
| id | long | 否 | 仓库id 示例：1973895263768832 |
| _status | string | 否 | 实体状态 |
| tenant | long | 否 | 租户id 示例：1838010622546176 |
| pubts | string | 否 | 时间戳 示例：2020-10-26 09:56:09 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"_realtype": "",
		"_entityName": "",
		"_keyName": "",
		"iUsed": "enable",
		"id": 1973895263768832,
		"_status": "",
		"tenant": 1838010622546176,
		"pubts": "2020-10-26 09:56:09"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

