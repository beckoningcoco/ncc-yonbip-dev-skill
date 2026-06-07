---
title: "计量单位分组更新-幂等"
apiId: "1972456420845027330"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "UoM"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, UoM]
platform_version: "BIP"
source_type: community-api-docs
---

# 计量单位分组更新-幂等

> `ContentType	application/json` 请求方式	POST | 分类: UoM (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/unitgroup/idempotent/update

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | number |
| 小数位数:0,最大长度:19 | 否 | 否 | id，id与code至少填写一个 示例：1975214013085122561 |
| code | string | 否 | 否 | 编码，id与code至少填写一个 示例：API1 |
| name | object | 否 | 否 | 名称 |
| desc | string | 否 | 否 | 备注 示例：备注 |
| stopStatus | boolean | 否 | 否 | 启用状态，true:停用,false:启用 示例：true |

## 3. 请求示例

Url: /yonbip/digitalModel/unitgroup/idempotent/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1975214013085122561,
		"code": "API1",
		"name": {
			"simplifiedName": "中文",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"desc": "备注",
		"stopStatus": true
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回"200" 示例："200" |
| message | string | 否 | 提示信息 示例：成功 |
| data | object | 否 | 返回结果,id |
| id | long | 否 | id 示例：1975214013085122561 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "成功",
	"data": {
		"id": 1975214013085122561
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

