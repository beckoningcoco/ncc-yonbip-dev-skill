---
title: "价格目录查询"
apiId: "f239f3a942114a4e93ef8c4fa723e4d0"
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

# 价格目录查询

>  请求方式	POST | Price Catalog (PCS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/cpu-bi/api/apilist
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
pageIndex	long	否	是	页码 示例：1 默认值：1
pageSize	long	否	是	页大小 示例：20 默认值：10
vpurchaseOrgId_code	string	否	否	采购组织编码，如果id和编码同时存在，以id为主 示例：A0201
vpurchaseOrgId	string	否	否	采购组织id 示例：2226083767652864
nsupplierId_code	string	否	否	供应商编码，如果id和编码同时存在，以id为主 示例：S0001
vsupply_suppplyid	long	否	否	供应商id 示例：2226247430525184
vmaterialId_code	string	否	否	物料编码,不支持批量，如果id和编码同时存在，以id为主 示例：A0001
vmaterialId	long	是	否	物料id 示例：[2226161959604480]
nmatSkuId_code	string	否	否	sku编码 示例：SKU001
nmat_sku_id	string	否	否	sku主键 示例：2226161968238848
vunitId_code	string	否	否	单位编码 示例：GE
vunit_id	long	否	否	单位id 示例：2226154634858752
vcurrencyOrigin_code	string	否	否	币种简称，id和简称同时存在时，以id为主 示例：CNY
vcurrency	string	否	否	币种id 示例：2224573519352064
vaddType	string	否	否	来源单据类型：vaddType ncpoinvoice：NC发票审批价；ncpoorderprice：NC采购订单价；yccontract：普通合同；yccontract：协议合同；ysadjustprice：调价单； 示例：ysadjustprice
open_startDate_begin	string	否	否	来源单据生效时间，起始时间点 示例：2021-04-25 00:00:00
open_startDate_end	string	否	否	来源单据生效时间，结束时间点 示例：2021-04-27 23:59:59
vbusiness_type	string	否	否	业务类型：vbusiness_type 0：普通；1：VMI；2：全程委外；3：工序委外； 示例：0
queryPriceDate	string	否	否	生效时间：生效时间小于等于 这个时间点， 且 （失效日期为空，或者 失效日期不为空并大于等于这个时间点的数据），就是查询价格的生效区间，包括这个时间点的数据 示例：2021-06-17 00:00:00
vsrc_billcode	string	否	否	来源单据号 示例：TJ210426000004
enable	string	否	否	停用启用状态enable：0：停用；1：启用 示例：1
taxPriority	int	否	否	价格标识 0：含税优先 1：无税优先 示例：0
operationId	string	否	否	工序主键 示例：2226083767652864
operationCode	string	否	否	工序编码 示例：LZC001
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳(大于等于) 示例：2021-04-25 00:00:00

## 3. 请求示例

Url: /yonbip/cpu/cpu-bi/api/apilist?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 20,
	"vpurchaseOrgId_code": "A0201",
	"vpurchaseOrgId": "2226083767652864",
	"nsupplierId_code": "S0001",
	"vsupply_suppplyid": 2226247430525184,
	"vmaterialId_code": "A0001",
	"vmaterialId": [
		2226161959604480
	],
	"nmatSkuId_code": "SKU001",
	"nmat_sku_id": "2226161968238848",
	"vunitId_code": "GE",
	"vunit_id": 2226154634858752,
	"vcurrencyOrigin_code": "CNY",
	"vcurrency": "2224573519352064",
	"vaddType": "ysadjustprice",
	"open_startDate_begin": "2021-04-25 00:00:00",
	"open_startDate_end": "2021-04-27 23:59:59",
	"vbusiness_type": "0",
	"queryPriceDate": "2021-06-17 00:00:00",
	"vsrc_billcode": "TJ210426000004",
	"enable": "1",
	"taxPriority": 0,
	"operationId": "2226083767652864",
	"operationCode": "LZC001",
	"pubts": "2021-04-25 00:00:00"
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
code	long	否	状态码 示例：200
message	string	否	消息 示例：操作成功
data	object	否	返回数据
pageIndex	long	否	页码索引 示例：1
pageSize	long	否	页大小 示例：20
recordCount	long	否	数据总数 示例：0
recordList	object	是	返回结果数据集
pageCount	long	否	页数 示例：0
beginPageIndex	long	否	开始页数 示例：1
endPageIndex	long	否	截止页数 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"taxPriority": 0,
				"vunit_name": "只",
				"currency_priceDigit": 2,
				"vsrc_billcode": "TJ210426000004",
				"vtax_items_code": "VAT6",
				"vsupply_name": "供应商1",
				"vsupplyCode": "d001000181",
				"vbelong_org_name": "bx-维修组织",
				"vmat_sku_code": "000003",
				"ntax": 6,
				"nprice": 123214,
				"dbilldate": "2021-04-26 10:27:47",
				"vcurrency": "2224573519352064",
				"nprice_origin": 123214,
				"nprice_notax_origin": 116239.62,
				"vmaterial_name": "03bx-浮动物料",
				"enable": 1,
				"vmaterial_id": 2226161959604480,
				"nbelong_org_id": "2226106422841856",
				"vpurchase_org_id": "2226083767652864",
				"vpurchase_org_code": "sl01",
				"id": 4041301,
				"vprice_invalidate": "",
				"vtax_items_id": "2224573525201154",
				"vcurrencyOriginName": "人民币",
				"nsum_start": 0,
				"create_time": "2021-04-26 10:27:49",
				"vbusiness_type": "0",
				"vadd_type": "ysadjustprice",
				"vunitId": 2226154634858752,
				"vmat_sku_name": "03bx-浮动物料",
				"vcurrency_origin": "2224573519352064",
				"vmaterial_code": "000003",
				"vprice_validate": "2021-04-26 00:00:00",
				"nsupplierId": 2226247430525184,
				"nmatSkuId": 2226161968238848,
				"pubts": "2021-06-08 15:32:16",
				"vpurchase_org_name": "全职能",
				"vcurrencyName": "人民币",
				"discountTaxType": "0",
				"operationId": "2226083767652864",
				"operationCode": "LZC001",
				"operationName": "工序",
				"stopReason": "该价格的停用原因",
				"vrateTypeName": "从汇率档案获取的汇率类型名称",
				"nrateDate": "汇率日期",
				"nrate": NaN,
				"nrateOps": "汇率折算方式"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0
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
999	message或msg	根据message或msg提示修改

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-06	
更新
请求参数 vbusiness_type
 YCGYS-77335 只做后端请求变更就可以，请求路径和完整发布地址不能改变
	2	2025-10-27	
更新
请求说明
更新
返回参数 nrateOps
返回结果示例
	3	2025-08-29	
更新
请求参数 vbusiness_type
新增
返回参数 (5)
返回字段新增汇率相关

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

