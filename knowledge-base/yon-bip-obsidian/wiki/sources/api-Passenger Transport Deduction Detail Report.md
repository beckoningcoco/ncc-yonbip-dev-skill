---
title: "旅客运输类计算抵扣明细表"
apiId: "2006448295255736321"
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

# 旅客运输类计算抵扣明细表

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxit/api/calculate-deduct/trans/deduction/detail

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
| period | string | 否 | 是 | 抵扣期间:（yyyyMM） 示例：202301 |
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：112333123123 |
| orgcode | string | 否 | 否 | 税务组织编码(原:会计主体编码)，用于过滤 示例：1233 |
| pagenum | long | 否 | 否 | 页数 示例：1 |
| pagesize | long | 否 | 否 | 当前页数量 示例：50 |
| projectCodes | string | 是 | 否 | 项目编码,来自【数字化建模-基础数据-项目】菜单 示例：["1234"] |
| billType | string | 否 | 否 | 票据类型 增值税-invoice,航空票-air,火车票-train,客运车船票-passenger 示例：invoice 默认值：invoice |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxit/api/calculate-deduct/trans/deduction/detail?access_token=访问令牌
Body: {
	"period": "202301",
	"nsrsbh": "112333123123",
	"orgcode": "1233",
	"pagenum": 1,
	"pagesize": 50,
	"projectCodes": [
		"1234"
	],
	"billType": "invoice"
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
| data | object | 否 | 数据 |
| items | object | 是 | 数据 |
| totalNum | long | 否 | 总数量 示例：1286 |
| pageSize | number |
| 小数位数:0,最大长度:11 | 否 | 页容量 示例：50 |
| totalPage | number |
| 小数位数:0,最大长度:11 | 否 | 总页数 示例：10 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"items": [
			{
				"je": 175.47,
				"se": 10.53,
				"trainvo": {
					"ticketNum": "",
					"date": "2024-01-01",
					"origin": "成都",
					"destination": "北京",
					"name": "小王子",
					"trainNum": "BN-0001"
				},
				"calculateVerifyStatus": "4",
				"yxse": 0,
				"calculateDeductionTime": "2024-01-01 01:00:19",
				"calculateVerifyPeriod": "202401",
				"airvo": {
					"ticketNum": "xxxx",
					"date": "2024-01-01",
					"userName": "小王子"
				},
				"billType": "air",
				"passengervo": {
					"invoiceCode": "8888888812",
					"invoiceNum": "44444444",
					"date": "2024-01-01",
					"entrance": "北京",
					"exit": "上海",
					"name": "小王子"
				},
				"einvoicevo": {
					"fpDm": "8888888812",
					"fpHm": "44444444",
					"kprq": "2024-01-01",
					"xsfMc": "中国黄金所",
					"xsfNsrsbh": "7888888999999P",
					"fpzt": "0"
				}
			}
		],
		"totalNum": 1286,
		"pageSize": 50,
		"totalPage": 10
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	系统发生异常错误，请联系管理员查看日志


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-07

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

