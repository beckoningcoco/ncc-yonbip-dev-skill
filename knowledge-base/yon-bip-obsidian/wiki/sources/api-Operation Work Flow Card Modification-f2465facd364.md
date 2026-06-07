---
title: "工序流转卡修改"
apiId: "f2465facd364463ba5a952256f765069"
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

# 工序流转卡修改

>  请求方式	POST | Operation Work Flow Card (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/procflowcard/update
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
data	object	否	是	查询结果
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	是	流转卡单据id 示例：2681803919200512
vouchdate	Date	否	否	单据日期 示例：2022-03-10
transTypeId	long	否	否	交易类型id 示例：2509267692016896
transTypeIdCode	string	否	否	交易类型编码 示例：CC01
processNum	number
小数位数:2,最大长度:28	否	否	加工数量 示例：10
auxiliaryQty	number
小数位数:2,最大长度:28	否	否	加工件数 示例：10
remarks	string	否	否	备注 示例：remarka
attDefines	object	否	否	自由自定义项
defines	object	否	否	固定自定义项
processFlowCardPlan	object	是	否	流转卡工序

## 3. 请求示例

Url: /yonbip/mfg/procflowcard/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2681803919200512,
		"vouchdate": "2022-03-10",
		"transTypeId": 2509267692016896,
		"transTypeIdCode": "CC01",
		"processNum": 10,
		"auxiliaryQty": 10,
		"remarks": "remarka",
		"attDefines": {
			"define1": "自由1"
		},
		"defines": {
			"define1": "固定1"
		},
		"processFlowCardPlan": [
			{
				"operationControlId": 2550467569832448,
				"operationControlIdCode": "002",
				"operationControlIdName": "Amy中心",
				"workCenterId": 2550552316875264,
				"workCenterIdCode": "C0001",
				"workCenterIdName": "车间管理-机加工",
				"deviceId": 25505523168751232,
				"deviceIdEquipCode": "设备1",
				"shiftId": 2269239442662752264,
				"shiftIdCode": "BC01",
				"teamId": 1518056835191930887,
				"teamIdCode": "0026",
				"staffId": 45505523168751232,
				"staffIdCode": "00211",
				"scheduleStartTime": "2022-03-10 00:00:00",
				"scheduleEndTime": "2022-03-10 23:59:59",
				"id": 2325311204081232,
				"goodsId": 1763101847761977447,
				"goodsIdCode": "AA1",
				"warehouseId": 1763101847761977447,
				"warehouseIdCode": "AAA",
				"attDefines": {
					"define1": "自由1"
				},
				"defines": {
					"define1": "固定1"
				},
				"processFlowCardPlanOutput": [
					{
						"quantity": 123,
						"auxiliaryQuantity": 123,
						"id": 2325311204086533,
						"attDefines": {
							"define1": "自由1"
						},
						"defines": {
							"define1": "固定1"
						}
					}
				],
				"isOutsource": 1,
				"vendorId": 2325311204086533,
				"vendorIdCode": "WWSH007",
				"vendorIdName": "委外商户007",
				"firstCheck": 0,
				"firstCheckType": 0
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
code	string	否	接口返回状态 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	数据回执
orgIdName	string	否	工厂名称 示例：ZZY-01
orderId	long	否	订单ID 示例：1581171577178816519
orgId	string	否	工厂ID 示例：1530895076566237188
prodUnitId	long	否	生产单位 示例：1567202694264258570
prodUnitIdName	string	否	生产单位名称 示例：升
productIdCode	string	否	生产单位编码 示例：000034
isClose	long	否	是否关闭-枚举：1-是，0-否 示例：0
batchNo	string	否	生产批次号 示例：PCH-DDT
orderLineNo	long	否	订单行号 示例：10
planStartTime	string	否	计划开始时间 示例：2022-10-19 00:00:00
productId	long	否	物料ID 示例：1567202994911969282
isHold	long	否	是否挂起-枚举：1-是，0-否 示例：0
orderProductId	long	否	生产订单产品ID 示例：1581171577178816520
prodUnitIdPrecision	long	否	生产单位精度 示例：2
productionDepartmentIdName	string	否	部门名称 示例：生产部
orderCode	string	否	订单编码 示例：SCDD20221101000001
planEndTime	string	否	计划结束时间 示例：2022-10-31 00:00:00
productIdName	string	否	物料名称 示例：物料-批次-多单位
productionDepartmentId	string	否	部门ID 示例：1530895110912344073
processNum	long	否	加工数量 示例：100
status	long	否	状态 示例：0
vouchdate	string	否	业务日期 示例：2022-11-03 00:00:00
transTypeId	string	否	交易类型ID 示例：1524159064608083048
transTypeIdName	string	否	交易类型名称 示例：标准生产
processType	long	否	加工类型 示例：0
dataSource	long	否	数据来源-枚举：1-审核，2-手工，3-API 示例：3
id	long	否	主键ID 示例：1582776030931189764
code	string	否	编码 示例：SFOC20221103000005
cardType	int	否	卡类型-枚举：0-正常加工，1-首序到底拆卡，2-中间序到底拆卡，3-报废补卡，4-返工补卡，5-指定序拆卡 示例：4
barCode	string	否	单据条码 示例：sfc_processFlowCardDetail|1582776030931189764
sepTransTypeCodes	string	是	拆卡交易类型 示例：["CC01","CC03","2022030307","报废补卡test"]
sepTransTypeIdName	string	否	拆卡交易类型名称 示例：标准生产
sepInfoList	string	是	拆卡信息
sepDate	string	否	拆卡日期 示例：2022-04-25 10:19:55
supDate	string	否	补卡日期 示例：2022-04-25 10:19:55
supplyNum	long	否	可补数量 示例：0
sepTransTypeId	string	否	拆卡交易类型id 示例：2509267692016896
pubts	string	否	时间戳 示例：2022-11-03 15:09:42
processFlowCardPlan	object	是	流转卡工序

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orgIdName": "ZZY-01",
		"orderId": 1581171577178816519,
		"orgId": "1530895076566237188",
		"prodUnitId": 1567202694264258570,
		"prodUnitIdName": "升",
		"productIdCode": "000034",
		"isClose": 0,
		"batchNo": "PCH-DDT",
		"orderLineNo": 10,
		"planStartTime": "2022-10-19 00:00:00",
		"productId": 1567202994911969282,
		"isHold": 0,
		"orderProductId": 1581171577178816520,
		"prodUnitIdPrecision": 2,
		"productionDepartmentIdName": "生产部",
		"orderCode": "SCDD20221101000001",
		"planEndTime": "2022-10-31 00:00:00",
		"productIdName": "物料-批次-多单位",
		"productionDepartmentId": "1530895110912344073",
		"processNum": 100,
		"status": 0,
		"vouchdate": "2022-11-03 00:00:00",
		"transTypeId": "1524159064608083048",
		"transTypeIdName": "标准生产",
		"processType": 0,
		"dataSource": 3,
		"id": 1582776030931189764,
		"code": "SFOC20221103000005",
		"cardType": 4,
		"barCode": "sfc_processFlowCardDetail|1582776030931189764",
		"sepTransTypeCodes": [
			"CC01",
			"CC03",
			"2022030307",
			"报废补卡test"
		],
		"sepTransTypeIdName": "标准生产",
		"sepInfoList": [
			""
		],
		"sepDate": "2022-04-25 10:19:55",
		"supDate": "2022-04-25 10:19:55",
		"supplyNum": 0,
		"sepTransTypeId": "2509267692016896",
		"pubts": "2022-11-03 15:09:42",
		"processFlowCardPlan": [
			{
				"productionUnitIdName": "升",
				"operationControlId": 1524159657302556674,
				"exeOrgId": "1530895076566237188",
				"outUnitIdName": "升",
				"scheduleProdNum": 100,
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
				"productionUnitIdPrecision": 2,
				"nextIdOperationName": "工序-B塑形",
				"preIdOperationName": "工序-A塑形",
				"productionUnitIdTruncationType": 4,
				"isHold": 0,
				"scheduleProcessTime": 0,
				"isMonitorPoint": 0,
				"isAutohandover": 0,
				"orderProcessId": 1581171577178816522,
				"nextIdOperation": 1571474863892725764,
				"preIdOperation": 1571474863892725764,
				"processMode": 2,
				"mainChangeRate": 10,
				"status": 0,
				"processFlowCardPlanOutput": [
					{
						"auxiliaryQuantity": 10,
						"productionUnitIdName": "升",
						"outQuantity": 100,
						"outUnitIdName": "升",
						"totalCompleteNum": 0,
						"processSn": 10,
						"mainUnitPrecision": 2,
						"outUnitId": 1567202694264258570,
						"mainUnit": 1567202668494454792,
						"productionUnitIdPrecision": 2,
						"productId": 1567202994911969282,
						"mainUnitName": "千克",
						"productIdName": "物料-批次-多单位",
						"outChangeRate": 3,
						"productionType": 0,
						"outUnitIdTruncationType": 4,
						"productModelDescription": "制造无规格",
						"changeRate": 10,
						"productIdCode": "000034",
						"quantity": 100,
						"outUnitIdPrecision": 2,
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
				"orderStatus": 1,
				"outUnitIdTruncationType": 4,
				"operationIdName": "工序-A熔炼",
				"operationControlIdCode": "CNJGBJYBBG",
				"scheduleStartTime": "2022-10-19 00:00:00",
				"isCheckConfirm": 0,
				"nextSn": 20,
				"operationIdCode": "ZZY-A",
				"isExemptCheck": 0,
				"operationId": 1571474863892725762,
				"exeOrgIdName": "ZZY-01",
				"processType": 0,
				"sn": 10,
				"orderIsClose": 0,
				"workCenterIdCode": "(*^_^*)",
				"isReportPoint": 1,
				"timeUnit": 1,
				"isClose": 0,
				"outUnitIdPrecision": 2,
				"totalCompleteNum1": 0,
				"mainUnitIdName": "千克",
				"totalCompleteNum2": 0,
				"mainUnitIdPrecision": 2,
				"isOutsource": 0,
				"productionUnitId": 1567202694264258570,
				"workCenterIdName": "工作中心",
				"id": 1582776030931189765,
				"processFlowCardId": 1582776030931189764,
				"lineno": 10,
				"pubts": "2022-11-03 15:09:41",
				"warehouseId": 1582776030931189764,
				"warehouseName": "产品仓库",
				"goodsId": 1582776030931189764,
				"goodsName": "货架1",
				"warehouseIsGoodsPosition": true,
				"vendorId": 1582776030931189764,
				"vendorIdCode": "WWSH007",
				"vendorIdName": "委外商户007",
				"firstCheck": "0",
				"firstCheckType": "0",
				"firstCheckStatus": "0"
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
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-02-23	
更新
请求说明
新增
请求参数 processNum
新增
请求参数 auxiliaryQty
	2	2025-06-26	
更新
请求说明
新增
请求参数 (4)
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

