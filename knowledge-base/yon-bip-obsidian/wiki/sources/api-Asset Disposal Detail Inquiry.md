---
title: "资产处置详情查询"
apiId: "7ca1e1b0fcb34b9d97a0f551296c35e2"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Disposal Document"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Disposal Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产处置详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Disposal Document (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fixedassetshandle/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 资产处置单id    示例: 2154103372828928 |

## 3. 请求示例

Url: /yonbip/fi/fixedassetshandle/detail?access_token=访问令牌&id=2154103372828928

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| reduceway | long | 否 | 减少方式 示例：2066527463189396 |
| returncount | long | 否 | 退回次数 示例：0 |
| verifystate | long | 否 | 审批状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：0 |
| currency_moneyDigit | long | 否 | 币种金额精度 示例：2 |
| currency_priceDigit | long | 否 | 币种单价精度 示例：2 |
| code | string | 否 | 处置单编码 示例：DP000001 |
| reducedate | string | 否 | 处置日期 示例：2021-02-02 00:00:00 |
| masterOrgKeyField | string | 否 | 主组织键领域 示例：accentity |
| bodies | object | 是 | 表体 |
| description | object | 否 | 备注 |
| accentity_name | string | 否 | 会计主体名称 示例：固定资产 |
| accentity | string | 否 | 会计主体 示例：2148237326782720 |
| reduceway_name | string | 否 | 减少方式 示例：出售 |
| cleancost | long | 否 | 清理费用 示例：1 |
| currency | string | 否 | 币种id 示例：2145519866484224 |
| id | long | 否 | 资产处置id 示例：2154103372828928 |
| pubts | string | 否 | 时间戳 示例：2021-03-02 17:07:18 |
| isenabled | boolean | 否 | 是否生效 示例：false |
| creator | string | 否 | 创建人 示例：17835411342 |
| auditstatus | long | 否 | 审批状态, 0:未审核、1:已审核、 示例：0 |
| period | string | 否 | 会计期间 示例：2021-02 |
| currency_name | string | 否 | 币种名称 示例：人民币 |
| isWfControlled | boolean | 否 | 是否工作流控制 示例：false |
| cleanincome | long | 否 | 清理收入 示例：1 |
| accentity_code | string | 否 | 会计主体编码 示例：0226 |
| tradetype | string | 否 | 交易类型 示例：2145521022210315 |
| reduceway_code | string | 否 | 减少方式编码 示例：01 |
| createTime | string | 否 | 创建时间 示例：2021-03-02 17:07:17 |
| valueaddedtax | long | 否 | 增值税 示例：1 |
| cleanreason | object | 否 | 清理原因 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"reduceway": 2066527463189396,
		"returncount": 0,
		"verifystate": 0,
		"currency_moneyDigit": 2,
		"currency_priceDigit": 2,
		"code": "DP000001",
		"reducedate": "2021-02-02 00:00:00",
		"masterOrgKeyField": "accentity",
		"bodies": [
			{
				"bescrapvaluerate": 5,
				"bedepreciationmethod": 67971,
				"belifemonth": 600,
				"calculateid": 2148248202318337,
				"becategorycode": 2142662516806416,
				"bemanagedepredept": "2148245505003776",
				"bedepreciationmethod_name": "平均年限法(二)",
				"assetid_name": "豪宅",
				"beusedepredept_name": "采购",
				"disposalbill": 2154103372828928,
				"assetid_code": "0001210126000002",
				"beusagestate": 2112934987388602,
				"beinitialdepreciation": 15.83,
				"beusedepredept": "2148245505003776",
				"bemanagedepredept_name": "采购",
				"beusagestate_name": "在用",
				"impairment": 0,
				"assetid": 2148248202318336,
				"becategorycode_name": "土地",
				"beaccruedoriginalvalue": 10000,
				"id": 2154103372845312,
				"pubts": "2021-03-02 17:07:18",
				"bescrapvalue": 500
			}
		],
		"description": {},
		"accentity_name": "固定资产",
		"accentity": "2148237326782720",
		"reduceway_name": "出售",
		"cleancost": 1,
		"currency": "2145519866484224",
		"id": 2154103372828928,
		"pubts": "2021-03-02 17:07:18",
		"isenabled": false,
		"creator": "17835411342",
		"auditstatus": 0,
		"period": "2021-02",
		"currency_name": "人民币",
		"isWfControlled": false,
		"cleanincome": 1,
		"accentity_code": "0226",
		"tradetype": "2145521022210315",
		"reduceway_code": "01",
		"createTime": "2021-03-02 17:07:17",
		"valueaddedtax": 1,
		"cleanreason": {
			"zh_CN": "测试"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	操作成功	查询时不会出现错误码，只会出现查询出来的data为空。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

返回参数 (57)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

