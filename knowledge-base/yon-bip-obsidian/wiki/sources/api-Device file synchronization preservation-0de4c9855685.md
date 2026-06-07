---
title: "设备服务信息查询"
apiId: "0de4c98556854c8c8b62dfef8ab35e9c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Equipment Service Info"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Equipment Service Info]
platform_version: "BIP"
source_type: community-api-docs
---

# 设备服务信息查询

>  请求方式	POST | Equipment Service Info (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/sm/sis/query
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
orgIds	string	否	否	创建组织ID，多个值以“,”分割 示例：1716687027900672,1716687027900671
keywords	string	否	否	设备编码/名称，单个值 示例：202009240001
customerIds	string	否	否	客户ID，多个值以“,”分割 示例：1732102247747840,1732102247747842
pageIndex	int	否	否	页码 示例：1 默认值：1
pageSize	int	否	否	每页数量 示例：20 默认值：20
pubtsBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳开始时间 示例：2022-09-16 17:35:15
pubtsEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳结束时间 示例：2022-09-16 17:35:15
createTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据创建开始时间 示例：2024-08-16 17:35:15
createTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据创建结束时间 示例：2024-08-16 17:35:15
modifyTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据修改开始时间 示例：2024-08-16 17:35:15
modifyTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据修改结束时间 示例：2024-08-16 17:35:15

## 3. 请求示例

Url: /yonbip/pes/sm/sis/query?access_token=访问令牌
Body: {
	"orgIds": "1716687027900672,1716687027900671",
	"keywords": "202009240001",
	"customerIds": "1732102247747840,1732102247747842",
	"pageIndex": 1,
	"pageSize": 20,
	"pubtsBegin": "2022-09-16 17:35:15",
	"pubtsEnd": "2022-09-16 17:35:15",
	"createTimeBegin": "2024-08-16 17:35:15",
	"createTimeEnd": "2024-08-16 17:35:15",
	"modifyTimeBegin": "2024-08-16 17:35:15",
	"modifyTimeEnd": "2024-08-16 17:35:15"
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
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
code	long	否	请求状态码 示例：200
message	string	否	返回信息
data	object	否	返回数据集
totalCount	long	否	总数 示例：1
result	object	是	返回结果集

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {
		"totalCount": 1,
		"result": [
			{
				"id": "1578312778144284677",
				"orgId": "1482855524471040",
				"orgIdName": "智能制造-开发环境",
				"equipmentId": "9df87deb95f0439cba7d0347375c7489",
				"equipmentIdEquipCode": "swxcq",
				"equipmentIdEquipName": "sw吸尘器",
				"equipmentId_serial_num": "SN2025122200001",
				"equipmentIdSpec": "设备规格",
				"equipmentIdModel": "设备型号",
				"equCategoryId": "f0a281f2053d49fe8a8e9d8cfe829c3d",
				"equCategoryCode": "01",
				"equCategoryName": "安装工单",
				"equipmentUsedStatus": "PRESET01_0000L6YM3BQPDBWR290000",
				"equipmentUsedStatus_status_name": "在用",
				"productId": "2059889310500388867",
				"productId_name": "产品",
				"productId_manageClass": "1922515546025492482",
				"productId_manageClass_name": "产品分类",
				"saleContract": "销售合同",
				"manufactureDate": "2025-12-11",
				"equipmentIdStartUsedDate": "2020-08-31",
				"purchaseDate": "2025-12-12",
				"deliveryDate": "2020-08-31",
				"acceptDate": "2020-08-31",
				"slcId": "2040757919838896184",
				"slcId_name": "质保期计算规则",
				"qaDate": "2020-08-31",
				"qaType": "out_period",
				"customId": "1508205655953664",
				"customIdName": "华测集团",
				"customFactory": "2020074791784153094",
				"customFactoryName": "客户工厂",
				"customerContactName": "客户联系人",
				"ymsencCustomerContactPhone": "16600325687",
				"regionID": "1254325235234686",
				"regionIDName": "所属区域",
				"address": "安装地址",
				"log": "116.1922538423626",
				"lot": "40.12613372768496",
				"isEffective": "1",
				"memo": "备注",
				"installCount": 1,
				"installStatus": "2",
				"latestInstallTime": "2023-07-14 17:00:46",
				"debugCount": 1,
				"debugStatus": "1",
				"latestDebugTime": "2025-12-06 16:48:33",
				"acceptanceCount": 0,
				"acceptanceStatus": "0",
				"latestAcceptanceTime": "2024-11-14 11:48:28",
				"sales_no": "XSDD2025122314090001",
				"sales_out_no": "XSCK2025122314100001",
				"bomId": "1565850063090221060",
				"bomCode": "BOM编码",
				"bomName": "BOM名称",
				"serviceOrgId": "14624824283315",
				"serviceOrgIdName": "服务组织",
				"vendorId": "156654129442544",
				"vendorIdName": "服务商",
				"posId": "123456155142142",
				"posIdName": "服务点",
				"serviceTeamId": "126542151541515",
				"serviceTeamIdName": "服务团队",
				"serviceTeamIdPersonIdName": "团队负责人",
				"serviceTeamIdPhone": "1510342355",
				"serverPersonId": "14974161461685",
				"serverPersonIdName": "服务人员",
				"equipDebugCreateDate": "2022-12-27",
				"equipDebugCompleteDate": "2022-12-27",
				"equipUserDefines": {},
				"techValueList": [
					{
						"id": "2370995077707726853",
						"pk_equip": "9df87deb95f0439cba7d0347375c7489",
						"tech_id": "2212178766345535496",
						"tech_index": "1",
						"tech_showname": "技术参数1",
						"tech_value": "111",
						"tech_showvalue": "111"
					}
				],
				"equipServiceInfoDetailList": [
					{
						"serviceOrgId": "14624824283315",
						"serviceOrgId_name": "服务组织",
						"vendorId": "156654129442544",
						"vendorId_name": "服务商",
						"posId": "123456155142142",
						"posId_name": "服务点",
						"posId_district": "c0bf8c76-5cf3-11e9-817e-7cd30abea0c0",
						"posId_district_name": "北京",
						"posId_personId": "1950016135741046787",
						"posId_personId_name": "服务点负责人",
						"posId_deptId": "1950013696212729864",
						"posId_deptId_name": "服务点负责部门",
						"posId_phone": "17366967118",
						"serviceTeamId": "126542151541515",
						"serviceTeamId_name": "服务团队",
						"serviceTeamId_personId_name": "团队负责人",
						"serviceTeamId_phone": "17366967118",
						"serverPersonId": "2082871543056039938",
						"serverPersonId_name": "服务工程师",
						"serverContact": "17366967118"
					}
				]
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
1001001000003	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-23	
新增
返回参数 (35)
调整接口返回信息
	2	2025-10-13	
更新
请求说明
新增
返回参数 (29)
删除
返回参数 userDefines
删除
返回参数 define
删除
返回参数 id
调整新增字段名称

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

