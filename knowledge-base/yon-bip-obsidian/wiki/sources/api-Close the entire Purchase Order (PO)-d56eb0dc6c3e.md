---
title: "整单关闭采购订单"
apiId: "d56eb0dc6c3e4c3fb8399bea31dd9193"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# 整单关闭采购订单

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/puorder/finalCloseOrderToYC
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
supplydatas	object	是	否	supplydatas
pk_supplier	string	否	是	供应商ID 示例：供应商ID,必填
orderdatas	object	是	否	orderdatas
id	string	否	否	云采订单主表ID 示例：云采订单主表ID
orderSourceId	string	否	是	订单主表ID 示例：订单主表ID，必填
orderOtherId	string	否	否	订单主表编码 示例：订单主表编码,必填
bpublish	string	否	否	是否发布订单 示例：是否发布订单
breleasedover	string	否	否	是否释放 示例：是否释放
erpProductVersion	string	否	否	erp版本 示例：erp版本
corpAccountid	string	否	否	采购组织ID 示例：采购组织ID
corpAccount	string	否	否	采购组织编码 示例：采购组织编码
corpAccountname	string	否	否	采购组织名称 示例：采购组织名称
enterpriseName	string	否	否	采购企业名称 示例：采购企业名称
corpSubAccount	string	否	否	外系统采购员编码 示例：外系统采购员编码
corpSubAccountid	string	否	否	外系统采购员ID 示例：外系统采购员ID
purchaseName	string	否	否	采购员名称 示例：采购员名称
orderTime	string	否	否	采购日期 示例：采购日期
erpVender	string	否	是	供应商ID 示例：供应商ID,必填
memo	string	否	否	备注 示例：备注
subject	string	否	否	订单标题 示例：订单标题，必填
orderno	string	否	否	云采订单编码 示例：云采订单编码，必填
orderStatus	string	否	否	审核状态 示例：审核状态
creater	string	否	否	创建者 示例：制单人
itemdatas	object	是	否	itemdatas
id	string	否	否	云采订单子表ID 示例：云采订单子表ID
orderDetailId	string	否	否	订单子表ID 示例：订单子表ID
orderOtherId	string	否	是	订单子表编码 示例：订单子表编码,必填
quantity	string	否	否	商品数量 示例：商品数量
taxPrice	string	否	否	含税单价 示例：含税单价
taxAmount	string	否	否	含税金额 示例：含税金额
planDeliverDate	string	否	否	计划到货日期 示例：计划到货日期
unitid	string	否	否	单位Id 示例：单位Id
unit	string	否	否	单位 示例：单位
productName	string	否	否	商品名称 示例：商品名称
productId	string	否	否	商品ID 示例：商品ID
productCode	string	否	否	商品编码 示例：商品编码
taxrate	string	否	否	税率 示例：税率
fisactive	string	否	否	订单行激活/关闭状态 示例：订单行激活/关闭状态
price	string	否	否	无税单价 示例：无税单价
amount	string	否	否	无税金额 示例：无税金额

## 3. 请求示例

Url: /yonbip/cpu/puorder/finalCloseOrderToYC?access_token=访问令牌
Body: {
	"supplydatas": [
		{
			"pk_supplier": "供应商ID,必填"
		}
	],
	"orderdatas": [
		{
			"id": "云采订单主表ID",
			"orderSourceId": "订单主表ID，必填",
			"orderOtherId": "订单主表编码,必填",
			"bpublish": "是否发布订单",
			"breleasedover": "是否释放",
			"erpProductVersion": "erp版本",
			"corpAccountid": "采购组织ID",
			"corpAccount": "采购组织编码",
			"corpAccountname": "采购组织名称",
			"enterpriseName": "采购企业名称",
			"corpSubAccount": "外系统采购员编码",
			"corpSubAccountid": "外系统采购员ID",
			"purchaseName": "采购员名称",
			"orderTime": "采购日期",
			"erpVender": "供应商ID,必填",
			"memo": "备注",
			"subject": "订单标题，必填",
			"orderno": "云采订单编码，必填",
			"orderStatus": "审核状态",
			"creater": "制单人"
		}
	],
	"itemdatas": [
		{
			"id": "云采订单子表ID",
			"orderDetailId": "订单子表ID",
			"orderOtherId": "订单子表编码,必填",
			"quantity": "商品数量",
			"taxPrice": "含税单价",
			"taxAmount": "含税金额",
			"planDeliverDate": "计划到货日期",
			"unitid": "单位Id",
			"unit": "单位",
			"productName": "商品名称",
			"productId": "商品ID",
			"productCode": "商品编码",
			"taxrate": "税率",
			"fisactive": "订单行激活/关闭状态",
			"price": "无税单价",
			"amount": "无税金额"
		}
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
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
result	string	否	返回状态

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"result": ""
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
001	erp订单发布后 YC订单同步更新数据失败!	向服务方咨询

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

