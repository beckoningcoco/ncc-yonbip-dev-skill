---
title: "原开票状态查询（废弃）"
apiId: "1cc145c156664c0abac9c26faf0daccd"
apiPath: "请求方式	POST"
method: "ContentType	application/x-www-form-urlencoded"
category: "Invoicing"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing]
platform_version: "BIP"
source_type: community-api-docs
---

# 原开票状态查询（废弃）

> `ContentType	application/x-www-form-urlencoded` 请求方式	POST | 分类: Invoicing (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/invoiceclient-web/api/invoiceApply/queryInvoiceStatus

请求方式	POST

ContentType	application/x-www-form-urlencoded

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| fpqqlsh | string | 否 | 是 | 发票请求流水号 示例：1102202109280012445 |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoiceApply/queryInvoiceStatus?access_token=访问令牌

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
| data | object | 否 | 数据 |
| errmsg | string | 否 | 错误信息 |
| fpqqlsh | string | 否 | 发票请求流水号 示例：1520063275914174464 |
| invoiceDetail | object | 否 | 发票信息 |
| status | string | 否 | 待开票;开票中;开票失败;开票成功 示例：开票成功 |
| statuscode | string | 否 | 1-待开票（需要开票员确认开票）;2-开票中;3-开票失败;4-开票成功 示例：4 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"errmsg": "",
		"fpqqlsh": "1520063275914174464",
		"invoiceDetail": {
			"fpqqlsh": "1520063275914174464",
			"pdf": "JVBERi0xLjMKJcTl7gwoMSAwIG9iago8PAovVHlwZSAvUGFnZQovUGFyZW50IDIgMCBSCi9NZWRpYUJveCBbMCAwIDYzMiA3OTJdCi9Db250ZW50cyAzIDAgUgovRW5jb2RpbmcgL1dpbkFuc2lFbmNvZGluZwo+PgplbmRvYmoKMiAwIG9iago8PAovVHlwZSAvUGFnZXMKL0NvdW50IDEKL0tpZHMgWzMgMCBSXQo+PgplbmRvYmoKMyAwIG9",
			"corpid": "mdhpm1a4",
			"data": {
				"fpqqlsh": "1520063275914174464",
				"fpzt": "1",
				"zdrq": "2022-04-29 00:00:00",
				"kplx": "0",
				"fplx": "3",
				"zsfs": "2",
				"fpDm": "011111111007",
				"fpHm": "03197858",
				"yfpDm": "113134",
				"yfpHm": "42542453",
				"kprq": "20220429233242",
				"xsfMc": "11134444",
				"xsfNsrsbh": "111222333456333",
				"xsfDzdh": "测试地址1 13144445555",
				"xsfYhzh": "测试银行 978667866868",
				"gmfMc": "429查看开差额",
				"gmfNsrsbh": "cd56111331231",
				"gmfDzdh": "海淀区西北旺 212121",
				"gmfYhzh": "北京央行",
				"kpr": "玲娜贝儿",
				"fhr": "李四",
				"skr": "李四",
				"hjje": "11.89",
				"hjse": "0.11",
				"jshj": "12",
				"bz": "N011",
				"zdybz": "备注一些事项",
				"items": [
					{
						"hh": "2492",
						"xmmc": "*谷物*开名稻谷",
						"spbm": "1010101010000000000",
						"ggxh": "开规1开型2",
						"dw": "千克",
						"xmsl": "1",
						"xmdj": "11",
						"xmhsdj": "10",
						"xmje": "11.89",
						"xmjshj": "12",
						"sl": "0.06",
						"se": "0.11",
						"yhzcbs": "0",
						"zxbm": "10",
						"fphxz": "0",
						"kce": "10",
						"lslbs": "1",
						"ysxmmc": "开名稻谷",
						"zkhhh": "0",
						"zzstsgl": "按3%简易征收"
					}
				],
				"bmbBbh": "34.0",
				"fpjz": "1",
				"lylx": "1",
				"lyid": "nh12135431",
				"jqbh": "001",
				"fpMw": "<-<>48938<4+<14>735+<2554*8-1-<+15<*026+848686/2/3//0>+*>>>356*<757/47>90+<25<<3575**934<+15<*026+848686--57",
				"jym": "2123545",
				"accountStatus": "1",
				"aggregate": "true",
				"bred": "N",
				"code": "1265544111",
				"corpId": "mdhpm1a4",
				"creator": "cordkmkm",
				"creatorName": "李四",
				"email": "1464652552@.com",
				"ewm": "01,10,102897054716,23807539,2263.11,20200513,57644233870940613901,E7F0",
				"hzxxbbh": "513266526526",
				"orgId": "100006545",
				"orgName": "用友开票",
				"projectCode": "202",
				"projectId": "1",
				"projectName": "谷物",
				"qdbz": "0",
				"sbbz": "失败原因为税控盘没空票",
				"sgbz": "2",
				"tschbz": "1",
				"tspz": "0",
				"zfbz": "N"
			},
			"sharecode": "f9d49a308143693bb2e7e8b2adaceffd",
			"shareurl": "https://dowrk2/fiel/323131.pdf",
			"fileType": "pdf",
			"pdfurl": "https://d.com/yonbip-fi-taxot/s/downloadPdf?pwd=HP4C&authCode=d6341b2707541db61c2c4ffefc6b01dd&tenantId=um86vloe&fileType=pdf",
			"ofdurl": "https://d.com/yonbip-fi-taxot/s/downloadPdf?pwd=HP4C&authCode=d6341b2707541db61c2c4ffefc6b01dd&tenantId=um86vloe&fileType=ofd",
			"xmlurl": "https://d.com/yonbip-fi-taxot/s/downloadPdf?pwd=HP4C&authCode=d6341b2707541db61c2c4ffefc6b01dd&tenantId=um86vloe&fileType=xml"
		},
		"status": "开票成功",
		"statuscode": "4"
	},
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1002	数据不存在	按照提示代码解决


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-01

新增

返回参数 fpzt

更新

返回参数 (90)

2	2025-07-03

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

