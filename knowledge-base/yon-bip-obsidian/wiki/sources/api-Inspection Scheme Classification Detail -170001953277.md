---
title: "检验方案分类详情查询"
apiId: "1700019532777127941"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Inspection Scheme Category"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Scheme Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验方案分类详情查询

>  请求方式	GET | Inspection Scheme Category (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/inspectionplanclass/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	检验方案分类详情ID：和检验方案分类编码不可同时为空，都有值的话取ID值    示例: 1684401708861489162
code	string	query	否	检验方案分类编码：和检验方案分类详情ID不可同时为空，都有值的话取ID值    示例: CODE20230320
orgId	string	query	否	使用组织ID：非单组织时，和使用组织编码不可同时为空，都有值得话取ID值    示例: 1437879802912047112
orgCode	string	query	否	使用组织编码：非单组织时，和使用组织ID不可同时为空，都有值得话取ID值    示例: hm2

## 3. 请求示例

Url: /yonbip/imcs/inspectionplanclass/detail?access_token=访问令牌&id=1684401708861489162&code=CODE20230320&orgId=1437879802912047112&orgCode=hm2

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
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
code	string	否	返回码，成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
code	string	否	检验方案分类编码 示例：CODE20230320
inspectionPlanClassId	string	否	检验方案分类ID 示例：1684401708861489161
qualityinSpectionCenterName	string	否	管理组织名称 示例：hm2
note	string	否	备注 示例：这是个备注~
id	long	否	检验方案分类详情ID 示例：1684401708861489162
pubts	string	否	时间戳 示例：2023-03-20 15:55:53
applyOrgId	string	否	使用组织ID 示例：1437879802912047112
qualityinSpectionCenter	string	否	管理组织ID 示例：1437879802912047112
applyOrgName	string	否	使用组织名称 示例：hm2
applyRangeListId	long	否	适用范围ID 示例：1684401708861489163
name	string	否	检验方案分类名称 示例：测试OPENAPI
createDate	string	否	创建日期 示例：2022-12-27 00:00:00
creatorIdName	string	否	创建人名称 示例：昵称-lj
inspectionPlanClassId_applyRangeList	object	是	适用范围数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "CODE20230320",
		"inspectionPlanClassId": "1684401708861489161",
		"qualityinSpectionCenterName": "hm2",
		"note": "这是个备注~",
		"id": 1684401708861489162,
		"pubts": "2023-03-20 15:55:53",
		"applyOrgId": "1437879802912047112",
		"qualityinSpectionCenter": "1437879802912047112",
		"applyOrgName": "hm2",
		"applyRangeListId": 1684401708861489163,
		"name": "测试OPENAPI",
		"createDate": "2022-12-27 00:00:00",
		"creatorIdName": "昵称-lj",
		"inspectionPlanClassId_applyRangeList": [
			{
				"orgName": "hm2",
				"inspectionPlanClassId": "1684401708861489161",
				"orgCode": "hm2",
				"id": 1684401708861489163,
				"orgId": "1437879802912047112"
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
999	参数错误	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (9)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

