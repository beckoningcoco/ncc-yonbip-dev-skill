---
title: "查看陈列规格详情"
apiId: "07235e8ee4c24d8f99833111ce38ed4d"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Display Specification"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Display Specification]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看陈列规格详情

>  请求方式	GET | Display Specification (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/display/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	陈列规格单据id（单据id和单据编码二选一必填，单据id和编码同时存在以id为准。）
code	string	query	否	陈列规格单据编码（单据id和单据编码二选一必填）

## 3. 请求示例

Url: /yonbip/crm/display/getbyid?access_token=访问令牌&id=&code=

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
code	long	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
standard	string	否	陈列标准 示例：1
creator	string	否	创建人 示例：李亚苹
subList	object	是	陈列商品子表
code	string	否	编码（编码查询用此） 示例：CL1156
masterOrgKeyField	string	否	主组织字段 示例：org
org	string	否	销售组织 示例：2293806909461248
num	long	否	数量 示例：7
modifier	string	否	修改人 示例：陈川华
rewardList	object	是	奖励商品子表
modifyTime	string	否	修改时间 示例：2021-09-16 16:04:12
createTime	string	否	创建时间 示例：2021-09-15 16:41:12
payMethod	string	否	兑付方式 示例：3
name	string	否	名称 示例：算算算
comment	string	否	备注 示例：1
id	long	否	主键id（id查询用此） 示例：2432946540663040
displayimg	string	否	陈列样例 示例：243ba5f0-1601-11ec-be12-9b669f7f6ca9
pubts	string	否	时间戳 示例：2021-09-16 16:04:13
org_name	string	否	销售组织 示例：北京分公司
org_code	string	否	销售组织编码 示例：060901
rewardMoney	long	否	奖励金额 示例：1
stopstatus	boolean	否	停用状态（停用：true，不停用：false） 示例：false

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"standard": "1",
		"creator": "李亚苹",
		"subList": [
			{
				"productClass_name": "饮品",
				"productClass": 2295316367970560,
				"quantity": 1,
				"salesUnit_name": "瓶",
				"displayMethod_name": "地堆",
				"display": 2432946540663040,
				"materials_name": "物料",
				"salesUnit_precision": 2,
				"materials": 2306830681706752,
				"displayMethod": 2356421254881212,
				"displayMethod_code": "display_heap",
				"salesUnit": 2295317204439296,
				"id": 2434325751107840
			}
		],
		"code": "CL1156",
		"masterOrgKeyField": "org",
		"org": "2293806909461248",
		"num": 7,
		"modifier": "陈川华",
		"rewardList": [
			{
				"productClass_name": "饮品",
				"productClass": 2295316367970560,
				"quantity": 2,
				"salesUnit_name": "瓶",
				"materials": 2306830681706752,
				"salesUnit": 2295317204439296,
				"display": 2432946540663040,
				"id": 2434325751107841,
				"materials_name": "物料",
				"salesUnit_precision": 2
			}
		],
		"modifyTime": "2021-09-16 16:04:12",
		"createTime": "2021-09-15 16:41:12",
		"payMethod": "3",
		"name": "算算算",
		"comment": "1",
		"id": 2432946540663040,
		"displayimg": "243ba5f0-1601-11ec-be12-9b669f7f6ca9",
		"pubts": "2021-09-16 16:04:13",
		"org_name": "北京分公司",
		"org_code": "060901",
		"rewardMoney": 1,
		"stopstatus": false
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (47)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

