---
title: "账龄方案保存"
apiId: "2279089254281248769"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Aging Scheme"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Aging Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 账龄方案保存

> `ContentType	application/json` 请求方式	POST | 分类: Aging Scheme (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/yonbip-fi-epub/accountage/bill/save

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
| billnum | string | 否 | 否 | 单据编码 示例：fiepub_accountagecard |
| data | object | 否 | 否 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 否 | 编码 示例：006 |
| name | object | 否 | 否 | 名称 |
| timeunit | string | 否 | 否 | 时间单位 示例：1 |
| unitnumber | string | 否 | 否 | 单位天数 示例：1 |
| active | boolean | 否 | 否 | 启用状态 示例：true |
| defaultStatus | boolean | 否 | 否 | 是否默认 示例：false |
| createDate | string | 否 | 否 | 创建日期 示例：2025-05-29 20:05:50 |
| type | boolean | 否 | 否 | type 示例：false |
| createTime | string | 否 | 否 | 创建时间 示例：2025-05-29 20:05:50 |
| accountAgingPlanSettingB | object | 是 | 否 | accountAgingPlanSettingB |
| _status | string | 否 | 否 | _status 示例：Insert |

## 3. 请求示例

Url: /yonbip/AMP/yonbip-fi-epub/accountage/bill/save?access_token=访问令牌
Body: {
	"billnum": "fiepub_accountagecard",
	"data": {
		"resubmitCheckKey": "",
		"code": "006",
		"name": {
			"zh_CN": "006",
			"en_US": "",
			"zh_TW": ""
		},
		"timeunit": "1",
		"unitnumber": "1",
		"active": true,
		"defaultStatus": false,
		"createDate": "2025-05-29 20:05:50",
		"type": false,
		"createTime": "2025-05-29 20:05:50",
		"accountAgingPlanSettingB": [
			{
				"hasDefaultInit": true,
				"_id": "rowId_504",
				"_realtype": "",
				"_entityName": "",
				"_keyName": "",
				"ttt_id": "rowId_504",
				"_status": "Insert",
				"_tableDisplayOutlineAll": false,
				"displayName": {
					"zh_CN": "1",
					"en_US": "",
					"zh_TW": ""
				},
				"indexNum": -1,
				"accountPeriodTimeEnd": 3
			}
		],
		"_status": "Insert"
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
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 |
| code | string | 否 | 编码 示例：006 |
| name | object | 否 | 名称 |
| timeunit | string | 否 | 时间单位 示例：1 |
| unitnumber | string | 否 | 单位天数 示例：1 |
| active | boolean | 否 | 启用状态 示例：true |
| defaultStatus | boolean | 否 | 是否默认 示例：false |
| createDate | string | 否 | 创建日期 示例：2025-05-29 20:06:10 |
| type | boolean | 否 | type 示例：false |
| createTime | string | 否 | 创建时间 示例：2025-05-29 20:06:10 |
| accountAgingPlanSettingB | object | 是 | accountAgingPlanSettingB |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| tenantId | string | 否 | tenantId 示例：0000L6YQ8AVLFUZPXD0000 |
| userId | string | 否 | userId 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| id | string | 否 | id 示例：2279084624292872197 |
| creatorId | string | 否 | creatorId 示例：1525641755939569667 |
| creator | string | 否 | creator 示例：u8c_vip管理员 |
| pubts | string | 否 | pubts 示例：2025-05-29 20:06:10 |
| tenant | number |
| 小数位数:0,最大长度:16 | 否 | tenant 示例：2909930715861584 |
| ytenant | string | 否 | ytenant 示例：0000L6YQ8AVLFUZPXD0000 |
| creatorId_name | string | 否 | creatorId_name 示例：u8c_vip管理员 |
| traceId | string | 否 | traceId 示例：abdaedfff865230f |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "006",
		"name": {
			"zh_CN": "006"
		},
		"timeunit": "1",
		"unitnumber": "1",
		"active": true,
		"defaultStatus": false,
		"createDate": "2025-05-29 20:06:10",
		"type": false,
		"createTime": "2025-05-29 20:06:10",
		"accountAgingPlanSettingB": [
			{
				"hasDefaultInit": true,
				"ttt_id": "rowId_504",
				"displayName": {
					"zh_CN": "1"
				},
				"indexNum": -1,
				"accountPeriodTimeEnd": 3,
				"index_num": 3,
				"id": "2279084624292872198",
				"mainid": "2279084624292872197",
				"pubts": "2025-05-29 20:06:10",
				"tenant": 2909930715861584,
				"ytenant": "0000L6YQ8AVLFUZPXD0000"
			}
		],
		"resubmitCheckKey": "fiepub_accountagecard_add_678aea81-c49c-4c7d-b622-197e434b4cd3",
		"tenantId": "0000L6YQ8AVLFUZPXD0000",
		"userId": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"id": "2279084624292872197",
		"creatorId": "1525641755939569667",
		"creator": "u8c_vip管理员",
		"pubts": "2025-05-29 20:06:10",
		"tenant": 2909930715861584,
		"ytenant": "0000L6YQ8AVLFUZPXD0000",
		"creatorId_name": "u8c_vip管理员"
	},
	"traceId": "abdaedfff865230f",
	"uploadable": "0"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

