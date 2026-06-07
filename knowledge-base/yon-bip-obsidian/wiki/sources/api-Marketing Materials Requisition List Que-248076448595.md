---
title: "营销物料申领列表查询"
apiId: "2480764485953912834"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Marketing Material Application"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Marketing Material Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 营销物料申领列表查询

>  请求方式	POST | Marketing Material Application (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/MarketingMaterialApplicationl/list
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
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:4	否	是	每页行数 示例：10 默认值：10
code	string	否	否	申请单号 示例：2026011400047
proposer	string	否	否	申请人 示例：1567062987461099521
customer	string	否	否	客户 示例：1570239459373350917
terminalAssetsDetail.terminal	string	否	否	终端id 示例：1810590948969676802
simpleVOs	object	是	否	查询条件
field	string	否	否	可作为查询条件的参数如：1:createTime(创建时间),2:modifyTime(修改时间) 示例：bustype.billtype_id.form_id
op	string	否	否	逻辑符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空） 示例：eq
value1	string	否	否	查询条件值1 示例：DSFA.dsfa_visitsummarycard
value2	string	否	否	查询条件值2
isSum	string	否	否	查询表头:true-表头；false-表头+明细 示例：true

## 3. 请求示例

Url: /yonbip/MCC/MarketingMaterialApplicationl/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "2026011400047",
	"proposer": "1567062987461099521",
	"customer": "1570239459373350917",
	"terminalAssetsDetail.terminal": "1810590948969676802",
	"simpleVOs": [
		{
			"field": "bustype.billtype_id.form_id",
			"op": "eq",
			"value1": "DSFA.dsfa_visitsummarycard",
			"value2": ""
		}
	],
	"isSum": "true"
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
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页号 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每行页数 示例：10
recordCount	number
小数位数:0,最大长度:10	否	记录数量 示例：1
recordList	object	是	记录列表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"verifystate": 2,
				"terminalAssetsDetail_product_name": "物料22",
				"code": "2026011400047",
				"bustype_name": "营销资产申请",
				"terminalAssetsDetail_ID": "2449538115215294465",
				"stockName": "仓库1",
				"productMainUnit_name": "小时",
				"id": "2449538115215294464",
				"terminalAssetsDetail_productMainUnit": "1567037191908491270",
				"pubts": "2026-01-23 14:55:47",
				"applyTime": "2026-01-14 00:00:00",
				"org_name": "集团",
				"org": "1567050111173263368",
				"terminalAssetsDetail_product": "1570762363075821574",
				"auditor": "昵称-李亚苹",
				"productMainUnit_precision": 3,
				"bustype": "1567036161096941735",
				"proposer_name": "李亚苹",
				"auditorId": "1567063219403489282",
				"auditTime": "2026-01-23 14:55:29",
				"terminalAssetsDetail_quantity": 2,
				"stockId": "1585753860525785093",
				"stockOrgId": "1567050111173263368",
				"stockOrgId_name": "集团"
			}
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

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

