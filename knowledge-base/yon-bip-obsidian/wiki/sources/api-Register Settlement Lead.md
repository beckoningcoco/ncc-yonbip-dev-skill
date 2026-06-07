---
title: "注册核销线索"
apiId: "2123250961668374536"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Relationship"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Relationship]
platform_version: "BIP"
source_type: community-api-docs
---

# 注册核销线索

> `ContentType	application/json` 请求方式	POST | 分类: Settlement Relationship (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/verify/relation/regClue

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| verifyType | string | 否 | 是 | 核销类型-枚举值 ： 11:应收红蓝对冲 (srcBill-应收; targetBill-应收) 12:收款红蓝对冲 (srcBill-收款; targetBill-收款) 13:收款核销应收 (srcBill-应收; targetBill-收款) 14:收款退款核销收款 (srcBill-收款; targetBill-收款退款) 15:收款退款核销应收(负) (srcBill-应收; targetBill-收款退款) 16:收款退款红蓝对冲 (srcBill-收款退款; targetBill-收款退款) 21:应付红蓝对冲 (srcBill-应付; targetBill-应付) 22:付款红蓝对冲 (srcBill-付款; targetBill-付款) 23:付款核销应付 (srcBill-应付; targetBill-付款) 24:付款退款核销应付(负) (srcBill-应付; targetBill-付款退款) 25:付款退款核销付款 (srcBill-付款; targetBill-付款退款) 26:付款退款红蓝对冲 (srcBill-付款退款; targetBill-付款退款) 31:应付核销应收 (srcBill-应付; targetBill-应收) 32:收款核销付款 (srcBill-付款; targetBill-收款) 33:收款退款核销付款退款 (srcBill-付款退款; targetBill-收款退款) 示例：13 |
| financeOrg | string | 否 | 是 | 会计主体ID 示例：1769037191999127559 |
| srcBill | object | 否 | 是 | 本方单据信息 |
| billId | string | 否 | 是 | 单据ID（生成事务的来源单据ID） 示例：2123225999381889041 |
| billRowId | string | 否 | 否 | 子表行ID（生成事务的来源单据行ID） 示例：2123226007971823654 |
| issueNo | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 孙表期号 示例：1 |
| amount | number |
| 小数位数:8,最大长度:10 | 否 | 是 | 金额 示例：11.11 |
| blnUseOccupy | boolean | 否 | 否 | 是否有预占用 示例：false 默认值：false |
| targetBill | object | 否 | 是 | 对方单据信息 |
| billId | string | 否 | 是 | 单据ID（生成事务的来源单据ID） 示例：2123225999381889041 |
| billRowId | string | 否 | 否 | 子表行ID（生成事务的来源单据行ID） 示例：2123226007971823654 |
| issueNo | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 孙表期号 示例：1 |
| amount | number |
| 小数位数:8,最大长度:10 | 否 | 是 | 金额 示例：11.11 |
| blnUseOccupy | boolean | 否 | 否 | 是否有预占用 示例：false 默认值：false |
| blnDifferentCurrency | boolean | 否 | 否 | 是否异币种 示例：false 默认值：false |
| rate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 汇率(异币种使用 ) 示例：0.7 |
| accDate | string | 否 | 否 | 核销日期 示例：2024-10-31 |
| businessId | string | 否 | 否 | 校验幂等性 示例：976426719876 |

## 3. 请求示例

Url: /yonbip/EFI/verify/relation/regClue?access_token=访问令牌
Body: [{
	"verifyType": "13",
	"financeOrg": "1769037191999127559",
	"srcBill": {
		"billId": "2123225999381889041",
		"billRowId": "2123226007971823654",
		"issueNo": 1,
		"amount": 11.11,
		"blnUseOccupy": false
	},
	"targetBill": {
		"billId": "2123225999381889041",
		"billRowId": "2123226007971823654",
		"issueNo": 1,
		"amount": 11.11,
		"blnUseOccupy": false
	},
	"blnDifferentCurrency": false,
	"rate": 0.7,
	"accDate": "2024-10-31",
	"businessId": "976426719876"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| success | boolean | 否 | 是否成功 示例：true |
| failCode | string | 否 | 失败编码（400 请求错 误；500 服务器内部错 误） 示例：null |
| message | string | 否 | 返回信息 示例：null |
| data | string | 是 | 核销线索ID集合 示例：[ "2123246958744174593" ] |
| successCount | string | 否 | 注册成功数量 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"success": true,
		"failCode": "null",
		"message": "null",
		"data": [
			"2123246958744174593"
		],
		"successCount": "1"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

请求参数 (7)

2	2025-12-05

更新

请求说明

新增

请求参数 businessId


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

