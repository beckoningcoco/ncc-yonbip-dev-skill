---
title: "凭证保存接口"
apiId: "d4377b6fda764980866860ac4b63b092"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Voucher"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Voucher]
platform_version: "BIP"
source_type: community-api-docs
---

# 凭证保存接口

> `ContentType	application/json` 请求方式	POST | 分类: Voucher (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/fi/ficloud/openapi/voucher/addVoucher

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| businessId | string | 否 | 否 | 业务唯一标识，做业务幂等校验 示例：d009bb8c-f50d-11ef-a5f6-08c0ebd51606 |
| code | string | 否 | 否 | 凭证编码（长度不超过32） 示例：20241019000137 |
| srcSystemCode | string | 否 | 否 | 来源系统code(总账管理：figl，产品成本：fipcm，固定资产：assets， 汇兑损益：Revaluation，商业汇票：drft，现金管理：cmp， 应收管理：fiar，财务折算：figl_convert，期末结转：endcarry， 存货核算：fiia，产成品制造：fipcm，应付管理：fiap， 人力资源：hr_cloud，费控服务：znbz，成本中心：ficc， 损益结转：figl_profitaloss，产品成本（废弃）：ca，费用管理：fier) 示例：figl 默认值：figl |
| accbookCode | string | 否 | 是 | 账簿code 示例：dxbook003 |
| period | string | 否 | 否 | 会计期间（支持调整期） 示例：2025-03 |
| voucherTypeCode | string | 否 | 是 | 凭证类型code 示例：01 |
| billCode | int | 否 | 否 | 凭证号（传入空时，系统自增） 示例：111 |
| makerMobile | string | 否 | 否 | 制单人手机号（手机号和邮箱不能同时为空） 示例：18510047432 |
| makerEmail | string | 否 | 否 | 制单人邮箱（手机号和邮箱不能同时为空） 示例：liuyazh@yonyou.com |
| makeTime | string | 否 | 否 | 制单日期(默认当前系统时间) 格式为yyyy-MM-dd 示例：2021-08-25 |
| auditorMobile | string | 否 | 否 | 审核人手机号 |
| auditorEmail | string | 否 | 否 | 审核人邮箱 |
| tallymanEmail | string | 否 | 否 | 记账人邮箱 |
| auditorTime | string | 否 | 否 | 审核日期(默认当前系统时间) 格式为yyyy-MM-dd |
| signerMobile | string | 否 | 否 | 签字人手机号 |
| tallymanMobile | string | 否 | 否 | 记账人手机号 |
| tallyTime | string | 否 | 否 | 记账日期(默认当前系统时间) 格式为yyyy-MM-dd |
| signTime | string | 否 | 否 | 签字日期(默认当前系统时间) 格式为yyyy-MM-dd |
| signerEmail | string | 否 | 否 | 签字人邮箱 |
| attachedBill | int | 否 | 否 | 附单据数 示例：1 默认值：0 |
| description | string | 否 | 否 | 凭证头摘要 示例：凭证头摘要 |
| defInfo1 | string | 否 | 否 | 自定义扩展信息1 示例：自定义扩展信息1 |
| defInfo2 | string | 否 | 否 | 自定义扩展信息2 示例：自定义扩展信息2 |
| defInfo3 | string | 否 | 否 | 自定义扩展信息3 示例：自定义扩展信息3 |
| defInfo4 | string | 否 | 否 | 自定义扩展信息4 示例：自定义扩展信息4 |
| defInfo5 | string | 否 | 否 | 自定义扩展信息5 示例：自定义扩展信息5 |
| qtyAdjust | string | 否 | 否 | 数量调整凭证标识(1-是，0-否，默认0) 示例：0 默认值：0 |
| bodies | object | 是 | 是 | 凭证分录数组 |
| description | string | 否 | 是 | 摘要 示例：购买xx设备 |
| accsubjectCode | string | 否 | 是 | 科目编码 示例：1001 |
| price | BigDecimal | 否 | 否 | 单价 示例：15 |
| quantity | BigDecimal | 否 | 否 | 数量 示例：2 |
| currencyCode | string | 否 | 否 | 原币币种简称，默认账簿币种（本币币种） 示例：CNY |
| busidate | string | 否 | 否 | 业务日期（默认同制单时间）格式为yyyy-MM-dd 示例：2021-08-23 |
| rateType | string | 否 | 否 | 账簿币汇率类型（01基准类型，02自定义类型） 示例：01 |
| organizeRateTypeCode | string | 否 | 否 | 组织币汇率类型编码(开启组织币允许录入) 示例：CWGGZDH_ZZBHLLX1 |
| groupRatetypeCode | string | 否 | 否 | 集团币汇率类型编码(开启集团币允许录入) 示例：CWGGZDH_JTBHLLX1 |
| globalRatetypeCode | string | 否 | 否 | 全局币汇率类型编码(开启全局币允许录入) 示例：CWGGZDH_QJUHLLX1 |
| rateOrg | BigDecimal | 否 | 否 | 账簿币汇率 示例：1.0 |
| organizeRate | BigDecimal | 否 | 否 | 组织币汇率(开启组织币允许录入) 示例：1.0 |
| rateGroup | BigDecimal | 否 | 否 | 集团币汇率(开启集团币允许录入) 示例：1.0 |
| rateGlobal | BigDecimal | 否 | 否 | 全局币汇率(开启全局币允许录入) 示例：1.0 |
| debitOriginal | BigDecimal | 否 | 否 | 原币借方金额（借贷不能同时填写，原币本币都要填写） 示例：13.10 |
| creditOriginal | BigDecimal | 否 | 否 | 原币贷方金额（借贷不能同时填写，原币本币都要填写） 示例：13.10 |
| debitOrg | BigDecimal | 否 | 否 | 借方账簿本币金额（借贷不能同时填写，原币本币都要填写） 示例：13.10 |
| organizeDebitAmount | BigDecimal | 否 | 否 | 借方组织本币金额(开启组织币允许录入) 示例：13.10 |
| debitGroup | BigDecimal | 否 | 否 | 借方集团本币金额(开启集团币允许录入) 示例：13.10 |
| debitGlobal | BigDecimal | 否 | 否 | 借方全局本币金额(开启全局币允许录入) 示例：13.10 |
| creditOrg | BigDecimal | 否 | 否 | 贷方账簿本币金额（借贷不能同时填写，原币本币都要填写） 示例：13.10 |
| organizeCreditAmount | BigDecimal | 否 | 否 | 贷方组织本币金额(开启组织币允许录入) 示例：13.10 |
| creditGroup | BigDecimal | 否 | 否 | 贷方集团本币金额(开启集团币允许录入) 示例：13.10 |
| creditGlobal | BigDecimal | 否 | 否 | 贷方全局本币金额(开启全局币允许录入) 示例：13.10 |
| twoLevelAccentityCode | string | 否 | 否 | 内部核算单元会计主体code 示例：fwefqfe |
| settlementModeCode | string | 否 | 否 | 结算方式code 示例：02 |
| billTime | string | 否 | 否 | 票据日期 格式为yyyy-MM-dd 示例：2021-08-23 |
| billNo | string | 否 | 否 | 票据号 示例：1235 |
| bankVerifyCode | string | 否 | 否 | 银行对账码 示例：789703 |
| clientAuxiliaryList | object | 是 | 否 | 辅助核算数组 |
| rateOrgOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 账簿币汇率折算方式（1：乘，2:除） 示例：1 |
| cashflowList | object | 是 | 否 | 现金流量数组 |
| verifyNo | string | 否 | 否 | 核销号（长度不超过64） 示例：123 |
| measureDocCode | string | 否 | 否 | 计量单位档案编码 示例：123 |
| coordinationNo | string | 否 | 否 | 协同号（长度不超过50） 示例：GLCo012023031675182176261 |
| rateGroupOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 集团比汇率折算方式（1：乘，2:除） 示例：1 |
| rateGlobalOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 全局币汇率折算方式（1：乘，2:除） 示例：1 |
| organizeRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 组织币汇率折算方式（1：乘，2:除） 示例：1 |
| externalSourceDataId | string | 否 | 否 | 外部来源数据ID(必填) 示例：nc198127282 |
| externalSourceDataCode | string | 否 | 否 | 外部来源数据编码 示例：202501010002 |
| externalSourceDataType | string | 否 | 否 | 外部来源数据类型（必填） 示例：付款收据 |
| externalSourceSystemName | string | 否 | 否 | 外部来源系统 |
| externalSourceDataVersion | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 外部来源数据版本号(毫秒级别时间戳) |
| voucherStatus | string | 否 | 否 | 凭证状态（作废传05，正常00) |

## 3. 请求示例

Url: /yonbip/fi/ficloud/openapi/voucher/addVoucher?access_token=访问令牌
Body: {
	"businessId": "d009bb8c-f50d-11ef-a5f6-08c0ebd51606",
	"code": "20241019000137",
	"srcSystemCode": "figl",
	"accbookCode": "dxbook003",
	"period": "2025-03",
	"voucherTypeCode": "01",
	"billCode": 111,
	"makerMobile": "18510047432",
	"makerEmail": "liuyazh@yonyou.com",
	"makeTime": "2021-08-25",
	"auditorMobile": "",
	"auditorEmail": "",
	"tallymanEmail": "",
	"auditorTime": "",
	"signerMobile": "",
	"tallymanMobile": "",
	"tallyTime": "",
	"signTime": "",
	"signerEmail": "",
	"attachedBill": 1,
	"description": "凭证头摘要",
	"defInfo1": "自定义扩展信息1",
	"defInfo2": "自定义扩展信息2",
	"defInfo3": "自定义扩展信息3",
	"defInfo4": "自定义扩展信息4",
	"defInfo5": "自定义扩展信息5",
	"qtyAdjust": "0",
	"bodies": [
		{
			"description": "购买xx设备",
			"accsubjectCode": "1001",
			"price": 15,
			"quantity": 2,
			"currencyCode": "CNY",
			"busidate": "2021-08-23",
			"rateType": "01",
			"organizeRateTypeCode": "CWGGZDH_ZZBHLLX1",
			"groupRatetypeCode": "CWGGZDH_JTBHLLX1",
			"globalRatetypeCode": "CWGGZDH_QJUHLLX1",
			"rateOrg": 1,
			"organizeRate": 1,
			"rateGroup": 1,
			"rateGlobal": 1,
			"debitOriginal": 13.1,
			"creditOriginal": 13.1,
			"debitOrg": 13.1,
			"organizeDebitAmount": 13.1,
			"debitGroup": 13.1,
			"debitGlobal": 13.1,
			"creditOrg": 13.1,
			"organizeCreditAmount": 13.1,
			"creditGroup": 13.1,
			"creditGlobal": 13.1,
			"twoLevelAccentityCode": "fwefqfe",
			"settlementModeCode": "02",
			"billTime": "2021-08-23",
			"billNo": "1235",
			"bankVerifyCode": "789703",
			"clientAuxiliaryList": [
				{
					"filedCode": "000433",
					"valueCode": "0000000001"
				}
			],
			"rateOrgOps": 1,
			"cashflowList": [
				{
					"innerOrgCode": "AAA",
					"mainItemCode": "1111",
					"supItemCode": "031501",
					"amountOriginal": 12,
					"amountOrg": 12,
					"currencyCode": "CNY"
				}
			],
			"verifyNo": "123",
			"measureDocCode": "123",
			"coordinationNo": "GLCo012023031675182176261",
			"rateGroupOps": 1,
			"rateGlobalOps": 1,
			"organizeRateOps": 1
		}
	],
	"externalSourceDataId": "nc198127282",
	"externalSourceDataCode": "202501010002",
	"externalSourceDataType": "付款收据",
	"externalSourceSystemName": "",
	"externalSourceDataVersion": 0,
	"voucherStatus": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 响应码(200成功，404失败) 示例：200 |
| message | string | 否 | 响应信息 示例：OK |
| data | object | 否 | 响应数据（凭证关键信息） |
| voucherId | string | 否 | 凭证ID 示例：2A4556F6-1AD0-47BA-9378-572B9B57D2FD |
| voucherStatus | string | 否 | 凭证状态（00暂存，01保存，02错误，03已审核，04已记账，05作废） 示例：01 |
| period | string | 否 | 会计期间 示例：2021-08 |
| totalDebitOrg | BigDecimal | 否 | 借方本币合计金额 示例：12.00 |
| totalCreditOrg | BigDecimal | 否 | 贷方本币合计金额 示例：12.00 |
| billCode | int | 否 | 凭证号 示例：14 |
| accbook | object | 否 | 账簿对象 |
| voucherType | object | 否 | 凭证类型对象 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "OK",
	"data": {
		"voucherId": "2A4556F6-1AD0-47BA-9378-572B9B57D2FD",
		"voucherStatus": "01",
		"period": "2021-08",
		"totalDebitOrg": 12,
		"totalCreditOrg": 12,
		"billCode": 14,
		"accbook": {
			"id": "F87D4834-27D4-4A30-A931-2497105F475B",
			"code": "dxbook003",
			"name": "稻香账簿003"
		},
		"voucherType": {
			"id": "9A738945-F950-4F00-8C8C-EBB3364B41F4",
			"code": "",
			"name": "",
			"voucherstr": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

404	凭证保存不成功	凭证保存不成功参考message提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-01

新增

请求参数 twoLevelAccentityCode

更新

请求参数 (17)

删除

请求参数 secondOrgCode

支持内部核算单元

2	2025-11-26

新增

请求参数 (9)

凭证保存支持审核，签字，记账信息

3	2025-10-14

新增

请求参数 (5)

删除

请求参数 (4)

4	2025-09-19

更新

请求说明

新增

请求参数 (10)

单个凭证保存接口，基于code进行传参，该接口不支持更新


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

