---
title: "发票状态变更历史"
apiId: "2340688187210334216"
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

# 发票状态变更历史

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/api/bill/invoiceStatusChange

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
| pagenum | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页数 默认值：1 |
| pagesize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页大小 默认值：15 |
| searchParam | object | 否 | 是 | 查询条件 |
| changeDateTimeStart | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 是 | 变更日期起 |
| changeDateTimeEnd | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 是 | 变更日期止 |
| invoiceCode | string | 否 | 否 | 发票代码 |
| invoiceNum | string | 否 | 否 | 发票号码 |
| changeColumn | string | 是 | 否 | 变更状态（billStatus:发票状态，sfrz:入账状态） 默认值：["billStatus"] |

## 3. 请求示例

Url: /yonbip/FCC/api/bill/invoiceStatusChange?access_token=访问令牌
Body: {
	"pagenum": 0,
	"pagesize": 0,
	"searchParam": {
		"changeDateTimeStart": "2026-06-07 12:05:29",
		"changeDateTimeEnd": "2026-06-07 12:05:29",
		"invoiceCode": "",
		"invoiceNum": "",
		"changeColumn": [
			""
		]
	}
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
| displayCode | string | 否 | 异常码 示例：037-010-000000 |
| msg | string | 否 | 返回信息 示例：success |
| traceId | string | 否 | 接口调用链路id 示例：4243d85d4103c762 |
| datas | object | 否 | 返回数据 |
| bills | object | 是 | 明细数据 |
| totalEntity | object | 否 | 总数 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "0000",
		"displayCode": "037-010-000000",
		"msg": "success",
		"traceId": "4243d85d4103c762",
		"datas": {
			"bills": [
				{
					"invoiceCode": "",
					"invoiceNum": "",
					"sdHm": "",
					"operationType": "",
					"createTime": "2026-06-07 12:05:29",
					"creator": "",
					"oldValue": "",
					"newValue": ""
				}
			],
			"totalEntity": {
				"totalCount": 0
			}
		}
	}
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

