---
title: "车间任务分派v1"
apiId: "2164680825985040384"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Task Assignment"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Task Assignment]
platform_version: "BIP"
source_type: community-api-docs
---

# 车间任务分派v1

>  请求方式	POST | Task Assignment (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/procedureplan/dispatch/v1
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	单据数据
id	string	否	否	工序作业计划ID，和工序作业计划编码必输其一，都输入以id为准 示例：2659605521945344
code	string	否	否	工序作业计划编码；和工序作业计划id必输其一，都输入以id为准 示例：SFOP202202224104
ProcPlanDispatchList	object	是	是	派工信息

## 3. 请求示例

Url: /yonbip/mfg/procedureplan/dispatch/v1?access_token=访问令牌
Body: {
	"data": {
		"id": "2659605521945344",
		"code": "SFOP202202224104",
		"ProcPlanDispatchList": [
			{
				"deviceId": [
					{
						"id": "1958606807208192",
						"code": "0000001"
					}
				],
				"teamId": {
					"id": "1958606807208192",
					"code": "0000002"
				},
				"staffId": [
					{
						"id": "1958606807208192",
						"code": "0000003"
					}
				],
				"dispatchNum": 5
			}
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
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据，属性值为空时，不返回
orgId	string	否	工厂ID 示例：2594376494961401
orgName	string	否	工厂 示例：工厂1
productionDepartmentId	string	否	部门ID 示例：2594376494961402
productionDepartmentName	string	否	生产部门 示例：部门1
workCenterId	long	否	工作中心ID 示例：2594376494961403
workCenterName	string	否	工作中心 示例：加工中心1
orderId	long	否	生产订单ID 示例：2594376494961404
orderCode	string	否	生产订单号 示例：SCDD20220412000001
orderProductId	long	否	生产订单产品ID 示例：2594376494961405
orderLineNo	long	否	生产订单行号 示例：10
orderProcessId	long	否	生产订单工序id 示例：2558947501478148
vouchdate	string	否	单据日期 示例：2022-01-01
code	string	否	车间任务编号 示例：SFOP2022031400009
name	string	否	名称 示例：工序作业计划
barCode	string	否	单据条码 示例：sfc_procPlan|2687389252866304
preSn	long	否	前序顺序号 示例：10
nextSn	long	否	后序顺序号 示例：30
transTypeId	string	否	交易类型ID 示例：2687389252866304
transTypeName	string	否	交易类型 示例：标准生产
productId	long	否	物料ID 示例：2687389252866301
productCode	string	否	物料编码 示例：0045000001
productName	string	否	物料名称 示例：AA
isExpiryDateCalculationMethod	long	否	有效期推算方式 示例：0
isExpiryDateManage	boolean	否	是否效期管理 示例：false
batchNo	string	否	批次号 示例：1001
producedate	string	否	生产日期 示例：2022-08-12 00:00:00
expireDateNo	long	否	保质期 示例：10
expireDateUnit	long	否	保质期单位：1-年；2-月；6-天 示例：1
invaliddate	string	否	有效期至 示例：2032-08-11 00:00:00
sn	long	否	工序顺序号 示例：10
operationId	long	否	标准工序ID 示例：2687389252866302
operationCode	string	否	工序编码 示例：BBB
operationName	string	否	工序名称 示例：轧钢
operationControlId	long	否	工序控制码ID 示例：2687389252866305
operationControlName	string	否	工序控制码 示例：质量检验
costCenterId	long	否	成本中心ID 示例：2687389252866306
costCenterName	string	否	成本中心 示例：成本中心
deviceId	string	否	设备ID 示例：2687389252866307
deviceIdEquipName	string	否	设备 示例：机床
teamId	string	否	班组ID 示例：2561359238287616
teamName	string	否	班组 示例：班组owen
staffId	string	否	员工ID 示例：2687389252866308
staffName	string	否	员工 示例：张三
scheduleProdNum	float	否	计划加工数量 示例：0
scheduleOutputNum	float	否	预计产出数量 示例：0
mainUnitId	long	否	主计量单位ID 示例：2687389252866310
mainUnitIdName	string	否	主计量单位 示例：米
mainUnitIdPrecision	long	否	主计量单位精度 示例：2
scheduleProdNum1	float	否	计划加工件数 示例：0
scheduleOutputNum1	float	否	预计产出件数 示例：0
productionUnitId	long	否	生产单位id 示例：2687389252866311
productionUnitIdName	string	否	生产单位 示例：千米
productionUnitIdPrecision	long	否	生产单位精度 示例：4
productionUnitIdTruncationType	long	否	生产单位入位方式 示例：1
scheduleProdNum2	float	否	计划加工数量(产出) 示例：0
scheduleOutputNum2	float	否	预计产出数量(产出) 示例：0
outUnitId	long	否	产出单位id 示例：2687389252866313
outUnitIdName	string	否	产出单位 示例：厘米
outUnitIdPrecision	long	否	产出单位精度 示例：2
outUnitIdTruncationType	long	否	产出单位入位方式 示例：1
mainChangeRate	long	否	生产-主计量转换率 示例：0
outChangeRate	long	否	产出-主计量转换率 示例：0
scheduleStartTime	string	否	计划开工时间 示例：2022-01-01 00:00:00
scheduleEndTime	string	否	计划完工时间 示例：2022-02-01 00:00:00
processMode	long	否	加工组织模式：1-任务；2-流转卡 示例：1
processType	long	否	加工类型：0-正常加工；1-返工加工；2-报废补投 示例：0
status	long	否	状态：0-开立；1-已审核；32-已开工；33-已完工 示例：0
dispatchStatus	long	否	派工状态：0-未派工；1-已派工 示例：0
remark	string	否	描述 示例：描述信息
isHold	long	否	挂起 示例：1
isPublish	long	否	发布 示例：1
isReportPoint	long	否	报告点 示例：0
isAutohandover	long	否	自动交接 示例：0
firstCheck	string	否	工序首检：0-否；1-是 示例：0
firstCheckType	string	否	首检控制方式：0-不控制；1-严格 示例：0
firstCheckStatus	string	否	首检状态：0-无需首检；1-待首检；2-首检中；3-首检合格；4-首检不合格
isMonitorPoint	long	否	质检点 示例：0
isManualCreated	long	否	手工创建 示例：0
isApply	long	否	请购 示例：0
isExemptCheck	long	否	自检 示例：0
checkType	long	否	质检方式：0-自检；1-车间检验；2-质量检验 示例：0
orderStatus	long	否	生产订单状态：0-开立；1-已审核；2-已关闭；3-审核中；4：已锁定；5-已开工 示例：0
orderIsClose	long	否	生产订单关闭 示例：0
schedulePrepareTime	long	否	计划准备工时 示例：90
scheduleProcessTime	long	否	计划准备工时 示例：80
timeUnit	long	否	时间单位：0-天；1-小时；2-分；3-秒 示例：1
exeOrgId	string	否	执行组织ID 示例：2687389252866304
exeOrgName	string	否	执行组织 示例：组织1
isOutsource	long	否	委外 示例：0
preId	long	否	前工序ID 示例：2687389252866304
preOperationName	string	否	前工序 示例：打磨
nextId	long	否	后工序ID 示例：2687389252866304
nextOperationName	string	否	后工序 示例：机加工
isByReport	long	否	按任务汇报交接 示例：1
id	long	否	ID 示例：2687389252866304
pubts	string	否	时间戳 示例：2022-01-01 00:00:00
creatorName	string	否	创建人 示例：张三
createTime	string	否	创建时间 示例：2022-01-01 00:00:00
modifierName	string	否	修改人 示例：张三
modifyTime	string	否	修改时间 示例：2022-01-01 00:00:00
materialId	long	否	制造物料ID 示例：15024748484592
dataSource	long	否	数据来源 示例：1
ProcPlanUserDefine	object	否	工序作业计划固定自定义项
ProcPlanDefine	object	否	工序作业计划自定义项

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orgId": "2594376494961401",
		"orgName": "工厂1",
		"productionDepartmentId": "2594376494961402",
		"productionDepartmentName": "部门1",
		"workCenterId": 2594376494961403,
		"workCenterName": "加工中心1",
		"orderId": 2594376494961404,
		"orderCode": "SCDD20220412000001",
		"orderProductId": 2594376494961405,
		"orderLineNo": 10,
		"orderProcessId": 2558947501478148,
		"vouchdate": "2022-01-01",
		"code": "SFOP2022031400009",
		"name": "工序作业计划",
		"barCode": "sfc_procPlan|2687389252866304",
		"preSn": 10,
		"nextSn": 30,
		"transTypeId": "2687389252866304",
		"transTypeName": "标准生产",
		"productId": 2687389252866301,
		"productCode": "0045000001",
		"productName": "AA",
		"isExpiryDateCalculationMethod": 0,
		"isExpiryDateManage": false,
		"batchNo": "1001",
		"producedate": "2022-08-12 00:00:00",
		"expireDateNo": 10,
		"expireDateUnit": 1,
		"invaliddate": "2032-08-11 00:00:00",
		"sn": 10,
		"operationId": 2687389252866302,
		"operationCode": "BBB",
		"operationName": "轧钢",
		"operationControlId": 2687389252866305,
		"operationControlName": "质量检验",
		"costCenterId": 2687389252866306,
		"costCenterName": "成本中心",
		"deviceId": "2687389252866307",
		"deviceIdEquipName": "机床",
		"teamId": "2561359238287616",
		"teamName": "班组owen",
		"staffId": "2687389252866308",
		"staffName": "张三",
		"scheduleProdNum": 0,
		"scheduleOutputNum": 0,
		"mainUnitId": 2687389252866310,
		"mainUnitIdName": "米",
		"mainUnitIdPrecision": 2,
		"scheduleProdNum1": 0,
		"scheduleOutputNum1": 0,
		"productionUnitId": 2687389252866311,
		"productionUnitIdName": "千米",
		"productionUnitIdPrecision": 4,
		"productionUnitIdTruncationType": 1,
		"scheduleProdNum2": 0,
		"scheduleOutputNum2": 0,
		"outUnitId": 2687389252866313,
		"outUnitIdName": "厘米",
		"outUnitIdPrecision": 2,
		"outUnitIdTruncationType": 1,
		"mainChangeRate": 0,
		"outChangeRate": 0,
		"scheduleStartTime": "2022-01-01 00:00:00",
		"scheduleEndTime": "2022-02-01 00:00:00",
		"processMode": 1,
		"processType": 0,
		"status": 0,
		"dispatchStatus": 0,
		"remark": "描述信息",
		"isHold": 1,
		"isPublish": 1,
		"isReportPoint": 0,
		"isAutohandover": 0,
		"firstCheck": "0",
		"firstCheckType": "0",
		"firstCheckStatus": "",
		"isMonitorPoint": 0,
		"isManualCreated": 0,
		"isApply": 0,
		"isExemptCheck": 0,
		"checkType": 0,
		"orderStatus": 0,
		"orderIsClose": 0,
		"schedulePrepareTime": 90,
		"scheduleProcessTime": 80,
		"timeUnit": 1,
		"exeOrgId": "2687389252866304",
		"exeOrgName": "组织1",
		"isOutsource": 0,
		"preId": 2687389252866304,
		"preOperationName": "打磨",
		"nextId": 2687389252866304,
		"nextOperationName": "机加工",
		"isByReport": 1,
		"id": 2687389252866304,
		"pubts": "2022-01-01 00:00:00",
		"creatorName": "张三",
		"createTime": "2022-01-01 00:00:00",
		"modifierName": "张三",
		"modifyTime": "2022-01-01 00:00:00",
		"materialId": 15024748484592,
		"dataSource": 1,
		"ProcPlanUserDefine": {
			"define1": ""
		},
		"ProcPlanDefine": {
			"define1": ""
		}
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
	1	2025-06-26	
新增
返回参数 firstCheckType
新增
返回参数 firstCheckStatus
更新
返回参数 firstCheck

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

