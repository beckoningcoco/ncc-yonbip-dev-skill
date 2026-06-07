---
title: "套件商品结构查询"
apiId: "8525898dfb684d97826db727c7eca743"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Suite File"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Suite File]
platform_version: "BIP"
source_type: community-api-docs
---

# 套件商品结构查询

>  请求方式	POST | Product Suite File (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/suitgoods/query
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
partParam	object	否	是	请求参数
skuCodes	string	否	否	母件skuCode，多个编码英文逗号分割
pageIndex	int	否	是	页数，起始值1
pageSize	int	否	是	每页数据条数
subskuCodes	string	否	否	子件skuCode，多个编码英文逗号分割
modifyTimeStart	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据修改起始时间
modifyTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据修改结束时间
adminOrgCode	string	否	否	管理组织编码
suiteSkuName	string	否	否	套件SKU名称，多个名称用英文逗号分隔

## 3. 请求示例

Url: /yonbip/sd/dst/suitgoods/query?access_token=访问令牌
Body: {
	"partParam": {
		"skuCodes": "",
		"pageIndex": 0,
		"pageSize": 0,
		"subskuCodes": "",
		"modifyTimeStart": "2026-06-07 13:10:03",
		"modifyTimeEnd": "2026-06-07 13:10:03",
		"adminOrgCode": "",
		"suiteSkuName": ""
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
code	int	否	返回状态码，200表示成功 示例：200
message	string	否	操作提示信息 示例：操作成功
data	object	否	data
pageIndex	int	否	页码 示例：1
pageSize	int	否	每页数据 示例：3
totalCount	int	否	查询到的数据总数 示例：1
info	object	是	返回具体数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 3,
		"totalCount": 1,
		"info": [
			{
				"id": 2471123721441536,
				"product": 2466900173115648,
				"productCode": "JHTJ002",
				"productName": "JH套件商品02",
				"productSku": 2466900178669824,
				"productSkuCode": "JHTJ002",
				"productSkuName": "JH套件商品02",
				"orgId": "2352278795260416",
				"orgCode": "LJ组织0720",
				"productClass": "LJ商品",
				"unitName": "件",
				"modifyTime": "",
				"modifier": "",
				"createTime": "",
				"creator": "",
				"subSuitGoods": [
					{
						"product": 2448392134414592,
						"productCode": "sht",
						"productName": "山核桃",
						"productSku": 2448392134414593,
						"productSkuCode": "sht_500",
						"productSkuName": "山核桃500g",
						"priceWeight": 50,
						"specs": "500g",
						"amount": 1000,
						"unitName": "克"
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
999	API查询套件商品结构异常	按照规范传入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-05	
新增
请求参数 adminOrgCode
新增
请求参数 suiteSkuName
新增
返回参数 (4)
改下名称

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

