---
title: "价格表查询V2"
apiId: "72f762a87d0a4d268a2a1f4afd59c707"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Table"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 价格表查询V2

>  请求方式	POST | Price Table (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricing/record
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
pageIndex	long	否	是	当前页数 示例：1 默认值：1
pageSize	long	否	是	分页条数 示例：10 默认值：10
priceTypeId	string	否	否	定价类型id 示例：2276920880582912
open_validDate_begin	string	否	否	有效期开始日期 示例："2021-06-16 00:00:00"
open_validDate_end	string	否	否	有效期结束日期 示例："2021-06-19 23:59:59"
priceAdjustmentId	string	否	否	调价单id 示例：2277191405850880
status	string	否	否	状态，VALID:已生效，INVALID：未生效
priceTemplateId	long	否	是	价格模板ID
simpleVOs	object	是	否	查询条件
op	string	否	否	条件比较符(eq：相等,neq：不相等,lt：小于,gt：大于,elt：小于等于,egt：大于等于,between：区间,in：包含,nin：不包含,like：包含字符,leftlike：左侧包含,rightlike：右侧包含,is_null：为空,is_not_null：不为空,and：和,or：或) 示例：between
field	string	否	否	查询条件字段名(支持beginDate：开始日期，和endDate：结束日期、priceTemplateId.code：价格模板Code) 示例：beginDate
value1	string	否	否	查询条件值1 示例：2021-06-06 00:00:00
value2	string	否	否	查询条件值2 示例：2021-06-15 23:59:59

## 3. 请求示例

Url: /yonbip/sd/pricing/record?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"priceTypeId": "2276920880582912",
	"open_validDate_begin": "\"2021-06-16 00:00:00\"",
	"open_validDate_end": "\"2021-06-19 23:59:59\"",
	"priceAdjustmentId": "2277191405850880",
	"status": "",
	"priceTemplateId": 0,
	"simpleVOs": [
		{
			"op": "between",
			"field": "beginDate",
			"value1": "2021-06-06 00:00:00",
			"value2": "2021-06-15 23:59:59"
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
code	long	否	响应编码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	响应数据
pageIndex	long	否	页索引 示例：1
pageSize	long	否	页大小 示例：20
recordCount	long	否	记录数 示例：1
recordList	object	是	数据集合
pageCount	long	否	页数量 示例：1
beginPageIndex	long	否	开始页索引 示例：1
endPageIndex	long	否	结束页索引 示例：1

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
				"orgScope_name": "斗罗大陆",
				"priceUnit": "1959808366596608",
				"endDate": "2021-05-30 00:00:00",
				"priceTemplateId": 2245921376129280,
				"productId_name": "lcy物料1",
				"priceAdjustmentId": 2264229101637888,
				"amountUnit_name": "个",
				"priceAdjustmentItemId": 2264229101637889,
				"priceTypeId": 2245920338874624,
				"priceUnit_name": "人民币",
				"priceTypeId_name": "门户商品基础价",
				"amountUnit": 1951599070990592,
				"beginDate": "2021-05-01 00:00:00",
				"isLadderPrice": true,
				"dimension_productId": 1967040133861632,
				"scope": "斗罗大陆",
				"priceTemplateName": "物料",
				"id": 2272673169920256,
				"orgScopeId": "1951523035419392",
				"bizScopeId": "1951482557763840",
				"status": "已生效",
				"enable": 1,
				"agentId_name": "夏洛特070201",
				"dimension_agentId": 2326682124833024,
				"channelAgentLevel": 2326682124833024,
				"channelAgentLevel_name": "夏洛特",
				"recordGradients_price": 10,
				"recordGradients_amountFloor": 1,
				"recordGradients_priceRecordId": 232645884961658,
				"recordGradients_id": 232610124578894
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
999	服务器逻辑异常	

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

