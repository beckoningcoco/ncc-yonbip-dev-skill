---
title: "交货计划单保存V2"
apiId: "1692086908580528136"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Delivery Schedule"
domain: "SS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Delivery Schedule]
platform_version: "BIP"
source_type: community-api-docs
---

# 交货计划单保存V2

>  请求方式	POST | Delivery Schedule (SS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/delplan/saveDelplan
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	long	否	否	交货计划主键 示例：1708635967317344264
transtypeId	string	否	否	交易类型主键 示例：1708601435777138690
transtypeCode	string	否	否	交易类型编码 示例：001
transtypeName	string	否	否	交易类型名称 示例：普通
billNo	string	否	是	交货计划单编号(不允许重复) 示例：10001
billDate	string	否	否	交货计划单日期 示例：2023-04-22 10:00:00
purOrgId	string	否	否	采购组织主键 示例：1608941847885905924
purOrgCode	string	否	否	采购组织编码 示例：TH01
purOrgName	string	否	否	采购组织名称 示例：天海总公司
purDeptId	string	否	否	采购部门主键 示例：1608942011094663172
purDeptCode	string	否	否	采购部门编码 示例：01dept02_TH01
purDeptName	string	否	否	采购部门名称 示例：总公司采购部
purchaseId	string	否	否	采购员id（来源档案为用户） 示例：3068819686887681
purchaseCode	string	否	是	采购员编码 示例：psn02
purchaseName	string	否	否	采购员名称 示例：王采购员
supplierId	long	否	否	供应商主键 示例：1609331375552856066
supplierCode	string	否	是	供应商外部编码 示例：1001A2100000000004MV
supplierName	string	否	否	供应商名称 示例：云采测试专用供应商02（yctest_gys02)
urgency	int	否	否	紧急程度：1.普通；2.紧急；3.加急 示例：1
memo	string	否	否	备注（最大长度为500） 示例：123
billstatus	string	否	否	整单状态:4.待我确认 示例：4
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
delplanDetailList	object	是	是	交货计划单表体
delplanNo	string	否	是	交货计划主表单据编号(与表头billNo值一致) 示例：10001
detailNo	string	否	否	交货计划子表单据编号 示例：10001
lineNum	long	否	是	行号 示例：1
materialId	long	否	否	物料主键（来源物料档案） 示例：1609360555654512646
materialCode	string	否	是	物料编码 示例：2020000040
materialName	string	否	否	物料名称 示例：花生香精189P09M5707
saleOrderId	long	否	否	销售订单主表ID 示例：1695611650798780428
saleOrderDetailId	long	否	否	销售订单子表ID 示例：1695611659388715008
saleOrderCode	string	否	否	销售订单号 示例：202304040004
saleOrderLine	string	否	否	销售订单行号 示例：1
unitId	long	否	否	单位ID（来源计量单位档案） 示例：1609357385966551046
unitCode	string	否	否	单位编码 示例：KGM
unitName	string	否	否	单位名称 示例：千克
unitMainId	long	否	否	主计量单位主键 示例：1609357385966551046
unitMainCode	string	否	否	主计量单位编码 示例：KGM
unitMainName	string	否	否	主计量单位名称 示例：千克
deliveryMainNum	BigDecimal	否	否	交货主数量 示例：6
purUnitId	long	否	否	采购单位主键 示例：1609357385966551046
purUnitCode	string	否	否	采购单位编码 示例：KGM
purUnitName	string	否	否	采购单位名称 示例：千克
purUnitConRate	BigDecimal	否	否	采购单位换算率 示例：1
purUnitConRateNum	number
小数位数:8,最大长度:28	否	否	采购单位换算率分子 示例：1
purUnitConRateDen	number
小数位数:8,最大长度:28	否	否	采购单位换算率分母 示例：1
deliveryNum	BigDecimal	否	否	交货数量 示例：6
deliveryDate	string	否	否	要求交货时间 示例：2023-04-24 10:00:00
warehouseId	long	否	否	仓库主键 示例：1708630229257814020
warehouseCode	string	否	否	仓库编码 示例：000001
warehouseName	string	否	否	仓库名称 示例：仓库
memo	string	否	否	备注（最大长度500） 示例：123
fisactive	string	否	否	行状态：0.激活 1.关闭 示例：0
receiveOrgId	long	否	否	收货组织主键 示例：1608941847885905924
receiveOrgCode	string	否	否	收货组织编码 示例：TH01
receiveOrgName	string	否	否	收货组织名称 示例：天海总公司
purOrderId	long	否	否	采购订单主表ID 示例：1695611650798780423
purOrderDetailId	long	否	是	采购订单子表ID(传子表ERPID) 示例：1695611650798780424
purOrderCode	string	否	是	采购订单号 示例：CD2023040400000602
purOrderLine	string	否	否	采购订单行号 示例：1
receivePersonId	string	否	否	收货人主键 示例：3068819686887681
receivePersonCode	string	否	否	收货人编码 示例：psn02
receivePersonName	string	否	否	收货人名称 示例：王采购员
purOrderDetailErpId	string	否	是	ERP采购订单子表ID 示例：1001A210000000005LND
purOrderErpId	string	否	是	ERP采购订单主表ID 示例：1001A210000000005LNC
unitErpId	string	否	否	ERP计价单位主键ID 示例：0001Z0100000000000XI
purUnitErpId	string	否	否	ERP采购业务单位主键 示例：0001Z0100000000000XI
unitMainErpId	string	否	否	ERP主计量单位主键 示例：0001Z0100000000000XI
productPuType	string	否	否	物料采购类型，0-普通、1-赠品、2-样品 示例：0

## 3. 请求示例

Url: /yonbip/cpu/delplan/saveDelplan?access_token=访问令牌
Body: {
	"id": 1708635967317344264,
	"transtypeId": "1708601435777138690",
	"transtypeCode": "001",
	"transtypeName": "普通",
	"billNo": "10001",
	"billDate": "2023-04-22 10:00:00",
	"purOrgId": "1608941847885905924",
	"purOrgCode": "TH01",
	"purOrgName": "天海总公司",
	"purDeptId": "1608942011094663172",
	"purDeptCode": "01dept02_TH01",
	"purDeptName": "总公司采购部",
	"purchaseId": "3068819686887681",
	"purchaseCode": "psn02",
	"purchaseName": "王采购员",
	"supplierId": 1609331375552856066,
	"supplierCode": "1001A2100000000004MV",
	"supplierName": "云采测试专用供应商02（yctest_gys02)",
	"urgency": 1,
	"memo": "123",
	"billstatus": "4",
	"resubmitCheckKey": "OPENAPI_951ada30e0969e9",
	"delplanDetailList": [
		{
			"delplanNo": "10001",
			"detailNo": "10001",
			"lineNum": 1,
			"materialId": 1609360555654512646,
			"materialCode": "2020000040",
			"materialName": "花生香精189P09M5707",
			"saleOrderId": 1695611650798780428,
			"saleOrderDetailId": 1695611659388715008,
			"saleOrderCode": "202304040004",
			"saleOrderLine": "1",
			"unitId": 1609357385966551046,
			"unitCode": "KGM",
			"unitName": "千克",
			"unitMainId": 1609357385966551046,
			"unitMainCode": "KGM",
			"unitMainName": "千克",
			"deliveryMainNum": 6,
			"purUnitId": 1609357385966551046,
			"purUnitCode": "KGM",
			"purUnitName": "千克",
			"purUnitConRate": 1,
			"purUnitConRateNum": 1,
			"purUnitConRateDen": 1,
			"deliveryNum": 6,
			"deliveryDate": "2023-04-24 10:00:00",
			"warehouseId": 1708630229257814020,
			"warehouseCode": "000001",
			"warehouseName": "仓库",
			"memo": "123",
			"fisactive": "0",
			"receiveOrgId": 1608941847885905924,
			"receiveOrgCode": "TH01",
			"receiveOrgName": "天海总公司",
			"purOrderId": 1695611650798780423,
			"purOrderDetailId": 1695611650798780424,
			"purOrderCode": "CD2023040400000602",
			"purOrderLine": "1",
			"receivePersonId": "3068819686887681",
			"receivePersonCode": "psn02",
			"receivePersonName": "王采购员",
			"purOrderDetailErpId": "1001A210000000005LND",
			"purOrderErpId": "1001A210000000005LNC",
			"unitErpId": "0001Z0100000000000XI",
			"purUnitErpId": "0001Z0100000000000XI",
			"unitMainErpId": "0001Z0100000000000XI",
			"productPuType": "0"
		}
	]
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
code	string	否	状态码，正确返回值为200 示例：200
message	string	否	提示信息，当code不为200时，出示错误信息 示例：xxxxxxxxxx
data	string	否	后端服务返回的数据部分 示例：xxxxxxxxxx

## 5. 正确返回示例

{
	"code": "200",
	"message": "xxxxxxxxxx",
	"data": "xxxxxxxxxx"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	失败原因	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-21	
更新
请求说明
新增
请求参数 purUnitConRateNum
新增
请求参数 purUnitConRateDen
更新
请求参数 (5)
	2	2025-06-24	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

