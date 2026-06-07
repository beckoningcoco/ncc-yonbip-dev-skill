---
title: "销项发票数据采集"
apiId: "2126167596661211139"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Outbound Enterprise Invoice Folder"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Outbound Enterprise Invoice Folder]
platform_version: "BIP"
source_type: community-api-docs
---

# 销项发票数据采集

> `ContentType	application/json` 请求方式	POST | 分类: Outbound Enterprise Invoice Folder (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/gather/save-invoices

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
| orgCode | string | 否 | 是 | 开票点编码 示例：0001 |
| nsrsbh | string | 否 | 是 | 销方纳税人识别号 示例：123456789 |
| datas | object | 是 | 否 | 发票数据 |
| invoiceExt | object | 否 | 否 | 表头特殊票种扩展属性 |
| lydjh | string | 否 | 否 | 来源单据号。电子行程单发票该值为13位电子客票号 |
| bz | string | 否 | 否 | 备注 示例：123 |
| fpDm | string | 否 | 否 | 发票代码。数电票可不传发票代码 示例：123456789012 |
| fpHm | string | 否 | 是 | 发票号码 示例：1234567890 |
| fplx | string | 否 | 是 | 发票类型。1：增值税电子普通发票；2：增值税电子专用发票；3：增值税普通发票；4：增值税专用发票 、增值税专用发票(机动车)；5：机动车销售统一发票；8：增值税电子普通发票（成品油）；10：成品油普通发票；11：成品油专用发票；15：二手车销售统一发票；31：数电专用发票；32：数电普通发票；33：数电纸质发票(增值税专用发票)；34：数电纸质发票(普通发票)；35：数电票(航空运输电子客票行程单)；36：数电纸质发票(机动车销售统一发票)； 示例：31 |
| zsfs | string | 否 | 否 | 征收方式。0-普通征税 2-差额征税/差额开票 3-全额开票 示例：0 |
| zfbz | string | 否 | 否 | 作废标志。Y-已作废，N-未作废 示例：N |
| bred | string | 否 | 否 | 红冲标志。Y-已红冲。N-未红冲 示例：N |
| zfrq | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 作废日期 示例：2024-10-10 10:10:10 |
| gmfDzdh | string | 否 | 否 | 购买方地址电话。税控票用。 示例：北京市 134 |
| gmfMc | string | 否 | 是 | 购买方名称 示例：XXX |
| gmfYhzh | string | 否 | 否 | 购买方银行账号 示例：北京银行 1234 |
| gmfNsrsbh | string | 否 | 否 | 购买方纳税人识别号 示例：123AA |
| hjje | number |
| 小数位数:2,最大长度:20 | 否 | 是 | 合计金额 示例：1.11 |
| hjse | number |
| 小数位数:2,最大长度:20 | 否 | 是 | 合计税额 示例：1.11 |
| jqbh | string | 否 | 否 | 税控盘编号。税控票用 示例：66123456 |
| jshj | number |
| 小数位数:2,最大长度:20 | 否 | 是 | 价税合计 示例：1.11 |
| jym | string | 否 | 否 | 校验码。税控票用 示例：WQA |
| kplx | string | 否 | 否 | 开票类型。0.蓝票 1.红票 示例：0 |
| fhr | string | 否 | 否 | 复核人 示例：王五 |
| kpr | string | 否 | 否 | 开票人 示例：王五 |
| skr | string | 否 | 否 | 收款人 示例：王五 |
| kprqDetail | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 是 | 开票日期 示例：2024-10-10 10:10:10 |
| xsfDzdh | string | 否 | 否 | 销售方地址电话。税控票用 示例：XX |
| xsfMc | string | 否 | 是 | 销售方名称 示例：XXX |
| xsfNsrsbh | string | 否 | 是 | 销售方纳税人识别号 示例：ABC |
| xsfYhzh | string | 否 | 否 | 销售方银行账号。税控票用 示例： |
| yfpDm | string | 否 | 否 | 原发票代码 示例：123456789012 |
| yfpHm | string | 否 | 否 | 原发票号码 示例：1234567890 |
| ewm | string | 否 | 否 | 税控票二维码 示例： |
| sgbz | string | 否 | 否 | 收购标志。2-农产品收购 示例：0 |
| tspz | string | 否 | 否 | 特殊票种。0-一般2-燃油增值税专用发票8-农产品销售9-农产品收购11-烟草发票12-机动车发票14-成品油发票DK-代开发票16-矿产品发票E01-成品油发票E02-稀土发票E03-建筑服务发票E04-货物运输E05-不动产销售E06-不动产租赁服务发票E07-代收车船税E09-旅客运输E12-自产农产品销售E14-机动车E16-农产品收购E17-光伏收购E18-卷烟发票E22-电子行程单E32-电子烟(数电票对应的特殊票种为E开头，其他的为税控发票的特殊票种) 示例： |
| srcBillid | string | 否 | 否 | 来源单据id 示例：111 |
| srcBillType | string | 否 | 否 | 来源单据类型id 示例：111 |
| srcBillCode | string | 否 | 否 | 来源单据编码 示例：AA |
| xsfDz | string | 否 | 否 | 数电销售方地址 示例：AAA |
| xsfDh | string | 否 | 否 | 数电销售方电话 示例：123 |
| xsfYh | string | 否 | 否 | 数电销售方银行 示例：北京银行 |
| xsfZh | string | 否 | 否 | 数销售方账号 示例：312233 |
| gmfDz | string | 否 | 否 | 数电购买方地址 示例：AAX |
| gmfDh | string | 否 | 否 | 数电购买方电话 示例：13723333233 |
| gmfYh | string | 否 | 否 | 数电购买方银行 示例：北京银行 |
| gmfZh | string | 否 | 否 | 数电狗购买方账号 示例：31233 |
| sdHm | string | 否 | 否 | 数电纸票的数电号码 示例：3333232323 |
| hzxxbbh | string | 否 | 否 | 红字信息表/确认单编号 示例：123213 |
| items | object | 是 | 否 | 发票明细 |
| cepzs | object | 是 | 否 | 差额凭证号 |
| tspzs | object | 是 | 否 | 特定业务扩展 |
| bdcxsTspzs | object | 是 | 否 | 不动产特定业务 |

## 3. 请求示例

Url: /yonbip/tax/api/gather/save-invoices?access_token=访问令牌
Body: {
	"orgCode": "0001",
	"nsrsbh": "123456789",
	"datas": [
		{
			"invoiceExt": {
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
				"overdueFlag": ""
			},
			"lydjh": "",
			"bz": "123",
			"fpDm": "123456789012",
			"fpHm": "1234567890",
			"fplx": "31",
			"zsfs": "0",
			"zfbz": "N",
			"bred": "N",
			"zfrq": "2024-10-10 10:10:10",
			"gmfDzdh": "北京市 134",
			"gmfMc": "XXX",
			"gmfYhzh": "北京银行 1234",
			"gmfNsrsbh": "123AA",
			"hjje": 1.11,
			"hjse": 1.11,
			"jqbh": "66123456",
			"jshj": 1.11,
			"jym": "WQA",
			"kplx": "0",
			"fhr": "王五",
			"kpr": "王五",
			"skr": "王五",
			"kprqDetail": "2024-10-10 10:10:10",
			"xsfDzdh": "XX",
			"xsfMc": "XXX",
			"xsfNsrsbh": "ABC",
			"xsfYhzh": " ",
			"yfpDm": "123456789012",
			"yfpHm": "1234567890",
			"ewm": " ",
			"sgbz": "0",
			"tspz": " ",
			"srcBillid": "111",
			"srcBillType": "111",
			"srcBillCode": "AA",
			"xsfDz": "AAA",
			"xsfDh": "123",
			"xsfYh": "北京银行",
			"xsfZh": "312233",
			"gmfDz": "AAX",
			"gmfDh": "13723333233",
			"gmfYh": "北京银行",
			"gmfZh": "31233",
			"sdHm": "3333232323",
			"hzxxbbh": "123213",
			"items": [
				{
					"dw": "吨",
					"fphxz": "0",
					"ggxh": "5*5",
					"se": 1,
					"sl": 0.13,
					"xmdj": 0.1,
					"xmje": 1,
					"xmmc": "钻石",
					"xmsl": 1,
					"kce": 1,
					"lslbs": "1",
					"spbm": "1000001",
					"xmjshj": 100,
					"detailMotor": {
						"cd": "浙江省",
						"hgzh": "A1111",
						"jkzmsh": "A11",
						"sjdh": "AOP",
						"fdjhm": "S1111",
						"cjhm": "A1111",
						"dunwei": "15",
						"xcrs": "5",
						"cllx": "小型车",
						"cpxh": "SV1",
						"scqymc": "浙江豪情",
						"sfzhm": "1323333",
						"swjgdm": "1113",
						"swjgmc": "北京市税务局",
						"wspzh": "11233",
						"gfdz": "农贸市场",
						"gfdh": "1322233313",
						"cpzh": "京A1234",
						"djzh": "sss",
						"cgsmc": "XXX",
						"xfdw": "XXX",
						"xfhm": "323333333",
						"xfdz": "XXXXX",
						"xfdh": "13233",
						"jydw": "XXX",
						"jydz": "XXX",
						"jysbh": "XXXX",
						"jyyhzh": "北京银行AA",
						"jydh": "1333323",
						"scmc": "XXXX",
						"scsbh": "AAA",
						"scdz": "XXXX",
						"scyhzh": "XXX",
						"scdh": "132333323",
						"vehicleVersion": "0",
						"jzfwfsd": "XXX",
						"jzxmmc": "XXX",
						"cqzsbh": "12344",
						"gmfsfzjlx": "XXX"
					},
					"yhzcbs": 0,
					"zzstsgl": "按5%简易征收",
					"lymxid": "1",
					"dzsjhh": "1"
				}
			],
			"cepzs": [
				{
					"xh": "1",
					"pzlx": " ",
					"fphm": "1111",
					"fpdm": "1111",
					"zzfphm": "2222",
					"pzhm": "1111",
					"kjrq": "2024-10-10",
					"hjje": 1,
					"kce": 1,
					"bz": "XXX",
					"ly": "手工录入",
					"bckcje": 1,
					"pzhjje": 1
				}
			],
			"tspzs": [
				{
					"carrierCode": "",
					"fareBasis": "",
					"notValidBefore": "",
					"notValidAfter": "",
					"allow": "",
					"itineraryType": "",
					"cxrxh": "1",
					"cxr": "XXXX",
					"cxrzjlxDm": "101",
					"sfzjhm": "1111",
					"chuxrq": "yyyy-MM-dd",
					"cfd": "XXX",
					"lkddd": "XXX",
					"zwdj": "二等座",
					"jtgjlxDm": "1",
					"ysmxxh": "1",
					"qyd": "XX",
					"ddd": "XXX",
					"ysgjzl": "铁路运输",
					"ysgjph": "京A",
					"yshwmc": "XXX",
					"fdjhm": "1231",
					"dphgzbh": "123",
					"sfyytljdj": "N",
					"gtgmf": "XXX"
				}
			],
			"bdcxsTspzs": [
				{
					"cxrxh": "1",
					"bdcdz": "XX省XX市XX县*****",
					"kdsbz": "Y：是；N:否",
					"bdcdwdm": "AAA",
					"wqhtbabh": "京A12345",
					"tdzzsxmbh": "京A12345",
					"hdjsjg": "\"1.2\"",
					"sjcjhsje": "\"1.2\"",
					"mjdw": "公顷",
					"cqzsbh": "京A12345"
				}
			]
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
| message | string | 否 | 操作信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	系统异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-11

新增

请求参数 (19)

更新

请求参数 (8)

删除

请求参数 (18)

调整行程单属性

2	2025-11-21

更新

请求说明

新增

请求参数 (25)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

