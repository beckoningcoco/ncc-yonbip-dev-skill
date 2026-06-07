---
title: "采购商城订单列表查询"
apiId: "2013276614565560324"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Mall Order"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Mall Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购商城订单列表查询

>  请求方式	POST | Mall Order (SMK)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/yonbip-cpu-mall/mdd/openapi/order/query/page
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
access_token	string	header	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageNo	number
小数位数:0,最大长度:10	否	否	页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:5	否	否	页数，最大5000 示例：20 默认值：20
startDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	下单开始时间 示例：2023-01-01 00:00:00
endDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	下单结束时间 示例：2024-01-01 00:00:00
assignPurorgCode	string	否	否	采购组织编码 示例：TH01
supplierTenantId	string	否	否	供应商租户id 示例：1dsfxzawqe
orderStatus	string	否	否	订单状态 示例：SAVED
orderCode	string	否	否	采购商城订单号 示例：20211216190007
tsBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改时间开始 示例：2023-01-01 00:00:00
tsEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改时间结束 示例：2024-01-01 00:00:00
committedTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	提交时间开始 示例：2023-01-01 00:00:00
committedTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	提交时间结束 示例：2023-01-01 00:00:00
approvedTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批时间开始 示例：2023-01-01 00:00:00
approvedTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批时间结束 示例：2024-01-01 00:00:00
transtypeCode	string	否	否	交易类型编码 示例：21-01

## 3. 请求示例

Url: /yonbip/cpu/yonbip-cpu-mall/mdd/openapi/order/query/page?access_token=访问令牌
Header: 
	access_token : ""
Body: {
	"pageNo": 1,
	"pageSize": 20,
	"startDate": "2023-01-01 00:00:00",
	"endDate": "2024-01-01 00:00:00",
	"assignPurorgCode": "TH01",
	"supplierTenantId": "1dsfxzawqe",
	"orderStatus": "SAVED",
	"orderCode": "20211216190007",
	"tsBegin": "2023-01-01 00:00:00",
	"tsEnd": "2024-01-01 00:00:00",
	"committedTimeBegin": "2023-01-01 00:00:00",
	"committedTimeEnd": "2023-01-01 00:00:00",
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
code	string	否	响应码
message	string	否	提示信息
data	object	否	数据
pageNo	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:5	否	页数 示例：20
totalPage	number
小数位数:0,最大长度:10	否	总页数 示例：25
totalRecord	number
小数位数:0,最大长度:10	否	总记录数 示例：500
results	object	是	数据集

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageNo": 1,
		"pageSize": 20,
		"totalPage": 25,
		"totalRecord": 500,
		"results": [
			{
				"applyPurchaseDeptId": "",
				"applyPurchaseDeptName": "",
				"applyPurchaseOrgId": "",
				"applyPurchaseOrgName": "",
				"applyPurchaserId": "",
				"applyPurchaserName": "",
				"approveType": "",
				"assignPurchaserId": "",
				"assignPurchaserName": "",
				"assignPurDeptId": "",
				"assignPurDeptName": "",
				"assignPurOrgId": "",
				"assignPurOrgName": "",
				"carriage": 0,
				"changeStatus": 0,
				"channelType": "",
				"code": "",
				"consigneeDeptId": "",
				"consigneeDeptName": "",
				"consigneeId": "",
				"consigneeMobile": "",
				"consigneeName": "",
				"consigneeOrgId": "",
				"consigneeOrgName": "",
				"creatationTime": 0,
				"createTime": 0,
				"deductionAmount": 0,
				"deliverAddress": "",
				"deliverAddressId": 0,
				"endTime": 0,
				"financialOrgId": "",
				"financialOrgName": "",
				"id": 0,
				"integral": 0,
				"isEmergency": true,
				"memo": "",
				"operatingOrderType": "",
				"operatingOrgId": "",
				"operatingOrgName": "",
				"orderStatus": "",
				"orderdetail": [
					{
						"carriagePrice": 0,
						"categoryId": 0,
						"orderId": 0,
						"originPrice": 0,
						"originTaxPrice": 0,
						"price": 0,
						"productName": "",
						"productUnit": "",
						"quantity": 0,
						"skuCode": "",
						"taxAmountWithoutCarriage": 0,
						"taxRate": 0
					}
				],
				"outerCode": "",
				"payInfo": "",
				"payWay": "",
				"processType": 0,
				"purchaserId": "",
				"purchaserName": "",
				"pushERP": "",
				"quotaType": "",
				"showOperateOrg": "",
				"supplierdocId": 0,
				"supplierdocName": "",
				"supplierId": 0,
				"supplierInfo": "",
				"taxAllowsaleAmountPrice": "",
				"taxAmount": "",
				"taxAmountWithoutCarriage": "",
				"transtypeId": "",
				"transtypeName": ""
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
999	订单交易类型编码异常	请求参数有误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-25	
新增
返回参数 (28)
更新
返回参数 (47)
删除
返回参数 supplierName
	2	2025-11-24	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

