---
title: "红字信息表编号查询"
apiId: "9299d3d37cab49729f1e8ba9bd5ba676"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Red Letter Application Form"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Red Letter Application Form]
platform_version: "BIP"
source_type: community-api-docs
---

# 红字信息表编号查询

> `ContentType	application/json` 请求方式	GET | 分类: Red Letter Application Form (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/invoiceclient-web/api/redinfo-apply/queryRedInfoApply/{reqBillNo}

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| reqBillNo | string | path | 是 | 红字信息申请流水号    示例: 513132132123 |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/redinfo-apply/queryRedInfoApply/513132132123?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息说明 示例：操作成功 |
| data | object | 否 | 返回数据 示例：根据实际情况返回参数，部分参数可能不显示 |
| reqBillNo | string | 否 | 红字信息表编号 示例：1770053087623933952 |
| redApplyNo | string | 否 | 红字申请单号 示例：2151202000001 |
| resBillNo | string | 否 | 信息表编号 示例：8545445420001 |
| statusDm | string | 否 | 信息表状态编码：1-未上传；2-上传中；3-上传失败；4-上传成功；5-获取中；6-获取失败；7-获取成功 示例：1 |
| statusMc | string | 否 | 信息表状态描述 示例：上传成功 |
| reqMemo | string | 否 | 申请选择（固定10位，购买方申请已抵扣：1100000000、购买方申请未抵扣：1010000000、销售方申请：0000000100） 示例：1100000000 |
| cpyMemo | string | 否 | 成品油（1：涉及销售数量变更，2：涉及销售金额变更） 示例：1 |
| jdcMemo | string | 否 | 红字申请表机动车涉及类型；1:涉及销售退回，开票有误等，将购买方机动车台账中对应合格证退回销售方 2:仅涉及销售折让，不涉及购销双方机动车购销台账调整 示例：1 |
| mineralsMemo | string | 否 | 红字申请表矿产品涉及类型（1涉及销售数量和金额变更，2仅涉及销售金额变更，不涉及购销方销售数量变动，需谨值操作！） 示例：1 |
| dzyMemo | string | 否 | 红字申请表电子烟涉及类型；1涉及销售数量和金额变更，2仅涉及销售金额变更，不涉及购销方销售数量变动，需谨值操作！ 示例：1 |
| jqbh | string | 否 | 机器编号 示例：JQ-001 |
| yfpDm | string | 否 | 原发票代码 示例：12122100111 |
| yfpHm | string | 否 | 原发票号码 示例：1212121 |
| zdrq | string | 否 | 制单日期；yyyy-MM-dd 示例：2024-03-19 |
| kprq | string | 否 | 开票日期；yyyyMM 示例：209912 |
| gmfMc | string | 否 | 购买方名称 示例：sw0001 |
| gmfNsrsbh | string | 否 | 购买方纳税人识别号 示例：YBSWY0187654321 |
| gmfDzdh | string | 否 | 购买方地址账号 示例：北京市海淀区88881111 |
| gmfYhzh | string | 否 | 购买方银行账号 示例：北京银行63119191919 |
| xsfMc | string | 否 | 销售方名称 示例：压测预置数据勿动 |
| xsfNsrsbh | string | 否 | 销售方纳税人识别号 示例：YBSWY0187654322 |
| hjje | number |
| 小数位数:8,最大长度:10 | 否 | 合计金额 示例：-10 |
| hjse | number |
| 小数位数:8,最大长度:10 | 否 | 合计税额 示例：-1.7 |
| jshj | number |
| 小数位数:8,最大长度:10 | 否 | 价税合计 示例：-11.7 |
| kpr | string | 否 | 开票人 示例：张三 |
| skr | string | 否 | 收款人 示例：李四 |
| fhr | string | 否 | 复核人 示例：王五 |
| bmbBbh | string | 否 | 编码表版本号 示例：51.0 |
| fplx | string | 否 | 发票类型：1：增值税电子普通发票；2：增值税电子专用发票；3：增值税普通发票；4：增值税专用发票 ；5：机动车销售统一发票；8：增值税电子普通发票（成品油）；10：成品油普通发票；11：成品油专用发票；15：二手车销售统一发票；31：数电专用发票；32：数电普通发票；33：数电纸质发票(增值税专用发票)；34：数电纸质发票(普通发票)； 选填 默认为1 示例：4 |
| lylx | string | 否 | 来源类型 1-手工开具; 2-接口传入; 3-文件导入; 4-二维码扫描; 5-微信传入; 6-快速开票; 7-支付宝传入; 8-拼多多; 9-小程序; w-待开票明细; v-开票申请单; n-NCC传入 示例：1 |
| lyid | string | 否 | 来源id 示例：LY-001 |
| zdybz | string | 否 | 自定义备注 示例：自定义备注 |
| fpqqlsh | string | 否 | 发票请求流水号 示例：1770053087623933953 |
| orgId | number |
| 小数位数:0,最大长度:11 | 否 | 组织id 示例：12124554544 |
| source | string | 否 | 发票来源：0：通过其他方式进行红冲；1：通过专票整体红冲接口红冲；2：通过UI页面获取得到；3：获取通过API方式得到，需要直接进入开票流程，区分于UI的操作；4：申请通过接口成功需要回调助手回传成功处理；5：从待开票明细界面申请 示例：0 |
| gmfApplyPhone | string | 否 | 购买方申请电话 示例：15532323232 |
| gmfApplyReason | string | 否 | 购买方申请原因 示例：申请原因 |
| items | object | 是 | 明细 |
| slbz | string | 否 | 税率标志；0-普通征税；2-差额征税 示例：0 |
| taxRate | number |
| 小数位数:6,最大长度:7 | 否 | 税率 示例：0.1 |
| billType | string | 否 | 信息表类型 0正常 1逾期 示例：0 |
| szlb | string | 否 | 税种类别；默认为1-增值税，目前没有其他类型 示例：1 |
| isMutiRate | boolean | 否 | 多税率；true-是，false-否 示例：false |
| yddk | string | 否 | 异地代开 示例：YD-123456 |
| dkbdbs | string | 否 | 代开比对标识 示例：DKB-Database |
| invoiceStatus | string | 否 | 红字信息表开票状态；1-待开票；2-开票中；3-已开票；4-部分已开票；5-开票失败 示例：1 |
| sendOrReceive | string | 否 | 发起/接收方标识;0:接收方 1:发起方 示例：0 |
| hcyy | string | 否 | 红冲原因说明 ：1 销货退回 2 开票有误 3 开票中止 4 销售折让 示例：1 |
| yxbz | string | 否 | 有效标识 Y:有效 N:无效 示例：Y |
| customerCode | string | 否 | 购方编码 示例：CUST-0001 |
| psNo | string | 否 | 项目PS编号 示例：PS-202304 |
| unUsedAndUnEntry | boolean | 否 | 是否未入账且未使用；true-是；false-否 示例：false |
| fphm | string | 否 | 已开红票号码 示例：2023042500 |
| tspz | string | 否 | 特殊票种；0：一般；2：燃油增值税专用发票；8：农产品销售；9：农产品收购；11：烟草发票；12：机动车发票；14：成品油发票；DK：代开发票；16：矿产品发票；E01：成品油发票；E03：建筑服务发票；E04；货物运输；E05：不动产销售；E06：不动产租赁服务发票；E07：代收车船税；E09：旅客运输；E12：自产农产品销售；E16：农产品收购；E17：光伏收购；E18：卷烟发票 示例：E04 |
| lpkprq | string | 否 | 蓝票开票日期；yyyy-MM-dd 示例：2024-01-01 |
| fplyDm | string | 否 | 发票来源代码 示例：12152513 |
| lzfpqdhm | string | 否 | 蓝字发票全电发票号码 示例：45616235464135 |
| needSelfConfirm | string | 否 | 数电基础通道是否需要自己确认，Y是 N否 示例：Y |
| allElcUserName | string | 否 | 全电登录用户名 示例：User123 |
| gmfApply | boolean | 否 | 是否购方申请；true-是；false-否 示例：true |
| orgCode | string | 否 | 开票点编码，去开票点档案中查询；如果传了orgType，则去业务单元中通过type值找到对应的orgCode 示例：ORG-0001 |
| urls | string | 否 | 接口回调地址（多个） 示例：https://example.com/urls |
| xsfDzdh | string | 否 | 销售方地址电话 示例：北京海淀区 155223235 |
| xsfYhzh | string | 否 | 销售方银行账号 示例：X北京银行 23236 |
| callback | string | 否 | 回传地址 示例：https://example.com/callback |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"0": "根",
		"1": "据",
		"2": "实",
		"3": "际",
		"4": "情",
		"5": "况",
		"6": "返",
		"7": "回",
		"8": "参",
		"9": "数",
		"10": "，",
		"11": "部",
		"12": "分",
		"13": "参",
		"14": "数",
		"15": "可",
		"16": "能",
		"17": "不",
		"18": "显",
		"19": "示",
		"reqBillNo": "1770053087623933952",
		"redApplyNo": "2151202000001",
		"resBillNo": "8545445420001",
		"statusDm": "1",
		"statusMc": "上传成功",
		"reqMemo": "1100000000",
		"cpyMemo": "1",
		"jdcMemo": "1",
		"mineralsMemo": "1",
		"dzyMemo": "1",
		"jqbh": "JQ-001",
		"yfpDm": "12122100111",
		"yfpHm": "1212121",
		"zdrq": "2024-03-19",
		"kprq": "209912",
		"gmfMc": "sw0001",
		"gmfNsrsbh": "YBSWY0187654321",
		"gmfDzdh": "北京市海淀区88881111",
		"gmfYhzh": "北京银行63119191919",
		"xsfMc": "压测预置数据勿动",
		"xsfNsrsbh": "YBSWY0187654322",
		"hjje": -10,
		"hjse": -1.7,
		"jshj": -11.7,
		"kpr": "张三",
		"skr": "李四",
		"fhr": "王五",
		"bmbBbh": "51.0",
		"fplx": "4",
		"lylx": "1",
		"lyid": "LY-001",
		"zdybz": "自定义备注",
		"fpqqlsh": "1770053087623933953",
		"orgId": 12124554544,
		"source": "0",
		"gmfApplyPhone": "15532323232",
		"gmfApplyReason": "申请原因",
		"items": [
			{
				"fphxz": 0,
				"hh": "0",
				"zkhhh": "1",
				"xmmc": "*谷物*swwlmc001",
				"dw": "吨",
				"ggxh": "个/1",
				"xmsl": 1,
				"xmdj": -1,
				"xmhsdj": 1.17,
				"xmje": -1,
				"sl": 0.17,
				"se": -1.7,
				"kce": 0,
				"hsbz": "N",
				"xmjshj": -1.17,
				"spbm": "1010101010000000000",
				"zxbm": "ZX-003",
				"yhzcbs": "0",
				"lslbs": "1",
				"zzstsgl": "按3%简易征收",
				"ysxmmc": "swwlmc001",
				"lzmxxh": "1"
			}
		],
		"slbz": "0",
		"taxRate": 0.1,
		"billType": "0",
		"szlb": "1",
		"isMutiRate": false,
		"yddk": "YD-123456",
		"dkbdbs": "DKB-Database",
		"invoiceStatus": "1",
		"sendOrReceive": "0",
		"hcyy": "1",
		"yxbz": "Y",
		"customerCode": "CUST-0001",
		"psNo": "PS-202304",
		"unUsedAndUnEntry": false,
		"fphm": "2023042500",
		"tspz": "E04",
		"lpkprq": "2024-01-01",
		"fplyDm": "12152513",
		"lzfpqdhm": "45616235464135",
		"needSelfConfirm": "Y",
		"allElcUserName": "User123",
		"gmfApply": true,
		"orgCode": "ORG-0001",
		"urls": "https://example.com/urls",
		"xsfDzdh": "北京海淀区 155223235",
		"xsfYhzh": "X北京银行 23236",
		"callback": "https://example.com/callback"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	请确认数据正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

