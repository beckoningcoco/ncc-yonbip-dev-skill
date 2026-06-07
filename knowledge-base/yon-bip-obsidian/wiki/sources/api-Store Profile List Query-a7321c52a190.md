---
title: "店铺档案列表查询"
apiId: "a7321c52a1904c43914adf2cf51af82d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Store"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Store]
platform_version: "BIP"
source_type: community-api-docs
---

# 店铺档案列表查询

>  请求方式	POST | Store (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/storearchives/query
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
partParam	object	否	是	查询条件集合
pageSize	int	否	是	每页数据行数 示例：10
pageIndex	int	否	否	页数 默认值：1
stopstatus	string	否	是	停用状态 0-未停用，1-已停用 2-全部状态
likeValue	string	否	否	模糊查询，可根据shopCode或者shopName模糊查询

## 3. 请求示例

Url: /yonbip/sd/dst/storearchives/query?access_token=访问令牌
Body: {
	"partParam": {
		"pageSize": 10,
		"pageIndex": 0,
		"stopstatus": ""
	},
	"likeValue": ""
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
shopCode	string	否	店铺编码
shopName	string	否	店铺名称
platType	short	否	平台类型
autoMatchRefund	boolean	否	售后自动转单
isSplitRefund	short	否	退款自动拆分
org	long	否	组织ID
authStatus	short	否	授权状态
authEndTime	string	否	授权结束时间
autoMatchWarehouse	boolean	否	是否自动分仓库
autoMatchLogistics	boolean	否	是否自动分物流
autoDeliveryWarning	boolean	否	是否启动发货预警
shopNick	boolean	否	店铺昵称
taxPayer	string	否	关税承担方
invoiceType	string	否	发货模式
currency	string	否	币种
autoMatchWarehouseByInv	string	否	智能分仓库按商品匹配仓库
isModifySku	string	否	自助修改sku
is_sh_ship	string	否	是否平台仓发货店铺
isAutoAccessOrder	string	否	自动接单
isModifyAdress	string	否	自助修改地址
overTime	string	否	超时时间
isAgRefund	string	否	AG退款
autoMergerDelivery	string	否	是否自动合并发货
isProviderShop	string	否	经销商店铺
accordingTo	string	否	立账依据
stopstatus	string	否	停用状态
isSaRefund	string	否	SA退款
ys_currency	string	否	币种ID
token	string	否	授权码
refresh_token	string	否	刷新授权码
secret	string	否	密钥
appKey	string	否	应用key
pubts	string	否	时间戳
id	string	否	店铺ID
ys_customer	string	否	客户ID
returnWarehouse	string	否	退货仓库ID
ys_salesman	string	否	业务员ID
ys_department	string	否	所属部门ID
trade_transtype	string	否	订单交易类型ID
refund_transtype	string	否	退换货单交易类型ID
storevalue_transtype	string	否	储值交易类型ID
storevalue_receivable_transtype	string	否	储值应收交易类型ID
creator	string	否	创建人
createTime	string	否	创建时间
modifyTime	string	否	修改时间
modifier	string	否	修改人

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"shopCode": "",
		"shopName": "",
		"platType": 0,
		"autoMatchRefund": true,
		"isSplitRefund": 0,
		"org": 0,
		"authStatus": 0,
		"authEndTime": "",
		"autoMatchWarehouse": true,
		"autoMatchLogistics": true,
		"autoDeliveryWarning": true,
		"shopNick": true,
		"taxPayer": "",
		"invoiceType": "",
		"currency": "",
		"autoMatchWarehouseByInv": "",
		"isModifySku": "",
		"is_sh_ship": "",
		"isAutoAccessOrder": "",
		"isModifyAdress": "",
		"overTime": "",
		"isAgRefund": "",
		"autoMergerDelivery": "",
		"isProviderShop": "",
		"accordingTo": "",
		"stopstatus": "",
		"isSaRefund": "",
		"ys_currency": "",
		"token": "",
		"refresh_token": "",
		"secret": "",
		"appKey": "",
		"pubts": "",
		"id": "",
		"ys_customer": "",
		"returnWarehouse": "",
		"ys_salesman": "",
		"ys_department": "",
		"trade_transtype": "",
		"refund_transtype": "",
		"storevalue_transtype": "",
		"storevalue_receivable_transtype": "",
		"creator": "",
		"createTime": "",
		"modifyTime": "",
		"modifier": ""
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
999	获取店铺数据异常	检查入参数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 pageSize
更新
请求参数 stopstatus
更新
请求参数 pageIndex
新增
返回参数 (31)
更新
返回参数 (15)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

