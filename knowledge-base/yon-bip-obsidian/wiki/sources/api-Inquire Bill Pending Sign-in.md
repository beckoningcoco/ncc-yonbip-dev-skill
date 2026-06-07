---
title: "待签收票据查询"
apiId: "2003680085755297796"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Pending Sign-in"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Pending Sign-in]
platform_version: "BIP"
source_type: community-api-docs
---

# 待签收票据查询

> `ContentType	application/json` 请求方式	POST | 分类: Bill Pending Sign-in (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/waitsign/query

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
| accentityCode | string | 否 | 否 | 会计主体编码 示例：A001 |
| accentityName | string | 否 | 否 | 会计主体名称 示例：成都分公司 |
| signType | string | 否 | 否 | 签收类型 1=提示收票待签收，2=背书转让待签收，3=提示付款待签收，6=解质押待签收，7=提示承兑待签收，10=不可转让撤销待签收，12=质押待签收；可多选，以英文逗号隔开,为空查全部 示例：1,2 |
| eleSignAccount | string | 否 | 否 | 电票账号 示例：88888888 |
| noteType | string | 否 | 否 | 票据大类，0=银行汇票，1=商业汇票，2=债权凭证，可多选，以英文逗号隔开，为空查全部 示例：0,1 |
| noteFlag | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 票据介质 1：电子票据 2：纸质票据 示例：1 |
| billTypeName | string | 否 | 否 | 票据类型名称 示例：电子银行承兑汇票 |
| noteNo | string | 否 | 否 | 票据号 示例：558489400055848940005584894212 |
| billRange | string | 否 | 否 | 子票区间 示例：501-1000 |
| invoiceDateStart | date |
| 格式:yyyy-MM-dd | 否 | 否 | 出票日期开始yyyy-MM-dd 示例：2024-01-01 |
| invoiceDateEnd | date |
| 格式:yyyy-MM-dd | 否 | 否 | 出票日期终止yyyy-MM-dd 示例：2024-01-31 |
| endDateStart | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期日期开始yyyy-MM-dd 示例：2024-12-01 |
| endDateEnd | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期日期终止yyyy-MM-dd 示例：2024-12-31 |
| billStatus | string | 否 | 是 | 单据状态 1=待签收未处理、2=待签收处理中、3=待签收已生成、4=已签收未处理、5=已签收已生成、6已签收、7=已拒收、8=已作废 示例：1 |

## 3. 请求示例

Url: /yonbip/ctm/api/waitsign/query?access_token=访问令牌
Body: {
	"accentityCode": "A001",
	"accentityName": "成都分公司",
	"signType": "1,2",
	"eleSignAccount": "88888888",
	"noteType": "0,1",
	"noteFlag": 1,
	"billTypeName": "电子银行承兑汇票",
	"noteNo": "558489400055848940005584894212",
	"billRange": "501-1000",
	"invoiceDateStart": "2024-01-01",
	"invoiceDateEnd": "2024-01-31",
	"endDateStart": "2024-12-01",
	"endDateEnd": "2024-12-31",
	"billStatus": "1"
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
| code | string | 否 | 请求结果 00=查询成功 01=查询失败 示例：00 |
| message | string | 否 | 失败原因 示例：查询成功 |
| data | object | 否 | data |
| recordNum | long | 否 | 本次查询记录数 示例：1 |
| recordList | object | 是 | recordList |

## 5. 正确返回示例

{
	"code": "00",
	"message": "查询成功",
	"data": {
		"recordNum": 1,
		"recordList": [
			{
				"accentityName": "成都分公司",
				"accentityCode": "A001",
				"eleSignAccount": "6666666",
				"noteNo": "558489400055848940005584894212",
				"ifSepFlow": true,
				"billType": "D001",
				"billTypeName": "商业承兑汇票",
				"billRange": "1-50000",
				"noteMoney": 1000,
				"noteType": 0,
				"noteFlag": 1,
				"invoiceDate": "2024-05-01",
				"endDate": "2024-11-23",
				"acceptanceDate": "2024-11-23",
				"lastHoldTicketBankAccName": "无名",
				"lastHoldTicketBankAcc": "10010",
				"lastHoldTicketBankNumber": "30111111111",
				"istransfer": true,
				"invoicerName": "尼卡",
				"invoicerAccount": "N001",
				"invoicerBankName": "中国工商银行股份有限公司北京万柳支行",
				"invoicerBankNo": "102100029531",
				"receiverName": "路飞",
				"receiverAccount": "1000009424",
				"receiverBankName": "中国工商银行股份有限公司北京万柳支行",
				"receiverBankNo": "102100029531",
				"acceptancerName": "路飞",
				"acceptancerAccount": "1000009424",
				"acceptancerBankName": "中国工商银行股份有限公司北京万柳支行",
				"acceptancerBankNo": "102100029531",
				"ecdsStatus": "CS01",
				"contractNo": "HT2024052301",
				"namelistType": "10",
				"returnBill": true,
				"signType": "true",
				"signStatus": "1",
				"billStatus": "1",
				"instructStatus": "1",
				"resultStatus": "1",
				"disableReason": "不做了",
				"extendData": ""
			}
		]
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

