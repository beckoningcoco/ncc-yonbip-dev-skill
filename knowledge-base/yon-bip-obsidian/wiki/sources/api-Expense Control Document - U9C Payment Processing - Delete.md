---
title: "费控单据-U9C收付款结算-删除"
apiId: "2013065439690096645"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reimbursement"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reimbursement]
platform_version: "BIP"
source_type: community-api-docs
---

# 费控单据-U9C收付款结算-删除

> `ContentType	application/json` 请求方式	POST | 分类: Reimbursement (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/u9c/settle/delete

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
| isPay | string | 否 | 否 | 是否付款业务 示例：true |
| id | string | 否 | 否 | 业务单据主键 示例：1977608113855922181 |

## 3. 请求示例

Url: /yonbip/znbz/u9c/settle/delete?access_token=访问令牌
Body: [{
	"isPay": "true",
	"id": "1977608113855922181"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | code 示例：200 |
| displayCode | string | 否 | 异常码 |
| data | object | 否 | data |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | 维护该错误信息 示例：操作成功 |
| data | object | 否 | data |
| message | string | 否 | 错误 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"data": {
		"code": 200,
		"message": "操作成功",
		"data": {
			"count": 2,
			"successCount": 1,
			"failCount": 1,
			"messages": [
				{
					"sourceUnique": "1006E1100000000076C4",
					"message": "此数据业务状态错误信息"
				}
			],
			"infos": [
				{
					"data": {
						"sourceUnique": "1006E1100000000076C4",
						"targetUnique": "1787298122076416"
					}
				}
			]
		}
	},
	"message": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

