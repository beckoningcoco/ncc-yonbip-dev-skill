---
title: "采购合同新增V2"
apiId: "2463614054484148232"
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

# 采购合同新增V2

>  请求方式	POST | Purchase Contract (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/PCC/contract/save/v2
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	采购合同[cpu-contract.contract.ContractVO]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
_status	string	否	是	操作标识：Insert:新增、Update:更新、Unchanged：不改变 示例：Insert 默认值：Insert
id	string	否	否	采购合同主表id，新增时非必填，修改必填 示例：3710836108038403
code	string	否	否	采购合同code，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：CT202408200200
subject	string	否	是	采购合同名称，新增时必填，修改非必填 示例：采购合同01 默认值：采购合同新api
orgName	string	否	是	采购组织名称或编码，新增时必填，修改非必填 示例：采购组织
transtypeName	string	否	是	交易类型名称或编码，新增时必填，修改非必填 示例：交易类型
supplierSupName	string	否	是	供应商名称或编码，新增时必填，修改非必填 示例：供应商
supPersionName	string	否	否	供应商联系人名称或编码 示例：张伟
firstPartyName	string	否	否	甲方名称或编码 示例：采购公司
purContactPersonName	string	否	否	甲方联系人名称或编码 示例：李华
secondPartyName	string	否	否	乙方名称或编码 示例：生产公司
supMsgNotifierName	string	否	否	乙方联系人名称或编码 示例：张伟
supPersonMobile	string	否	否	供应商联系人手机号 示例：15800001111
deptName	string	否	是	采购部门名称或编码，新增时必填，修改非必填 示例：采购部门
purPersonName	string	否	是	采购员名称或编码，新增时必填，修改非必填 示例：采购员
ctPurContentName	string	否	否	采购内容名称或编码
settlementBasis	number
小数位数:0,最大长度:1	否	是	结算依据：0:订单结算，1:项目清单结算，2:项目里程碑结算，新增时必填，修改非必填 示例：0 默认值：0
collaborativeProcesse	number
小数位数:0,最大长度:1	否	是	协同流程：0：先协同后审批，1：先审批后协同，新增时必填，修改非必填 示例：0 默认值：0
sourceType	string	否	否	合同来源：1：自制，3：询报价，4：招投标，5：期初补录，7：请购单，8：采购需求，9：委外申请单，10：竞拍 示例：1 默认值：1
billtype	string	否	是	合同性质：1：框架协议，2：普通合同，新增时必填，修改非必填 示例：2 默认值：2
controlType	string	否	否	合同签订形式：0:标准合同,1:单价合同,2:数量合同,3:金额合同 示例：0 默认值：0
isMultiParty	string	否	否	是否多方合同：0：否，1：是 示例：0 默认值：0
effectContract	string	否	是	是否需要与供应商协同：1：是，2：否 示例：2 默认值：2
billcategoryName	string	否	否	合同类型名称或编码
businessType	string	否	是	业务类型：0：普通，1：VMI，2：全程委外，3：工序委外，新增时必填，修改非必填 示例：0 默认值：0
execType	string	否	否	是否可超数量执行：0：否，1：是 示例：0 默认值：0
isAllowAdjustPrice	string	否	否	是否允许订单调价：0：否，1：是 示例：0
subscribedate	string	否	是	合同签订日期，新增时必填，修改非必填 示例：2026-01-30
actualvalidate	string	否	是	合同生效日期，新增时必填，修改非必填 示例：2026-01-30
actualinvalidate	string	否	否	合同终止日期 示例：2026-01-30
isMaterialClass	string	否	是	是否物料分类：0：否，1：是，新增时必填，修改非必填 示例：0 默认值：0
orgScope	boolean	否	否	适用于所有组织 示例：false 默认值：false
epayType	boolean	否	是	是否超合同付款 示例：false 默认值：false
moneyControlType	string	否	否	金额控制方式：0：不控制，1：整单控制 示例：0
moneyRatio	number
小数位数:8,最大长度:28	否	否	金额超量比例%
parentContractName	string	否	否	父合同名称或编码
outerCTBillCode	string	否	否	外部合同号
priceStructure	string	否	否	价格构成：1：阶梯价格，2：成本项价格，3：阶梯价格+成本项价格
serviceConfirMode	string	否	否	服务确认方式：0：按物料明细确认，1：按付款协议确认 示例：0
internalFileId	string	否	否	内控附件
externalFileId	string	否	否	外部附件
stockStampFileId	string	否	否	采购商盖章合同附件
projectName	string	否	否	项目名称或编码 示例：项目名称
signAddress	string	否	否	签订地点
invoiceAgreement	string	否	否	发票协议
receiveArea	string	否	否	区域
receiver	string	否	否	收货人
phone	string	否	否	收货人联系方式
projectAddress	string	否	否	项目详细地址
payAgreement	string	否	否	付款协议名称或编码
shelfPeriod	string	否	否	质保期
shelfRatio	number
小数位数:8,最大长度:28	否	否	质保金
workPeriod	string	否	否	工期
eContractCreateType	string	否	是	合同生成方式：0：基于模板生成，1：非制式合同上传，2：不生成，新增时必填，修改非必填 示例：2 默认值：2
ctTplName	string	否	否	合同模板
eContractFileName	string	否	否	电子合同文件名称
nonStandardFileId	string	否	否	非制式合同附件
eContractbCanModify	boolean	否	否	电子合同可编辑 示例：false
otherStampFileId	string	否	否	其他需签署附件
signFlow	string	否	否	签署流程：1：双方签署(供应商先签)，2：双方签署(采购商先签)，3：单方签署(采购商签署)
signatureEffect	string	否	否	是否签章生效：0：否，1：是 示例：0
signOffline	number
小数位数:0,最大长度:1	否	否	是否线下签署：0：否，1：是 示例：0
currencyName	string	否	是	币种名称或编码，新增时必填，修改非必填 示例：CNY
exchRateDate	string	否	否	汇率日期 示例：2026-02-02
natCurrency_name	string	否	否	本币名称或编码
exchRate	number
小数位数:8,最大长度:28	否	否	汇率
exchRateOps	number
小数位数:0,最大长度:1	否	否	汇率折算方式：1：*，2：/ 示例：1
exchRateType_name	string	否	否	汇率类型名称或编码
settleName	string	否	否	结算方式名称或编码
taxMoney	number
小数位数:8,最大长度:28	否	否	含税金额 示例：10000
money	number
小数位数:8,最大长度:28	否	否	无税金额 示例：8000
singleBudgetApplyId_code	string	否	否	单项预算申请单编号
insideRemark	string	否	否	内审备注 示例：内审备注
memo	string	否	否	备注 示例：备注
contractMaterialList	object	否	是	物料基本信息子表
contractPayTermList	object	否	否	付款协议信息子表
contractScopeList	object	否	否	合同执行组织范围子表
contractPartyList	object	否	否	合同相对方子表

## 3. 请求示例

Url: /yonbip/PCC/contract/save/v2?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"_status": "Insert",
		"id": "3710836108038403",
		"code": "CT202408200200",
		"subject": "采购合同01",
		"orgName": "采购组织",
		"transtypeName": "交易类型",
		"supplierSupName": "供应商",
		"supPersionName": "张伟",
		"firstPartyName": "采购公司",
		"purContactPersonName": "李华",
		"secondPartyName": "生产公司",
		"supMsgNotifierName": "张伟",
		"supPersonMobile": "15800001111",
		"deptName": "采购部门",
		"purPersonName": "采购员",
		"ctPurContentName": "",
		"settlementBasis": 0,
		"collaborativeProcesse": 0,
		"sourceType": "1",
		"billtype": "2",
		"controlType": "0",
		"isMultiParty": "0",
		"effectContract": "2",
		"billcategoryName": "",
		"businessType": "0",
		"execType": "0",
		"isAllowAdjustPrice": "0",
		"subscribedate": "2026-01-30",
		"actualvalidate": "2026-01-30",
		"actualinvalidate": "2026-01-30",
		"isMaterialClass": "0",
		"orgScope": false,
		"epayType": false,
		"moneyControlType": "0",
		"moneyRatio": 0,
		"parentContractName": "",
		"outerCTBillCode": "",
		"priceStructure": "",
		"serviceConfirMode": "0",
		"internalFileId": "",
		"externalFileId": "",
		"stockStampFileId": "",
		"projectName": "项目名称",
		"signAddress": "",
		"invoiceAgreement": "",
		"receiveArea": "",
		"receiver": "",
		"phone": "",
		"projectAddress": "",
		"payAgreement": "",
		"shelfPeriod": "",
		"shelfRatio": 0,
		"workPeriod": "",
		"eContractCreateType": "2",
		"ctTplName": "",
		"eContractFileName": "",
		"nonStandardFileId": "",
		"eContractbCanModify": false,
		"otherStampFileId": "",
		"signFlow": "",
		"signatureEffect": "0",
		"signOffline": 0,
		"currencyName": "CNY",
		"exchRateDate": "2026-02-02",
		"natCurrency_name": "",
		"exchRate": 0,
		"exchRateOps": 1,
		"exchRateType_name": "",
		"settleName": "",
		"taxMoney": 10000,
		"money": 8000,
		"singleBudgetApplyId_code": "",
		"insideRemark": "内审备注",
		"memo": "备注",
		"contractMaterialList": {
			"_status": "Insert",
			"id": "3710836108038404",
			"rowNum": 0,
			"materialName": "",
			"materialClassName": "",
			"purchaseNum": 0,
			"purchaseUnitName": "",
			"purchaseExchRate": 0,
			"num": 0,
			"unit": "",
			"priceExchRate": 0,
			"mainNum": 0,
			"mainMetrologyName": "",
			"priceExchRateNum": 0,
			"priceExchRateDen": 0,
			"purchaseExchRateNum": 0,
			"purchaseExchRateDen": 0,
			"taxPrice": 0,
			"price": 0,
			"taxMoney": 0,
			"money": 0,
			"tax": 0,
			"taxrateCode": "VATR1",
			"taxCodeId_taxCode": "",
			"natTaxMoney": 0,
			"natMoney": 0,
			"natTaxPrice": 0,
			"natPrice": 0,
			"natTax": 0,
			"discountTaxType": 0,
			"priceMark": 0,
			"deliveryAddress": "",
			"planArriveDate": "2026-01-30",
			"priceValidateStartdate": "2026-01-30",
			"priceValidateDate": "2026-01-30",
			"materialDesc": "",
			"brand": "",
			"receiveOrgName": "",
			"receivePersonName": "",
			"overExecRate": 0,
			"allowIncreasePriceRatio": 0,
			"allowDecreasePriceRatio": 0,
			"takerOrgName": "",
			"reqOrgName": "",
			"reqDeptName": "",
			"reqContact": "",
			"reqDate": "2026-01-30",
			"skuName": "",
			"gift": "0",
			"quotaProportion": 0,
			"quotaPercentage": 0,
			"qualitypriceName": "",
			"formulaName": "",
			"expenseItemId_name": "",
			"singleBudgetApplyBid": "",
			"dimensionPricingId": "",
			"costQuoteGroupId": "",
			"priceStrategyName": "",
			"costCenterId_name": "",
			"projectName": "",
			"wbs_name": "",
			"activity_name": "",
			"isOnShelf": true,
			"processesName": "",
			"costTemplateName": "",
			"memo": "",
			"makeRuleCode": "",
			"source": "",
			"sourceautoid": "",
			"sourceid": ""
		},
		"contractPayTermList": {
			"_status": "Insert",
			"id": "3710836108038405",
			"payPeriod": 1,
			"payName": "付款1",
			"payPointName": "ContractAwardDate",
			"settleTypeName": "system_0001",
			"payRatio": 100,
			"payTaxMoney": 10000,
			"advancePay": false,
			"shelf": false,
			"isProgressConfirm": "",
			"initialDate": "2026-01-30",
			"dueDate": "2027-01-30",
			"outDay": "2027-01-30",
			"accountingUnit": "0",
			"payPointAfterDayNew": "",
			"delayDay": 0,
			"delayMonth": 0,
			"outDayType": "0",
			"fixedoutDay": "",
			"fixedoutDay1": "",
			"fixedoutDay2": "",
			"fixedoutDay3": "",
			"fixedoutDay4": "",
			"dueDateType": "0",
			"fixedexpireDay": "",
			"fixedexpireDay1": "",
			"fixedexpireDay2": "",
			"fixedexpireDay3": "",
			"fixedexpireDay4": "",
			"prePayType": "",
			"intendPaymentmny": 0,
			"practicalPaymentmny": 0,
			"accPayApplyMoney": 0,
			"totalPayContractMoney": 0,
			"memo": ""
		},
		"contractScopeList": {
			"_status": "Insert",
			"id": "",
			"puorgName": ""
		},
		"contractPartyList": {
			"_status": "Insert",
			"id": "",
			"type": "",
			"orgIdName": "",
			"supplydocId_name": "",
			"customerId_name": "",
			"signOrder": 0,
			"onlineSign": true,
			"phone": "",
			"address": "",
			"memo": ""
		}
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
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	number
小数位数:0,最大长度:38	否	返回状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
id	string	否	采购合同主表id 示例：2430318944302661634
orgName	string	否	采购组织 示例：采购组织
billno	string	否	采购合同code 示例：HT202512190027
subject	string	否	合同名称 示例：采购合同
sourceType	string	否	合同来源：1：自制，3：询报价，4：招投标，5：期初补录，7：请购单，8：采购需求，9：委外申请单，10：竞拍 示例：1
receiveArea	string	否	区域
bizFlow	string	否	流程id
bizFlowName	string	否	流程名称
receiver	string	否	收货人
signatureEffect	string	否	是否签章生效
isFlowCoreBill	string	否	是否流程核心单据
paymentBasis	string	否	付款依据
ctjlId	string	否	合同台账ID
signOffline	string	否	是否线下签署：0：否，1：是 示例：0
ectTemplateName	string	否	电子合同模板
phone	string	否	收货人联系方式
signFlow	string	否	签署流程
exchRateDate	string	否	汇率日期
collaborativeProcesse	string	否	协同流程
settlementBasis	string	否	结算依据
templateId	string	否	采购模板id
serviceConfirMode	string	否	服务确认方式
eContractFileName	string	否	电子合同文件名称
projectAddress	string	否	项目详细地址
eContractFileId	string	否	电子合同附件
exchRate	string	否	汇率
exchRateOps	string	否	汇率折算方式
eContractWordFileId	string	否	电子合同word附件
billTemplateId	string	否	采购模板id
natTaxMoney	string	否	本币价税合计
code	string	否	合同编码
nonStandardFileId	string	否	非制式合同附件
natMoney	string	否	本币无税总金额
ctjlCode	string	否	统一合同编号
otherStampFileId	string	否	其他需签署附件
currencyName	string	否	币种
signedFileId	string	否	已签署合同附件
supplierSupCode	string	否	供应商编码
eContractCreateType	string	否	合同生成方式：0：基于模板生成，1：非制式合同上传，2：不生成
eContractbCanModify	string	否	电子合同可编辑
ctTplId	string	否	合同模板ID
ctTplName	string	否	合同模板
money	string	否	无税金额
taxMoney	string	否	含税金额
cumulativeMoney	string	否	累计下单无税金额
cumulativeTaxMoney	string	否	累计下单含税金额
settleTypeId	string	否	结算方式
refuseSignReason	string	否	拒签原因
isPUMdd	string	否	是否供应链连用
signStatus	string	否	签署状态
isShowAuditModifyBtn	string	否	展示审批中变更按钮
settleType	string	否	结算方式
submitSignPerson	string	否	提交签署人
settleName	string	否	结算方式
showErp	string	否	显示推erp按钮
pubts	string	否	时间戳
autoEffect	string	否	显示生效按钮
payAgreement	string	否	付款协议
submitSignTime	string	否	提交签署时间
showYcOrder	string	否	展示下推云采采购订单按钮
signerName	string	否	当前签署人
shelfPeriod	string	否	质保期
shelfRatio	string	否	质保金
workPeriod	string	否	工期
bAllowConsult	string	否	是否与供应商磋商
invoiceAgreement	string	否	发票协议
transtypeName	string	否	交易类型
singleBudgetApplyId	string	否	单项预算申请单
supplierSupTaxRate	string	否	供应商税率
supplierSupTaxRateId	string	否	供应商税率id
isPushPaycontract	string	否	是否推支出合同
fbillstatus	string	否	审批状态
modifiedtime	string	否	修改时间
billstatus	string	否	单据状态
toProductStatus	string	否	合同生成商品流程状态
singleBudgetApplyId_code	string	否	单项预算申请单编号
contractStatus	string	否	合同单据状态
pushPaycontractStatus	string	否	推支出合同状态
collabStatus	string	否	协同状态
supplierSupName	string	否	供应商
offerType	string	否	价格类型
creator	string	否	创建人
sendErpStatus	string	否	erp协同状态
ctChangeStatus	string	否	合同变更状态
billcategory	string	否	合同类型id
sendChangeErpStatus	string	否	合同变更协同ERP状态
billcategoryCode	string	否	合同类型编码
creatorId	string	否	创建人id
deptCode	string	否	采购部门编码
billtype	string	否	合同性质
signFinishTime	string	否	签署完成时间
ts	string	否	时间戳
paymentAgreementCode	string	否	付款编码
purPersonCode	string	否	采购员编码
erpProductVersion	string	否	ERP产品及版本
payTypes	string	否	结算方式
billcategoryName	string	否	合同类型
deptName	string	否	采购部门
accPayApplyMoney	string	否	累计付款申请金额
enterpriseId	string	否	租户id
purPersonMobile	string	否	采购员手机号
enterpriseName	string	否	租户名称
purPersonName	string	否	采购员
createTime	string	否	合同创建时间
supEnterpriseId	string	否	供应商的租户id
supplierId	string	否	供应商id
externalFileId	string	否	外部附件
ctPurContentName	string	否	采购内容
internalFileId	string	否	内控附件
isMultiParty	string	否	是否多方合同
supPersionId	string	否	供应商联系人id
stockStampFileId	string	否	采购商盖章合同附件
supplyType	string	否	供应商类型
saleStampFileId	string	否	供应商盖章合同附件
businessType	string	否	业务类型
supPersionName	string	否	供应商联系人
saleFileId	string	否	供应商附件
controlType	string	否	合同签订形式
ctTermsData	string	否	合同条款数据
supPersonTel	string	否	供应商联系人座机
parentContractName	string	否	父合同
supPersonMobile	string	否	供应商联系人手机号
subscribedate	string	否	合同签订日期
orgId	string	否	采购组织
actualvalidate	string	否	合同生效日期
firstPartyId	string	否	甲方id
secondPartyId	string	否	乙方id
actualinvalidate	string	否	合同终止日期
reqUapProjectId	string	否	平台项目档案id
secondPartyId_name	string	否	乙方
ctTplCode	string	否	合同模板编码
purPersonId	string	否	采购员id
effectContract	string	否	是否需要与供应商协同
isMaterialClass	string	否	是否物料分类合同
purBipUserId	string	否	采购员用户id
isAllowAdjustPrice	string	否	是否允许订单调价
moneyControlType	string	否	金额控制方式
moneyRatio	string	否	金额超量比例%
purPersonTel	string	否	采购员座机电话
execType	string	否	是否可超数量执行
ctSignId	string	否	签署流程ID
executionStatus	string	否	执行状态
intendPaymentmny	string	否	累计预付金额
purContactPersonId	string	否	甲方联系人id
practicalPaymentmny	string	否	累计实付金额
paymentExcessControl	string	否	付款超额控制
totalPayContractMoney	string	否	累计付款申请金额
epayType	string	否	是否超合同付款
signatureFailMessage	string	否	签章失败原因
vBuyOfferBillCode	string	否	询价单号
description	string	否	说明
eContractServiceType	string	否	合同服务类型
totalnum	string	否	总数量
ctTplVersion	string	否	合同模板版本
dealPsnName	string	否	处理人
ectFilePath	string	否	电子合同
priceStructure	string	否	价格构成
firstPartyName	string	否	甲方名称
purContactPersonName	string	否	甲方联系人名称
billFiledType	string	否	归档状态
supMsgNotifierName	string	否	乙方联系人
secondPartyName	string	否	乙方
signAddress	string	否	签订地点
isUseTaxEngine	string	否	是否高级计税
orgScope	string	否	适用于所有组织
outerCTBillCode	string	否	外部合同号
ectBillCode	string	否	电子合同编码
reason	string	否	拒绝理由
deptId	string	否	采购部门
totalPayMny	string	否	累计付款总额
supplyPayment	string	否	付款条件
supplyDelivery	string	否	交货说明
quotaSupplyMny	string	否	供应商首次报价总金额
quotaSupplys	string	否	供应商报价家数
furtureTemplate	string	否	确认是否启用期货报价模板 1表示使用期货报价模板 0表示用之前的报价
agentConfirmPersonId	string	否	代确认人id
approveEndTime	string	否	审批通过时间
filedStatus	string	否	归档状态
advanceRatio	string	否	预付比例
econtractCreateDate	string	否	电子合同生成时间
processId	string	否	签章流程id
filedTime	string	否	归档时间
contractPreviewUrl	string	否	合同签章查看地址
totalFullMoney	string	否	全额预付总价
filedPersonId_name	string	否	归档人
contractPreviewSign	string	否	签署预览组件
createDate	string	否	创建日期
currencySymbol	string	否	币种符号
currencyCode	string	否	币种编码
modifier	string	否	修改人
modifierId	string	否	修改人id
modifyTime	string	否	修改时间
modifyDate	string	否	修改日期
currencyId	string	否	币种id
submitter_username	string	否	提交人
submitTime	string	否	提交时间
pricedigit	string	否	单价精度
moneydigit	string	否	金额精度
pricerount	string	否	单价取舍规则
auditor	string	否	审核人
auditorId	string	否	审核人Id
auditDate	string	否	审核日期
moneyrount	string	否	金额取舍规则
auditTime	string	否	审核时间
actualValiUserIdName	string	否	生效人
actualValiUserId	string	否	生效人ID
actualValiSysDate	string	否	系统生效时间
payAgreementId	string	否	付款协议ID
pushPaycontractFailReason	string	否	推支出合同失败原因
natCurrency	string	否	本币
natCurrency_name	string	否	本币名称
natCurrency_priceDigit	string	否	本币单价精度
natCurrency_moneyDigit	string	否	本币金额精度
natCurrency_priceRount	string	否	本币单价取舍规则
natCurrency_moneyRount	string	否	本币金额取舍规则
natCurrency_code	string	否	本币编码
exchRateType	string	否	汇率类型id
exchRateType_name	string	否	汇率类型
exchRateType_Digit	string	否	汇率类型精度
totalPartialMoney	string	否	部分预付总价
agentConfirmPersonName	string	否	代确认人
deliveryAddress	string	否	收货地址
receiveAddress	string	否	收货地址
agentConfirmDate	string	否	代确认时间
addressName	string	否	地址名称
deliveryMethod	string	否	邮寄方式
logisticsCompany	string	否	物流公司
logisticsCode	string	否	物流单号
sendErpMsg	string	否	ERP失败原因
erpCtid	string	否	ERP合同主键
erpCtCode	string	否	ERP编号
memo	string	否	备注
printCount	string	否	打印次数
purContentType	string	否	采购内容
purContentTypeId	string	否	采购内容
parentContractno	string	否	父合同编码
parentContractId	string	否	父合同ID
taxlessFullMoney	string	否	无税总价全额预付
taxlessPartialMoney	string	否	无税总价部分预付
transtypeCode	string	否	交易类型编码
transtypeId	string	否	合同分类id
transtypeSource	string	否	合同交易类型是否来源于上游
termManualAddEnable	string	否	条款模板条款是否可手工增加
termTemplateId	string	否	条款模板id
ectTemplateCode	string	否	电子合同模板编号
logisticsCompanyCode	string	否	物流公司id
orgCode	string	否	组织编码
ycdop	string	否	电子合同
signatureStatus	string	否	签章状态
changingCommitterName	string	否	变更人
changingCommittedDate	string	否	变更时间
changingCommittedReason	string	否	变更理由
changingConfirmerName	string	否	变更确认人
isWfControlled	string	否	是否审批流控制
returncount	string	否	退回次数
verifystate	string	否	审批状态
changingConfirmedDate	string	否	变更确认时间
changingRejectedReason	string	否	变更被拒绝原因
changingStatus	string	否	变更状态
changingAction	string	否	变更动作：终止合同、变更合同
changingVersion	string	否	当前变更版本
changingInfo	string	否	变更信息
cancelType	string	否	履约状态变更类型
filedPersonId	string	否	归档人id
cancelReason	string	否	作废原因
cancelBipUserId	string	否	作废人id
cancelUserName	string	否	作废人名称
cancelDate	string	否	作废日期
terminateCloseBipUserId	string	否	关闭人id
terminateUserName	string	否	关闭/终止人名称
chgStateReasonId	string	否	履约状态变更原因档案ID
terminateCloseUserName	string	否	关闭人名称
terminateReason	string	否	关闭/终止原因
chgStateReasonId_reason	string	否	履约状态变更原因
terminateCloseReason	string	否	关闭理由
chgStateMemo	string	否	履约状态变更说明
terminateAction	string	否	终止动作
chgStateFileId	string	否	履约状态变更附件
terminateDate	string	否	关闭/终止日期
chgStateUserId	string	否	履约状态变更人id
terminateCloseDate	string	否	关闭日期
dealPsnId	string	否	处理人id
chgStateDate	string	否	履约状态变更日期
chgStateUserName	string	否	履约状态变更用户
ectId	string	否	电子合同ID
hasWorkFlow	string	否	是否有审批流
totalAccomplishedQuantity	string	否	已执行数量
supMsgNotifierId	string	否	消息通知人id
insideRemark	string	否	内审备注
payment_process	string	否	付款流程
legalType	string	否	合同法律类别ID
paymentDimension	string	否	付款维度
legalTypeCode	string	否	合同法律类别编码
legalTypeName	string	否	合同法律类别
contractMaterialList	object	是	物料基本信息子表
contractPayTermList	object	是	付款协议信息子表
contractPrepayList	object	是	采购合同付款单子表
contractScopeList	object	是	合同执行组织范围子表
contractPartyList	object	是	合同签署方子表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2430318944302661634",
		"orgName": "采购组织",
		"billno": "HT202512190027",
		"subject": "采购合同",
		"sourceType": "1",
		"receiveArea": "",
		"bizFlow": "",
		"bizFlowName": "",
		"receiver": "",
		"signatureEffect": "",
		"isFlowCoreBill": "",
		"paymentBasis": "",
		"ctjlId": "",
		"signOffline": "0",
		"ectTemplateName": "",
		"phone": "",
		"signFlow": "",
		"exchRateDate": "",
		"collaborativeProcesse": "",
		"settlementBasis": "",
		"templateId": "",
		"serviceConfirMode": "",
		"eContractFileName": "",
		"projectAddress": "",
		"eContractFileId": "",
		"exchRate": "",
		"exchRateOps": "",
		"eContractWordFileId": "",
		"billTemplateId": "",
		"natTaxMoney": "",
		"code": "",
		"nonStandardFileId": "",
		"natMoney": "",
		"ctjlCode": "",
		"otherStampFileId": "",
		"currencyName": "",
		"signedFileId": "",
		"supplierSupCode": "",
		"eContractCreateType": "",
		"eContractbCanModify": "",
		"ctTplId": "",
		"ctTplName": "",
		"money": "",
		"taxMoney": "",
		"cumulativeMoney": "",
		"cumulativeTaxMoney": "",
		"settleTypeId": "",
		"refuseSignReason": "",
		"isPUMdd": "",
		"signStatus": "",
		"isShowAuditModifyBtn": "",
		"settleType": "",
		"submitSignPerson": "",
		"settleName": "",
		"showErp": "",
		"pubts": "",
		"autoEffect": "",
		"payAgreement": "",
		"submitSignTime": "",
		"showYcOrder": "",
		"signerName": "",
		"shelfPeriod": "",
		"shelfRatio": "",
		"workPeriod": "",
		"bAllowConsult": "",
		"invoiceAgreement": "",
		"transtypeName": "",
		"singleBudgetApplyId": "",
		"supplierSupTaxRate": "",
		"supplierSupTaxRateId": "",
		"isPushPaycontract": "",
		"fbillstatus": "",
		"modifiedtime": "",
		"billstatus": "",
		"toProductStatus": "",
		"singleBudgetApplyId_code": "",
		"contractStatus": "",
		"pushPaycontractStatus": "",
		"collabStatus": "",
		"supplierSupName": "",
		"offerType": "",
		"creator": "",
		"sendErpStatus": "",
		"ctChangeStatus": "",
		"billcategory": "",
		"sendChangeErpStatus": "",
		"billcategoryCode": "",
		"creatorId": "",
		"deptCode": "",
		"billtype": "",
		"signFinishTime": "",
		"ts": "",
		"paymentAgreementCode": "",
		"purPersonCode": "",
		"erpProductVersion": "",
		"payTypes": "",
		"billcategoryName": "",
		"deptName": "",
		"accPayApplyMoney": "",
		"enterpriseId": "",
		"purPersonMobile": "",
		"enterpriseName": "",
		"purPersonName": "",
		"createTime": "",
		"supEnterpriseId": "",
		"supplierId": "",
		"externalFileId": "",
		"ctPurContentName": "",
		"internalFileId": "",
		"isMultiParty": "",
		"supPersionId": "",
		"stockStampFileId": "",
		"supplyType": "",
		"saleStampFileId": "",
		"businessType": "",
		"supPersionName": "",
		"saleFileId": "",
		"controlType": "",
		"ctTermsData": "",
		"supPersonTel": "",
		"parentContractName": "",
		"supPersonMobile": "",
		"subscribedate": "",
		"orgId": "",
		"actualvalidate": "",
		"firstPartyId": "",
		"secondPartyId": "",
		"actualinvalidate": "",
		"reqUapProjectId": "",
		"secondPartyId_name": "",
		"ctTplCode": "",
		"purPersonId": "",
		"effectContract": "",
		"isMaterialClass": "",
		"purBipUserId": "",
		"isAllowAdjustPrice": "",
		"moneyControlType": "",
		"moneyRatio": "",
		"purPersonTel": "",
		"execType": "",
		"ctSignId": "",
		"executionStatus": "",
		"intendPaymentmny": "",
		"purContactPersonId": "",
		"practicalPaymentmny": "",
		"paymentExcessControl": "",
		"totalPayContractMoney": "",
		"epayType": "",
		"signatureFailMessage": "",
		"vBuyOfferBillCode": "",
		"description": "",
		"eContractServiceType": "",
		"totalnum": "",
		"ctTplVersion": "",
		"dealPsnName": "",
		"ectFilePath": "",
		"priceStructure": "",
		"firstPartyName": "",
		"purContactPersonName": "",
		"billFiledType": "",
		"supMsgNotifierName": "",
		"secondPartyName": "",
		"signAddress": "",
		"isUseTaxEngine": "",
		"orgScope": "",
		"outerCTBillCode": "",
		"ectBillCode": "",
		"reason": "",
		"deptId": "",
		"totalPayMny": "",
		"supplyPayment": "",
		"supplyDelivery": "",
		"quotaSupplyMny": "",
		"quotaSupplys": "",
		"furtureTemplate": "",
		"agentConfirmPersonId": "",
		"approveEndTime": "",
		"filedStatus": "",
		"advanceRatio": "",
		"econtractCreateDate": "",
		"processId": "",
		"filedTime": "",
		"contractPreviewUrl": "",
		"totalFullMoney": "",
		"filedPersonId_name": "",
		"contractPreviewSign": "",
		"createDate": "",
		"currencySymbol": "",
		"currencyCode": "",
		"modifier": "",
		"modifierId": "",
		"modifyTime": "",
		"modifyDate": "",
		"currencyId": "",
		"submitter_username": "",
		"submitTime": "",
		"pricedigit": "",
		"moneydigit": "",
		"pricerount": "",
		"auditor": "",
		"auditorId": "",
		"auditDate": "",
		"moneyrount": "",
		"auditTime": "",
		"actualValiUserIdName": "",
		"actualValiUserId": "",
		"actualValiSysDate": "",
		"payAgreementId": "",
		"pushPaycontractFailReason": "",
		"natCurrency": "",
		"natCurrency_name": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"natCurrency_priceRount": "",
		"natCurrency_moneyRount": "",
		"natCurrency_code": "",
		"exchRateType": "",
		"exchRateType_name": "",
		"exchRateType_Digit": "",
		"totalPartialMoney": "",
		"agentConfirmPersonName": "",
		"deliveryAddress": "",
		"receiveAddress": "",
		"agentConfirmDate": "",
		"addressName": "",
		"deliveryMethod": "",
		"logisticsCompany": "",
		"logisticsCode": "",
		"sendErpMsg": "",
		"erpCtid": "",
		"erpCtCode": "",
		"memo": "",
		"printCount": "",
		"purContentType": "",
		"purContentTypeId": "",
		"parentContractno": "",
		"parentContractId": "",
		"taxlessFullMoney": "",
		"taxlessPartialMoney": "",
		"transtypeCode": "",
		"transtypeId": "",
		"transtypeSource": "",
		"termManualAddEnable": "",
		"termTemplateId": "",
		"ectTemplateCode": "",
		"logisticsCompanyCode": "",
		"orgCode": "",
		"ycdop": "",
		"signatureStatus": "",
		"changingCommitterName": "",
		"changingCommittedDate": "",
		"changingCommittedReason": "",
		"changingConfirmerName": "",
		"isWfControlled": "",
		"returncount": "",
		"verifystate": "",
		"changingConfirmedDate": "",
		"changingRejectedReason": "",
		"changingStatus": "",
		"changingAction": "",
		"changingVersion": "",
		"changingInfo": "",
		"cancelType": "",
		"filedPersonId": "",
		"cancelReason": "",
		"cancelBipUserId": "",
		"cancelUserName": "",
		"cancelDate": "",
		"terminateCloseBipUserId": "",
		"terminateUserName": "",
		"chgStateReasonId": "",
		"terminateCloseUserName": "",
		"terminateReason": "",
		"chgStateReasonId_reason": "",
		"terminateCloseReason": "",
		"chgStateMemo": "",
		"terminateAction": "",
		"chgStateFileId": "",
		"terminateDate": "",
		"chgStateUserId": "",
		"terminateCloseDate": "",
		"dealPsnId": "",
		"chgStateDate": "",
		"chgStateUserName": "",
		"ectId": "",
		"hasWorkFlow": "",
		"totalAccomplishedQuantity": "",
		"supMsgNotifierId": "",
		"insideRemark": "",
		"payment_process": "",
		"legalType": "",
		"paymentDimension": "",
		"legalTypeCode": "",
		"legalTypeName": "",
		"contractMaterialList": [
			{
				"id": "",
				"rowNum": "",
				"materialIdFile": "",
				"costCenterId": "",
				"contractId": "",
				"costCenterId_name": "",
				"expenseItemId": "",
				"expenseItemId_name": "",
				"singleBudgetApplyBid": "",
				"singleBudgetApplyId": "",
				"materialId_name": "",
				"materialId": "",
				"descrMaterialMark": "",
				"materialClassId": "",
				"singleBudgetApplyBid_code": "",
				"materialCode": "",
				"materialName": "",
				"materialClassCode": "",
				"materialClassName": "",
				"productId": "",
				"skuId": "",
				"productName": "",
				"formulaId": "",
				"formulaCode": "",
				"materialId_modelDescription": "",
				"reqOrgId": "",
				"materialId_model": "",
				"materialDesc": "",
				"purchaseUnitId": "",
				"purchaseUnitCode": "",
				"purchaseDigit": "",
				"unitDigit": "",
				"purchaseRount": "",
				"unitRount": "",
				"mainMetrologyId": "",
				"mainMetrologyCode": "",
				"mainDigit": "",
				"taxCategoryId": "",
				"mainRount": "",
				"unitCode": "",
				"enterpriseId": "",
				"brandId": "",
				"brandCode": "",
				"brandErpId": "",
				"skuCode": "",
				"skuName": "",
				"unitid": "",
				"unit_code": "",
				"unit_precision": "",
				"srcBillId": "",
				"srcBillBid": "",
				"firstBillId": "",
				"firstBillBid": "",
				"skuSpec": "",
				"skuModel": "",
				"specNames": "",
				"qualitypriceName": "",
				"priceStrategyName": "",
				"releasedBudgetMny": "",
				"releasedBudgetTaxmny": "",
				"formulaName": "",
				"reqUapProjectId": "",
				"wbs": "",
				"activity": "",
				"processesId": "",
				"brand": "",
				"benchmarkType": "",
				"reqPlanDeptName": "",
				"addressName": "",
				"wbs_code": "",
				"wbs_name": "",
				"refNo": "",
				"activity_code": "",
				"pritemid": "",
				"activity_name": "",
				"processesCode": "",
				"processesName": "",
				"purchaseNum": "",
				"purchaseUnitName": "",
				"supplyPayment": "",
				"purchaseExchRate": "",
				"num": "",
				"unit": "",
				"priceExchRate": "",
				"taxrateCode": "",
				"mainNum": "",
				"taxFullPrice": "",
				"mainMetrologyName": "",
				"stockCycle": "",
				"purchaseExchRateNumDen": "",
				"purchaseExchRateDen": "",
				"purchaseExchRateNum": "",
				"taxFullMoney": "",
				"taxPartialPrice": "",
				"overExecRate": "",
				"supplyDelivery": "",
				"priceExchRateNumDen": "",
				"priceExchRateDen": "",
				"priceExchRateNum": "",
				"taxPartialMoney": "",
				"enableExecNum": "",
				"taxPrice": "",
				"price": "",
				"supplyOfferDes": "",
				"province_id": "",
				"city_id": "",
				"natTaxPrice": "",
				"erpCtCode": "",
				"district_id": "",
				"natPrice": "",
				"taxMoney": "",
				"money": "",
				"taxrate": "",
				"taxCodeId": "",
				"taxCodeId_taxCode": "",
				"oriWithholdingTax": "",
				"taxCalcResults": "",
				"natWithholdingTax": "",
				"taxlessFullPrice": "",
				"taxlessFullMoney": "",
				"tax": "",
				"taxlessPartialPrice": "",
				"natTaxMoney": "",
				"taxlessPartialMoney": "",
				"reqDeptId": "",
				"discountTaxType": "",
				"receiveOrgId": "",
				"natMoney": "",
				"priceMark": "",
				"receivePersonId": "",
				"natTax": "",
				"allowDecreasePriceRatio": "",
				"allowIncreasePriceRatio": "",
				"srcBillType": "",
				"priceValidateStartdate": "",
				"source": "",
				"sourceid": "",
				"sourceautoid": "",
				"makeRuleCode": "",
				"priceValidateDate": "",
				"srcBillcode": "",
				"gift": "",
				"isOnShelf": "",
				"planArriveDate": "",
				"reqSrcBillCode": "",
				"reqSrcRowNo": "",
				"erpCtid": "",
				"quotaProportion": "",
				"quotaPercentage": "",
				"changingAction": "",
				"takerOrgName": "",
				"changingInfo": "",
				"reqDeptName": "",
				"reqContact": "",
				"reqOrgName": "",
				"receiveOrgName": "",
				"reqPlanDeptId": "",
				"receivePersonName": "",
				"reqPlanPsnId": "",
				"deliveryAddress": "",
				"receivePersonTel": "",
				"reqContactId": "",
				"firstBillType": "",
				"reqDate": "",
				"firstBillcode": "",
				"reqErpRelatedInfo": "",
				"firstBillRowno": "",
				"reqId": "",
				"cumulativeMoney": "",
				"cumulativeTaxMoney": "",
				"memo": "",
				"internalFileId": "",
				"externalFileId": "",
				"accomplishedPurchaseNum": "",
				"erpApplyorderType": "",
				"accomplishedPriceNum": "",
				"purchaseprogress": "",
				"accomplishedQuantity": "",
				"lineStatus": "",
				"lineCloseReason": "",
				"linecloser": "",
				"linecloseTime": "",
				"executionStatus": "",
				"erpCtbid": "",
				"takerOrgId": "",
				"takerOrgId_name": "",
				"takerOrgCode": "",
				"qualitypriceId": "",
				"dimensionPricingId": "",
				"priceStrategy": "",
				"costQuoteGroupId": "",
				"sourcehid": "",
				"sourcebid": "",
				"pritemidErpProductVersion": "",
				"costTemplateId": "",
				"costTemplateName": "",
				"payContractId": "",
				"payContractBid": "",
				"firstSrc": "",
				"firstSrcId": "",
				"firstSrcCode": "",
				"firstSrcLineId": "",
				"firstSrcLineNo": "",
				"occupiedByProductSupply": ""
			}
		],
		"contractPayTermList": [
			{
				"id": "",
				"enterpriseId": "",
				"enterpriseName": "",
				"payPoint": "",
				"payRatio": "",
				"payTaxMoney": "",
				"advancePay": "",
				"shelf": "",
				"settleType": "",
				"memo": "",
				"defaultValueEditable": "",
				"changingAction": "",
				"changingInfo": "",
				"settleTypeName": "",
				"payPointName": "",
				"payPeriod": "",
				"payPointAfterDay": "",
				"settleTypeId": "",
				"payPointId": "",
				"initialDate": "",
				"dueDate": "",
				"intendPaymentmny": "",
				"practicalPaymentmny": "",
				"accPayApplyMoney": "",
				"prePayType": "",
				"isProgressConfirm": "",
				"payPointId_name": "",
				"payName": "",
				"accountingUnit": "",
				"delayDay": "",
				"delayMonth": "",
				"outDayType": "",
				"fixedoutDay1": "",
				"fixedoutDay2": "",
				"fixedoutDay3": "",
				"fixedoutDay4": "",
				"dueDateType": "",
				"outDay": "",
				"fixedexpireDay1": "",
				"fixedexpireDay2": "",
				"fixedexpireDay3": "",
				"fixedexpireDay4": "",
				"payPointAfterDayNew": "",
				"fixedoutDay": "",
				"fixedexpireDay": "",
				"totalPayContractMoney": "",
				"contractId": "",
				"prServiceConfirmMoney": "",
				"payPointId_sourcetype": ""
			}
		],
		"contractPrepayList": [
			{
				"id": "",
				"payPeriod": "",
				"serialNumber": "",
				"takerOrgId_name": "",
				"reqUapProjectId": "",
				"projectName": "",
				"projectCode": "",
				"reqUapProjectCode": "",
				"reqUapProjectName": "",
				"payRatio": "",
				"payTaxMoney": "",
				"advancePay": "",
				"intendPaymentmny": "",
				"practicalPaymentmny": "",
				"accPayApplyMoney": "",
				"settleTypeName": "",
				"payPointAfterDay": "",
				"initialDate": "",
				"contractPaytermId": "",
				"enterpriseId": "",
				"enterpriseName": "",
				"payPoint": "",
				"takerOrgId": "",
				"takerOrgCode": "",
				"dueDate": "",
				"settleType": "",
				"changingAction": "",
				"changingInfo": "",
				"ts": "",
				"takerOrgName": "",
				"contractMaterialId": "",
				"expenseItemId": "",
				"expenseItemId_name": ""
			}
		],
		"contractScopeList": [
			{
				"id": "",
				"contractId": "",
				"enterpriseId": "",
				"enterpriseName": "",
				"puorgId": "",
				"puorgCode": "",
				"puorgName": "",
				"ts": "",
				"changingAction": "",
				"changingInfo": "",
				"rowStatus": ""
			}
		],
		"contractPartyList": [
			{
				"id": "",
				"contractId": "",
				"type": "",
				"orgId": "",
				"orgIdName": "",
				"supplydocId_name": "",
				"customerId_name": "",
				"onlineSign": "",
				"signOrder": "",
				"phone": "",
				"address": "",
				"supplydocId": "",
				"memo": "",
				"customerId": ""
			}
		]
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
99906	合同物料信息不能为空，请检查！	contractMaterialList为空
99907	合同保存数据为空，请检查！	data为空
99904	合同签订方式不能为空	controlType为空
99908	币种不能为空，请检查！	currencyId或currencyName为空
99902	采购员不能为空，请检查！	purPersonId或purPersonName为空
99905	采购部门不能为空！	deptId或deptName为空
99909	是否物料分类不能为空，请检查！	isMaterialClass为空
99903	采购组织不能为空，请检查！	orgId或orgName为空

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

