---
title: "工种列表查询"
apiId: "2163109563724726274"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Profession"
domain: "APS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Profession]
platform_version: "BIP"
source_type: community-api-docs
---

# 工种列表查询

>  请求方式	POST | Profession (APS)


## 1. 通过OpenAPI查询工种列表；

2. 支持的查询条件及操作符：编码（等于、模糊匹配）、名称（等于、模糊匹配）；

## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/ampubcraftlist/batchquery
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
page	object	否	是	分页
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页条数 示例：2 默认值：20
condition	object	否	否	查询条件
simpleVOs	object	是	否	扩展查询条件

## 3. 请求示例

Url: /yonbip/am/ampubcraftlist/batchquery?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 2
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "code",
				"op": "eq",
				"value1": "craft_001"
			}
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
code	string	否	返回http状态码(200:正常，其他：异常) 示例：200
message	string	否	返回的信息 示例：操作成功！
data	object	否	查询到的数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页条数 示例：10
recordCount	number
小数位数:0,最大长度:10	否	总共条数 示例：1
recordList	object	是	详细数据列表
pageCount	number
小数位数:0,最大长度:10	否	总共页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"id": "2158707815055622144",
				"pk_org": "1991575777008156681",
				"pk_org__name": "北京分公司",
				"code": "01",
				"name": {
					"zh_CN": "测试数据"
				},
				"memo": "测试备注",
				"enablestate": 0,
				"creator": "1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b",
				"creator__name": "昵称-王浩伟",
				"creationtime": "2024-12-18 20:00:28",
				"modifier": "1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16",
				"modifier__name": "昵称-郝小侠",
				"modifiedtime": "2024-12-19 18:22:36"
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

