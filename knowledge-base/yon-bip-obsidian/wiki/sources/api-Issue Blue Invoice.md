---
title: "开蓝票"
apiId: "2150785412886953993"
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

# 开蓝票

> `ContentType	application/json` 请求方式	POST | 分类: Invoicing (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/invoiceclient-web/api/invoiceApply/insertWithJsonArray

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
| emailConfigList | object | 是 | 否 | 邮箱交付信息 |
| smsConfigList | object | 是 | 否 | 短信交付信息 |
| urlConfigList | object | 是 | 否 | url交付信息 |
| auditReturnConfigs | object | 是 | 否 | 退回地址信息 |
| autoAudit | boolean | 否 | 否 | 自动审核，即不需要人工在发票平台确认开票，直接进行开票 false:不自动审核，即需要人工确认如果不传，代表true |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoiceApply/insertWithJsonArray?access_token=访问令牌
Body: {
	"data": {
		"einvoiceApplyList": [
			{
				"orgcode": "",
				"lyid": "",
				"fpqqlsh": "",
				"fplx": "32",
				"sdLc": "",
				"tspz": "",
				"zsfs": "",
				"xsfNsrsbh": "",
				"xsfMc": "",
				"xsfDzdh": "北京市XX 83869965",
				"xsfDz": "北京市XX",
				"xsfDh": "83869965",
				"xsfYh": "招商银行",
				"xsfZh": "9645555111254",
				"gmfNsrsbh": "",
				"gmfMc": "",
				"gmfDzdh": "",
				"gmfYhzh": "",
				"gmfDz": "北京市XX",
				"gmfDh": "01055587444",
				"gmfYh": "招商银行",
				"gmfZh": "596874512",
				"zrrbs": "Y",
				"zjlx": "101",
				"zjhm": "123123123",
				"guoji": "004",
				"einvoiceShowGxfYhZh": "0",
				"einvoiceShowSkrShr": "0",
				"einvoiceShowGxfDzDh": "0",
				"dfgtgmbz": "Y",
				"kpr": "",
				"skr": "",
				"fhr": "",
				"hjje": 0,
				"hjse": 0,
				"jshj": 0,
				"bz": "",
				"allElcUserName": "AA#@#",
				"allElcPassWord": "ERCFCAC",
				"slsm": "",
				"zdybz": "",
				"projectCode": "",
				"acountOrgCode": "",
				"wbsCode": "",
				"lydjh": "",
				"bmbBbh": "",
				"wxorderid": "",
				"wxappid": "",
				"wxauthid": "",
				"sgbz": "",
				"cpyqylb": "",
				"tdzzsxmbh": "",
				"kdsbz": "",
				"kqysssxbgglbm": "",
				"administrativeDivisionCode": "440105",
				"subdistrictCode": "440105001",
				"isTaxProfessionalServiceInvoiceItem": "Y",
				"taxProServiceAgreementNo": "",
				"jazs": "05",
				"qyDm": "",
				"ylywlsh": "",
				"hzxm": "",
				"hzsfzjlxDm": "",
				"hzsfzjhm": "",
				"mzh": "",
				"mzjzsj": "2026-04-29 11:29:18",
				"blh": "",
				"zyh": "",
				"zykb": "",
				"zysjq": "2026-06-07",
				"zysjz": "2026-06-07",
				"yjje": 0,
				"bjje": 0,
				"tfje": 0,
				"yljglxDm": "",
				"qtyljglx": "",
				"yblxDm": "",
				"qtyblx": "",
				"ybbh": "",
				"xbDm": "",
				"ybtcjjzfje": 0,
				"qtzfje": 0,
				"grzhzfje": 0,
				"grxjzfje": 0,
				"grzfje": 0,
				"grzfje1": 0,
				"jkr": "",
				"skdw": "",
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
						"chuxrq": "2022-02-22",
						"cxrzjlxDm": "",
						"sfzjhm": "",
						"cfd": "",
						"lkddd": "",
						"zwdj": "",
						"jtgjlxDm": "",
						"sszdyysxh": "",
						"sszdyysmc": "",
						"sszdyysnr": ""
					}
				],
				"bdcxsTspzs": [
					{
						"tdzzsxmbh": "",
						"bdcdz": "XX省XX市XX县XX街",
						"zlqq": "2023-03-22 12:12:12",
						"zlqz": "2023-03-22 12:12:12",
						"kdsbz": "",
						"cxrxh": "",
						"cqzsbh": "",
						"mjdw": "",
						"cph": "",
						"xh": "",
						"fymx": "",
						"xmsl": 0,
						"dw": "",
						"je": 0,
						"sl": 0,
						"se": 0,
						"ylfwgbm": "",
						"bz": ""
					}
				],
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
				"mqkfrl": "",
				"gjql": "",
				"gzwhjhff": "",
				"ticketNumber": "",
				"buyerType": "",
				"fareAmount": "",
				"orderNumber": "",
				"userName": "",
				"gpCode": "",
				"passengerName": "",
				"passengerIdnum": "",
				"endorsements": "",
				"office": "",
				"issuedBy": "",
				"iata": "",
				"pnr": "",
				"ticketInformation": "",
				"insurance": "",
				"electronicTicketType": "",
				"verifyCode": "",
				"overdueFlag": "",
				"lylx": "",
				"define": "{            \"特征key\":\"特征值示例 选填\"     },",
				"items": [
					{
						"hh": "",
						"zkhhh": "",
						"fphxz": "",
						"xmbm": "",
						"xmmc": "",
						"spbm": "",
						"ggxh": "",
						"dw": "",
						"xmsl": "",
						"xmdj": "",
						"xmhsdj": "",
						"xmje": 0,
						"xmjshj": 0,
						"sl": "",
						"se": "",
						"kce": "",
						"zxbm": "",
						"yhzcbs": "",
						"lslbs": "",
						"zzstsgl": "",
						"detailMotor": {
							"cqzsbh": "",
							"jzfwfsd": "",
							"jzxmmc": "",
							"cd": "",
							"cjhm": "",
							"cllx": "",
							"cpxh": "",
							"scqymc": "",
							"sfzhm": "",
							"hgzh": "",
							"jkzmsh": "",
							"sjdh": "",
							"fdjhm": "",
							"dunwei": "",
							"xcrs": "",
							"jdctzclsbdhuuid": "",
							"wspzhm": "",
							"xfdw": "",
							"xfhm": "",
							"xfdz": "",
							"xfdh": "",
							"cpzh": "",
							"djzh": "",
							"cgsmc": "",
							"gfdz": "",
							"gfdh": "",
							"saleNaturalPersonId": "",
							"saleNationalityCode": "",
							"saleIdType": "",
							"saleIdNumber": "",
							"mtzldm": "",
							"mtzldmxy": "",
							"fymx": "",
							"ylfwgbm": "",
							"qt": "",
							"bz": ""
						},
						"define": {
							"特征key": "特征值示例 选填"
						}
					}
				]
			}
		],
		"emailConfigList": [
			{
				"fpqqlsh": "",
				"address": ""
			}
		],
		"smsConfigList": [
			{
				"fpqqlsh": "",
				"address": ""
			}
		],
		"urlConfigList": [
			{
				"fpqqlsh": "",
				"url": ""
			}
		],
		"auditReturnConfigs": [
			{
				"fpqqlsh": "",
				"url": ""
			}
		],
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
| data | object | 否 | 响应信息 |
| message | string | 否 | 信息说明 示例：success |

## 5. 正确返回示例

{
	"code": "200",
	"data": {},
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

新增

请求参数 (50)

更新

请求参数 (161)

2	2026-01-09

新增

请求参数 (37)

更新

请求参数 (17)

删除

请求参数 (17)

3	2025-09-23

新增

请求参数 (58)

更新

请求参数 (24)

更新

返回参数 data

重新发布

4	2025-07-28

新增

请求参数 (12)

删除

请求参数 (12)

调整回调参数值。

5	2025-07-08

新增

请求参数 (5)

更新

请求参数 (11)

上线


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

