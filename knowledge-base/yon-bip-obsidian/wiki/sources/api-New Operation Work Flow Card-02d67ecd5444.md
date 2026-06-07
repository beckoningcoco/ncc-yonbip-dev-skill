---
title: "工序流转卡新增"
apiId: "02d67ecd54444b4dbd89aa3c6780851c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Operation Work Flow Card"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Work Flow Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序流转卡新增

>  请求方式	POST | Operation Work Flow Card (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/procflowcard/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
orderId	long	否	否	订单id，订单id和订单code不能同时为空，同时存在时优先级id>code 示例：1467098628674813960
orderIdCode	string	否	否	订单编号(code)，订单id和订单code不能同时为空，同时存在时优先级id>code 示例：CCCC220531082045
orderProductId	long	否	是	生产订单行id

## 3. 请求示例

Url: /yonbip/mfg/procflowcard/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"orderId": 1467098628674813960,
		"orderIdCode": "CCCC220531082045",
		"orderProductId": 0
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
code	string	否	接口返回状态 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	是	数据回执
orderId	long	否	订单ID 示例：1581171577178816519
orderIsHold	string	否	生产订单挂起状态-枚举：1-是，0-否 示例：0
orgId	long	否	工厂ID 示例：1530895076566237188
prodUnitId	long	否	生产单位 示例：1567202694264258570
isCheckConfirm	string	否	检验确认-枚举：1-是，0-否 示例：0
isApply	string	否	请购-枚举：1-是，0-否 示例：0
isConfirm	string	否	汇报确认-枚举：1-是，0-否 示例：0
isExemptCheck	string	否	免检-枚举：1-是，0-否 示例：0
isManualCreated	string	否	手工创建-枚举：1-是，0-否 示例：1
orderIsClose	string	否	生产订单关闭状态-枚举：1-是，0-否 示例：0
sourceid	long	否	源头单据id 示例：1581171577178816519
isClose	long	否	是否关闭-枚举：1-是，0-否 示例：0
batchNo	string	否	生产批次号 示例：PCH-DDT
orderLineNo	long	否	订单行号 示例：10
planStartTime	string	否	计划开始时间 示例：2022-10-19 00:00:00
productId	long	否	物料ID 示例：1567202994911969282
isHold	long	否	是否挂起-枚举：1-是，0-否 示例：0
isMonitorPoint	string	否	质检点 示例：0
orderProductId	long	否	生产订单产品ID 示例：1581171577178816520
planEndTime	string	否	计划结束时间 示例：2022-10-31 00:00:00
productionDepartmentId	long	否	部门ID 示例：1530895110912344073
processMode	string	否	加工模式 示例：1
processNum	long	否	加工数量 示例：100
status	long	否	状态-枚举：0-开立，1-已审核，32-已开工，33-已完工 示例：0
vouchdate	string	否	业务日期 示例：2022-11-03 00:00:00
transTypeId	long	否	交易类型ID 示例：1524159064608083048
processType	long	否	加工类型-枚举，0-正常加工，1-返工加工，2-报废补投 示例：0
dataSource	long	否	数据来源-枚举：1-审核，2-手工，3-API 示例：3
id	long	否	主键ID 示例：1582776030931189764
code	string	否	编码 示例：SFOC20221103000005
cardType	int	否	卡类型-枚举：0-正常加工，1-首序到底拆卡，2-中间序到底拆卡，3-报废补卡，4-返工补卡，5-指定序拆卡 示例：4
barCode	string	否	单据条码 示例：sfc_processFlowCardDetail|1582776030931189764
pubts	string	否	时间戳 示例：2022-11-03 15:09:42
processFlowCardPlan	object	是	流转卡工序

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"orderId": 1581171577178816519,
			"orderIsHold": "0",
			"orgId": 1530895076566237188,
			"prodUnitId": 1567202694264258570,
			"isCheckConfirm": "0",
			"isApply": "0",
			"isConfirm": "0",
			"isExemptCheck": "0",
			"isManualCreated": "1",
			"orderIsClose": "0",
			"sourceid": 1581171577178816519,
			"isClose": 0,
			"batchNo": "PCH-DDT",
			"orderLineNo": 10,
			"planStartTime": "2022-10-19 00:00:00",
			"productId": 1567202994911969282,
			"isHold": 0,
			"isMonitorPoint": "0",
			"orderProductId": 1581171577178816520,
			"planEndTime": "2022-10-31 00:00:00",
			"productionDepartmentId": 1530895110912344073,
			"processMode": "1",
			"processNum": 100,
			"status": 0,
			"vouchdate": "2022-11-03 00:00:00",
			"transTypeId": 1524159064608083048,
			"processType": 0,
			"dataSource": 3,
			"id": 1582776030931189764,
			"code": "SFOC20221103000005",
			"cardType": 4,
			"barCode": "sfc_processFlowCardDetail|1582776030931189764",
			"pubts": "2022-11-03 15:09:42",
			"processFlowCardPlan": [
				{
					"operationControlId": 1524159657302556674,
					"exeOrgId": 1530895076566237188,
					"orderIsHold": 0,
					"scheduleProdNum": 100,
					"isApply": 0,
					"totalCompleteNum": 0,
					"nextId": 1581171577178816523,
					"isConfirm": 0,
					"workCenterId": 1530899337159639049,
					"isManualCreated": 0,
					"scheduleOutputNum2": 100,
					"scheduleProdNum2": 100,
					"scheduleOutputNum1": 10,
					"outUnitId": 1567202694264258570,
					"scheduleEndTime": "2022-10-31 23:59:00",
					"scheduleProdNum1": 10,
					"mainUnitId": 1567202668494454792,
					"checkType": 0,
					"scheduleOutputNum": 100,
					"isHold": 0,
					"scheduleProcessTime": 0,
					"isMonitorPoint": 0,
					"isAutohandover": 0,
					"orderProcessId": 1581171577178816522,
					"nextOperationId": 1571474863892725764,
					"processMode": 2,
					"mainChangeRate": 10,
					"status": 0,
					"processFlowCardPlanOutput": [
						{
							"auxiliaryQuantity": 10,
							"outQuantity": 100,
							"totalCompleteNum": 0,
							"processSn": 10,
							"mainUnitPrecision": 2,
							"outUnitId": 1567202694264258570,
							"mainUnit": 1567202668494454792,
							"productId": 1567202994911969282,
							"outChangeRate": 3,
							"productionType": 0,
							"changeRate": 10,
							"quantity": 100,
							"totalCompleteNum1": 0,
							"totalCompleteNum2": 0,
							"productionUnitId": 1567202694264258570,
							"lineno": 10,
							"planStartDate": "2022-10-19 00:00:00",
							"id": 1582776030931189766,
							"procFlowCardPlanId": 1582776030931189765,
							"pubts": "2022-11-03 15:09:41"
						}
					],
					"outChangeRate": 3,
					"schedulePrepareTime": 0,
					"orderStatus": 0,
					"scheduleStartTime": "2022-10-19 00:00:00",
					"isCheckConfirm": 0,
					"nextSn": 20,
					"isExemptCheck": 0,
					"operationId": 1571474863892725762,
					"processType": 0,
					"sn": 10,
					"orderIsClose": 0,
					"isReportPoint": 1,
					"timeUnit": 1,
					"sourceid": 1581171577178816519,
					"isClose": 0,
					"firstCheck": 0,
					"totalCompleteNum1": 0,
					"totalCompleteNum2": 0,
					"isOutsource": 0,
					"productionUnitId": 1567202694264258570,
					"id": 1582776030931189765,
					"processFlowCardId": 1582776030931189764,
					"lineno": 10,
					"pubts": "2022-11-03 15:09:41",
					"warehouseId": 1582776030931189764,
					"goodsId": 1582776030931189764,
					"vendorId": 1582776030931188745,
					"vendorIdName": "委外商户007"
				}
			]
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
	1	2026-03-17	
更新
请求说明
新增
返回参数 processFlowCardPlan!opSequenceId
新增
返回参数 processFlowCardPlan!opSequenceType
新增
返回参数 processFlowCardPlan!opSequenceNum
更新
返回参数 (8)
	2	2025-06-24	
新增
请求参数 (11)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

