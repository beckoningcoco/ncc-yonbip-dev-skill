---
title: "固定资产调整弃审"
apiId: "2019194297913966600"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Information Adjustment"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Information Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调整弃审

>  请求方式	POST | Fixed Asset Information Adjustment (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/EFI/FixedAssetAdjustment/unaudit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	业务数据
id	string	否	是	固定资产调整id 示例：1483387421116596230

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetAdjustment/unaudit?access_token=访问令牌
Body: {
	"data": {
		"id": "1483387421116596230"
	}
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
code	string	否	返回状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回固定资产调整信息
code	string	否	调整单编码 示例：TZ010008
accentity	string	否	会计主体id 示例：1721730403489284099
dr	number
小数位数:0,最大长度:10	否	调整单主表删除状态，0：未删除，1：已删除 示例：0
vouchdate	string	否	单据日期 示例：2023-02-10
busiPostStatus	string	否	过账状态(0:未过账, 1:过账成功,2:过账失败3:过账中) 示例：3
details	object	是	固定资产调整单明细
busiObj	string	否	业务对象 示例：FixedAssetAdjustment
busiPostFailureReason	string	否	业务过账失败原因
cBillNo	string	否	单据billnum 示例：fa_fixedassetadjustment
id	string	否	id 示例：1741676283142078472
pubts	string	否	日期时间 示例：2024-06-13 14:17:16
billTypeId	string	否	单据类型id 示例：2314079661183488EFA
creator	string	否	创建人id 示例：edb903fc-43e8-4069-81fa-5690f911e499
auditor	string	否	审核人id 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
billTradeTypeId	string	否	交易类型id 示例：1625145041486349301
ytenantId	string	否	租户id 示例：0000LCAALQGPE642KN0000
verifyState	number
小数位数:0,最大长度:10	否	审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：2
auditTime	string	否	审核时间(单据审核后才有值) 示例：2024-06-13 14:17:17
sourceType	string	否	来源类型 示例：0
createTime	string	否	创建时间 示例：2023-06-05 17:36:20
auditor_userName	string	否	审核人 示例：默认用户

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "TZ010008",
		"accentity": "1721730403489284099",
		"dr": 0,
		"vouchdate": "2023-02-10",
		"busiPostStatus": "3",
		"details": [
			{
				"accentity": "1721730403489284099",
				"dr": 0,
				"blnTaxAcceleratedDepr": false,
				"addWayId": "1625145496765988874",
				"blnPreAdd": false,
				"beginTime": "2023-02-01",
				"id": "1741676283142078473",
				"ytenantId": "0000LCAALQGPE642KN0000",
				"name": {
					"zh_CN": "mm验证责任凭证"
				},
				"adjustType": "1",
				"adjustId": "1741676283142078472",
				"code": "0000230605010161",
				"bodies": [
					{
						"grpUnitDeprAmount": 0,
						"accumImpAmount": 20.22,
						"initOrgAccumDeprAmount": 0,
						"grpAccumDeprAmount": 0,
						"accbookStartDate": "2023-02-01",
						"accentity": "1721730403489284099",
						"grpPeriodDeprRate": 0,
						"oriValue": 2982.682,
						"id": "1741676283142078474",
						"orgYearDeprAmount": 10.11,
						"period": "2023-02",
						"lifeMonth": 3,
						"residualWorkload": 0,
						"accbook": "1721743855321612306",
						"createAssetDate": "2023-02-01",
						"isDepr": true,
						"grpNetValue": 0,
						"monthWorkload": 0,
						"grpYearDeprAmount": 0,
						"monthDeprRate": 0,
						"orgPeriodDeprRate": 0,
						"accbookCurrtypeId": "1721723737695322121",
						"gblNetAmount": 0,
						"orgScrapValueAmount": 29.98,
						"orgAccumDeprAmount": 10.11,
						"deprConvention": "1722893583716450307",
						"orgNetAmount": 2952.352,
						"pubts": "2023-06-05 17:36:45",
						"disposalConvention": "1722893583716450307",
						"periodId": "1658321095469039620",
						"creator": "edb903fc-43e8-4069-81fa-5690f911e499",
						"recoverableCostAmount": 2952.702,
						"grpNetAmount": 0,
						"grpCurYearImpAmount": 0,
						"totalWorkload": 0,
						"orgNetValue": 2972.572,
						"lifeYear": 3,
						"isMonthdepr": false,
						"createTime": "2023-06-05 17:36:45",
						"scrapValueType": "1",
						"accConvertParam": "2",
						"orgOriValueAmount": 2982.682,
						"adjustbaseId": "1741676283142078473",
						"dr": 0,
						"oricostAmount": 2982.682,
						"orgCurYearImpAmount": 20.22,
						"gblPeriodDeprAmount": 0,
						"exchangeRate": 1,
						"deprMethodId": "1625145505355923545",
						"curYearImpAmount": 20.22,
						"addedTaxAmount": 65.619,
						"gblPeriodDeprRate": 0,
						"orgCurrtypeId": "1721723737695322121",
						"deprAmount": 10.11,
						"assetCode": "0000230605010161",
						"initGblAccumDeprAmount": 0,
						"grpPeriodDeprAmount": 0,
						"netValue": 2972.572,
						"gblAccumDeprAmount": 0,
						"gblNetValue": 0,
						"gblUnitDeprAmount": 0,
						"deprStartDate": "2023-02-01",
						"ytenantId": "0000LCAALQGPE642KN0000",
						"taxRate": 2.2,
						"grpAccumImpAmount": 0,
						"existingWorkload": 0,
						"gblYearDeprAmount": 0,
						"assetCategoryId": "1721755022239203337",
						"gblCurYearImpAmount": 0,
						"yearDeprAmount": 10.11,
						"blnSuperDepr": true,
						"initDeprAmount": 0,
						"initGrpAccumDeprAmount": 0,
						"gblAccumImpAmount": 0,
						"accRateDate": "2023-02-01",
						"unitDeprAmount": 0,
						"fixedStatus": "1",
						"assetId": "1741670957382631439",
						"amortiAdjustDate": "2023-02-10",
						"fcOriValue": 1000.9,
						"orgUnitDeprAmount": 0,
						"direction": "0",
						"scrapValue": 29.98,
						"netAmount": 2952.352,
						"monthDeprAmount": 0,
						"exchangeRateType": "1721726993301504004",
						"orgAccumImpAmount": 20.22,
						"oriCurrtypeId": "1721725137854660610",
						"amortiAdjustMark": true,
						"srcCalculateId": "1741670957382631443",
						"isInit": false,
						"orgPeriodDeprAmount": 0,
						"workloadUnit": {
							"zh_CN": "天"
						}
					}
				],
				"assetId": "1741670957382631439",
				"fcOriValue": 1000.9,
				"pubts": "2023-06-05 17:36:45",
				"direction": "0",
				"creator": "edb903fc-43e8-4069-81fa-5690f911e499",
				"quantity": 8,
				"usageStateId": "1625145505355923470",
				"createTime": "2023-06-05 17:26:25",
				"assetModel": {
					"zh_CN": "大号"
				},
				"specification": {
					"zh_CN": "螺丝型"
				},
				"location": {
					"zh_CN": "仓库A"
				}
			}
		],
		"busiObj": "FixedAssetAdjustment",
		"busiPostFailureReason": "",
		"cBillNo": "fa_fixedassetadjustment",
		"id": "1741676283142078472",
		"pubts": "2024-06-13 14:17:16",
		"billTypeId": "2314079661183488EFA",
		"creator": "edb903fc-43e8-4069-81fa-5690f911e499",
		"auditor": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"billTradeTypeId": "1625145041486349301",
		"ytenantId": "0000LCAALQGPE642KN0000",
		"verifyState": 2,
		"auditTime": "2024-06-13 14:17:17",
		"sourceType": "0",
		"createTime": "2023-06-05 17:36:20",
		"auditor_userName": "默认用户"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	该单据为开立态，请先去提交！	输入有效且已审核的调整单id

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

