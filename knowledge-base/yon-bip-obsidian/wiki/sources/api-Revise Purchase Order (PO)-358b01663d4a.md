---
title: "修订采购订单"
apiId: "358b01663d4a45db97d53e92e63ab55d"
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

# 修订采购订单

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/puorder/revisedOrderToYC
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
accountID	string	query	是	租户ID
Body参数
名称	类型	数组	必填	描述
supplydatas	object	否	是	把仅包含pk_supplier供应商JSON Object数组转化为String后，用转换后的值填充data字段
pk_supplier	string	否	是	供应商ID
orderdatas	object	否	是	把订单表头JSON Object数组转化为String后，用转换后的值填充data字段
Id	string	否	否	云采订单主表ID
orderSourceId	string	否	是	订单主表ID
orderOtherId	string	否	是	订单主表编码
bpublish	string	否	否	是否发布订单
breleasedover	string	否	否	是否释放
erpProductVersion	string	否	否	erp版本
corpAccountid	string	否	否	采购组织ID
corpAccount	string	否	否	采购组织编码
corpAccountname	string	否	否	采购组织名称
enterpriseName	string	否	否	采购企业名称
corpSubAccount	string	否	否	外系统采购员编码
corpSubAccountid	string	否	否	外系统采购员ID
purchaseName	string	否	否	采购员名称
orderTime	string	否	否	采购日期
erpVender	string	否	是	供应商ID
memo	string	否	否	备注
subject	string	否	是	订单标题
orderno	string	否	是	云采订单编码
orderStatus	string	否	否	审核状态
creater	string	否	否	制单人
itemdatas	object	否	是	把订单子表JSON Object数组转化为String后，用转换后的值填充data字段
id	string	否	否	云采订单子表ID
orderDetailId	string	否	否	订单子表ID
orderOtherId	string	否	是	订单子表编码
quantity	string	否	否	商品数量
taxPrice	string	否	否	含税单价
taxAmount	string	否	否	含税金额
planDeliverDate	string	否	否	计划到货日期
unitid	string	否	否	单位Id
unit	string	否	否	单位
productName	string	否	否	商品名称
productId	string	否	否	商品ID
productCode	string	否	否	商品编码
taxrate	string	否	否	税率
fisactive	string	否	否	订单行激活/关闭状态
price	string	否	否	无税单价
amount	string	否	否	无税金额

## 3. 请求示例

Url: /yonbip/cpu/puorder/revisedOrderToYC?access_token=访问令牌&accountID=
Body: {
	"supplydatas": {
		"pk_supplier": ""
	},
	"orderdatas": {
		"Id": "",
		"orderSourceId": "",
		"orderOtherId": "",
		"bpublish": "",
		"breleasedover": "",
		"erpProductVersion": "",
		"corpAccountid": "",
		"corpAccount": "",
		"corpAccountname": "",
		"enterpriseName": "",
		"corpSubAccount": "",
		"corpSubAccountid": "",
		"purchaseName": "",
		"orderTime": "",
		"erpVender": "",
		"memo": "",
		"subject": "",
		"orderno": "",
		"orderStatus": "",
		"creater": ""
	},
	"itemdatas": {
		"id": "",
		"orderDetailId": "",
		"orderOtherId": "",
		"quantity": "",
		"taxPrice": "",
		"taxAmount": "",
		"planDeliverDate": "",
		"unitid": "",
		"unit": "",
		"productName": "",
		"productId": "",
		"productCode": "",
		"taxrate": "",
		"fisactive": "",
		"price": "",
		"amount": ""
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
result	string	否	描述返回状态

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
002	erp订单审批后 YC订单同步更新数据失败!	向服务方咨询
001	修订后的订单表头接收的请求数据为空,不能进行更新云采的订单	向服务方咨询

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

