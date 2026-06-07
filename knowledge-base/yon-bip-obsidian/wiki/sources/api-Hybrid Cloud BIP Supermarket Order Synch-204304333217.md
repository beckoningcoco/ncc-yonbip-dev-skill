---
title: "混合云BIP超市订单同步生成ERP订单"
apiId: "2043043332177264647"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 混合云BIP超市订单同步生成ERP订单

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/connectorMallOrder
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
requestDeptId	number
小数位数:0,最大长度:0	否	否	需求部门ID
puReqDeptCode	string	否	否	需求部门编码
puReqDeptId	string	否	否	需求部门ERP主键
purchaseOrgId	number
小数位数:0,最大长度:0	否	否	采购组织ID
puOrgCode	string	否	否	采组织编码
puOrgId	string	否	否	采购组织ERP主键
supplyDocId	number
小数位数:0,最大长度:0	否	否	供应商档案ID
supplierId	string	否	否	供应商ERP主键
requestOrgId	number
小数位数:0,最大长度:0	否	否	需求组织ID
puReqOrgCode	string	否	否	需求组织编码
puReqOrgId	string	否	否	需求组织ERP主键
supplychannel	string	否	否	渠道类型
purchaserId	number
小数位数:0,最大长度:0	否	否	采购员ID
employeeCode	string	否	否	采购员编码
purchaseDeptId	number
小数位数:0,最大长度:0	否	否	采购部门ID
puDeptCode	string	否	否	采购部门编码
puDeptId	string	否	否	采购部门ERP主键
ownerId	number
小数位数:0,最大长度:0	否	否	制单人ID
billmakerCode	string	否	否	制单用户的用户名
receiverId	number
小数位数:0,最大长度:0	否	否	收货人ID
consigneeId	string	否	否	收货人主键
consigneeCorpId	string	否	否	收货人所在ERP组织
orderDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间
bodys	object	是	否	订单子表
skucode	string	否	否	商品sku编码
materialId	string	否	否	物料ERP主键
quantity	number
小数位数:2,最大长度:0	否	否	数量
propertySelections	string	否	否	选配属性jsonarray
sourceHid	string	否	否	来源单据主表PK
sourceBid	string	否	否	来源单据子表PK
ware_name	string	否	否	商品名称
mall_orderbid	string	否	否	超市订单子表主键
purposeId	string	否	否	采购用途主键
costCenterId	string	否	否	成本中心ID
blargess	boolean	否	否	是否赠品
contractId	string	否	否	合同id
contract_billno	string	否	否	合同编码
contractBId	string	否	否	合同物料行ID
erpContractId	string	否	否	ERP合同ID
erpcontractBId	string	否	否	ERP合同行ID
materialDocId	number
小数位数:0,最大长度:0	否	否	物料ID
vmemo	string	否	否	备注
price	number
小数位数:2,最大长度:0	否	否	未税单价
amount	number
小数位数:2,最大长度:0	否	否	未税金额
tax_price	number
小数位数:2,最大长度:0	否	否	含税单价
tax_rate	number
小数位数:2,最大长度:0	否	否	税率
tax	number
小数位数:2,最大长度:0	否	否	税额
tax_amount	number
小数位数:2,最大长度:0	否	否	含税金额
sourceType	string	否	否	来源类型
planDeliverDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	计划到货日期
mall_orderCode	string	否	否	超市订单号
receiptAddress	string	否	否	收货地址json
vmemo	string	否	否	订单备注
transtypeCode	string	否	否	交易类型编码
approved	boolean	否	否	是否已审批通过
invoiceInfo	string	否	否	开票信息json
mall_orderid	string	否	否	超市订单主键
financeOrgId	number
小数位数:0,最大长度:0	否	否	财务组织ID
receiveOrgId	number
小数位数:0,最大长度:0	否	否	收货组织ID
ecOrderCode	string	否	否	电商单号

## 3. 请求示例

Url: /yonbip/cpu/connectorMallOrder?access_token=访问令牌
Body: {
	"requestDeptId": 0,
	"puReqDeptCode": "",
	"puReqDeptId": "",
	"purchaseOrgId": 0,
	"puOrgCode": "",
	"puOrgId": "",
	"supplyDocId": 0,
	"supplierId": "",
	"requestOrgId": 0,
	"puReqOrgCode": "",
	"puReqOrgId": "",
	"supplychannel": "",
	"purchaserId": 0,
	"employeeCode": "",
	"purchaseDeptId": 0,
	"puDeptCode": "",
	"puDeptId": "",
	"ownerId": 0,
	"billmakerCode": "",
	"receiverId": 0,
	"consigneeId": "",
	"consigneeCorpId": "",
	"orderDate": "2026-06-07 13:06:22",
	"bodys": [
		{
			"skucode": "",
			"materialId": "",
			"quantity": 0,
			"propertySelections": "",
			"sourceHid": "",
			"sourceBid": "",
			"ware_name": "",
			"mall_orderbid": "",
			"purposeId": "",
			"costCenterId": "",
			"blargess": true,
			"contractId": "",
			"contract_billno": "",
			"contractBId": "",
			"erpContractId": "",
			"erpcontractBId": "",
			"materialDocId": 0,
			"vmemo": "",
			"price": 0,
			"amount": 0,
			"tax_price": 0,
			"tax_rate": 0,
			"tax": 0,
			"tax_amount": 0,
			"sourceType": "",
			"planDeliverDate": "2026-06-07 13:06:22"
		}
	],
	"mall_orderCode": "",
	"receiptAddress": "",
	"vmemo": "",
	"transtypeCode": "",
	"approved": true,
	"invoiceInfo": "",
	"mall_orderid": "",
	"financeOrgId": 0,
	"receiveOrgId": 0,
	"ecOrderCode": ""
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
暂时没有数据哦~

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

