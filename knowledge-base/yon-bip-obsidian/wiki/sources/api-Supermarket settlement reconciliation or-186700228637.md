---
title: "商超结算对账原单保存"
apiId: "1867002286379106305"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supermarket Marketing Settlement & Reconciliation Original Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supermarket Marketing Settlement & Reconciliation Original Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 商超结算对账原单保存

>  请求方式	POST | Supermarket Marketing Settlement & Reconciliation Original Document (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/api/ka/kasettlementreconciliation/save
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
data	object	是	是	数据节点
ylCode	string	否	否	集成方案编码 示例：yl_ka_settlement_reconciliation_plan
code	string	否	否	商超结算单号 示例：SET202311210001
kaAccountCode	string	否	否	抓单账号 示例：drfbj
kaSettlementDate	string	否	否	账单日期 示例：2023-10-24
kaReconciliationCycle	string	否	否	对账周期 示例：2023-09-01~2023-09-30
kaSettlementCycle	string	否	否	结算周期 示例：2023-09-01~2023-09-30
kaReconciliationStartDate	string	否	否	对账开始日期 示例：2023-09-01
kaReconciliationEndDate	string	否	否	对账结束日期 示例：2023-09-01
kaSettlementMain	string	否	否	结算主体 示例：大润发
kaVendorCode	string	否	否	供应商编码 示例：C12
kaVendorName	string	否	否	供应商名称 示例：华润
kaReceiptTotalAmount	BigDecimal	否	否	入库总金额 示例：2000
kaReturnTotalAmount	BigDecimal	否	否	退货总金额 示例：2000
kaSettlementTotalAmount	BigDecimal	否	否	结算总金额 示例：2000
kaInvoiceTotalAmount	number
小数位数:8,最大长度:20	否	否	票扣总金额 示例：200
kaAccountTotalAmount	number
小数位数:8,最大长度:20	否	否	账扣总金额 示例：2000
kaInvoiciableTotalAmount	BigDecimal	否	否	应开票总金额 示例：2000
kaPayableTotalAmount	BigDecimal	否	否	应支付总金额 示例：2000
remarks	string	否	否	备注 示例：这里是备注
asyncKey	string	否	否	异步key 示例：fetch_30F5D694-B8DD-EFD3-AE32-718F662CB6B1
origFetchUser	string	否	否	原始抓单人 示例：1660555174255001605
receivings	object	是	否	收货明细
returnings	object	是	否	退货明细
costs	object	是	否	费用明细

## 3. 请求示例

Url: /yonbip/sd/api/ka/kasettlementreconciliation/save?access_token=访问令牌
Body: {
	"data": [
		{
			"ylCode": "yl_ka_settlement_reconciliation_plan",
			"code": "SET202311210001",
			"kaAccountCode": "drfbj",
			"kaSettlementDate": "2023-10-24",
			"kaReconciliationCycle": "2023-09-01~2023-09-30",
			"kaSettlementCycle": "2023-09-01~2023-09-30",
			"kaReconciliationStartDate": "2023-09-01",
			"kaReconciliationEndDate": "2023-09-01",
			"kaSettlementMain": "大润发",
			"kaVendorCode": "C12",
			"kaVendorName": "华润",
			"kaReceiptTotalAmount": 2000,
			"kaReturnTotalAmount": 2000,
			"kaSettlementTotalAmount": 2000,
			"kaInvoiceTotalAmount": 200,
			"kaAccountTotalAmount": 2000,
			"kaInvoiciableTotalAmount": 2000,
			"kaPayableTotalAmount": 2000,
			"remarks": "这里是备注",
			"asyncKey": "fetch_30F5D694-B8DD-EFD3-AE32-718F662CB6B1",
			"origFetchUser": "1660555174255001605",
			"receivings": [
				{
					"kaSettlementCode": "SET202311210002",
					"kaSettlementLineno": "10",
					"kaBusinessTime": "2023-10-24 12:00:00",
					"kaContractCode": "ContractNo1",
					"kaExaminGoodsCode": "YS10070001",
					"kaOrderCode": "DH10070002",
					"kaBillType": "结算单",
					"kaExpenseType": "费用类型1",
					"kaSettlementMode": "结算方式1",
					"kaStoreCode": "wem0001",
					"kaStoreName": "沃尔玛-用友店",
					"kaGoodsCode": "p0001",
					"kaGoodsName": "苹果",
					"kaGoodsReceivingUnit": "个",
					"kaGoodsReceivingQty": 2000,
					"kaGoodsReceivingPrice": 12,
					"kaGoodsReceivingTaxFreePrice": 12,
					"kaGoodsReceivingAmount": 2000,
					"kaGoodsReceivingTaxFreeAmount": 2000,
					"kaIsGift": "0"
				}
			],
			"returnings": [
				{
					"kaSettlementCode": "SET202311210002",
					"kaSettlementLineno": "10",
					"kaBusinessTime": "2023-10-24 12:00:00",
					"kaContractCode": "ContractNo1",
					"kaReturnOrderCode": "TH10070001",
					"kaOrderCode": "YS10070001",
					"kaExpenseType": "费用类型1",
					"kaSettlementMode": "结算方式1",
					"kaStoreCode": "wem0001",
					"kaStoreName": "沃尔玛-用友店",
					"kaGoodsCode": "p0001",
					"kaGoodsName": "苹果",
					"kaGoodsReturningUnit": "个",
					"kaGoodsReturningQty": 2000,
					"kaBillType": "退货明细",
					"kaGoodsReturningPrice": 2000,
					"kaGoodsReturningTaxFreePrice": 2000,
					"kaGoodsReturningAmount": 2000,
					"kaGoodsReturningTaxFreeAmount": 2000
				}
			],
			"costs": [
				{
					"kaSettlementCode": "JSD0124",
					"kaSettlementLineno": "10",
					"kaBusinessTime": "2025-09-11",
					"kaContractCode": "HT012",
					"kaCostCode": "FY012",
					"kaOrderCode": "ORDER0123",
					"kaBillType": "费用明细",
					"kaExpenseType": "结算",
					"kaSettlementMode": "货款",
					"kaStoreCode": "S2353",
					"kaStoreName": "盒马北京",
					"kaGoodsCode": "P23e",
					"kaGoodsName": "苹果",
					"kaGoodsSettlementUnit": "斤",
					"kaGoodsSettlementQty": 123,
					"kaGoodsCostAmount": 2000,
					"kaGoodsCostTaxFreeAmount": 2000
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	number
小数位数:0,最大长度:12	否	状态码 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
count	number
小数位数:0,最大长度:12	否	总条数 示例：2
sucessCount	number
小数位数:0,最大长度:12	否	成功条数 示例：1
failCount	number
小数位数:0,最大长度:12	否	失败条数 示例：1
messages	object	是	错误信息
infos	object	是	成功信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "7800254030",
				"message": "KA抓单失败：java.lang.Integer cannot be cast to java.lang.String"
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "2600672880",
					"targetUnique": "1810619579238449159"
				},
				"asyncKey": "fetch_39FFAE61-1E88-EC09-1135-34D329969D27",
				"url": "/bi11/status/getBatchDoProcess"
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
999	响应结果错误	响应结果错误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-08	
更新
返回参数 (4)
修改API分类
	2	2025-09-25	
更新
请求说明
新增
请求参数 (35)
更新
请求参数 kaGoodsReceivingAmount
更新
请求参数 kaGoodsReturningAmount
结算单保存

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

