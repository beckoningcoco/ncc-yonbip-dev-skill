---
title: "结算方式批量保存V5"
apiId: "2174274494446698504"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Method"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Method]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算方式批量保存V5

> `ContentType	application/json` 请求方式	POST | 分类: Payment Method (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/settlemethod/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| matchRule | string | 否 | 否 | id-基于主键查询、code-基于编码匹配 示例：id 默认值：id |
| unmatchedStrategy | string | 否 | 否 | error-匹配不到抛出异常（参数为空时新增）、add-匹配不到新增数据（参数为空或匹配不到都新增数据），默认为add,openAPI不显示改属性 示例：add 默认值：add |
| data | object | 是 | 否 | 请求体 |
| code | string | 否 | 是 | 编码 示例：qq |
| comment | object | 否 | 否 | comment_DESC |
| directConnection | number |
| 小数位数:0,最大长度:6 | 否 | 否 | 是否直连 示例：0 |
| id | string | 否 | 否 | id 示例：2211575684096589833 |
| isDefault | boolean | 否 | 否 | 是否默认 示例：false |
| isEnabled | boolean | 否 | 否 | 是否启用（true：启用，false：停用） 示例：false |
| name | object | 否 | 是 | name_DESC |
| order | number |
| 小数位数:0,最大长度:20 | 否 | 是 | 顺序 示例：1 |
| parent | string | 否 | 否 | 上级方式 示例：2211575684096589833 |
| parent___code | string | 否 | 否 | 上级方式编码 示例：1 |
| serviceAttr | number |
| 小数位数:0,最大长度:4 | 否 | 是 | 业务属性 0:银行业务,1:现金业务,2:票据业务,3:返利抵现,4:卡券结算,5:现金折扣,8:支票业务,6:退款转收款,7:其它,9:信用证业务,10:第三方 示例：1 |
| sourceUnique | string | 否 | 是 | 来源id 示例：2211575684096589833 |

## 3. 请求示例

Url: /yonbip/digitalModel/settlemethod/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"data": [
		{
			"code": "qq",
			"comment": {
				"zh_CN": "gfd",
				"en_US": "hghff",
				"zh_TW": "dfs"
			},
			"directConnection": 0,
			"id": "2211575684096589833",
			"isDefault": false,
			"isEnabled": false,
			"name": {
				"zh_CN": "fdsdfs",
				"en_US": "lk",
				"zh_TW": "sda"
			},
			"order": 1,
			"parent": "2211575684096589833",
			"parent___code": "1",
			"serviceAttr": 1,
			"sourceUnique": "2211575684096589833"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| success | boolean | 否 | 保存成功时返回true |
| data | object | 否 | 保存数据记录 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 记录数 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功记录数 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败记录数 |
| messages | object | 是 | 失败信息 |
| infos | object | 是 | 成功详情 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000066 |
| level | number |
| 小数位数:0,最大长度:2 | 否 | 异常级别 示例：0：错误，1：警告 |

## 5. 正确返回示例

{
	"code": "",
	"success": true,
	"data": {
		"count": 0,
		"successCount": 0,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"created": false,
				"sourceUnique": "",
				"targetUnique": "",
				"id": ""
			}
		]
	},
	"displayCode": "000-525-000066",
	"level": NaN
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

更新

请求说明

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

