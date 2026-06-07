---
title: "委外核销调整取委外商的材料出库"
apiId: "4ed4eb0b61ad4e6f90761feadd01411e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Settlement Adj"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Settlement Adj]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外核销调整取委外商的材料出库

>  请求方式	POST | Subcontracting Settlement Adj (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/verificationadjust/getotherdetails
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
purinrecordsId	long	否	是	委外入库单行id 示例：1967600514994432

## 3. 请求示例

Url: /yonbip/mfg/verificationadjust/getotherdetails?access_token=访问令牌
Body: {
	"purinrecordsId": 1967600514994432
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	string	否	接口返回码，调用成功时返回200 示例：200
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
data	object	是	接口返回数据
verificationBy	string	否	核销依据：0-按订单应发核销；2-按不含损耗的BOM用量核销；3-按含损耗的BOM用量核销 示例：0
unitUseQuantity	double	否	单位使用数量 示例：0.067367
ordermaterialId	long	否	委外订单备料行id 示例：2482398751249154
fixedQuantity	long	否	用量类型：0-变动数量；1-固定用量 示例：0
productId	long	否	物料id 示例：2322679018262784
materialCode	string	否	物料编码 示例：000004
materialName	string	否	物料名称 示例：CaiL002
materialId	long	否	制造物料id 示例：2322679028028416
skuId	long	否	物料SKUid 示例：2322679024816384
skuName	string	否	物料SKU名称 示例：CaiL002
subcontractproductId	long	否	委外订单行id 示例：2482398751249153
subcontractId	long	否	委外订单id 示例：2482398751249152
isUpdateCost	boolean	否	更新存货成本：false-否；true-是 示例：true
isScrap	boolean	否	是否废品：false-否；true-是 示例：false
isFromOSMIn	boolean	否	入库单领退料：false-否；true-是 示例：false
isBackflush	boolean	否	倒冲生成：false-否；true-是 示例：false
materialOutQuantity	double	否	出库数量 示例：6.7367
verificationQuantity	double	否	累计核销数量 示例：4.7367
curOsmInVerificationQuantity	double	否	本单核销数量 示例：4.7367
curVerificationQuantity	long	否	本次核销数量 示例：0
curVerificationStockQuantity	long	否	本次核销件数 示例：0
makeRuleCode	string	否	生单规则编号。固定值：materialOutToVerification 示例：materialOutToVerification
source	string	否	来源单据类型。固定值：ustock.st_materialout 示例：ustock.st_materialout
sourceid	long	否	来源单据主表id 示例：2669557391627008
sourceautoid	long	否	来源单据子表id 示例：2669557391627009
upcode	string	否	来源单据号 示例：CLCK20220301000001
sourceMainPubts	string	否	来源单据主表时间戳 示例：2022-03-03 10:58:24
materialOutPubts	string	否	材料出库单主表时间戳 示例：2022-03-03 10:58:24
materialOutId	long	否	材料出库单行id 示例：2669557391627009
stockOrgId	string	否	库存组织id 示例：2322542927713536
stockOrgName	string	否	库存组织名称 示例：珠海工厂
warehouseId	long	否	仓库id 示例：2322688828641536
warehouse	string	否	仓库名称 示例：普通仓
unitId	long	否	主计量id 示例：2322545709289728
unitName	string	否	主计量名称 示例：千克
unitPrecision	long	否	主计量精度 示例：4
unitTruncationType	long	否	主计量舍位方式 示例：4
stockToMain	long	否	换算率 示例：1
stockUnitId	long	否	库存单位id 示例：2322545709289728
stockUnitName	string	否	库存单位名称 示例：千克
stockTruncationType	long	否	库存单位舍位方式 示例：4
stockUnitPrecision	long	否	库存单位精度 示例：4
isLast	boolean	否	最后一笔：false-否；true-是 示例：false
materialOutCode	string	否	材料出库单号 示例：CLCK20220301000001
materialOutRowno	long	否	材料出库单行号 示例：1
subcontractproductOrderCode	string	否	委外订单号 示例：WWDD20211020000001
subcontractproductRowno	long	否	委外订单行号 示例：10
lineNo	long	否	行号 示例：10

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"verificationBy": "0",
			"unitUseQuantity": 0.067367,
			"ordermaterialId": 2482398751249154,
			"fixedQuantity": 0,
			"productId": 2322679018262784,
			"materialCode": "000004",
			"materialName": "CaiL002",
			"materialId": 2322679028028416,
			"skuId": 2322679024816384,
			"skuName": "CaiL002",
			"subcontractproductId": 2482398751249153,
			"subcontractId": 2482398751249152,
			"isUpdateCost": true,
			"isScrap": false,
			"isFromOSMIn": false,
			"isBackflush": false,
			"materialOutQuantity": 6.7367,
			"verificationQuantity": 4.7367,
			"curOsmInVerificationQuantity": 4.7367,
			"curVerificationQuantity": 0,
			"curVerificationStockQuantity": 0,
			"makeRuleCode": "materialOutToVerification",
			"source": "ustock.st_materialout",
			"sourceid": 2669557391627008,
			"sourceautoid": 2669557391627009,
			"upcode": "CLCK20220301000001",
			"sourceMainPubts": "2022-03-03 10:58:24",
			"materialOutPubts": "2022-03-03 10:58:24",
			"materialOutId": 2669557391627009,
			"stockOrgId": "2322542927713536",
			"stockOrgName": "珠海工厂",
			"warehouseId": 2322688828641536,
			"warehouse": "普通仓",
			"unitId": 2322545709289728,
			"unitName": "千克",
			"unitPrecision": 4,
			"unitTruncationType": 4,
			"stockToMain": 1,
			"stockUnitId": 2322545709289728,
			"stockUnitName": "千克",
			"stockTruncationType": 4,
			"stockUnitPrecision": 4,
			"isLast": false,
			"materialOutCode": "CLCK20220301000001",
			"materialOutRowno": 1,
			"subcontractproductOrderCode": "WWDD20211020000001",
			"subcontractproductRowno": 10,
			"lineNo": 10
		}
	]
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

