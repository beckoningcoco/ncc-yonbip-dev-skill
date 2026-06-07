---
title: "固定资产调出弃审"
apiId: "2018500016451616775"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Transfer-Out"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer-Out]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调出弃审

>  请求方式	POST | Fixed Asset Transfer-Out (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/EFI/FaAllocateOut/unaudit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	业务数据
id	string	否	是	固定资产调出id 示例：1484072099013197834

## 3. 请求示例

Url: /yonbip/EFI/FaAllocateOut/unaudit?access_token=访问令牌
Body: {
	"data": {
		"id": "1484072099013197834"
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
data	object	否	调出数据信息
busiObj	string	否	业务对象 示例：FaAllocateOut
modifier	string	否	修改人id 示例：a766c878-bf70-4280-8a0f-404558a7582c
accentity	string	否	调出会计主体id 示例：1722168825175080964
dr	number
小数位数:0,最大长度:10	否	调出单主表删除状态，0：未删除，1：已删除 示例：0
allocatePriceType	string	否	调拨价格, 枚举(1:本币原值, 2:本币账面净值,3:本币账面价值,4:手工录入) 示例：2
modifyTime	string	否	修改时间 示例：2023-05-27 12:14:03
id	string	否	主键 示例：1734829976437915649
metaFullName	string	否	元数据全名 示例：EFA.allocate.FaAllocateOut
billTradeTypeId	string	否	单据交易类型id 示例：1656252235489214471
ytenantId	string	否	租户id 示例：0000LCAALQGPE642KN0000
verifyState	number
小数位数:0,最大长度:10	否	审核状态, 枚举值(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：0
auditTime	string	否	审核时间
FaAllocateOutDtlList	object	是	固定资产调出单明细信息
FaAllocateOutAssetList	object	是	固定资产调出单卡片明细信息
code	string	否	调出编码 示例：ZCDC000105
cBillNo	string	否	调出单据编码 示例：FaAllocateOut
allocateRequestId	string	否	调拨申请id 示例：1733407242753933316
inAccentityId	string	否	调入会计主体id 示例：1731985625739952135
vouchdate	string	否	单据日期 示例：2023-05-27
busiPostStatus	string	否	过账状态(0:未过账, 1:过账成功,2:过账失败3:过账中) 示例：0
billTypeId	string	否	单据类型Id 示例：1656248851054985221
creator	string	否	创建人id 示例：a766c878-bf70-4280-8a0f-404558a7582c
auditor	string	否	审核人id 示例：a766c878-bf70-4280-8a0f-404558a7582c
fullName	string	否	调出主表元数据名称 示例：EFA.allocate.FaAllocateOut
createTime	string	否	创建时间 示例：2023-05-27 12:11:42
verifystate	number
小数位数:0,最大长度:10	否	审核状态(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：0
auditor_userName	string	否	审核人 示例：张三

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busiObj": "FaAllocateOut",
		"modifier": "a766c878-bf70-4280-8a0f-404558a7582c",
		"accentity": "1722168825175080964",
		"dr": 0,
		"allocatePriceType": "2",
		"modifyTime": "2023-05-27 12:14:03",
		"id": "1734829976437915649",
		"metaFullName": "EFA.allocate.FaAllocateOut",
		"billTradeTypeId": "1656252235489214471",
		"ytenantId": "0000LCAALQGPE642KN0000",
		"verifyState": 0,
		"auditTime": "",
		"FaAllocateOutDtlList": [
			{
				"accRateTypeId": "0000LCAALQGPE642KN0000",
				"modifier": "a766c878-bf70-4280-8a0f-404558a7582c",
				"orgOriValueAmount": 60000.34,
				"assetCalcId": "1733403583441797131",
				"dr": 0,
				"orgRateTypeId": "0000LCAALQGPE642KN0000",
				"modifyTime": "2023-05-27 12:14:03",
				"accruedPeriod": 2,
				"accAccumImpAmount": 3600,
				"id": "1734829976437915650",
				"accNetAmount": 66000.408,
				"orgAllocateAmount": 58000.34,
				"metaFullName": "EFA.allocate.FaAllocateOutDtl",
				"orgCurrtypeId": "1625145024310673435",
				"lifeMonth": 0,
				"accNetValue": 69600.408,
				"createAssetDate": "2023-05-01",
				"allocateSettleCurrtypeId": "1625145024310673447",
				"ytenantId": "0000LCAALQGPE642KN0000",
				"accAccumDeprAmount": 2400,
				"accbookId": "1722191811835854853",
				"assetCategoryId": "1625145513945858056",
				"allocateOutId": "1734829976437915649",
				"settleAllocateAmount": 69600.408,
				"accbookCurrtypeId": "1625145024310673447",
				"accRate": 1.2,
				"orgAccumDeprAmount": 2000,
				"orgRate": 0.83333333,
				"assetId": "1733403583441797127",
				"accCurrtypeOriAmount": 72000.408,
				"orgNetAmount": 55000.34,
				"creator": "a766c878-bf70-4280-8a0f-404558a7582c",
				"fullName": "EFA.allocate.FaAllocateOutDtl",
				"orgNetValue": 58000.34,
				"lifeYear": 25,
				"beginDate": "2023-03-01",
				"reduceWayId": "1669612581654103717",
				"accAllocateIncome": 69600.408,
				"orgAccumImpAmount": 3000,
				"accAllocateAmount": 69600.408,
				"createTime": "2023-05-27 12:13:10"
			}
		],
		"FaAllocateOutAssetList": [
			{
				"dr": 0,
				"assetId": "1733403583441797127",
				"id": "1734829976437915651",
				"metaFullName": "EFA.allocate.FaAllocateOutAsset",
				"creator": "a766c878-bf70-4280-8a0f-404558a7582c",
				"quantity": 1,
				"fullName": "EFA.allocate.FaAllocateOutAsset",
				"ytenantId": "0000LCAALQGPE642KN0000",
				"createTime": "2023-05-27 12:13:10",
				"allocateOutId": "1734829976437915649"
			}
		],
		"code": "ZCDC000105",
		"cBillNo": "FaAllocateOut",
		"allocateRequestId": "1733407242753933316",
		"inAccentityId": "1731985625739952135",
		"vouchdate": "2023-05-27",
		"busiPostStatus": "0",
		"billTypeId": "1656248851054985221",
		"creator": "a766c878-bf70-4280-8a0f-404558a7582c",
		"auditor": "a766c878-bf70-4280-8a0f-404558a7582c",
		"fullName": "EFA.allocate.FaAllocateOut",
		"createTime": "2023-05-27 12:11:42",
		"verifystate": 0,
		"auditor_userName": "张三"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	该单据为开立态，请先去提交！	输入有效且未弃审的单据id

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-26	
更新
请求参数 id

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

