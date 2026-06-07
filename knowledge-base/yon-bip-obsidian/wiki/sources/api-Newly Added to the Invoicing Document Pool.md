---
title: "待开票单据池新增"
apiId: "1821125593215270912"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing Doc Pool"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing Doc Pool]
platform_version: "BIP"
source_type: community-api-docs
---

# 待开票单据池新增

> `ContentType	application/json` 请求方式	POST | 分类: Invoicing Doc Pool (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/yonbip-fi-taxotypd/api/tax-bill-pool/add

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
| data | object | 否 | 是 | 单据信息 |
| djId | string | 否 | 是 | 业务单据ID 示例：2023092100001 |
| orgUnitId | string | 否 | 否 | 业务单元组织Id 示例：21212 |
| orgUnitCode | string | 否 | 否 | 业务单元组织code 示例：1212123 |
| djName | string | 否 | 否 | 业务单据名称 示例：委外采购订单 |
| djNo | string | 否 | 否 | 业务单据号 示例：CGDD2023092100001 |
| djType | string | 否 | 否 | 单据类型 示例：采购订单 |
| fplx | string | 否 | 否 | 发票类型 1：增值税电子普通发票； 2：增值税电子专用发票； 3：增值税普通发票； 4：增值税专用发票 、增值税专用发票(机动车)； 5：机动车销售统一发票； 8：增值税电子普通发票（成品油）； 9：成品油普通发票(卷式)； 10：成品油普通发票； 11：成品油专用发票； 12：增值税普通发票(卷式)； 15：二手车销售统一发票； 31：数电专用发票； 32：数电普通发票； 33：数电纸质发票(增值税专用发票)；34：数电纸质发票(普通发票)；36：数电纸质发票(机动车销售统一发票) 示例：1 |
| lyxt | string | 否 | 是 | 来源系统 示例：lyxt001 |
| ysjshj | BigDecimal | 否 | 是 | 原始价税合计 (15,2) 示例：1.1 |
| jshj | BigDecimal | 否 | 是 | 价税合计 (15,2) 示例：1.1 |
| je | BigDecimal | 否 | 否 | 金额 (15,2) 示例：1.1 |
| se | BigDecimal | 否 | 否 | 税额 (15,2) 示例：1.1 |
| zke | BigDecimal | 否 | 否 | 折扣额 (15,2) 示例：1.1 |
| djzt | string | 否 | 否 | 单据状态 示例：已审核 |
| zdrId | string | 否 | 否 | 业务制单人ID 示例：zhaoyunliang |
| zdrName | string | 否 | 否 | 业务制单人 示例：zhaoyunliang |
| ywZdrq | string | 否 | 否 | 业务制单日期 yyyy-MM-dd HH:mm:ss 示例：2023-09-21 11:11:11 |
| orderNo | string | 否 | 否 | 订单号 示例：DD-2023092100001 |
| contractNo | string | 否 | 否 | 合同号 示例：HT-2023092100001 |
| billVersion | string | 否 | 否 | 单据版本 示例：V1.0 |
| deliveryNo | string | 否 | 否 | 发货单号 示例：FH-2023092100001 |
| purchaseNo | string | 否 | 否 | 采购订单号 示例：CG-2023092100001 |
| ywyId | string | 否 | 否 | 业务员ID 示例：zhaoyunliang |
| ywyCode | string | 否 | 否 | 业务员编码 示例：123123 |
| ywy | string | 否 | 否 | 业务员 示例：zhaoyunliang |
| departmentId | string | 否 | 否 | 业务部门ID 示例：00001 |
| department | string | 否 | 否 | 业务部门 示例：采购部 |
| djbz | string | 否 | 否 | 业务单据备注 示例：客户需求一次性开票 |
| customerName | string | 否 | 否 | 客户名称 示例：用友网络科技股份有限公司 |
| customer_code | string | 否 | 否 | 客户编码 示例：00001 |
| customerId | string | 否 | 否 | 客户ID 示例：00001 |
| custNsrsbh | string | 否 | 否 | 客户纳税人识别号 示例：91110000600001760P |
| custDz | string | 否 | 否 | 客户地址 示例：北京市海淀区北清路68号 |
| custDh | string | 否 | 否 | 客户电话 示例：010-86396688 |
| custYh | string | 否 | 否 | 客户开户行 示例：农业银行北清路支行 |
| custZh | string | 否 | 否 | 客户开户行账号 示例：9998733321244 |
| custEmail | string | 否 | 否 | 客户邮箱地址 示例：shili@yonyou.com |
| phoneNo | string | 否 | 否 | 收件人手机 示例：13821111111 |
| billStationId | string | 否 | 否 | 开票点id 示例：000034 |
| orgCode | string | 否 | 否 | 组织编码 示例：000034 |
| orgType | string | 否 | 否 | 组织类型 示例：集团 |
| xsfMc | string | 否 | 否 | 销售方名称 示例：用友网络科技股份有限公司 |
| xsfNsrsbh | string | 否 | 否 | 销售方纳税人识别号 示例：91110000600001760P |
| xsfDz | string | 否 | 否 | 销售方地址 示例：北京市海淀区北清路68号 |
| xsfDh | string | 否 | 否 | 销售方电话 示例：010-86396688 |
| xsfYh | string | 否 | 否 | 销售方开户行 示例：农业银行北清路支行 |
| xsfZh | string | 否 | 否 | 销售方开户行账号 示例：9998733321244 |
| bz | string | 否 | 否 | 发票备注 示例：客户需求一次性开票 |
| skrId | string | 否 | 否 | 发票收款人id 示例：99982221 |
| skr | string | 否 | 否 | 发票收款人 示例：刘玲 |
| fhrId | string | 否 | 否 | 发票复核人id 示例：99982221 |
| fhr | string | 否 | 否 | 发票复核人 示例：刘玲 |
| kprId | string | 否 | 否 | 发票开票人ID 示例：99982221 |
| kpr | string | 否 | 否 | 发票开票人 示例：刘玲 |
| sjkprId | string | 否 | 否 | 实际开票人ID 示例：99982221 |
| sjfhrId | string | 否 | 否 | 实际复核人ID 示例：99982221 |
| sjdyrId | string | 否 | 否 | 实际打印人ID 示例：99982221 |
| sjkpr | string | 否 | 否 | 实际开票人 示例：刘玲 |
| sjfhr | string | 否 | 否 | 实际复核人 示例：刘玲 |
| sjdyr | string | 否 | 否 | 实际打印人 示例：刘玲 |
| accountStatus | string | 否 | 否 | 记账状态 1-已记账、2-未记账 示例：1 |
| accountTime | string | 否 | 否 | 记账期间 yyyy-MM-dd HH:mm:ss 示例：2023-09-21 16:54:33 |
| accountNo | string | 否 | 否 | 凭证号 示例：098733333 |
| accountBz | string | 否 | 否 | 凭证备注 示例：此凭证需要一次性开票 |
| zdybz | string | 否 | 否 | 自定义备注 示例：此凭证需要一次性开票 |
| stampedCompany | string | 否 | 否 | 盖章单位 示例：用友股份 |
| stampedCompanyId | string | 否 | 否 | 盖章单位id 示例：0000982 |
| billStationCode | string | 否 | 否 | 开票点编码 示例：001 |
| ytenantId | string | 否 | 否 | 租户id 示例：sdfghot983ue64222234df |
| bdcdz | string | 否 | 否 | 不动产地址 |
| kdsbz | string | 否 | 否 | 跨地(市)标志Y:是N:否 */ |
| bdcdwdm | string | 否 | 否 | 不动产单元代码 |
| wqhtbabh | string | 否 | 否 | 网签合同备案编号 |
| tdzzsxmbh | string | 否 | 否 | 土地增值税项目编号 |
| hdjsjg | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 核定计税价格。不属于核定计税不动产销售的可不填写 |
| sjcjhsje | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 实际成交含税金额。若按核定计税价格征税的为必填 |
| zlqq | string | 否 | 否 | 租赁期起日期 |
| zlqz | string | 否 | 否 | 租赁期止日期 |
| fdckfxmbh | string | 否 | 否 | 房地产开发项目编号 |
| zrrbs | string | 否 | 否 | 自然人标识Y:是，N:否 |
| yfpDm | string | 否 | 否 | 原蓝字发票代码 |
| yfpHm | string | 否 | 否 | 原蓝字发票号码 |
| hzxxbbh | string | 否 | 否 | 红字确认单编号 |
| blueKprq | string | 否 | 否 | 蓝票开票日期，格式yyyy-MM-dd 示例：2025-02-11 |
| hcyy | string | 否 | 否 | 红冲原因，1 销货退回 2 开票有误 3 服务中止 4 销售折让 |
| items | object | 是 | 否 | 业务单据明细 |
| msgUrl | object | 是 | 否 | 回调地址信息 |
| djId | string | 否 | 否 | 业务单据id 示例：CGDD2023092100001 |
| taxInvoiceWillUrl | string | 否 | 否 | 申请单提交后回调url 示例：https://fapiao.yonyoucloud.com/ |
| invoiceUrl | string | 否 | 否 | 申请单完成开票回调的url 示例：https://fapiao.yonyoucloud.com/ |
| delUrl | string | 否 | 否 | 单据退回url，如发生单据退回时，可以回调告知业务系统，如业务系统可正常回退，税务云在收到成功回退标识后，会在单据池中，删除此单据 示例：https://fapiao.yonyoucloud.com/ |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxotypd/api/tax-bill-pool/add?access_token=访问令牌
Body: [{
	"data": {
		"djId": "2023092100001",
		"orgUnitId": "21212",
		"orgUnitCode": "1212123",
		"djName": "委外采购订单",
		"djNo": "CGDD2023092100001",
		"djType": "采购订单",
		"fplx": "1",
		"lyxt": "lyxt001",
		"ysjshj": 1.1,
		"jshj": 1.1,
		"je": 1.1,
		"se": 1.1,
		"zke": 1.1,
		"djzt": "已审核",
		"zdrId": "zhaoyunliang",
		"zdrName": "zhaoyunliang",
		"ywZdrq": "2023-09-21 11:11:11",
		"orderNo": "DD-2023092100001",
		"contractNo": "HT-2023092100001",
		"billVersion": "V1.0",
		"deliveryNo": "FH-2023092100001",
		"purchaseNo": "CG-2023092100001",
		"ywyId": "zhaoyunliang",
		"ywyCode": "123123",
		"ywy": "zhaoyunliang",
		"departmentId": "00001",
		"department": "采购部",
		"djbz": "客户需求一次性开票",
		"customerName": "用友网络科技股份有限公司",
		"customer_code": "00001",
		"customerId": "00001",
		"custNsrsbh": "91110000600001760P",
		"custDz": "北京市海淀区北清路68号",
		"custDh": "010-86396688",
		"custYh": "农业银行北清路支行",
		"custZh": "9998733321244",
		"custEmail": "shili@yonyou.com",
		"phoneNo": "13821111111",
		"billStationId": "000034",
		"orgCode": "000034",
		"orgType": "集团",
		"xsfMc": "用友网络科技股份有限公司",
		"xsfNsrsbh": "91110000600001760P",
		"xsfDz": "北京市海淀区北清路68号",
		"xsfDh": "010-86396688",
		"xsfYh": "农业银行北清路支行",
		"xsfZh": "9998733321244",
		"bz": "客户需求一次性开票",
		"skrId": "99982221",
		"skr": "刘玲",
		"fhrId": "99982221",
		"fhr": "刘玲",
		"kprId": "99982221",
		"kpr": "刘玲",
		"sjkprId": "99982221",
		"sjfhrId": "99982221",
		"sjdyrId": "99982221",
		"sjkpr": "刘玲",
		"sjfhr": "刘玲",
		"sjdyr": "刘玲",
		"accountStatus": "1",
		"accountTime": "2023-09-21 16:54:33",
		"accountNo": "098733333",
		"accountBz": "此凭证需要一次性开票",
		"zdybz": "此凭证需要一次性开票",
		"stampedCompany": "用友股份",
		"stampedCompanyId": "0000982",
		"billStationCode": "001",
		"ytenantId": "sdfghot983ue64222234df",
		"bdcdz": "",
		"kdsbz": "",
		"bdcdwdm": "",
		"wqhtbabh": "",
		"tdzzsxmbh": "",
		"hdjsjg": 0,
		"sjcjhsje": 0,
		"zlqq": "",
		"zlqz": "",
		"fdckfxmbh": "",
		"zrrbs": "",
		"yfpDm": "",
		"yfpHm": "",
		"hzxxbbh": "",
		"blueKprq": "2025-02-11",
		"hcyy": "",
		"items": [
			{
				"djId": "2023092100001",
				"djmxId": "2023092100001",
				"xmmc": "怡宝",
				"spbm": "111",
				"productId": "111",
				"spssflbm": "1010101010000000000",
				"ggxh": "111",
				"dw": "吨",
				"xmsl": 1.1,
				"xmhsdj": 1.1,
				"xmdj": 1.1,
				"jshj": 1.1,
				"ysjshj": 1.1,
				"sl": 1.1,
				"zke": 1.1,
				"custXmmc": "怡宝",
				"custGgxh": "123312",
				"bz": "有点甜",
				"ytenantId": "sdfghot983ue64222234df",
				"productClassCode": "001",
				"productClassId": "001",
				"productClassName": "001",
				"je": 10.1,
				"se": 1.1,
				"zzstsgl": "免税",
				"lslbs": "3",
				"yhzcbs": "0",
				"jzfwfsd": "",
				"jzxmmc": "",
				"cqzsbh": "",
				"detailMotor": {
					"cjhm": "",
					"cllx": "",
					"cpxh": "",
					"cd": "",
					"scqymc": "",
					"sfzhm": "",
					"hgzh": "",
					"jkzmsh": "",
					"sjdh": "",
					"fdjhm": "",
					"dunwei": "",
					"xcrs": "",
					"swjgdm": "",
					"swjgmc": "",
					"wspzh": ""
				}
			}
		]
	},
	"msgUrl": [
		{
			"djId": "CGDD2023092100001",
			"taxInvoiceWillUrl": "https://fapiao.yonyoucloud.com/",
			"invoiceUrl": "https://fapiao.yonyoucloud.com/",
			"delUrl": "https://fapiao.yonyoucloud.com/"
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：success |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	未知错误	未知错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

新增

请求参数 (5)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

