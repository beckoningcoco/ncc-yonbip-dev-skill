---
title: "工时汇报列表查询"
apiId: "1936215684355719175"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Working Hrs Report"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Working Hrs Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 工时汇报列表查询

>  请求方式	POST | Working Hrs Report (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/workhoursmaintain/list
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
page	object	否	是	分布信息
pageIndex	int	否	否	页号 默认值:1 示例：1 默认值：1
pageSize	int	否	否	每页行数 默认值:10 示例：20 默认值：20
status	int	否	否	单据状态，枚举，0：开立；1：已审核； 示例：1
orgId	long	否	否	工厂id，工厂id和工厂code不能同时为空，同时存在时优先级id>code 示例：2036615013323008
orgCode	string	否	否	工厂code，工厂id和工厂code不能同时为空，同时存在时优先级id>code 示例：amy
workCenter	object	是	否	工作中心，工作中心id和code同时存在时优先级id>code
id	long	否	否	工作中心id，工作中心id和code同时存在时优先级id>code 示例：2550552785523200
code	string	否	否	工作中心code，工作中心id和code同时存在时优先级id>code 示例：C0002
orderId	object	是	否	生产订单，生产订单使用code查询时需输入lineNo，生产订单id和code+lineNo同时存在时，优先级id>code+lineNo
id	long	否	否	生产订单行id，优先级id>code+lineNo 示例：2673433672601857
code	string	否	否	生产订单号，进行code查询时lineNo必输，优先级id>code+lineNo 示例：SCDD20220304004003
lineNo	int	否	否	生产订单行号，进行code查询时lineNo必输，优先级id>code+lineNo 示例：10
productDeptId	object	是	否	生产部门，生产部门id和code同时存在时，优先级id>code
id	long	否	否	生产部门id，生产部门id和code同时存在时，优先级id>code 示例：2568672969658624
code	string	否	否	生产部门code，生产部门id和code同时存在时，优先级id>code 示例：57657
vouchdate	object	否	否	业务日期，支持格式yyyy-MM-dd | yyyy-MM-dd HH:mm:ss
start	DateTime	否	否	业务开始日期 示例：2022-01-01
end	DateTime	否	否	业务结束日期 示例：2022-01-01
materialId	object	是	否	产品制造物料，制造物料id和code同时存在时，优先级id>code
id	long	否	否	产品制造物料id，制造物料id和code同时存在时，优先级id>code 示例：2037661323661568
code	string	否	否	产品制造物料code，制造物料id和code同时存在时，优先级id>code 示例：1035000001
productId	object	是	否	产品物料，物料id和code同时存在时，优先级id>code
id	long	否	否	产品物料id，物料id和code同时存在时，优先级id>code 示例：2037661323661568
code	string	否	否	产品物料code，物料id和code同时存在时，优先级id>code 示例：1035000001
simple	object	否	否	扩展参数
open_pubts_begin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳，开始时间 示例：2022-01-01 00:00:00
open_pubts_end	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳，结束时间 示例：2022-01-01 10:00:00
operationId	object	是	否	标准工序
id	number
小数位数:0,最大长度:19	否	否	标准工序id，标准工序id存在时以id为准 示例：2552909818614528
code	string	否	否	标准工序code，标准工序id存在时以id为准 示例：O01
sourceDocCode	string	否	否	来源单据号 示例：SFTR20250327000005
deviceId	object	是	否	设备
id	number
小数位数:0,最大长度:19	否	否	设备id，设备id和code同时存在时，优先级id>code 示例：2235019660126846998
code	string	否	否	设备code，设备id和code同时存在时，优先级id>code 示例：D001
shiftId	object	是	否	班次
id	number
小数位数:0,最大长度:19	否	否	班次id，班次id和code同时存在时，优先级id>code 示例：2266925383028834312
code	string	否	否	班次code，班次id和code同时存在时，优先级id>code 示例：BC01
teamId	object	是	否	班组
id	number
小数位数:0,最大长度:19	否	否	班组id，班组id和code同时存在时，优先级id>code 示例：2235019660126846999
code	string	否	否	班组code，班组id和code同时存在时，优先级id>code 示例：B01
staffId	object	是	否	人员
id	number
小数位数:0,最大长度:19	否	否	人员id，人员id和code同时存在时，优先级id>code 示例：2235029607271104538
code	string	否	否	人员code，人员id和code同时存在时，优先级id>code 示例：S01
consumptionCategory	number
小数位数:0,最大长度:10	是	否	耗用类别，枚举，0：正常；1：报废； 示例：[0]
workCategory	number
小数位数:0,最大长度:10	是	否	工时类别，枚举，0：人工；1：设备；2：其他； 示例：[0]
simpleVOs	object	否	否	扩展查询条件
field	string	否	否	属性名（条件）
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or 示例：and
conditions	object	否	否	下级查询条件

## 3. 请求示例

Url: /yonbip/mfg/workhoursmaintain/list?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"status": 1,
	"orgId": 2036615013323008,
	"orgCode": "amy",
	"workCenter": [
		{
			"id": 2550552785523200,
			"code": "C0002"
		}
	],
	"orderId": [
		{
			"id": 2673433672601857,
			"code": "SCDD20220304004003",
			"lineNo": 10
		}
	],
	"productDeptId": [
		{
			"id": 2568672969658624,
			"code": "57657"
		}
	],
	"vouchdate": {
		"start": "2022-01-01",
		"end": "2022-01-01"
	},
	"materialId": [
		{
			"id": 2037661323661568,
			"code": "1035000001"
		}
	],
	"productId": [
		{
			"id": 2037661323661568,
			"code": "1035000001"
		}
	],
	"simple": {
		"open_pubts_begin": "2022-01-01 00:00:00",
		"open_pubts_end": "2022-01-01 10:00:00"
	},
	"operationId": [
		{
			"id": 2552909818614528,
			"code": "O01"
		}
	],
	"sourceDocCode": "SFTR20250327000005",
	"deviceId": [
		{
			"id": 2235019660126846998,
			"code": "D001"
		}
	],
	"shiftId": [
		{
			"id": 2266925383028834312,
			"code": "BC01"
		}
	],
	"teamId": [
		{
			"id": 2235019660126846999,
			"code": "B01"
		}
	],
	"staffId": [
		{
			"id": 2235029607271104538,
			"code": "S01"
		}
	],
	"consumptionCategory": [
		0
	],
	"workCategory": [
		0
	],
	"simpleVOs": {
		"field": "",
		"op": "",
		"value1": "",
		"value2": "",
		"logicOp": "and",
		"conditions": {
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
		}
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
code	string	否	返回状态code 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	data
pageIndex	long	否	当前页码 示例：1
pageSize	long	否	每页数据量 示例：20
recordCount	long	否	记录总数 示例：1
recordList	object	是	recordList
pageCount	long	否	页数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"orgIdName": "Amy测试",
				"snOperationName": "工序232",
				"modifier": "YonSuite默认用户",
				"modifierId": 1958606807208192,
				"productOrderId": 2673218452902400,
				"orderProcessId_operationId": 2306798355370240,
				"lineNo": 10,
				"modifyTime": "2022-04-20 17:33:36",
				"id": 2740176022868224,
				"productOrderAuditDate": "2022-03-04 00:00:00",
				"productOrderIdCode": "SCDD20220304002002",
				"consumptionCategory": 0,
				"productId": 2306801263808768,
				"modifyDate": "2022-04-20 00:00:00",
				"materialId": 2306801279652096,
				"workCenter": 2550552785523200,
				"auditorId": 1958606807208192,
				"orderProcessId": 2673218452902409,
				"auditTime": "2022-04-21 09:51:57",
				"productIdName": "有工艺",
				"planPrepareTime": 0.5,
				"status": 1,
				"workCategory": 1,
				"creatorId": 1958606807208192,
				"productDeptId": "2568672969658624",
				"actualProcessTime": 360,
				"orgId": "2036615013323008",
				"vouchdate": "2022-04-20 00:00:00",
				"productOrderLineId": 2673218452902401,
				"actualPrepareTime": 0.5,
				"sn": 20,
				"pubts": "2022-04-21 09:51:57",
				"workCenterName": "车间管理-表面处理",
				"productIdCode": "1035000034",
				"timeUnit": 1,
				"createDate": "2022-04-20 00:00:00",
				"auditDate": "2022-04-21 00:00:00",
				"creator": "YonSuite默认用户",
				"auditor": "YonSuite默认用户",
				"productDeptIdName": "MFG01",
				"orderProcessIdSn": 20,
				"createTime": "2022-04-20 17:31:11",
				"planProcessTime": 360,
				"attrDefines": {
					"id": 2740176022868224,
					"define1": "888888888888"
				},
				"defines": {
					"id": 2740176022868224,
					"define34": "88888888888888"
				},
				"detailId": 2237219069929455623,
				"detailLineNo": 10,
				"detailProductOrderId": 2237219868793372681,
				"detailProductOrderIdCode": "SCDD20220304002002",
				"detailProductOrderLineId": 2237220633297551362,
				"detailOrderLineNo": 10,
				"detailProductOrderAuditDate": "2025-04-20 17:31:11",
				"detailProductDeptId": 2237221913197805572,
				"detailProductDeptIdName": "制造部",
				"detailProductId": 2237222660491706372,
				"detailProductName": "物料1",
				"detailProductCode": "M001",
				"detailProductIdModelDescription": "说明1",
				"detailProductIdModel": "型号A",
				"detailOrderProcessId": 2237224936854781958,
				"detailOrderProcessIdSn": "10",
				"detailSnOperationName": "工序A",
				"detailWorkCenter": 2237226422883057665,
				"detailWorkCenterName": "工作中心A",
				"detailBatchNo": "P001",
				"detailConsumptionCategory": 0,
				"detailCostCenterId": 2237227591144570887,
				"detailCostCenterName": "成本中心A",
				"detailVirtualAccbodyId": 2237228192439992324,
				"detailVirtualAccbodyName": "利润中心A",
				"detailFinanceOrgId": 2237228896784220162,
				"detailFinanceOrgIdName": "会计主体A",
				"detailWorkCategory": 0,
				"detailTeamId": 2237229704238071814,
				"detailTeamIdName": "班组A",
				"detailTeamIdCode": "bza",
				"detailStaffId": 2237230434412920838,
				"detailStaffIdName": "人员A",
				"detailStaffIdCode": "S001",
				"detailDeviceId": 2237231198886690819,
				"detailDeviceIdName": "设备A",
				"detailDeviceIdCode": "D001",
				"detailActualPrepareTime": 10,
				"detailActualProcessTime": 10,
				"detailPlanProcessTime": 10,
				"detailPlanPrepareTime": 10,
				"detailTimeUnit": 1,
				"detailSourceDocType": "任务汇报",
				"detailSourceDocId": 2237234428702097409,
				"detailSourceDocLineId": 2237234755119611910,
				"detailSourceDocCode": "SFTR20241219000001",
				"detailProjectId": 2237235871811108864,
				"detailProjectCode": "P001",
				"detailProjectName": "项目1",
				"detailWBS": 2237237967755149312,
				"detailWBSCode": "W001",
				"detailWBSName": "WBS任务",
				"detailActivity": 2237249186240135176,
				"detailActivityCode": "A001",
				"detailActivityTaskName": "活动",
				"shiftId": 2266925383028834315,
				"shiftIdName": "班次1"
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
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
新增
请求参数 (14)
新增
返回参数 shiftId
新增
返回参数 shiftIdName
更新
返回参数 detailActivityTaskName

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

