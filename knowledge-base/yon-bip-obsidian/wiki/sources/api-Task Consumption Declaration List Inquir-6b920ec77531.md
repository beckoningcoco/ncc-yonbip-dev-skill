---
title: "作业耗用申报列表查询"
apiId: "6b920ec775314d97bc65175227ae8ea7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Resource consumption declaration"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Resource consumption declaration]
platform_version: "BIP"
source_type: community-api-docs
---

# 作业耗用申报列表查询

>  请求方式	POST | Resource consumption declaration (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/activityreport/list
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
pageIndex	int	否	是	页号 默认值:1 示例：1 默认值：1
pageSize	int	否	是	每页行数 默认值:10 示例：10 默认值：10
code	string	否	否	编码 示例：RCR2022080304003
orgId	long	是	否	工厂组织id，id与编码同时存在时编码参数不生效 示例：[2036615013323008]
orgCode	string	是	否	工厂编码，id与编码同时存在时编码参数不生效
workCenterId	long	是	否	工作中心id，id与编码同时存在时编码参数不生效 示例：[2550552785523200]
workCenterCode	string	是	否	工作中心编码，id与编码同时存在时编码参数不生效
orderId	long	是	否	生产订单id，id与编码同时存在时编码参数不生效 示例：[2729053814723072]
orderCode	string	是	否	生产订单编码，id与编码同时存在时编码参数不生效
productionDepartmentId	long	是	否	部门id，id与编码同时存在时编码参数不生效 示例：[1996610113835264]
productionDepartmentCode	string	是	否	部门编码，id与编码同时存在时编码参数不生效
productId	long	是	否	物料id，id与编码同时存在时编码参数不生效 示例：[2037661323661568]
productCode	string	是	否	物料编码，id与编码同时存在时编码参数不生效
activityId	long	是	否	资源类型id，id与编码同时存在时编码参数不生效 示例：[2499380942344960]
activityCode	string	是	否	资源类型编码，id与编码同时存在时编码参数不生效
vouchdate	string	否	否	汇报日期，日期区间查询起始、截止时间使用"|"分隔，如果只传入一个时间，则不可使用"|"结束，并默认为只传入起始时间。具体写法可见示例 示例：2022-04-18|2022-04-30
status	short	是	否	单据状态，0：开立；1：已审核；3：审核中 示例：[0,1]
activityType	int	是	否	耗用类别，0：正常加工，1：返工加工，2：报废加工 示例：[0,1]
transTypeId	string	是	否	交易类型，id与编码同时存在时编码参数不生效 示例：[1420990582716628992]
transTypeCode	string	是	否	交易类型编码，id与编码同时存在时编码参数不生效
simple	object	否	否	时间戳
open_pubts_begin	string	否	否	时间戳开始 示例：2022-04-01 00:00:00
open_pubts_end	string	否	否	时间戳结束 示例：2022-08-19 00:00:00

## 3. 请求示例

Url: /yonbip/mfg/activityreport/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "RCR2022080304003",
	"orgId": [
		2036615013323008
	],
	"orgCode": [
		""
	],
	"workCenterId": [
		2550552785523200
	],
	"workCenterCode": [
		""
	],
	"orderId": [
		2729053814723072
	],
	"orderCode": [
		""
	],
	"productionDepartmentId": [
		1996610113835264
	],
	"productionDepartmentCode": [
		""
	],
	"productId": [
		2037661323661568
	],
	"productCode": [
		""
	],
	"activityId": [
		2499380942344960
	],
	"activityCode": [
		""
	],
	"vouchdate": "2022-04-18|2022-04-30",
	"status": [
		0,
		1
	],
	"activityType": [
		0,
		1
	],
	"transTypeId": [
		1420990582716628992
	],
	"transTypeCode": [
		""
	],
	"simple": {
		"open_pubts_begin": "2022-04-01 00:00:00",
		"open_pubts_end": "2022-08-19 00:00:00"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
pageIndex	long	否	当前页 示例：1
pageSize	long	否	页大小 示例：10
recordCount	long	否	记录总数 示例：10185
recordList	object	是	返回数据对象
pageCount	long	否	总页数 示例：10185
beginPageIndex	long	否	开始页码 示例：2
endPageIndex	long	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 10185,
		"recordList": [
			{
				"orgId": "1904546773012736",
				"orgIdName": "Amy测试用",
				"transTypeId": "2178132107219200",
				"transTypeName": "Amy测试-完工报告",
				"code": "WGBG20210319000008",
				"id": 2178132809814272,
				"vouchdate": "2021-03-19 00:00:00",
				"workCenterId": 2550552316875264,
				"workCenterIdrName": "test工作中心",
				"orderId": 2744546611680000,
				"orderIdCode": "02204230014039",
				"orderProductId": 2744546611696384,
				"orderProductIdLineNo": 10,
				"operatorId": "1996565965623556",
				"operatorName": "张三",
				"writeOffEnable": 0,
				"productionDepartmentId": "1996565965623552",
				"productionDepartmentCode": "Sylvia001",
				"departmentName": "Amy测试-生产部门",
				"status": 0,
				"isWfControlled": false,
				"productIdCode": "1035000001",
				"writeOffStatus": 0,
				"productIdName": "台式机",
				"memo": "备注",
				"materialId": 1999723662594304,
				"productId": 1999723642097920,
				"quantity": 20.5,
				"activityReportUserdefItem_id": 0,
				"writeOffSourceid": 0,
				"activityReportUserdefItem_define1": "",
				"activityReportExtItem_id": 0,
				"activityReportExtItem_define1": "",
				"direction": 0,
				"activityReportDetail_lineno": 30.5,
				"activityReportDetail_opSn": "10",
				"writeOffUpcode": "",
				"writeOffReason": "",
				"activityReportDetail_orderActivityId": 2739700483101699,
				"activityReportDetail_orderActivityIdLineNum": 10,
				"activityReportDetail_activityId": 2721598014411008,
				"activityReportDetail_activityTypeName": "资源类型-批次",
				"activityReportDetail_activityClass": 0,
				"activityReportDetail_planUsageQty": 10000000,
				"activityReportDetail_actualUsageQty": 10000000,
				"activityReportDetail_usageUnit": 1964431847330048,
				"activityReportDetail_usageUnitname": "个",
				"activityReportDetail_activityType": 0,
				"activityReportDetail_orderProcessId": 1456877628677947394,
				"activityReportDetail_orderProcessIdSn": 10,
				"activityReportDetail_costCenterId": 13226576598689003,
				"activityReportDetail_costCenterCode": "CB056628",
				"activityReportDetail_costCenterName": "成本中心名称",
				"activityReportDetail_supplyVirtualAccbodyId": 49009543877034,
				"activityReportDetail_supplyVirtualAccbodyCode": "LR99909",
				"activityReportDetail_supplyVirtualAccbodyName": "供方利润中心名称",
				"postAccountStatus": 99,
				"postAccountVersion": 0,
				"activityReportDetail_snOperationName": "标准工序-锻造",
				"activityReportDetail_activityReportId": 2744612501066496,
				"activityReportDetail_source": "sfc_proceTaskReport",
				"activityReportDetail_upcode": "2733208229827328",
				"activityReportDetail_sourceLinenum": "10",
				"sourceType": "1",
				"activityReportDetail_writeOffSourceautoid": "",
				"activityReportDetail_writeOffSourceid": "",
				"activityReportDetail_writeOffUpcode": "",
				"activityReportDetail_writeOffUplineno": "",
				"fiEventAccountingDate": ""
			}
		],
		"pageCount": 10185,
		"beginPageIndex": 2,
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
999	不同的错误类型返回不同的错误信息	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-02	
更新
请求说明
更新
请求参数 activityId
更新
请求参数 activityCode
更新
返回参数 (6)
	2	2025-06-25	
新增
返回参数 (10)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

