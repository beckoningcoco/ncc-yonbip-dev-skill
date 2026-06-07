---
title: "银行对账单删除"
apiId: "1658514618098647042"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bank Transaction Processing"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bank Transaction Processing]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行对账单删除

> `ContentType	application/json` 请求方式	POST | 分类: Bank Transaction Processing (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/cmp/bankReconciliationDelete

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
| idList | long | 是 | 否 | 银行对账单id数组 示例：[1666610425297895430,16666104252978954301] |
| bankSeqNoList | string | 是 | 否 | 银行交易流水号数组 示例：["1112","1113"] |

## 3. 请求示例

Url: /yonbip/ctm/cmp/bankReconciliationDelete?access_token=访问令牌
Body: {
	"idList": [
		1666610425297895430,
		16666104252978954301
	],
	"bankSeqNoList": [
		"1112",
		"1113"
	]
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
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 操作提示 示例：操作成功 |
| data | object | 是 | 已删除的实体清单 |
| code | long | 否 | 删除结果返回码 示例：0 |
| messages | object | 是 | 删除结果集 |
| msgCode | long | 否 | 删除信息返回码 示例：1 |
| cancel | boolean | 否 | 取消标识 示例：false |
| actionCancel | boolean | 否 | 动作取消标识 示例：false |
| outParams | object | 否 | 输出参数 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": 0,
			"messages": [
				{}
			],
			"msgCode": 1,
			"cancel": false,
			"actionCancel": false,
			"outParams": {
				"returnBaseDto": {
					"billnum": "cmp_bankreconciliation",
					"data": [
						{
							"id": 1666610425297895430,
							"bank_seq_no": "1113",
							"accentity": "1649405095559823369",
							"currency": "1493014220928712733",
							"tran_date": "2023-02-24",
							"dc_flag": 1,
							"tran_amt": 300,
							"bankaccount": "1649412671888424964"
						}
					]
				}
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403000	接口请求异常！异常详细信息：XXXX	根据异常提示信息调整对应的请求参数


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-19

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

