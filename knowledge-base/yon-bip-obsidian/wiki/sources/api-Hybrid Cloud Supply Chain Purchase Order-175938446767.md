---
title: "pubPersonId	string	否	否	发布人"
apiId: "1759384467670040578"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# pubPersonId	string	否	否	发布人

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/connectorOrders
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
purchaseOrg	string	header	否	组织路由
bustypeCode	string	header	否	交易类型路由
retailAgentName	string	header	否	散户路由
Body参数
名称	类型	数组	必填	描述
modifyReason	string	否	否	变更原因
operator	string	否	否	采购员
custom	int	否	否	客户id
bustype	string	否	否	交易类型
generalPurchaseOrderType	string	否	否	交易类型扩展参数
org	string	否	否	采购组织
vendor	int	否	否	供货供应商
retailAgentName	string	否	否	散户
vendorAuth	int	否	否	供货供应商权限
contact	string	否	否	供方联系人
vendorcontact	int	否	否	供方联系人id
expectDate	date
格式:-	否	否	希望到货日期
moneysum	float	否	否	金额
totalQuantity	float	否	否	总数量
approvenum	float	否	否	审批数量
storagenum	float	否	否	入库数量
closenum	float	否	否	关闭数量
bizstatus	string	否	否	单据状态BIZ
inInvoiceOrg	string	否	否	收票组织id
contactTel	string	否	否	供方联系人手机
department	string	否	否	采购部门
invoiceVendor	float	否	否	开票供应商id
taxRate	float	否	否	税率
taxitems	string	否	否	税目id
otherOrderCode	string	否	否	对方销售订单号
totalPayMoney	float	否	否	累计付款金额
totalPayNATMoney	float	否	否	本币累计付款核销金额
srcBill	int	否	否	来源单据ID
srcBillNO	string	否	否	来源单据号
source	string	否	否	来源单据类型
allTotalArrivedTaxMoney	float	否	否	累计到货金额
allTotalInTaxMoney	float	否	否	累计入库金额
allTotalInvoiceMoney	float	否	否	累计开票金额
modifyStatus	string	否	否	变更状态
isMaxLimitPrice	boolean	否	否	是否超最高限价
exchRateType	string	否	否	汇率类型id
lockerId	string	否	否	锁定人id
store	int	否	否	门店
sourceTenant	int	否	否	来源租户id
outSourceOrg	string	否	否	外部来源组织id
socialStatus	string	否	否	是否租户间社会化协同
directShipment	string	否	否	直运采购
bEffectStock	boolean	否	否	影响可用量
lowCodeFlowId	string	否	否	低代码流程ID
isContract	boolean	否	否	是否需要与供应商协同
isAllowAdjustPrice	string	否	否	采购合同单价是否可改
settlemethod	int	否	否	结算方式id
isVMI	boolean	否	否	寄存
paymentIsContract	string	否	否	付款协议是否来源采购合同
contactAddress	string	否	否	供方地址
despatchMode	int	否	否	发运方式
receAreaId	int	否	否	起始地运输区域
isDespatch	boolean	否	否	启用发运管理
exchRateDate	date
格式:-	否	否	汇率日期
phasedInvoice	boolean	否	否	分阶段开票
delivery_method	int	否	否	交付方式
expenseOriSum	float	否	否	费用含税金额
expiredayConfirmType	int	否	否	到期日确定方式
oadayConfirmType	int	否	否	出账日确定方式
sendERPStatus	int	否	否	发送ERP状态
sendFailCause	string	否	否	发送失败原因
dealPersonId	string	否	否	处理人id
dealTime	object	否	否	处理时间
dealDate	date
格式:-	否	否	处理日期
dealPhone	string	否	否	处理人电话
closer	string	否	否	关闭人
closerId	int	否	否	关闭人id
closeTime	object	否	否	关闭时间
closeDate	date
格式:-	否	否	关闭日期
printCount	int	否	否	打印次数
isWfControlled	boolean	否	否	是否审批流控制
verifystate	int	否	否	审批状态
returncount	int	否	否	退回次数
natCurrency	string	否	否	本币
currency	string	否	否	币种Id
exchRate	float	否	否	汇率
locker	string	否	否	锁定人
lockTime	object	否	否	锁定时间
lockDate	date
格式:-	否	否	锁定日期
accountDate	date
格式:-	否	否	立账日
payAgreement	int	否	否	立账规则id
maturityDate	date
格式:-	否	否	到期日期
accountDays	int	否	否	账期
oriSum	float	否	否	含税金额
oriTax	float	否	否	税额
oriUnitPrice	float	否	否	原币无税单价
oriTaxUnitPrice	float	否	否	原币含税单价
oriMoney	float	否	否	无税金额
natSum	float	否	否	本币含税金额
natTax	float	否	否	本币税额
natTaxUnitPrice	float	否	否	本币含税单价
natMoney	float	否	否	本币无税金额
natUnitPrice	float	否	否	本币无税单价
wbTime	string	否	否	单据回写时间
bizFlow	string	否	否	流程ID
isFlowCoreBill	boolean	否	否	是否流程核心单据
barCode	string	否	否	单据条码
inventoryowner	int	否	否	货主对象ID
memo	string	否	否	备注
auditor	string	否	否	审核人
auditorId	int	否	否	审批人id
auditTime	object	否	否	审核时间
auditDate	string	否	否	审核日期
vouchdate	string	否	否	单据日期
tplid	int	否	否	模板id
status	string	否	否	单据状态
irespstatus	string	否	否	响应状态
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	订单编号
createTime	object	否	否	创建时间
createDate	string	否	否	创建日期
modifyTime	object	否	否	修改时间
modifyDate	date
格式:-	否	否	修改日期
creator	string	否	否	创建人
modifier	string	否	否	修改人
creatorId	int	否	否	创建人id
modifierId	int	否	否	修改人id
tenant	int	否	否	租户
id	int	否	否	主表关联标识id
pubts	object	否	否	时间戳
purchaseOrders	object	是	否	采购订单子表
mainid	int	否	否	主表关联标识mainid
unit	int	否	否	单位id
approveqty	float	否	否	已批复数量
storageqty	float	否	否	已入库数量
closeqty	float	否	否	已关闭数量
inOrg	string	否	否	收货组织id
demandOrg	string	否	否	需求组织id
inInvoiceOrg	string	否	否	收票组织id
project	string	否	否	项目id
projectCode	string	否	否	项目编码
warehouse	int	否	否	仓库id
store	int	否	否	门店id
isGiftProduct	boolean	否	否	赠品
supplyItemCode	string	否	否	供应商物料编码
supplyItemName	string	否	否	供应商物料名称
supplyProductModel	string	否	否	供应商物料规格型号
recieveDate	string	否	否	计划到货日期
priceUOM	int	否	否	计价单位id
purUOM	int	否	否	采购单位id
discountTaxType	string	否	否	扣税类别
priceHaveTax	boolean	否	否	价格是否含税
maxInPrice	float	否	否	最高进价
totalRecieveQty	float	否	否	累计到货数量
totalInQty	float	否	否	累计入库数量
totalInvoiceQty	float	否	否	累计开票数量
totalInvoiceMoney	float	否	否	累计开票金额
totalPayQty	float	否	否	累计付款数量
totalPayNATMoney	float	否	否	本币累计付款核销金额
prePayMoney	float	否	否	预付款
verifiedPrePayMoney	float	否	否	预付款核销金额
totalRejectQty	float	否	否	累计拒收数量
totalRejectSubqty	float	否	否	累计拒收件数
totalArrivedTaxMoney	float	否	否	累计到货含税金额
totalArrivedNatTaxMoney	float	否	否	累计到货本币含税金额
totalInTaxMoney	float	否	否	累计入库含税金额
totalInNatTaxMoney	float	否	否	累计入库本币含税金额
totalInvoiceNatTaxMoney	float	否	否	累计发票本币含税金额
totalPayOriMoney	float	否	否	累计付款核销金额
otherOrderRowNO	int	否	否	对方销售订单行号
outSrcBillRowNO	int	否	否	外部来源单据行号
outSrcBillRowId	int	否	否	外部来源单据子表id
outSrcBillNO	string	否	否	外部来源单据号
outSrcBillId	int	否	否	外部来源单据Id
outSource	string	否	否	外部来源类型
trackingNO	string	否	否	跟踪号
totalRecieveSubqty	float	否	否	累计到货件数
totalInSubqty	float	否	否	累计入库件数
totalReturnInQty	float	否	否	累计退库数量
totalReturnInSubQty	float	否	否	累计退库件数
totalSaleQty	float	否	否	累计协同销售数量
agentId	int	否	否	收货客户
receiver	string	否	否	收货人
receiveTelePhone	string	否	否	收货人电话
receiveAddress	string	否	否	收货地址
totalSendQty	float	否	否	累计发货数量
totalPurchaseSendQty	float	否	否	累计发货件数
totalPayAmount	float	否	否	累计付款金额
totalSaleOrderQty	float	否	否	累计转销售订单数量
rejectReplenishQty	float	否	否	拒收需补货数量
taxitems	string	否	否	税目id
productDesc	string	否	否	物料描述
proDescFlag	string	否	否	描述物料标识
sourceProDescFlag	string	否	否	来源描述物料标识
totalAcceptQty	float	否	否	累计实收数量
totalAcceptSubqty	float	否	否	累计实收件数
warehousingClose	boolean	否	否	入库关闭
ticketCollectionClose	boolean	否	否	收票关闭
paymentClose	boolean	否	否	付款关闭
arrivalClose	boolean	否	否	到货关闭
srcApplyOrderId	string	否	否	合同来源请购单主表Id
srcApplyOrderAotoId	string	否	否	合同来源请购单子表Id
srcReqId	int	否	否	合同来源需求单Id
unDeductTaxRate	float	否	否	不可抵扣税率
unDeductTax	float	否	否	不可抵扣税额
materialClassId	int	否	否	物料分类
isDoLogistics	int	否	否	已下发物流
isLogisticsRelated	boolean	否	否	物流相关
weighFinish	boolean	否	否	称重完成
totalPayApplyAmount	float	否	否	累计付款申请金额
plannedTotalRecPurQty	float	否	否	已计划到货数量_采购
plannedTotalRecUnitQty	float	否	否	已计划到货数量_主
memo	string	否	否	备注
isArrivalplan	boolean	否	否	是否到货计划
amountPayable	float	否	否	应付金额
product	int	否	否	物料id
productsku	int	否	否	物料SKUid
productAuth	int	否	否	物料权限
oriUnitPriceOriginal	float	否	否	无税单价_原价
oriTaxUnitPriceOriginal	float	否	否	含税单价_原价
discountRate	float	否	否	折扣率
totalInReceivedQty	float	否	否	累计入库应收数量
totalInReceivedSubqty	float	否	否	累计入库应收件数
suite_amount	float	否	否	套件数量
suiteSon_amount	float	否	否	每套子件数量
suiteId	int	否	否	套件id
suiteSon_priceWeight	float	否	否	金额权重比
suiteGroup	string	否	否	套件组号
minOrderQty	float	否	否	最小起订量
orderDoubleQty	float	否	否	采购倍量
totalReturnAndReturnInQty	float	否	否	累计退货退库数量
totalReturnAndReturnInSubQty	float	否	否	累计退货退库件数
totalReturnQty	float	否	否	累计退货数量
totalReturnSubQty	float	否	否	累计退货件数
totalInvoiceNoTaxMoney	float	否	否	累计开票无税金额
totalInNoTaxMoney	float	否	否	累计入库无税金额
priceSource	string	否	否	价格来源
priceMark	int	否	否	价格标识
logisticsOrgId	string	否	否	物流组织
loadModeId	int	否	否	装载方式
recePointId	int	否	否	收货点
endAreaId	int	否	否	目的地运输区域
planTransRouteId	int	否	否	计划运输路线
distributionSide	string	否	否	配送方
expenseItemId	int	否	否	费用项目
qualityPriceScheme	int	否	否	优质优价方案
isRowExpenses	boolean	否	否	是否有行费用
contractBatchNumber	string	否	否	合同批次号
deliveryBatchNumber	string	否	否	交付批号
more_or_less	float	否	否	溢短装
free1	string	否	否	颜色
free2	string	否	否	尺码
free3	string	否	否	定量测试
free4	string	否	否	测试独显
free5	string	否	否	323
free6	string	否	否	物料规格6
free7	string	否	否	物料规格7
free8	string	否	否	物料规格8
free9	string	否	否	物料规格9
free10	string	否	否	物料规格10
qty	float	否	否	数量
subQty	float	否	否	采购数量
invExchRate	float	否	否	采购换算率
taxRate	float	否	否	税率
oriSum	float	否	否	含税金额
oriTax	float	否	否	税额
oriUnitPrice	float	否	否	无税单价
oriTaxUnitPrice	float	否	否	含税单价
oriMoney	float	否	否	无税金额
natSum	float	否	否	本币含税金额
natTax	float	否	否	本币税额
natTaxUnitPrice	float	否	否	本币含税单价
natMoney	float	否	否	本币无税金额
natUnitPrice	float	否	否	本币无税单价
maxLimitPrice	float	否	否	最高限价
materialId	int	否	否	制造物料ID
sourceid	int	否	否	来源单据id
sourceautoid	int	否	否	来源单据子表id
source	string	否	否	来源单据类型
upcode	string	否	否	来源单据号
makeRuleCode	string	否	否	生单规则编号
sourceMainPubts	object	否	否	时间戳sourceMainPubts
groupTaskKey	string	否	否	分组任务KEY
priceQty	float	否	否	计价数量
invPriceExchRate	float	否	否	计价换算率
linecloser	string	否	否	关闭人
linecloseTime	object	否	否	关闭时间
unitExchangeType	int	否	否	采购单位转换率的换算方式
unitExchangeTypePrice	int	否	否	计价单位转换率的换算方式
firstsourceid	int	否	否	源头单据主表id
firstsourceautoid	int	否	否	源头单据子表id
firstsource	string	否	否	源头单据类型
firstupcode	string	否	否	源头单据号
reserveid	int	否	否	需求对象Id
lineno	float	否	否	业务行号
upLineno	float	否	否	来源单据行号
sourceUpLineno	float	否	否	源头单据行号
ytenant	string	否	否	租户id
costCenter	int	否	否	成本中心
providerProfitCenter	string	否	否	供方利润中心
consumerProfitCenter	string	否	否	需方利润中心
stockSensClue	string	否	否	现存量特征敏感线索
batchno	string	否	否	批次号
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
producedate	date
格式:-	否	否	生产日期
invaliddate	date
格式:-	否	否	失效日期
goodsposition	int	否	否	货位
rowno	int	否	否	行号
id	int	否	否	主表关联标识id2
pubts	object	否	否	时间戳2
bodyItem	object	否	否	采购订单子表自定义项
bodyParallel	object	否	否	采购订单子表平行表
bodyFreeItem	object	否	否	采购订单子表自由自定义项
arrivalPlans	int	是	否	到货计划子表
paymentProgressACKs	int	否	否	采购订单付款计划进度确认孙表
startDate_code	string	否	否	起算时点编码
settlemethod_code	string	否	否	结算方式编码
productn	int	否	否	物料
productskun	int	否	否	物料SKU1
isLineFeedback	boolean	否	否	是否已下推反馈单
coreOrderId	int	否	否	核心订单主表id
coreOrderlineId	int	否	否	核心订单子表id
coreOrderCode	string	否	否	核心订单号
coreOrderRowNO	float	否	否	核心订单行号
expenseNatSum	float	否	否	费用本币含税
expenseNatMoney	float	否	否	费用本币无税
expenseOriSum	float	否	否	费用原币含税
expenseOriMoney	float	否	否	费用原币无税
hasPaymentSchedules	boolean	否	否	是否有随单付款计划
material	int	否	否	母件
priceEquation	int	否	否	价格公式
priceEquationFormula	string	否	否	价格公式算式
inStoreLessLimit	float	否	否	下限比例
rejectReplenishSubQty	float	否	否	拒收需补货件数
paymentSchedules	object	是	否	供应链付款计划子表
payNatSum	float	否	否	本币付款总金额
number	int	否	否	期号_付款执行计划
name	string	否	否	付款名称
payRatio	float	否	否	付款比例
amount	float	否	否	应付金额
payNatMoney	float	否	否	本币应付金额
startDate	int	否	否	起算时点id
needPaymentAck	boolean	否	否	需进度确认
startDateTime	object	否	否	起算日_付款执行计划
fixAccoutDayTwo	int	否	否	固定出账日2
delayDay	int	否	否	起算日延迟日
fixAccoutDayThree	int	否	否	固定出账日3
delayMonth	int	否	否	起算日延迟月
fixAccoutDayFour	int	否	否	固定出账日4
accountDay	int	否	否	账期
fixExpireDayOne	int	否	否	固定到期日1
fixedoaday	int	否	否	固定出账日
accountUnit	string	否	否	账期单位
fixExpireDayTwo	int	否	否	固定到期日2
accountType	string	否	否	账期类型
fixExpireDayThree	int	否	否	固定到期日3
fixAccoutDateTime	object	否	否	出账日
fixExpireDayFour	int	否	否	固定到期日4
fixedexpireday	int	否	否	固定到期日
expiringDateTime	object	否	否	供应链付款计划到期日期
rowno	int	否	否	行号
paidAmount	float	否	否	累计付款核销金额
mainid	int	否	否	采购订单主表
totalApplyPaymentAmount	float	否	否	累计付款申请金额
isAdvancePay	boolean	否	否	预付款
totalPayAmount	float	否	否	累计付款金额
fixAccoutDayOne	int	否	否	固定出账日1
id	int	否	否	ID
pubts	object	否	否	时间戳3
settlemethod	int	否	否	结算方式id
prePayType	int	否	否	预付折算方式
isRetentionMoney	boolean	否	否	是否质保金
ytenant	string	否	否	租户id
logistics	int	否	否	物流信息
headParallel	object	否	否	采购订单主表平行表
approvalStatus	string	否	否	审批状态
businessType	string	否	否	业务类型
busitype	string	否	否	业务流
buyConfirmDate	date
格式:-	否	否	买方确认日期
buyConfirmIdea	string	否	否	买方确认意见
buyConfirmPersonId	string	否	否	买方确认人
buyConfirmPhone	string	否	否	买方确认电话
buyConfirmTime	object	否	否	买方确认时间
buyerTel	string	否	否	采购员联系电话
buyofferBillcode	string	否	否	询价单号
buyofferId	int	否	否	询价单id
buyofferSubject	string	否	否	询价单名称
cancelDate	date
格式:-	否	否	作废日期
cancelIdea	string	否	否	作废理由
cancelPersonId	string	否	否	作废人
cancelTime	object	否	否	作废时间
confirmPersonName	string	否	否	确认人姓名
id	string	否	否	采购订单主表id
industryTag	string	否	否	行业标签
invalidateMemo	string	否	否	作废备注
isConPrice	boolean	否	否	是否允许确认单价
isConQuantity	boolean	否	否	是否允许确认数量
isMaterialClass	boolean	否	否	是否物料分类合同
orderCollaborationStatus	string	否	否	订单协同状态
orderSource	string	否	否	订单来源
orderStatusPre	string	否	否	状态回退
orderSubject	string	否	否	订单标题
priceType	int	否	否	价格类型
pricedecisionId	int	否	否	定标单id
pubDate	date
格式:-	否	否	发布日期
pubTime	object	否	否	发布时间
purContentId	int	否	否	采购内容id
purContentName	string	否	否	采购内容名称
purContentType	string	否	否	采购内容类型
purContentTypeId	int	否	否	采购内容类型id
receivingRemark	string	否	否	VMI
refReaStatus	string	否	否	拒绝理由状态枚举
replaceConfirmDate	date
格式:-	否	否	代确认日期
replaceConfirmPersonId	string	否	否	代确认人
replaceConfirmPersonName	string	否	否	代确认人姓名
replaceConfirmTime	object	否	否	代确认时间
sellerMemberId	string	否	否	卖家ID
sendErpMsg	boolean	否	否	发送到ERP成功失败标记
sendNcStatusTag	int	否	否	云采订单发送NC订单状态
sourcingProject	string	否	否	寻源项目
supOperationContent	string	否	否	操作内容
supOperationDate	object	否	否	操作时间
supResponseTime	object	否	否	供应商响应时间
supplierOperator	string	否	否	供应商操作人ID
supplierOperatorName	string	否	否	供应商操作人姓名
totalMoney	float	否	否	含税总金额
transportType	string	否	否	运输方式
urgency	string	否	否	紧急程度
vendorConfirmDate	date
格式:-	否	否	确认日期
vendorConfirmPersonId	string	否	否	确认人
vendorConfirmTime	object	否	否	确认时间
vendorRefuseReason	string	否	否	供应商拒绝变更理由
vendorTenant	int	否	否	供应商关联租户id
erpOrderId	string	否	否	ERP订单主键
erpOrderNo	string	否	否	ERP订单号
isERPApproval	boolean	否	否	是否在ERP审批
orderFlow	string	否	否	订单流程
bustype_code	string	否	否	交易类型编码
headFreeItem	object	否	否	采购订单主表自由自定义项
define1	string	否	否	自定义项1
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
define2	string	否	否	自定义项2
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
define3	string	否	否	自定义项3
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
define4	string	否	否	自定义项4
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
define5	string	否	否	自定义项5
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
define6	string	否	否	自定义项6
define60	string	否	否	自定义项60
define7	string	否	否	自定义项7
define8	string	否	否	自定义项8
define9	string	否	否	自定义项9
id	int	否	否	采购订单主表id
settlemethod_code	string	否	否	结算方式编码
paymentagrement	int	否	否	付款协议档案
contactAddressID	int	否	否	供方地址ID
isFeedback	boolean	否	否	是否已下推反馈单
submitTime	object	否	否	提交时间
submitter	string	否	否	提交人
withdrawTime	object	否	否	撤回提交时间
withdrawpp	string	否	否	撤回提交的人
paymentExeDetail	object	是	否	付款执行明细
firstsourceautoid	int	否	否	源头单据子表id
paidNatMoney	float	否	否	本币冲销金额
paySum	float	否	否	付款总金额
productAuth	int	否	否	物料权限
totalPayAmount	float	否	否	累计付款金额
writeBackNatSum	float	否	否	本币回写金额
rowno	int	否	否	行号
mainid	int	否	否	采购订单主表
id	int	否	否	ID
pubts	object	否	否	时间戳4
number	int	否	否	期号_执行明细
vouchtype	string	否	否	单据类型
vouchid	int	否	否	单据主表id
vouchsubid	int	否	否	单据子表id
vouchcode	string	否	否	单据编号
period	string	否	否	阶段_执行明细
payRatio	float	否	否	付款比例
product	int	否	否	物料id
productsku	int	否	否	物料SKU2
inInvoiceOrg	string	否	否	收票组织id
payMoney	float	否	否	应付金额
payNatMoney	float	否	否	本币应付金额
paidMoney	float	否	否	冲销金额
writeBackSum	float	否	否	回写金额
copyStartBaseDate	object	否	否	起算日1
startDateTime	date
格式:-	否	否	起算日_付款执行明细
expiringDateTime	date
格式:-	否	否	付款执行明细到期日期
isRetentionMoney	boolean	否	否	是否质保金
isAdvancePay	boolean	否	否	是否预付
payNatSum	float	否	否	本币付款总金额
prePayType	int	否	否	预付折算方式
fixAccoutDateTime	date
格式:-	否	否	出账日
fixedexpireday	int	否	否	固定到期日
fixedoaday	int	否	否	固定出账日
productn	int	否	否	物料
productskun	int	否	否	物料SKU3
settlemethod	int	否	否	结算方式id
tenant	int	否	否	租户
expireDate	date
格式:-	否	否	付款执行明细到期日
startBaseDate	date
格式:-	否	否	起算日期_付款执行明细
startBase	string	否	否	阶段
iorder	int	否	否	期号
schedulesid	int	否	否	付款计划id
totalApplyPaymentAmount	float	否	否	累计付款申请金额
confirmQty	float	否	否	确认数量
oriUnitPrice	float	否	否	无税单价payment
oriTaxUnitPrice	float	否	否	含税单价2
firstsourceautono	float	否	否	订单行号
totalInvoiceQty	float	否	否	累计开票数量
totalInvoiceMoney	float	否	否	累计开票含税金额
srcBillRsowNO	float	否	否	来源单据行号
confirmPayableNatSum	float	否	否	本币完成金额
confirmPayableOriSum	float	否	否	完成金额
deductionMoney	float	否	否	扣款金额
deductionNatMoney	float	否	否	本币扣款金额
totalInvoiceNoTaxMoney	float	否	否	累计开票无税金额
vouchsunid	int	否	否	单据孙表id
ytenant	string	否	否	租户id
headItem	int	否	否	采购订单主表自定义项

## 3. 请求示例

Url: /yonbip/cpu/connectorOrders?access_token=访问令牌
Header: 
	purchaseOrg : ""
	bustypeCode : ""
	retailAgentName : ""
Body: [{
	"modifyReason": "",
	"operator": "",
	"custom": 0,
	"bustype": "",
	"generalPurchaseOrderType": "",
	"org": "",
	"vendor": 0,
	"retailAgentName": "",
	"vendorAuth": 0,
	"contact": "",
	"vendorcontact": 0,
	"expectDate": "2026-06-07 13:07:04",
	"moneysum": 0,
	"totalQuantity": 0,
	"approvenum": 0,
	"storagenum": 0,
	"closenum": 0,
	"bizstatus": "",
	"inInvoiceOrg": "",
	"contactTel": "",
	"department": "",
	"invoiceVendor": 0,
	"taxRate": 0,
	"taxitems": "",
	"otherOrderCode": "",
	"totalPayMoney": 0,
	"totalPayNATMoney": 0,
	"srcBill": 0,
	"srcBillNO": "",
	"source": "",
	"allTotalArrivedTaxMoney": 0,
	"allTotalInTaxMoney": 0,
	"allTotalInvoiceMoney": 0,
	"modifyStatus": "",
	"isMaxLimitPrice": true,
	"exchRateType": "",
	"lockerId": "",
	"store": 0,
	"sourceTenant": 0,
	"outSourceOrg": "",
	"socialStatus": "",
	"directShipment": "",
	"bEffectStock": true,
	"lowCodeFlowId": "",
	"isContract": true,
	"isAllowAdjustPrice": "",
	"settlemethod": 0,
	"isVMI": true,
	"paymentIsContract": "",
	"contactAddress": "",
	"despatchMode": 0,
	"receAreaId": 0,
	"isDespatch": true,
	"exchRateDate": "2026-06-07 13:07:04",
	"phasedInvoice": true,
	"delivery_method": 0,
	"expenseOriSum": 0,
	"expiredayConfirmType": 0,
	"oadayConfirmType": 0,
	"sendERPStatus": 0,
	"sendFailCause": "",
	"dealPersonId": "",
	"dealTime": {},
	"dealDate": "2026-06-07 13:07:04",
	"dealPhone": "",
	"closer": "",
	"closerId": 0,
	"closeTime": {},
	"closeDate": "2026-06-07 13:07:04",
	"printCount": 0,
	"isWfControlled": true,
	"verifystate": 0,
	"returncount": 0,
	"natCurrency": "",
	"currency": "",
	"exchRate": 0,
	"locker": "",
	"lockTime": {},
	"lockDate": "2026-06-07 13:07:04",
	"accountDate": "2026-06-07 13:07:04",
	"payAgreement": 0,
	"maturityDate": "2026-06-07 13:07:04",
	"accountDays": 0,
	"oriSum": 0,
	"oriTax": 0,
	"oriUnitPrice": 0,
	"oriTaxUnitPrice": 0,
	"oriMoney": 0,
	"natSum": 0,
	"natTax": 0,
	"natTaxUnitPrice": 0,
	"natMoney": 0,
	"natUnitPrice": 0,
	"wbTime": "",
	"bizFlow": "",
	"isFlowCoreBill": true,
	"barCode": "",
	"inventoryowner": 0,
	"memo": "",
	"auditor": "",
	"auditorId": 0,
	"auditTime": {},
	"auditDate": "",
	"vouchdate": "",
	"tplid": 0,
	"status": "",
	"irespstatus": "",
	"resubmitCheckKey": "",
	"code": "",
	"createTime": {},
	"createDate": "",
	"modifyTime": {},
	"modifyDate": "2026-06-07 13:07:04",
	"creator": "",
	"modifier": "",
	"creatorId": 0,
	"modifierId": 0,
	"tenant": 0,
	"id": 0,
	"pubts": {},
	"purchaseOrders": [
		{
			"mainid": 0,
			"unit": 0,
			"approveqty": 0,
			"storageqty": 0,
			"closeqty": 0,
			"inOrg": "",
			"demandOrg": "",
			"inInvoiceOrg": "",
			"project": "",
			"projectCode": "",
			"warehouse": 0,
			"store": 0,
			"isGiftProduct": true,
			"supplyItemCode": "",
			"supplyItemName": "",
			"supplyProductModel": "",
			"recieveDate": "",
			"priceUOM": 0,
			"purUOM": 0,
			"discountTaxType": "",
			"priceHaveTax": true,
			"maxInPrice": 0,
			"totalRecieveQty": 0,
			"totalInQty": 0,
			"totalInvoiceQty": 0,
			"totalInvoiceMoney": 0,
			"totalPayQty": 0,
			"totalPayNATMoney": 0,
			"prePayMoney": 0,
			"verifiedPrePayMoney": 0,
			"totalRejectQty": 0,
			"totalRejectSubqty": 0,
			"totalArrivedTaxMoney": 0,
			"totalArrivedNatTaxMoney": 0,
			"totalInTaxMoney": 0,
			"totalInNatTaxMoney": 0,
			"totalInvoiceNatTaxMoney": 0,
			"totalPayOriMoney": 0,
			"otherOrderRowNO": 0,
			"outSrcBillRowNO": 0,
			"outSrcBillRowId": 0,
			"outSrcBillNO": "",
			"outSrcBillId": 0,
			"outSource": "",
			"trackingNO": "",
			"totalRecieveSubqty": 0,
			"totalInSubqty": 0,
			"totalReturnInQty": 0,
			"totalReturnInSubQty": 0,
			"totalSaleQty": 0,
			"agentId": 0,
			"receiver": "",
			"receiveTelePhone": "",
			"receiveAddress": "",
			"totalSendQty": 0,
			"totalPurchaseSendQty": 0,
			"totalPayAmount": 0,
			"totalSaleOrderQty": 0,
			"rejectReplenishQty": 0,
			"taxitems": "",
			"productDesc": "",
			"proDescFlag": "",
			"sourceProDescFlag": "",
			"totalAcceptQty": 0,
			"totalAcceptSubqty": 0,
			"warehousingClose": true,
			"ticketCollectionClose": true,
			"paymentClose": true,
			"arrivalClose": true,
			"srcApplyOrderId": "",
			"srcApplyOrderAotoId": "",
			"srcReqId": 0,
			"unDeductTaxRate": 0,
			"unDeductTax": 0,
			"materialClassId": 0,
			"isDoLogistics": 0,
			"isLogisticsRelated": true,
			"weighFinish": true,
			"totalPayApplyAmount": 0,
			"plannedTotalRecPurQty": 0,
			"plannedTotalRecUnitQty": 0,
			"memo": "",
			"isArrivalplan": true,
			"amountPayable": 0,
			"product": 0,
			"productsku": 0,
			"productAuth": 0,
			"oriUnitPriceOriginal": 0,
			"oriTaxUnitPriceOriginal": 0,
			"discountRate": 0,
			"totalInReceivedQty": 0,
			"totalInReceivedSubqty": 0,
			"suite_amount": 0,
			"suiteSon_amount": 0,
			"suiteId": 0,
			"suiteSon_priceWeight": 0,
			"suiteGroup": "",
			"minOrderQty": 0,
			"orderDoubleQty": 0,
			"totalReturnAndReturnInQty": 0,
			"totalReturnAndReturnInSubQty": 0,
			"totalReturnQty": 0,
			"totalReturnSubQty": 0,
			"totalInvoiceNoTaxMoney": 0,
			"totalInNoTaxMoney": 0,
			"priceSource": "",
			"priceMark": 0,
			"logisticsOrgId": "",
			"loadModeId": 0,
			"recePointId": 0,
			"endAreaId": 0,
			"planTransRouteId": 0,
			"distributionSide": "",
			"expenseItemId": 0,
			"qualityPriceScheme": 0,
			"isRowExpenses": true,
			"contractBatchNumber": "",
			"deliveryBatchNumber": "",
			"more_or_less": 0,
			"free1": "",
			"free2": "",
			"free3": "",
			"free4": "",
			"free5": "",
			"free6": "",
			"free7": "",
			"free8": "",
			"free9": "",
			"free10": "",
			"qty": 0,
			"subQty": 0,
			"invExchRate": 0,
			"taxRate": 0,
			"oriSum": 0,
			"oriTax": 0,
			"oriUnitPrice": 0,
			"oriTaxUnitPrice": 0,
			"oriMoney": 0,
			"natSum": 0,
			"natTax": 0,
			"natTaxUnitPrice": 0,
			"natMoney": 0,
			"natUnitPrice": 0,
			"maxLimitPrice": 0,
			"materialId": 0,
			"sourceid": 0,
			"sourceautoid": 0,
			"source": "",
			"upcode": "",
			"makeRuleCode": "",
			"sourceMainPubts": {},
			"groupTaskKey": "",
			"priceQty": 0,
			"invPriceExchRate": 0,
			"linecloser": "",
			"linecloseTime": {},
			"unitExchangeType": 0,
			"unitExchangeTypePrice": 0,
			"firstsourceid": 0,
			"firstsourceautoid": 0,
			"firstsource": "",
			"firstupcode": "",
			"reserveid": 0,
			"lineno": 0,
			"upLineno": 0,
			"sourceUpLineno": 0,
			"ytenant": "",
			"costCenter": 0,
			"providerProfitCenter": "",
			"consumerProfitCenter": "",
			"stockSensClue": "",
			"batchno": "",
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
			"producedate": "2026-06-07 13:07:04",
			"invaliddate": "2026-06-07 13:07:04",
			"goodsposition": 0,
			"rowno": 0,
			"id": 0,
			"pubts": {},
			"bodyItem": {},
			"bodyParallel": {
				"signatory": "",
				"outForeignBusinessmen": "",
				"hasForeignInvestors": true,
				"yuncaiOrderId": "",
				"yuncaiOrderBId": "",
				"erpApplyOrderId": "",
				"erpApplyOrderRowId": "",
				"erpContractId": "",
				"erpContractRowId": "",
				"erpOrderBodyId": "",
				"erpOrderBodyRowNo": 0,
				"actualMoney": 0,
				"arrivedateSupconfirm": {},
				"benchmarkType": "",
				"brandId": 0,
				"brandName": "",
				"busSupabilityId": 0,
				"buyofferDetailId": 0,
				"buyofferId": 0,
				"closeOrderReason": "",
				"conPrice": 0,
				"conQuantity": 0,
				"conTaxPrice": 0,
				"confirmBrandId": 0,
				"confirmBrandName": "",
				"contractBillno": "",
				"contractDetailId": 0,
				"contractId": 0,
				"contractName": "",
				"contractRowNum": 0,
				"ctMaQuantity": 0,
				"ctMaTaxprice": 0,
				"demandBrandId": 0,
				"diffReceivedNum": 0,
				"diffStorageNum": 0,
				"erpCode": "",
				"erpRegCertNo": "",
				"floatMoney": 0,
				"floatProp": "",
				"id": 0,
				"isMaterialClass": true,
				"manufacturer": "",
				"outOtherOrderRowNO": 0,
				"outSourceBillId": 0,
				"outSourceBillNO": "",
				"outSourceBillRowId": 0,
				"outSourceBillRowNO": 0,
				"outSourceType": "",
				"pricedecisionDetailId": 0,
				"pricedecisionId": 0,
				"pritemId": 0,
				"quotaofferdetailid": 0,
				"quotaofferid": 0,
				"refArea": "",
				"refReaStatus": "",
				"reqDate": {},
				"reqDept": "",
				"reqPsn": "",
				"requireBrandCode": "",
				"requireBrandErpId": "",
				"rowConMessage": "",
				"rowRefReaStatus": "",
				"rowRefuseReason": "",
				"settlementType": "",
				"signNum": 0,
				"totalPrice": 0,
				"transparentPurchaseNo": ""
			},
			"bodyFreeItem": {
				"define1": "",
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
				"define2": "",
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
				"define3": "",
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
				"define4": "",
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
				"define5": "",
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
				"define6": "",
				"define60": "",
				"define7": "",
				"define8": "",
				"define9": "",
				"id": 0
			},
			"arrivalPlans": [
				0
			],
			"paymentProgressACKs": 0,
			"startDate_code": "",
			"settlemethod_code": "",
			"productn": 0,
			"productskun": 0,
			"isLineFeedback": true,
			"coreOrderId": 0,
			"coreOrderlineId": 0,
			"coreOrderCode": "",
			"coreOrderRowNO": 0,
			"expenseNatSum": 0,
			"expenseNatMoney": 0,
			"expenseOriSum": 0,
			"expenseOriMoney": 0,
			"hasPaymentSchedules": true,
			"material": 0,
			"priceEquation": 0,
			"priceEquationFormula": "",
			"inStoreLessLimit": 0,
			"rejectReplenishSubQty": 0
		}
	],
	"paymentSchedules": [
		{
			"payNatSum": 0,
			"number": 0,
			"name": "",
			"payRatio": 0,
			"amount": 0,
			"payNatMoney": 0,
			"startDate": 0,
			"needPaymentAck": true,
			"startDateTime": {},
			"fixAccoutDayTwo": 0,
			"delayDay": 0,
			"fixAccoutDayThree": 0,
			"delayMonth": 0,
			"fixAccoutDayFour": 0,
			"accountDay": 0,
			"fixExpireDayOne": 0,
			"fixedoaday": 0,
			"accountUnit": "",
			"fixExpireDayTwo": 0,
			"accountType": "",
			"fixExpireDayThree": 0,
			"fixAccoutDateTime": {},
			"fixExpireDayFour": 0,
			"fixedexpireday": 0,
			"expiringDateTime": {},
			"rowno": 0,
			"paidAmount": 0,
			"mainid": 0,
			"totalApplyPaymentAmount": 0,
			"isAdvancePay": true,
			"totalPayAmount": 0,
			"fixAccoutDayOne": 0,
			"id": 0,
			"pubts": {},
			"settlemethod": 0,
			"prePayType": 0,
			"isRetentionMoney": true,
			"ytenant": ""
		}
	],
	"logistics": 0,
	"headParallel": {
		"approvalStatus": "",
		"businessType": "",
		"busitype": "",
		"buyConfirmDate": "2026-06-07 13:07:04",
		"buyConfirmIdea": "",
		"buyConfirmPersonId": "",
		"buyConfirmPhone": "",
		"buyConfirmTime": {},
		"buyerTel": "",
		"buyofferBillcode": "",
		"buyofferId": 0,
		"buyofferSubject": "",
		"cancelDate": "2026-06-07 13:07:04",
		"cancelIdea": "",
		"cancelPersonId": "",
		"cancelTime": {},
		"confirmPersonName": "",
		"id": "",
		"industryTag": "",
		"invalidateMemo": "",
		"isConPrice": true,
		"isConQuantity": true,
		"isMaterialClass": true,
		"orderCollaborationStatus": "",
		"orderSource": "",
		"orderStatusPre": "",
		"orderSubject": "",
		"priceType": 0,
		"pricedecisionId": 0,
		"pubDate": "2026-06-07 13:07:04",
		"pubPersonId": "",
		"pubTime": {},
		"purContentId": 0,
		"purContentName": "",
		"purContentType": "",
		"purContentTypeId": 0,
		"receivingRemark": "",
		"refReaStatus": "",
		"replaceConfirmDate": "2026-06-07 13:07:04",
		"replaceConfirmPersonId": "",
		"replaceConfirmPersonName": "",
		"replaceConfirmTime": {},
		"sellerMemberId": "",
		"sendErpMsg": true,
		"sendNcStatusTag": 0,
		"sourcingProject": "",
		"supOperationContent": "",
		"supOperationDate": {},
		"supResponseTime": {},
		"supplierOperator": "",
		"supplierOperatorName": "",
		"totalMoney": 0,
		"transportType": "",
		"urgency": "",
		"vendorConfirmDate": "2026-06-07 13:07:04",
		"vendorConfirmPersonId": "",
		"vendorConfirmTime": {},
		"vendorRefuseReason": "",
		"vendorTenant": 0,
		"erpOrderId": "",
		"erpOrderNo": "",
		"isERPApproval": true,
		"orderFlow": ""
	},
	"bustype_code": "",
	"headFreeItem": {
		"define1": "",
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
		"define2": "",
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
		"define3": "",
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
		"define4": "",
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
		"define5": "",
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
		"define6": "",
		"define60": "",
		"define7": "",
		"define8": "",
		"define9": "",
		"id": 0
	},
	"settlemethod_code": "",
	"paymentagrement": 0,
	"contactAddressID": 0,
	"isFeedback": true,
	"submitTime": {},
	"submitter": "",
	"withdrawTime": {},
	"withdrawpp": "",
	"paymentExeDetail": [
		{
			"firstsourceautoid": 0,
			"paidNatMoney": 0,
			"paySum": 0,
			"productAuth": 0,
			"totalPayAmount": 0,
			"writeBackNatSum": 0,
			"rowno": 0,
			"mainid": 0,
			"id": 0,
			"pubts": {},
			"number": 0,
			"vouchtype": "",
			"vouchid": 0,
			"vouchsubid": 0,
			"vouchcode": "",
			"period": "",
			"payRatio": 0,
			"product": 0,
			"productsku": 0,
			"inInvoiceOrg": "",
			"payMoney": 0,
			"payNatMoney": 0,
			"paidMoney": 0,
			"writeBackSum": 0,
			"copyStartBaseDate": {},
			"startDateTime": "2026-06-07 13:07:04",
			"expiringDateTime": "2026-06-07 13:07:04",
			"isRetentionMoney": true,
			"isAdvancePay": true,
			"payNatSum": 0,
			"prePayType": 0,
			"fixAccoutDateTime": "2026-06-07 13:07:04",
			"fixedexpireday": 0,
			"fixedoaday": 0,
			"productn": 0,
			"productskun": 0,
			"settlemethod": 0,
			"tenant": 0,
			"expireDate": "2026-06-07 13:07:04",
			"startBaseDate": "2026-06-07 13:07:04",
			"startBase": "",
			"iorder": 0,
			"schedulesid": 0,
			"totalApplyPaymentAmount": 0,
			"confirmQty": 0,
			"oriUnitPrice": 0,
			"oriTaxUnitPrice": 0,
			"firstsourceautono": 0,
			"totalInvoiceQty": 0,
			"totalInvoiceMoney": 0,
			"srcBillRsowNO": 0,
			"confirmPayableNatSum": 0,
			"confirmPayableOriSum": 0,
			"deductionMoney": 0,
			"deductionNatMoney": 0,
			"totalInvoiceNoTaxMoney": 0,
			"vouchsunid": 0,
			"ytenant": ""
		}
	],
	"headItem": 0
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

