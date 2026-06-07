---
title: "对账事项同步"
apiId: "1587971841868693506"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Reconciliation Event"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Reconciliation Event]
platform_version: "BIP"
source_type: community-api-docs
---

# 对账事项同步

>  请求方式	POST | Reconciliation Event (SCC)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/godownentry/initGodownEntryReconciliation
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	数据
bizFlowId	string	否	否	来源业务流程id 示例：11
balanceStatus	string	否	否	对账状态 -1未对账 1已对账 示例：-1 默认值：-1
bmakeuserCode	string	否	是	创建人编码 示例：hwj
dr	long	否	否	删除标识 示例：0
signpsnCode	string	否	否	签收人编码 示例：hwj
purdeptId	string	否	否	采购部门 id和code二选一必填 示例：2615818
purdeptId_code	string	否	否	采购部门编码 id和code二选一必填 示例：12
hstoName	string	否	否	仓库名称 示例：001
hstoCode	string	否	否	仓库编码 示例：001
sourceDate	string	否	否	来源单据日期 示例：1677491463950
supplyId	string	否	否	供应商 id和code二选一必填 示例：1604124621046022147
supplyId_code	string	否	否	供应商编码 id和code二选一必填 示例：cjlsup01
isSupplyContract	boolean	否	否	是否供应商协同 true -是 false-否 默认显示true 示例：true
purorgId	string	否	否	采购组织 id和code二选一必填 示例：1603550667472371714
purorgId_code	string	否	否	采购组织编码 id和code二选一必填 示例：ce
stockorgId	string	否	否	收货组织 id和code二选一必填 示例：1603550667472371714
stockorgId_code	string	否	否	收货组织编码 id和code二选一必填 示例：asd
hfanorgId	string	否	否	财务组织 id和code二选一必填 示例：1603550667472371714
hfanorgId_code	string	否	否	财务组织编码 id和code二选一必填 示例：asd
invoiceVendorId	string	否	否	开票供应商 id和code二选一必填 示例：1231241231
invoiceVendorId_code	string	否	否	开票供应商编码 id和code二选一必填 示例：qw
memo	string	否	否	备注
upcode	string	否	是	单据编码 示例：CR2023011600000012
erpGodownId	string	否	否	erp入库单主键 请求参数已存在时，删除原数据，新增请求数据。 示例：1001A210000000006UXA
purchaserId	string	否	否	采购员 id和code二选一必填 示例：12312
purchaserId_code	string	否	否	采购员编码 id和code二选一必填 示例：qw
sourceid	string	否	是	来源单据表头ID
poolType	string	否	是	对账池类型 枚举，对账来源类型：23 到货单 45 入库单 CONSUMER 消耗汇总单 MO 超市订单 WWRK 委外入库单 示例：WWRK 默认值：WWRK
transType	string	否	否	交易类型id(交易类型是对账事项本身的交易类型，请上传bip里对账事项的交易类型档案的值) 示例：123
transCode	string	否	否	交易类型编码(交易类型是对账事项本身的交易类型，请上传bip里对账事项的交易类型档案的值) 示例：9527
erpTransCode	string	否	否	ERP来源交易类型编码 示例：9527
erpTransName	string	否	否	ERP来源交易类型名称 示例：JPY
details	object	是	是	子表

## 3. 请求示例

Url: /yonbip/cpu/godownentry/initGodownEntryReconciliation?access_token=访问令牌
Body: {
	"data": [
		{
			"bizFlowId": "11",
			"balanceStatus": "-1",
			"bmakeuserCode": "hwj",
			"dr": 0,
			"signpsnCode": "hwj",
			"purdeptId": "2615818",
			"purdeptId_code": "12",
			"hstoName": "001",
			"hstoCode": "001",
			"sourceDate": "1677491463950",
			"supplyId": "1604124621046022147",
			"supplyId_code": "cjlsup01",
			"isSupplyContract": true,
			"purorgId": "1603550667472371714",
			"purorgId_code": "ce",
			"stockorgId": "1603550667472371714",
			"stockorgId_code": "asd",
			"hfanorgId": "1603550667472371714",
			"hfanorgId_code": "asd",
			"invoiceVendorId": "1231241231",
			"invoiceVendorId_code": "qw",
			"memo": "",
			"upcode": "CR2023011600000012",
			"erpGodownId": "1001A210000000006UXA",
			"purchaserId": "12312",
			"purchaserId_code": "qw",
			"sourceid": "",
			"poolType": "WWRK",
			"transType": "123",
			"transCode": "9527",
			"erpTransCode": "9527",
			"erpTransName": "JPY",
			"details": [
				{
					"arriveorderCode": "3453142132134",
					"arriveorderDetailId": "4351334234",
					"arriveorderId": "54634251345",
					"erpSourceBno": "10",
					"sourceautoid": "1001A210000000006UXB",
					"sourceid": "1001A210000000006UXA",
					"godownBdate": "1677491463950",
					"erpSourceHno": "DH2022121600000017",
					"erpSourceBid": "1001A210000000005GSQ",
					"erpSourceHid": "1001A210000000005GSP",
					"detailBalanceStatus": "-1",
					"invoicedPurNum": 0,
					"invoicedNum": 0,
					"invoicedMainNum": 0,
					"taxRate": "17",
					"taxAmount": 20.91,
					"taxPrice": 143.91,
					"taxMny": 143.91,
					"mny": 143.91,
					"price": 123,
					"priceMark": "1",
					"actualInPurNum": 1,
					"actualInNum": 1,
					"actualInMainNum": 1,
					"invPriceExchRate": 1,
					"invPriceExchRateNum": 1,
					"invPriceExchRateDen": 1,
					"invPurExchRate": 1,
					"invPurExchRateNum": 1,
					"invPurExchRateDen": 1,
					"mainUnitid": "1599314962150326280",
					"mainUnitid_code": "fdg",
					"unitid": "1599314962150326280",
					"unitid_code": "asf",
					"purUnit": "1599314962150326280",
					"purUnit_code": "sfdg",
					"materialId": "1603514710037102594",
					"materialId_code": "qewr",
					"erpGodownBrowno": "10",
					"erpGodownBid": "1001A210000000006UXB",
					"currencyId": "1599064316441526300",
					"currencyId_code": "ert",
					"changeRate": "1",
					"changestdRate": "1",
					"chargebackMny": "1",
					"chargebackTaxMny": "1",
					"checkUnit": "",
					"deliveryBrand": "dsafg",
					"deliveryMainNum": "11",
					"deliveryNum": "1",
					"deliveryPurNum": "1",
					"deliveryorderCode": "dsvf23231",
					"deliveryorderdetailId": "1231231",
					"deliveryorderId": "214332421",
					"diffReceivedNum": "1",
					"erpOrderBid": "234231",
					"erpOrderId": "43534",
					"formulaCalculation": "1324132",
					"formulaCode": "4sd",
					"formulaId": "32154123",
					"formulaShow": "",
					"invoiceBizTypeCode": "1",
					"invoicedMny": "1",
					"invoicedRealMainNum": "1",
					"invoicedTaxMny": "1",
					"mainPrice": "1",
					"mainTaxPrice": "1",
					"memo": "1",
					"orderDetailId": "12123",
					"orderId": "12431231",
					"orderCode": "1",
					"projectId": "1213",
					"projectId_code": "sdf1",
					"reqStkorgId": "213123",
					"reqStkorgId_code": "cvs11",
					"stkwhname": "sf11",
					"stkwhcode": "dwq11",
					"dr": "0",
					"erpGodownHid": "1001A210000000006UXA",
					"purchaseType": "0",
					"erpSourceBillType": "1",
					"batchno": "2",
					"taxRateId": "12312",
					"taxRateCode": "12312",
					"erpOrderCode": "DD02123455",
					"warehouseId_code": "CKBM",
					"warehouseId": "12312"
				}
			]
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
code	string	否	成功编码 示例：200
message	string	否	提示信息 示例：新增成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "新增成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
004	ERP入库单同步失败!	向服务方咨询
001	租户参数为空	向服务方咨询

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-21	
更新
请求说明
新增
请求参数 (4)
更新
请求参数 (9)
	2	2025-09-03	
新增
请求参数 warehouseId_code
新增
请求参数 warehouseId
API-对账事项同步接口表体新增仓库传递
	3	2025-06-24	
更新
请求参数 (6)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

