---
title: "固定资产盘点单详情查询"
apiId: "f4014cf8e351497b98c957eddd922663"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Stocktaking Sheet"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Stocktaking Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产盘点单详情查询

>  请求方式	GET | Fixed Asset Stocktaking Sheet (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/inventory/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	盘点单ID（id和code有一个作为查询条件就可以）    示例: 2591857106702848
code	string	query	否	盘点单编码（id和code有一个作为查询条件就可以）    示例: ZCPD000005

## 3. 请求示例

Url: /yonbip/fi/inventory/detail?access_token=访问令牌&id=2591857106702848&code=ZCPD000005

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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用完成时的返回信息 示例：操作成功
data	object	否	调用完成时的返回数据
verifystate	long	否	单据状态 0未审核 2 已审核 示例：0
code	string	否	单据编码 示例：ZCPD000005
masterOrgKeyField	string	否	主组织权限字段 示例：accentity
usageStateId_name	string	否	使用状态名称 示例：在用
manageDeptId	string	否	管理部门 示例：2578616882778368
categoryId_name	string	否	固定资产类别 示例：生产设备
placeId	string	否	主表查询位置 示例：2649461959790848
accentity_name	string	否	会计主体名称 示例：缓存公司198528542
accentity	string	否	会计主体 示例：2578616857580032
vouchdate	string	否	单据日期 示例：2022-02-16 00:00:00
accbook_name	string	否	账簿名称 示例：缓存公司198528542_默认业务账簿
id	long	否	盘点单主表ID 示例：2650676686770688
custodianId	string	否	管理人 示例：2591353990599168
pubts	string	否	盘点单主表时间戳 示例：2022-02-16 20:13:29
tenant	long	否	当前租户 示例：2491026088726784
quantity	long	否	盘点查询数量 示例：1
isWfControlled	boolean	否	是否支持审批流 示例：false
manageDeptId_name	string	否	管理部门名称 示例：缓存部门198528542
accbook	long	否	业务账簿 示例：2578712294199808
userId_name	string	否	使用人名称 示例：吱吱65772505
placeId_location_name	string	否	位置名称 示例：test011
usageDeptId	string	否	使用部门 示例：2578616882778368
userId	string	否	使用人 示例：2591353990599168
transTypeKeyField	string	否	交易类型标识 示例：transtypeId
planDate	string	否	计划盘点日期 示例：2022-02-16 00:00:00
usageStateId	long	否	使用状态 示例：2490045710783215
custodianId_name	string	否	管理人名称 示例：吱吱65772505
usageDeptId_name	string	否	使用部门名称 示例：缓存部门198528542
location	string	否	存放地点 示例：存放地点
categoryId	long	否	固定资产类别 示例：2490847118201723
auditor	string	否	审核人
auditorId	string	否	审核人ID
auditTime	string	否	审核时间
remarks	object	否	主表备注
bodyvos	object	是	列表返回数据
status	long	否	单据状态 0 未审核 1 已审核 2 已取消 3 审核中 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"verifystate": 0,
		"code": "ZCPD000005",
		"masterOrgKeyField": "accentity",
		"usageStateId_name": "在用",
		"manageDeptId": "2578616882778368",
		"categoryId_name": "生产设备",
		"placeId": "2649461959790848",
		"accentity_name": "缓存公司198528542",
		"accentity": "2578616857580032",
		"vouchdate": "2022-02-16 00:00:00",
		"accbook_name": "缓存公司198528542_默认业务账簿",
		"id": 2650676686770688,
		"custodianId": "2591353990599168",
		"pubts": "2022-02-16 20:13:29",
		"tenant": 2491026088726784,
		"quantity": 1,
		"isWfControlled": false,
		"manageDeptId_name": "缓存部门198528542",
		"accbook": 2578712294199808,
		"userId_name": "吱吱65772505",
		"placeId_location_name": "test011",
		"usageDeptId": "2578616882778368",
		"userId": "2591353990599168",
		"transTypeKeyField": "transtypeId",
		"planDate": "2022-02-16 00:00:00",
		"usageStateId": 2490045710783215,
		"custodianId_name": "吱吱65772505",
		"usageDeptId_name": "缓存部门198528542",
		"location": "存放地点",
		"categoryId": 2490847118201723,
		"auditor": "",
		"auditorId": "",
		"auditTime": "",
		"remarks": {
			"zh_CN": "888899999"
		},
		"bodyvos": [
			{
				"afUsageDeptName": "缓存部门198528542:30,服务94474333:70",
				"bePlaceId_location_name": "test011",
				"afManageDeptId": "2578616882778368",
				"afCustodianId": "2591353990599168",
				"afQuantity": 1,
				"beUserId_name": "吱吱65772505",
				"depreciationStatus": "0",
				"inventoryBillId": 2650676686770688,
				"beManageDeptId": "2578616882778368",
				"inventoryResult": "2",
				"afPlaceId_location_name": "test011",
				"assetId": 2650645937738244,
				"afUserId": "2591353990599168",
				"id": 2650676686770689,
				"pubts": "2022-02-16 12:07:46",
				"beLocation": {
					"zh_CN": "存放地点"
				},
				"assetCode": "0302220201000055",
				"beUsageDeptName": "缓存部门198528542:30.00,服务94474333:70.00",
				"afUserId_name": "吱吱65772505",
				"inventoryDate": "2022-02-16 00:00:00",
				"beUsageStateId": 2490045710783215,
				"createAssetDate": "2022-02-01 00:00:00",
				"afCustodianId_name": "吱吱65772505",
				"assetCategoryId_name": "生产设备",
				"beManageDeptId_name": "缓存部门198528542",
				"afDepartments": [
					{
						"deptName": "缓存部门198528542",
						"proportion": 30,
						"deptId": "2578616882778368",
						"id": 2650676686770692,
						"mainId": 2650676686770689
					}
				],
				"beQuantity": 1,
				"beUserId": "2591353990599168",
				"isMoreDepartment": true,
				"bePlaceId": "2649461959790848",
				"beCustodianId_name": "吱吱65772505",
				"afPlaceId": "2649461959790848",
				"afManageDeptId_name": "缓存部门198528542",
				"afUsageStateId_name": "在用",
				"assetCategoryId": 2490847118201723,
				"beCustodianId": "2591353990599168",
				"afLocation": {
					"zh_CN": "8888999999999"
				},
				"assetName": {
					"zh_CN": "固定资产名称1"
				},
				"beUsageStateId_name": "在用",
				"beDepartments": [
					{
						"deptName": "缓存部门198528542",
						"proportion": 30,
						"deptId": "2578616882778368",
						"id": 2650676686770690,
						"mainId": 2650676686770689
					}
				],
				"afUsageStateId": 2490045710783215,
				"remarks": {
					"zh_CN": "得得得得的"
				}
			}
		],
		"status": 0
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (96)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

