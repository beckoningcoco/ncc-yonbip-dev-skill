---
title: "计算抵扣数据推送"
apiId: "2221109686884106248"
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

# 计算抵扣数据推送

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/yonbip-fi-taxit/api/bill-collections/push-calculate-deduct

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
| data | object | 否 | 是 | 请求数据体 |
| bills | object | 是 | 是 | 发票信息，最多上传100张发票 |
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：111111 |
| period | string | 否 | 是 | 税期（格式：yyyyMM） 示例：202502 |
| gxType | string | 否 | 是 | 勾选操作Y|N,Y-代表勾选操作，N-代表取消勾选操作 示例：Y |
| calculateType | string | 否 | 是 | 计算抵扣类型: trans-客运计算抵扣|agri-农产品计算抵扣|roadbridge-路桥费抵扣 示例：trans |
| finishFlag | string | 否 | 是 | 结束标志：Y|N,Y-结束 N-未结束；每个calculateType最后一次传Y自动生成统计表 示例：N |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxit/api/bill-collections/push-calculate-deduct?access_token=访问令牌
Body: {
	"data": {
		"bills": [
			{
				"billType": "invoice",
				"calculateValidTax": 22.43,
				"calculateAddTax": 10,
				"calculateDeductionTime": "2023-05-15 14:30:00",
				"uniqueCode": "ABC123456789",
				"ticketNum": "TICKET12345",
				"number": "TRAIN123456",
				"invoiceNum": "INVOICE123456",
				"invoiceCode": "CODE123456",
				"roadbridgeType": "oneway"
			}
		],
		"nsrsbh": "111111",
		"period": "202502",
		"gxType": "Y",
		"calculateType": "trans",
		"finishFlag": "N"
	}
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
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| bills | object | 是 | 出现错误的发票列表以及错误原因 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"bills": [
			{
				"billType": "invoice",
				"uniqueCode": "ABC123456789",
				"ticketNum": "TICKET12345",
				"number": "TRAIN123456",
				"roadbridgeType": "highway",
				"invoiceNum": "INVOICE123456",
				"invoiceCode": "CODE123456",
				"errMsg": "当前发票台账中不存在"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


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

