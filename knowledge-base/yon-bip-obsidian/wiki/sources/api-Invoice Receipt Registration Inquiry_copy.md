---
title: "银行托收查询"
apiId: "2383564917866233859"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bank Collection"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bank Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 银行托收查询

> `ContentType	application/json` 请求方式	POST | 分类: Bank Collection (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/api/consignbank/detail

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | number |
| 小数位数:0,最大长度:30 | 否 | 否 | 主键 |
| accentityCode | string | 否 | 否 | 资金组织编码 |
| accentityName | string | 否 | 否 | 资金组织名称 |
| consignDateStart | date |
| 格式:yyyy-MM-dd | 否 | 否 | 托收日期开始 |
| consignDateEnd | date |
| 格式:yyyy-MM-dd | 否 | 否 | 托收日期结束 |
| noteType | string | 否 | 否 | 票据大类，0=商业汇票，1=银行汇票，2=债权凭证，可多选，以英文逗号隔开，为空查全部 |
| noteFlag | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 票据介质，0=纸质票据，1=电子票据 |
| noteno | string | 否 | 否 | 票据号 |
| billRange | string | 否 | 否 | 子票区间 |
| billTypeName | string | 否 | 否 | 票据类型 |
| invoiceDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 出票日期 |
| endDateStart | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期日期开始 |
| endDateEnd | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期日期结束 |
| billStatus | string | 否 | 否 | 单据状态(2:已作废，3：在托收，4：已部分托收，5：已托收) |
| downloadFile | boolean | 否 | 否 | 下载附件 |

## 3. 请求示例

Url: /yonbip/FCC/api/consignbank/detail?access_token=访问令牌
Body: {
	"id": 0,
	"accentityCode": "",
	"accentityName": "",
	"consignDateStart": "2026-06-07",
	"consignDateEnd": "2026-06-07",
	"noteType": "",
	"noteFlag": 0,
	"noteno": "",
	"billRange": "",
	"billTypeName": "",
	"invoiceDate": "2026-06-07",
	"endDateStart": "2026-06-07",
	"endDateEnd": "2026-06-07",
	"billStatus": "",
	"downloadFile": true
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
| code | string | 否 | code 示例：00：成功 01：失败 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| recordNum | number |
| 小数位数:0,最大长度:10 | 否 | 本次查询记录数 |
| recordList | object | 是 | 本次查询数据 |

## 5. 正确返回示例

{
	"code": "00：成功  01：失败",
	"message": "操作成功",
	"data": {
		"recordNum": 0,
		"recordList": [
			{
				"success": true,
				"message": "如：异常信息",
				"id": 0,
				"srcitem": 0,
				"srcbilltype": 0,
				"accentityCode": "",
				"accentityName": "",
				"consigndate": "2026-06-07",
				"businessAccountDate": "2026-06-07",
				"code": "",
				"currencyName": "",
				"olcCurrencyName": "",
				"olcRate": 0,
				"olcratetype": "",
				"olcRateOps": "",
				"noteno": "",
				"billRange": "",
				"billType": "",
				"billbtype": 0,
				"iselecbill": 0,
				"elecsignacc": "",
				"registerId": 0,
				"oripk_register": 0,
				"initialRegister": 0,
				"costCenter": "",
				"profitCenter": "",
				"isElec": true,
				"consignAmount": 0,
				"consignbankacc": "",
				"outerReceiverAccount": "",
				"dealType": 0,
				"identificationCode": "",
				"srcBillId": "",
				"settlementStatus": 0,
				"settleSuccBizTime": "2026-06-07",
				"description": "",
				"invoiceDate": "2026-06-07",
				"endDate": "2026-06-07",
				"istransfer": true,
				"paybillroles": 0,
				"payerCode": "",
				"payerName": "",
				"payAcc": "",
				"invoiceroles": 0,
				"invoicerCode": "",
				"invoicerName": "",
				"invoicerbankacc": "",
				"invoiceropenbank": "",
				"invoiceropenbanknum": "",
				"receiveroles": 0,
				"receiverCode": "",
				"receiverName": "",
				"receiverbankacc": "",
				"receiveropenbank": "",
				"receiveropenbanknum": "",
				"acceptanceroles": 0,
				"acceptancerCode": "",
				"acceptancerName": "",
				"acceptancerbankacc": "",
				"acceptanceropenbank": "",
				"acceptanceropenbanknum": "",
				"noteStatus": 0,
				"billStatus": 0,
				"auditStatus": 0,
				"instructStatus": 0,
				"payResult": "",
				"respondMsg": "",
				"ecdsStatus": "",
				"circulateflag": "",
				"extend": {},
				"files": {
					"fileName": "",
					"fileText": ""
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403001	参数错误

1022020403500	服务器异常

1022020403004	日期格式错误

1022020403002	参数为空


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

