---
title: "台账记账"
apiId: "1758654890174316553"
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

# 台账记账

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/bill-collections/account

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
| nsrsbh | string | 否 | 否 | 纳税人识别号（纳税人识别号和税务组织编码至少传入一项） 示例：1122555522 |
| orgcode | string | 否 | 否 | 税务组织编码（纳税人识别号和税务组织编码至少传入一项） 示例：156625 |
| bills | object | 是 | 是 | 单据 |
| voucherid | string | 否 | 否 | 凭证号 示例：355255 |
| accountNote | string | 否 | 否 | 记账备注 示例：备注信息 |
| accountUser | string | 否 | 否 | 记账人 示例：张三 |
| accountTime | string | 否 | 否 | 记账日期 "yyyy-MM-dd hh:mm:ss" 示例：2023-02-01 20:20:20 |
| accountPeriod | string | 否 | 否 | 记账会计期间 yyyyMM 示例：202009 |
| invoiceCode | string | 否 | 否 | 票据代码 ('来源单据类型+业务单据号'与'代码+号码'必填其中一对) 示例：022002000111 |
| invoiceNum | string | 否 | 否 | 票据号码 ('来源单据类型+业务单据号'与'代码+号码'必填其中一对) 示例：56014466 |
| billType | string | 否 | 否 | 票据类型 invoice:增值税发票/tolls:过路费/train:火车票/quota:定额发票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票/nontax:非税发票/custbook:海关缴款书，invoiceNum非空时必填 示例：invoice |
| accountSubject | string | 否 | 否 | 记账科目 示例：123 |
| accountCreditMoney | double | 否 | 否 | 贷方金额 示例：123 |
| accountDebitMoney | double | 否 | 否 | 借方金额 示例：123 |
| srcBillType | string | 否 | 否 | 来源单据类型('来源单据类型+业务单据号'、'代码+号码'必填其中一对) 示例：123 |
| srcBillCode | string | 否 | 否 | 来源单据号('来源单据类型+业务单据号'、'代码+号码'必填其中一对) 示例：123 |
| accountBook | string | 否 | 否 | 账套 示例：123 |
| checkallerror | string | 否 | 否 | 是否检查所有的票据问题 0：遇到问题就返回 ；1：遇到问题后，再检查所有票据问题后再返回全部错误信息 示例：0 默认值：0 |
| linkReimburse | string | 否 | 否 | 是否关联报账状态（Y | N） 示例：N 默认值：Y |
| free | object | 否 | 否 | 特征 示例：{"test":"test"} |

## 3. 请求示例

Url: /yonbip/tax/api/bill-collections/account?access_token=访问令牌
Body: {
	"nsrsbh": "1122555522",
	"orgcode": "156625",
	"bills": [
		{
			"voucherid": "355255",
			"accountNote": "备注信息",
			"accountUser": "张三",
			"accountTime": "2023-02-01 20:20:20",
			"accountPeriod": "202009",
			"invoiceCode": "022002000111",
			"invoiceNum": "56014466",
			"billType": "invoice",
			"accountSubject": "123",
			"accountCreditMoney": 123,
			"accountDebitMoney": 123,
			"srcBillType": "123",
			"srcBillCode": "123",
			"accountBook": "123"
		}
	],
	"checkallerror": "0",
	"linkReimburse": "N",
	"free": {
		"test": "test"
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
| message | string | 否 | 信息说明 示例：操作成功 |
| datas | object | 是 | 发票详情 |
| code | string | 否 | 状态码 示例：9999 |
| errmsg | string | 否 | 错误信息 示例：记账失败,发票台账不存在!发票代码:,发票号码:3333 |
| invoiceCode | string | 否 | 发票代码 示例：123 |
| invoiceNum | string | 否 | 发票号码 示例：123 |
| billType | string | 否 | 发票类型 示例：invoice |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"datas": [
		{
			"code": "9999",
			"errmsg": "记账失败,发票台账不存在!发票代码:,发票号码:3333",
			"invoiceCode": "123",
			"invoiceNum": "123",
			"billType": "invoice"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	记账失败，部分发票数据问题，请查看错误明细!	返回失败错误编码

1001	单据信息{bills}不能为空	返回失败错误编码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-11

更新

返回参数 datas

返回体插件配置

2	2025-10-22

新增

返回参数 (6)

修改返回值

3	2025-09-29

更新

请求说明

更新

请求参数 nsrsbh

更新

请求参数 orgcode

更新

请求参数 checkallerror

4	2025-07-03

更新

请求参数 srcBillType

更新

请求参数 srcBillCode

删除

请求参数 srcBillid


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

