---
title: "门店商品价格查询接口"
apiId: "1601972455996391430"
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

# 门店商品价格查询接口

>  请求方式	POST | Price Table (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/mall/queryProductsWithPriceByStore
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
storeCode	string	否	是	门店编码，即终端网点档案的终端编码，且终端类型必须为零售门店
stopStatus	boolean	否	否	物料停用状态，true - 查询停用物料，false - 查询启用物料，不传查询所有物料数据
pageIndex	int	否	是	当前页
pageSize	int	否	是	每页数量

## 3. 请求示例

Url: /yonbip/sd/api/mall/queryProductsWithPriceByStore?access_token=访问令牌
Body: {
	"storeCode": "",
	"stopStatus": true,
	"pageIndex": 0,
	"pageSize": 0
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
code	string	否	状态码 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
pager	object	否	数据页
data	object	是	数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pager": {
			"total": 0,
			"pageIndex": "",
			"pageSize": ""
		},
		"data": [
			{
				"store_name": "",
				"product": 0,
				"product_code": "",
				"product_name": "",
				"creatorType": 0,
				"productOrgId": "",
				"product_productClass_path": "",
				"category_code": "",
				"category_name": "",
				"qrcode_url": "",
				"productsku": 0,
				"sku_code": "",
				"sku_name": "",
				"sku_modelDescription": "",
				"product_unitId": 0,
				"product_unit": "",
				"product_modelDescription": "",
				"product_barCode": "",
				"offline_isPriceChangeAllowed": 0,
				"offline_mnemonicCode": "",
				"stopStatus": true,
				"offlineEnabled": 0,
				"retailPriceDimension": 0,
				"free1": "",
				"skuSalePrice": 0,
				"markPrice": 0,
				"markprice": 0,
				"fQuotePrice": 0,
				"fPrice": 0,
				"retailprice": 0,
				"fLowestMarkPrice": 0,
				"MemberInfo": [
					{
						"mPrice": 0,
						"level": 0
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
999	门店编码输入有误	门店编码应为终端网点档案的终端编码，且终端类型必须适用零售门店

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

