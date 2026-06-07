---
title: "服务计划保存"
apiId: "2200165862981238787"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Service Plan"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Service Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 服务计划保存

>  请求方式	POST | Service Plan (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/serviceplan/save
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
data	object	否	是	服务计划参数对象
orgId	string	否	是	服务计划组织id或code 示例：2122896446486740994
code	string	否	是	服务计划编码 示例：0SP0005
name	string	否	是	服务计划名称 示例：46
transactionTypeId	string	否	是	交易类型主键 示例：2413028813328640
serviceTypeId	string	否	是	服务类型主键 示例：2111013483154767882
equipmentCategoryId	string	否	否	设备分类主键 示例：3333013483154767562
qaType	string	否	否	质保类型 示例：in_period
servicePlanTemplateId	string	否	否	服务计划模版主键 示例：2200152376863096838
customerLevelId	string	否	否	客户级别
positionId	string	否	否	地区主键 示例：bfacf6bf-5cf3-11e9-817e-7cd30abea0c0
servicePlanRuleId	string	否	是	服务计划规则主键 示例：2170000503843848198
startTime	date
格式:yyyy-MM-dd HH:mm:ss	否	是	计划开始时间 示例：2025-02-12 11:36:22
endTime	date
格式:yyyy-MM-dd HH:mm:ss	否	是	计划结束时间 示例：2025-02-23 00:00:00
enable	string	否	是	启用状态： 1 启用 0 停用 示例：0
memo	string	否	否	备注 示例：456
creator	string	否	否	创建人 示例：曲爽
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间 示例：2025-02-12 11:36:22
id	string	否	否	服务计划主键，更新时必填 示例：2364501364234661
ServiceProjectStandardVOList	object	是	否	服务项目子表对象
MaterialQuotaVOList	object	是	否	物料定额子表对象
RelationEquipmentVOList	object	是	否	关联设备子表对象
_status	string	否	是	状态：状态，支持Insert新增，Update更新 示例：Insert

## 3. 请求示例

Url: /yonbip/pes/serviceplan/save?access_token=访问令牌
Body: {
	"data": {
		"orgId": "2122896446486740994",
		"code": "0SP0005",
		"name": "46",
		"transactionTypeId": "2413028813328640",
		"serviceTypeId": "2111013483154767882",
		"equipmentCategoryId": "3333013483154767562",
		"qaType": "in_period",
		"servicePlanTemplateId": "2200152376863096838",
		"customerLevelId": "",
		"positionId": "bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
		"servicePlanRuleId": "2170000503843848198",
		"startTime": "2025-02-12 11:36:22",
		"endTime": "2025-02-23 00:00:00",
		"enable": "0",
		"memo": "456",
		"creator": "曲爽",
		"createTime": "2025-02-12 11:36:22",
		"id": "2364501364234661",
		"ServiceProjectStandardVOList": [
			{
				"lineNo": 10,
				"serviceProjectId": "2154429108502659080",
				"serviceProjectStandardId": "2158841165202325513",
				"_status": "Insert",
				"id": ""
			}
		],
		"MaterialQuotaVOList": [
			{
				"materialId": "2111972583703838725",
				"quantity": 1,
				"unit": "2107554771755335680",
				"autoConsume": "0",
				"id": "2200152376863096840",
				"_status": "Insert"
			}
		],
		"RelationEquipmentVOList": [
			{
				"equipmentId": "2200154017555283975",
				"_status": "Insert",
				"id": ""
			}
		],
		"_status": "Insert"
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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
orgId	string	否	组织主键 示例：2122896446486740994
orgId_name	string	否	组织名称 示例：M维修组织
code	string	否	编码 示例：0SP0004
name	string	否	名称 示例：444
transactionTypeId	string	否	交易类型主键 示例：2413028813328640
transactionTypeId_name	string	否	交易类型名称 示例：服务计划
serviceTypeId	string	否	服务类型主键 示例：2111013483154767882
serviceTypeId_name	string	否	服务类型名称 示例：回访
qaType	string	否	质保类型:in_period保内 out_period 保外 示例：in_period
servicePlanRuleId	string	否	服务计划规则主键 示例：2170000503843848198
servicePlanRuleId_name	string	否	服务计划规则名称 示例：1212
startTime	string	否	计划开始时间 示例：2025-02-11 16:05:04
endTime	string	否	计划结束时间 示例：2025-02-13 00:00:00
status	string	否	状态 示例：approved
enable	string	否	启用状态： 1 启用 0 停用 示例：0
creator	string	否	创建人 示例：曲爽
createTime	string	否	创建时间 示例：2025-02-11 16:05:03
ServiceProjectStandardVOList	object	是	服务项目子表对象
MaterialQuotaVOList	object	是	物料定额子表对象
RelationEquipmentVOList	object	是	关联设备子表对象
_status	string	否	状态 示例：Update
id	string	否	服务计划主键 示例：2200152376863096840

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orgId": "2122896446486740994",
		"orgId_name": "M维修组织",
		"code": "0SP0004",
		"name": "444",
		"transactionTypeId": "2413028813328640",
		"transactionTypeId_name": "服务计划",
		"serviceTypeId": "2111013483154767882",
		"serviceTypeId_name": "回访",
		"qaType": "in_period",
		"servicePlanRuleId": "2170000503843848198",
		"servicePlanRuleId_name": "1212",
		"startTime": "2025-02-11 16:05:04",
		"endTime": "2025-02-13 00:00:00",
		"status": "approved",
		"enable": "0",
		"creator": "曲爽",
		"createTime": "2025-02-11 16:05:03",
		"ServiceProjectStandardVOList": [
			{
				"lineNo": 10,
				"serviceProjectId": "2154429108502659080",
				"serviceProjectId_name": "现场回访",
				"serviceProjectStandardId": "2158841165202325513",
				"serviceProjectStandardId_name": "12312341",
				"_status": "Insert",
				"id": ""
			}
		],
		"MaterialQuotaVOList": [
			{
				"materialId": "2111972583703838725",
				"materialId_code": "0001000001",
				"materialId_name": "设备物料",
				"quantity": 1,
				"unit": "2107554771755335680",
				"unit_name": "小时",
				"autoConsume": 0,
				"memo": "测试传输",
				"id": "2200152376863096840",
				"pubts": "2025-02-12 11:37:28",
				"_status": "Insert"
			}
		],
		"RelationEquipmentVOList": [
			{
				"equipmentId": "2200154017555283975",
				"equipmentServiceId_equipmentId_equip_name": "456",
				"equipmentServiceId_equipmentId_equip_code": "EAM-2025021200000001",
				"equipmentServiceId": "2200154051914498049",
				"equipmentServiceId_customId": "",
				"equipmentServiceId_customId_name": "",
				"equipmentServiceId_regionID": "",
				"equipmentServiceId_regionID_name": "",
				"equipmentServiceId_qaDate": "",
				"equipmentServiceId_posId": "",
				"equipmentServiceId_posId_name": "",
				"id": ""
			}
		],
		"_status": "Update",
		"id": "2200152376863096840"
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
1001001000003	操作错误，不同错误信息不同	

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

