---
title: "红字确认单新增或修改"
apiId: "1758106165141045257"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Red Letter Application Form"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Red Letter Application Form]
platform_version: "BIP"
source_type: community-api-docs
---

# 红字确认单新增或修改

> `ContentType	application/json` 请求方式	POST | 分类: Red Letter Application Form (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/etax/redinfo-apply/save

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
| fplx | string | 否 | 是 | 发票类型 31：数电票(增值税专用发票); 32:数电票(普通发票) 示例：31 |
| hcyy | string | 否 | 否 | 红冲原因；1 销货退回 2 开票有误 3 服务中止 4 销售折让 示例：1 |
| orgId | string | 否 | 是 | 开票点组织id，orgcode为空时必传 |
| orgcode | string | 否 | 否 | 开票点组织编码 示例：code12345 |
| reqMemo | string | 否 | 是 | 红字申请表类型（购买方申请已抵扣：1100000000；购买方申请未抵扣：1010000000；销售方申请：0000000100） 示例：1100000000 |
| hjje | BigDecimal | 否 | 是 | 合计金额 示例：-99.01 |
| jshj | BigDecimal | 否 | 是 | 价税合计 示例：-100.00 |
| hjse | BigDecimal | 否 | 是 | 合计税额 示例：-0.99 |
| gmfMc | string | 否 | 是 | 购买方名称 示例：用友金融信息技术股份有限公司123 |
| gmfNsrsbh | string | 否 | 是 | 购买方纳税人识别号 示例：111222333456333 |
| xsfMc | string | 否 | 是 | 销售方名称 示例：测试333 |
| xsfNsrsbh | string | 否 | 是 | 销售方纳税人识别号 示例：111222333456333 |
| kprq | string | 否 | 是 | 开票日期 yyyyMMdd 示例：20210101 |
| reqBillNo | string | 否 | 否 | 红字信息申请表流水号 示例：3213121232123 |
| items | object | 是 | 是 | 明细信息 |
| ggxh | string | 否 | 否 | 规格型号 示例：一二三四五六七八 |
| dw | string | 否 | 否 | 单位 示例：一二三 |
| sl | BigDecimal | 否 | 是 | 税率 示例：0.01 |
| xmmc | string | 否 | 是 | 项目名称 示例：*运输服务*橡皮 |
| ysxmmc | string | 否 | 否 | 原项目名称 示例：橡皮 |
| xmdj | BigDecimal | 否 | 否 | 单价 示例：23.0041942911 |
| xmhsdj | BigDecimal | 否 | 否 | 项目含税单价 示例：23.234213 |
| xmjshj | BigDecimal | 否 | 是 | 项目价税合计 示例：-100 |
| se | BigDecimal | 否 | 是 | 税额 示例：-0.99 |
| xmje | BigDecimal | 否 | 是 | 项目金额 示例：-99.01 |
| xmsl | BigDecimal | 否 | 否 | 项目数量 示例：-4.3039977296 |
| spbm | string | 否 | 否 | 税收分类编码 示例：3213124314324322 |
| yfpHm | string | 否 | 是 | 原发票号码 示例：2315 |
| cpyMemo | string | 否 | 否 | 红字申请表成品油涉及类型 1：涉及销售数量变更，2：涉及销售金额变更 示例：1 |
| jdcMemo | string | 否 | 否 | 红字申请表机动车涉及类型 1：涉及销售退回，开票有误等，将购买方机动车台账中对应合格证退回销售方，2：仅涉及销售折让，不涉及购销双方机动车购销台账调整 示例：1 |
| mineralsMemo | string | 否 | 否 | 红字申请表矿产品涉及类型 1涉及销售数量和金额变更，2仅涉及销售金额变更，不涉及购销方销售数量变动，需谨值操作！ 示例：1 |
| fqfNsrshbh | string | 否 | 是 | 发起方税号 示例：1222225523 |
| fqfGXF | string | 否 | 是 | 购销方,0:销方 1:购方 示例：0 |

## 3. 请求示例

Url: /yonbip/tax/api/etax/redinfo-apply/save?access_token=访问令牌
Body: {
	"fplx": "31",
	"hcyy": "1",
	"orgId": "",
	"orgcode": "code12345",
	"reqMemo": "1100000000",
	"hjje": -99.01,
	"jshj": -100,
	"hjse": -0.99,
	"gmfMc": "用友金融信息技术股份有限公司123",
	"gmfNsrsbh": "111222333456333",
	"xsfMc": "测试333",
	"xsfNsrsbh": "111222333456333",
	"kprq": "20210101",
	"reqBillNo": "3213121232123",
	"items": [
		{
			"ggxh": "一二三四五六七八",
			"dw": "一二三",
			"sl": 0.01,
			"xmmc": "*运输服务*橡皮",
			"ysxmmc": "橡皮",
			"xmdj": 23.0041942911,
			"xmhsdj": 23.234213,
			"xmjshj": -100,
			"se": -0.99,
			"xmje": -99.01,
			"xmsl": -4.3039977296,
			"spbm": "3213124314324322"
		}
	],
	"yfpHm": "2315",
	"cpyMemo": "1",
	"jdcMemo": "1",
	"mineralsMemo": "1",
	"fqfNsrshbh": "1222225523",
	"fqfGXF": "0"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回状态说明 示例：上传成功 |
| data | object | 否 | 返回数据；根据实际情况返回参数，部分参数可能不显示 |
| reqBillNo | string | 否 | 红字信息表流水号 示例：1762740142507728896 |
| statusDm | string | 否 | 信息表状态。1:未上传;2:上传中;3:上传失败;4:上传成功;5:获取中;6:获取失败;7:获取成功;8:撤销中;9:撤销失败;10:已撤销;01:无需确认;02:销方录入待购方确认;03:购方录入待销方确认;04:购销双方已确认;05:作废（销方录入购方否认）;06:作废（购方录入销方否认）;07:作废（超 72 小时未确认）;08:作废（发起方已撤销）;09:作废（确认后撤销）; 示例：2 |
| reqMemo | string | 否 | 申请选择（固定10位，购买方申请已抵扣：1100000000、购买方申请未抵扣：1010000000、销售方申请：0000000100） 示例：0000000101 |
| yfpDm | string | 否 | 原发票代码 示例：11212541 |
| yfpHm | string | 否 | 原发票号码 示例：06319827426500627414 |
| zdrq | string | 否 | 制单日期：yy-MM-dd HH:mm:ss 示例：2024-02-28 00:00:00 |
| kprq | string | 否 | 开票日期：yyMMddHHmmss 示例：20240228152103 |
| gmfMc | string | 否 | 购买方名称 示例：trse001 |
| gmfNsrsbh | string | 否 | 购买方纳税人识别号 示例：1216312 |
| xsfMc | string | 否 | 销售方名称 示例：全电 |
| xsfNsrsbh | string | 否 | 销售方纳税人识别号 示例：441234867AAAAAA |
| hjje | number |
| 小数位数:2,最大长度:17 | 否 | 合计金额 示例：-0.88 |
| hjse | number |
| 小数位数:2,最大长度:17 | 否 | 合计税额 示例：-0.12 |
| jshj | number |
| 小数位数:2,最大长度:17 | 否 | 价税合计 示例：-1 |
| kpr | string | 否 | 开票人 示例：昵称-何婷婷 |
| skr | string | 否 | 收款人 示例：我是收款人1 |
| fhr | string | 否 | 复核人 示例：我是复核人1 |
| bmbBbh | string | 否 | 编码表版本号 示例：10.0 |
| fplx | string | 否 | 发票类型；1：增值税电子普通发票；2：增值税电子专用发票；3：增值税普通发票；4：增值税专用发票 ；5：机动车销售统一发票；8：增值税电子普通发票（成品油）；10：成品油普通发票；11：成品油专用发票；15：二手车销售统一发票；31：数电专用发票；32：数电普通发票；33：数电纸质发票(增值税专用发票)；34：数电纸质发票(普通发票)； 示例：32 |
| lylx | string | 否 | 来源类型；1-手工开具; 2-接口传入; 3-文件导入; 4-二维码扫描; 5-微信传入; 6-快速开票; 7-支付宝传入; 8-拼多多; 9-小程序; w-待开票明细; v-开票申请单; n-NCC传入 示例：1 |
| fpqqlsh | string | 否 | 发票请求流水号 示例：1762740142507728897 |
| orgId | string | 否 | 组织id 示例：1684339912859975684 |
| source | string | 否 | 数据来源；0：通过其他方式进行红冲；1：通过专票整体红冲接口红冲；2：通过UI页面获取得到；3：获取通过API方式得到，需要直接进入开票流程，区分于UI的操作；4：申请通过接口成功需要回调助手回传成功处理；5：从待开票明细界面申请 示例：0 |
| items | object | 是 | 明细数据 |
| slbz | string | 否 | 税率标志；0：普通征税；1：差额征税 示例：0 |
| sendOrReceive | string | 否 | 发起/接收方标识；0：接收方；1：发起方 示例：1 |
| hcyy | string | 否 | 红冲原因；1：销货退回；2：开票有误；3：服务中止；4：销售折让 示例：2 |
| tspz | string | 否 | 特殊票种；0：一般；2：燃油增值税专用发票；8：农产品销售；9：农产品收购；11：烟草发票；12：机动车发票；14：成品油发票；DK：代开发票；16：矿产品发票；E01：成品油发票；E03：建筑服务发票；E04；货物运输；E05：不动产销售；E06：不动产租赁服务发票；E07：代收车船税；E09：旅客运输；E12：自产农产品销售；E16：农产品收购；E17：光伏收购；E18：卷烟发票 示例：0 |
| fqfNsrshbh | string | 否 | 发起方纳税人识别号 示例：441234867AAAAAA |

## 5. 正确返回示例

{
	"code": "200",
	"message": "上传成功",
	"data": {
		"reqBillNo": "1762740142507728896",
		"statusDm": "2",
		"reqMemo": "0000000101",
		"yfpDm": "11212541",
		"yfpHm": "06319827426500627414",
		"zdrq": "2024-02-28 00:00:00",
		"kprq": "20240228152103",
		"gmfMc": "trse001",
		"gmfNsrsbh": "1216312",
		"xsfMc": "全电",
		"xsfNsrsbh": "441234867AAAAAA",
		"hjje": -0.88,
		"hjse": -0.12,
		"jshj": -1,
		"kpr": "昵称-何婷婷",
		"skr": "我是收款人1",
		"fhr": "我是复核人1",
		"bmbBbh": "10.0",
		"fplx": "32",
		"lylx": "1",
		"fpqqlsh": "1762740142507728897",
		"orgId": "1684339912859975684",
		"source": "0",
		"items": [
			{
				"fphxz": "0",
				"hh": "1",
				"xmmc": "*煤炭*洗煤",
				"dw": "kg",
				"ggxh": "吨",
				"xmje": -0.88,
				"sl": 0.13,
				"se": -0.12,
				"hsbz": "N",
				"xmjshj": -1,
				"spbm": "1020102000000000000",
				"yhzcbs": "0",
				"ysxmmc": "洗煤",
				"lzmxxh": "1"
			}
		],
		"slbz": "0",
		"sendOrReceive": "1",
		"hcyy": "2",
		"tspz": "0",
		"fqfNsrshbh": "441234867AAAAAA"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	发票号码不能为空	返回错误码


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

