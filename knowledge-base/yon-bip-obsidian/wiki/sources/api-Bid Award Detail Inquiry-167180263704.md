---
title: "定标单详情查询"
apiId: "1671802637048086529"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Bid Award Document"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bid Award Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 定标单详情查询

>  请求方式	GET | Bid Award Document (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/pricedecision/detailbyId/{id}
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	path	是	定标单id

## 3. 请求示例

Url: /yonbip/cpu/pricedecision/detailbyId/{id}?access_token=访问令牌

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
data	object	否	定标单
buyofferid	long	否	询价单id 示例：1785965238573596700
vbuyofferBillcode	string	否	询价单号 示例：XJD20230804000001
subject	string	否	询价标题 示例：详情查询
currencyName	string	否	币种名称 示例：人民币
purchaseId	string	否	采购员id 示例：1780158657544585223
purchaseNames	string	否	采购员名称 示例：钟杰豪
priceStatus	string	否	定标单状态（ -1：自由，0：未生单，1：已生单，2：已推荐供应商，3：已定标，4：已流标，5：审批中，6：已审批，7：驳回终止流程，8：已推合同，9：定标待公示，10：定标公示中，11：已悔标，12：订单已删除，14：订单部分删除，15：合同已删除，17：悔标(需求终止)，18：变更保存，25：询价终止，26：已退回） 示例：2
fbillstatus	string	否	定标单审批状态（0 自由；1 审批中；2 审批通过；3 审批不通过） 示例：0
transactionTypeCode	string	否	交易类型编码 示例：jylx
transactionTypeName	string	否	交易类型名称 示例：定标交易类型
noTaxAmount	BigDecimal	否	无税总金额 示例：9.91
totalAmount	BigDecimal	否	含税总金额 示例：11
buyofferType	string	否	履行方式(1:框架协议,2:普通合同,3;直接下单,4:价格调整) 示例：1
ctPurcontentType	string	否	采购内容编码 示例：1
erpBillstatus	string	否	ERP协同状态 示例：推送成功
erpResult	string	否	ERP处理结果 示例：推送erp失败，原因：
useSuggestion	string	否	各单位意见 示例：124124124
compareExchrateTypeName	string	否	比价汇率类型 示例：基准汇率
compareExchrateDate	string	否	比价汇率日期 示例：2023-01-01 11:11:11
convertTotalAmount	BigDecimal	否	折算询价币中标含税总金额 示例：110
convertNotaxTotalAmount	BigDecimal	否	折算询价币中标无税总金额 示例：99.1
decideReson	string	否	推荐理由 示例：刷卡记录方便快捷的南方
fileId	string	否	附件文件id 示例：9e5748a3-c107-4a1a-b69e-976579b04ff6
difctctx	boolean	否	供应商协定条款(true：是，false：否) 示例：false
createTime	string	否	创建时间 示例：2023-01-01 11:11:11
modifyTime	string	否	最后修改时间 示例：2023-01-01 11:11:11
auditor	string	否	审批人 示例：ihol
auditTime	string	否	审批时间 示例：2023-01-01 11:11:11
exes	object	是	合同履行方式
bodys	object	是	中标物料明细

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"buyofferid": 1785965238573596700,
		"vbuyofferBillcode": "XJD20230804000001",
		"subject": "详情查询",
		"currencyName": "人民币",
		"purchaseId": "1780158657544585223",
		"purchaseNames": "钟杰豪",
		"priceStatus": "2",
		"fbillstatus": "0",
		"transactionTypeCode": "jylx",
		"transactionTypeName": "定标交易类型",
		"noTaxAmount": 9.91,
		"totalAmount": 11,
		"buyofferType": "1",
		"ctPurcontentType": "1",
		"erpBillstatus": "推送成功",
		"erpResult": "推送erp失败，原因：",
		"useSuggestion": "124124124",
		"compareExchrateTypeName": "基准汇率",
		"compareExchrateDate": "2023-01-01 11:11:11",
		"convertTotalAmount": 110,
		"convertNotaxTotalAmount": 99.1,
		"decideReson": "刷卡记录方便快捷的南方",
		"fileId": "9e5748a3-c107-4a1a-b69e-976579b04ff6",
		"difctctx": false,
		"createTime": "2023-01-01 11:11:11",
		"modifyTime": "2023-01-01 11:11:11",
		"auditor": "ihol",
		"auditTime": "2023-01-01 11:11:11",
		"exes": [
			{
				"ctTranstypeIdName": "默认合同交易类型",
				"ctControlType": "1",
				"ctIsMaterialClass": "0",
				"settleTypeId.name": "现金返利",
				"shelfPeriod": "11",
				"workPeriod": "11",
				"ctInvoiceAgreement": "12412",
				"ctPayagreeName": "对方公司速度放缓",
				"ctPayAgreement": "lknaalk",
				"payterms": [
					{
						"id": 1785966458344308747,
						"payPeriod": 1,
						"payPointName": "不设起算日、到期日",
						"payPointAfterDay": 1,
						"payRatio": 100,
						"payTaxMoney": 11,
						"advancePay": false,
						"shelf": false,
						"settleTypeName": "现金返利",
						"memo": "备注备注"
					}
				]
			}
		],
		"bodys": [
			{
				"id": 1780060397290651600,
				"supplierDocId": 1683055691877580800,
				"supplierDocCode": "000001",
				"supplierDocName": "测试同步U9C",
				"materialCode": "u9c0101-u9c002",
				"materialName": "710W角向磨光机",
				"materialId": 1711869957452595200,
				"spec": "dsdf",
				"model": "MGJ710",
				"returnMsg": "weiweiwei",
				"invPriceExchRate": 1,
				"invPriceExchRateNum": 44,
				"invPriceExchRateDen": 22,
				"invpurexchrate": 1,
				"invpurexchrateNum": 33,
				"invpurexchrateDen": 345,
				"buyofferdetailPurchaseNum": 10,
				"purchaseUnitId": "1711869794243837961",
				"purchaseUnitCode": "BA",
				"purchaseUnitName": "把（U9C）",
				"unitid": "1711869794243837961",
				"unitCode": "BA",
				"cunit": "把（U9C）",
				"mainUnitId": "1711869794243837961",
				"mainUnitCode": "BA",
				"mainUnitName": "把（U9C）",
				"purchaseNum": 11,
				"quotaNum": 11,
				"mainNum": 11,
				"nnum": 11,
				"suppProductName": "健康良好",
				"qt_currency_id": "1671065938469322788",
				"qt_currency_type_sign": "?",
				"qt_currency_name": "人民币",
				"priceStatus": "1",
				"quotaPrice": 11,
				"taxrate": "11",
				"noTaxPrice": 9.91,
				"noTaxMoney": 99.1,
				"quotaMoney": 110,
				"reqEndTime": "2023-08-03 00:00:00",
				"convertPrice": 11,
				"convertNoTaxPrice": 9.91,
				"convertTotalPrice": 110,
				"convertNoTaxMoney": 99.1,
				"deliveryDate": "2023-08-03",
				"supplyOfferdes": "sdagfad",
				"supplyDelivery": "fghkfs",
				"memo": "拉丁化广发",
				"quotaReason": "推荐理由",
				"biLatestPdTaxPrice": 11,
				"biLatestPdSupplierName": "houwjj01",
				"biLatestPdBilldate": "2023-01-01 11:11:11",
				"biHistoryMaxPrice": 665,
				"biHistoryAveragePrice": 366.3,
				"biHistoryLowestPrice": 11,
				"ip": "10.6.213.150",
				"isReplace": true,
				"puorgDocId": "1683053441292173320",
				"puorgDocName": "SCMGC",
				"pritemid_reqUapProjectId": "1683053441292127362",
				"pritemid_reqProjectCode": "COES",
				"pritemid_reqProjectName": "课件撒",
				"reqOrgId": "1683053441292173320",
				"reqOrgName": "SCMGC",
				"receiveOrgId": "1683053441292173320",
				"receiveOrgName": "SCMGC",
				"reqErpRelatedInfo": "流口水的",
				"status": "2",
				"reqDate": "2023-01-01 11:11:11",
				"materialDesc": "MGJ710",
				"stockCycle": "1",
				"reqCodeErp": "PR2307260001",
				"reqRownoErp": "20",
				"reqdeptId": "1683053776299622407",
				"reqdeptName": "业务一部",
				"buyofferRowNo": 1
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-23	
新增
返回参数 (4)
更新
返回参数 PriceDecisionDetailFreeCharacteristics
更新
返回参数 PriceDecisionDetailDefineCharacter
	2	2025-10-14	
更新
请求说明
更新
请求参数 id
更新
请求参数 id
更新
返回参数 qt_currency_type_sign
调整请求类型改为GET
	3	2025-06-25	
更新
请求参数 id

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

