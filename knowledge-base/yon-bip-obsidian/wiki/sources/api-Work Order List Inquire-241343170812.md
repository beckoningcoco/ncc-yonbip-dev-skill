---
title: "工单列表查询"
apiId: "2413431708123136007"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Service Work Order"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Service Work Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 工单列表查询

>  请求方式	POST | Service Work Order (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MFC/so/batchquery
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
page	object	否	是	分页
pageIndex	number
小数位数:0,最大长度:38	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:38	否	是	页数 示例：20 默认值：20
condition	object	否	否	查询条件
simpleVOs	object	是	否	扩展查询条件
queryOrders	object	是	否	排序参数
field	string	否	否	排序字段
order	string	否	否	排序顺序：正序ASC，倒序：DESC

## 3. 请求示例

Url: /yonbip/MFC/so/batchquery?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "code",
				"op": "like",
				"value1": "SWO20251125188915"
			}
		]
	},
	"queryOrders": [
		{
			"field": "",
			"order": ""
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	number
小数位数:0,最大长度:10	否	操作状态码 示例：200
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
message	string	否	返回信息描述 示例：操作成功
data	object	否	返回数据集
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页条数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	返回数据
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"id": "2412714139447197698",
				"orgId": "2142222364797566982",
				"orgId_name": "云智化工股份有限公司",
				"serviceOrgId": "2141601845107752974",
				"serviceOrgId_name": "1125aa组织",
				"code": "SWO20251125188915",
				"transactionTypeId": "PES_SOS_001",
				"transactionTypeId_name": "服务工单",
				"isMulEquipment": 0,
				"srcType": "portal",
				"sourceCategory": "manually",
				"bdProjectId": "2211283454507571203",
				"bdProjectId_name": "项目",
				"wbs": "1624317366991323148",
				"wbs__name": "WBS任务",
				"activity": "2130692928819953699",
				"activity__taskName": "活动",
				"workflowAfterComplete": 0,
				"customId": "2211283394507571203",
				"customId_name": "资产组织",
				"tosId": "2111013483154767887",
				"tosIdName": "保养",
				"serviceLevelId": "1624317366991323166",
				"serviceLevelId_name": "服务级别",
				"maintenanceLevelId": "1624317375581257728",
				"maintenanceLevelId_name": "维保级别",
				"urgency": "normal",
				"handleMethod": "direct",
				"status": "confirmed",
				"scoringStatus": "wait_scoring",
				"isOverdue": 0,
				"isBreak": "0",
				"breakReason": "异常关闭原因",
				"detail!serviceContractId": "1624317375581257746",
				"detail!serviceContractId_name": "服务合同",
				"taskPlanId": "1624317375581257754",
				"taskPlanIdName": "安装计划",
				"installWorkId": "1624317375581257750",
				"installWorkIdName": "安装作业",
				"detail!equId": "1624317375581257758",
				"detail!equId_equip_code": "EAM-202412060005",
				"detail!equId_equip_name": "设备名称",
				"detail!productId": "1624317375581257764",
				"detail!productId_name": "产品",
				"detail!equId_serial_num": "SN2025001",
				"vendorId": "1624317384171192320",
				"vendorId_name": "服务商",
				"posId": "1624317384171192324",
				"posId_name": "服务点",
				"serviceTeamId": "1624317384171192328",
				"serviceTeamId_name": "服务团队",
				"seId": "1624317384171192332",
				"seId_name": "服务工程师",
				"appointServiceTime": "2025-11-25 21:21:34",
				"detail!qaType": "out_period",
				"detail!positionId": "c11981d1-5cf3-11e9-817e-7cd30abea0c0",
				"detail!positionId_name": "北京/北京市/海淀区",
				"detail!address": "北清路1010号",
				"customFactory": "1918383091702038534",
				"customFactoryName": "客户工厂",
				"contactName": "客户联系人",
				"ymsencContactPhone": "18723464589",
				"createdAt": "2025-11-25 21:20:56",
				"confirmAt": "2025-11-25 21:21:33",
				"dispatchedAt": "2025-11-25 21:21:33",
				"receivedAt": "2025-11-26 15:33:30",
				"completedAt": "2025-11-26 15:33:30",
				"scoreAt": "2025-11-26 15:33:30",
				"logisticsCompany": "物流公司",
				"logisticsNumber": "WL20251126010003",
				"serviceContent": "描述",
				"completionConfirmationAt": "2025-11-26 15:35:30",
				"isCancel": "0",
				"detail!authResult": "1",
				"detail!isAssign": "0",
				"detail!id": "2412714139447197699",
				"handleDeptId": "1624317392761126926",
				"handleDeptId_name": "经手部门",
				"handlePersonId": "2149053664880754691",
				"handlePersonId_name": "王先生",
				"isWfControlled": "0",
				"verifystate": "0",
				"returncount": 0,
				"auditorId": "2077685301317735860",
				"auditor": "审批人",
				"auditDate": "2025-11-26",
				"auditTime": "2025-11-26 20:25:45",
				"voucherStatus": "1",
				"isFlowCoreBill": 0,
				"bizFlow": "2339786427888304233",
				"bizFlow_name": "流程名称",
				"bizFlow_version": "流程版本信息",
				"pubts": "2025-11-25 21:21:34",
				"detail!pubts": "2025-11-25 21:21:34"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
999	报错具体提示信息	结合报错提示信息查找原因

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

