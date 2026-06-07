---
title: "已签收票据查询接口"
apiId: "8f6089a2cad4452e88bbcbad5f82e822"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 已签收票据查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Bill Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/drft/api/register/request

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
| billNo | string | 否 | 否 | 票据编号 示例：131330320008220190326367810579 |
| billType | string | 否 | 否 | 票据类型：AC01=银承，AC02=商承 示例：AC01 |
| extend | string | 否 | 否 | 扩展字段 |
| signBeginDate | string | 否 | 是 | 签收起始日期 示例：20210507 |
| signEndDate | string | 否 | 是 | 签收结束日期 示例：20210507 |
| srcItem | string | 否 | 是 | 事项来源：50=商业汇票，51=四方 示例：51 |

## 3. 请求示例

Url: /yonbip/ctm/drft/api/register/request?access_token=访问令牌
Body: {
	"billNo": "131330320008220190326367810579",
	"billType": "AC01",
	"extend": "",
	"signBeginDate": "20210507",
	"signEndDate": "20210507",
	"srcItem": "51"
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
| code | string | 否 | 请求结果 示例：200 |
| message | string | 否 | 失败原因 |
| data | object | 否 | data |
| recordNum | long | 否 | 本次查询记录数 示例：1 |
| recordList | object | 是 | recordList |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"recordNum": 1,
		"recordList": [
			{
				"billNo": "131330320008220190326366444477",
				"billType": "AC01",
				"extend": "",
				"srcItem": "",
				"businessNum": "00Sign201231000411",
				"businessDate": "20210428",
				"invoicer": "上海公司",
				"invoicerBankAcc": "591915131310504",
				"invoicerOpenBankName": "交通银行上海陆家嘴支行",
				"invoicerOpenBankNo": "301290050828",
				"receiver": "杭州公司",
				"receiverBankAcc": "591915131410208",
				"receiverOpenBankName": "交通银行上海陆家嘴支行",
				"receiverOpenBankNo": "301290050828",
				"acceptancer": "招商银行",
				"acceptBankAcc": "591915131310504",
				"acceptOpenBankName": "",
				"acceptOpenBankNo": "301290050828",
				"invoiceDate": "20201231",
				"endDate": "20210731",
				"acceptDate": "",
				"noteMoney": 666,
				"contractNo": "",
				"isTransfer": 1,
				"noteStatus": "",
				"ecdsStatus": "",
				"signType": "",
				"changeCount": "",
				"lastHoldTicketPerson": "",
				"lastHoldTicketBankAcc": "",
				"lastHoldTicketBankAccName": "",
				"lastHoldTicketBankCode": "",
				"lastHoldTicketBankName": "",
				"lastHoldTicketCurrType": "CNY",
				"holdTicketPerson": "",
				"holdTicketBankAcc": "",
				"holdTicketBankAccName": "",
				"holdTicketBankCode": "",
				"holdTicketBankName": "",
				"holdTicketCurrType": "CNY",
				"companyCode": "",
				"srcFlag": "",
				"pk_register": "",
				"ifsepFlow": "",
				"billrangestart": 0,
				"billrangeend": 0,
				"availableRange": "",
				"circulate_flag": "",
				"oneAvailableMoney": 0,
				"availableMoney": 0
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403001	参数错误

1022020403004	日期格式错误

1022020403011	没有找到符合条件的票据

1022020403500	服务器异常

1022020403002	参数为空


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-01-15

新增

返回参数 (9)

新增字段


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

