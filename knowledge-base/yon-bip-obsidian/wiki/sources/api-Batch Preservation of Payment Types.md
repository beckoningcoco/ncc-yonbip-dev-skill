---
title: "款项类型批量保存"
apiId: "2178958224975200260"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Type"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 款项类型批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Payment Type (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/bd/v1/paymentType/batchSave

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
| id | string | 否 | 否 | 主键，为空为新增，不为空为更新 |
| code | string | 否 | 是 | 款项类型编码 |
| name | string | 否 | 否 | 名称-中文，1到6有一个必填，当前语种必填 |
| name2 | string | 否 | 否 | 语种-语种扩展2 |
| name3 | string | 否 | 否 | 语种-语种扩展3 |
| name4 | string | 否 | 否 | 语种-语种扩展4 |
| name5 | string | 否 | 否 | 语种-语种扩展5 |
| name6 | string | 否 | 否 | 语种-语种扩展6 |
| desc | string | 否 | 否 | 描述-中文 |
| desc2 | string | 否 | 否 | 描述-语种扩展2 |
| desc3 | string | 否 | 否 | 描述-语种扩展3 |
| desc4 | string | 否 | 否 | 描述-语种扩展4 |
| desc5 | string | 否 | 否 | 描述-语种扩展5 |
| desc6 | string | 否 | 否 | 描述-语种扩展6 |
| stopstatus | boolean | 否 | 否 | 是否停用 默认值：false |
| prepaystatus | boolean | 否 | 否 | 预收/预付 默认值：false |
| checkshouldpay | boolean | 否 | 否 | 核销应收应付 默认值：false |
| applicationscope | string | 否 | 否 | 应用范围，需要传入枚举，多个逗号分隔，1：应付管理；2：应收管理；3：资金结算；4：现金管理；5：商业汇票；7：收入管理；8：合同台帐；6：总账 |

## 3. 请求示例

Url: /yonbip/AMP/bd/v1/paymentType/batchSave?access_token=访问令牌
Body: [{
	"id": "",
	"code": "",
	"name": "",
	"name2": "",
	"name3": "",
	"name4": "",
	"name5": "",
	"name6": "",
	"desc": "",
	"desc2": "",
	"desc3": "",
	"desc4": "",
	"desc5": "",
	"desc6": "",
	"stopstatus": true,
	"prepaystatus": true,
	"checkshouldpay": true,
	"applicationscope": ""
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功！ |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 一共多少条 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功多少条 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败多少条 示例：0 |
| messages | string | 是 | 失败信息列表 |
| infos | object | 是 | 成功保存的记录集合 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": 2179382017920073728,
				"modifierId": 1525641755939569667,
				"modifier": "u8c_vip管理员",
				"modifyTime": "2025-02-22T03:20:35.213+00:00",
				"modifyDate": "2025-02-21T16:00:00.000+00:00",
				"name": {
					"zh_CN": "yanhc_3",
					"en_US": "yanhc_23",
					"zh_TW": "yanhc_33",
					"id_ID": "yanhc_43",
					"de_DE": "yanhc_54",
					"ja_JP": "yanhc_64"
				},
				"desc": {
					"zh_CN": "yanhc_3",
					"en_US": "yanhc_23",
					"zh_TW": "yanhc_33",
					"id_ID": "yanhc_43",
					"de_DE": "yanhc_54",
					"ja_JP": "yanhc_64"
				},
				"stopstatus": true,
				"prepaystatus": true,
				"checkshouldpay": true,
				"applicationscope": "8,6,2,3,5,7,6",
				"code": "1011",
				"tenant": 2909930715861584,
				"ytenant": "0000L6YQ8AVLFUZPXD0000"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

