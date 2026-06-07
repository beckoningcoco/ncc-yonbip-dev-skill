---
title: "物料关联规格明细查询"
apiId: "1672556652916637702"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料关联规格明细查询

>  请求方式	POST | Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/product/spec/getspecdatabypage
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
pageIndex	long	否	否	页码 示例：1
pageSize	long	否	否	每页数量 示例：20
productIdList	long	是	否	物料id集合,与物料编码同时传参时，两者是且关联 示例：[20220620001]
productCodeList	string	是	否	物料编码集合,与物料id同时传参时，两者是且关联 示例：["20220620001"]

## 3. 请求示例

Url: /yonbip/digitalModel/product/spec/getspecdatabypage?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 20,
	"productIdList": [
		20220620001
	],
	"productCodeList": [
		"20220620001"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用完成时的返回信息 示例：操作成功
data	object	否	调用完成时的返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页数据量 示例：500
recordCount	long	否	总数量 示例：2
recordList	object	是	数据列表
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	起始页码 示例：1
endPageIndex	long	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 500,
		"recordCount": 2,
		"recordList": [
			{
				"id": 1672565629373644800,
				"productId": 1672558293594669000,
				"haveImg": true,
				"specId": 1458042372283695000,
				"lsSpecItemsId": 1458042372283695000,
				"specValue": "显31",
				"order": 1,
				"productSpecItemAlbumDTOs": [
					{
						"id": 1672565629373644800,
						"productId": 1672558293594669000,
						"productSpecItemId": 1672565629373644800,
						"productFreeCharacterItemId": 1672572320932691979,
						"folder": "https://yonbip-daily-oss.yyuap.com/a3fd494f-e034-47e3-a68e-46e743707f5b.jpg",
						"imgName": "微信图片_20230227102006.jpg"
					}
				]
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
999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。

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

