---
title: "主需求计划列表查询"
apiId: "2123863003109523463"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Primary Demand Plan Workbench"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Primary Demand Plan Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 主需求计划列表查询

>  请求方式	POST | Primary Demand Plan Workbench (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/MFC/mdsPlanWorkbench/list
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
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 默认值:1 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页行数 默认值:10 示例：10 默认值：10
reqOrgId	string	否	否	需求组织ID
productId	string	否	否	物料ID
reqDate	string	否	否	需求日期，（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
vouchDate	string	否	否	单据日期，（区间，格式2021-03-02|2021-03-02 23:59:59） 示例：2021-03-02|2021-03-02 23:59:59
simple	object	否	否	simple
reqOrgId.code	string	否	否	需求组织编码。当需求组织id和需求组织编码同时填写时,取交集
productId.code	string	否	否	物料编码。当物料id和物料编码同时填写时,取交集
customerId	string	否	否	客户ID
customerId.code	string	否	否	客户编码。当客户id和客户编码同时填写时,取交集
firstSourceCode	string	否	否	源头单据号
firstSourceLine	number
小数位数:0,最大长度:10	否	否	源头单据行号
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名(条件)
op	string	否	否	比较符(条件eq：相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or
conditions	object	是	否	下级查询条件

## 3. 请求示例

Url: /yonbip/MFC/mdsPlanWorkbench/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"reqOrgId": "",
	"productId": "",
	"reqDate": "2021-03-02|2021-03-02 23:59:59",
	"vouchDate": "2021-03-02|2021-03-02 23:59:59",
	"simple": {
		"reqOrgId.code": "",
		"productId.code": "",
		"customerId": "",
		"customerId.code": "",
		"firstSourceCode": "",
		"firstSourceLine": 0
	},
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": "",
			"logicOp": "",
			"conditions": [
				{
					"field": "",
					"op": "",
					"value1": "",
					"value2": ""
				}
			]
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
code	string	否	返回码，成功时返回200 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	是	调用成功时的返回数据
pageIndex	number
小数位数:0,最大长度:10	否	当前页 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页大小 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录总数 示例：20
recordList	object	是	返回数据对象
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1000
beginPageIndex	number
小数位数:0,最大长度:10	否	开始页码 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页码 示例：3

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"pageIndex": 1,
			"pageSize": 20,
			"recordCount": 20,
			"recordList": [
				{
					"id": "2282466430110138614",
					"pubts": "2025-08-04 10:33:08",
					"isWfControlled": 0,
					"verifystate": 2,
					"runStatus": "2",
					"orgId": "1890903916826591237",
					"orgName": "MMM",
					"sourceType": "10",
					"code": "YCD20250530000001",
					"transTypeName": "计划独立需求",
					"status": 1,
					"vouchDate": "2025-04-22 00:00:00",
					"reqOrgName": "MMM",
					"customerName": "客户",
					"transTypeId": "1890117173311439018",
					"transTypeExtend": "\"{\\\"businessType\\\":\\\"0\\\"}\"",
					"reqOrgId": "1890117173311439018",
					"customerId": "1890117173311439019",
					"reqDepartmentId": "1890117173311439020",
					"reqDepartmentName": "需求部门",
					"reqWarehouseId": "1890117173311439021",
					"reqWarehouseName": "需求仓库",
					"productId": "1890117173311439022",
					"productCode": "MMM",
					"productName": "物料名称",
					"planMethod": 0,
					"planProperty": "3",
					"projectId": "1890117173311439023",
					"projectIdCode": "MM",
					"projectIdName": "项目名称",
					"wbs": "1890117173311439024",
					"wbsCode": "mm",
					"wbsName": "WBS任务名称",
					"activity": "1890117173311439025",
					"activityCode": "mmm",
					"activityName": "活动名称",
					"reserveid": "1890117173311439026",
					"reserveDemandTypeId": "1890117173311439027",
					"reserveDemandTypeCode": "mmm",
					"reserveDemandType": "2",
					"reserveName": "跟踪线索",
					"unitId": "1890117173311439028",
					"unitPrecision": 4,
					"mainUnitId": "1890117173311439029",
					"mainUnitPrecision": "4",
					"mainReqQty": 200,
					"remainMainReqQty": 200,
					"coverQty": 201,
					"mainUnitName": "千克",
					"reqQty": 202,
					"remainReqQty": 203,
					"reversalQty": 204,
					"unitName": "千克",
					"changeRate": 1,
					"specialReqType": "75",
					"entrustedType": "2",
					"bomId": "1890117173311439030",
					"reqDate": "2025-06-16 00:00:00",
					"priority": 95,
					"bomVersionCode": "BOM",
					"substituteFlag": "1",
					"effectiveDate": "2025-06-16 00:00:00",
					"expiryDate": "2025-06-16 00:00:00",
					"quantityControl": 1,
					"fromQuantity": 205,
					"toQuantity": 206,
					"adjReqQty": 206,
					"adjRemainReqQty": 206,
					"adjMainReqQty": 207,
					"adjRemainMainReqQty": 208,
					"adjReqDate": "2025-06-16 00:00:00",
					"adjPriority": 95,
					"supplyOrgId": "1890117173311439031",
					"supplyOrgCode": "mmm01",
					"supplyOrgName": "供应组织",
					"vendorId": "1890117173311439032",
					"vendorCode": "mmm02",
					"vendorName": "供应商",
					"closeFlag": "1",
					"closer": "关闭人",
					"closeTime": "2025-06-16 00:00:00",
					"closeDate": "2025-06-16 00:00:00",
					"closeReasonId": "1890117173311439033",
					"closeReasonIdReason": "关闭原因",
					"closeRemark": "关闭说明",
					"remark": "备注",
					"firstSourceType": "1",
					"firstSourceCode": "YCD20250530000001",
					"firstSourceLine": "YCD20250530000002",
					"firstSourceId": "1890117173311439034",
					"firstSourceLineId": "1890117173311439035",
					"sourceCode": "YCD20250530000003",
					"sourceLine": "30",
					"sourceId": "1890117173311439036",
					"sourceLineId": "1890117173311439037",
					"collaborationSource": "productionorder.po_subcontract_order",
					"collaborationPocode": "YCD20250530000004",
					"collaborationPolineno": "20",
					"collaborationPoid": "1890117173311439038",
					"collaborationPodetailid": "10",
					"planParamId": "1890117173311439039",
					"planParamCode": "code001",
					"versionId": "1890117173311439040",
					"version": "1.0",
					"planClass": "1",
					"scheduleStatus": "1",
					"roughAbilityStatus": "0"
				}
			],
			"pageCount": 1000,
			"beginPageIndex": 1,
			"endPageIndex": 3
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

