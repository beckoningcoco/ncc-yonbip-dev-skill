---
title: "固定资产处置保存"
apiId: "1815838832081240065"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Disposal"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Disposal]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产处置保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Disposal (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/disposal_bill/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billnum | string | 否 | 是 | 单据编码 示例：at_disposalbill 默认值：at_disposalbill |
| data | object | 否 | 是 | 保存数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 否 | 单据编码(手工输入，系统设置为处置单编码为手工编号时，导入以手工输入处置单编码为准； 系统设置为自动编号时，系统自动编号并替代输入的编号) 示例：DP002508 |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1796677711656648705 |
| accentity_code | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：gl00048 |
| vouchdate | string | 否 | 是 | 处置单日期,格式yyyy-MM-dd 示例：2022-09-30 |
| disposalType | int | 否 | 是 | 处置类型,枚举值：1-原值处置;2-数量处置 示例：1 |
| remark | string | 否 | 否 | 备注(字符,长度255) 示例：汽车报废 |
| _fromApi | boolean | 否 | 是 | 是否来源openapi,必须填true 示例：true 默认值：true |
| _status | string | 否 | 是 | 新增标识(必输:Insert) 示例：Insert 默认值：Insert |
| bodies | object | 是 | 是 | 处置表体明细 |

## 3. 请求示例

Url: /yonbip/EFI/disposal_bill/save?access_token=访问令牌
Body: {
	"billnum": "at_disposalbill",
	"data": {
		"resubmitCheckKey": "",
		"code": "DP002508",
		"accentity": "1796677711656648705",
		"accentity_code": "gl00048",
		"vouchdate": "2022-09-30",
		"disposalType": 1,
		"remark": "汽车报废",
		"_fromApi": true,
		"_status": "Insert",
		"bodies": [
			{
				"assetId": "1815806757245026320",
				"assetId_code": "gl00048",
				"accbook": "1796686164160675863",
				"accbook_code": "gl00048",
				"isDisposalcurdepr": true,
				"reduceDate": "2022-09-30",
				"reduceWayId": "1234455",
				"reduceWayId_code": "123",
				"disposalConvention": "1796029051344257025",
				"disposalAmount": 5,
				"orgDisposalOriValue": 100,
				"orgCleanIncomeTaxAmount": 100,
				"orgCleanCostAmount": 100,
				"orgTaxAmount": 100,
				"accRateTypeId": "1796029051344257025",
				"accRateTypeId_code": "10",
				"accRate": 1.5,
				"discription": "汽车报废",
				"disposalOriValue": 100,
				"cleanIncomeTaxAmount": 100,
				"cleanCostAmount": 100,
				"outputValueAddedTax": 100,
				"accRateOps": 1
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 返回信息描述 示例：操作成功 |
| data | object | 否 | 返回记录 |
| busiObj | string | 否 | 业务对象 示例：DisposalBill |
| code | string | 否 | 处置单编码 示例：DP002511 |
| disposalType | int | 否 | 处置类型 示例：1 |
| cBillNo | string | 否 | 单据编码 示例：at_disposalbill |
| accentity | string | 否 | 会计主体 示例：1796677711656648705 |
| dr | int | 否 | 逻辑删除标识 示例：0 |
| vouchdate | string | 否 | 处置单日期 示例：2022-11-30 |
| busiPostStatus | string | 否 | 过账状态(0-未过账,1-过账成功,2-过账失败,3-过账中) 示例：0 |
| accbookList | string | 否 | 单据处置卡片账薄集合 示例：1796686164160675863,1796687572892123150 |
| id | string | 否 | 处置单id 示例：1821011055021654017 |
| pubts | string | 否 | 处置单时间戳 示例：2023-09-20 15:06:29 |
| billTypeId | string | 否 | 单据类型 示例：HSFWGDZCYY3EFA |
| metaFullName | string | 否 | 元数据uri 示例：fa.fadisposalbill.DisposalBill |
| creator | string | 否 | 创建人 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| billTradeTypeId | string | 否 | 交易类型 示例：1795048785173282916 |
| fullName | string | 否 | 元数据对象全称 示例：fa.fadisposalbill.DisposalBill |
| ytenantId | string | 否 | 租户id 示例：0000LLDEYOZQHA5RER0000 |
| _status | int | 否 | 操作标识(0-新增) 示例：0 |
| verifyState | int | 否 | 单据状态(0-初始开立,1-审批中,2-审批完成,3-不通过流程终止,4-驳回到制单) 示例：1 |
| createTime | string | 否 | 创建时间 示例：2023-09-20 15:06:29 |
| _fromApi | boolean | 否 | 来源标识 示例：true |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| creator_userName | string | 否 | 创建用户名称 示例：默认用户 |
| remark | string | 否 | 备注 |
| transtypeId | string | 否 | 交易类型 示例：1795048785173282916 |
| bodies | object | 否 | 处置单明细数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busiObj": "DisposalBill",
		"code": "DP002511",
		"disposalType": 1,
		"cBillNo": "at_disposalbill",
		"accentity": "1796677711656648705",
		"dr": 0,
		"vouchdate": "2022-11-30",
		"busiPostStatus": "0",
		"accbookList": "1796686164160675863,1796687572892123150",
		"id": "1821011055021654017",
		"pubts": "2023-09-20 15:06:29",
		"billTypeId": "HSFWGDZCYY3EFA",
		"metaFullName": "fa.fadisposalbill.DisposalBill",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"billTradeTypeId": "1795048785173282916",
		"fullName": "fa.fadisposalbill.DisposalBill",
		"ytenantId": "0000LLDEYOZQHA5RER0000",
		"_status": 0,
		"verifyState": 1,
		"createTime": "2023-09-20 15:06:29",
		"_fromApi": true,
		"resubmitCheckKey": "",
		"creator_userName": "默认用户",
		"remark": "",
		"transtypeId": "1795048785173282916",
		"bodies": {
			"disposalAmount": 2,
			"oriValue": 100,
			"gainLossAmount": 100,
			"disposalNetValue": 100,
			"accbookSuperDepr": true,
			"id": "1821011063611588622",
			"period": "2022-11",
			"lifeMonth": 2,
			"accbook": "1796687572892123150",
			"_status": 0,
			"accAdjustDeprAmount": 100,
			"beforeNetAmount": 2,
			"inputValueAddedTax": 2,
			"accbookCurrtypeId": "1795048836713414690",
			"oriRemainRentAmount": 2,
			"beforeScrapValue": 2,
			"disposalBillId": "1821011055021654017",
			"pubts": "2023-09-20 15:06:29",
			"disposalConvention": "1821011055021654017",
			"outputValueAddedTax": 2,
			"periodId": "1821011055021654017",
			"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
			"calculateId": "1815806722885288683",
			"disposalDepreciation": 2,
			"reduceWayId": "1815806722885288683",
			"createTime": "2023-09-20 15:06:29",
			"accRemainUnreFinCharge": 2,
			"cleanIncomeTaxAmount": 2,
			"cleanCostAmount": 2,
			"disposalOriValue": 2,
			"disposalNetAmount": 2,
			"dr": 0,
			"beforeCurYearImpAmount": 2,
			"beforeDisposalDepr": 2,
			"disposalYearDeprAmount": 2,
			"metaFullName": "fa.fadisposalbill.DisposalBillDetail",
			"deprAmount": 2,
			"ytenantId": "0000LLDEYOZQHA5RER0000",
			"mgmtDeptId": "1796696033987133445",
			"beforeImpairmentAmount": 2,
			"reduceDate": "2022-11-30",
			"beforeDisposalOriValue": 2,
			"cleanIncomeAmount": 2,
			"oriRemainUnreFinCharge": 2,
			"resetStatus": "0",
			"disposalImpairmentAmount": 2,
			"assetId": "1815806722885288683",
			"scrapValue": 2,
			"blnWholeDisposal": true,
			"fullName": "fa.fadisposalbill.DisposalBillDetail",
			"beforeDisposalAmount": 3,
			"usageStateId": "1795882137672482856",
			"beforeYearDeprAmount": 2,
			"disposalCurYearImpAmount": 2,
			"beforeNetValue": 2,
			"accRemainRentAmount": 2,
			"disposalRate": 1.5,
			"verifystate": 1,
			"accbook_name": "第三",
			"accentity": "1795048810950950940",
			"orgCleanIncomeTaxAmount": 11,
			"orgTaxAmount": 11,
			"orgCleanCostAmount": 11,
			"accRate": 1.4,
			"accRateTypeId": "",
			"accConvertParam": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	保存操作出错	请调补充卡片缺少的账簿信息,重新保存


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-21

删除

请求参数 oriBillId

去除入参oriBillId【业务幂等id】

2	2025-12-11

新增

请求参数 oriBillId

3	2025-09-18

新增

请求参数 accRateOps

4	2025-06-26

更新

请求参数 (8)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

