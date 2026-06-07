---
title: "检验方案分类列表查询"
apiId: "1700019292258959360"
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

# 检验方案分类列表查询

>  请求方式	GET | Inspection Scheme Category (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/inspectionplanclass/queryTree
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
code	string	query	否	检验方案分类编码    示例: 008
name	string	query	否	检验方案分类名称    示例: 9023024034
applyOrgId	string	query	否	使用组织，传值为组织ID或组织编码皆可，单组织时不填，多组织必填，单组织租户下传值不生效，后台自动赋值为当前租户组织    示例: 1437879802912047112

## 3. 请求示例

Url: /yonbip/imcs/inspectionplanclass/queryTree?access_token=访问令牌&code=008&name=9023024034&applyOrgId=1437879802912047112

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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	是	data
id	string	否	检验方案分类ID 示例：1685175455796690952
inspectionPlanClassDetailId	long	否	检验方案分类详情ID 示例：1525769170527453188
code	string	否	检验方案分类编码 示例：CODE20230320
name	string	否	检验方案分类名称 示例：测试OPENAPI
qualityinSpectionCenter	string	否	管理组织ID 示例：1437879802912047112
qualityinSpectionCenterName	string	否	管理组织名称 示例：hm2
applyRangeListId	long	否	适用范围ID 示例：1684401708861489163
applyRangeListOrgId	string	否	使用组织ID 示例：1437879802912047112
applyRangeListOrgName	string	否	使用组织名称 示例：hm2
note	string	否	备注 示例：这是个备注
pubts	string	否	时间戳 示例：2023-03-21 14:30:43
creatorId	long	否	创建人ID 示例：1648819365096194000
creatorIdName	string	否	创建人 示例：李先生
createTime	string	否	创建时间 示例：2023-03-20 13:29:27
isApplied	boolean	否	使用组织是否已启用 示例：true
level	int	否	层级 示例：1
parent	string	否	上级分类id 示例：1731209215921356810
vclassify	string	否	上级分类 示例：0002
path	string	否	路径 示例：1456598318358462472|
applyRangeList_orgId	string	否	使用组织ID 示例：1437879802912047112

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "1685175455796690952",
			"inspectionPlanClassDetailId": 1525769170527453188,
			"code": "CODE20230320",
			"name": "测试OPENAPI",
			"qualityinSpectionCenter": "1437879802912047112",
			"qualityinSpectionCenterName": "hm2",
			"applyRangeListId": 1684401708861489163,
			"applyRangeListOrgId": "1437879802912047112",
			"applyRangeListOrgName": "hm2",
			"note": "这是个备注",
			"pubts": "2023-03-21 14:30:43",
			"creatorId": 1648819365096194000,
			"creatorIdName": "李先生",
			"createTime": "2023-03-20 13:29:27",
			"isApplied": true,
			"level": 1,
			"parent": "1731209215921356810",
			"vclassify": "0002",
			"path": "1456598318358462472|",
			"applyRangeList_orgId": "1437879802912047112"
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
999	取决于错误类型，以实际返回内容为准	

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

