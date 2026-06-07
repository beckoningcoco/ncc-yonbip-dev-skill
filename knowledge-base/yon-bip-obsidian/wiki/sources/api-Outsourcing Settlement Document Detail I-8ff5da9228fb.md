---
title: "委外核销单详情查询"
apiId: "8ff5da9228fb496eb2a2bba5de02b425"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Subcontracting Settlement"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外核销单详情查询

>  请求方式	GET | Subcontracting Settlement (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/verification/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	委外核销单ID, 委外核销单ID和委外核销单编码不能同时为空，ID和编码同时存在，以ID为准
code	string	query	否	委外核销单号

## 3. 请求示例

Url: /yonbip/mfg/verification/detail?access_token=访问令牌&id=&code=

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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	long	否	返回码，成功时返回200 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回信息
id	long	否	委外核销单Id 示例：2569918922740224
orgId	string	否	组织Id 示例：2325505713575680
orgName	string	否	组织 示例：资产管理公司
vendorId	string	否	委外商Id 示例：2325541812343040
vendorName	string	否	委外商 示例：WWS1
code	string	否	单号 示例：HX20211221011014
status	int	否	状态: 0-开立; 1:已审核; 示例：1
transTypeId	string	否	交易类型Id 示例：2325273783046416
transTypeName	string	否	交易类型编码 示例：HX01
transTypeCode	string	否	交易类型名称 示例：核销
remark	string	否	备注 示例：备注
vouchdate	string	否	单据日期 示例：2021-12-21 00:00:00
pubts	string	否	时间戳 示例：2021-12-21 10:57:14
auditor	string	否	审核人 示例：Yanjha
auditTime	string	否	审核时间 示例：2021-08-17 16:37:02
auditDate	string	否	审核日期 示例：2021-08-17 00:00:00
creatorId	long	否	创建人Id 示例：2325478401872128
creator	string	否	创建人 示例：Yanjha
createTime	string	否	创建时间 示例：2021-08-17 16:36:40
verificationType	string	否	核销类型：0-正常; 1:调整 示例：0
docType	string	否	单据类别：0-入库; 1:退库; 示例：0
sourceType	string	否	来源：0-核销画面自动核销操作; 1:入库自动核销; 2:手工录入; 3:盘点差异倒冲; 4:根据入库单领料并核销; 示例：2
modifier	string	否	修改人 示例：13662080373
modifyTime	string	否	修改时间 示例：2021-12-21 10:57:14
modifyDate	string	否	修改日期 示例：2021-12-21 00:00:00
verificationUserId	string	否	核销人ID 示例：2325478401872128
verificationUserName	string	否	核销人 示例：Yanjha
osmInId	long	否	入库单ID 示例：2563386232295680
purinrecordsId	long	否	入库行ID 示例：2563386232295681
purinrecordsCode	string	否	入库单号 示例：OSMI20211216000003
purinrecordsRowno	int	否	入库单行号 示例：1
isMerge	boolean	否	合并：false-否；true-是 示例：false
purinrecordOrgId	string	否	库存组织ID 示例：2325505713575680
purinrecordOrgName	string	否	库存组织 示例：资产管理公司
purinwarehouseId	long	否	入库仓库Id 示例：2325544527892736
subcontractId	long	否	委外订单Id 示例：2567027689219654
subcontractproductOrderCode	string	否	委外订单号 示例：WWDD20210810000005
subcontractproductId	long	否	委外订单行Id 示例：2382027689219329
subcontractproductRowno	string	否	委外订单行号 示例：1
purinDate	string	否	入库日期 示例：2021-12-16 00:00:00
productId	long	否	物料ID 示例：2325533913174272
materialCode	string	否	成品物料编码 示例：000001
materialName	string	否	成品物料名称 示例：P10
materialId	long	否	成品制造物料ID 示例：2325533924905472
skuId	long	否	SKUID 示例：2325533922283776
skuIdName	string	否	成品SKU名称 示例：P10
purinQuantity	double	否	数量 示例：10000
purinStockQuantity	double	否	件数 示例：10000
unitId	long	否	主计量单位ID 示例：2325529461018880
unitName	string	否	主计量单位 示例：袋
unitPrecision	int	否	主计量单位精度 示例：1
stockUnitId	long	否	库存单位ID 示例：2325529461018880
stockUnitName	string	否	库存单位 示例：袋
stockUnitPrecision	int	否	库存单位精度 示例：1
financeOrgId	string	否	会计主体组织ID 示例：2325505713575680
financeOrgName	string	否	会计主体组织 示例：资产管理公司
isReturn	boolean	否	返工订单：false-否；true-是 示例：true
masterOrgKeyField	string	否	主组织字段 示例：orgId
transTypeKeyField	string	否	交易类型字段 示例：transTypeId
freeCharacteristics	object	否	自由项特征组
verificationDetail	object	是	核销明细

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": 2569918922740224,
		"orgId": "2325505713575680",
		"orgName": "资产管理公司",
		"vendorId": "2325541812343040",
		"vendorName": "WWS1",
		"code": "HX20211221011014",
		"status": 1,
		"transTypeId": "2325273783046416",
		"transTypeName": "HX01",
		"transTypeCode": "核销",
		"remark": "备注",
		"vouchdate": "2021-12-21 00:00:00",
		"pubts": "2021-12-21 10:57:14",
		"auditor": "Yanjha",
		"auditTime": "2021-08-17 16:37:02",
		"auditDate": "2021-08-17 00:00:00",
		"creatorId": 2325478401872128,
		"creator": "Yanjha",
		"createTime": "2021-08-17 16:36:40",
		"verificationType": "0",
		"docType": "0",
		"sourceType": "2",
		"modifier": "13662080373",
		"modifyTime": "2021-12-21 10:57:14",
		"modifyDate": "2021-12-21 00:00:00",
		"verificationUserId": "2325478401872128",
		"verificationUserName": "Yanjha",
		"osmInId": 2563386232295680,
		"purinrecordsId": 2563386232295681,
		"purinrecordsCode": "OSMI20211216000003",
		"purinrecordsRowno": 1,
		"isMerge": false,
		"purinrecordOrgId": "2325505713575680",
		"purinrecordOrgName": "资产管理公司",
		"purinwarehouseId": 2325544527892736,
		"subcontractId": 2567027689219654,
		"subcontractproductOrderCode": "WWDD20210810000005",
		"subcontractproductId": 2382027689219329,
		"subcontractproductRowno": "1",
		"purinDate": "2021-12-16 00:00:00",
		"productId": 2325533913174272,
		"materialCode": "000001",
		"materialName": "P10",
		"materialId": 2325533924905472,
		"skuId": 2325533922283776,
		"skuIdName": "P10",
		"purinQuantity": 10000,
		"purinStockQuantity": 10000,
		"unitId": 2325529461018880,
		"unitName": "袋",
		"unitPrecision": 1,
		"stockUnitId": 2325529461018880,
		"stockUnitName": "袋",
		"stockUnitPrecision": 1,
		"financeOrgId": "2325505713575680",
		"financeOrgName": "资产管理公司",
		"isReturn": true,
		"masterOrgKeyField": "orgId",
		"transTypeKeyField": "transTypeId",
		"freeCharacteristics": {},
		"verificationDetail": [
			{
				"id": 2569918922740225,
				"verificationId": "2569918922740224",
				"lineNo": 10,
				"ordermaterialId": 1983825550512385,
				"productId": 2325569972998400,
				"materialCode": "000002",
				"materialName": "CaiL-1",
				"skuId": 2325569980780800,
				"skuName": "CaiL-1",
				"ordermaterialSubstituteFlag": 1,
				"subcontractId": 2334912500633856,
				"subcontractproductOrderCode": "WWDD20210708000002",
				"subcontractproductId": 2334912500683016,
				"subcontractproductRowno": "10",
				"materialOutId": 2352097725436416,
				"materialOutCode": "CLCK20210720000002",
				"materialOutRowno": 53,
				"stockDirection": 0,
				"stockOrgId": "2325505713575680",
				"stockOrgName": "资产管理公司",
				"warehouseId": 2325567523770624,
				"warehouseName": "普通仓",
				"batchNumber": "20",
				"verificationBy": 0,
				"unitUseQuantity": 1,
				"materialOutQuantity": 186.8874,
				"verificationQuantity": 0,
				"availableHxQuantity": 186.8874,
				"fixedQuantity": 1,
				"curVerificationQuantity": 2,
				"unitId": 2325530395463936,
				"unitName": "千克",
				"unitPrecision": 4,
				"curVerificationStockQuantity": 2,
				"stockUnitId": 2325530395463936,
				"stockUnitName": "千克",
				"stockUnitPrecision": 4,
				"stockToMain": 1,
				"isBackflush": false,
				"isLast": true,
				"source": "ustock.st_materialout",
				"sourceid": 2352097725338112,
				"sourceautoid": 2352097725436416,
				"isFromOSMIn": false,
				"makeRuleCode": "materialOutToVerification",
				"isUpdateCost": true,
				"isScrap": false,
				"freeCharacteristics": {}
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
0	未传入优惠券档案id	coupon_id值填写有误
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
返回参数 (51)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

