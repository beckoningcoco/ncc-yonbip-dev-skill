---
title: "出口退税申请单查询"
apiId: "2017550622495080448"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 出口退税申请单查询

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/exportTaxRebateApply/query

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
| orgCode | string | 否 | 否 | 税务组织编码 示例：887 |
| code | string | 否 | 否 | 出口退税申请单编码 示例：0000001 |
| fpDm | string | 否 | 否 | 发票代码 示例：051002300211 |
| fpHm | string | 否 | 否 | 发票号码 示例：88014746 |
| pageIndex | string | 否 | 否 | 当前页码，默认为1 示例：1 |
| pageSize | string | 否 | 否 | 每页大小，默认20 示例：20 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/exportTaxRebateApply/query?access_token=访问令牌
Body: {
	"orgCode": "887",
	"code": "0000001",
	"fpDm": "051002300211",
	"fpHm": "88014746",
	"pageIndex": "1",
	"pageSize": "20"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 返回数据 |
| code | string | 否 | 退税申请单号 示例：002213 |
| submitter | string | 否 | 制单人 示例：刘国梁 |
| date | string | 否 | 制单日期 yyyy-MM-dd 示例：2024-06-11 |
| orgCode | string | 否 | 会计主体编码 示例：887 |
| orgName | string | 否 | 会计主体名称 示例：887 |
| exportTaxRebateApplyBList | object | 是 | 报关单明细列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": "002213",
			"submitter": "刘国梁",
			"date": "2024-06-11",
			"orgCode": "887",
			"orgName": "887",
			"exportTaxRebateApplyBList": [
				{
					"relationNo": "0022130001",
					"exportDeclarationNo": "333",
					"productSerial": "0001",
					"exportTaxRebateApplyCList": [
						{
							"fpDm": "051002300211",
							"fpHm": "88014746",
							"rebateAmount": 1,
							"rebateTax": 0.01,
							"quantity": 100
						}
					]
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统发生异常错误，请联系管理员查看日志[requestId:c1ddf94fd503087e][yonbip-fi-taxit]	未知错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-29

更新

请求说明

更新

请求参数 orgCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

