---
title: "采购合同列表高级查询(老架构)"
apiId: "e11655afbeaf484facb9e3cd5012b1ee"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Contract"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购合同列表高级查询(老架构)

>  请求方式	POST | Purchase Contract (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/contract/listByCriteria/
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
pageIndex	long	否	是	当前页数 示例：0 默认值：0
status	string	否	是	前端查询状态。purall：所有状态 ctpush：采购商待推单 supconfirm：采购商待供应商确认 purconfirm：采购商待我确认 ctconfirmed：采购商已确认 pusherp：已推ERP contractsx：已确认 示例：purconfirm 默认值：purall
pageSize	long	否	是	一页大小 示例：10 默认值：10
createBegindate	string	否	否	创建开始时间 示例：2021-03-03
billtype	string	否	否	合同类型。1：协议合同；2：普通合同 示例：2
settleType	string	否	否	结算方式 示例：1983875860107521
sourceType	string	否	否	合同来源。1：来源于自制 2：来源于超市 3：来源于询报价 4：来源于招投标 5：来源于期初补录 6：来源于采购需求 示例：1
billFiledType	string	否	否	合同归档类型。0：未归档1：已归档
createEnddate	string	否	否	创建结束时间 示例：2021-03-10
purPersonIds	string	是	否	采购员 示例：[2029185157812480]
supEnterpriseIds	string	是	否	供应商 示例：[71985]
orgIds	string	是	否	采购组织 示例：[1994210928480512]
materialIds	string	是	否	物料 示例：[2112644473032960]
subject	string	否	否	合同标题 示例：合同名称
projectName	string	否	否	项目名称
fuzzyName	string	否	否	低级查询时根据项目名称和合同名称模糊查询
billno	string	否	否	合同编码 示例：合同号
purContentType	string	否	否	采购内容类型。取自定义档案-采购内容编码。
extFields	object	否	否	后端解析自定义json
parentStatus	string	否	否	父标签状态。如果status为expired，noExpired，partExpired，则启用该字段，枚举等于status的枚举值。用于联合查询某个状态下的单据过期情况分布
isExpired	string	否	否	合同过期状态。0：未过期；1：已过期；2：部分过期 示例：0
isExecuteFinish	string	否	否	数量未执行完。0：数量执行完 1:数量未执行完 示例：1
reqDeptName	string	否	否	需求单位 示例：需求单位
contractStatus	string	否	否	合同单据状态。-1：作废 1：待买方推单 6：卖方已接受 7：卖方已拒绝 14：取消发布 17：待卖方确认 19：已推送ERP 20：已生效 21：已终止 示例：1
fbillstatus	string	否	否	审批状态。0：未提交；1：审批中；2：审批通过；3：审批拒绝 示例：1
updateBeginDate	string	否	否	修改开始时间 示例：2021-03-03
updateEndDate	string	否	否	修改结束时间 示例：2021-03-10

## 3. 请求示例

Url: /yonbip/cpu/contract/listByCriteria/?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"status": "purconfirm",
	"pageSize": 10,
	"createBegindate": "2021-03-03",
	"billtype": "2",
	"settleType": "1983875860107521",
	"sourceType": "1",
	"billFiledType": "",
	"createEnddate": "2021-03-10",
	"purPersonIds": [
		2029185157812480
	],
	"supEnterpriseIds": [
		71985
	],
	"orgIds": [
		1994210928480512
	],
	"materialIds": [
		2112644473032960
	],
	"subject": "合同名称",
	"projectName": "",
	"fuzzyName": "",
	"billno": "合同号",
	"purContentType": "",
	"extFields": {
		"parentStatus": ""
	},
	"isExpired": "0",
	"isExecuteFinish": "1",
	"reqDeptName": "需求单位",
	"contractStatus": "1",
	"fbillstatus": "1",
	"updateBeginDate": "2021-03-03",
	"updateEndDate": "2021-03-10"
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
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
status	long	否	请求返回状态 示例：1
data	object	否	请求返回数据
result	object	是	单据数据。未数组或查询为空时为null
pageIndex	long	否	当前页位置 示例：0
totalPage	long	否	总页数 示例：1
pageSize	long	否	当前页大小 示例：10
totalCount	long	否	总共查询数量 示例：1
expired	long	否	过期 示例：0
noExpired	long	否	未过期 示例：1
partExpired	long	否	部分过期 示例：0
msg	string	否	请求返回消息

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"status": 1,
		"data": {
			"result": [
				{
					"enterpriseId": 71612,
					"enterpriseName": "1102日常旗舰采购",
					"createTime": "2021-02-21 13:41:17",
					"modifiedtime": "",
					"creator": "1118571",
					"modifier": "",
					"tenantId": "",
					"dr": "",
					"ts": "2021-03-22 20:13:37",
					"title": "采购合同",
					"taxMoney": 121,
					"supEnterpriseName": "一般供应商档案名称",
					"orgName": "招标公司",
					"purPersonName": "13808120003",
					"contractProductList": "",
					"billno": "CT21022183610003",
					"isExpired": "0",
					"supMsgNotifierPhone": "",
					"supMsgNotifierId": 2014943966400769,
					"contractMaterialList": "",
					"orgId": "1994210928480512",
					"erpprojectId": "",
					"totalFullMoney": 0,
					"totalPartialMoney": 0,
					"intendPaymentmny": "",
					"practicalPaymentmny": "",
					"epayType": false,
					"contractPrepayList": "",
					"effectContract": "2",
					"arrivalBillNum": "",
					"paymentAgreementCode": "fqfk",
					"paymentAgreementName": "分期付款",
					"projectId": "",
					"deptName": "采购部",
					"controlType": "0",
					"furtureTemplate": "0",
					"payTypes": "",
					"orgScope": false,
					"signatureEffect": 0,
					"supplierDocId": 2014943966400768,
					"supplierId": "",
					"sourceType": "1",
					"offerType": "1",
					"dealPsnName": "13808120003",
					"isAllowAdjustPrice": "",
					"fbillstatus": "0",
					"reqUapProjectId": "",
					"projectName": "",
					"projectCode": "",
					"supPersionId": 2014943966400769,
					"supPersionName": "13311240001",
					"supPersonMobile": "13311240001",
					"supMsgNotifierName": "13311240001",
					"supPersonTel": "",
					"phone": "",
					"buyOfferId": "",
					"supplyPayment": "",
					"supplyDelivery": "",
					"quotaSupplys": 0,
					"quotaSupplyMny": "",
					"contractExpList": "",
					"erpCtCode": "",
					"erpCtid": "",
					"accPayApplyMoney": 0,
					"pricedecisionId": "",
					"billstatus": "1",
					"supEnterpriseId": 71798,
					"materialInfo": "普通 11.00",
					"erpUserCode": "",
					"deptId": "1994211378073856",
					"purPersonId": "1994212215263488",
					"shelfPeriod": "",
					"shelfRatio": "",
					"workPeriod": "",
					"isMaterialClass": "1",
					"money": 109.009,
					"vBuyOfferBillCode": "",
					"memo": "",
					"payAgreement": "",
					"currencyId": "G001ZM0000DEFAULTCURRENCT00000000001",
					"bankName": "",
					"bankAccountLink": "",
					"accountName": "",
					"bankAccountwf": "",
					"subscribedate": "2021-02-21 00:00:00",
					"actualvalidate": "2021-02-21 00:00:00",
					"actualinvalidate": "",
					"purContentType": "",
					"contractTermList": "",
					"erpProductVersion": "",
					"deliveryAddress": "",
					"totalnum": 11,
					"currencyCode": "CNY",
					"currencyName": "人民币",
					"totalMoney": "",
					"contractScopeList": "",
					"supplycode": "",
					"contractPayTermList": "",
					"settleType": "",
					"outerCTBillCode": "",
					"totalPayMny": "",
					"billstatusName": "待买方推单",
					"totalOutMnyRatio": "",
					"totalReqMnyRatio": "",
					"erpSaleCustName": "",
					"settleName": "",
					"billFiledType": "",
					"hasWorkFlow": false,
					"hasWorkFlow4Changing": false,
					"totalAccomplishedQuantity": 0,
					"erpOrgCode": "",
					"erpPersionCode": "",
					"erpSupId": "",
					"contractMaterialFour": "",
					"suppAddress": "",
					"taxNumber": "",
					"openBank": "",
					"bankAccount": "",
					"supFax": "",
					"bidder": "",
					"contactNumber": "",
					"projectAddress": "",
					"parentContractno": "",
					"parentContractId": "",
					"parentContractName": "",
					"thisEnterpriseHasERP": false,
					"signum": "",
					"inwhnum": "",
					"sigMoney": "",
					"inwhMoney": "",
					"orderBillNum": "",
					"attachmentIds": "",
					"senderLoginName": "",
					"supCorpAddress": "",
					"supLegalBody": "",
					"supTel": "",
					"execName": "",
					"supBank": "",
					"supBankAccount": "",
					"signAddress": "",
					"payAgreementId": "",
					"termTemplateId": "",
					"transtypeSource": "",
					"supplyname": "",
					"cancelDate": "",
					"terminateDate": "",
					"approveStartTime": "",
					"toProductStatus": "",
					"toProductRejectedReason": "",
					"erpSaleContractCode": "",
					"profitRate": "",
					"invoiceSupplierId": "",
					"invoiceSupplierCode": "",
					"invoiceSupplierName": "",
					"firstPartyId": "”1994210928480512”",
					"firstPartyName": "招标公司",
					"secondPartyId": "”2014943966400768“",
					"secondPartyName": "一般供应商档案名称",
					"sendErpStatus": "0",
					"isOriginBillCode": "",
					"contractAutoCode": false,
					"subject": "物料分类合同",
					"reason": "",
					"changingCommitterName": "",
					"changingInfo": "",
					"changingAction": "",
					"changingConfirmerName": "",
					"changeSignatureEffect": "",
					"ectId": "",
					"receiver": "",
					"receiveAddress": "",
					"addressName": "",
					"reqDeptName": "",
					"reqDeptId": "",
					"projectDocId": "",
					"receiveArea": "",
					"advanceRatio": 0,
					"ectFilePath": "",
					"purUserId": 1118571,
					"supplierSupName": "一般供应商档案名称",
					"purPersonTel": "",
					"purPersonMobile": "13808120003",
					"incomeExpenseCode": "",
					"incomeExpenseName": "",
					"logisticsCode": "",
					"changingVersion": "",
					"execType": "0",
					"changingStatus": "",
					"orgCode": "",
					"shortCode": "",
					"deliveryMethod": "",
					"cancelUserName": "",
					"cancelReason": "",
					"changingCommittedDate": "",
					"signatureStatus": "",
					"signatureFailMessage": "",
					"changingConfirmedDate": "",
					"agentConfirmPersonId": "",
					"agentConfirmPersonName": "",
					"agentConfirmDate": "",
					"changingRejectedReason": "",
					"ectBillCode": "",
					"ectOldBillCode": "",
					"ectTemplateName": "",
					"ectOldTemplateName": "",
					"ectOldId": "",
					"ectOldFilePath": "",
					"ectTemplateId": "",
					"ectOldTemplateId": "",
					"ectTemplateCode": "",
					"ectOldTemplateCode": "",
					"insideRemark": "",
					"termManualAddEnable": true,
					"changingCommittedReason": "",
					"purchaseMess": "",
					"materMess": "",
					"sumMoney": "",
					"sumSignumMoney": "",
					"sumNoSigMoney": "",
					"numberTotal": "",
					"sumSigNumber": "",
					"sumNoSigNumber": "",
					"ctPurContentName": "",
					"businessType": "",
					"billtype": "1",
					"transtypeCode": "pt",
					"transtypeName": "普通",
					"totalOutMny": "",
					"totalReqMny": "",
					"saleContractId": "",
					"invoiceAgreement": "",
					"approveEndTime": "",
					"supEmail": "",
					"terminateUserId": "",
					"terminateUserName": "",
					"terminateReason": "",
					"cancelUserId": "",
					"approveHistory": "",
					"erpprojectName": "",
					"taxlessPartialMoney": 0,
					"taxlessFullMoney": 0,
					"paymentAgreementId": 2014950306485504,
					"logisticsCompany": "",
					"logisticsCompanyCode": "",
					"sendErpMsg": "",
					"transtypeId": "2014948470018304",
					"erpSaleContractMny": "",
					"profitAmount": "",
					"classType": "",
					"purchasePer": "",
					"code": "CT21022183610003",
					"currencySymbol": "￥",
					"description": "",
					"id": 15,
					"enterPriseId_": 71612,
					"ytenantId": ""
				}
			],
			"pageIndex": 0,
			"totalPage": 1,
			"pageSize": 10,
			"totalCount": 1,
			"expired": 0,
			"noExpired": 1,
			"partExpired": 0
		},
		"msg": ""
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	查询失败	根据返回错误信息完善查询条件；向服务提供方咨询

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

