---
title: "定标单列表查询"
apiId: "1774982586309279750"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bid Award Document"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bid Award Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 定标单列表查询

>  请求方式	POST | Bid Award Document (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/pricedecision/blist
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
pageSize	string	否	否	一页大小 示例：10 默认值：10
pageNum	string	否	否	当前页数 示例：1 默认值：1
isSum	string	否	否	是否主表(true只返回主表，空值或false主子表一起返回) 示例：true
id	string	否	否	定标单id 示例：12412341
vbuyofferBillcode	string	否	否	询价单号 示例：XJ202301010001
subject	string	否	否	询价标题 示例：采购物资寻源
reqId	string	否	否	需求单号(采购需求id) 示例：12412412
erpSourceCode	string	否	否	ERP请购单号 示例：QG20141881
puorgDocCode	string	是	否	采购组织编码 示例：["puorg01"]
puorgDocId	string	是	否	采购组织id 示例：["1241241"]
priceStatus	string	否	否	定标单状态(数值对应状态如下：0 未生单，1 已生单，2 已推荐供应商，3 已定标，4 已流标，5 审批中，6 已审批，7 驳回终止流程，8 已推合同，25 询价终止，9 定标待公示，10 定标公示中，11 已悔标，14 订单部分删除，15 合同部分删除，16 悔标(重新寻源)，17 悔标(需求终止)，18 变更保存，12 订单已删除，13 合同已删除，26 物料已退回，27 部分下单 ) 示例：1
decideTime	string	否	否	定标时间 示例：2021-05-06 23:10:00|2021-05-08 12:09:00
createTime	string	否	否	创建时间 示例：2021-05-06 23:10:00|2021-05-08 12:09:00
auditTime	string	否	否	审批时间 示例：2021-05-06 23:10:00|2021-05-08 12:09:00
submitTime	string	否	否	提交时间 示例：2021-05-06 23:10:00|2021-05-08 12:09:00
purchaseCode	string	是	否	采购员编码 示例：["pupsn01"]
purchaseId	string	是	否	采购员id 示例：["1241241"]
reqOrgCode	string	否	否	需求组织编码 示例：reqorg01
reqOrgId	string	否	否	需求组织id 示例：124124124
reqdeptCode	string	否	否	需求部门编码 示例：reqdept01
reqdeptId	string	否	否	需求部门id 示例：12451234412
supplierDocCode	string	是	否	供应商编码 示例：["sup01"]
supplierDocId	string	是	否	供应商id 示例：["12412411"]
materialCode	string	是	否	物料编码 示例：["mt01"]
materialId	string	是	否	物料id 示例：["1241241"]
transactionTypeCode	string	否	否	交易类型编码 示例：tp01
transactionTypeId	string	否	否	交易类型id 示例：345751511
bidNumType	string	否	否	中标类型(1:现金，2:承兑，3:账期) 示例：1
reqProjectCode	string	否	否	采购需求项目编码 示例：reqpt01
reqProjectId	string	否	否	采购需求项目id 示例：5125125
fbillstatus	string	否	否	定标单审批状态(0：自由，1：审批中，2：审批通过，3：审批不通过) 示例：0

## 3. 请求示例

Url: /yonbip/cpu/pricedecision/blist?access_token=访问令牌
Body: {
	"pageSize": "10",
	"pageNum": "1",
	"isSum": "true",
	"id": "12412341",
	"vbuyofferBillcode": "XJ202301010001",
	"subject": "采购物资寻源",
	"reqId": "12412412",
	"erpSourceCode": "QG20141881",
	"puorgDocCode": [
		"puorg01"
	],
	"puorgDocId": [
		"1241241"
	],
	"priceStatus": "1",
	"decideTime": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"createTime": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"auditTime": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"submitTime": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"purchaseCode": [
		"pupsn01"
	],
	"purchaseId": [
		"1241241"
	],
	"reqOrgCode": "reqorg01",
	"reqOrgId": "124124124",
	"reqdeptCode": "reqdept01",
	"reqdeptId": "12451234412",
	"supplierDocCode": [
		"sup01"
	],
	"supplierDocId": [
		"12412411"
	],
	"materialCode": [
		"mt01"
	],
	"materialId": [
		"1241241"
	],
	"transactionTypeCode": "tp01",
	"transactionTypeId": "345751511",
	"bidNumType": "1",
	"reqProjectCode": "reqpt01",
	"reqProjectId": "5125125",
	"fbillstatus": "0"
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
code	string	否	状态码 示例：200
data	object	否	返回数据
pageCount	int	否	总页数 示例：2
pageIndex	int	否	当前页码 示例：1
recordCount	int	否	结果总数 示例：15
pageSize	int	否	页面大小 示例：10
endPageIndex	int	否	最后页码 示例：2
beginPageIndex	int	否	开始页码 示例：1
recordList	object	是	定标单列表

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageCount": 2,
		"pageIndex": 1,
		"recordCount": 15,
		"pageSize": 10,
		"endPageIndex": 2,
		"beginPageIndex": 1,
		"recordList": [
			{
				"id": 124124124,
				"vbuyofferBillcode": "XJ202301010001",
				"subject": "采购物资寻源",
				"priceStatus": "1/2/3...",
				"puorgDocId_name": "名称",
				"puorgDocId": "15151",
				"decideTime": "2023-01-11 11:48:56",
				"totalAmount": 11,
				"noTaxAmount": 11,
				"purchaseId_name": "张三",
				"material_name": "物料",
				"buyofferType": "1",
				"decideReson": "阿萨的",
				"transactionTypeName": "默认交易类型",
				"material_code": "DJDSPSC000027",
				"material_desc": "描述描述",
				"supplierDoc_code": "sl622994",
				"supplierDoc_name": "江阴市澄江街道泽林蔬菜食品商行",
				"purchaseNum": 11,
				"purchaseunitid_name": "斤",
				"taxrate": "13",
				"quotaPrice": 11,
				"noTaxPrice": 11,
				"quotaMoney": 11,
				"noTaxMoney": 11,
				"bidNumType": "1/2/3",
				"deliveryDate": "2023-01-11 00:00:00",
				"stockCycle": "30",
				"shelfLife": "30",
				"supplyPayment": "ssshuoming",
				"supplyOfferdes": "ssshuoming",
				"supplyDelivery": "ssshuoming",
				"reqOrgName": "江阴国际大酒店有限公司",
				"receiveOrgName": "江阴国际大酒店有限公司",
				"materialModelDescription": "Φ18X0.7,L=7255MM",
				"materialModel": "C0000-9140_间冷系统换热管用不锈钢管采购技术规范_C版",
				"buyofferdetailPurchaseAmount": 11,
				"buyofferdetailUnit": "片",
				"reqProjectName": "projecthaojf080706",
				"quotaNum": 11,
				"qtCurrencyNameDiwork": "人民币",
				"puorgDocName": "江苏双良冷却系统有限公司",
				"status": "1/2/3...",
				"shelfPeriod": "1",
				"supplierDoc_id": 1780011348752597000,
				"reqOrgId": "1779563254815129603",
				"reqdeptId": "1779577170524372994",
				"fbillstatus": "0/1/2/3",
				"currencyName": "人民币",
				"currencyTypeSign": "¥",
				"decideUserName": "钟杰豪",
				"contact": "钟杰豪",
				"phone": "13646162383"
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
999	查询失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-04-16	
新增
请求参数 isSum

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

