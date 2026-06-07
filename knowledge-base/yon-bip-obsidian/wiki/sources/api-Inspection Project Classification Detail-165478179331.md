---
title: "检验项目分类详情查询"
apiId: "1654781793315848200"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Inspection Charac. Category"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Charac. Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验项目分类详情查询

>  请求方式	GET | Inspection Charac. Category (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/checkprojectclass/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	检验项目分类ID, 检验项目分类ID和检验项目分类编码不能同时为空，同时存在以id为准    示例: 2761031576326656
orgId	string	query	否	组织id，传值为组织id或组织code皆可，单组织时不填，多组织必填，单组织租户下传值不生效，后台自动赋值为当前租户组织    示例: 2714279439504384
code	string	query	否	检验项目分类编码, 检验项目分类ID和检验项目分类编码不能同时为空，同时存在以id为准    示例: 777

## 3. 请求示例

Url: /yonbip/imcs/checkprojectclass/detail?access_token=访问令牌&id=2761031576326656&orgId=2714279439504384&code=777

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
message	string	否	返回信息 示例：操作成功
data	object	否	调用成功时的返回数据
code	string	否	检验项目分类编码 示例：kl0003
applyOrgId	string	否	使用组织ID 示例：2296731543949568
applyRangeId	long	否	适用范围ID 示例：1674677335940923395
applyRangeList	object	是	适用范围数据
qualityinSpectionCenter	string	否	管理组织ID 示例：2296731543949568
applyOrgName	string	否	使用组织名称 示例：LN质检组织
name	string	否	检验项目分类名称 示例：kl0003
qualityinSpectionCenter_name	string	否	管理组织名称 示例：LN质检组织
id	string	否	检验项目分类ID 示例：1674677335940923394
pubts	string	否	时间戳 示例：2023-03-14 10:42:58
modifyTime	string	否	修改时间 示例：2023-03-14 10:42:58
modifier	string	否	更新人名称 示例：昵称-lj
modifierId	long	否	更新人id 示例：2694968729983488
creatorId	long	否	创建人id 示例：2296645408297216
creator	string	否	创建人名称 示例：默认用户
createTime	string	否	创建时间 示例：2023-03-07 11:01:41

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "kl0003",
		"applyOrgId": "2296731543949568",
		"applyRangeId": 1674677335940923395,
		"applyRangeList": [
			{
				"orgName": "LN质检组织",
				"orgCode": "LN-002",
				"id": 1674677335940923395,
				"orgId": "2296731543949568",
				"checkProjectClassId": "1674677335940923394"
			}
		],
		"qualityinSpectionCenter": "2296731543949568",
		"applyOrgName": "LN质检组织",
		"name": "kl0003",
		"qualityinSpectionCenter_name": "LN质检组织",
		"id": "1674677335940923394",
		"pubts": "2023-03-14 10:42:58",
		"modifyTime": "2023-03-14 10:42:58",
		"modifier": "昵称-lj",
		"modifierId": 2694968729983488,
		"creatorId": 2296645408297216,
		"creator": "默认用户",
		"createTime": "2023-03-07 11:01:41"
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
999	该组织未分配检验项目分类，请检查！	为该组织分配检验项目分类

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

