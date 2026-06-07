---
title: "进项发票释放并退回"
apiId: "2149062495345573894"
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

# 进项发票释放并退回

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/bill/release-deposit

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
| nsrsbh | string | 否 | 否 | 纳税人识别号 纳税人识别号、会计主体编码、会计主体id至少填一个 示例：112331233123 |
| orgCode | string | 否 | 否 | 会计主体编码 纳税人识别号、会计主体编码、会计主体id至少填一个 示例：hhswfktest1 |
| orgId | string | 否 | 否 | 会计主体id 纳税人识别号、会计主体编码、会计主体id至少填一个 示例：1233123 |
| userMobileOrEmail | string | 否 | 否 | 用户手机或邮箱 示例：13901234567 |
| userCode | string | 否 | 否 | 用户编码 示例：111 |
| userId | string | 否 | 否 | 用户Id 示例：xxxxx1111 |
| systemCode | string | 否 | 是 | 系统编码 示例：BIP-RBSM |
| dzbs | string | 否 | 否 | 独占标识 1-系统独占 0-非独占 示例：1 |
| items | object | 是 | 是 | 明细 |
| fpDm | string | 否 | 否 | 发票代码 |
| fpHm | string | 否 | 否 | 发票号码 示例：24422000000066269885 |
| billType | string | 否 | 否 | 票据类型 invoice:增值税发票/tolls:过路费/train:火车票/quota:定额发票/machine:机打发票/taxi:出租车发票/passenger:客运发票/air:航空电子行程单/other:其他发票/nontax:非税发票/custbook:海关缴款书/tax_payment_proof:完税证明 示例：invoice |
| jshj | number |
| 小数位数:0,最大长度:15 | 否 | 否 | 占用或释放的价税合计 示例：1403 |
| summaryId | string | 否 | 否 | 摘要id 示例：12313123 |

## 3. 请求示例

Url: /yonbip/tax/api/bill/release-deposit?access_token=访问令牌
Body: {
	"nsrsbh": "112331233123",
	"orgCode": "hhswfktest1",
	"orgId": "1233123",
	"userMobileOrEmail": "13901234567",
	"userCode": "111",
	"userId": "xxxxx1111",
	"systemCode": "BIP-RBSM",
	"dzbs": "1",
	"items": [
		{
			"fpDm": "",
			"fpHm": "24422000000066269885",
			"billType": "invoice",
			"jshj": 1403,
			"summaryId": "12313123"
		}
	]
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
| message | string | 否 | 返回消息 示例：success |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

3021	释放失败	释放失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-19

更新

请求参数 orgCode

更新

请求参数 orgId

进项发票释放并退回增加用户编码接口

2	2025-09-29

更新

请求说明

新增

请求参数 userCode

更新

请求参数 orgCode

更新

请求参数 orgId


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

