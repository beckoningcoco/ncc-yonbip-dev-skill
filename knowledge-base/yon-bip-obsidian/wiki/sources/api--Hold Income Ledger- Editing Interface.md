---
title: "《持有收益台账》编辑接口"
apiId: "2061447833961103362"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Equity Asset Change Ledger"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Equity Asset Change Ledger]
platform_version: "BIP"
source_type: community-api-docs
---

# 《持有收益台账》编辑接口

> `ContentType	application/json` 请求方式	POST | 分类: Equity Asset Change Ledger (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/hold-income-ledger/batch-edit

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 待编辑的数据 |
| assetCode | string | 否 | 否 | 资产编码 示例：1111 |
| projectCode | string | 否 | 否 | 项目编码 示例：1223 |
| remarks | string | 否 | 否 | 备注 示例：备注11 |
| holdIncomeDetailList | object | 是 | 否 | 持有收益明细子表数据 |
| investedEnterpriseProfitList | object | 是 | 否 | 被投资企业利润分配确认金额子表数据 |
| partnerAmountDetailList | object | 是 | 否 | 合伙企业法人合伙人金额子表数据 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/hold-income-ledger/batch-edit?access_token=访问令牌
Body: {
	"data": [
		{
			"assetCode": "1111",
			"projectCode": "1223",
			"remarks": "备注11",
			"holdIncomeDetailList": [
				{
					"profitYear": "2023",
					"voucherDate": "2024-08-19",
					"voucherType": "1",
					"voucherCode": "2",
					"voucherNo": "3",
					"accountingItemNo": "4",
					"accountingItemName": "名称111",
					"rightsRetainedProfitsInvestmentIncome": 10,
					"rightsRealDividendBonus": 20,
					"accountingInvestmentIncome": 30,
					"taxAmount": 40
				}
			],
			"investedEnterpriseProfitList": [
				{
					"InvestedEnterpriseProfitSharingTime": "2024-05-06",
					"companyBonusInvestIncome": 100
				}
			],
			"partnerAmountDetailList": [
				{
					"sourceUnique": "111",
					"id": "22333",
					"partnerYear": "2023",
					"partnerTaxableAmount": 100
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | object | 否 | 返回对象 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：1 |
| infos | object | 是 | 成功数据 |
| messages | object | 是 | 失败数据 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"infos": [
			{
				"sourceUnique": "1",
				"id": "1"
			}
		],
		"messages": [
			{
				"sourceUnique": "1",
				"message": "依据组织编码【1】查询组织为空"
			}
		]
	},
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-09

删除

请求参数 (5)

调整目录


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

