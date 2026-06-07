---
title: "计划订单列表查询"
apiId: "2121340414169972740"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planned Order"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planned Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划订单列表查询

>  请求方式	POST | Planned Order (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/requirementsplanning/getPlanOrderList
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
data	object	否	是	参数
pageIndex	number
小数位数:-1,最大长度:8	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:-1,最大长度:4	否	是	每页条数 示例：10 默认值：10
orgId	string	否	否	组织id，组织 Id 与组织编码不能同时为空，优先级：orgId>orgCode 示例：1608788551787872266
orgCode	string	否	否	组织编码，组织 Id 与组织编码不能同时为空，优先级：orgId>orgCode 示例：122701
planParamId	string	否	否	计划名称id，优先级：planParamId > planParamCode 示例：3115402872983808
planParamCode	string	否	否	计划名称编码，优先级：planParamId > planParamCode 示例：MRP2019110200002
startDate	date
格式:yyyy-MM-dd	否	是	开始时间 示例：2022-01-10
endDate	date
格式:yyyy-MM-dd	否	是	结束时间 示例：2022-01-10
supplyOrgId	string	否	否	供应组织id，优先级：supplyOrgId > supplyOrgCode 示例：1608788551787872266
supplyOrgCode	string	否	否	供应组织编码，优先级：supplyOrgId > supplyOrgCode 示例：122701
departmentId	string	否	否	部门id，优先级：departmentId > departmentCode 示例：1608788551787872266
departmentCode	string	否	否	部门编码，优先级：departmentId > departmentCode 示例：bumen
warehouseId	string	否	否	仓库Id，优先级：warehouseId > warehouseCode 示例：1608788551787872266
warehouseCode	string	否	否	仓库编码，优先级:warehouseId > warehouseCode 示例：000012
productIds	string	是	否	物料id，优先级:productIds > productCodes 示例：["1550141821342973955","1550139381815705608"]
productCodes	string	是	否	物料编码，优先级:productIds > productCodes 示例：["000123","000124"]
planProperty	string	是	否	计划属性 1,采购 ,2,委外 ,3,自制 ,4,调拨 ,5,组织间需求 示例：["1","2"]

## 3. 请求示例

Url: /yonbip/mfg/requirementsplanning/getPlanOrderList?access_token=访问令牌
Body: {
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"orgId": "1608788551787872266",
		"orgCode": "122701",
		"planParamId": "3115402872983808",
		"planParamCode": "MRP2019110200002",
		"startDate": "2022-01-10",
		"endDate": "2022-01-10",
		"supplyOrgId": "1608788551787872266",
		"supplyOrgCode": "122701",
		"departmentId": "1608788551787872266",
		"departmentCode": "bumen",
		"warehouseId": "1608788551787872266",
		"warehouseCode": "000012",
		"productIds": [
			"1550141821342973955",
			"1550139381815705608"
		],
		"productCodes": [
			"000123",
			"000124"
		],
		"planProperty": [
			"1",
			"2"
		]
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	返回状态码，200 成功 999 失败 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	操作通知信息 示例：操作成功
data	object	是	数据
recordList	object	否	数据信息
pageIndex	number
小数位数:0,最大长度:10	否	当前页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页条数 示例：10
recordCount	number
小数位数:0,最大长度:10	否	总条数 示例：13
pageCount	number
小数位数:0,最大长度:10	否	页码数 示例：2
beginPageIndex	number
小数位数:0,最大长度:10	否	开始页码 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"recordList": {
				"id": "1630874665323855906",
				"orgId": "1608788551787872266",
				"orgCode": "02301070001",
				"transTypeId": "1601383117764427779",
				"transTypeCode": "GEN-11",
				"planParamId": "3035900830109952",
				"planParamCode": "GEN0",
				"planParamName": "LRP202301070001",
				"createType": "2",
				"code": "GEN00011",
				"productCode": "000045",
				"productId": "159192034273814118",
				"planProperty": "1",
				"bomId": "1591920342738141189",
				"bomCode": "likun-M.Code-002（固）",
				"uom": "1570768779829837833",
				"uomName": "千克",
				"uomCode": "kg",
				"assistUnit": "1570768797009707017",
				"assistUnitCode": "kg",
				"assistUnitName": "千克",
				"originQuantity": 10,
				"assistUnitCount": 10,
				"suggestPlanQuantity": 10,
				"inputQty": 10,
				"issuedQuantity": 0,
				"startDate": "2023-01-06 00:00:00",
				"finishDate": "2023-01-06 00:00:00",
				"status": "0",
				"demandOrgId": "1570766056850456576",
				"demandOrgCode": "00310",
				"supplyOrgId": "1570766056850456576",
				"supplyOrgCode": "00310",
				"invOrgId": "1570766056850456576",
				"invOrgCode": "00310",
				"source": "10",
				"upcode": "YCD20221228000006",
				"srcSourceProductId": "1570766056850456576",
				"srcSourceProductCode": "1035000045",
				"firstsource": "280",
				"firstupcode": "YCD20221228000006",
				"firstsourceautoid": "1623614151955316744",
				"sourceMaterialId": "1590995696384737289",
				"sourceMaterialCode": "1035000045",
				"departmentId": "1570766056850456576",
				"departmentCode": "001111",
				"departmentName": "部门1",
				"warehouseId": "1570766056850456576",
				"warehouseCode": "001111",
				"warehouseName": "仓库1",
				"isClosed": false,
				"remark": "remark",
				"projectId": "1570766056850456576",
				"projectIdCode": "001111",
				"projectIdName": "项目一号",
				"wbs": "1570766056850456576",
				"wbsCode": "001111",
				"wbsName": "wbs任务一号",
				"activity": "1570766056850456576",
				"activityCode": "001111",
				"activityName": "活动一号",
				"planOrderItem": [
					{
						"itemProductId": "1681453239576297481",
						"itemProductCode": "wlfl014",
						"itemProductName": "WC1",
						"mainUnitId": "1674787939942400002",
						"mainUnitCode": "MKT",
						"mainUnitName": "立方米",
						"stockUnitId": "1674787939942400004",
						"stockUnitCode": "MTQ",
						"stockUnitName": "平方千米",
						"changeRate": 1,
						"requirementQuantity": 5.01,
						"auxiliaryRequirementQuantity": 5.01,
						"stockOrgId": "1681369238604349442",
						"stockOrgCode": "zzw",
						"stockOrgName": "库存w",
						"warehouseId": "1681372373925232646",
						"warehouseCode": "w2",
						"warehouseName": "仓库w2",
						"reqDate": "2024-04-08 23:59:59",
						"remark": "备注",
						"substituteFlag": "0",
						"projectId": "1654046039626743861",
						"projectIdCode": "pj1",
						"projectIdName": "项目名称",
						"wbs": "1570766056850456576",
						"wbsCode": "00001111",
						"wbsName": "wbs任务一号",
						"activity": "1570766056850456575",
						"activityCode": "001111",
						"activityName": "活动一号",
						"reserveid": "1570766056850456574",
						"reserveTypeName": "自定义",
						"reserveName": "跟踪线索"
					}
				]
			},
			"pageIndex": 1,
			"pageSize": 10,
			"recordCount": 13,
			"pageCount": 2,
			"beginPageIndex": 1,
			"endPageIndex": 1
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
310008	取决于错误类型，不同错误信息不同	

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

