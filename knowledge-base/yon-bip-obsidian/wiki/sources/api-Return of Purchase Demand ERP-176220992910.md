---
title: "采购需求退回erp"
apiId: "1762209929102360581"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Demand"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Demand]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购需求退回erp

>  请求方式	POST | Purchase Demand (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/pureq/returnerp
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
org	string	header	否	需求组织路由
Body参数
名称	类型	数组	必填	描述
id	int	否	否	ID
corpSubAccount	string	否	否	企业子账号_erp采购员编码
corpAccount	string	否	否	企业账号_erp组织编码
productName	string	否	否	产品名称
quantity	float	否	否	采购数量_quantity
unit	string	否	否	单位
reqdate	date
格式:-	否	否	需求日期
reqDate	date
格式:-	否	否	需求时间
gmtQuotationExpire	date
格式:-	否	否	报价截止日期
receiveAddress	string	否	否	收货地
contact	string	否	否	联系人
phone	string	否	否	电话
erpBillstatus	string	否	否	状态
sourcecode	string	否	否	来源单据号
sourcebid	string	否	否	来源行id
productId	string	否	否	产品ID
productSpec	string	否	否	商品规格
productType	string	否	否	商品型号
ecBillcode	string	否	否	电商询价单号
ecProcessStatus	string	否	否	电商处理状态
erpVender	string	否	否	erp产品供应商
erpProductVersion	string	否	否	erp产品及版本
processor	string	否	否	处理人
processTime	date
格式:-	否	否	处理时间
ts	date
格式:-	否	否	时间戳_ts
buyofferTime	date
格式:-	否	否	询价时间_用于控制并发
subject	string	否	否	采购需求标题_询价单标题
corpAccountid	string	否	否	外系统组织or集团id
corpSubAccountid	string	否	否	外系统人员id
unitid	int	否	否	外系统过来的物料单位id
productDesc	string	否	否	商品描述
sourcehid	string	否	否	来源单据id
sourceTypeFormId	string	否	否	来源单据类型
sourcerowno	string	否	否	来源单据行号
currencyid	string	否	否	外系统币种的标识
currencyCode	string	否	否	币种编码
quotationid	int	否	否	quotationid_废弃
orderTime	date
格式:-	否	否	订单日期_废弃
productCode	string	否	否	产品编码
planpsnId	string	否	否	外系统计划员id
planpsnCode	string	否	否	外系统计划员编码
planpsnName	string	否	否	外系统计划员名字
planpsnMobile	string	否	否	外系统计划员手机
planpsnDeptId	string	否	否	外系统计划员所属部门id
planpsnDeptCode	string	否	否	外系统计划员所属部门code
planpsnDeptName	string	否	否	外系统计划员所属部门名称
planpsnReceiveAddress	string	否	否	外系统带入的收货地址
planpsnOrgId	string	否	否	外系统计划员所属组织id
planpsnOrgCode	string	否	否	外系统计划员所属组织code
planpsnOrgName	string	否	否	外系统计划员所属组织名称
corpAccountname	string	否	否	外系统组织or集团名称
corpSubAccountname	string	否	否	外系统人员名称_采购员名称
groupid	string	否	否	外系统集团
groupcode	string	否	否	外系统集团code
groupname	string	否	否	外系统集团名称
puorgid	string	否	否	采购组织id
puorgcode	string	否	否	采购组织编码
puorgname	string	否	否	外系统采购组织id名称
suggestSupplierId	string	否	否	推荐供应商id_erp供应商id
suggestSupplierName	string	否	否	推荐供应商名称
reqOrgId	string	否	否	需求组织id_erp组织id
reqOrgCode	string	否	否	需求组织编码
reqOrgName	string	否	否	需求组织名称
planDeptId	string	否	否	计划部门id
planDeptName	string	否	否	计划部门名称
planPsnId	string	否	否	计划员id_云采人员id
planPsnName	string	否	否	计划员名称
assignPsn	string	否	否	分配人-云采人员id
refuseAssignPsn	string	否	否	退回分配人_退回分配的云采人员
assignDept	string	否	否	分配角色-租户中心角色id
enterpriseId	int	否	否	租户id
enterpriseName	string	否	否	租户名称
sysVersion	int	否	否	系统版本
createTime	date
格式:-	否	否	创建时间
updateTime	date
格式:-	否	否	更新时间
createPin	string	否	否	创建人Pin
updatePin	string	否	否	修改人
modifiedtime	date
格式:-	否	否	修改时间
creator	string	否	否	创建人
modifier	string	否	否	修改者
corpSubAccountUserId	int	否	否	需求提交人的用户id-云采用户id
suggestSpplierDocId	int	否	否	推荐供应商id_云采供应商档案id
reqOrgDocId	string	否	否	需求组织id
puorgDocId	string	否	否	采购组织id_云采组织id
productDocId	int	否	否	商品id_云采商品id
unitcode	string	否	否	单位编码-ERP单位的编码
erpBillmaker	string	否	否	ERP制单人
erpBillmakerUserId	string	否	否	ERP制单人对应的云采用户Id
erpCpuPsnId	string	否	否	ERP人员对应云采人员ID
memo	string	否	否	备注
erpRelatedInfo	string	否	否	erp相关信息
buyofferPublishUserId	string	否	否	生成下游单据操作人_云采用户id
refNo	string	否	否	供应商协议号
erpBillCodeNo	string	否	否	erp单据号加行号
returningErp	int	否	否	是否正在退回ERP
projectId	string	否	否	项目id
eRPProjectName	string	否	否	erp项目名称
eRPProjectId	string	否	否	erp项目id
erpReqDeptId	string	否	否	需求部门id
erpReqDeptName	string	否	否	需求部门名称
erpReqDeptCode	string	否	否	需求部门编码
reqDeptId	string	否	否	需求部门id云采id
assignnerPsnDocId	string	否	否	分配发起者的personId
assignnerPsnDocName	string	否	否	分配发起者的personName
materialClassId	int	否	否	物料分类id
materialClassCode	string	否	否	物料分类编码
materialClassName	string	否	否	物料分类名称
receiveOrgId	string	否	否	收货组织id
receiveOrgName	string	否	否	收货组织名称
receivePersonId	string	否	否	收货人id
receivePersonName	string	否	否	收货人姓名
receivePersonTel	string	否	否	收货人电话
reqPurUser	string	否	否	采购员
reqPurUserName	string	否	否	采购员名称
reqPhone	string	否	否	采购员电话
refuseAssignReason	string	否	否	退回分配人_退回分配的云采人员id
reqProjectName	string	否	否	项目名称
reqProjectId	string	否	否	req项目id
outTenderPsn	string	否	否	转外部招标人
planPrice	float	否	否	计划价格
brand	string	否	否	品牌
reqContact	string	否	否	需求联系人
reqContactId	string	否	否	需求联系人ID
assignDate	date
格式:-	否	否	分配时间
orderedQuantity	float	否	否	已下单数量
orderSourceStatus	string	否	否	生成采购订单方式
marpuclassid	string	否	否	NC请购单物料采购分类ID
marpuclasscode	string	否	否	NC请购单物料采购分类编码
marpuclassname	string	否	否	NC请购单物料采购分类名称
orgChangPersonId	string	否	否	需求组织变更操作人ID
orgChangPersonName	string	否	否	需求组织变更操作人姓名
orgChangTime	date
格式:-	否	否	采购组织变更时间
currencyName	string	否	否	币种name
contractBillType	string	否	否	生成的合同类型
entrustId	int	否	否	采购需求委托单id
entrustPsnId	string	否	否	采购委托受理人id
refuseErpReason	string	否	否	退回ERP原因
orderSplit	string	否	否	订单弹性分单条件标识
orderSplitName	string	否	否	订单弹性分单条件标识名称
busiType	string	否	否	寻源类型
transactionTypeId	string	否	否	交易类型id
transactionTypeName	string	否	否	交易类型名称
transactionTypeCode	string	否	否	交易类型编码
reqUapProjectId	string	否	否	平台projectid
requireType	string	否	否	需求类型
purCategory	string	否	否	采购类别
entryTime	date
格式:-	否	否	项目进场时间
reqProjectCode	string	否	否	项目需求编码
currencyCodeDiwork	string	否	否	BIP币种编码
currencyNameDiwork	string	否	否	BIP币种名称
currencyTypeSignDiwork	string	否	否	BIP币种符号
currencyIdDiwork	string	否	否	BIP币种id
isSplit	string	否	否	是否拆单
reqProjectPersonName	string	否	否	项目负责人
wareHouseId	int	否	否	仓库id
wareHouseName	string	否	否	仓库名称
wareHouseCode	string	否	否	仓库编码
purchasetypeCode	string	否	否	采购具体类型编码
purchasetypeName	string	否	否	采购具体类型名称
profitcenterName	string	否	否	利润中心名称
returnMsg	string	否	否	寻源过程中将需求退回到采购任务原因
errorMsg	string	否	否	记录异步生成订单日志
purchaseUnitName	string	否	否	采购单位名称
purchaseUnitCode	string	否	否	采购单位code
purchaseUnitId	int	否	否	采购单位id
mainUnitId	int	否	否	主单位id
mainUnitCode	string	否	否	主单位code
mainUnitName	string	否	否	主单位名称
purchaseNum	float	否	否	采购数量
mainNum	float	否	否	主数量
invPriceExchRate	float	否	否	计价换算率
invPurExchRate	float	否	否	采购换算率Pur
preemptionBusiNums	float	否	否	累积执行量-预占量
accruedBusiNums	float	否	否	累积执行量-实际量
accruedMainNums	float	否	否	已执行主数量
accruedPurchaseNums	float	否	否	已执行采购数量
accruedEntrustNums	float	否	否	累积采购委托量
accruedBuyofferNums	float	否	否	累积询价量_保存_不是采购委托生成的询价单
accruedBuyofferEntrustNums	float	否	否	累积询价量_保存_是采购委托生成的询价单
accruedBuyofferPublishNums	float	否	否	累积询价量_发布
accruedPdNums	float	否	否	累积定标量
accruedBidPdNums	float	否	否	累积招投标定标量
accruedBidProgrammeNums	float	否	否	累积竞拍方案量_计价数量
accruedCtNums	float	否	否	累积合同量
accruedDirectCtNums	float	否	否	累积合同量_采购需求直接生成合同
preemptionDirectCtNums	float	否	否	累积合同量_预占量_采购需求直接生成合同
accruedOrderNums	float	否	否	累积订单量_寻源订单量
accruedDirectOrderNums	float	否	否	累积订单量_协议直采_跟单采购订单
preemptionDirectOrderNums	float	否	否	累积订单量_预占量_协议直采_跟单采购订单
accruedProjectNums	float	否	否	累积招投标立项量_不是采购委托生成的立项单
accruedProjectEntrustNums	float	否	否	累积招投标立项量_是采购委托生成的立项单
accruedMallOrderNums	float	否	否	累积超市订单量
accruedBuyofferCloseNums	float	否	否	累积询价终止数量
accruedPureqCloseNums	float	否	否	累积需求终止数量
emergencyFlag	int	否	否	紧急度标识
fileId	string	否	否	附件ID
reqPurpose	string	否	否	用途
singleBudgetApplyid	int	否	否	单项预算申请单编号
expenseItemId	int	否	否	费用项目主键
singleBudgetApplybid	int	否	否	单项预算申请单明细
isClosed	string	否	否	关闭或者打开状态
createDate	string	否	否	创建日期
code	string	否	否	编码
buyerTenant	string	否	否	采购商租户
dr	int	否	否	逻辑删除标记
ytenant	string	否	否	租户
pubts	date
格式:-	否	否	时间戳
cpuIpuReqSkuext	int	否	否	采购需求sku扩展
defines	int	否	否	采购需求自由自定义项
ncucode	string	否	否	ERP用户编码
accountID	string	否	否	租户ID
ycProjectId	string	否	否	项目
ycSuggestSupplierId	float	否	否	云采建议供应商ID
materialAmounts	float	否	否	物料数量
itemCode	string	否	否	ERP需求单号商品行code
systemCode	string	否	否	对接的外部系统编码
ycMaterialId	float	否	否	云采物料ID
ycReqOrgId	string	否	否	云采需求组织ID
billID	string	否	否	ERP需求单ID
billCode	string	否	否	ERP需求单号
ycPuOrgId	string	否	否	云采采购组织ID
ycPlanDeptId	string	否	否	云采计划部门ID
qty	float	否	否	数量
ycPlanPsnId	string	否	否	云采计划员ID
itemID	string	否	否	ERP需求单号商品行ID
invExchRate	float	否	否	采购换算率
ycReceiveOrgId	string	否	否	云采收货组织ID
ycReqDeptId	string	否	否	云采需求部门ID
materialUnitId	string	否	否	云采采购单位ID
ipuPuReqFreeCharacteristics	elastic	否	否	采购需求自由项特征组
ipuPuReqDefineCharacter	elastic	否	否	采购需求自定义项
define1	string	否	否	自定义项1
define2	string	否	否	自定义项2
define3	string	否	否	自定义项3
define4	string	否	否	自定义项4
define5	string	否	否	自定义项5
define6	string	否	否	自定义项6
define7	string	否	否	自定义项7
define8	string	否	否	自定义项8
define9	string	否	否	自定义项9
define10	string	否	否	自定义项10
define11	string	否	否	自定义项11
define12	string	否	否	自定义项12
define13	string	否	否	自定义项13
define14	string	否	否	自定义项14
define15	string	否	否	自定义项15
define16	string	否	否	自定义项16
define17	string	否	否	自定义项17
define18	string	否	否	自定义项18
define19	string	否	否	自定义项19
define20	string	否	否	自定义项20
define21	string	否	否	自定义项21
define22	string	否	否	自定义项22
define23	string	否	否	自定义项23
define24	string	否	否	自定义项24
define25	string	否	否	自定义项25
define26	string	否	否	自定义项26
define27	string	否	否	自定义项27
define28	string	否	否	自定义项28
define29	string	否	否	自定义项29
define30	string	否	否	自定义项30
define31	string	否	否	自定义项31
define32	string	否	否	自定义项32
define33	string	否	否	自定义项33
define34	string	否	否	自定义项34
define35	string	否	否	自定义项35
define36	string	否	否	自定义项36
define37	string	否	否	自定义项37
define38	string	否	否	自定义项38
define39	string	否	否	自定义项39
define40	string	否	否	自定义项40
define41	string	否	否	自定义项41
define42	string	否	否	自定义项42
define43	string	否	否	自定义项43
define44	string	否	否	自定义项44
define45	string	否	否	自定义项45
define46	string	否	否	自定义项46
define47	string	否	否	自定义项47
define48	string	否	否	自定义项48
define49	string	否	否	自定义项49
define50	string	否	否	自定义项50
define51	string	否	否	自定义项51
define52	string	否	否	自定义项52
define53	string	否	否	自定义项53
define54	string	否	否	自定义项54
define55	string	否	否	自定义项55
define56	string	否	否	自定义项56
define57	string	否	否	自定义项57
define58	string	否	否	自定义项58
define59	string	否	否	自定义项59
define60	string	否	否	自定义项60
reqContactErpId	string	否	否	需求联系人ErpID
materialUnitCode	string	否	否	物料单位code
accruedQuotaOrderNums	float	否	否	累积订单量_货源下单
businessType	string	否	否	业务类型
operationReason	string	否	否	关闭或者打开原因
operationTime	date
格式:-	否	否	打开或者关闭时间
operationName	string	否	否	打开或者关闭名称
sourceUnique	string	否	是	来源标识

## 3. 请求示例

Url: /yonbip/cpu/pureq/returnerp?access_token=访问令牌
Header: 
	org : ""
Body: [{
	"id": 0,
	"corpSubAccount": "",
	"corpAccount": "",
	"productName": "",
	"quantity": 0,
	"unit": "",
	"reqdate": "2026-06-07 13:05:27",
	"reqDate": "2026-06-07 13:05:27",
	"gmtQuotationExpire": "2026-06-07 13:05:27",
	"receiveAddress": "",
	"contact": "",
	"phone": "",
	"erpBillstatus": "",
	"sourcecode": "",
	"sourcebid": "",
	"productId": "",
	"productSpec": "",
	"productType": "",
	"ecBillcode": "",
	"ecProcessStatus": "",
	"erpVender": "",
	"erpProductVersion": "",
	"processor": "",
	"processTime": "2026-06-07 13:05:27",
	"ts": "2026-06-07 13:05:27",
	"buyofferTime": "2026-06-07 13:05:27",
	"subject": "",
	"corpAccountid": "",
	"corpSubAccountid": "",
	"unitid": 0,
	"productDesc": "",
	"sourcehid": "",
	"sourceTypeFormId": "",
	"sourcerowno": "",
	"currencyid": "",
	"currencyCode": "",
	"quotationid": 0,
	"orderTime": "2026-06-07 13:05:27",
	"productCode": "",
	"planpsnId": "",
	"planpsnCode": "",
	"planpsnName": "",
	"planpsnMobile": "",
	"planpsnDeptId": "",
	"planpsnDeptCode": "",
	"planpsnDeptName": "",
	"planpsnReceiveAddress": "",
	"planpsnOrgId": "",
	"planpsnOrgCode": "",
	"planpsnOrgName": "",
	"corpAccountname": "",
	"corpSubAccountname": "",
	"groupid": "",
	"groupcode": "",
	"groupname": "",
	"puorgid": "",
	"puorgcode": "",
	"puorgname": "",
	"suggestSupplierId": "",
	"suggestSupplierName": "",
	"reqOrgId": "",
	"reqOrgCode": "",
	"reqOrgName": "",
	"planDeptId": "",
	"planDeptName": "",
	"planPsnId": "",
	"planPsnName": "",
	"assignPsn": "",
	"refuseAssignPsn": "",
	"assignDept": "",
	"enterpriseId": 0,
	"enterpriseName": "",
	"sysVersion": 0,
	"createTime": "2026-06-07 13:05:27",
	"updateTime": "2026-06-07 13:05:27",
	"createPin": "",
	"updatePin": "",
	"modifiedtime": "2026-06-07 13:05:27",
	"creator": "",
	"modifier": "",
	"corpSubAccountUserId": 0,
	"suggestSpplierDocId": 0,
	"reqOrgDocId": "",
	"puorgDocId": "",
	"productDocId": 0,
	"unitcode": "",
	"erpBillmaker": "",
	"erpBillmakerUserId": "",
	"erpCpuPsnId": "",
	"memo": "",
	"erpRelatedInfo": "",
	"buyofferPublishUserId": "",
	"refNo": "",
	"erpBillCodeNo": "",
	"returningErp": 0,
	"projectId": "",
	"eRPProjectName": "",
	"eRPProjectId": "",
	"erpReqDeptId": "",
	"erpReqDeptName": "",
	"erpReqDeptCode": "",
	"reqDeptId": "",
	"assignnerPsnDocId": "",
	"assignnerPsnDocName": "",
	"materialClassId": 0,
	"materialClassCode": "",
	"materialClassName": "",
	"receiveOrgId": "",
	"receiveOrgName": "",
	"receivePersonId": "",
	"receivePersonName": "",
	"receivePersonTel": "",
	"reqPurUser": "",
	"reqPurUserName": "",
	"reqPhone": "",
	"refuseAssignReason": "",
	"reqProjectName": "",
	"reqProjectId": "",
	"outTenderPsn": "",
	"planPrice": 0,
	"brand": "",
	"reqContact": "",
	"reqContactId": "",
	"assignDate": "2026-06-07 13:05:27",
	"orderedQuantity": 0,
	"orderSourceStatus": "",
	"marpuclassid": "",
	"marpuclasscode": "",
	"marpuclassname": "",
	"orgChangPersonId": "",
	"orgChangPersonName": "",
	"orgChangTime": "2026-06-07 13:05:27",
	"currencyName": "",
	"contractBillType": "",
	"entrustId": 0,
	"entrustPsnId": "",
	"refuseErpReason": "",
	"orderSplit": "",
	"orderSplitName": "",
	"busiType": "",
	"transactionTypeId": "",
	"transactionTypeName": "",
	"transactionTypeCode": "",
	"reqUapProjectId": "",
	"requireType": "",
	"purCategory": "",
	"entryTime": "2026-06-07 13:05:27",
	"reqProjectCode": "",
	"currencyCodeDiwork": "",
	"currencyNameDiwork": "",
	"currencyTypeSignDiwork": "",
	"currencyIdDiwork": "",
	"isSplit": "",
	"reqProjectPersonName": "",
	"wareHouseId": 0,
	"wareHouseName": "",
	"wareHouseCode": "",
	"purchasetypeCode": "",
	"purchasetypeName": "",
	"profitcenterName": "",
	"returnMsg": "",
	"errorMsg": "",
	"purchaseUnitName": "",
	"purchaseUnitCode": "",
	"purchaseUnitId": 0,
	"mainUnitId": 0,
	"mainUnitCode": "",
	"mainUnitName": "",
	"purchaseNum": 0,
	"mainNum": 0,
	"invPriceExchRate": 0,
	"invPurExchRate": 0,
	"preemptionBusiNums": 0,
	"accruedBusiNums": 0,
	"accruedMainNums": 0,
	"accruedPurchaseNums": 0,
	"accruedEntrustNums": 0,
	"accruedBuyofferNums": 0,
	"accruedBuyofferEntrustNums": 0,
	"accruedBuyofferPublishNums": 0,
	"accruedPdNums": 0,
	"accruedBidPdNums": 0,
	"accruedBidProgrammeNums": 0,
	"accruedCtNums": 0,
	"accruedDirectCtNums": 0,
	"preemptionDirectCtNums": 0,
	"accruedOrderNums": 0,
	"accruedDirectOrderNums": 0,
	"preemptionDirectOrderNums": 0,
	"accruedProjectNums": 0,
	"accruedProjectEntrustNums": 0,
	"accruedMallOrderNums": 0,
	"accruedBuyofferCloseNums": 0,
	"accruedPureqCloseNums": 0,
	"emergencyFlag": 0,
	"fileId": "",
	"reqPurpose": "",
	"singleBudgetApplyid": 0,
	"expenseItemId": 0,
	"singleBudgetApplybid": 0,
	"isClosed": "",
	"createDate": "",
	"code": "",
	"buyerTenant": "",
	"dr": 0,
	"ytenant": "",
	"pubts": "2026-06-07 13:05:27",
	"cpuIpuReqSkuext": 0,
	"defines": 0,
	"ncucode": "",
	"accountID": "",
	"ycProjectId": "",
	"ycSuggestSupplierId": 0,
	"materialAmounts": 0,
	"itemCode": "",
	"systemCode": "",
	"ycMaterialId": 0,
	"ycReqOrgId": "",
	"billID": "",
	"billCode": "",
	"ycPuOrgId": "",
	"ycPlanDeptId": "",
	"qty": 0,
	"ycPlanPsnId": "",
	"itemID": "",
	"invExchRate": 0,
	"ycReceiveOrgId": "",
	"ycReqDeptId": "",
	"materialUnitId": "",
	"ipuPuReqFreeCharacteristics": "",
	"ipuPuReqDefineCharacter": "",
	"define1": "",
	"define2": "",
	"define3": "",
	"define4": "",
	"define5": "",
	"define6": "",
	"define7": "",
	"define8": "",
	"define9": "",
	"define10": "",
	"define11": "",
	"define12": "",
	"define13": "",
	"define14": "",
	"define15": "",
	"define16": "",
	"define17": "",
	"define18": "",
	"define19": "",
	"define20": "",
	"define21": "",
	"define22": "",
	"define23": "",
	"define24": "",
	"define25": "",
	"define26": "",
	"define27": "",
	"define28": "",
	"define29": "",
	"define30": "",
	"define31": "",
	"define32": "",
	"define33": "",
	"define34": "",
	"define35": "",
	"define36": "",
	"define37": "",
	"define38": "",
	"define39": "",
	"define40": "",
	"define41": "",
	"define42": "",
	"define43": "",
	"define44": "",
	"define45": "",
	"define46": "",
	"define47": "",
	"define48": "",
	"define49": "",
	"define50": "",
	"define51": "",
	"define52": "",
	"define53": "",
	"define54": "",
	"define55": "",
	"define56": "",
	"define57": "",
	"define58": "",
	"define59": "",
	"define60": "",
	"reqContactErpId": "",
	"materialUnitCode": "",
	"accruedQuotaOrderNums": 0,
	"businessType": "",
	"operationReason": "",
	"operationTime": "2026-06-07 13:05:27",
	"operationName": "",
	"sourceUnique": ""
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

