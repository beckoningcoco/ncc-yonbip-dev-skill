---
title: "云采超市订单列表查询"
apiId: "1838116458073686023"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 云采超市订单列表查询

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/yonbip-cpu-mall/openapi/order/query/page
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageNo	int	否	是	页码 示例：1 默认值：1
pageSize	int	否	是	页数，最大5000 示例：20 默认值：20
startDate	string	否	否	下单开始时间 示例：2023-01-01 00:00:00
endDate	string	否	否	下单结束时间 示例：2024-01-01 00:00:00
assignPurorgCode	string	否	否	采购组织编码 示例：TH01
supplierTenantId	string	否	否	供应商TenantId 示例：1dsfxzawqe
orderStatus	string	否	否	订单状态
orderCode	string	否	否	超市订单号 示例：20211216190007
tsBegin	string	否	否	修改时间开始 示例：2023-01-01 00:00:00
tsEnd	string	否	否	修改时间结束 示例：2024-01-01 00:00:00
committedTimeBegin	string	否	否	提交订单时间开始 示例：2023-01-01 00:00:00
committedTimeEnd	string	否	否	提交订单时间结束 示例：2024-01-01 00:00:00
approvedTimeBegin	string	否	否	订单最新审批时间开始 示例：2023-01-01 00:00:00
approvedTimeEnd	string	否	否	订单最新审批时间结束 示例：2024-01-01 00:00:00
transtypeCode	string	否	否	订单交易类型编码 示例：21-01

## 3. 请求示例

Url: /yonbip/cpu/yonbip-cpu-mall/openapi/order/query/page?access_token=访问令牌
Body: {
	"pageNo": 1,
	"pageSize": 20,
	"startDate": "2023-01-01 00:00:00",
	"endDate": "2024-01-01 00:00:00",
	"assignPurorgCode": "TH01",
	"supplierTenantId": "1dsfxzawqe",
	"orderStatus": "",
	"orderCode": "20211216190007",
	"tsBegin": "2023-01-01 00:00:00",
	"tsEnd": "2024-01-01 00:00:00",
	"committedTimeBegin": "2023-01-01 00:00:00",
	"committedTimeEnd": "2024-01-01 00:00:00",
	"approvedTimeBegin": "2023-01-01 00:00:00",
	"approvedTimeEnd": "2024-01-01 00:00:00",
	"transtypeCode": "21-01"
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
code	string	否	响应码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	数据
pageNo	int	否	页码 示例：1
pageSize	int	否	页数 示例：20
totalRecord	long	否	总记录数 示例：500
totalPage	int	否	总页数 示例：25
results	object	是	列表的数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageNo": 1,
		"pageSize": 20,
		"totalRecord": 500,
		"totalPage": 25,
		"results": [
			{
				"order_id": 1833467860353548297,
				"supplier_name": "1111采购供应商",
				"order_code": "20230707170002",
				"status": "SAVED",
				"creatation_time": "2023-10-09 23:15:44",
				"purorg_name": "测试组织",
				"purdept_name": "测试组织",
				"ec_order_code": "000LBBV4E2Z8Y",
				"memo": "订单备注",
				"consignee_deptinfo": "{\"id\":\"1607835747760472072\",\"name\":\"总公司采购部\"}",
				"consignee_orginfo": "{\"name\":\"天海总公司\",\"id\":\"1607835490086551556\"}",
				"end_time": 1607835747760472,
				"carriage": 10,
				"totalMoney": 99,
				"totalOriginMoney": 89,
				"operatingOrderType": "0",
				"operatingOrgId": "1607835490086551556",
				"operatingOrgName": "天海总公司",
				"showOperateOrg": false,
				"details": [
					{
						"ware_name": "测试商品",
						"ext_skucode": "SSDD11231",
						"unit": "件",
						"tax_rate": 13,
						"quantity": 1,
						"price": 10,
						"originTaxPrice": 10,
						"originPrice": 10,
						"tax_price": 10,
						"totalPrice": 80,
						"totalOriginPrice": 80,
						"categoryId": "1567835490086551235",
						"carriagePrice": 10,
						"innercode": "111245",
						"marketProductClass_code": "S22210",
						"marketProductClass_name": "水果"
					}
				]
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
999	请求参数不可为空	请求参数不可为空

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

