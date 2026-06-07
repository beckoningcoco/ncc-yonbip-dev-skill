---
title: "收款日报列表查询"
apiId: "2183972762511474692"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Daily Collection Report"
domain: "RetailServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Collection Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款日报列表查询

>  请求方式	POST | Daily Collection Report (RetailServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/gatherdailyreport/list
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
vouchCode	string	否	否	收款日报号 示例：RG000020250121000001
simpleVOs	object	是	否	扩展条件查询
field	string	否	否	条件字段 示例：busiDate
op	string	否	否	比较符（条件）：eq：等于、neq：不等于、lt：小于、gt：大于、between：介于、in：包含、nin：不包含、like：模糊匹配、leftlike：左模糊匹配、rightlike：右模糊匹配、is_null：为空、is_not_null：不为空、and：并且、or：或者 示例：between
value1	string	否	否	条件值1 示例：2025-01-11 00:00:00
value2	string	否	否	条件值2 示例：2025-01-17 23:59:59

## 3. 请求示例

Url: /yonbip/sd/uretail/gatherdailyreport/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"vouchCode": "RG000020250121000001",
	"simpleVOs": [
		{
			"field": "busiDate",
			"op": "between",
			"value1": "2025-01-11 00:00:00",
			"value2": "2025-01-17 23:59:59"
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
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	数据集
pageIndex	number
小数位数:0,最大长度:10	否	分页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	分页尺寸 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	记录集合
pageCount	number
小数位数:0,最大长度:10	否	分页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	开始页码 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	截止页码 示例：1
traceId	string	否	线索id 示例：89643aa46ed4c159

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"currency_moneyDigit": 2,
				"code": "RG000020250121000001",
				"busiDate": "2025-01-21 00:00:00",
				"fundSettleStatus": 0,
				"gatherType": 0,
				"iMemberid": 0,
				"store": "1975876348671950849",
				"rmDailyReport_code": "RL539620250121000001",
				"fCardDisApportion": 0,
				"postAccountStatus": 2,
				"rmDailyReport": "2183741384155463685",
				"fGatheringMoney": 55,
				"gatheringDailyReportDefineCharacter": {
					"ytenant": "0000LIV5L9915D6J9E0000",
					"id": "2183741384155463696",
					"pubts": "2025-01-21 08:55:57"
				},
				"store_name": "存量测试门店",
				"currency": "1748193698452604425",
				"id": "2183741384155463694",
				"pubts": "2025-01-21 08:55:56",
				"vouchDate": "2025-01-21 08:55:56",
				"status": 0
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "89643aa46ed4c159"
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

