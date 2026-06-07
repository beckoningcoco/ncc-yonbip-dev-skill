---
title: "故障类别保存"
apiId: "2369600673524744198"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Failure Categories"
domain: "APS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Failure Categories]
platform_version: "BIP"
source_type: community-api-docs
---

# 故障类别保存

>  请求方式	POST | Failure Categories (APS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/ACC/ampubfailuretypelist/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	数据
pk_org	string	否	是	业务单元
fk_parent	string	否	否	父类别主键 示例：1796528951150510082
code	string	否	是	编码 示例：1ghq0ATHHT
name	object	否	是	名称
memo	string	否	否	备注 示例：4444
enablestate	number
小数位数:0,最大长度:10	否	是	启用状态 示例：2 默认值：2
level	number
小数位数:0,最大长度:10	否	是	层级 示例：4 默认值：1
path	string	否	否	路径 示例：VETY
isEnd	boolean	否	是	是否末级 示例：false 默认值：false
parent	string	否	否	父类别主键 示例：1796528951150510082

## 3. 请求示例

Url: /yonbip/ACC/ampubfailuretypelist/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_org": "",
			"fk_parent": "1796528951150510082",
			"code": "1ghq0ATHHT",
			"name": {
				"zh_TW": "",
				"en_US": "1234",
				"zh_CN": "测试1ghq0ATHHT"
			},
			"memo": "4444",
			"enablestate": 2,
			"level": 4,
			"path": "VETY",
			"isEnd": false,
			"parent": "1796528951150510082"
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
code	number
小数位数:0,最大长度:10	否	http返回码(200:成功，其他：异常) 示例：200
message	string	否	返回的信息 示例：操作成功！
data	object	否	返回数据
id	string	否	主键 示例：2369310110404575239
_entityName	string	否	实体名称 示例：ampub.failuresymptom.FailureSymptomVO
pk_org	string	否	业务单元 示例：1957640999752695842
fk_parent	string	否	父级主键 示例：1982187055693168647
code	string	否	编码 示例：TEST3
name	object	否	名称
memo	string	否	备注 示例：备注
enablestate	number
小数位数:0,最大长度:10	否	启用状态（启用状态 1-未启用 2-已启用 3-已停用） 示例：2
parent	string	否	父类别
level	number
小数位数:0,最大长度:10	否	层级
sysid	string	否	系统id 示例：AMBD
creator	string	否	创建人ID 示例：672e9f78-e1c1-44f1-8c77-e076eb447098
creator__name	string	否	创建人名称 示例：昵称-haoxxia
creationtime	string	否	创建时间 示例：2024-05-27 16:12:10
pubts	string	否	时间戳 示例：2024-05-27 16:12:10
isEnd	boolean	否	是否末级
errorDetail	object	是	失败信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"id": "2369310110404575239",
		"_entityName": "ampub.failuresymptom.FailureSymptomVO",
		"pk_org": "1957640999752695842",
		"fk_parent": "1982187055693168647",
		"code": "TEST3",
		"name": {
			"zh_CN": "测试",
			"en_US": "",
			"zh_TW": ""
		},
		"memo": "备注",
		"enablestate": 2,
		"parent": "",
		"level": 0,
		"sysid": "AMBD",
		"creator": "672e9f78-e1c1-44f1-8c77-e076eb447098",
		"creator__name": "昵称-haoxxia",
		"creationtime": "2024-05-27 16:12:10",
		"pubts": "2024-05-27 16:12:10",
		"isEnd": true
	},
	"errorDetail": [
		{}
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
999	服务端逻辑异常	服务端逻辑异常

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

