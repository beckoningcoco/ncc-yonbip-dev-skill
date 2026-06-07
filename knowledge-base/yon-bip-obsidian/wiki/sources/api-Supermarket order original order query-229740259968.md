---
title: "商超订货原单查询"
apiId: "2297402599687585793"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supermarket Order Original Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supermarket Order Original Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 商超订货原单查询

>  请求方式	POST | Supermarket Order Original Document (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/9969c3adbd304c3d84551dbd5f27035b/api/ka/kaOrderOrig/list
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
kaOrderCode	string	否	否	商超订单号 示例：order012
chainSystem	string	否	否	连锁系统 示例：1660555174255001605
kaOrderDate	date
格式:yyyy-MM-dd	否	否	订货日期 示例：2023-07-01
saleOrg	string	否	否	销售组织 示例：1660555174255001611
orderCustomer	string	否	否	订货客户 示例：1660555174255001644
vouchStatus	string	否	否	单据状态 示例：2
pageIndex	string	否	是	页码 示例：1
pageSize	string	否	是	分页大小 示例：20

## 3. 请求示例

Url: /yonbip/9969c3adbd304c3d84551dbd5f27035b/api/ka/kaOrderOrig/list?access_token=访问令牌
Body: {
	"kaOrderCode": "order012",
	"chainSystem": "1660555174255001605",
	"kaOrderDate": "2023-07-01",
	"saleOrg": "1660555174255001611",
	"orderCustomer": "1660555174255001644",
	"vouchStatus": "2",
	"pageIndex": "1",
	"pageSize": "20"
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
小数位数:0,最大长度:12	否	状态码 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:12	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:12	否	分页大小 示例：20
recordCount	number
小数位数:0,最大长度:12	否	记录数 示例：12
recordList	object	是	记录列表
pageCount	string	否	页数 示例：2
beginPageIndex	string	否	开始页数 示例：1
endPageIndex	string	否	结束页数 示例：2

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 12,
		"recordList": [
			{
				"kaOrderCode": "order202307170001",
				"chainSystem": "1660555174255001611",
				"kaStoreCode": "wem0001",
				"kaStoreName": "沃尔玛-用友店",
				"kaOrderDate": "2023-07-01",
				"kaReceiveDate": "2023-07-01",
				"saleOrg": "1660555174255001605",
				"orderCustomer": "1660555174255001612",
				"kaVendorCode": "s1",
				"kaOrderTotalQty": 10,
				"kaOrderTotalAmount": 12,
				"vouchStatus": "2",
				"currency": "1660555174255001612",
				"remarks": "这是备注",
				"goods": [
					{
						"kaOrderCode": "order202307170001",
						"lineno": "10",
						"kaIsGift": "是",
						"kaReceiveDate": "2023-07-01",
						"goods": "1660555174255001612",
						"goods_code": "p0001",
						"goods_name": "苹果",
						"sku_specs": "每个300克",
						"sku": "1660555174255001615",
						"sku_code": "pg1",
						"sku_name": "苹果1",
						"goodsUnit": "1660555174255001619",
						"goodsUnitQty": 12,
						"goodsOrderUnit": "1660555174255001712",
						"saleUnitRate": 0.1,
						"goodsOrderUnitQty": 12,
						"goodsPriceUnit": "1660555174255001888",
						"priceUnitRate": 0.3,
						"goodsPriceUnitQty": 2,
						"kaGoodsOrderUnitPrice": 23,
						"goodsOrderUnitPrice": 12,
						"taxFreeQuotation": 11,
						"taxAmount": 1,
						"taxId_ntaxrate": 0.1,
						"taxId_code": "SM1",
						"taxId": "16605551742550675",
						"quotationDiscountRate": 0.1,
						"basicQuotation": 12,
						"basicQuotationAmount": 12,
						"quotationDeduction": 0,
						"goodsOrderAmount": 13,
						"taxFreeQuotationAmount": 12,
						"kaStoreCode": "MD01",
						"kaStoreName": "门店01",
						"store_codebianma": "WD01",
						"store_name": "网点01",
						"receiveCustomer": "1660555174255005555",
						"receiver": "王长贵",
						"receiveMobile": "19800380098",
						"receiveAddress": "用友产业园",
						"store": "166055517425500156"
					}
				],
				"kaVendorName": "s1"
			}
		],
		"pageCount": "2",
		"beginPageIndex": "1",
		"endPageIndex": "2"
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
999	响应结果错误	响应结果错误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-08	
更新
返回参数 code
修改API分类

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

