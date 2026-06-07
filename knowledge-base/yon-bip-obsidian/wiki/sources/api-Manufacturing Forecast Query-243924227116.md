---
title: "计划独立需求列表查询"
apiId: "2439242271162368001"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planned Independent Demand"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planned Independent Demand]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划独立需求列表查询

>  请求方式	POST | Planned Independent Demand (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/MFC/api/salesForecast/list
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
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页行数 示例：10 默认值：10
vouchdate	string	否	否	单据日期，（区间，格式2026-01-01|2026-03-14 23:59:59） 示例：2026-01-01|2026-03-14 23:59:59
code	string	否	否	主表ID 示例：2438339486373904390
status	string	否	否	订单状态： 0-开立，1-已审核，2-已关闭，3-审核中 示例：0
orgId	string	否	否	工厂ID 示例：1866892446956781576
productId	string	否	否	物料ID 示例：2433262250900848700
productManageClass	string	否	否	物料分类ID
salesForecastDetailCustomerId	string	否	否	客户ID
transTypeId	string	否	否	交易类型ID
creatorId	string	否	否	创建人ID
simple	object	否	否	simple
code	string	否	否	需求编号
orgId.code	string	否	否	工厂编码。当工厂ID和工厂编码同时填写时,取交集 示例：MMM
salesForecastDetail.productId.code	string	否	否	物料编码。当物料ID和物料编码同时填写时,取交集 示例：00010705
salesForecastDetail.productId.manageClass.code	string	否	否	物料分类编码。当物料分类ID和物料分类编码同时填写时,取交集
salesForecastDetail.customerId.code	string	否	否	客户编码。当客户ID和客户编码同时填写时,取交集
transTypeId.code	string	否	否	交易类型编码。当交易类型D和交易类型编码同时填写时,取交集
creator	string	否	否	创建人名称。当创建人ID和创建人名称同时填写时,取交集 示例：张三
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名(条件)
op	string	否	否	比较符(条件eq：相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or
conditions	object	是	否	下级查询条件

## 3. 请求示例

Url: /yonbip/MFC/api/salesForecast/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"vouchdate": "2026-01-01|2026-03-14 23:59:59",
	"code": "2438339486373904390",
	"status": "0",
	"orgId": "1866892446956781576",
	"productId": "2433262250900848700",
	"productManageClass": "",
	"salesForecastDetailCustomerId": "",
	"transTypeId": "",
	"creatorId": "",
	"simple": {
		"code": "",
		"orgId.code": "MMM",
		"salesForecastDetail.productId.code": "00010705",
		"salesForecastDetail.productId.manageClass.code": "",
		"salesForecastDetail.customerId.code": "",
		"transTypeId.code": "",
		"creator": "张三"
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
					"pubts": "2026-01-01 10:33:08",
					"isWfControlled": 0,
					"verifystate": 2,
					"status": 1,
					"code": "YCD20250530000001",
					"orgId": "1890903916826591237",
					"orgCode": "",
					"orgName": "MMM",
					"transTypeId": "1890117173311439018",
					"transTypeCode": "",
					"transTypeName": "计划独立需求",
					"department": "",
					"departmentCode": "",
					"departmentName": "",
					"warehouseId": "",
					"warehouseName": "",
					"bizFlow": "",
					"isFlowCoreBill": "",
					"simulateFlag": "",
					"remark": "备注",
					"closer": "关闭人",
					"closeTime": "2026-01-01 10:33:08",
					"closeDate": "2026-01-01 00:00:00",
					"closeReasonId": "1890117173311439033",
					"closeReasonIdReason": "关闭原因",
					"closeRemark": "关闭说明",
					"creatorId": "1694848907561926662",
					"creator": "MMM",
					"createTime": "2026-01-01 10:33:08",
					"modifier": "MMM",
					"modifyTime": "2026-01-01 10:33:08",
					"auditor": "MMM",
					"auditTime": "2026-01-06 10:23:10",
					"auditDate": "2026-01-06 00:00:00",
					"salesForecastDetailId": "2388068036568416258",
					"detailpubts": "2026-01-06 10:23:10",
					"salesForecastDetailLineNo": "10",
					"isForecast": "1",
					"salesForecastDetailRequirementDate": "2026-10-23 00:00:00",
					"salesForecastDetailEffectiveDate": "2026-10-23 00:00:00",
					"salesForecastDetailProductId": "2388067839011454978",
					"salesForecastDetailProductCode": "XXXY",
					"salesForecastDetailMaterialName": "XXXY",
					"salesForecastDetailMaterialModel": "ABC",
					"businessAttributeSelfCreate": "1",
					"businessAttributeOutSourcing": "1",
					"businessAttributePurchase": "0",
					"optionalType": "",
					"productPropCharacterDefine": "",
					"freeCharacteristics": "",
					"optionFreeB": "",
					"variantConfCode": "",
					"variantConfigCtsId": "",
					"mainUom": "2388068036568416257",
					"unit_Precision": "2",
					"salesForecastDetailMaterialProductIdUnitName": "cm",
					"salesForecastDetailRequirementNumber": "100.00",
					"assistExchangeType": "1",
					"assistChangeRate": "1",
					"assistUnit": "1694851664941416464",
					"assistUnitPrecision": "2",
					"assistUnitName": "cm",
					"assistUnitCount": "100.00",
					"salesForecastDetailWarehouseId": "",
					"salesForecastDetailWarehouseName": "",
					"salesForecastDetailCustomerId": "",
					"salesForecastDetailCustomerIdCode": "",
					"salesForecastDetailCustomerIdName": "",
					"projectId": "",
					"projectIdCode": "",
					"projectIdName": "",
					"wbs": "",
					"wbsCode": "",
					"wbsName": "",
					"activity": "",
					"activityCode": "",
					"activityName": "",
					"reserveid": "",
					"reserveid_demandtype": "",
					"reserveid_name": "",
					"rootVouchId": "",
					"rootVouchRowId": "",
					"rootVouchType": "",
					"rootVouchCode": "",
					"sourceType": "",
					"sourceVouchCode": "",
					"salesForecastDetailRemark": "",
					"userDefineCharacterB": "",
					"linecloser": "",
					"linecloseDate": "",
					"linecloseTime": "",
					"linecloseReasonId": "",
					"linecloseReasonIdReason": "",
					"linecloseRemark": ""
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
	1	2025-07-16	
新增
返回参数 (4)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

