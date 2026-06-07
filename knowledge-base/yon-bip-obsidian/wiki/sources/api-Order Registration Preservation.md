---
title: "到单登记保存"
apiId: "1867792105092939783"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Received Document Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Received Document Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 到单登记保存

> `ContentType	application/json` 请求方式	POST | 分类: Received Document Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/arrivebill/receive

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
| accentity | string | 否 | 是 | 资金组织id |
| letterCreditCode | string | 否 | 是 | 信用证id |
| billNum | string | 否 | 是 | 到单编号 |
| billType | int | 否 | 是 | 到单类型；枚举值：1-全部到单、2-部分到单； 信用证参数是否分批="否"时，只能为"全部到单" |
| paymentStatus | int | 否 | 是 | 付款状态；枚举值：1-未付款、2-在付款、3-已付款 |
| vouchdate | Date | 否 | 是 | 到单日期 |
| arriveCurrency | string | 否 | 是 | 到单币种id |
| thisCumArriveBillAmt | BigDecimal | 否 | 是 | 到单金额 |
| billReceiver | string | 否 | 否 | 到单签收人id |
| confirmCommitmentDate | Date | 否 | 是 | 最迟承兑/付款确认日期 |
| isInconsistent | boolean | 否 | 是 | 存在不符；false、true 默认值：false |
| inconsistentMsg | string | 否 | 否 | 不符点 |
| goodsDescribe | string | 否 | 否 | 货物/服务描述 |
| remarks | string | 否 | 否 | 备注 |
| billHandleType | int | 否 | 否 | 到单处理方式；枚举值：1-融资、2-拒付、3-付款 |
| latestPayDate | Date | 否 | 否 | 最迟付款日期 |
| arrivalBillCommitmentAmt | BigDecimal | 否 | 否 | 到单承付金额 |

## 3. 请求示例

Url: /yonbip/ctm/arrivebill/receive?access_token=访问令牌
Body: {
	"accentity": "",
	"letterCreditCode": "",
	"billNum": "",
	"billType": 0,
	"paymentStatus": 0,
	"vouchdate": "",
	"arriveCurrency": "",
	"thisCumArriveBillAmt": 0,
	"billReceiver": "",
	"confirmCommitmentDate": "",
	"isInconsistent": true,
	"inconsistentMsg": "",
	"goodsDescribe": "",
	"remarks": "",
	"billHandleType": 0,
	"latestPayDate": "",
	"arrivalBillCommitmentAmt": 0
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 描述信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| code | string | 否 | 单据编号 示例：DD1122323 |
| id | long | 否 | 单据id 示例：123456789111 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "DD1122323",
		"id": 123456789111
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

