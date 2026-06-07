---
title: "入账查询"
apiId: "2206389751612702728"
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

# 入账查询

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/invoice-entry/query-task

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
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：123456 |
| taskNos | string | 是 | 是 | 任务编号列表 示例：[1,2,4] |
| pagenum | string | 否 | 否 | 页数 示例：1 默认值：1 |
| pagesize | string | 否 | 否 | 每页大小 示例：10 默认值：10 |

## 3. 请求示例

Url: /yonbip/tax/api/invoice-entry/query-task?access_token=访问令牌
Body: {
	"nsrsbh": "123456",
	"taskNos": [
		1,
		2,
		4
	],
	"pagenum": "1",
	"pagesize": "10"
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
| message | string | 否 | 信息说明 示例：操作成功 |
| data | object | 是 | 入账明细 |
| taskNo | string | 否 | 任务编号 示例：12345 |
| status | string | 否 | 任务状态 1:未开始 2:执行中 3:完成 4:部分完成 5:失败 示例：00 |
| bills | object | 是 | 发票明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"taskNo": "12345",
			"status": "00",
			"bills": [
				{
					"invoiceCode": "1234",
					"invoiceNum": "1234",
					"status": "00",
					"errorMsg": "税局异常"
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常


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

