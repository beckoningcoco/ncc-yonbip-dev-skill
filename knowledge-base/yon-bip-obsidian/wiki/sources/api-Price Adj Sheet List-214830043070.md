---
title: "调价单列表"
apiId: "2148300430706737154"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Adjustment"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 调价单列表

>  请求方式	POST | Price Adjustment (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/adjustprice/list
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
pageIndex	number
小数位数:0,最大长度:10	否	否	分页大小 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	分页尺寸 示例：100 默认值：100
status	string	否	否	调价状态（0:未生效;1:已生效;2:已失效）） 示例：1
code	string	否	否	调价编码 示例：TJD20241115000001
simpleVOs	object	是	否	扩展条件查询
field	string	否	否	条件字段 示例：vouchdate
op	string	否	否	比较符（条件）：eq：等于、neq：不等于、lt：小于、gt：大于、between：介于、in：包含、nin：不包含、like：模糊匹配、leftlike：左模糊匹配、rightlike：右模糊匹配、is_null：为空、is_not_null：不为空、and：并且、or：或者 示例：between
value1	string	否	否	条件值1 示例：2024-12-10 00:00:00
value2	string	否	否	条件值2 示例：2024-12-12 23:59:59

## 3. 请求示例

Url: /yonbip/sd/uretail/adjustprice/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"status": "1",
	"code": "TJD20241115000001",
	"simpleVOs": [
		{
			"field": "vouchdate",
			"op": "between",
			"value1": "2024-12-10 00:00:00",
			"value2": "2024-12-12 23:59:59"
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
code	number
小数位数:0,最大长度:10	否	结果编码 示例：200
message	string	否	结果消息 示例：操作成功
data	object	否	结果数据集合
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	分页大小 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：2
recordList	object	是	记录列表
pageCount	number
小数位数:0,最大长度:10	否	分页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	开始分页码 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	截止分页码 示例：1
traceId	string	否	线索ID 示例：5944e966be58ed93

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 2,
		"recordList": [
			{
				"verifystate": 2,
				"creator": "昵称-迈宇佳",
				"code": "TJD20241115000001",
				"isWfControlled": true,
				"auditor": "昵称-迈宇佳",
				"vouchdate": "2024-11-15 00:00:00",
				"createTime": "2024-11-15 15:48:33",
				"auditTime": "2024-11-15 15:50:41",
				"name": "小茗同学（6.66元）-统一",
				"id": "2134228623200092169",
				"pubts": "2024-11-15 15:50:41",
				"status": 1,
				"adjustPriceDefineCharacter": {
					"id": "2147586624319913995",
					"ytenant": "0000LIV5L9915D6J9E0000",
					"lsdbtwb": "22",
					"pubts": "2024-11-15 15:50:41"
				}
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "5944e966be58ed93"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
code	999	未知服务异常

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

