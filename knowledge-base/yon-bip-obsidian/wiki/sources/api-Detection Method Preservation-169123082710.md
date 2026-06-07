---
title: "检测方法列表查询"
apiId: "1691230827107581955"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Testing Method"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Testing Method]
platform_version: "BIP"
source_type: community-api-docs
---

# 检测方法列表查询

>  请求方式	POST | Testing Method (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/detectionmethod/list
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
pageIndex	int	否	是	页号 默认值:1 示例：1 默认值：1
pageSize	int	否	是	每页行数 默认值:10 示例：10 默认值：10
code	string	否	否	编码 示例：100101
name	string	否	否	名称 示例：测试1
type	string	否	否	分类 示例：分类1
edition	string	否	否	版本 示例：1.0
pubts	string	否	否	时间戳，支持最高10位数字的秒级时间戳，默认起始时间戳，如果需要结束时间戳，则用 | 进行分割，如1717038743|1717038999 示例：1717038743|1717038999
note	string	否	否	备注 示例：备注1

## 3. 请求示例

Url: /yonbip/imcs/detectionmethod/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "100101",
	"name": "测试1",
	"type": "分类1",
	"edition": "1.0",
	"pubts": "1717038743|1717038999",
	"note": "备注1"
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
code	string	否	返回码，成功时返回200 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	调用成功时的返回数据
pageIndex	long	否	当前页 示例：1
pageSize	long	否	页大小 示例：10
recordCount	long	否	记录总数 示例：1
recordList	object	是	返回数据对象
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"creator": "宋驰",
				"code": "aa",
				"name": "康磊11",
				"modifier": "业务员",
				"modifyTime": "2023-03-01 16:15:34",
				"createTime": "2023-03-01 10:29:41",
				"validFrom": "",
				"expiryDate": "2023-03-01 10:29:41",
				"edition": "1.0",
				"type": "分类1",
				"note": "111",
				"id": 1670207821172965385,
				"pubts": "2023-03-01 16:15:34"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
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
999	没有权限	没有权限

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

