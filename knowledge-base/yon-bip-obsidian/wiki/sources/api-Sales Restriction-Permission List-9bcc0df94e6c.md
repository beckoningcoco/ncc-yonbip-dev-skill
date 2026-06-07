---
title: "允限销列表"
apiId: "9bcc0df94e6c4cbebf617d6416b62f0e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Restriction/Permission"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Restriction/Permission]
platform_version: "BIP"
source_type: community-api-docs
---

# 允限销列表

>  请求方式	POST | Sales Restriction/Permission (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/allow/limit/sale/list
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
pageIndex	long	否	是	当前页码 示例：1 默认值：1
pageSize	long	否	是	每页条数 示例：10 默认值：10
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名（条件传属性的名称）比如时间戳pubts、开始时间beginDate、结束时间endDate、销售组织creationOrgId、客户agentId、客户分类agentClassId、客户级别agentLevelId、商品productId、商品分类productClassId、品牌productBrandId、产品线productLineId、销售组织编码creationOrgId.code、客户编码agentId.code、客户分类编码agentClassId.code、客户级别编码agentLevelId.code、商品编码productId.code、商品分类编码productClassId.code、品牌编码productBrandId.code、产品线编码productLineId.code 示例：pubts
op	string	否	否	比较符（in:包含;eq:等于;it:小于;gt:大于;like:模糊匹配;between:介于） 示例：between
value1	string	否	否	值1（条件）（属性名补充：上游单据号upCode） 示例：2021-06-01 00:00:00
value2	string	否	否	值2（条件） 示例：2021-12-31 23:59:59
templateId	long	否	否	设置维度，1:（客户+商品）、2:（客户+商品分类）、3:（客户+产品线）、4:（客户+品牌）、5:（客户分类+商品）、6:（客户分类+商品分类）、7:（客户分类+产品线）、8:（客户分类+品牌）、9:（客户级别+商品） 默认值：1

## 3. 请求示例

Url: /yonbip/sd/allow/limit/sale/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2021-06-01 00:00:00",
			"value2": "2021-12-31 23:59:59"
		}
	],
	"templateId": 0
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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
pageIndex	int	否	当前页
pageSize	int	否	每页数量
pageCount	int	否	总页数
beginPageIndex	int	否	起始页下标
endPageIndex	int	否	结束页下标
recordCount	int	否	记录数量
pubts	string	否	时间戳
recordList	object	是	允限销列表

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"id": 0,
				"creationOrgId": "",
				"creationOrgId_name": "",
				"templateId": 0,
				"templateId_name": "",
				"sellerId": 0,
				"sellerId_name": "",
				"beginDate": "",
				"endDate": "",
				"agentId": 0,
				"agentId_name": "",
				"agentClassId": 0,
				"agentClassId_name": "",
				"productId": 0,
				"productId_name": "",
				"skuId": 0,
				"skuId_name": "",
				"productClassId": 0,
				"productClassId_name": "",
				"materialClassId": 0,
				"materialClassId_name": "",
				"productLineId": 0,
				"productLineId_name": "",
				"productBrandId": 0,
				"productBrandId_name": "",
				"source": "",
				"sourceAutoId": 0,
				"sourceId": 0,
				"upCode": ""
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
999	错误信息	请联系管理员

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

