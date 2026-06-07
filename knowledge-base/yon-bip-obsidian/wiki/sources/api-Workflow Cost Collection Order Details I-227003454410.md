---
title: "流程成本收集订单详情查询"
apiId: "2270034544100376577"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "MO"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, MO]
platform_version: "BIP"
source_type: community-api-docs
---

# 流程成本收集订单详情查询

>  请求方式	GET | MO (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/productionorder/costCollect/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	成本收集订单ID    默认值: 2184924571914496

## 3. 请求示例

Url: /yonbip/mfg/productionorder/costCollect/detail?access_token=访问令牌&id=

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
code	string	否	返回码，成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：2
code	string	否	code 示例：CBSJ2025052700000002
billSource	string	否	billSource 示例：0
creatorId	number
小数位数:0,最大长度:19	否	creatorId 示例：1525641755939569667
remark	string	否	remark 示例：1
orgId	string	否	orgId 示例：1525652227072458756
vouchdate	string	否	vouchdate 示例：2025-05-27 00:00:00
transTypeId	string	否	transTypeId 示例：2267993060241047552
id	number
小数位数:0,最大长度:19	否	id 示例：2277444264628584452
transTypeName	string	否	transTypeName 示例：标准生产
orderProduct	object	是	orderProduct
pubts	string	否	pubts 示例：2025-06-06 11:02:17
auditDate	string	否	auditDate 示例：2025-06-06 00:00:00
defineDts	object	否	defineDts
departmentName	string	否	departmentName 示例：1110914aa2
creator	string	否	creator 示例：u8c_vip管理员
orgName	string	否	orgName 示例：收入中台演示销售组织1
isWfControlled	boolean	否	isWfControlled 示例：false
auditor	string	否	auditor 示例：13837252486
docSource	string	否	docSource 示例：0
auditTime	string	否	auditTime 示例：2025-06-06 11:02:16
createTime	string	否	createTime 示例：2025-05-27 15:03:27
productionDepartmentId	string	否	productionDepartmentId 示例：2088230631449296898
transTypeCode	string	否	transTypeCode 示例：CCO-001
status	number
小数位数:0,最大长度:10	否	status 示例：1
defineDts__id	string	否	defineDts__id 示例：2277444264628584455
masterOrgKeyField	string	否	masterOrgKeyField 示例：orgId
transTypeKeyField	string	否	transTypeKeyField 示例：transTypeId
_mddFormulaExecuteFlag	string	否	_mddFormulaExecuteFlag 示例：true

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"returncount": 0,
		"verifystate": 2,
		"code": "CBSJ2025052700000002",
		"billSource": "0",
		"creatorId": 1525641755939569667,
		"remark": "1",
		"orgId": "1525652227072458756",
		"vouchdate": "2025-05-27 00:00:00",
		"transTypeId": "2267993060241047552",
		"id": 2277444264628584452,
		"transTypeName": "标准生产",
		"orderProduct": [
			{
				"auxiliaryQuantity": 1,
				"financeStatus": 0,
				"orderId": 2277444264628584452,
				"mtoStrategy": 0,
				"productUnitPrecision": 8,
				"mainUnitTruncationType": 4,
				"originStockUnitPrecision": 8,
				"productName": "关键子件=是",
				"scrap": 0,
				"lineNo": 10,
				"mainUnitPrecision": 8,
				"id": 2277444264628584453,
				"pubts": "2025-05-27 15:03:28",
				"mainUnit": 1529342892468862979,
				"quantity": 1,
				"productId": 2020620252730621956,
				"productUnitTruncationType": 4,
				"productionUnitId": 1529342892468862979,
				"mainUnitName": "米",
				"batchRule": 0,
				"propCharacteristics": {
					"ytenant": "0000L6YQ8AVLFUZPXD0000",
					"id": "2272389397366702082"
				},
				"productCode": "0000000000312406jcz--",
				"freeCharacteristics": {
					"ytenant": "0000L6YQ8AVLFUZPXD0000",
					"id": "2277444264628584454",
					"pubts": "2025-05-27 15:03:28"
				},
				"sourceType": "1",
				"productUnitName": "米",
				"productId_detail_stockUnit": 1529342892468862979,
				"finishDate": "2025-05-27 00:00:00",
				"startDate": "2025-05-27 00:00:00",
				"isOptionalMaterial": 0
			}
		],
		"pubts": "2025-06-06 11:02:17",
		"auditDate": "2025-06-06 00:00:00",
		"defineDts": {
			"ytenant": "0000L6YQ8AVLFUZPXD0000",
			"id": "2277444264628584455",
			"pubts": "2025-05-27 15:03:28"
		},
		"departmentName": "1110914aa2",
		"creator": "u8c_vip管理员",
		"orgName": "收入中台演示销售组织1",
		"isWfControlled": false,
		"auditor": "13837252486",
		"docSource": "0",
		"auditTime": "2025-06-06 11:02:16",
		"createTime": "2025-05-27 15:03:27",
		"productionDepartmentId": "2088230631449296898",
		"transTypeCode": "CCO-001",
		"status": 1,
		"defineDts__id": "2277444264628584455",
		"masterOrgKeyField": "orgId",
		"transTypeKeyField": "transTypeId",
		"_mddFormulaExecuteFlag": "true"
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
更新
返回参数 (20)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

