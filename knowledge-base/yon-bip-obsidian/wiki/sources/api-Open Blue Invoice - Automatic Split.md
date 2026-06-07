---
title: "开蓝票-自动拆分"
apiId: "2157981055053201413"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing]
platform_version: "BIP"
source_type: community-api-docs
---

# 开蓝票-自动拆分

> `ContentType	application/json` 请求方式	POST | 分类: Invoicing (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/invoiceclient-web/api/invoiceApply/insertWithSplitJson

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 参数体 |
| einvoiceApplyList | object | 是 | 否 | 开票请求体(重要：：此请求体是增值税基础票种的请求体，特殊票种的请求体参考请求示例中的内容) |
| email | object | 否 | 否 | 邮箱交付信息 |
| sms | object | 否 | 否 | 短信交付信息 |
| url | object | 否 | 否 | url交付信息 |
| delurl | object | 否 | 否 | 退回地址信息 |
| autoAudit | boolean | 否 | 否 | 自动审核，即不需要人工在发票平台确认开票，直接进行开票 false:不自动审核，即需要人工确认如果不传，代表true |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoiceApply/insertWithSplitJson?access_token=访问令牌
Body: {
	"data": {
		"einvoiceApplyList": [
			{
				"fpqqlsh": "",
				"fplx": "",
				"xsfNsrsbh": "",
				"xsfMc": "",
				"gmfDzdh": "",
				"gmfYhzh": "",
				"kpr": "",
				"skr": "",
				"fhr": "",
				"jshj": "",
				"hjje": "",
				"hjse": "",
				"bz": "",
				"bmbBbh": "",
				"orgcode": "",
				"wxorderid": "",
				"wxappid": "",
				"wxauthid": "",
				"zdybz": "",
				"define": "{            \"特征key\":\"特征值示例 选填\"     },",
				"xsfDz": "",
				"xsfDh": "",
				"xsfYh": "",
				"xsfZh": "",
				"gmfNsrsbh": "",
				"gmfDz": "",
				"gmfDh": "",
				"gmfYh": "",
				"gmfZh": "",
				"gmfMc": "",
				"lyid": "",
				"lydjh": "",
				"tspz": "",
				"administrativeDivisionCode": "",
				"subdistrictCode": "",
				"isTaxProfessionalServiceInvoiceItem": "",
				"taxProServiceAgreementNo": "",
				"jazs": "",
				"lylx": "",
				"cepzs": [
					{
						"xh": "",
						"pzlx": "",
						"fphm": "",
						"fpdm": "",
						"zzfphm": "",
						"pzhm": "",
						"kjrq": "",
						"hjje": "",
						"kce": "",
						"bz": "",
						"ly": "",
						"bckcje": 0,
						"pzhjje": 0
					}
				],
				"tspzs": [
					{
						"ysmxxh": "",
						"ysgjzl": "",
						"ysgjph": "",
						"qyd": "",
						"ddd": "",
						"yshwmc": "",
						"cxrxh": "",
						"cxr": "",
						"chuxrq": "",
						"cxrzjlxDm": "",
						"sfzjhm": "",
						"cfd": "",
						"lkddd": "",
						"zwdj": "",
						"jtgjlxDm": ""
					}
				],
				"items": [
					{
						"fphxz": "",
						"xmmc": "",
						"xmbm": "",
						"ggxh": "",
						"dw": "",
						"xmsl": "",
						"xmhsdj": "",
						"xmdj": "",
						"xmje": "",
						"xmjshj": "",
						"sl": "",
						"se": "",
						"hh": "",
						"zkhhh": "",
						"spbm": "",
						"zxbm": "",
						"yhzcbs": "",
						"lslbs": "",
						"zzstsgl": "",
						"kce": "",
						"define": {
							"特征key": "特征值示例 选填"
						},
						"detailMotor": {
							"cqzsbh": "",
							"jzfwfsd": "",
							"jzxmmc": ""
						}
					}
				]
			}
		],
		"email": {
			"fpqqlsh": "",
			"address": ""
		},
		"sms": {
			"fpqqlsh": "",
			"address": ""
		},
		"url": {
			"fpqqlsh": "",
			"url": ""
		},
		"delurl": {
			"fpqqlsh": "",
			"url": ""
		},
		"autoAudit": true
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回值编码 示例：200 |
| datas | string | 否 | 响应信息 示例：操作成功 |
| message | string | 否 | 信息说明 示例：success |

## 5. 正确返回示例

{
	"code": "200",
	"datas": "操作成功",
	"message": "success"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	数据不存在

9999	数据不合法	该返回错误码有多个信息。例如：纳税人识别号为111222333456333的纳税主体未启用增值税电子普通发票,该功能暂不可使用


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-11

更新

请求说明

新增

请求参数 (6)

更新

请求参数 (102)

2	2026-01-09

更新

请求参数 (7)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

