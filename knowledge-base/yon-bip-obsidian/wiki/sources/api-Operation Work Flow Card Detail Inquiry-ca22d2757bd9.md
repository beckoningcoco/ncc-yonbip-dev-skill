---
title: "工序流转卡详情查询"
apiId: "ca22d2757bd943e5a1f358bc15195b87"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Operation Work Flow Card"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Work Flow Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序流转卡详情查询

>  请求方式	GET | Operation Work Flow Card (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/procflowcard/detail
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	单据id    示例: 2659323078382080
code	string	query	否	单据编码    示例: SFOC202202228006

## 3. 请求示例

Url: /yonbip/mfg/procflowcard/detail?access_token=访问令牌&id=2659323078382080&code=SFOC202202228006

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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
transTypeIdName	string	否	交易类型名称 示例：标准生产
orgIdName	string	否	工厂名称 示例：Amy测试
orderId	long	否	生产订单id 示例：2667538625139456
modifierId	long	否	修改人id 示例：1958606807208192
prodUnitId	long	否	生产单位id 示例：2008299568156928
modifyTime	string	否	修改时间 示例：2022-04-20 14:02:44
transTypeId	string	否	交易类型id 示例：2509267692016896
id	long	否	主键id 示例：2681803919200512
productId	long	否	物料id 示例：2306801263808768
planStartTime	DateTime	否	计划开始时间 示例：2022-03-10 00:00:00
splitNum	int	否	拆分数量 示例：1
modifierIdName	string	否	修改人名称 示例：YonSuite默认用户
subTransTypeCodes	string	是	补卡交易类型 示例：["CC03","报废补卡test"]
sepTransTypeCodes	string	是	拆卡交易类型 示例：["CC01","CC03","2022030307","报废补卡test"]
isHold	int	否	是否挂起-枚举：1-是，0-否 示例：0
creatorIdName	string	否	创建人名称 示例：17600591290
orderProductId	long	否	生产订单产品id 示例：2667538625139457
splitBatchNum	int	否	拆分批量 示例：7
productionDepartmentIdName	string	否	生产部门 示例：Amy测试部门
cardType	int	否	卡类型-枚举：0-正常加工，1-首序到底拆卡，2-中间序到底拆卡，3-报废补卡，4-返工补卡，5-指定序拆卡 示例：4
barCode	string	否	单据条码 示例：sfc_processFlowCardList|2679080282411264
productIdName	string	否	物料名称 示例：有工艺
sepDate	string	否	拆卡时间 示例：2022-04-20 14:58:50
supplyNum	int	否	可补数量 示例：0
processNum	int	否	加工数量 示例：1
status	int	否	单据状态-枚举：0-开立，1-已审核，32-已开工，33-已完工 示例：0
orderCode	string	否	生产订单编码 示例：SCDD20220228000001
supDate	string	否	补卡时间 示例：2022-04-20 14:58:50
code	string	否	单据编码 示例：SFOC2022031006005
creatorId	long	否	创建人id 示例：2035345314517248
orgId	string	否	组织id 示例：2036615013323008
prodUnitIdName	string	否	生产单位名称 示例：台
vouchdate	string	否	单据日期 示例：2022-03-10 00:00:00
processType	int	否	加工类型-枚举：0-正常加工，1-返工加工，2-报废补投 示例：0
pubts	string	否	时间戳 示例：2022-04-20 14:02:43
productIdCode	string	否	物料编码 示例：1035000034
billTypeId	string	否	单据类型id 示例：2509266349577472
isClose	int	否	是否关闭-枚举：1-是，0-否 示例：0
sepTransTypeId	string	否	拆卡交易类型id 示例：2509267692016896
sepTransTypeIdName	string	否	拆卡交易类型名称 示例：标准生产
prodUnitIdPrecision	int	否	生产单位精度 示例：3
sepInfoList	string	是	拆卡信息
createTime	string	否	创建时间 示例：2022-03-10 11:52:01
orderLineNo	int	否	订单产品行号 示例：10
planEndTime	string	否	计划结束时间 示例：2022-03-10 23:59:59
productionDepartmentId	string	否	生产部门id 示例：2036621953847552
processFlowCardPlan	object	是	工序列表
processFlowCardDefine	object	否	工序流转卡自由自定义项
processFlowCardUserDefine	object	否	工序流转卡固定自定义项
projectId	long	否	项目Id 示例：2681803919200512
projectCode	string	否	项目编码 示例：projectcode
projectName	string	否	项目名称 示例：项目
wbs	long	否	wbs任务Id 示例：2681803919200512
wbsCode	string	否	wbs任务编码 示例：wbscode
wbsName	string	否	wbs任务名称 示例：任务
activity	long	否	活动Id 示例：2681803919200512
activityCode	string	否	活动编码 示例：activityCode
activityName	string	否	活动名称 示例：活动

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"transTypeIdName": "标准生产",
		"orgIdName": "Amy测试",
		"orderId": 2667538625139456,
		"modifierId": 1958606807208192,
		"prodUnitId": 2008299568156928,
		"modifyTime": "2022-04-20 14:02:44",
		"transTypeId": "2509267692016896",
		"id": 2681803919200512,
		"productId": 2306801263808768,
		"planStartTime": "2022-03-10 00:00:00",
		"splitNum": 1,
		"modifierIdName": "YonSuite默认用户",
		"subTransTypeCodes": [
			"CC03",
			"报废补卡test"
		],
		"sepTransTypeCodes": [
			"CC01",
			"CC03",
			"2022030307",
			"报废补卡test"
		],
		"isHold": 0,
		"creatorIdName": "17600591290",
		"orderProductId": 2667538625139457,
		"splitBatchNum": 7,
		"productionDepartmentIdName": "Amy测试部门",
		"cardType": 4,
		"barCode": "sfc_processFlowCardList|2679080282411264",
		"productIdName": "有工艺",
		"sepDate": "2022-04-20 14:58:50",
		"supplyNum": 0,
		"processNum": 1,
		"status": 0,
		"orderCode": "SCDD20220228000001",
		"supDate": "2022-04-20 14:58:50",
		"code": "SFOC2022031006005",
		"creatorId": 2035345314517248,
		"orgId": "2036615013323008",
		"prodUnitIdName": "台",
		"vouchdate": "2022-03-10 00:00:00",
		"processType": 0,
		"pubts": "2022-04-20 14:02:43",
		"productIdCode": "1035000034",
		"billTypeId": "2509266349577472",
		"isClose": 0,
		"sepTransTypeId": "2509267692016896",
		"sepTransTypeIdName": "标准生产",
		"prodUnitIdPrecision": 3,
		"sepInfoList": [
			""
		],
		"createTime": "2022-03-10 11:52:01",
		"orderLineNo": 10,
		"planEndTime": "2022-03-10 23:59:59",
		"productionDepartmentId": "2036621953847552",
		"processFlowCardPlan": [
			{
				"operationControlId": 2550467569832448,
				"modifierId": 2035345314517248,
				"deviceId": 2551634625597696,
				"shiftId": "2267136815678881819",
				"shiftIdName": "班次A",
				"teamId": 1518056835191930887,
				"teamIdName": "KING",
				"staffId": 1516019354244743169,
				"staffIdName": "king",
				"scheduleProdNum": 1,
				"nextId": 2667538625139465,
				"processFlowCardId": 2681803919200512,
				"isConfirm": 0,
				"uncompleteUserId": 2035345314517248,
				"id": 2681803924508928,
				"scheduleProdNum2": 26,
				"mainUnitId": 2008299568156928,
				"scheduleProdNum1": 26,
				"scheduleEndTime": "2022-03-10 23:59:59",
				"productId": 2306801263808768,
				"totalReworkNum": 0,
				"orderProductId": 2667538625139457,
				"isAutohandover": 1,
				"orderProcessId": 2667538625139464,
				"totalQualifiedTurnNum1": 0,
				"actualEndTime": "2022-02-28 23:59:00",
				"totalQualifiedTurnNum2": 0,
				"unauditDate": "2022-04-20 00:00:00",
				"status": 0,
				"schedulePrepareTime": 0.3,
				"totalQualifiedNum2": 0,
				"totalQualifiedNum1": 0,
				"operationIdName": "工序1234",
				"isCheckConfirm": 0,
				"vouchdate": "2022-03-08 00:00:00",
				"operationId": 2306798032425216,
				"operationIdCode": "210618001",
				"operationControlIdCode": "002",
				"sn": 10,
				"processType": 0,
				"orderIsClose": 0,
				"pubts": "2022-04-20 14:02:43",
				"workCenterIdCode": "C0001",
				"unauditTime": "2022-04-20 14:02:44",
				"unstartUserId": 2035345314517248,
				"isReportPoint": 1,
				"createDate": "2022-03-10 00:00:00",
				"isClose": 0,
				"isOutsource": 0,
				"productionUnitId": 2008299568156928,
				"totalTurnNum": 0,
				"totalTurnNum1": 0,
				"totalTurnNum2": 0,
				"productionUnitIdName": "台",
				"uncompleteTime": "2022-03-09 16:01:10",
				"exeOrgId": "2036615013323008",
				"outUnitIdName": "分米",
				"totalScrapNum": 0,
				"uncompleteDate": "2022-03-09 00:00:00",
				"unstartDate": "2022-03-10 00:00:00",
				"workCenterId": 2550552316875264,
				"isManualCreated": 0,
				"scheduleOutputNum2": 29,
				"scheduleOutputNum1": 26,
				"outUnitId": 2325311204086016,
				"checkType": 1,
				"scheduleOutputNum": 26,
				"productionUnitIdPrecision": 3,
				"isHold": 0,
				"isMonitorPoint": 0,
				"scheduleProcessTime": 52,
				"processMode": 2,
				"mainChangeRate": 1,
				"outChangeRate": 3,
				"orderStatus": 1,
				"totalQualifiedNum": 0,
				"scheduleStartTime": "2022-03-10 00:00:00",
				"nextSn": 20,
				"isExemptCheck": 0,
				"unauditorId": 1958606807208192,
				"timeUnit": 1,
				"totalReworkNum2": 0,
				"outUnitIdPrecision": 0,
				"totalCompleteNum1": 0,
				"totalReworkNum1": 0,
				"totalCompleteNum2": 0,
				"totalScrapNum2": 0,
				"totalScrapNum1": 0,
				"totalQualifiedTurnNum": 0,
				"workCenterIdName": "车间管理-机加工",
				"deviceIdEquipName": "表面处理设备1",
				"unstartTime": "2022-03-10 10:49:20",
				"processFlowCardPlanDefine": {
					"define1": ""
				},
				"processFlowCardPlanUserDefine": {
					"define1": ""
				},
				"processFlowCardPlanOutput": [
					{
						"productionType": 0,
						"productId": 2306801263808768,
						"productIdCode": "1035000034",
						"productIdName": "台式机",
						"quantity": 10,
						"mainUnit": 1234801263808768,
						"mainUnitName": "台",
						"mainUnitPrecision": 3,
						"auxiliaryQuantity": 2,
						"productionUnitId": 67348012632342,
						"productionUnitIdName": "个",
						"productionUnitIdPrecision": 0,
						"changeRate": 12,
						"orgId": "2036621953847552",
						"productionDate": "2022-03-09 00:00:00",
						"totalCompleteNum": 123,
						"totalCompleteNum1": 2,
						"totalCompleteNum2": 123,
						"totalTurninNum": 100,
						"totalTurninNum1": 100,
						"totalTurninNum2": 100,
						"totalTurnoutNum": 100,
						"totalTurnoutNum1": 100,
						"totalTurnoutNum2": 100,
						"totalTurnoutBackNum": 100,
						"totalTurnoutBackNum1": 100,
						"totalTurnoutBackNum2": 100,
						"totalTurnoutQualifiedNum": 100,
						"totalTurnoutQualifiedNum1": 100,
						"totalTurnoutQualifiedNum2": 100,
						"totalTurnoutScrapNum": 100,
						"totalTurnoutScrapNum1": 100,
						"totalTurnoutScrapNum2": 100,
						"totalTurnoutReworkNum": 100,
						"totalTurnoutReworkNum1": 100,
						"totalTurnoutReworkNum2": 100,
						"totalTurnoutReturnNum": 100,
						"totalTurnoutReturnNum1": 100,
						"totalTurnoutReturnNum2": 100,
						"totalReturnNum": 100,
						"totalReturnNum1": 100,
						"totalReturnNum2": 100,
						"totalExecNum": 100,
						"totalExecNum1": 100,
						"totalExecNum2": 100,
						"totalQualifiedNum": 100,
						"totalQualifiedNum1": 100,
						"totalQualifiedNum2": 100,
						"totalScrapNum": 100,
						"totalScrapNum1": 100,
						"totalScrapNum2": 100,
						"totalReworkNum": 100,
						"totalReworkNum1": 100,
						"totalReworkNum2": 100,
						"totalReworkProcessNum": 100,
						"totalReworkProcessNum1": 100,
						"totalReworkProcessNum2": 100,
						"totalTurnNum": 100,
						"totalTurnNum1": 100,
						"totalTurnNum2": 100,
						"totalQualifiedTurnNum": 100,
						"totalQualifiedTurnNum1": 100,
						"totalQualifiedTurnNum2": 100,
						"totalReworkTurnNum": 100,
						"totalReworkTurnNum1": 100,
						"totalReworkTurnNum2": 100,
						"scrapInNum": 100,
						"scrapInNum1": 100,
						"scrapInNum2": 100,
						"qualifiedInNum": 100,
						"qualifiedInNum1": 100,
						"qualifiedInNum2": 100,
						"totalTurnoutDispatchNum": 100,
						"totalTurnoutDispatchNum1": 100,
						"totalTurnoutDispatchNum2": 100,
						"isReportConfirm": 1,
						"reportConfirmUserId": 4577621953847553,
						"id": 2036621953847552,
						"pubts": "2022-03-10 11:52:01"
					}
				],
				"warehouseId": 1665216751349006336,
				"warehouseIsGoodsPosition": true,
				"warehouseName": "AAAA",
				"goodsId": 1665216751349006336,
				"goodsName": "A1",
				"vendorId": 1665216751349006367,
				"vendorIdName": "委外商户A",
				"osmApplicationQty": 0,
				"osmApplicationQty1": 0,
				"osmApplicationQty2": 0,
				"osmOrderQty": 0,
				"osmOrderQty1": 0,
				"osmOrderQty2": 0,
				"osmReleasedQty": 0,
				"osmReleasedQty1": 0,
				"osmReleasedQty2": 0,
				"firstCheck": "0",
				"firstCheckType": "0",
				"firstCheckStatus": "0",
				"opSequenceId": 2492686773999632400,
				"opSequenceType": 0,
				"opSequenceNum": 0
			}
		],
		"processFlowCardDefine": {
			"define1": ""
		},
		"processFlowCardUserDefine": {
			"define1": ""
		},
		"projectId": 2681803919200512,
		"projectCode": "projectcode",
		"projectName": "项目",
		"wbs": 2681803919200512,
		"wbsCode": "wbscode",
		"wbsName": "任务",
		"activity": 2681803919200512,
		"activityCode": "activityCode",
		"activityName": "活动"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

