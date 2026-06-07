---
title: "凭证号更新"
apiId: "1758724923911045128"
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

# 凭证号更新

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/bill-collections/update-voucherid

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
| nsrsbh | string | 否 | 否 | 纳税人识别号（纳税人识别号和税务组织编码至少传入一项） 示例：123123123123 |
| orgcode | string | 否 | 否 | 税务组织编码（纳税人识别号和税务组织编码至少传入一项） 示例：test |
| bills | object | 是 | 是 | 待更新列表，不可为空 |
| billType | string | 否 | 是 | 票据类型 invoice:增值税发票/tolls:过路费/train:火车票/quota:定额发票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票/nontax:非税发票/custbook:海关缴款书 示例：other |
| voucherid | string | 否 | 否 | 凭证号(长度不能超过1000) 示例：ceshi |
| invoiceNum | string | 否 | 否 | 发票号码（invoiceNum/invoiceCode 必须一起出现 ， 且 "代码+号码" 与 "来源类型+来源单据号" 两对必须出现一对，同时出现以 "代码+号码“为准） 示例：051696 |
| invoiceCode | string | 否 | 否 | 发票代码（若存在发票代买，invoiceNum/invoiceCode 必须一起出现 ， 且 "代码+号码" 与 "来源类型+来源单据号" 两对必须出现一对，同时出现以 "代码+号码“为准） 示例：A10906246428 |
| srcBillType | string | 否 | 否 | 来源类型（非枚举，srcBillType/srcBillCode 必须一起出现 ， 且 "代码+号码" 与 "来源类型+来源单据号" 两对必须出现一对，同时出现以 "代码+号码"为准） 示例：tims-server |
| srcBillCode | string | 否 | 否 | 来源单据号（srcBillType/srcBillCode 必须一起出现 ， 且 "代码+号码" 与 "来源类型+来源单据号" 两对必须出现一对，同时出现以 "代码+号码"为准） 示例：BX1905260023 |
| accountSubject | string | 否 | 否 | 记账科目(长度不能超过50) 示例：123 |
| accountDebitMoney | double | 否 | 否 | 借方金额(支持13位整数，2位小数) 示例：66.66 |
| accountCreditMoney | double | 否 | 否 | 贷方金额(支持13位整数，2位小数) 示例：88.88 |
| accountUser | string | 否 | 否 | 记账人(长度不能超过50) 示例：张三 |
| accountNote | string | 否 | 否 | 记账备注(不能超过1500) 示例：aaaaa |
| accountTime | string | 否 | 否 | 记账日期 "yyyy-MM-dd hh:mm:ss" 示例：2023-02-01 20:20:20 |
| accountPeriod | string | 否 | 否 | 记账会计期间 yyyyMM 示例：202312 |
| accountBook | string | 否 | 否 | 账套(不能超过50位) 示例：111 |
| linkReimburse | string | 否 | 否 | 是否关联报账状态(Y | N) 示例：N 默认值：Y |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/bill-collections/update-voucherid?access_token=访问令牌
Body: {
	"nsrsbh": "123123123123",
	"orgcode": "test",
	"bills": [
		{
			"billType": "other",
			"voucherid": "ceshi",
			"invoiceNum": "051696",
			"invoiceCode": "A10906246428",
			"srcBillType": "tims-server",
			"srcBillCode": "BX1905260023",
			"accountSubject": "123",
			"accountDebitMoney": 66.66,
			"accountCreditMoney": 88.88,
			"accountUser": "张三",
			"accountNote": "aaaaa",
			"accountTime": "2023-02-01 20:20:20",
			"accountPeriod": "202312",
			"accountBook": "111"
		}
	],
	"linkReimburse": "N"
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-29

更新

请求说明

更新

请求参数 nsrsbh

更新

请求参数 orgcode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

