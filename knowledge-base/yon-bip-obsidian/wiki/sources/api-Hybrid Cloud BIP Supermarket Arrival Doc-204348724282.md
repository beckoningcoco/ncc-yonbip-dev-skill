---
title: "混合云BIP超市到货单同步生成ERP到货单"
apiId: "2043487242829692929"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 混合云BIP超市到货单同步生成ERP到货单

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/connectorMallArriveOrder
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
assign_purorg_id	string	header	是	采购组织
Body参数
名称	类型	数组	必填	描述
purEnterpriseName	string	否	否	采购商名称
status	string	否	否	到货单状态
outerOrderId	string	否	否	对应发货单outerOrderId
purUserId	number
小数位数:0,最大长度:0	否	否	采购员用户id
purUserErpCode	string	否	否	采购员用户erpcode -- 不存储,用于推送
receiveOrgName	string	否	否	收货组织名称
taxPrice	number
小数位数:4,最大长度:0	否	否	含税单价
define29	string	否	否	自定义29
define43	string	否	否	自定义43
define50	string	否	否	自定义50
arriveDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	到货日期
linkpsn	string	否	否	发货单联系人
logisticalCompCode	string	否	否	物流公司代码
details	object	是	否	到货单详情
materialModel	string	否	否	物料型号
skuValue	string	否	否	商品sku详细属性
priceSignNum	number
小数位数:4,最大长度:0	否	否	签收价格
define10	string	否	否	自定义10
define11	string	否	否	自定义11
define56	string	否	否	自定义56
erpPuOrderId	string	否	否	采购单id
receiveAddr	string	否	否	收货地址
lineNum	number
小数位数:-,最大长度:0	否	否	行号
reqContactId	number
小数位数:0,最大长度:0	否	否	需求单的需求人Id
projectName	string	否	否	项目名称
contractRownum	number
小数位数:0,最大长度:0	否	否	明细行号
define5	string	否	否	自定义5
define17	string	否	否	自定义17
define19	string	否	否	自定义19
define40	string	否	否	自定义40
materialCode	string	否	否	平台物料编码
erpPuOrderCode	string	否	否	采购单编码
planArriveDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	到货日期
purchaseInwhNum	number
小数位数:4,最大长度:0	否	否	purchaseInwhNum
recvstoorgName	string	否	否	收货库存组织
recAddress	string	否	否	收货地址
currInwhFlag	boolean	否	否	标识
reqPudepDocId	number
小数位数:0,最大长度:0	否	否	请购部门Id
isBatchMng	number
小数位数:-,最大长度:0	否	否	批次管理
define6	string	否	否	自定义6
define18	string	否	否	自定义18
define53	string	否	否	自定义53
define60	string	否	否	自定义60
price	number
小数位数:4,最大长度:0	否	否	计价无税单价
unit	string	否	否	计价单位名称
priceInwhNum	number
小数位数:4,最大长度:0	否	否	入库价格数量
receiveMemo	string	否	否	表体签收备注
purchaseName	string	否	否	采购员姓名
arriveOrderCode	string	否	否	到货单号
purchaseUnitCode	string	否	否	采购计量单位编码
accomplishedMainNum	number
小数位数:4,最大长度:0	否	否	已执行主单位数量
delplanNo	string	否	否	交货计划单号
define16	string	否	否	自定义16
define36	string	否	否	自定义36
pritemId	number
小数位数:0,最大长度:0	否	否	需求单id
outerId	string	否	否	对应发货单outerId
lastReplenishDiffNum	number
小数位数:4,最大长度:0	否	否	需补货数量的差量
diffReceivedNum	number
小数位数:4,最大长度:0	否	否	收货差异数量
recvstoorgId	string	否	否	收货库存组织
confirmBrand	string	否	否	供应品牌
deliveryOrderDetailId	number
小数位数:0,最大长度:0	否	否	发货单明细主键
deliveryBrand	string	否	否	发货品牌
orderDetailId	number
小数位数:0,最大长度:0	否	否	订单详情id
batchNo	string	否	否	生产批号
bmemo	string	否	否	bmemo
priceShow	string	否	否	priceShow
skuId	number
小数位数:0,最大长度:0	否	否	skuid
taxRate	number
小数位数:4,最大长度:0	否	否	税率
inwhNum	number
小数位数:4,最大长度:0	否	否	入库数量
purchaseUnitId	string	否	否	采购计量单位id
currInwhNum	number
小数位数:4,最大长度:0	否	否	currInwhNum
define1	string	否	否	自定义1
lastSignDiffNum	number
小数位数:4,最大长度:0	否	否	上次数量差异
define2	string	否	否	自定义2
diffPriceReceivedNum	number
小数位数:4,最大长度:0	否	否	diffPriceReceivedNum
define34	string	否	否	自定义34
replenishNum	number
小数位数:4,最大长度:0	否	否	拒收需补货数量
erpRegQualificationCode	string	否	否	ERP注册证号
mainMetrologyName	string	否	否	主单位名称
define41	string	否	否	自定义41
define54	string	否	否	自定义54
define58	string	否	否	自定义58
totalarrivenum	number
小数位数:4,最大长度:0	否	否	累计计价到货数量
saleOrderId	number
小数位数:0,最大长度:0	否	否	云采销售订单id
saleOrderDetailId	number
小数位数:0,最大长度:0	否	否	云采销售订单明细id
lastDiffReceiveDiffNum	number
小数位数:4,最大长度:0	否	否	实收差异数量的差量
diffPriceStorageNum	number
小数位数:4,最大长度:0	否	否	diffPriceStorageNum
reqOrgName	string	否	否	需求组织
reqPuorgDocName	string	否	否	请购组织名称
isSerialnoMng	number
小数位数:-,最大长度:0	否	否	序列号管理
invoiceNo	string	否	否	发票号
contractBillno	string	否	否	合同账单行号
define8	string	否	否	自定义8
define23	string	否	否	自定义23
define29	string	否	否	自定义29
define42	string	否	否	自定义42
define51	string	否	否	自定义51
define59	string	否	否	自定义59
orderId	number
小数位数:0,最大长度:0	否	否	云采采购订单id
status	string	否	否	页面状态
diffStorageNum	number
小数位数:4,最大长度:0	否	否	入库差异数量
purchaseId	number
小数位数:0,最大长度:0	否	否	采购员id
isPeriodMng	number
小数位数:-,最大长度:0	否	否	保质期管理
define3	string	否	否	自定义3
define7	string	否	否	自定义7
define24	string	否	否	自定义24
define32	string	否	否	自定义32
define33	string	否	否	自定义33
define37	string	否	否	自定义37
define46	string	否	否	自定义46
define48	string	否	否	自定义48
id	number
小数位数:0,最大长度:0	否	否	主键id
signNum	number
小数位数:4,最大长度:0	否	否	实收数量
erpArriveId	string	否	否	ERP到货单Id
recvstor	string	否	否	收货仓库名称
taxPriceShow	string	否	否	taxPriceShow
arrivalBatchNo	string	否	否	到货批号
delplanDetailId	number
小数位数:0,最大长度:0	否	否	交货计划单表体主键
define14	string	否	否	自定义14
define50	string	否	否	自定义50
reqDeptName	string	否	否	需求部门
reqContact	string	否	否	需求单的需求人名称
expirationDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	失效日期
rejectedInvoiceQuantity	number
小数位数:4,最大长度:0	否	否	已退票数量
purchaseNum	number
小数位数:4,最大长度:0	否	否	采购数量
purchaseExchRate	number
小数位数:4,最大长度:0	否	否	采购换算率
unitid	string	否	否	计价单位id
define15	string	否	否	自定义15
taxPrice	number
小数位数:4,最大长度:0	否	否	taxPrice
purnum	number
小数位数:4,最大长度:0	否	否	采购需求总数量
define25	string	否	否	自定义25
define39	string	否	否	自定义39
productId	number
小数位数:0,最大长度:0	否	否	商品（SKU）id
productSubject	string	否	否	商品描述
productImgUrl	string	否	否	展示商品的图片URL
define43	string	否	否	自定义43
define55	string	否	否	自定义55
erpMaterialId	string	否	否	ERP物料主键
purchaseIdForNcc	string	否	否	采购员有互通id（用户）
orderCode	string	否	否	云采采购订单单据号
skuCode	string	否	否	商品sku详细编码
receiveMan	string	否	否	收货人
reqDeptId	number
小数位数:0,最大长度:0	否	否	需求部门ID
isBarcodeMng	number
小数位数:-,最大长度:0	否	否	条码管理
erpMaterialManufacturer	string	否	否	ERP物料生产厂家
mainNum	number
小数位数:4,最大长度:0	否	否	主单位数量
priceExchRate	number
小数位数:4,最大长度:0	否	否	计价换算率
orderQuantity	number
小数位数:4,最大长度:0	否	否	订单数量
define35	string	否	否	自定义35
define44	string	否	否	自定义44
define47	string	否	否	自定义47
define52	string	否	否	自定义52
num	number
小数位数:4,最大长度:0	否	否	到货计价数量
materialId	number
小数位数:0,最大长度:0	否	否	平台物料id
outerOrderId	string	否	否	对应发货单outerOrderId
erpPuOrderBodyId	string	否	否	采购单主体id
erpArriveDetailId	string	否	否	ERP到货单子表Id
reqPudepDocName	string	否	否	请购部门名称
productionDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	生产日期
reqReturnQuantity	number
小数位数:4,最大长度:0	否	否	请求退货数量
detailAccountStatus	string	否	否	表体对账状态
mainMetrologyId	string	否	否	主单位id
mainMetrologyCode	string	否	否	主单位code
define22	string	否	否	自定义22
define31	string	否	否	自定义31
arriveOrderId	number
小数位数:0,最大长度:0	否	否	到货单id
saleOrderCode	string	否	否	云采销售订单单据号
lastDiffStorageDiffNum	number
小数位数:4,最大长度:0	否	否	入库差异的差量
contactWay	string	否	否	联系方式
blargess	boolean	否	否	是否赠品
reqPuorgDocId	number
小数位数:0,最大长度:0	否	否	请购组织Id
checkStatusBefore	string	否	否	修改前的状态
packingSpec	string	否	否	包装规格
accomplishedPurchaseNum	number
小数位数:4,最大长度:0	否	否	已执行采购单位数量
unitCode	string	否	否	计价单位code
projectCode	string	否	否	项目code
contractMaterialId	number
小数位数:0,最大长度:0	否	否	明细id
define9	string	否	否	自定义9
define20	string	否	否	自定义20
define38	string	否	否	自定义38
materialName	string	否	否	平台物料名称
purchaseSignNum	number
小数位数:4,最大长度:0	否	否	purchaseSignNum
erpArriveCode	string	否	否	ERP到货单code
invoiceQuantity	number
小数位数:4,最大长度:0	否	否	已开票数量
materialDesc	string	否	否	物料描述
detailAccountStatusName	string	否	否	表体对账状态名称
purchaseUnitName	string	否	否	采购计量单位名称
define4	string	否	否	自定义4
define12	string	否	否	自定义12
define45	string	否	否	自定义45
storageId	string	否	否	仓库id
materialBrand	string	否	否	物料品牌
diffPurchaseReceivedNum	number
小数位数:4,最大长度:0	否	否	diffPurchaseReceivedNum
diffPurchaseStorageNum	number
小数位数:4,最大长度:0	否	否	diffPurchaseStorageNum
consignee_info	string	否	否	收货人信息
serialNo	string	否	否	序列号
returnQuantity	number
小数位数:4,最大长度:0	否	否	已退货数量
isVerifyCert	number
小数位数:-,最大长度:0	否	否	验证注册证
projectId	number
小数位数:0,最大长度:0	否	否	项目id
contractId	number
小数位数:0,最大长度:0	否	否	合同id
define13	string	否	否	自定义13
define27	string	否	否	自定义27
materialSpec	string	否	否	物料规格
outerDetailId	string	否	否	对应发货单outerDetailId
planArriveDateString	string	否	否	到货日期字符串格式
orderCodeLineNum	string	否	否	采购订单
deliveryBarcode	string	否	否	配送条码
isVerifyAuthorization	number
小数位数:-,最大长度:0	否	否	验证授权书
delplanId	number
小数位数:0,最大长度:0	否	否	交货计划单表头主键
define21	string	否	否	自定义21
define26	string	否	否	自定义26
define28	string	否	否	自定义28
define30	string	否	否	自定义30
define49	string	否	否	自定义49
define57	string	否	否	自定义57
sendErpRsmsg	string	否	否	增加发送ERP信息
signTime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	签收时间
projectDocCode	string	否	否	项目编码
isPushERP	string	否	否	是否自动推送ERP
define37	string	否	否	自定义37
define42	string	否	否	自定义42
define58	string	否	否	自定义58
receiveOrgId	number
小数位数:0,最大长度:0	否	否	收货组织Id
materialName	string	否	否	平台物料名称
isDeliveryProxy	string	否	否	是否代发货
isSupplierRevoke	string	否	否	是否允许供应商取回标记
define2	string	否	否	自定义2
define9	string	否	否	自定义9
define20	string	否	否	自定义20
define27	string	否	否	自定义27
define39	string	否	否	自定义39
define53	string	否	否	自定义53
trainCode	string	否	否	车皮号
orderId	string	否	否	对应发货单orderId（来源采购订单id）
memo	string	否	否	发货备注
deliveryDateString	string	否	否	发货日期字符串类型
supplierid	number
小数位数:0,最大长度:0	否	否	供应商档案Id
supplierCode	string	否	否	供应商编码
detailAccountStatus	string	否	否	表体对账状态
currencyName	string	否	否	币种名称
erpInwhApproveType	string	否	否	erpInwhApproveType
define19	string	否	否	自定义19
define51	string	否	否	自定义51
totalNum	number
小数位数:4,最大长度:0	否	否	总数量
projectDocId	string	否	否	项目id
erpArriveId	string	否	否	ERP到货单Id
receivePersonName	string	否	否	收货人名称
supplierName	string	否	否	供应商档案名称
isDeliveryBrand	string	否	否	是否允许反馈发货品牌
supEnterpriseId	number
小数位数:0,最大长度:0	否	否	供应商租户id（云采）
无税价格	number
小数位数:4,最大长度:0	否	否	price
erpSupplyId	string	否	否	erp供应商id
approver	string	否	否	审批人名字
erpArriveCode	string	否	否	ERP到货单编码
define5	string	否	否	自定义5
receiveAddress	string	否	否	收货地址
define54	string	否	否	自定义54
define11	string	否	否	自定义11
define60	string	否	否	自定义60
define30	string	否	否	自定义30
receivePersonIdForNcc	string	否	否	收货人【传ncc使用】
define32	string	否	否	自定义32
define40	string	否	否	自定义40
define45	string	否	否	自定义45
arriveOrderCode	string	否	否	到货单号
purEnterpriseId	number
小数位数:0,最大长度:0	否	否	采购商租户id
outerId	string	否	否	对应发货单outerId
arriveDesc	string	否	否	到货单内容，不持久化，表体内容拼接，前台显示用
taxAmountShow	string	否	否	含税金额
currencyCode	string	否	否	币种编码
isYcReceive	string	否	否	是否云采签收
isEnableApprove	string	否	否	是否启动审批流
define6	string	否	否	自定义6
define7	string	否	否	自定义7
define10	string	否	否	自定义10
define14	string	否	否	自定义14
define26	string	否	否	自定义26
define33	string	否	否	自定义33
define46	string	否	否	自定义46
orderCode	string	否	否	采购订单单据号
define49	string	否	否	自定义49
accountStatus	string	否	否	对账状态字段
deliveryDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	发货日期【从发货单带到到货单】
projectDocIdStr	string	否	否	项目Id 字符串类型
orderArea	string	否	否	区域
sendErpCode	string	否	否	发送到ERP的成功失败标记字段
define4	string	否	否	自定义4
define15	string	否	否	自定义15
define22	string	否	否	自定义22
define35	string	否	否	自定义35
define55	string	否	否	自定义55
define59	string	否	否	自定义59
purchaseOrgCode	string	否	否	采购组织编码
outerTypeName	string	否	否	对应发货单outerTypeName
invoiceInfo	string	否	否	发票信息
totalarrivenum	number
小数位数:4,最大长度:0	否	否	累计到货数量
supTenantId	string	否	否	供应商TenantId
supEnterpriseName	string	否	否	供应商名称
amount	number
小数位数:4,最大长度:0	否	否	金额
accountStatusName	string	否	否	对账状态名称
purUserName	string	否	否	采购员用户名称
statusName	string	否	否	状态显示
industryTag	number
小数位数:-,最大长度:0	否	否	行业标签
define38	string	否	否	自定义38
saleOrderId	string	否	否	来源-云采销售订单id
saleOrderCode	string	否	否	销售订单单据号
outerTypeId	string	否	否	对应发货单outerTypeId
deliveryOrderId	number
小数位数:0,最大长度:0	否	否	发货单ID
unit	string	否	否	单位
currencyId	string	否	否	币种id
currencySymbol	string	否	否	币种符号
define17	string	否	否	自定义17
define44	string	否	否	自定义44
taxAmount	number
小数位数:4,最大长度:0	否	否	含税金额
logisticalInfo	string	否	否	物流信息
signUser	string	否	否	签收人
businessType	number
小数位数:-,最大长度:0	否	否	业务分类
bodyId	number
小数位数:0,最大长度:0	否	否	表体id
materialCode	string	否	否	平台物料编码
productSubject	string	否	否	商品描述
approverNCCode	string	否	否	审批人NC编码
define3	string	否	否	自定义3
define13	string	否	否	自定义13
define41	string	否	否	自定义41
define48	string	否	否	自定义48
logisticalCode	string	否	否	物流单号
receiveMemo	string	否	否	签收备注
amountShow	string	否	否	金额
signUserId	number
小数位数:0,最大长度:0	否	否	签收用户id
define21	string	否	否	自定义21
define24	string	否	否	自定义24
purchaseOrgId	number
小数位数:0,最大长度:0	否	否	采购组织id
transportCode	string	否	否	车牌号
logisticalStatus	string	否	否	物流状态
projectDocName	string	否	否	项目名称
priceType	string	否	否	价格类型
isDelivered	string	否	否	是否妥投
define1	string	否	否	自定义1
define16	string	否	否	自定义16
define25	string	否	否	自定义25
define28	string	否	否	自定义28
define31	string	否	否	自定义31
define47	string	否	否	自定义47
define56	string	否	否	自定义56
arriveOrderType	string	否	否	到货单类型
deliveryOrderCode	string	否	否	发货单号
purchaseOrgName	string	否	否	采购组织名称
deliverMemo	string	否	否	增加 发货单备注
receivePersonId	number
小数位数:0,最大长度:0	否	否	收货人
checkStatusBefore	string	否	否	表体操作前对账状态
num	number
小数位数:4,最大长度:0	否	否	到货数量
define12	string	否	否	自定义12
define23	string	否	否	自定义23
id	number
小数位数:0,最大长度:0	否	否	到货单id
transportType	string	否	否	运输方式
linktype	string	否	否	发货单联系方式
receivePersonTel	string	否	否	收货人联系电话
supplierShortName	string	否	否	供应商简称
define8	string	否	否	自定义8
define34	string	否	否	自定义34
define36	string	否	否	自定义36
define52	string	否	否	自定义52
define57	string	否	否	自定义57

## 3. 请求示例

Url: /yonbip/cpu/connectorMallArriveOrder?access_token=访问令牌
Header: 
	assign_purorg_id : ""
Body: [{
	"purEnterpriseName": "",
	"status": "",
	"outerOrderId": "",
	"purUserId": 0,
	"purUserErpCode": "",
	"receiveOrgName": "",
	"taxPrice": 0,
	"define29": "",
	"define43": "",
	"define50": "",
	"arriveDate": "2026-06-07 13:06:23",
	"linkpsn": "",
	"logisticalCompCode": "",
	"details": [
		{
			"materialModel": "",
			"skuValue": "",
			"priceSignNum": 0,
			"define10": "",
			"define11": "",
			"define56": "",
			"erpPuOrderId": "",
			"receiveAddr": "",
			"lineNum ": 0,
			"reqContactId": 0,
			"projectName": "",
			"contractRownum": 0,
			"define5": "",
			"define17": "",
			"define19": "",
			"define40": "",
			"materialCode": "",
			"erpPuOrderCode": "",
			"planArriveDate": "2026-06-07 13:06:23",
			"purchaseInwhNum": 0,
			"recvstoorgName": "",
			"recAddress": "",
			"currInwhFlag": true,
			"reqPudepDocId": 0,
			"isBatchMng": 0,
			"define6": "",
			"define18": "",
			"define53": "",
			"define60": "",
			"price": 0,
			"unit": "",
			"priceInwhNum": 0,
			"receiveMemo": "",
			"purchaseName": "",
			"arriveOrderCode": "",
			"purchaseUnitCode": "",
			"accomplishedMainNum": 0,
			"delplanNo": "",
			"define16": "",
			"define36": "",
			"pritemId": 0,
			"outerId": "",
			"lastReplenishDiffNum": 0,
			"diffReceivedNum": 0,
			"recvstoorgId": "",
			"confirmBrand": "",
			"deliveryOrderDetailId": 0,
			"deliveryBrand": "",
			"orderDetailId": 0,
			"batchNo": "",
			"bmemo": "",
			"priceShow": "",
			"skuId": 0,
			"taxRate": 0,
			"inwhNum": 0,
			"purchaseUnitId": "",
			"currInwhNum": 0,
			"define1": "",
			"lastSignDiffNum": 0,
			"define2": "",
			"diffPriceReceivedNum": 0,
			"define34": "",
			"replenishNum": 0,
			"erpRegQualificationCode": "",
			"mainMetrologyName": "",
			"define41": "",
			"define54": "",
			"define58": "",
			"totalarrivenum": 0,
			"saleOrderId": 0,
			"saleOrderDetailId": 0,
			"lastDiffReceiveDiffNum": 0,
			"diffPriceStorageNum": 0,
			"reqOrgName": "",
			"reqPuorgDocName": "",
			"isSerialnoMng": 0,
			"invoiceNo": "",
			"contractBillno": "",
			"define8": "",
			"define23": "",
			"define29": "",
			"define42": "",
			"define51": "",
			"define59": "",
			"orderId": 0,
			"status": "",
			"diffStorageNum": 0,
			"purchaseId": 0,
			"isPeriodMng": 0,
			"define3": "",
			"define7": "",
			"define24": "",
			"define32": "",
			"define33": "",
			"define37": "",
			"define46": "",
			"define48": "",
			"id": 0,
			"signNum": 0,
			"erpArriveId": "",
			"recvstor": "",
			"taxPriceShow": "",
			"arrivalBatchNo": "",
			"delplanDetailId": 0,
			"define14": "",
			"define50": "",
			"reqDeptName": "",
			"reqContact": "",
			"expirationDate": "2026-06-07 13:06:23",
			"rejectedInvoiceQuantity": 0,
			"purchaseNum": 0,
			"purchaseExchRate": 0,
			"unitid": "",
			"define15": "",
			"taxPrice": 0,
			"purnum": 0,
			"define25": "",
			"define39": "",
			"productId": 0,
			"productSubject": "",
			"productImgUrl": "",
			"define43": "",
			"define55": "",
			"erpMaterialId": "",
			"purchaseIdForNcc": "",
			"orderCode": "",
			"skuCode": "",
			"receiveMan": "",
			"reqDeptId": 0,
			"isBarcodeMng": 0,
			"erpMaterialManufacturer": "",
			"mainNum": 0,
			"priceExchRate": 0,
			"orderQuantity": 0,
			"define35": "",
			"define44": "",
			"define47": "",
			"define52": "",
			"num": 0,
			"materialId": 0,
			"outerOrderId": "",
			"erpPuOrderBodyId": "",
			"erpArriveDetailId": "",
			"reqPudepDocName": "",
			"productionDate": "2026-06-07 13:06:23",
			"reqReturnQuantity": 0,
			"detailAccountStatus": "",
			"mainMetrologyId": "",
			"mainMetrologyCode": "",
			"define22": "",
			"define31": "",
			"arriveOrderId": 0,
			"saleOrderCode": "",
			"lastDiffStorageDiffNum": 0,
			"contactWay": "",
			"blargess": true,
			"reqPuorgDocId": 0,
			"checkStatusBefore": "",
			"packingSpec": "",
			"accomplishedPurchaseNum": 0,
			"unitCode": "",
			"projectCode": "",
			"contractMaterialId": 0,
			"define9": "",
			"define20": "",
			"define38": "",
			"materialName": "",
			"purchaseSignNum": 0,
			"erpArriveCode": "",
			"invoiceQuantity": 0,
			"materialDesc": "",
			"detailAccountStatusName": "",
			"purchaseUnitName": "",
			"define4": "",
			"define12": "",
			"define45": "",
			"storageId": "",
			"materialBrand": "",
			"diffPurchaseReceivedNum": 0,
			"diffPurchaseStorageNum": 0,
			"consignee_info": "",
			"serialNo": "",
			"returnQuantity": 0,
			"isVerifyCert": 0,
			"projectId": 0,
			"contractId": 0,
			"define13": "",
			"define27": "",
			"materialSpec": "",
			"outerDetailId": "",
			"planArriveDateString": "",
			"orderCodeLineNum": "",
			"deliveryBarcode": "",
			"isVerifyAuthorization": 0,
			"delplanId": 0,
			"define21": "",
			"define26": "",
			"define28": "",
			"define30": "",
			"define49": "",
			"define57": ""
		}
	],
	"sendErpRsmsg": "",
	"signTime": "2026-06-07 13:06:23",
	"projectDocCode": "",
	"isPushERP": "",
	"define37": "",
	"define42": "",
	"define58": "",
	"receiveOrgId": 0,
	"materialName": "",
	"isDeliveryProxy": "",
	"isSupplierRevoke": "",
	"define2": "",
	"define9": "",
	"define20": "",
	"define27": "",
	"define39": "",
	"define53": "",
	"trainCode": "",
	"orderId": "",
	"memo": "",
	"deliveryDateString": "",
	"supplierid": 0,
	"supplierCode": "",
	"detailAccountStatus": "",
	"currencyName": "",
	"erpInwhApproveType": "",
	"define19": "",
	"define51": "",
	"totalNum": 0,
	"projectDocId": "",
	"erpArriveId": "",
	"receivePersonName": "",
	"supplierName": "",
	"isDeliveryBrand": "",
	"supEnterpriseId": 0,
	"无税价格": 0,
	"erpSupplyId": "",
	"approver": "",
	"erpArriveCode": "",
	"define5": "",
	"receiveAddress": "",
	"define54": "",
	"define11": "",
	"define60": "",
	"define30": "",
	"receivePersonIdForNcc": "",
	"define32": "",
	"define40": "",
	"define45": "",
	"arriveOrderCode": "",
	"purEnterpriseId": 0,
	"outerId": "",
	"arriveDesc": "",
	"taxAmountShow": "",
	"currencyCode": "",
	"isYcReceive": "",
	"isEnableApprove": "",
	"define6": "",
	"define7": "",
	"define10": "",
	"define14": "",
	"define26": "",
	"define33": "",
	"define46": "",
	"orderCode": "",
	"define49": "",
	"accountStatus": "",
	"deliveryDate": "2026-06-07 13:06:23",
	"projectDocIdStr": "",
	"orderArea": "",
	"sendErpCode": "",
	"define4": "",
	"define15": "",
	"define22": "",
	"define35": "",
	"define55": "",
	"define59": "",
	"purchaseOrgCode": "",
	"outerTypeName": "",
	"invoiceInfo": "",
	"totalarrivenum": 0,
	"supTenantId": "",
	"supEnterpriseName": "",
	"amount": 0,
	"accountStatusName": "",
	"purUserName": "",
	"statusName": "",
	"industryTag": 0,
	"define38": "",
	"saleOrderId": "",
	"saleOrderCode": "",
	"outerTypeId": "",
	"deliveryOrderId": 0,
	"unit": "",
	"currencyId": "",
	"currencySymbol": "",
	"define17": "",
	"define44": "",
	"taxAmount": 0,
	"logisticalInfo": "",
	"signUser": "",
	"businessType": 0,
	"bodyId": 0,
	"materialCode": "",
	"productSubject": "",
	"approverNCCode": "",
	"define3": "",
	"define13": "",
	"define41": "",
	"define48": "",
	"logisticalCode": "",
	"receiveMemo": "",
	"amountShow": "",
	"signUserId": 0,
	"define21": "",
	"define24": "",
	"purchaseOrgId": 0,
	"transportCode": "",
	"logisticalStatus": "",
	"projectDocName": "",
	"priceType": "",
	"isDelivered": "",
	"define1": "",
	"define16": "",
	"define25": "",
	"define28": "",
	"define31": "",
	"define47": "",
	"define56": "",
	"arriveOrderType": "",
	"deliveryOrderCode": "",
	"purchaseOrgName": "",
	"deliverMemo": "",
	"receivePersonId": 0,
	"checkStatusBefore": "",
	"num": 0,
	"define12": "",
	"define23": "",
	"id": 0,
	"transportType": "",
	"linktype": "",
	"receivePersonTel": "",
	"supplierShortName": "",
	"define8": "",
	"define34": "",
	"define36": "",
	"define52": "",
	"define57": ""
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

