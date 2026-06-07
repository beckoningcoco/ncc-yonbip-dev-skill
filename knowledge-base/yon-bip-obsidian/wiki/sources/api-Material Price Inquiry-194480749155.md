---
title: "物料价格查询"
apiId: "1944807491550314504"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Catalog"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Catalog]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料价格查询

>  请求方式	POST | Price Catalog (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/query/materialPrice
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
orgId	string	否	否	采购组织主键,主键或者编码二者之一必输
orgCode	string	否	否	采购组织编码,支持code转换为采购组织进行查询 当采购组织主键不为空时，本查询条件无效
currency	string	否	否	币种主键,主键或者编码二者之一必输
currencyCode	string	否	否	币种简称,当币种主键不为空，本查询条件无效
vbusinessType	string	否	是	业务类型,0、普通 1、VMI 2、全程委外 3、工序委外 4、工程 多选以“,”分割，形如：1,2,3
priceSource	string	否	是	价格来源,1、价格调整单 2、普通合同 3、协议合同 4、寻源定标价（含询价定标、招标定标、竞拍定标） 不能为空。多选以“,”号分割。形如：1,2,3,4
getPriceFormatDate	string	否	是	取价日期,一般为下单日期或者查询日期。格式为：‘yyyy-mm-dd’。例如：2023-12-30。 取价日期>=价格生效日期。只判断年月日，时分秒不纳入计算。如果价格生效日期含时分秒，则格式化日期后计算
priceType	string	否	是	价格处理方式,1、供应商最新价格；2、供应商最新价格的最低价。
queryPriceUniqueKey	string	否	是	取价唯一标识,用于请求价格后匹配返回价格。要求本次请求内唯一
materialId	string	否	否	物料主键,主键或者编码二者之一必输
materialCode	string	否	否	物料编码,当物料主键不为空时，本查询条件无效
unit	string	否	否	计价单位主键,主键或者编码二者之一必输
unitCode	string	否	否	计价单位编码,当计价单位不为空，本查询条件无效
num	number
小数位数:8,最大长度:16	否	是	本次下单数量,对应计价单位 价格目录.数量起<=本次下单数量<价格目录.数量止

## 3. 请求示例

Url: /yonbip/cpu/query/materialPrice?access_token=访问令牌
Body: [{
	"orgId": "",
	"orgCode": "",
	"currency": "",
	"currencyCode": "",
	"vbusinessType": "",
	"priceSource": "",
	"getPriceFormatDate": "",
	"priceType": "",
	"queryPriceUniqueKey": "",
	"materialId": "",
	"materialCode": "",
	"unit": "",
	"unitCode": "",
	"num": 0
}]

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
code	number
小数位数:0,最大长度:6	否	服务状态码 示例：200
message	string	否	服务调用异常说明
data	object	是	数据
queryPriceUniqueKey	string	否	取价唯一标识,根据请求返回
materialId	number
小数位数:0,最大长度:16	否	物料主键,BIP物料档案主键
priceType	string	否	价格处理方式,1、供应商最新价格；2、供应商最新价格的最低价
materialPriceLineList	object	是	物料价格查询结果List，0条或者多条。如果某一物料查询失败，则返回相应的失败信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": [
		{
			"queryPriceUniqueKey": "",
			"materialId": 0,
			"priceType": "",
			"materialPriceLineList": [
				{
					"materialId": 0,
					"venderId": 0,
					"venderCode": "",
					"venderName": "",
					"vpriceValidate": "",
					"vpriceInvalidate": "",
					"vbusinessType": "",
					"priceSource": "",
					"taxPriority": "",
					"vsrcBillCode": "",
					"dbilldate": "",
					"ntax": 0,
					"npriceOrigin": 0,
					"npriceNoTaxOrigin": 0,
					"nsumStart": 0,
					"nsumEnd": 0,
					"vcurrencyOrigin": ""
				}
			]
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-28	
更新
请求参数 vbusinessType

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

