---
title: "应收确认规则保存"
apiId: "2342636353448574979"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "A/R Recognition Rule"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/R Recognition Rule]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收确认规则保存

> `ContentType	application/json` 请求方式	POST | 分类: A/R Recognition Rule (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/yonbip-fi-epub/receive/bill/save

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
| billnum | string | 否 | 否 | billnum 示例：fiepub_receivable_confirm_card |
| data | object | 否 | 否 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | id 示例：2342634652629467143 |
| ruleCode | string | 否 | 否 | ruleCode 示例：YSQRGZ |
| ruleName | string | 否 | 否 | ruleName 示例：应收确认规则 |
| sourceApplication | string | 否 | 否 | sourceApplication 示例：1590899514909655042 |
| sourceApplication_name | string | 否 | 否 | sourceApplication_name 示例：收入管理 |
| businessItem | string | 否 | 否 | businessItem 示例：2077820043062149121 |
| businessItem_name | string | 否 | 否 | businessItem_name 示例：结算信息 |
| accountItem_name | string | 否 | 否 | accountItem_name |
| stopstatus | boolean | 否 | 否 | stopstatus 示例：false |
| system | boolean | 否 | 否 | system 示例：false |
| businessPlugin_name | string | 否 | 否 | businessPlugin_name |
| creatorId_name | string | 否 | 否 | creatorId_name 示例：u8c_vip管理员 |
| createDate | string | 否 | 否 | createDate 示例：2025-08-23 11:09:27 |
| createTime | string | 否 | 否 | createTime 示例：2025-08-23 11:09:27 |
| pubts | string | 否 | 否 | pubts 示例：2025-08-23 11:09:28 |
| name | string | 否 | 否 | name 示例：应收确认规则 |
| code | string | 否 | 否 | code 示例：YSQRGZ |
| _status | string | 否 | 否 | _status 示例：Update |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/receive/bill/save?access_token=访问令牌
Body: {
	"billnum": "fiepub_receivable_confirm_card",
	"data": {
		"resubmitCheckKey": "fiepub_receivable_confirm_card_add_1d46cb85-17aa-490b-b0bf-b35d2eeae9e4",
		"id": "2342634652629467143",
		"ruleCode": "YSQRGZ",
		"ruleName": "应收确认规则",
		"sourceApplication": "1590899514909655042",
		"sourceApplication_name": "收入管理",
		"businessItem": "2077820043062149121",
		"businessItem_name": "结算信息",
		"accountItem_name": "",
		"stopstatus": false,
		"system": false,
		"businessPlugin_name": "",
		"creatorId_name": "u8c_vip管理员",
		"createDate": "2025-08-23 11:09:27",
		"createTime": "2025-08-23 11:09:27",
		"pubts": "2025-08-23 11:09:28",
		"name": "应收确认规则",
		"code": "YSQRGZ",
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
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| id | string | 否 | id 示例：2342634652629467143 |
| ruleCode | string | 否 | ruleCode 示例：YSQRGZ |
| ruleName | string | 否 | ruleName 示例：应收确认规则 |
| sourceApplication | string | 否 | sourceApplication 示例：1590899514909655042 |
| sourceApplication_name | string | 否 | sourceApplication_name 示例：收入管理 |
| businessItem | string | 否 | businessItem 示例：2077820043062149121 |
| businessItem_name | string | 否 | businessItem_name 示例：结算信息 |
| stopstatus | boolean | 否 | stopstatus 示例：false |
| system | boolean | 否 | system 示例：false |
| creatorId_name | string | 否 | creatorId_name 示例：u8c_vip管理员 |
| createDate | string | 否 | createDate 示例：2025-08-23 11:09:27 |
| createTime | string | 否 | createTime 示例：2025-08-23 11:09:27 |
| pubts | string | 否 | pubts 示例：2025-08-23 11:10:01 |
| name | string | 否 | name 示例：应收确认规则 |
| code | string | 否 | code 示例：YSQRGZ |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| modifier | string | 否 | modifier 示例：u8c_vip管理员 |
| modifierId | string | 否 | modifierId 示例：1525641755939569667 |
| modifyTime | string | 否 | modifyTime 示例：2025-08-23 11:10:01 |
| modifyDate | string | 否 | modifyDate 示例：2025-08-23 11:10:01 |
| tenant | number |
| 小数位数:0,最大长度:16 | 否 | tenant 示例：2909930715861584 |
| ytenant | string | 否 | ytenant 示例：0000L6YQ8AVLFUZPXD0000 |
| creatorId | string | 否 | creatorId 示例：1525641755939569667 |
| modifierId_name | string | 否 | modifierId_name 示例：u8c_vip管理员 |
| traceId | string | 否 | traceId 示例：05c8383831c87335 |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2342634652629467143",
		"ruleCode": "YSQRGZ",
		"ruleName": "应收确认规则",
		"sourceApplication": "1590899514909655042",
		"sourceApplication_name": "收入管理",
		"businessItem": "2077820043062149121",
		"businessItem_name": "结算信息",
		"stopstatus": false,
		"system": false,
		"creatorId_name": "u8c_vip管理员",
		"createDate": "2025-08-23 11:09:27",
		"createTime": "2025-08-23 11:09:27",
		"pubts": "2025-08-23 11:10:01",
		"name": "应收确认规则",
		"code": "YSQRGZ",
		"resubmitCheckKey": "fiepub_receivable_confirm_card_add_1d46cb85-17aa-490b-b0bf-b35d2eeae9e4",
		"modifier": "u8c_vip管理员",
		"modifierId": "1525641755939569667",
		"modifyTime": "2025-08-23 11:10:01",
		"modifyDate": "2025-08-23 11:10:01",
		"tenant": 2909930715861584,
		"ytenant": "0000L6YQ8AVLFUZPXD0000",
		"creatorId": "1525641755939569667",
		"modifierId_name": "u8c_vip管理员"
	},
	"traceId": "05c8383831c87335",
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

