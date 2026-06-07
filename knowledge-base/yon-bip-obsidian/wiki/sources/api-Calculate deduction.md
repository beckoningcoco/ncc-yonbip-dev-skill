---
title: "计算抵扣"
apiId: "1970242734567981061"
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

# 计算抵扣

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxit/api/bill-collections/all-calculate-deduct

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
| bills | object | 是 | 是 | 发票信息，最多上传100张发票 |
| invoiceCode | string | 否 | 否 | 票据代码-全电留空（客运发票，电子发票普票，数电发票此字段传空串，必填） 示例：3100111130 |
| invoiceNum | string | 否 | 否 | 票据号码-发票号码（客运发票和电子发票普票必填） 示例：123456 |
| number | string | 否 | 否 | 火车票号码（火车票必填，其他票种不传） 示例：123456 |
| uniqueCode | string | 否 | 否 | 票据代码-航空票唯一码（航空客票必传） 示例：123456 |
| ticketNum | string | 否 | 否 | 票据号码-航空客票号（航空客票选填，其他票种不填） 示例：123456 |
| calculateVerifyPeriod | string | 否 | 是 | 税期yyyyMM 示例：202305 |
| validTax | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 有效税额，范围0-最大票面计算税额 示例：22.43 |
| billType | string | 否 | 是 | 票据类型: invoice-增值税发票|other-其他发票|air-航空客票|train-火车票|passenger-客运车船票|tolls-过路费发票；目前版本只支持invoice/air/train/passenger 示例：invoice |
| mobileOrEmail | string | 否 | 否 | 勾选人在用友账号绑定的手机或邮箱，手机号如：17099989343，邮箱如：zkaer@yonyou.com 示例：17099989343 |
| orgcode | string | 否 | 是 | 税务组织编码(原:会计主体编码，纳税人识别号与税务组织编码至少传入一项) 示例: SWOPENAPI 示例：test |
| nsrsbh | string | 否 | 否 | 纳税人识别号(纳税人识别号与税务组织编码至少传入一项) 示例:SWOPENAPI519354 示例：111111 |
| gxType | string | 否 | 是 | Y|N,Y-代表勾选操作，N-代表取消勾选操作 示例：Y |
| calculateType | string | 否 | 是 | 计算抵扣类型: trans-客运计算抵扣|agri-农产品计算抵扣|highway-高速公路通行费计算抵扣（路桥费）|oneway-一级公路、二级公路、桥、闸通行费（路桥费）；目前版本只支持trans 示例：trans |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxit/api/bill-collections/all-calculate-deduct?access_token=访问令牌
Body: {
	"bills": [
		{
			"invoiceCode": "3100111130",
			"invoiceNum": "123456",
			"number": "123456",
			"uniqueCode": "123456",
			"ticketNum": "123456",
			"calculateVerifyPeriod": "202305",
			"validTax": 22.43
		}
	],
	"billType": "invoice",
	"mobileOrEmail": "17099989343",
	"orgcode": "test",
	"nsrsbh": "111111",
	"gxType": "Y",
	"calculateType": "trans"
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-07

更新

请求参数 orgcode

更新

请求参数 nsrsbh


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

