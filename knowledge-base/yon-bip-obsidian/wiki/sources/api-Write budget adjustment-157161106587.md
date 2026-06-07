---
title: "预算调整提交"
apiId: "1571611065874120708"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Adjustment"
domain: "PMPB"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 预算调整提交

>  请求方式	POST | Budget Adjustment (PMPB)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/budgetadjust/batchSubmit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	否	入参层级，支持幂等
id	string	是	否	预算调整单id 示例：["2027351797995667464","2027352347751481346"]

## 3. 请求示例

Url: /yonbip/pm/budgetadjust/batchSubmit?access_token=访问令牌
Body: {
	"data": {
		"id": [
			"2027351797995667464",
			"2027352347751481346"
		]
	}
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
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:10	否	请求状态编码 示例：200
message	string	否	执行状态 示例：操作成功
data	object	否	执行结果
count	number
小数位数:0,最大长度:10	否	提交的调整单数量 示例：6
sucessCount	number
小数位数:0,最大长度:10	否	提交成功的调整单数量 示例：4
failCount	number
小数位数:0,最大长度:10	否	提交失败的调整单数量 示例：2
successIds	string	是	提交成功的调整单id 示例：["1545038085925371904","1545043308605603843","1546468928540114944","1547188481568538625"]
failInfos	string	是	单据失败信息 示例：["未查询到开立的预算调整单，单据id为：1541332894976311304","单据提交失败，单据id为：1544956000511459332；失败原因：xxxxxxx"]

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 6,
		"sucessCount": 4,
		"failCount": 2,
		"successIds": [
			"1545038085925371904",
			"1545043308605603843",
			"1546468928540114944",
			"1547188481568538625"
		],
		"failInfos": [
			"未查询到开立的预算调整单，单据id为：1541332894976311304",
			"单据提交失败，单据id为：1544956000511459332；失败原因：xxxxxxx"
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
1032001990001	传入id为空	检查传入的id是否为空
1032001990002	最多支持十条数据批量提交	控制批量提交的数量最多为十条
1032001990099	其他异常	根据错误返回信息修改参数

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

