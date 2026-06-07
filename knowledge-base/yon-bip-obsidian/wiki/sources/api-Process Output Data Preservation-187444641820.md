---
title: "工序产量数据保存"
apiId: "1874446418206261251"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Operation Output"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Output]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序产量数据保存

>  请求方式	POST | Operation Output (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/processoutput/save
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
data	object	否	是	业务数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	单据ID 示例：2573294878692352
_status	string	否	是	操作标识；Insert:新增，Update:更新 示例：Insert 默认值：Insert
orderProductId	long	否	否	生产订单产品行ID,和生产订单产品行号不能同时为空,生产订单产品行ID优先生效 示例：2573294878692352
lineNo	string	否	否	生产订单产品行号,和生产订单产品ID不能同时为空,生产订单产品行ID优先生效 示例：10
orderId	string	否	是	生产订单ID或者生产订单编码 示例：2573294878692352
orderProcessId	long	否	否	工序Id,和工序顺序号不能同时为空,工序Id优先生效 示例：324243242234324
orderProcessSn	string	否	否	工序顺序号,和工序Id不能同时为空,工序Id优先生效 示例：10
processType	string	否	否	工序业务类型:0-正常加工,1-返工生产,2-报废补投 示例：0
isOutsource	short	否	否	委外标志位，0-否，1-是，表示该工序是否委外加工。 示例：0
businessDate	string	否	否	业务日期 示例：2023-12-1
costCenterId	string	否	否	成本中心ID或者成本中心编码 示例：2573294878692352
workCenterId	string	否	否	工作中心ID或者工作中心编码 示例：2573294878692352
transferType	short	否	是	转移方式: 1.生产转入 2.生产转出 3.返工转入 4.返工转出 5.报废转出 6.产品完工 7.工序完工 示例：1
quantity	BigDecimal	否	是	数量 示例：1
mainUnitId	string	否	否	计量单位ID或者计量单位编码 示例：2573294878692352
quantityType	short	否	否	数量类型: 1.合格 2.返工 3.报废 示例：1
teamId	string	否	否	班组ID或者班组编码 示例：2573294878692352
userId	string	否	否	人员ID或者人员编码 示例：12343242342342
cOrgId	string	否	否	对方组织ID或者编码 示例：3213213
cOrderProcessId	long	否	否	对方工序Id,和对方工序顺序号不能同时为空,对方工序Id优先生效 示例：2573294878692352
cOrderProcessSn	string	否	否	对方工序顺序号,和对方工序Id不能同时为空,对方工序Id优先生效 示例：10
cWorkCenterId	string	否	否	对方工作中心ID或者编码 示例：2573294878692352
cProductionDepartmentId	string	否	否	对方生产部门ID或者编码 示例：2573294878692352
cCostCenterId	string	否	否	对方成本中心ID或者编码 示例：2573294878692352
cTeamId	string	否	否	对方班组ID或者编码 示例：2573294878692352
warehouseId	string	否	否	仓库ID或者编码 示例：2573294878692352
reason	string	否	否	原因ID或者原因 示例：2573294878692352
rOrgId	string	否	否	责任组织ID或者编码 示例：2573294878692352
rOrderProcessId	long	否	否	责任工序Id,和责任工序顺序号不能同时为空,责任工序Id优先生效 示例：2573294878692352
rOrderProcessSn	string	否	否	责任工序顺序号,和责任工序Id不能同时为空,责任工序Id优先生效 示例：10
rProductionDepartmentId	string	否	否	责任部门ID或者编码 示例：2573294878692352
rWorkCenterId	string	否	否	责任工作中心ID或者编码 示例：2573294878692352
rTeamId	string	否	否	责任班组ID或者编码 示例：2573294878692352
rUserId	string	否	否	责任人ID或者编码 示例：2573294878692352
out_sys_id	string	否	否	外部来源线索
out_sys_code	string	否	否	外部来源编码
out_sys_version	string	否	否	外部来源版本
out_sys_type	string	否	否	外部来源类型
sourceType	string	否	否	来源单据类型,1.工序作业计划;2.工序流转卡;3.车间任务汇报;4.在制交接单;5.完工报告;6.成品入库
sourceDocId	string	否	否	来源单据ID
sourceCode	string	否	否	来源单据号
sourceDetailId	string	否	否	来源单据行ID
sourceLineNo	string	否	否	来源单据行号
sourceOrderType	string	否	否	来源订单类型,1.生产订单;2.委外订单 示例：1
sourceOrderDocId	string	否	否	来源订单ID 示例：2042888661817098247
sourceOrderDetailId	string	否	否	来源订单行ID 示例：2042888661817098248
sourceOrderCode	string	否	否	来源订单号 示例：SCDD2024071500000007
sourceOrderLineNo	string	否	否	来源订单行号 示例：10

## 3. 请求示例

Url: /yonbip/mfg/processoutput/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2573294878692352,
		"_status": "Insert",
		"orderProductId": 2573294878692352,
		"lineNo": "10",
		"orderId": "2573294878692352",
		"orderProcessId": 324243242234324,
		"orderProcessSn": "10",
		"processType": "0",
		"isOutsource": 0,
		"businessDate": "2023-12-1",
		"costCenterId": "2573294878692352",
		"workCenterId": "2573294878692352",
		"transferType": 1,
		"quantity": 1,
		"mainUnitId": "2573294878692352",
		"quantityType": 1,
		"teamId": "2573294878692352",
		"userId": "12343242342342",
		"cOrgId": "3213213",
		"cOrderProcessId": 2573294878692352,
		"cOrderProcessSn": "10",
		"cWorkCenterId": "2573294878692352",
		"cProductionDepartmentId": "2573294878692352",
		"cCostCenterId": "2573294878692352",
		"cTeamId": "2573294878692352",
		"warehouseId": "2573294878692352",
		"reason": "2573294878692352",
		"rOrgId": "2573294878692352",
		"rOrderProcessId": 2573294878692352,
		"rOrderProcessSn": "10",
		"rProductionDepartmentId": "2573294878692352",
		"rWorkCenterId": "2573294878692352",
		"rTeamId": "2573294878692352",
		"rUserId": "2573294878692352",
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": "",
		"sourceType": "",
		"sourceDocId": "",
		"sourceCode": "",
		"sourceDetailId": "",
		"sourceLineNo": "",
		"sourceOrderType": "1",
		"sourceOrderDocId": "2042888661817098247",
		"sourceOrderDetailId": "2042888661817098248",
		"sourceOrderCode": "SCDD2024071500000007",
		"sourceOrderLineNo": "10"
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
code	string	否	code 示例：200
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
message	string	否	message 示例：操作成功
data	object	否	接口调用返回数据
sucessCount	long	否	成功数 示例：1
failCount	long	否	失败数 示例：0
count	long	否	记录总数 示例：1
messages	object	是	数据返回信息汇总
infos	object	是	返回详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": [
			{
				"rowNum": "1",
				"message": "操作成功"
			}
		],
		"infos": [
			{
				"code": 200,
				"rowNum": 1,
				"message": "操作成功",
				"data": {
					"id": 2573294878692352,
					"orgId": "2573294878692352",
					"orgName": "工厂1",
					"orderProductId": 2573294878692352,
					"orderId": 2573294878692352,
					"orderCode": "SCDD123213122313",
					"lineNo": "10",
					"productId": 2573294878692352,
					"productCode": "erwrw",
					"productName": "3242ewrwr",
					"orderProcessId": 324243242234324,
					"orderProcessSn": "20",
					"processType": "0",
					"isOutsource": 0,
					"isHeadSn": 0,
					"isEndSn": "0",
					"businessDate": "2023-12-1",
					"productionDepartmentId": "321311313",
					"productionDepartmentName": "生产部门",
					"costCenterCode": "12312",
					"costCenterId": "2573294878692352",
					"costCenterName": "成本中心",
					"workCenterName": "工作中心",
					"workCenterCode": "dfafa",
					"workCenterId": 2573294878692352,
					"transferType": 1,
					"quantity": 1,
					"mainUnitId": 2573294878692352,
					"quantityType": 1,
					"teamId": 2573294878692352,
					"teamName": "班组",
					"teamCode": "bz",
					"userId": "12343242342342",
					"userName": "人员1",
					"userCode": "ry",
					"cOrgId": "3213213",
					"cOrgName": "对方组织1",
					"cOrderProcessId": 2573294878692352,
					"cOrderProcessIdSn": "30",
					"cWorkCenterName": "对方工作中心1",
					"cWorkCenterCode": "code1122",
					"cWorkCenterId": 2573294878692352,
					"cProductionDepartmentId": "2573294878692352",
					"cProductionDepartmentName": "部门2",
					"cCostCenterCode": "ewrwr",
					"cCostCenterId": 2573294878692352,
					"cCostCenterName": "成本2",
					"cTeamId": 2573294878692352,
					"cTeamName": "班组2",
					"cTeamCode": "cdoe23232",
					"warehouseId": 2573294878692352,
					"warehouseName": "仓库223",
					"reason": "2573294878692352",
					"rOrgId": "2573294878692352",
					"rOrgName": "zr组织2",
					"rOrderProcessId": 2573294878692352,
					"rOrderProcessIdSn": "40",
					"rProductionDepartmentId": "2573294878692352",
					"rProductionDepartmentName": "责任部门2",
					"rWorkCenterName": "责任工作中心2",
					"rWorkCenterId": "2573294878692352",
					"rWorkCenterCode": "ddee",
					"rTeamId": 2573294878692352,
					"rTeamName": "责任班组\t2",
					"rTeamCode": "dfsdf",
					"rUserId": 2573294878692352,
					"reasonReason": "报废",
					"rUserName": "责任1号",
					"rUserCode": "zr001",
					"out_sys_id": "",
					"out_sys_code": "",
					"out_sys_version": "",
					"out_sys_type": "",
					"out_sys_rowno": "10",
					"out_sys_lineid": "2573294878692352",
					"sourceType": "",
					"sourceDocId": "",
					"sourceCode": "",
					"sourceDetailId": "",
					"HLineId": "10",
					"creatorId": "2573294878692352",
					"modifierId": "2573294878692352",
					"creator": "冯绍峰",
					"createTime": "2023-12-1 14:06:50",
					"modifyTime": "2023-12-1 14:06:57",
					"modifyDate": "2023-12-1",
					"pubts": "2023-12-1 14:06:57",
					"modifier": "对对对",
					"createDate": "2023-12-1",
					"sourceLineNo": "",
					"sourceOrderType": "1",
					"sourceOrderDocId": "2042888661817098247",
					"sourceOrderDetailId": "2042888661817098248",
					"sourceOrderCode": "SCDD2024071500000007",
					"sourceOrderLineNo": "10"
				}
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
	1	2025-06-24	
更新
返回参数 (8)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

