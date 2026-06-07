---
title: "收付云处理结果查询"
apiId: "ec6d031f28164c52bdfa2b3d15fc277d"
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

# 收付云处理结果查询

> `ContentType	application/json` 请求方式	POST | 分类: Bill Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/drft/api/bill/queryResult

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
| billNo | string | 否 | 否 | 票据号 业务类型为背书业务02是必传 示例：131330320008220190327397820204 |
| billType | string | 否 | 否 | 票据类型,AC01=银承 AC02=商承 示例：AC01 |
| businessType | string | 否 | 是 | 业务类型 01 出票申请,02 背书申请 示例：02 |
| extend | string | 否 | 否 | 扩展字段 |
| serialNum | string | 否 | 是 | 收付云请求流水号 |
| srcItem | long | 否 | 是 | 来源 51四方，50商业汇票 示例：51 |

## 3. 请求示例

Url: /yonbip/ctm/drft/api/bill/queryResult?access_token=访问令牌
Body: {
	"billNo": "131330320008220190327397820204",
	"billType": "AC01",
	"businessType": "02",
	"extend": "",
	"serialNum": "",
	"srcItem": 51
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| acceptBankAcc | string | 否 | acceptBankAcc 示例：110010288000 |
| acceptDate | string | 否 | acceptDate 示例：20210420 |
| acceptOpenBankName | string | 否 | acceptOpenBankName 示例：北京银行 |
| acceptOpenBankNo | string | 否 | acceptOpenBankNo 示例：1120012 |
| acceptancer | string | 否 | acceptancer 示例：北京银行 |
| billNo | string | 否 | billNo 示例：131330320008220229 |
| billType | string | 否 | billType 示例：AC01 |
| businessNum | string | 否 | businessNum 示例：YS123456 |
| businessType | string | 否 | businessType 示例：02 |
| contractNo | string | 否 | contractNo 示例：S451561656448 |
| ecdsStatus | string | 否 | ecdsStatus 示例：10312 |
| endDate | string | 否 | endDate 示例：20210420 |
| extend | string | 否 | extend |
| finishDate | string | 否 | finishDate 示例：20210420 |
| invoiceDate | string | 否 | invoiceDate 示例：20210420 |
| invoicer | string | 否 | invoicer 示例：北京银行 |
| invoicerBankAcc | string | 否 | invoicerBankAcc 示例：110010288000 |
| invoicerOpenBankName | string | 否 | invoicerOpenBankName 示例：1120012 |
| invoicerOpenBankNo | string | 否 | invoicerOpenBankNo 示例：120012 |
| isTransfer | boolean | 否 | isTransfer 示例：false |
| noteMoney | object | 否 | noteMoney |
| noteStatus | string | 否 | noteStatus 示例：在背书 |
| receiver | string | 否 | receiver 示例：北京 银行 |
| receiverOpenBankName | string | 否 | receiverOpenBankName 示例：1120012 |
| receiverOpenBankNo | string | 否 | receiverOpenBankNo 示例：1120012 |
| receiverbankacc | string | 否 | receiverbankacc 示例：110010288000 |
| serialNum | string | 否 | serialNum 示例：13133032000822024546529 |
| srcItem | long | 否 | srcItem 示例：51 |
| pk_register | long | 否 | pk_register 示例：10000 |
| transrangestart | long | 否 | transrangestart 示例：1 |
| transrangeend | long | 否 | transrangeend 示例：10 |
| circulate_flag | string | 否 | circulate_flag |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"acceptBankAcc": "110010288000",
		"acceptDate": "20210420",
		"acceptOpenBankName": "北京银行",
		"acceptOpenBankNo": "1120012",
		"acceptancer": "北京银行",
		"billNo": "131330320008220229",
		"billType": "AC01",
		"businessNum": "YS123456",
		"businessType": "02",
		"contractNo": "S451561656448",
		"ecdsStatus": "10312",
		"endDate": "20210420",
		"extend": "",
		"finishDate": "20210420",
		"invoiceDate": "20210420",
		"invoicer": "北京银行",
		"invoicerBankAcc": "110010288000",
		"invoicerOpenBankName": "1120012",
		"invoicerOpenBankNo": "120012",
		"isTransfer": false,
		"noteMoney": {},
		"noteStatus": "在背书",
		"receiver": "北京 银行",
		"receiverOpenBankName": "1120012",
		"receiverOpenBankNo": "1120012",
		"receiverbankacc": "110010288000",
		"serialNum": "13133032000822024546529",
		"srcItem": 51,
		"pk_register": 10000,
		"transrangestart": 1,
		"transrangeend": 10,
		"circulate_flag": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403001	参数错误

1022020403500	服务器异常

1022020403006	单据已删除

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

