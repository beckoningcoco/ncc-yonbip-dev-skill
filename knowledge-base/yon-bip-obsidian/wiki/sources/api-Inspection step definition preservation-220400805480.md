---
title: "检验步骤定义列表查询"
apiId: "2204008054809165831"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Step Definition"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Step Definition]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验步骤定义列表查询

>  请求方式	POST | Inspection Step Definition (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/inspectstepdefine/list
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
orgId	string	否	否	质检组织 示例：2296731543949568
code	string	否	否	编码 示例：0046
name	string	否	否	名称 示例：这是一个实例名称
pageIndex	number
小数位数:0,最大长度:10	否	否	页号 默认值：1 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	每页行数 默认值：10 示例：10 默认值：10

## 3. 请求示例

Url: /yonbip/QMS_QIT/inspectstepdefine/list?access_token=访问令牌
Body: {
	"orgId": "2296731543949568",
	"code": "0046",
	"name": "这是一个实例名称",
	"pageIndex": 1,
	"pageSize": 10
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
code	string	否	返回编码 示例：200
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
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
orgId	string	否	质检组织id 示例：1503239447124639752
orgName	string	否	质检组织名称 示例：测试组织
orgCode	string	否	质检组织编码 示例：xzm1
code	string	否	编码 示例：0046
name	string	否	名称 示例：检验步骤配置api
parent	string	否	上级分组 示例：1800113590987915269
inspectTime	string	否	检验时长 示例：244
unit	string	否	时间单位 示例：小时
memo	string	否	备注 示例：这是一个示例备注
creatorId	string	否	创建人id 示例：1503246490875723783
creator	string	否	创建人 示例：张三

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orgId": "1503239447124639752",
		"orgName": "测试组织",
		"orgCode": "xzm1",
		"code": "0046",
		"name": "检验步骤配置api",
		"parent": "1800113590987915269",
		"inspectTime": "244",
		"unit": "小时",
		"memo": "这是一个示例备注",
		"creatorId": "1503246490875723783",
		"creator": "张三"
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
999	查询异常	返回错误信息

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

