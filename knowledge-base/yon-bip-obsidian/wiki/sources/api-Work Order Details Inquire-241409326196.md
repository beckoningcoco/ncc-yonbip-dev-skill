---
title: "工单详情查询"
apiId: "2414093261963001858"
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

# 工单详情查询

>  请求方式	POST | Service Work Order (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MFC/socard/detail
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
id	string	否	否	工单ID 示例：1604360431924674583
code	string	否	否	工单号 示例：SWO20251125188915

## 3. 请求示例

Url: /yonbip/MFC/socard/detail?access_token=访问令牌
Body: {
	"id": "1604360431924674583",
	"code": "SWO20251125188915"
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
id	string	否	工单ID 示例：2361154517350744074
orgId	string	否	创建组织ID 示例：2142222364797566982
orgId_name	string	否	创建组织 示例：云智化工股份有限公司
transactionTypeId	string	否	交易类型ID 示例：PES_SOS_001
transactionTypeId_name	string	否	交易类型 示例：服务工单
sourceCategory	string	否	来源类别【manually：手工创建；plan_so：计划工单；question_order：问题单；sale_order：销售订单；system_create：系统创建】 示例：manually
srcType	string	否	创建来源【mini_program：小程序；app：移动应用；portal：WEB应用；open_api：API】 示例：portal
code	string	否	工单号 示例：SWO20250917188898
createdAt	string	否	提单时间 示例：2025-09-17 10:02:43
tosId	string	否	服务类型ID 示例：2111013483154767882
tosId_name	string	否	服务类型 示例：保养
bdProjectId	string	否	项目ID 示例：2211283454507571203
bdProjectId_name	string	否	项目 示例：项目
projectId	string	否	服务项目ID 示例：2154429263144026115
projectIdName	string	否	服务项目 示例：服务项目
wbs	string	否	WBS 示例：1604360431924674583
wbs__name	string	否	WBS任务 示例：WBS任务
activity	string	否	活动主键 示例：2130692928819953699
activity__taskName	string	否	活动 示例：活动
serviceLevelId	string	否	服务级别ID 示例：1624317366991323166
serviceLevelId_name	string	否	服务级别 示例：服务级别
workflowAfterComplete	string	否	完工后启用工作流【1：是；0：否】 示例：0
maintenanceLevelId	string	否	维保级别ID 示例：1624317375581257728
maintenanceLevelId_name	string	否	维保级别 示例：维保级别
taskPlanId	string	否	安装计划ID 示例：1624317375581257754
taskPlanId_name	string	否	安装计划 示例：安装计划
installWorkId	string	否	安装作业ID 示例：1624317375581257750
installWorkId_name	string	否	安装作业 示例：安装作业
urgency	string	否	紧急程度【extra_urgent：特急；urgent：紧急；normal：一般；not_urgent：不紧急】 示例：normal
isCancel	string	否	是否作废【1：是；0：否】 示例：0
handleMethod	string	否	处理方式【dtd：上门服务；remote：远程处理；direct：直接处理；repair：返厂维修】 示例：direct
serviceContent	string	否	描述 示例：描述
isMulEquipment	string	否	工单属性【0：单设备；1：多设备】 示例：0
isSub	string	否	是否子单【1：是；0：否】 示例：0
assignStatus	string	否	分派状态【unassigned：未分派；assigning：分派中；assigned：已分派】 示例：unassigned
isWfControlled	string	否	是否审批流控制【1：是；0：否】 示例：0
verifystate	string	否	审批状态【0：初始开立；1：审批中；2：审批完成；3：不通过流程终止；4：驳回到制单】 示例：0
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
auditorId	string	否	审批人ID 示例：2077685301317735860
auditor	string	否	审批人 示例：system
auditDate	string	否	审批日期 示例：2025-10-09 09:55:04
auditTime	string	否	审批时间 示例：2025-10-09 09:55:04
voucherStatus	string	否	单据状态【0：开立；1：已审核；3：审核中】 示例：1
bizFlow	string	否	流程ID 示例：2339786427888304233
bizFlow_name	string	否	流程名称 示例：流程名称
bizFlow_version	string	否	流程版本信息 示例：V1
customId	string	否	客户ID 示例：2198737245268606978
customId_name	string	否	客户名称 示例：客户名称
customFactory	string	否	客户工厂ID 示例：1918383091702038534
customFactoryName	string	否	客户工厂 示例：客户工厂
contactName	string	否	客户联系人 示例：王先生
ymsencContactPhone	string	否	客户联系人电话 示例：150331564581
serviceOrgId	string	否	服务组织ID 示例：2142222364797566982
serviceOrgId_name	string	否	服务组织 示例：云智化工股份有限公司
vendorId	string	否	服务商ID 示例：1624317384171192320
vendorId_name	string	否	服务商 示例：服务商
posId	string	否	服务点ID 示例：1624317384171192324
posId_name	string	否	服务点 示例：服务点
serviceTeamId	string	否	服务团队ID 示例：1624317384171192328
serviceTeamId_name	string	否	服务团队 示例：服务团队
seId	string	否	服务工程师ID 示例：1624317384171192332
seId_name	string	否	服务工程师 示例：服务工程师
status	string	否	工单状态【created：待处理；confirmed：已确认；dispatched：已派工；received：已接收；completed：已完工；evaluated：已评价；closed：关闭】 示例：evaluated
scoringStatus	string	否	打分状态【wait_scoring：待打分；rejected：打分返回；already_scoring：已打分】 示例：wait_scoring
isBreak	string	否	是否异常【1：是；0：否】 示例：0
completionConfirmationAt	string	否	完工确认时间 示例：2025-10-09 09:54:51
completedAt	string	否	完工时间 示例：2025-10-09 09:54:51
completeStatus	string	否	调试完成状态【undebuged：调试检查未通过；checked：调试检查通过；debuged：调试完成】 示例：debuged
checkResult	string	否	验收状态【unpassed：不通过；passed：通过】 示例：passed
workingHours	number
小数位数:2,最大长度:16	否	总工时 示例：0
priceService	number
小数位数:2,最大长度:16	否	应收服务费 示例：0
priceMaterial	number
小数位数:2,最大长度:16	否	应收配件费 示例：0
priceOther	number
小数位数:2,最大长度:16	否	其他费用 示例：0
priceSum	number
小数位数:2,最大长度:16	否	累计费用 示例：0
memoComplete	string	否	完工说明 示例：完工说明
scoreOrgId	string	否	评分组织ID 示例：1695709412897062917
scoreOrgId_name	string	否	评分组织 示例：评分组织
scoreRatio	number
小数位数:2,最大长度:16	否	打分系数 示例：0
scoreMemo	string	否	打分说明 示例：打分说明
scoreReturnCount	number
小数位数:0,最大长度:10	否	返回次数 示例：0
scoreMoney	number
小数位数:2,最大长度:16	否	绩效统计 示例：0
scoreAt	string	否	打分时间 示例：2025-11-26 15:33:30
scoreAssessor	string	否	操作人ID 示例：1695709412897062917
scoreAssessorName	string	否	操作人 示例：操作人
evaluateValue	string	否	评价星级 示例：5
evaluateSatisfaction	string	否	满意度 示例：5
emsTag	string	否	评分标签 示例：17,18,19,20
emsTagEnums	object	是	评分标签枚举
evaluateMemo	string	否	评价描述 示例：评价描述
pubts	string	否	时间戳 示例：2025-10-09 09:56:11
smsSosEquipmentList	object	是	工单设备信息
soLogsList	object	是	工单服务记录
soPersonList	object	是	工单协作人员信息
smsSoServicePriceList	object	是	工单费用信息
soReportList	object	是	工单汇报信息
soServiceStandardList	object	是	工单服务标准信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2361154517350744074",
		"orgId": "2142222364797566982",
		"orgId_name": "云智化工股份有限公司",
		"transactionTypeId": "PES_SOS_001",
		"transactionTypeId_name": "服务工单",
		"sourceCategory": "manually",
		"srcType": "portal",
		"code": "SWO20250917188898",
		"createdAt": "2025-09-17 10:02:43",
		"tosId": "2111013483154767882",
		"tosId_name": "保养",
		"bdProjectId": "2211283454507571203",
		"bdProjectId_name": "项目",
		"projectId": "2154429263144026115",
		"projectIdName": "服务项目",
		"wbs": "1604360431924674583",
		"wbs__name": "WBS任务",
		"activity": "2130692928819953699",
		"activity__taskName": "活动",
		"serviceLevelId": "1624317366991323166",
		"serviceLevelId_name": "服务级别",
		"workflowAfterComplete": "0",
		"maintenanceLevelId": "1624317375581257728",
		"maintenanceLevelId_name": "维保级别",
		"taskPlanId": "1624317375581257754",
		"taskPlanId_name": "安装计划",
		"installWorkId": "1624317375581257750",
		"installWorkId_name": "安装作业",
		"urgency": "normal",
		"isCancel": "0",
		"handleMethod": "direct",
		"serviceContent": "描述",
		"isMulEquipment": "0",
		"isSub": "0",
		"assignStatus": "unassigned",
		"isWfControlled": "0",
		"verifystate": "0",
		"returncount": 0,
		"auditorId": "2077685301317735860",
		"auditor": "system",
		"auditDate": "2025-10-09 09:55:04",
		"auditTime": "2025-10-09 09:55:04",
		"voucherStatus": "1",
		"bizFlow": "2339786427888304233",
		"bizFlow_name": "流程名称",
		"bizFlow_version": "V1",
		"customId": "2198737245268606978",
		"customId_name": "客户名称",
		"customFactory": "1918383091702038534",
		"customFactoryName": "客户工厂",
		"contactName": "王先生",
		"ymsencContactPhone": "150331564581",
		"serviceOrgId": "2142222364797566982",
		"serviceOrgId_name": "云智化工股份有限公司",
		"vendorId": "1624317384171192320",
		"vendorId_name": "服务商",
		"posId": "1624317384171192324",
		"posId_name": "服务点",
		"serviceTeamId": "1624317384171192328",
		"serviceTeamId_name": "服务团队",
		"seId": "1624317384171192332",
		"seId_name": "服务工程师",
		"status": "evaluated",
		"scoringStatus": "wait_scoring",
		"isBreak": "0",
		"completionConfirmationAt": "2025-10-09 09:54:51",
		"completedAt": "2025-10-09 09:54:51",
		"completeStatus": "debuged",
		"checkResult": "passed",
		"workingHours": 0,
		"priceService": 0,
		"priceMaterial": 0,
		"priceOther": 0,
		"priceSum": 0,
		"memoComplete": "完工说明",
		"scoreOrgId": "1695709412897062917",
		"scoreOrgId_name": "评分组织",
		"scoreRatio": 0,
		"scoreMemo": "打分说明",
		"scoreReturnCount": 0,
		"scoreMoney": 0,
		"scoreAt": "2025-11-26 15:33:30",
		"scoreAssessor": "1695709412897062917",
		"scoreAssessorName": "操作人",
		"evaluateValue": "5",
		"evaluateSatisfaction": "5",
		"emsTag": "17,18,19,20",
		"emsTagEnums": [
			{
				"nameType": "text",
				"text": "干净整洁",
				"value": "17"
			}
		],
		"evaluateMemo": "评价描述",
		"pubts": "2025-10-09 09:56:11",
		"smsSosEquipmentList": [
			{
				"id": "2361154517350744075",
				"soId": "2361154517350744074",
				"soCode": "SWO20250917188898",
				"equId": "2198738001186521098",
				"equId_equip_code": "EAM-2025021000000001",
				"equId_equip_name": "设备名称",
				"productId": "2142996893419962374",
				"productId_name": "产品",
				"equId_pk_category": "1633512814662647811",
				"equId_pk_category_category_name": "设备类别",
				"equId_serial_num": "SN202511270001",
				"specification": "规格",
				"equId_model": "型号",
				"serviceContractId": "1633512814662647816",
				"serviceContractId_name": "服务合同",
				"qaType": "in_period",
				"authResult": "1",
				"positionId": "bfb0b1f1-5cf3-11e9-817e-7cd30abea0c0",
				"positionId_name": "北京/北京市/海淀区",
				"country": "中国",
				"province": "北京",
				"city": "北京市",
				"district": "海淀区",
				"street": "北清路68号",
				"address": "北清路68号",
				"isAssign": "0",
				"subSoId": "1633512823252582412",
				"subSoCode": "SWO202509171889001",
				"subSoStatus": "received",
				"scoreStdMoney": 0,
				"scoreRatio": 0,
				"scoreMoney": 0,
				"scoreMemo": "打分说明",
				"irId": "",
				"pubts": "2025-09-17 10:02:45",
				"smsSoFailureLogsList": [
					{
						"id": "1746877282439659530",
						"pubts": "2025-11-27 20:48:13",
						"soEquipmentSoId": "2361154517350744074",
						"soEquipmentSoCode": "SWO20250917188898",
						"soEquipmentId": "2361154517350744075",
						"soEquipment_equip_code": "EAM-2025021000000001",
						"soEquipment_equip_name": "设备名称",
						"categoryId": "1746877291029594125",
						"categoryIdName": "故障分类",
						"phenomenaId": "1746877291029594129",
						"phenomenaId_name": "故障现象",
						"causeId": "1746877291029594133",
						"causeId_name": "故障原因",
						"measureId": "1746877291029594137",
						"measureId_name": "故障措施",
						"discoveryId": "1746877291029594141",
						"discoveryId_name": "发现途径",
						"memo": "故障描述",
						"failureStartAt": "2025-11-27 20:48:13",
						"failureEndAt": "2025-11-27 20:48:13"
					}
				],
				"soItemSpareList": [
					{
						"id": "1746877265259790352",
						"pubts": "2025-11-28 09:19:30",
						"soEquipmentSoId": "2361154517350744074",
						"soEquipmentSoCode": "SWO20250917188898",
						"soEquipmentId": "2361154517350744075",
						"soEquipment_equip_code": "EAM-2025021000000001",
						"soEquipment_equip_name": "设备名称",
						"itemId": "1746877273849724943",
						"itemId_name": "配件",
						"batch": "346578766",
						"brandId": "1746877273849724949",
						"brandId_name": "品牌",
						"itemId_model": "规格",
						"unit": "1746877273849724955",
						"unit_name": "单位",
						"unit_precision": "2",
						"qty": 10,
						"taxPrice": 2.55,
						"taxAmount": 25.5,
						"taxRateArchive": "1769066535189741582",
						"taxRateArchiveCode": "VATZR",
						"taxRateArchiveName": "0%增值税税率",
						"taxRate": 0,
						"lendCumQty": 0,
						"saleCumQty": 0,
						"autoConsume": "0"
					}
				]
			}
		],
		"soLogsList": [
			{
				"id": "2377478897779867659",
				"soId": "2361154517350744074",
				"soCode": "SWO20250917188898",
				"orgId": "2142222364797566982",
				"orgId_name": "云智化工股份有限公司",
				"currNode": "evaluate",
				"handlePersonName": "操作人",
				"handleTime": "2025-10-09 09:56:11",
				"posId": "1633512831842517008",
				"posIdName": "服务点",
				"posPersonIdName": "服务点负责人",
				"seId": "1633512831842517011",
				"seIdName": "服务工程师",
				"seIdMobile": "16633248569",
				"positionIdName": "实时位置",
				"content": "描述",
				"sequence": 110,
				"soLogList_fileList": "2136578554313310395",
				"handleType": "change_dispatch",
				"pubts": "2025-10-09 09:56:11"
			}
		],
		"soPersonList": [
			{
				"id": "1819510908901392392",
				"pubts": "2025-11-28 09:52:52",
				"soId": "2361154517350744074",
				"personId": "1819510900311457805",
				"personName": "协作人",
				"personEmail": "23544656734@163.com",
				"personMobile": "16634569874"
			}
		],
		"smsSoServicePriceList": [
			{
				"id": "1746877248079921168",
				"pubts": "2025-11-28 10:37:34",
				"soId": "2361154517350744074",
				"soEquipmentItemRecordId": "1746877265259790352",
				"soEquipmentItemRecord_soEquipmentId": "2361154517350744075",
				"soEquipmentItemRecordEquipCode": "EAM-2025021000000001",
				"soEquipmentItemRecordEquipName": "设备名称",
				"itemId": "1746877239489986568",
				"itemId_code": "3232000009",
				"itemId_name": "物料名称",
				"unit": "1746877273849724955",
				"unit_name": "单位",
				"unit_precision": "2",
				"qty": 10,
				"taxPrice": 2.55,
				"taxAmount": 25.5,
				"taxRateArchive": "1769066535189741582",
				"taxRateArchiveCode": "VATZR",
				"taxRateArchiveName": "0%增值税税率",
				"taxRate": 0,
				"saleCumQty": 0,
				"lendCumQty": 0
			}
		],
		"soReportList": [
			{
				"id": "1819510917491326986",
				"pubts": "2025-11-28 09:58:46",
				"startReportDate": "2025-11-28 09:58:46",
				"endReportDate": "2025-11-28 09:58:46",
				"reportType": "leakCheckOver",
				"reportTypeName": "验漏完成",
				"reporter": "1819510908901392404",
				"reporterName": "汇报人",
				"reportTime": "2025-11-28 10:06:20",
				"workingHours": 12,
				"log": "135.763234565334",
				"lot": "34.768866543335",
				"regionId": "c11981d1-5cf3-11e9-817e-7cd30abea0c0",
				"regionId_name": "上海/上海市/奉贤区",
				"address": "上海上海市奉贤区",
				"memo": "描述",
				"soReportList_fileList": "c970e925-2c31-47c5-a2e1-28c482b02f42"
			}
		],
		"soServiceStandardList": [
			{
				"id": "1746877248079921172",
				"pubts": "2025-11-28 10:23:33",
				"soId": "2361154517350744074",
				"soCode": "SWO20250917188898",
				"standardServiceId": "1746877256669855753",
				"standardServiceId_name": "服务标准",
				"standardServiceId_equOperationStatus": "1",
				"standardServiceId_operatorId": "equal",
				"standardServiceId_valueStd": "2",
				"standardServiceId_valueMax": "1000",
				"standardServiceId_valueMin": "1",
				"factValue": "600",
				"isSatisfied": "1"
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
999	服务端逻辑异常	服务端逻辑异常

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

