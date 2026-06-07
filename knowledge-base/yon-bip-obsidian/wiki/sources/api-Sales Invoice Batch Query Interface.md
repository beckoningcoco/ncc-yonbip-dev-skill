---
title: "销项发票批量查询接口"
apiId: "1860933016558764033"
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

# 销项发票批量查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Outbound Enterprise Invoice Folder (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/invoiceclient-web/api/saleInvoiceCollection/query

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
| orgCode | string | 否 | 否 | 开票点编码，去开票点档案中查询 示例：123xxx |
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：321xxxxx |
| fpHm | string | 否 | 否 | 税控发票与数电电子发票的发票号码 示例：12345678 |
| fpDm | string | 否 | 否 | 税控发票或数电纸质发票的发票代码 示例：1234567812 |
| sdHm | string | 否 | 否 | 由于数电纸票存在发票号码、发票代码、与数电发票号码，此栏位特指数电纸质发票的数电发票号码 示例：23442000000087225540 |
| fplx | string | 否 | 否 | 发票类型：发票类型：1：增值税电子普通发票；2：增值税电子专用发票；3：增值税普通发票；4：增值税专用发票 ；5：机动车销售统一发票；8：增值税电子普通发票（成品油）；10：成品油普通发票；11：成品油专用发票；15：二手车销售统一发票；31：数电专用发票；32：数电普通发票；33：数电纸质发票(增值税专用发票)；34：数电纸质发票(普通发票)； 选填 默认为1 示例：1 |
| kplx | string | 否 | 否 | 开票类型；0:蓝字发票；1:红字发票 示例：0 |
| zfbz | string | 否 | 否 | 作废标志；N:未作废；Y:已作废 示例：N |
| bred | string | 否 | 否 | 红冲标志；Y:已红冲；N:未红冲 示例：N |
| gmfNsrsbh | string | 否 | 否 | 购买方纳税人识别号 示例：1231315664 |
| xsfNsrsbh | string | 否 | 否 | 销售方纳税人识别号 示例：1212132313289 |
| kprq_begin | string | 否 | 否 | 开票日期-起始；yyyy-MM-dd 示例：2019-01-01 |
| kprq_end | string | 否 | 否 | 开票日期-结束；yyyy-MM-dd 示例：2019-01-01 |
| gather_begin | string | 否 | 否 | 采集日期-起始；yyyy-MM-dd 示例：2019-01-01 |
| gather_end | string | 否 | 否 | 采集日期-结束；yyyy-MM-dd 示例：2019-01-01 |
| page | int | 否 | 是 | 分页数据页码 示例：1 |
| size | int | 否 | 是 | 每页数据量 示例：5 |
| srcType | string | 否 | 否 | 数据来源(平台-10 税盘-20 excel导入-30 税局-40) 示例：10 |
| zsfs | string | 否 | 否 | 征税方式(普通征税-0 差额征税/差额开票-2 全额开票-3) |
| tspz | string | 否 | 否 | 特殊业务类型(0-一般; 2-燃油增值税专用发票; 8-农产品销售; 9-农产品收购; 11-烟草发票; 12-机动车发票; 14-成品油发票; DK-代开发票; 16-矿产品发票; E01-成品油发票; E02-稀土发票; E03-建筑服务发票; E04-货物运输 ;E05-不动产销售 ;E06-不动产租赁服务发票; E07-代收车船税; E09-旅客运输; E12-自产农产品销售; E14-机动车; E16-农产品收购; E17-光伏收购; E18-卷烟发票; E22-电子行程单; E32-电子烟) |
| projectCodes | string | 是 | 否 | 项目编码 |
| finOrgCodes | string | 是 | 否 | 会计主体编码 |
| noDetail | string | 否 | 否 | 是否返回明细。Y：不返回明细。不传或其他：返回明细 示例：Y |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/saleInvoiceCollection/query?access_token=访问令牌
Body: {
	"orgCode": "123xxx",
	"nsrsbh": "321xxxxx",
	"fpHm": "12345678",
	"fpDm": "1234567812",
	"sdHm": "23442000000087225540",
	"fplx": "1",
	"kplx": "0",
	"zfbz": "N",
	"bred": "N",
	"gmfNsrsbh": "1231315664",
	"xsfNsrsbh": "1212132313289",
	"kprq_begin": "2019-01-01",
	"kprq_end": "2019-01-01",
	"gather_begin": "2019-01-01",
	"gather_end": "2019-01-01",
	"page": 1,
	"size": 5,
	"srcType": "10",
	"zsfs": "",
	"tspz": "",
	"projectCodes": [
		""
	],
	"finOrgCodes": [
		""
	],
	"noDetail": "Y"
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
| data | object | 是 | 返回数据 |
| fpqqlsh | string | 否 | 发票请求流水号 示例：1235211020202 |
| orgId | string | 否 | 组织id，对应开票点档案中开票点主键id 示例：21313521321231 |
| lydjh | string | 否 | 业务来源单据号 示例：4513545613132 |
| fpHm | string | 否 | 税控发票与数电电子发票的发票号码 示例：04208969 |
| fpDm | string | 否 | 税控发票或数电纸质发票的发票代码 示例：1100163130 |
| sdHm | string | 否 | 数电纸票数电发票号码 示例：23442000000087225540 |
| kprq | string | 否 | 开票日期 yyyy-MM-dd 示例：2017-07-31 |
| fpMw | string | 否 | 发票密文 示例：15<*026+848686 |
| jym | string | 否 | 校验码 示例：57644233870940613901 |
| fplx | string | 否 | 发票类型：1：增值税电子普通发票；2：增值税电子专用发票；3：增值税普通发票；4：增值税专用发票 ；5：机动车销售统一发票；8：增值税电子普通发票（成品油）；10：成品油普通发票；11：成品油专用发票；15：二手车销售统一发票；31：数电专用发票；32：数电普通发票；33：数电纸质发票(增值税专用发票)；34：数电纸质发票(普通发票)； 示例：4 |
| kplx | string | 否 | 开票类型； 0：蓝票，1：红票 示例：0 |
| xsfMc | string | 否 | 销售方名称 示例：用友能源科技有限公司 |
| xsfNsrsbh | string | 否 | 销售方纳税人识别号 示例：9111010834431437XQ |
| xsfDzdh | string | 否 | 销售方地址电话 示例：北京市海淀区北清路68号院20号楼2层201房间 82020955 |
| xsfYhzh | string | 否 | 销售方银行账号 示例：11001048600052502301 |
| gmfMc | string | 否 | 购买方名称 示例：用友网络科技股份有限公司 |
| gmfDzdh | string | 否 | 购买方地址电话 示例：北京市海淀区北清路68号 62436688 |
| gmfNsrsbh | string | 否 | 购买方纳税人识别号 示例：91110000600001760P |
| gmfYhzh | string | 否 | 购买方银行账号 示例：北京某公司银行账号 |
| jshj | BigDecimal | 否 | 价税合计 示例：100842 |
| hjje | BigDecimal | 否 | 合计金额 示例：95133.96 |
| hjse | BigDecimal | 否 | 合计税额 示例：5708.04 |
| bz | string | 否 | 备注 |
| kpr | string | 否 | 开票人 示例：开票人 |
| skr | string | 否 | 收款人 示例：收款人 |
| fhr | string | 否 | 复核人 示例：复核人 |
| yfpDm | string | 否 | 原发票代码 示例：456456456 |
| yfpHm | string | 否 | 原发票号码 示例：2564566 |
| srcType | string | 否 | 数据来源(平台-10 税盘-20 excel导入-30 税局-40) 示例: 10 示例：10 |
| lyid | string | 否 | 发票来源id 示例：123123123123123 |
| projectCode | string | 否 | 项目编码 示例：jhde3232 |
| finOrgCode | string | 否 | 会计主体编码 示例：32323 |
| zsfs | string | 否 | 征税方式(普通征税-0 差额征税/差额开票-2 全额开票-3) 示例：0 |
| bred | string | 否 | 红冲标志；Y:已红冲；N:未红冲    示例: N 示例：N |
| tspz | string | 否 | 特殊业务类型(0-一般; 2-燃油增值税专用发票; 8-农产品销售; 9-农产品收购; 11-烟草发票; 12-机动车发票; 14-成品油发票; DK-代开发票; 16-矿产品发票; E01-成品油发票; E03-建筑服务发票; E04-货物运输 ;E05-不动产销售 ;E06-不动产租赁服务发票; E07-代收车船税; E09-旅客运输; E12-自产农产品销售; E14-机动车; E16-农产品收购; E17-光伏收购; E18-卷烟发票; E02-稀土发票; E22-电子行程单;E32-电子烟) 示例：E06 |
| bdcdz | string | 否 | 不动产地址 示例：北京市北京市辖区东城区滨河公园5-4-1803 |
| zlqq | string | 否 | 租赁期起日期 示例：2023-03-22 |
| zlqz | string | 否 | 租赁期止日期 示例：2025-03-22 |
| kdsbz | string | 否 | 跨地（市）标志 Y：是 N：否 示例：N |
| kqysssxbgglbm | string | 否 | 跨区域涉税事项报验管理编号 示例：澄税澄 税跨报 〔2024〕 341 号 |
| bdcdwdm | string | 否 | 不动产单元代码 示例：2023023322342 |
| wqhtbabh | string | 否 | 网签合同备案编号 示例：2023023322342 |
| tdzzsxmbh | string | 否 | 土地增值税项目编号 示例：2023023322342 |
| hdjsjg | string | 否 | 核定计税价格 示例：100023233.45 |
| sjcjhsje | string | 否 | 实际成交含税金额 示例：100023233.45 |
| fdckfxmbh | string | 否 | 房地产开发项目编号 示例：2023023322342 |
| cpyqylb | string | 否 | 成品油企业类别 示例：内资企业 |
| bxdh | string | 否 | 保险单号 示例：bd20240809232233 |
| cphcbdjh | string | 否 | 车牌号/船舶登记号 示例：京A888888 |
| skssq | string | 否 | 税款所属期 示例：202403 |
| dsccsje | number |
| 小数位数:2,最大长度:10 | 否 | 代收车船税金额 示例：100023233.45 |
| znj | number |
| 小数位数:2,最大长度:10 | 否 | 滞纳金金额 示例：100023233.45 |
| jehj | number |
| 小数位数:2,最大长度:10 | 否 | 金额合计 示例：100023233.45 |
| cjh | string | 否 | 车辆识别代码/车架号码 示例：LFWADRJF011002346 |
| ticketNumber | string | 否 | 电子票号 示例：9992181190174 |
| fareAmount | string | 否 | 加减价 示例：10 |
| orderNumber | string | 否 | 企业购票订单号 示例：tbdd23213123123 |
| userName | string | 否 | 用户名 示例：zhangsan |
| buyerType | string | 否 | 购买机票方类型：0:企业 1:机关或事业单位 2:个人3:其他 示例：0 |
| gpCode | string | 否 | GP单号 示例：GP单号 |
| passengerName | string | 否 | 乘客姓名 示例：李四 |
| passengerIdnum | string | 否 | 乘客身份证号码/护照号码 示例：10032333 |
| endorsements | string | 否 | 签注 示例：无 |
| office | string | 否 | 出票Office号 示例：PEK112 |
| issuedBy | string | 否 | 出票单位 示例：中国国际航空股份有限公司( 电话销售服务中心 ) |
| iata | string | 否 | IATA号 示例：08385252 |
| pnr | string | 否 | PNR号 示例：08385252 |
| ticketInformation | string | 否 | 机票票面提示信息 示例：CA1501T3 乘机 |
| insurance | string | 否 | 保险信息 示例：保险信息 |
| electronicTicketType | string | 否 | 机票类型 0：国内 1：国际 示例：0 |
| verifyCode | string | 否 | 验证码 示例：342342 |
| overdueFlag | string | 否 | 超期标识true: 超期 false: 未超期 示例：false |
| vehicleDatPath | string | 否 | 机动车dat文件路径 示例：机动车dat文件路径 |
| dfgtgmbz | string | 否 | 多方共同购买标志 Y：多方共同购买N：非多方共同购买 示例：Y |
| zrrbs | string | 否 | 自然人标识 示例：N |
| zfrq | string | 否 | 作废日期；yyyy-MM-dd 示例：2019-01-01 |
| gatherDate | string | 否 | 采集日期；yyyy-MM-dd HH-mm-ss 示例：2019-01-01 00:00:00 |
| totalCount | number |
| 小数位数:0,最大长度:21 | 否 | 查询总数量 示例：1999 |
| items | object | 是 | 明细行 |
| tspzs | object | 是 | 特殊票种明细 |
| bdcxsTspzs | object | 是 | 不动产销售适配多行特定业务信息 |
| cepzs | object | 是 | 差额征税-差额开票的凭证信息列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"fpqqlsh": "1235211020202",
			"orgId": "21313521321231",
			"lydjh": "4513545613132",
			"fpHm": "04208969",
			"fpDm": "1100163130",
			"sdHm": "23442000000087225540",
			"kprq": "2017-07-31",
			"fpMw": "15<*026+848686",
			"jym": "57644233870940613901",
			"fplx": "4",
			"kplx": "0",
			"xsfMc": "用友能源科技有限公司",
			"xsfNsrsbh": "9111010834431437XQ",
			"xsfDzdh": "北京市海淀区北清路68号院20号楼2层201房间 82020955",
			"xsfYhzh": "11001048600052502301",
			"gmfMc": "用友网络科技股份有限公司",
			"gmfDzdh": "北京市海淀区北清路68号 62436688",
			"gmfNsrsbh": "91110000600001760P",
			"gmfYhzh": "北京某公司银行账号",
			"jshj": 100842,
			"hjje": 95133.96,
			"hjse": 5708.04,
			"bz": "",
			"kpr": "开票人",
			"skr": "收款人",
			"fhr": "复核人",
			"yfpDm": "456456456",
			"yfpHm": "2564566",
			"srcType": "10",
			"lyid": "123123123123123",
			"projectCode": "jhde3232",
			"finOrgCode": "32323",
			"zsfs": "0",
			"bred": "N",
			"tspz": "E06",
			"bdcdz": "北京市北京市辖区东城区滨河公园5-4-1803",
			"zlqq": "2023-03-22",
			"zlqz": "2025-03-22",
			"kdsbz": "N",
			"kqysssxbgglbm": "澄税澄 税跨报 〔2024〕 341 号",
			"bdcdwdm": "2023023322342",
			"wqhtbabh": "2023023322342",
			"tdzzsxmbh": "2023023322342",
			"hdjsjg": "100023233.45",
			"sjcjhsje": "100023233.45",
			"fdckfxmbh": "2023023322342",
			"cpyqylb": "内资企业",
			"bxdh": "bd20240809232233",
			"cphcbdjh": "京A888888",
			"skssq": "202403",
			"dsccsje": 100023233.45,
			"znj": 100023233.45,
			"jehj": 100023233.45,
			"cjh": "LFWADRJF011002346",
			"ticketNumber": "9992181190174",
			"fareAmount": "10",
			"orderNumber": "tbdd23213123123",
			"userName": "zhangsan",
			"buyerType": "0",
			"gpCode": "GP单号",
			"passengerName": "李四",
			"passengerIdnum": "10032333",
			"endorsements": "无",
			"office": "PEK112",
			"issuedBy": "中国国际航空股份有限公司( 电话销售服务中心 )",
			"iata": "08385252",
			"pnr": "08385252",
			"ticketInformation": "CA1501T3 乘机",
			"insurance": "保险信息",
			"electronicTicketType": "0",
			"verifyCode": "342342",
			"overdueFlag": "false",
			"vehicleDatPath": "机动车dat文件路径",
			"dfgtgmbz": "Y",
			"zrrbs": "N",
			"zfrq": "2019-01-01",
			"gatherDate": "2019-01-01 00:00:00",
			"totalCount": 1999,
			"items": [
				{
					"cd": "武汉市",
					"cjhm": "LVHTG5838K5010150",
					"dunwei": "1",
					"dw": "吨",
					"fdjhm": "2018112",
					"ggxh": "本田牌/HONDADHW6483T5ASE",
					"hgzh": "1613131",
					"jkzmsh": "1231313",
					"se": 35006.9,
					"sjdh": "6223213",
					"sl": 0.16,
					"xcrs": "5",
					"xmdj": 218793.1,
					"xmje": 218793.1,
					"xmmc": "多用途乘用车",
					"xmsl": 1,
					"spbm": "123123132165465456",
					"kce": 1,
					"lslbs": ""
				}
			],
			"tspzs": [
				{
					"cxrxh": "1",
					"cxr": "张三",
					"cxrzjlxDm": "201",
					"sfzjhm": "110120202108080808",
					"chuxrq": "2022-11-01",
					"cfd": "北京",
					"lkddd": "上海",
					"zwdj": "二等座",
					"jtgjlxDm": "2",
					"ysmxxh": "1",
					"qyd": "郑州",
					"ddd": "江苏",
					"ysgjzl": "铁路运输",
					"ysgjph": "G443",
					"yshwmc": "煤矿",
					"fdjhm": "发动机号码",
					"dphgzbh": "底盘号/机架号",
					"sfyytljdj": "Y",
					"carrierCode": "CA",
					"fareBasis": "Y",
					"notValidBefore": "2024-05-17",
					"notValidAfter": "2024-05-17",
					"allow": "20K",
					"itineraryType": "0",
					"gtgmf": "王五"
				}
			],
			"bdcxsTspzs": [
				{
					"bdcdz": "北京市北京市辖区东城区滨河公园5-4-1803",
					"kdsbz": "N",
					"bdcdwdm": "312312312123",
					"wqhtbabh": "312312312123",
					"tdzzsxmbh": "312312312123",
					"hdjsjg": "18888.34",
					"sjcjhsje": "18888.34",
					"mjdw": "平方米",
					"cqzsbh": "312312312123"
				}
			],
			"cepzs": [
				{
					"xh": "1",
					"pzlx": "01",
					"fphm": "05397370562202045069",
					"fpdm": "9374504494",
					"zzfphm": "24737437",
					"pzhm": "05397370562202045069",
					"kjrq": "2023-01-04",
					"hjje": 11.02,
					"kce": 10.05,
					"bckcje": 10.05,
					"pzhjje": 11.02,
					"bz": "备注",
					"ly": "手工录入"
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1001	数据不合法	数据不合法，传入参数


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求说明

新增

请求参数 (4)

更新

请求参数 fpHm

更新

请求参数 fpDm

更新

请求参数 tspz

新增

返回参数 (100)

更新

返回参数 fpHm

更新

返回参数 fpDm


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

