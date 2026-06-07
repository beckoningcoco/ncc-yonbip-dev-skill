---
title: "智能收单验符结果查询"
apiId: "1449319706010845184"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Intelligent Receipt Collection"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Intelligent Receipt Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 智能收单验符结果查询

> `ContentType	application/json` 请求方式	POST | 分类: Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/appDevice/v1/submitVerification/async/result

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
| asyncKey | string | 否 | 是 | 异步操作key：根据异步提交验符接口中定义的key值，对应结果查询 示例：bd274193-634d-42e4-6719-ac66463d23344 |
| deviceCode | string | 否 | 是 | 设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou00001 |
| manufacturer | string | 否 | 是 | 终端所属厂商标识：由用友分发标识符 示例：yonyou |

## 3. 请求示例

Url: /yonbip/ssc/appDevice/v1/submitVerification/async/result?access_token=访问令牌
Body: {
	"asyncKey": "bd274193-634d-42e4-6719-ac66463d23344",
	"deviceCode": "yonyou00001",
	"manufacturer": "yonyou"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 成功为200，错误提示为其他值 示例：200 |
| message | string | 否 | 成功提示或错误提示 示例：操作成功 |
| data | object | 否 | 返回数据 |
| ifFinished | boolean | 否 | 验符完成标识：标识异步提交单据是否完成（true|false） 示例：true |
| manufacturer | string | 否 | 终端所属厂商标识：由用友分发标识符 示例：yonyou |
| deviceCode | string | 否 | 设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou00001 |
| errorMessage | string | 否 | 错误提示：异步提交单据异常具体提示信息 示例：未查到启用的设备 |
| invoices | object | 是 | 票据信息 |
| billInfo | object | 否 | 单据信息 |
| yTenantId | string | 否 | 友户通租户ID 示例：0000KR63PRZP59AUWY0000 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"ifFinished": true,
		"manufacturer": "yonyou",
		"deviceCode": "yonyou00001",
		"errorMessage": "未查到启用的设备",
		"invoices": [
			{
				"invoiceType": "invoice",
				"addedInvoiceType": "1",
				"invoiceCode": "011002100711",
				"invoiceNum": "39519387",
				"invoiceDate": "20220216",
				"hjje": "110",
				"jshj": "110",
				"jym": "72117059262835141041",
				"invoiceName": "其他=",
				"formName": "发票联",
				"coordinate": "{\"endY\":1919,\"endX\":1081,\"sourceWidth\":0,\"degree\":270,\"sourceHeight\":0,\"startY\":0,\"startX\":604}",
				"status": 12,
				"deductionStatus": "0",
				"uploadImageId": "625908057ca0ec3ccea206e9",
				"fileId": "625908057ca0ec3ccea206e9",
				"ifManualMatch": "true",
				"errorInvoiceMoney": "170",
				"errorInvoiceDate": "20220218",
				"deductionFileId": "625908057ca0ec3ccea206ev",
				"deductionUploadImageId": "625908057ca0ec3ccea206vv",
				"errorInvoiceType": "增值税普通发票"
			}
		],
		"billInfo": {
			"id": "1449261955900506116",
			"barCode": "znbzbx_expensebill|2663540345934592",
			"billNum": "GRRD220225000002",
			"billCreateDate": "2022-02-25",
			"imageCount": "1",
			"attachmentCount": "0",
			"invoiceReceivedCount": "1",
			"deliveryBatch": 21,
			"billCreatorName": "张三",
			"electronInvoiceCount": "1",
			"checkStatus": "12",
			"attachmentList": [
				{
					"checked": false,
					"fileId": "625908057ca0ec3ccea206e9",
					"uploadImageId": "625908057ca0ec3ccea206e9"
				}
			]
		},
		"yTenantId": "0000KR63PRZP59AUWY0000"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023060400030	验符结果查询失败	联系开发解决


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

