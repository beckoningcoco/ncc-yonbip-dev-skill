---
title: "采购合同同步ERP"
apiId: "1801695590663847940"
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

# 采购合同同步ERP

>  请求方式	POST | Purchase Contract (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/connectorCT
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
purOrgId	string	header	否	路由
Body参数
名称	类型	数组	必填	描述
id	string	否	否	合同主键
projectId	string	否	否	立项id
pricedecisionId	string	否	否	定标单主表id
subject	string	否	否	合同标题
code	string	否	否	新合同编码
billtype	string	否	否	合同类型
businessType	string	否	是	业务类型
billstatus	string	否	否	单据状态bill
settlementBasis	string	否	否	结算依据
fbillstatus	string	否	否	审批状态bill
modifier	string	否	否	修改人
modifiedtime	date
格式:-	否	否	修改时间ed
creator	string	否	否	创建人
createTime	float	否	否	创建时间
erpProductVersion	string	否	否	ERP产品及版本
money	string	否	否	无税金额
taxMoney	string	否	否	含税金额
enterpriseId	string	否	否	租户
enterpriseName	string	否	否	采购商租户id
supEnterpriseId	float	否	否	供应商租户id
supEnterpriseName	string	否	否	供应商名称
supPersionId	string	否	否	供应商联系人id
supPersionName	string	否	否	供应商联系人
supPersonTel	string	否	否	供应商联系人座机
supPersonMobile	string	否	否	供应商联系人手机号
orgId	string	否	是	采购组织id
orgName	string	否	否	采购组织名称
purPersonId	float	否	否	采购员id
purPersonName	string	否	否	采购员姓名
purUserId	float	否	否	采购员用户id
purPersonTel	string	否	否	采购员座机电话
purPersonMobile	string	否	否	采购员手机号
memo	string	否	否	备注
deliveryAddress	string	否	否	收货地址
subscribedate	float	否	是	合同签订日期
actualvalidate	float	否	是	合同生效日期
actualinvalidate	string	否	否	合同终止日期
totalnum	float	否	否	总数量
totalPayMny	string	否	否	累计付款总额
reason	string	否	否	拒绝变更理由
ectId	string	否	否	电子合同id
ectOldId	string	否	否	旧电子合同id
erpCtCode	string	否	否	erp合同编号
erpCtid	string	否	否	erp合同主表id
buyofferId	string	否	否	询价单id
sourceType	string	否	否	合同来源
currencyName	string	否	是	币种名称
isMaterialClass	string	否	是	是否物料分类合同
effectContract	string	否	否	合同生效是否需要供应商协同
deptName	string	否	是	部门名称
deptId	string	否	是	部门id
supplyPayment	string	否	否	付款条件
supplyDelivery	string	否	否	交货说明
quotaSupplyMny	float	否	否	供应商首次报价总金额
quotaSupplys	float	否	否	供应商报价家数
ERPProjectId	string	否	否	Erp项目id
ERPProjectName	string	否	否	erp项目名称
furtureTemplate	string	否	否	确认是否启用期货报价模板
offerType	float	否	否	期货报价模板下的报价方式
payTypes	string	否	否	期货报价模板下的报价模式
advanceRatio	string	否	否	预付比例
totalFullMoney	string	否	否	全额预付总价
totalPartialMoney	string	否	否	部分预付总价
receiveAddress	string	否	否	receive收货地址
addressName	string	否	否	地址名称
projectCode	string	否	否	项目编号
projectName	string	否	否	项目名称
projectDocId	string	否	否	项目id
receiveArea	string	否	否	区域
receiver	string	否	否	收货人
phone	string	否	否	联系方式
purContentType	string	否	否	采购内容
parentContractno	string	否	否	父合同编码
parentContractId	string	否	否	父合同id
projectAddress	string	否	否	详细地址
parentContractName	string	否	否	父合同名称
vBuyOfferBillCode	string	否	否	询价单单据号
taxlessFullMoney	float	否	否	无税总价全额预付
taxlessPartialMoney	float	否	否	无税总价部分预付
transtypeId	string	否	否	交易类型id
transtypeCode	string	否	否	交易类型编码
transtypeName	string	否	否	交易类型名称
transtypeSource	boolean	否	否	合同交易类型是否来源于上游
signAddress	string	否	否	签订地点
controlType	string	否	是	控制方式
priceStructure	string	否	否	价格构成
execType	string	否	否	执行方式
epayType	boolean	否	否	超合同付款
settleType	string	否	否	结算方式
settleName	string	否	否	结算方式名称
payAgreement	string	否	否	付款协议
paymentAgreementCode	string	否	否	付款协议编码
invoiceAgreement	string	否	否	发票协议
termTemplateId	string	否	否	条款模板id
termManualAddEnable	boolean	否	否	条款模板条款是否可手工增加
shelfPeriod	string	否	否	质保期
workPeriod	string	否	否	工期
outerCTBillCode	string	否	否	外部合同号
shelfRatio	string	否	否	质保金或比例
ectBillCode	string	否	否	电子合同编号
ectTemplateId	string	否	否	电子合同模板id
ectTemplateCode	string	否	否	电子合同模板编号
ectTemplateName	string	否	否	电子合同模板名称
ectFilePath	string	否	否	电子合同文件路径
ectOldBillCode	string	否	否	旧电子合同编号
ectOldTemplateId	string	否	否	旧电子合同模板id
ectOldTemplateCode	string	否	否	旧电子合同模板编号
ectOldTemplateName	string	否	否	旧电子合同模板名称
ectOldFilePath	string	否	否	旧电子合同文件路径
signatureEffect	float	否	否	是否启用电子签章
signatureStatus	string	否	否	签章状态
changingCommitterName	string	否	否	变更人
changingCommittedDate	date
格式:-	否	否	变更时间
changingCommittedReason	string	否	否	变更理由
changingConfirmerName	string	否	否	变更确认人
changingConfirmedDate	date
格式:-	否	否	变更确认时间
changingRejectedReason	string	否	否	变更被拒绝原因
changingStatus	string	否	否	变更状态
changingAction	string	否	否	变更动作
changingVersion	string	否	否	当前变更版本
orgScope	string	否	否	合同组织范围
signatureFailMessage	string	否	否	签章失败原因
cancelUserId	string	否	否	作废人id
cancelUserName	string	否	否	作废人名称
cancelReason	string	否	否	作废原因
cancelDate	string	否	否	作废日期
terminateUserId	string	否	否	终止人id
terminateUserName	string	否	否	终止人名称
terminateReason	string	否	否	终止原因
terminateDate	string	否	否	终止日期
dealPsnId	float	否	否	处理人id
dealPsnName	string	否	否	处理人
reqDeptId	float	否	否	需求部门id
reqDeptName	string	否	否	需求单位
ts	string	否	否	时间戳ts
supplierId	float	否	否	供应商id大
supplierSupName	string	否	否	供应商档案中供应商的名称
purContentTypeId	float	否	否	采购内容id
settleTypeId	string	否	否	结算方式Id
currencyId	string	否	是	币种id
currencyCode	string	否	否	币种编码
currencySymbol	string	否	否	币种符号
payAgreementId	float	否	否	付款协议ID
modifierId	float	否	否	修改人id
reqUapProjectId	string	否	否	平台项目档案id
isAllowAdjustPrice	string	否	否	合同物料是否允许调价
intendPaymentmny	float	否	否	累计合同预付付款金额
practicalPaymentmny	float	否	否	累计合同预付实付金额
accPayApplyMoney	float	否	否	累计合同申请预付款金额
totalMainNum	float	否	否	总主数量
totalPurchaseNum	float	否	否	总采购数量
supMsgNotifierId	float	否	否	供应商消息通知人
supMsgNotifierName	string	否	否	供应商消息通知人名称
firstPartyId	string	否	否	甲方id
firstPartyName	string	否	否	甲方名称
secondPartyId	string	否	否	乙方id
secondPartyName	string	否	否	乙方名称
agentConfirmPersonId	string	否	否	代确认人
agentConfirmPersonName	string	否	否	代确认人名称
agentConfirmDate	string	否	否	代确认时间
insideRemark	string	否	否	内审备注
logisticsCompanyCode	string	否	否	物流公司代码
logisticsCompany	string	否	否	物流公司
logisticsCode	string	否	否	物流单号
description	string	否	否	随货送票说明
deliveryMethod	string	否	否	邮寄方式
sendErpMsg	string	否	否	发送到ERP成功或者失败消息记录
toProductStatus	float	否	否	合同生成商品流程状态
approveEndTime	date
格式:-	否	否	审批通过时间
internalFileId	string	否	否	内控附件
externalFileId	string	否	否	外部附件
stockStampFileId	string	否	否	采购盖章附件
saleFileId	string	否	否	供应方附件
saleStampFileId	string	否	否	供应方盖章附件
ctTplId	string	否	否	合同模板id
ctTplCode	string	否	否	合同模板编码
ctTplName	string	否	否	合同模板名称
ctTplVersion	string	否	否	合同模板版本
signStatus	string	否	否	电子签署状态
ctSignId	string	否	否	签署流程ID
nonStandardFileId	string	否	否	非制式合同
signedFileId	string	否	否	已签合同附件
eContractFileId	string	否	否	电子合同附件
eContractServiceType	string	否	否	合同服务类型
econtractCreateDate	date
格式:-	否	否	电子合同生成时间
eContractCreateType	string	否	否	合同生成方式
singleBudgetApplyId	float	否	否	单项预算申请单
pushPaycontractStatus	string	否	否	推付款合同状态
isPushPaycontract	boolean	否	否	是否推付款合同
isWfControlled	boolean	否	否	是否审批流控制
eContractWordFileId	string	否	否	电子合同word附件
eContractbCanModify	boolean	否	否	电子合同可编辑
changingInfo	string	否	否	变更信息
filedPersonId	float	否	否	归档人id
filedTime	date
格式:-	否	否	归档时间
filedStatus	string	否	否	归档状态
ctTermsData	string	否	否	合同条款数据
verifystate	float	否	否	审批状态
returncount	float	否	否	退回次数
ytenant	string	否	否	租户id
templateId	float	否	否	主模板主键
billTemplateId	float	否	否	单据模板主键
vouchdate	date
格式:-	否	是	单据日期
status	float	否	否	单据状态
tenant	string	否	否	租户ID
modifyTime	date
格式:-	否	否	修改时间
natCurrency	string	否	否	本币主键
natCurrency_code	string	否	否	本币编码
natCurrency_name	string	否	否	本币名称
exchRateType_name	string	否	否	汇率类型名称
exchRateType	string	否	否	汇率类型主键
exchRate	float	否	否	汇率
exchRateDate	string	否	否	汇率日期
natMoney	float	否	否	本币无税金额
natTaxMoney	float	否	否	本币价税合计
pubts	date
格式:-	否	否	时间戳pubts
contractPrepayList	object	是	是	预付付款单列表
ytenant	string	否	否	租户id
payPointName	string	否	否	付款起点名称
settleTypeId	float	否	否	结算方式id
serialNumber	float	否	否	序号
payPeriod	float	否	否	付款阶段
payPointAfterDay	float	否	否	账期天数
takerOrgName	string	否	否	收票组织name
payRatio	float	否	否	付款比例
payTaxMoney	float	否	否	付款金额
intendPaymentmny	float	否	否	累计付款金额
practicalPaymentmny	float	否	否	累计实付金额
advancePay	boolean	否	否	是否预付款
settleTypeName	string	否	否	结算方式name
initialDate	date
格式:-	否	否	起算日
dueDate	date
格式:-	否	否	到期日
id	float	否	否	预付付款单id
contractPaytermId	float	否	否	付款协议id
enterpriseId	float	否	否	所属租户id
enterpriseName	string	否	否	所属租户名称
payPoint	string	否	否	付款起点
takerOrgId	float	否	否	收票组织id
takerOrgCode	string	否	否	收票组织code
settleType	string	否	否	结算方式type
changingAction	string	否	否	变更动作
changingInfo	string	否	否	变更信息
ts	date
格式:-	否	否	时间戳ts
natPrice	float	否	否	本币无税单价
natTaxPrice	float	否	否	本币含税单价
natTaxMoney	float	否	否	本币含税金额
natMoney	float	否	否	本币无税金额
accPayApplyMoney	float	否	否	累计预付付款申请金额
contractExpList	object	是	否	合同费用子表
ytenant	string	否	否	租户id
ts	date
格式:-	否	否	时间戳
id	string	否	否	费用子表主键
enterpriseId	string	否	否	采购方租户id
expcode	string	否	否	费用编码
expname	string	否	否	费用名称
expsum	string	否	否	费用金额
memo	string	否	否	备注
contractId	string	否	否	合同主表id
rowStatus	string	否	否	行状态
contractMaterialList	object	是	否	物料基本信息子表
id	string	否	否	物料子表id
materialId	float	否	是	采购商物料id
materialName	string	否	否	采购商物料名称
materialClassId	float	否	否	采购商物料分类
materialClassName	string	否	否	采购商物料分类名称
materialClassCode	string	否	否	采购商物料分类编码
productId	string	否	否	商品id
productName	string	否	否	商品sku详细属性信息
skuId	string	否	否	商品skuid
skuUrl	string	否	否	商品图片
reqOrgId	string	否	否	需求组织id
reqOrgName	string	否	否	需求公司名称
memo	string	否	否	备注
enterpriseId	string	否	否	采购商租户
price	string	否	否	无税单价
taxPrice	string	否	是	含税单价
num	string	否	否	数量
unit	string	否	否	单位
unitid	float	否	否	单位id
money	string	否	否	无税金额
taxMoney	string	否	是	含税金额
deliveryAddress	string	否	否	物料收货地址
taxrate	string	否	是	税率
erpCtbid	string	否	否	erp合同子表id
planArriveDate	string	否	否	计划到货日期字段计划到货日期
spec	string	否	否	规格
model	string	否	否	型号
accomplishedQuantity	string	否	否	已完成数量
priceValidateDate	string	否	否	价格有效期
refNo	string	否	否	目的是为了区分这个需求是哪一个分包商提的
pritemid	float	否	否	需求id
suppProductName	string	否	否	报价商品名称
stockCycle	string	否	否	备货周期
supplyDelivery	string	否	否	交货方式说明
supplyOfferDes	string	否	否	报价单报价说明
supplyPayment	string	否	否	付款方式
materialDesc	string	否	否	物料描述
rowNum	float	否	否	行数
erpCtCode	string	否	否	erp采购合同主表code
erpCtid	string	否	否	erp合同主表id
ERPProjectId	string	否	否	Erp项目id
ERPProjectName	string	否	否	Erp项目名称
taxFullPrice	string	否	否	含税单价全额预付
taxFullMoney	string	否	否	含税总价全额预付
taxPartialPrice	string	否	否	含税单价部分预付
taxPartialMoney	string	否	否	含税总价部分预付
shelfLife	string	否	否	质保期
brand	string	否	否	品牌
benchmarkType	string	否	否	基准价参考
settlementType	string	否	否	结算基准日
province_id	string	否	否	省id
city_id	string	否	否	市id
district_id	string	否	否	区域id
addressName	string	否	否	地址显示名称
materialCode	string	否	否	物料编码
taxlessFullPrice	string	否	否	无税单价全额预付
taxlessFullMoney	string	否	否	无税总价全额预付
taxlessPartialPrice	string	否	否	无税单价部分预付
taxlessPartialMoney	string	否	否	无税总价部分预付
receiveOrgId	string	否	否	收货组织id
receiveOrgName	string	否	否	收货组织名称
receivePersonId	string	否	否	收货人
receivePersonName	string	否	否	收货人名称
receivePersonTel	string	否	否	收货人联系电话
firstBillType	string	否	否	源头单据类型
firstBillcode	string	否	否	源头单据号
firstBillId	float	否	否	来源单据主表id
firstBillBid	float	否	否	来源单据子表id
firstBillRowno	float	否	否	来源单据行号
reqId	string	否	否	需求
reqSrcBillCode	string	否	否	需求来源单据号
reqSrcRowNo	string	否	否	需求来源行号
overExecRate	string	否	否	超量执行比例
enableExecNum	string	否	否	可执行数量
changingAction	string	否	否	变更动作
changingInfo	string	否	否	变更信息
reqDeptName	string	否	否	需求部门名称
reqDeptId	string	否	否	需求部门id
reqPlanDeptName	string	否	否	需求计划部门名称
reqPlanDeptId	float	否	否	需求计划部门id
reqPlanPsnId	float	否	否	需求计划员id
reqContact	string	否	否	需求人名称
reqContactId	string	否	否	需求人Id
reqDate	string	否	否	需求时间
reqErpRelatedInfo	string	否	否	erp相关信息
ts	date
格式:-	否	否	时间戳
brandCode	string	否	否	品牌Code
brandId	string	否	否	品牌Id
priceValidateStartdate	float	否	否	价格有效期开始日期
brandErpId	string	否	否	品牌ErpId
allowIncreasePriceRatio	string	否	否	允许调价正比例
allowDecreasePriceRatio	string	否	否	允许调价负比例
takerOrgId	float	否	否	收票组织id
takerOrgCode	string	否	否	收票组织code
takerOrgName	string	否	否	收票组织name
unitCode	string	否	否	计价单位编码
priceExchRate	float	否	否	计价换算率
mainNum	string	否	否	主数量
mainMetrologyId	float	否	否	主单位id
mainMetrologyName	string	否	否	主单位名称
mainMetrologyCode	string	否	否	主单位编码
purchaseNum	string	否	是	采购数量
purchaseUnitId	float	否	否	采购单位id
purchaseUnitName	string	否	否	采购单位名称
purchaseUnitCode	string	否	否	采购单位编码
purchaseExchRate	float	否	否	采购换算率
taxCategoryId	string	否	否	合同税率数目id
gift	boolean	否	否	赠品
formulaId	float	否	否	价格公式id
formulaName	string	否	否	价格公式
quotaProportion	float	否	否	配额比例
quotaPercentage	float	否	否	配额百分比
qualitypriceId	float	否	否	优质优价
singleBudgetApplyId	float	否	否	单项预算申请单
singleBudgetApplyBid	float	否	否	单项预算申请单明细
expenseItemId	float	否	否	费用项目
releasedBudgetMny	float	否	否	应释放单项预算占用无税金额
releasedBudgetTaxmny	float	否	否	应释放单项预算占用金额
payContractId	string	否	否	付款合同
payContractBid	string	否	否	付款合同表体
priceStrategy	float	否	否	取价策略id
dimensionPricingId	string	否	否	价格目录数据id
sourcehid	string	否	否	需求来源主表id
sourcebid	string	否	否	需求来源子表id
pritemidErpProductVersion	string	否	否	需求来源类型
costQuoteGroupId	float	否	否	成本项报价组id
ytenant	string	否	否	租户id
natMoney	float	否	否	本币无税金额
natTaxMoney	float	否	否	本币含税金额
natPrice	float	否	否	本币无税单价
natTaxPrice	float	否	否	本币含税单价
natTax	float	否	否	本币税额
tax	float	否	否	税额
contractId	string	否	否	合同主表id
countryCode	string	否	否	国家编码
countryName	string	否	否	国家名称
reqUapProjectId	string	否	否	平台项目档案id
brandErpCode	string	否	否	品牌Erp编码
erpMaterialPrice	string	否	否	erp销售合同物料行单价
erpSaleContractMny	string	否	否	erp销售合同金额
profitAmount	string	否	否	毛利金额
profitRate	string	否	否	毛利率
field1	string	否	否	合同表体自定义项1
field2	string	否	否	合同表体自定义项2
field3	string	否	否	合同表体自定义项3
field4	string	否	否	合同表体自定义项4
field5	string	否	否	合同表体自定义项5
field6	string	否	否	合同表体自定义项6
field7	string	否	否	合同表体自定义项7
field8	string	否	否	合同表体自定义项8
field9	string	否	否	合同表体自定义项9
field10	string	否	否	合同表体自定义项10
field11	string	否	否	合同表体自定义项11
field12	string	否	否	合同表体自定义项12
field13	string	否	否	合同表体自定义项13
field14	string	否	否	合同表体自定义项14
field15	string	否	否	合同表体自定义项15
field16	string	否	否	合同表体自定义项16
field17	string	否	否	合同表体自定义项17
field18	string	否	否	合同表体自定义项18
field19	string	否	否	合同表体自定义项19
field20	string	否	否	合同表体自定义项20
projectCode	string	否	否	项目编码
projectId	string	否	否	项目ID
erpProjectId	string	否	否	erp项目id
erpProjectName	string	否	否	erp项目名称
quotaReason	string	否	否	寻源推荐理由
accomplishedPurchaseNum	string	否	否	采购单位完成量
purchaseDigit	float	否	否	采购换算精度
purchaseRount	float	否	否	采购换算取舍规则
mainDigit	float	否	否	主单位换算精度
mainRount	float	否	否	主单位取舍规则
unitDigit	float	否	否	计价单位精度
unitRount	float	否	否	计价单位取舍规则
accomplishedPriceNum	string	否	否	计价单位完成量
rowStatus	string	否	否	行状态
contractPayTermList	object	是	否	付款协议信息子表
ytenant	string	否	否	租户id
id	string	否	否	id
enterpriseId	string	否	否	采购方租户id
payName	string	否	否	付款名称
enterpriseName	string	否	否	采购方租户名称
payPoint	string	否	否	起算时点
payRatio	string	否	否	付款比例
payTaxMoney	string	否	否	付款协议含税金额
advancePay	string	否	否	是否预付款
shelf	string	否	否	是否质保金
settleType	string	否	否	结算方式
memo	string	否	否	备注
defaultValueEditable	boolean	否	否	默认是否可编辑
isProgressConfirm	string	否	否	需进度确认
changingAction	string	否	否	变更动作
prePayType	string	否	否	预付折算方式
changingInfo	string	否	否	变更信息
settleTypeName	string	否	否	结算方式名称
payPointName	string	否	否	付款起点名称
payPeriod	string	否	否	期号
payPointAfterDay	string	否	否	付款起点延期天数
accountingUnit	string	否	否	账期单位
settleTypeId	float	否	否	结算方式id
payPointId	float	否	否	付款起点id
delayDay	string	否	否	延迟天数
initialDate	string	否	否	起算日
dueDate	string	否	否	到期日
delayMonth	string	否	否	延迟月份
intendPaymentmny	string	否	否	累计预付付款金额
practicalPaymentmny	string	否	否	累计预付实付金额
accPayApplyMoney	string	否	否	累计申请付款金额
outDayType	string	否	否	出账日确定方式
fixedoutDay	string	否	否	固定出账日
fixedoutDay1	string	否	否	固定出账日1
fixedoutDay2	string	否	否	固定出账日2
fixedoutDay3	string	否	否	固定出账日3
fixedoutDay4	string	否	否	固定出账日4
ts	string	否	否	时间戳
outDay	date
格式:-	否	否	出账日
dueDateType	string	否	否	到期日确定方式
fixedexpireDay	string	否	否	固定到期日
fixedexpireDay1	string	否	否	固定到期日1
fixedexpireDay2	string	否	否	固定到期日2
fixedexpireDay3	string	否	否	固定到期日3
fixedexpireDay4	string	否	否	固定到期日4
totalPayContractMoney	float	否	否	累计合同申请预付款金额
contractId	string	否	否	合同主表id
dr	string	否	否	删除标识
isOriginBillCode	string	否	否	是否使用原编码规则
settleTypeCode	string	否	否	结算方式编码
payPointAfterDayNew	string	否	否	账期
contractScopeList	object	是	否	合同执行组织范围子表
ytenant	string	否	否	租户id
id	string	否	否	条款子表主键
enterpriseId	float	否	否	采购方租户id
enterpriseName	string	否	否	采购方租户名称
puorgId	string	否	否	采购组织id
puorgCode	string	否	否	采购组织编码
puorgName	string	否	否	采购组织名称
ts	string	否	否	时间戳
changingAction	string	否	否	变更动作
changingInfo	string	否	否	变更信息
contractId	string	否	否	合同主表id
dr	string	否	否	删除标识
rowStatus	string	否	否	行状态
contractTermList	object	是	否	合同条款子表
ytenant	string	否	否	租户id
termInputId	string	否	否	条款输入id
ts	date
格式:-	否	否	时间戳
memo	string	否	否	备注
enterpriseId	string	否	否	采购方租户id
termcode	string	否	否	条款编码
termname	string	否	否	条款名称
termtypename	string	否	否	条款类型
termcontent	string	否	否	条款内容
otherinfo	string	否	否	其它信息
termDocCode	string	否	否	条款档案编码
inputType	string	否	否	条款输入类型
inputValues	string	否	否	条款输入值选项
defaultValue	string	否	否	条款默认值
defaultValueEditable	boolean	否	否	条款默认值是否可编辑
inputValue	string	否	否	输入值
changingAction	string	否	否	变更动作
changingInfo	string	否	否	变更信息
number	string	否	否	条款输入值序号
id	string	否	否	合同条款子表主键
termDocId	string	否	否	条款档案id
rowNum	string	否	否	行号
contractId	string	否	否	合同主表id合同主表id
dr	string	否	否	删除标识
rowStatus	string	否	否	行状态
supCorpAddress	string	否	否	供应商企业地址
supLegalBody	string	否	否	供应商企业法人
supTel	string	否	否	供应商电话
supBank	string	否	否	供应商开户银行
supBankAccount	string	否	否	供应商银行账号
bankAccountLink	string	否	否	银行联行号
bankName	string	否	否	银行网点
accountName	string	否	否	银行账号名称
bankAccountwf	string	否	否	银行账号
orgCode	string	否	否	组织编码
shortCode	string	否	否	组织代码
contractAutoCode	boolean	否	否	是否自动生成合同编码
ctPurContentName	string	否	否	采购内容名称
billno	string	否	否	合同编码
thisEnterpriseHasERP	string	否	否	租户是否有ERP
supplyid	float	否	否	供应商id小
hasWorkFlow	boolean	否	否	当前合同是否有审批流
hasWorkFlow4Changing	boolean	否	否	当前合同变更是否有审批流
field1	boolean	否	否	采购云自定义项1
field2	boolean	否	否	采购云自定义项2
field3	boolean	否	否	采购云自定义项3
field4	boolean	否	否	采购云自定义项4
field5	boolean	否	否	采购云自定义项5
field6	string	否	否	采购云自定义项6
field7	string	否	否	采购云自定义项7
field8	string	否	否	采购云自定义项8
field9	string	否	否	采购云自定义项9
field10	string	否	否	采购云自定义项10
field11	string	否	否	采购云自定义项11
field13	string	否	否	采购云自定义项13
field14	string	否	否	采购云自定义项14
field15	string	否	否	采购云自定义项15
field16	string	否	否	采购云自定义项16
field17	string	否	否	采购云自定义项17
field18	string	否	否	采购云自定义项18
field19	string	否	否	采购云自定义项19
field20	string	否	否	采购云自定义项20
erpSaleContractCode	string	否	否	erp销售合同编码
erpSaleCustName	string	否	否	erp销售客户名称
erpSaleContractMny	string	否	否	erp销售合同金额
totalOutMny	string	否	否	累计外包合同金额
totalOutMnyRatio	string	否	否	累计外包合同金额占比
totalReqMny	string	否	否	销售合同对应所有需求申请金额
totalReqMnyRatio	string	否	否	累计需求申请金额占比
profitAmount	string	否	否	毛利金额
profitRate	string	否	否	毛利率
execName	string	否	否	执行方式名称
billFiledType	string	否	否	单据归档状态
isExpired	string	否	否	是否过期
paymentAgreementName	string	否	否	付款协议名称
paymentAgreementId	string	否	否	付款协议id
incomeExpenseCode	string	否	否	项目信息编码
incomeExpenseName	string	否	否	项目信息名称
sendErpStatus	string	否	否	发送到ERP的状态
supMsgNotifierPhone	string	否	否	供应商消息通知人手机
supplierDocId	float	否	否	供应商档案ID
exchRateType_code	string	否	否	汇率类型编码
rowStatus	string	否	否	行状态

## 3. 请求示例

Url: /yonbip/cpu/connectorCT?access_token=访问令牌
Header: 
	purOrgId : ""
Body: [{
	"id": "",
	"projectId": "",
	"pricedecisionId": "",
	"subject": "",
	"code": "",
	"billtype": "",
	"businessType": "",
	"billstatus": "",
	"settlementBasis": "",
	"fbillstatus": "",
	"modifier": "",
	"modifiedtime": "2026-06-07 13:05:44",
	"creator": "",
	"createTime": 0,
	"erpProductVersion": "",
	"money": "",
	"taxMoney": "",
	"enterpriseId": "",
	"enterpriseName": "",
	"supEnterpriseId": 0,
	"supEnterpriseName": "",
	"supPersionId": "",
	"supPersionName": "",
	"supPersonTel": "",
	"supPersonMobile": "",
	"orgId": "",
	"orgName": "",
	"purPersonId": 0,
	"purPersonName": "",
	"purUserId": 0,
	"purPersonTel": "",
	"purPersonMobile": "",
	"memo": "",
	"deliveryAddress": "",
	"subscribedate": 0,
	"actualvalidate": 0,
	"actualinvalidate": "",
	"totalnum": 0,
	"totalPayMny": "",
	"reason": "",
	"ectId": "",
	"ectOldId": "",
	"erpCtCode": "",
	"erpCtid": "",
	"buyofferId": "",
	"sourceType": "",
	"currencyName": "",
	"isMaterialClass": "",
	"effectContract": "",
	"deptName": "",
	"deptId": "",
	"supplyPayment": "",
	"supplyDelivery": "",
	"quotaSupplyMny": 0,
	"quotaSupplys": 0,
	"ERPProjectId": "",
	"ERPProjectName": "",
	"furtureTemplate": "",
	"offerType": 0,
	"payTypes": "",
	"advanceRatio": "",
	"totalFullMoney": "",
	"totalPartialMoney": "",
	"receiveAddress": "",
	"addressName": "",
	"projectCode": "",
	"projectName": "",
	"projectDocId": "",
	"receiveArea": "",
	"receiver": "",
	"phone": "",
	"purContentType": "",
	"parentContractno": "",
	"parentContractId": "",
	"projectAddress": "",
	"parentContractName": "",
	"vBuyOfferBillCode": "",
	"taxlessFullMoney": 0,
	"taxlessPartialMoney": 0,
	"transtypeId": "",
	"transtypeCode": "",
	"transtypeName": "",
	"transtypeSource": true,
	"signAddress": "",
	"controlType": "",
	"priceStructure": "",
	"execType": "",
	"epayType": true,
	"settleType": "",
	"settleName": "",
	"payAgreement": "",
	"paymentAgreementCode": "",
	"invoiceAgreement": "",
	"termTemplateId": "",
	"termManualAddEnable": true,
	"shelfPeriod": "",
	"workPeriod": "",
	"outerCTBillCode": "",
	"shelfRatio": "",
	"ectBillCode": "",
	"ectTemplateId": "",
	"ectTemplateCode": "",
	"ectTemplateName": "",
	"ectFilePath": "",
	"ectOldBillCode": "",
	"ectOldTemplateId": "",
	"ectOldTemplateCode": "",
	"ectOldTemplateName": "",
	"ectOldFilePath": "",
	"signatureEffect": 0,
	"signatureStatus": "",
	"changingCommitterName": "",
	"changingCommittedDate": "2026-06-07 13:05:44",
	"changingCommittedReason": "",
	"changingConfirmerName": "",
	"changingConfirmedDate": "2026-06-07 13:05:44",
	"changingRejectedReason": "",
	"changingStatus": "",
	"changingAction": "",
	"changingVersion": "",
	"orgScope": "",
	"signatureFailMessage": "",
	"cancelUserId": "",
	"cancelUserName": "",
	"cancelReason": "",
	"cancelDate": "",
	"terminateUserId": "",
	"terminateUserName": "",
	"terminateReason": "",
	"terminateDate": "",
	"dealPsnId": 0,
	"dealPsnName": "",
	"reqDeptId": 0,
	"reqDeptName": "",
	"ts": "",
	"supplierId": 0,
	"supplierSupName": "",
	"purContentTypeId": 0,
	"settleTypeId": "",
	"currencyId": "",
	"currencyCode": "",
	"currencySymbol": "",
	"payAgreementId": 0,
	"modifierId": 0,
	"reqUapProjectId": "",
	"isAllowAdjustPrice": "",
	"intendPaymentmny": 0,
	"practicalPaymentmny": 0,
	"accPayApplyMoney": 0,
	"totalMainNum": 0,
	"totalPurchaseNum": 0,
	"supMsgNotifierId": 0,
	"supMsgNotifierName": "",
	"firstPartyId": "",
	"firstPartyName": "",
	"secondPartyId": "",
	"secondPartyName": "",
	"agentConfirmPersonId": "",
	"agentConfirmPersonName": "",
	"agentConfirmDate": "",
	"insideRemark": "",
	"logisticsCompanyCode": "",
	"logisticsCompany": "",
	"logisticsCode": "",
	"description": "",
	"deliveryMethod": "",
	"sendErpMsg": "",
	"toProductStatus": 0,
	"approveEndTime": "2026-06-07 13:05:44",
	"internalFileId": "",
	"externalFileId": "",
	"stockStampFileId": "",
	"saleFileId": "",
	"saleStampFileId": "",
	"ctTplId": "",
	"ctTplCode": "",
	"ctTplName": "",
	"ctTplVersion": "",
	"signStatus": "",
	"ctSignId": "",
	"nonStandardFileId": "",
	"signedFileId": "",
	"eContractFileId": "",
	"eContractServiceType": "",
	"econtractCreateDate": "2026-06-07 13:05:44",
	"eContractCreateType": "",
	"singleBudgetApplyId": 0,
	"pushPaycontractStatus": "",
	"isPushPaycontract": true,
	"isWfControlled": true,
	"eContractWordFileId": "",
	"eContractbCanModify": true,
	"changingInfo": "",
	"filedPersonId": 0,
	"filedTime": "2026-06-07 13:05:44",
	"filedStatus": "",
	"ctTermsData": "",
	"verifystate": 0,
	"returncount": 0,
	"ytenant": "",
	"templateId": 0,
	"billTemplateId": 0,
	"vouchdate": "2026-06-07 13:05:44",
	"status": 0,
	"tenant": "",
	"modifyTime": "2026-06-07 13:05:44",
	"natCurrency": "",
	"natCurrency_code": "",
	"natCurrency_name": "",
	"exchRateType_name": "",
	"exchRateType": "",
	"exchRate": 0,
	"exchRateDate": "",
	"natMoney": 0,
	"natTaxMoney": 0,
	"pubts": "2026-06-07 13:05:44",
	"contractPrepayList": [
		{
			"ytenant": "",
			"payPointName": "",
			"settleTypeId": 0,
			"serialNumber": 0,
			"payPeriod": 0,
			"payPointAfterDay": 0,
			"takerOrgName": "",
			"payRatio": 0,
			"payTaxMoney": 0,
			"intendPaymentmny": 0,
			"practicalPaymentmny": 0,
			"advancePay": true,
			"settleTypeName": "",
			"initialDate": "2026-06-07 13:05:44",
			"dueDate": "2026-06-07 13:05:44",
			"id": 0,
			"contractPaytermId": 0,
			"enterpriseId": 0,
			"enterpriseName": "",
			"payPoint": "",
			"takerOrgId": 0,
			"takerOrgCode": "",
			"settleType": "",
			"changingAction": "",
			"changingInfo": "",
			"ts": "2026-06-07 13:05:44",
			"natPrice": 0,
			"natTaxPrice": 0,
			"natTaxMoney": 0,
			"natMoney": 0,
			"accPayApplyMoney": 0
		}
	],
	"contractExpList": [
		{
			"ytenant": "",
			"ts": "2026-06-07 13:05:44",
			"id": "",
			"enterpriseId": "",
			"expcode": "",
			"expname": "",
			"expsum": "",
			"memo": "",
			"contractId": "",
			"rowStatus": ""
		}
	],
	"contractMaterialList": [
		{
			"id": "",
			"materialId": 0,
			"materialName": "",
			"materialClassId": 0,
			"materialClassName": "",
			"materialClassCode": "",
			"productId": "",
			"productName": "",
			"skuId": "",
			"skuUrl": "",
			"reqOrgId": "",
			"reqOrgName": "",
			"memo": "",
			"enterpriseId": "",
			"price": "",
			"taxPrice": "",
			"num": "",
			"unit": "",
			"unitid": 0,
			"money": "",
			"taxMoney": "",
			"deliveryAddress": "",
			"taxrate": "",
			"erpCtbid": "",
			"planArriveDate": "",
			"spec": "",
			"model": "",
			"accomplishedQuantity": "",
			"priceValidateDate": "",
			"refNo": "",
			"pritemid": 0,
			"suppProductName": "",
			"stockCycle": "",
			"supplyDelivery": "",
			"supplyOfferDes": "",
			"supplyPayment": "",
			"materialDesc": "",
			"rowNum": 0,
			"erpCtCode": "",
			"erpCtid": "",
			"ERPProjectId": "",
			"ERPProjectName": "",
			"taxFullPrice": "",
			"taxFullMoney": "",
			"taxPartialPrice": "",
			"taxPartialMoney": "",
			"shelfLife": "",
			"brand": "",
			"benchmarkType": "",
			"settlementType": "",
			"province_id": "",
			"city_id": "",
			"district_id": "",
			"addressName": "",
			"materialCode": "",
			"taxlessFullPrice": "",
			"taxlessFullMoney": "",
			"taxlessPartialPrice": "",
			"taxlessPartialMoney": "",
			"receiveOrgId": "",
			"receiveOrgName": "",
			"receivePersonId": "",
			"receivePersonName": "",
			"receivePersonTel": "",
			"firstBillType": "",
			"firstBillcode": "",
			"firstBillId": 0,
			"firstBillBid": 0,
			"firstBillRowno": 0,
			"reqId": "",
			"reqSrcBillCode": "",
			"reqSrcRowNo": "",
			"overExecRate": "",
			"enableExecNum": "",
			"changingAction": "",
			"changingInfo": "",
			"reqDeptName": "",
			"reqDeptId": "",
			"reqPlanDeptName": "",
			"reqPlanDeptId": 0,
			"reqPlanPsnId": 0,
			"reqContact": "",
			"reqContactId": "",
			"reqDate": "",
			"reqErpRelatedInfo": "",
			"ts": "2026-06-07 13:05:44",
			"brandCode": "",
			"brandId": "",
			"priceValidateStartdate": 0,
			"brandErpId": "",
			"allowIncreasePriceRatio": "",
			"allowDecreasePriceRatio": "",
			"takerOrgId": 0,
			"takerOrgCode": "",
			"takerOrgName": "",
			"unitCode": "",
			"priceExchRate": 0,
			"mainNum": "",
			"mainMetrologyId": 0,
			"mainMetrologyName": "",
			"mainMetrologyCode": "",
			"purchaseNum": "",
			"purchaseUnitId": 0,
			"purchaseUnitName": "",
			"purchaseUnitCode": "",
			"purchaseExchRate": 0,
			"taxCategoryId": "",
			"gift": true,
			"formulaId": 0,
			"formulaName": "",
			"quotaProportion": 0,
			"quotaPercentage": 0,
			"qualitypriceId": 0,
			"singleBudgetApplyId": 0,
			"singleBudgetApplyBid": 0,
			"expenseItemId": 0,
			"releasedBudgetMny": 0,
			"releasedBudgetTaxmny": 0,
			"payContractId": "",
			"payContractBid": "",
			"priceStrategy": 0,
			"dimensionPricingId": "",
			"sourcehid": "",
			"sourcebid": "",
			"pritemidErpProductVersion": "",
			"costQuoteGroupId": 0,
			"ytenant": "",
			"natMoney": 0,
			"natTaxMoney": 0,
			"natPrice": 0,
			"natTaxPrice": 0,
			"natTax": 0,
			"tax": 0,
			"contractId": "",
			"countryCode": "",
			"countryName": "",
			"reqUapProjectId": "",
			"brandErpCode": "",
			"erpMaterialPrice": "",
			"erpSaleContractMny": "",
			"profitAmount": "",
			"profitRate": "",
			"field1": "",
			"field2": "",
			"field3": "",
			"field4": "",
			"field5": "",
			"field6": "",
			"field7": "",
			"field8": "",
			"field9": "",
			"field10": "",
			"field11": "",
			"field12": "",
			"field13": "",
			"field14": "",
			"field15": "",
			"field16": "",
			"field17": "",
			"field18": "",
			"field19": "",
			"field20": "",
			"projectCode": "",
			"projectId": "",
			"erpProjectId": "",
			"erpProjectName": "",
			"quotaReason": "",
			"accomplishedPurchaseNum": "",
			"purchaseDigit": 0,
			"purchaseRount": 0,
			"mainDigit": 0,
			"mainRount": 0,
			"unitDigit": 0,
			"unitRount": 0,
			"accomplishedPriceNum": "",
			"rowStatus": ""
		}
	],
	"contractPayTermList": [
		{
			"ytenant": "",
			"id": "",
			"enterpriseId": "",
			"payName": "",
			"enterpriseName": "",
			"payPoint": "",
			"payRatio": "",
			"payTaxMoney": "",
			"advancePay": "",
			"shelf": "",
			"settleType": "",
			"memo": "",
			"defaultValueEditable": true,
			"isProgressConfirm": "",
			"changingAction": "",
			"prePayType": "",
			"changingInfo": "",
			"settleTypeName": "",
			"payPointName": "",
			"payPeriod": "",
			"payPointAfterDay": "",
			"accountingUnit": "",
			"settleTypeId": 0,
			"payPointId": 0,
			"delayDay": "",
			"initialDate": "",
			"dueDate": "",
			"delayMonth": "",
			"intendPaymentmny": "",
			"practicalPaymentmny": "",
			"accPayApplyMoney": "",
			"outDayType": "",
			"fixedoutDay": "",
			"fixedoutDay1": "",
			"fixedoutDay2": "",
			"fixedoutDay3": "",
			"fixedoutDay4": "",
			"ts": "",
			"outDay": "2026-06-07 13:05:44",
			"dueDateType": "",
			"fixedexpireDay": "",
			"fixedexpireDay1": "",
			"fixedexpireDay2": "",
			"fixedexpireDay3": "",
			"fixedexpireDay4": "",
			"totalPayContractMoney": 0,
			"contractId": "",
			"dr": "",
			"isOriginBillCode": "",
			"settleTypeCode": "",
			"payPointAfterDayNew": ""
		}
	],
	"contractScopeList": [
		{
			"ytenant": "",
			"id": "",
			"enterpriseId": 0,
			"enterpriseName": "",
			"puorgId": "",
			"puorgCode": "",
			"puorgName": "",
			"ts": "",
			"changingAction": "",
			"changingInfo": "",
			"contractId": "",
			"dr": "",
			"rowStatus": ""
		}
	],
	"contractTermList": [
		{
			"ytenant": "",
			"termInputId": "",
			"ts": "2026-06-07 13:05:44",
			"memo": "",
			"enterpriseId": "",
			"termcode": "",
			"termname": "",
			"termtypename": "",
			"termcontent": "",
			"otherinfo": "",
			"termDocCode": "",
			"inputType": "",
			"inputValues": "",
			"defaultValue": "",
			"defaultValueEditable": true,
			"inputValue": "",
			"changingAction": "",
			"changingInfo": "",
			"number": "",
			"id": "",
			"termDocId": "",
			"rowNum": "",
			"contractId": "",
			"dr": "",
			"rowStatus": ""
		}
	],
	"supCorpAddress": "",
	"supLegalBody": "",
	"supTel": "",
	"supBank": "",
	"supBankAccount": "",
	"bankAccountLink": "",
	"bankName": "",
	"accountName": "",
	"bankAccountwf": "",
	"orgCode": "",
	"shortCode": "",
	"contractAutoCode": true,
	"ctPurContentName": "",
	"billno": "",
	"thisEnterpriseHasERP": "",
	"supplyid": 0,
	"hasWorkFlow": true,
	"hasWorkFlow4Changing": true,
	"field1": true,
	"field2": true,
	"field3": true,
	"field4": true,
	"field5": true,
	"field6": "",
	"field7": "",
	"field8": "",
	"field9": "",
	"field10": "",
	"field11": "",
	"field13": "",
	"field14": "",
	"field15": "",
	"field16": "",
	"field17": "",
	"field18": "",
	"field19": "",
	"field20": "",
	"erpSaleContractCode": "",
	"erpSaleCustName": "",
	"erpSaleContractMny": "",
	"totalOutMny": "",
	"totalOutMnyRatio": "",
	"totalReqMny": "",
	"totalReqMnyRatio": "",
	"profitAmount": "",
	"profitRate": "",
	"execName": "",
	"billFiledType": "",
	"isExpired": "",
	"paymentAgreementName": "",
	"paymentAgreementId": "",
	"incomeExpenseCode": "",
	"incomeExpenseName": "",
	"sendErpStatus": "",
	"supMsgNotifierPhone": "",
	"supplierDocId": 0,
	"exchRateType_code": "",
	"rowStatus": ""
}]

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
result	string	否	返回状态

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"result": ""
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
返回参数 code
更新
返回参数 message
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

