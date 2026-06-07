---
title: "查验并保存-采购"
apiId: "234bd7e3406746e4b97a364599762d08"
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

# 查验并保存-采购

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/invoiceclient-web/api/purchase-collection/verify_and_submit

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
| orgCode | string | 否 | 否 | 税务组织编码（纳税人识别号和税务组织编码至少传入一项） 示例：org111 |
| nsrsbh | string | 否 | 否 | 纳税人识别号（纳税人识别号和税务组织编码至少传入一项） 示例：11233312333 |
| submitter | string | 否 | 是 | 提交人 示例：ll |
| invoices | object | 是 | 否 | 发票信息 |
| fpHm | string | 否 | 是 | 发票号码 示例：1122121 |
| fpDm | string | 否 | 否 | 发票代码 有发票代码时必填 示例：123123123 |
| kprq | string | 否 | 是 | 开票日期 yyyyMMdd 示例：20230101 |
| hjje | BigDecimal | 否 | 是 | 合计金额 示例：11 |
| jshj | BigDecimal | 否 | 否 | 价税合计 全电发票必填 示例：11 |
| srcapp | string | 否 | 否 | 来源应用 示例：xx应用 |
| srcBillType | string | 否 | 否 | 来源业务系统 示例：xx系统 |
| srcBillCode | string | 否 | 否 | 业务系统单据号 示例：xxyyzz |
| jym | string | 否 | 否 | 校验码 有校验码时必填 示例：111111 |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/purchase-collection/verify_and_submit?access_token=访问令牌
Body: {
	"orgCode": "org111",
	"nsrsbh": "11233312333",
	"submitter": "ll",
	"invoices": [
		{
			"fpHm": "1122121",
			"fpDm": "123123123",
			"kprq": "20230101",
			"hjje": 11,
			"jshj": 11,
			"srcapp": "xx应用",
			"srcBillType": "xx系统",
			"srcBillCode": "xxyyzz",
			"jym": "111111"
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
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 数据 |
| code | string | 否 | 状态码 示例：3001 |
| msg | string | 否 | 提示信息 示例：发票已经存在,发票代码:330xxxx,发票号码:100xxx的状态为报销中! |
| fpDm | string | 否 | 发票代码 示例：330xxxx |
| fpHm | string | 否 | 发票号码 示例：100xxx |
| invoice | object | 否 | 发票信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"code": "3001",
			"msg": "发票已经存在,发票代码:330xxxx,发票号码:100xxx的状态为报销中!",
			"fpDm": "330xxxx",
			"fpHm": "100xxx",
			"invoice": {
				"bz": "备注",
				"fhr": "ll",
				"fpDm": "330xxxx",
				"fpHm": "100xxx",
				"fplx": "4",
				"fpjz": "1",
				"zfbz": "N",
				"gmfDzdh": "北京 11xxx",
				"gmfMc": "购买方名称",
				"gmfNsrsbh": "11xxx",
				"gmfYhzh": "中国工商银行11xxx",
				"hjje": 1419273.96,
				"hjse": 241276.57,
				"jqbh": "6615xxxxx",
				"jshj": 1660550.53,
				"jym": "5277xxxxx",
				"kpr": "ll",
				"kprq": "20171026",
				"skr": "ll",
				"xsfDzdh": "浙江 11111",
				"xsfMc": "浙江",
				"xsfNsrsbh": "12345",
				"xsfYhzh": "工商银行40002993",
				"submitter": "提交人",
				"hasExist": false,
				"items": [
					{
						"dw": "千瓦时",
						"ggxh": "ll",
						"se": 241276.57,
						"sl": 17,
						"xmdj": 0.755811788209566,
						"xmje": 1419273.96,
						"xmmc": "电力",
						"xmsl": 1877814,
						"xmjshj": "11234"
					}
				]
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	根据返回值处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-10

更新

请求说明

更新

请求参数 orgCode

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

