---
title: "扫码开票"
apiId: "59cdcff503064f818bdb722812e8debb"
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

# 扫码开票

> `ContentType	application/json` 请求方式	POST | 分类: Invoicing (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/invoiceclient-web/api/invoiceApply/insertForQRInvoice

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
| XSF_NSRSBH | string | 否 | 是 | 销售方纳税人识别号 示例：111222333456333 |
| FPQQLSH | string | 否 | 否 | 发票请求流水号 示例：121213123 |
| JSHJ | number |
| 小数位数:2,最大长度:17 | 否 | 是 | 价税合计 示例：117 |
| BZ | string | 否 | 否 | 备注 示例：备注 |
| LYID | string | 否 | 否 | 来源ID 示例：来源id |
| ORGCODE | string | 否 | 是 | 开票点编码；在开票点档案中查看。 示例：10300002 |
| RQSJ | string | 否 | 否 | 日期时间；yyyy-MM-dd 示例：2021-11-16 |
| SHMC | string | 否 | 是 | 商户名称 示例：asdasd |
| EMAIL | string | 否 | 否 | 收票邮箱 示例：14525522@qq.com |
| URL | string | 否 | 否 | 回调url 示例：https://esgs.com/result/qie |
| GMF_MC | string | 否 | 否 | 购买方名称 示例：北京用友 |
| GMF_NSRSBH | string | 否 | 否 | 购买方纳税人识别号 示例：53513115 |
| GMF_DZDH | string | 否 | 否 | 购买方地址电话 示例：海淀用友产业全 666232 |
| GMF_YHZH | string | 否 | 否 | 购买方银行账号 示例：海淀银行 233232 |
| FPLX | string | 否 | 否 | 1：增值税电子普通发票；2：增值税电子专用发票；3：增值税普通发票；4：增值税专用发票、增值税专用发票(机动车)；5：机动车销售统一发票；8：增值税电子普通发票（成品油）；10：成品油普通发票；11：成品油专用发票；15：二手车销售统一发票；31：数电专用发票；32：数电普通发票；33：数电纸质发票(增值税专用发票)；34：数电纸质发票(普通发票)；35：数电票(航空运输电子客票行程单)；36：数电纸质发票(机动车销售统一发票)； 示例：1 |
| KPR | string | 否 | 否 | 开票人：当开票点档案未设置开票人时必填 示例：李四 |
| TDZZSXMBH | string | 否 | 否 | 土地增值税项目编号。数电特殊票种-建筑服务必传 示例：10510304578 |
| TSPZ | string | 否 | 否 | 特殊票种。0-一般; 2-燃油增值税专用发票; 8-农产品销售; 9-农产品收购; 11-烟草发票; 12-机动车发票; 14-成品油发票; DK-代开发票; 16-矿产品发票; E01-成品油发票; E03-建筑服务发票; E04-货物运输 ;E05-不动产销售 ;E06-不动产租赁服务发票; E07-代收车船税; E09-旅客运输; E12-自产农产品销售; E14-机动车; E16-农产品收购; E17-光伏收购; E18-卷烟发票; E22-电子行程单; 示例：E22 |
| KDSBZ | string | 否 | 否 | 是否跨地址标志。不动产租赁服务及建筑服务必传。枚举Y：是；N:否 示例：N |
| items | object | 是 | 是 | 发票详细信息 |
| FPHXZ | int | 否 | 否 | 发票行性质：如果本行为折扣行或者被折扣行则为必输项，0-正常行，1-折扣行，2-被折扣行 示例：0 |
| XMMC | string | 否 | 是 | 项目名称 示例：（pp瓶）0.9%氯化钠注射液 |
| GGXH | string | 否 | 否 | 规格型号 示例：GG |
| DW | string | 否 | 否 | 单位 示例：单位 |
| XMSL | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 项目数量 示例：1 |
| XMDJ | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 项目单价 示例：100 |
| XMJSHJ | number |
| 小数位数:2,最大长度:17 | 否 | 是 | 项目价税合计 示例：117 |
| SL | number |
| 小数位数:6,最大长度:7 | 否 | 是 | 税率 示例：0.17 |
| HH | string | 否 | 否 | 行号 示例：0 |
| ZKHHH | string | 否 | 否 | 折扣行行号 示例：1 |
| SPBM | string | 否 | 是 | 商品税收分类编码 示例：3010504020000000000 |
| XMJE | number |
| 小数位数:2,最大长度:17 | 否 | 否 | 项目金额 示例：100 |
| detailMotor | object | 否 | 否 | 明细特殊票种扩展属性.机动车及数电特殊票种-不动产租赁服务及建筑服务必传 |
| tspzs | object | 否 | 否 | 数电特殊票种扩展属性 |
| JTGJLXDM | string | 否 | 否 | 交通工具类型。建筑服务及旅客运输等必传。1-飞机;2-火车;3-长途汽车;4-公共交通;5-出租车;6-汽车;7-船舶;9-其他; 示例：1 |
| YSMXXH | string | 否 | 否 | 运输明细序号。数电特殊票种-建筑服务及旅客运输等必传；从1开始 示例：1 |
| QYD | string | 否 | 否 | 起运地。数电特殊票种-建筑服务及旅客运输等必传 示例：XX省XX市XX县XX镇XXXX |
| DDD | string | 否 | 否 | 到达地。数电特殊票种-建筑服务及旅客运输等必传 示例：XX省XX市XX县XX镇XXXX |
| YSGJZL | string | 否 | 否 | 运输工具种类.数电特殊票种-建筑服务及旅客运输等必传。取值：铁路运输、公路运输、水路运输、航空运输、管道运输、其他运输工具 示例：管道运输 |
| YSGJPH | string | 否 | 否 | 运输工具牌号.数电特殊票种-建筑服务及旅客运输等必传 示例：京A1234567 |
| YSHWMC | string | 否 | 否 | 运输货物名称。数电特殊票种-建筑服务及旅客运输等必传 示例：钢材 |
| CXRXH | string | 否 | 否 | 出行人序号。从1开始。 示例：1 |
| CXR | string | 否 | 否 | 承运人名称 示例：王五 |
| CHUXRQ | string | 否 | 否 | 出行日期。格式yyyy-MM-dd HH:mm 示例：2023-10-25 08:30 |
| CFD | string | 否 | 否 | 出发地 示例：北京 |
| LKDDD | string | 否 | 否 | 到达地 示例：上海 |
| ZWDJ | string | 否 | 否 | 座位等级 示例：头等舱 |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoiceApply/insertForQRInvoice?access_token=访问令牌
Body: {
	"XSF_NSRSBH": "111222333456333",
	"FPQQLSH": "121213123",
	"JSHJ": 117,
	"BZ": "备注",
	"LYID": "来源id",
	"ORGCODE": "10300002",
	"RQSJ": "2021-11-16",
	"SHMC": "asdasd",
	"EMAIL": "14525522@qq.com",
	"URL": "https://esgs.com/result/qie",
	"GMF_MC": "北京用友",
	"GMF_NSRSBH": "53513115",
	"GMF_DZDH": "海淀用友产业全 666232",
	"GMF_YHZH": "海淀银行 233232",
	"FPLX": "1",
	"KPR": "李四",
	"TDZZSXMBH": "10510304578",
	"TSPZ": "E22",
	"KDSBZ": "N",
	"items": [
		{
			"FPHXZ": 0,
			"XMMC": "（pp瓶）0.9%氯化钠注射液",
			"GGXH": "GG",
			"DW": "单位",
			"XMSL": 1,
			"XMDJ": 100,
			"XMJSHJ": 117,
			"SL": 0.17,
			"HH": "0",
			"ZKHHH": "1",
			"SPBM": "3010504020000000000",
			"XMJE": 100,
			"detailMotor": {
				"JZFWFSD": "XX省XX市XX县XX镇XXXX",
				"JZXMMC": "XX省XX市XX县XX镇XXXX",
				"CQZSBH": "无"
			}
		}
	],
	"tspzs": {
		"JTGJLXDM": "1",
		"YSMXXH": "1",
		"QYD": "XX省XX市XX县XX镇XXXX",
		"DDD": "XX省XX市XX县XX镇XXXX",
		"YSGJZL": "管道运输",
		"YSGJPH": "京A1234567",
		"YSHWMC": "钢材",
		"CXRXH": "1",
		"CXR": "王五",
		"CHUXRQ": "2023-10-25 08:30",
		"CFD": "北京",
		"LKDDD": "上海",
		"ZWDJ": "头等舱"
	}
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
| message | string | 否 | 处理状态信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | object | 否 | 返回数据 |
| qrcode | string | 否 | 二维码查看网址 示例：https://tax.diwork.com/mobileinvoice/index.html?fs=sm&lsh=agTuxnQcTRrVEwEqjd72Xg&corp=ry4qcaql&profile=daily-center&tenantId=0000LM68DHTC0MYSQV0000 |
| invoicecode | string | 否 | 发票提取码 示例：123456789567 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"qrcode": "https://tax.diwork.com/mobileinvoice/index.html?fs=sm&lsh=agTuxnQcTRrVEwEqjd72Xg&corp=ry4qcaql&profile=daily-center&tenantId=0000LM68DHTC0MYSQV0000",
		"invoicecode": "123456789567"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1001	数据不合法，传入参数不正确	检查传入参数

9999	未知错误	根据对应报错信息进行排查修改


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

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

