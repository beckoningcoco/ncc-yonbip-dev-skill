---
title: "会计要素表保存"
apiId: "2236657408361889798"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounting Element Table"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Element Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计要素表保存

> `ContentType	application/json` 请求方式	POST | 分类: Accounting Element Table (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/yonbip-fi-epub/accelementlist/bill/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billnum | string | 否 | 是 | 单据编码 示例：fiepub_accelementlist 默认值：fiepub_accelementlist |
| data | object | 否 | 是 | 会计要素表主实体 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | id 示例：2236521910638739457 |
| code | string | 否 | 是 | 编码 示例：777779 |
| name | object | 否 | 是 | 名称 |
| accstandardname | object | 否 | 是 | 对应的会计准则名称 |
| accProperty | object | 是 | 否 | 会计要素列表 |
| _status | string | 否 | 是 | 会计要素表操作状态，Insert:新增,Update:更新 示例：Update |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |

## 3. 请求示例

Url: /yonbip/AMP/yonbip-fi-epub/accelementlist/bill/save?access_token=访问令牌
Body: {
	"billnum": "fiepub_accelementlist",
	"data": {
		"resubmitCheckKey": "fiepub_accelementlist_edit_9bff279c-e14c-46d5-bbcc-3af2527e11bb",
		"id": "2236521910638739457",
		"code": "777779",
		"name": {
			"zh_CN": "zj"
		},
		"accstandardname": {
			"zh_CN": "zjj",
			"en_US": "",
			"zh_TW": ""
		},
		"accProperty": [
			{
				"code": "2222",
				"accpropertyattribute": "0",
				"name": {
					"zh_CN": "2222",
					"en_US": "",
					"zh_TW": ""
				},
				"id": "2236521910638739458",
				"balanceformulaposition": "0",
				"direction": "Debit",
				"_status": "Update"
			}
		],
		"_status": "Update"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应实体 |
| id | string | 否 | 会计要素表Id 示例：2236521910638739457 |
| code | string | 否 | 会计要素表编码 示例：777779 |
| name | object | 否 | 会计要素表名称 |
| accstandardname | object | 否 | 对应的会计准则名称 |
| accProperty | object | 是 | 会计要素集合 |
| _status | string | 否 | 会计要素表操作状态 示例：Update |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2236521910638739457",
		"code": "777779",
		"name": {
			"zh_CN": "zj"
		},
		"accstandardname": {
			"zh_CN": "zjj"
		},
		"accProperty": [
			{
				"code": "2222",
				"accpropertyattribute": "0",
				"name": {
					"zh_CN": "2222"
				},
				"id": "2236521910638739458",
				"balanceformulaposition": "0",
				"direction": "Debit",
				"_status": "Update",
				"accelement": "2236521910638739457"
			}
		],
		"_status": "Update",
		"resubmitCheckKey": "fiepub_accelementlist_edit_9bff279c-e14c-46d5-bbcc-3af2527e11bb"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	会计要素表已经被引用，[001]不可以修改。	被引用后不允许修改


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

