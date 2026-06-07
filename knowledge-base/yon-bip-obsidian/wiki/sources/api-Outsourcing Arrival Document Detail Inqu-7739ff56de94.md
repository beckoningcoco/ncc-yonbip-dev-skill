---
title: "委外到货单详情查询"
apiId: "7739ff56de9440e69ea54b2ba1b063bc"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Subcontracting Arrival Notice"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Arrival Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外到货单详情查询

>  请求方式	GET | Subcontracting Arrival Notice (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/arriveorder/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	委外到货单id，id和code不能同时为空    示例: 2696407171682816
code	string	query	否	委外到货单号，id和code不能同时为空    示例: WWDH202203200001

## 3. 请求示例

Url: /yonbip/mfg/arriveorder/detail?access_token=访问令牌&id=2696407171682816&code=WWDH202203200001

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
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回码，成功时返回200 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
id	long	否	单据id 示例：2696407171682816
rcvOrgId	string	否	收货组织Id 示例：2322542927713536
rcvOrgName	string	否	收货组织名称 示例：珠海工厂
orgId	string	否	委外组织Id 示例：2322542927713536
orgName	string	否	委外组织名称 示例：珠海工厂
transTypeId	string	否	交易类型Id 示例：2384748293935360
transTypeCode	string	否	交易类型编码 示例：WWDH01
transTypeName	string	否	交易类型名称 示例：委外到货
transTypeKeyField	string	否	交易类型主键字段 示例：transTypeId
status	short	否	单据状态： 0-开立，1-已审核，3-审核中 示例：0
vouchdate	string	否	到货日期 示例：2022-03-20 00:00:00
code	string	否	到货单号 示例：WWDH202203200001
subcontractVendorId	long	否	委外商Id 示例：2324971366895872
subcontractVendorName	string	否	委外商名称 示例：供应商A
departmentId	string	否	委外部门Id 示例：2322723989655808
departmentName	string	否	委外部门名称 示例：业务二部
tcId	string	否	币种Id 示例：2322393516396800
tcName	string	否	币种名称 示例：人民币
tcMoneyDigit	int	否	币种金额精度 示例：3
tcPriceDigit	int	否	币种单价精度 示例：6
fcId	string	否	本币id 示例：2322393516396800
fcName	string	否	本币名称 示例：人民币
fcMoneyDigit	int	否	本币金额精度 示例：3
fcPriceDigit	int	否	本币单价精度 示例：6
invoiceVendorId	long	否	开票委外商id 示例：2324971366895872
invoiceVendorName	string	否	开票委外商名称 示例：供应商A
tcOrgId	string	否	收票组织id 示例：2322540979148032
tcOrgName	string	否	收票组织名称 示例：集团总部
tcFCExchRateType	string	否	汇率类型id 示例：0000KQHNR7XADA8EC70000
tcFCExchRateTypeName	string	否	汇率类型名称 示例：基准汇率
tcFCExchRateTypeDigit	int	否	汇率精度 示例：6
tcFCExchRate	double	否	汇率 示例：1
totalMoneyTC	double	否	总金额 示例：7.105
taxTC	double	否	税额 示例：0.105
netMoneyTC	double	否	未税金额 示例：7
totalMoneyFC	double	否	总金额(本币) 示例：7.105
taxFC	double	否	税额(本币) 示例：0.105
netMoneyFC	double	否	未税金额(本币) 示例：7
remark	string	否	备注 示例：表头备注
creatorId	long	否	创建人Id 示例：2323534017974528
creator	string	否	创建人 示例：13662080373
createDate	string	否	创建日期 示例：2022-03-20 00:00:00
createTime	string	否	创建时间 示例：2022-03-20 19:27:13
sourceType	string	否	来源单据类型 示例：7
masterOrgKeyField	string	否	主组织字段值 示例：orgId
isWfControlled	boolean	否	是否审批流控制：true-是，false-否 示例：false
isFlowCoreBill	boolean	否	是否核心单据：true-是, false-否 示例：false
pubts	string	否	时间戳 示例：2022-03-20 19:27:17
osmArriveOrderProduct	object	是	产品行数据集
signType	int	否	签收方 示例：1
rcvCustomer	long	否	收货客户 示例：1257656456833434
rcvVendor	long	否	收货委外商 示例：18928394348348
signerEnterpriseId	long	否	签收方租户 示例：12323213213
requireSign	int	否	需要与签收方协同 示例：0
rcvAddrType	int	否	收货地址类型 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2696407171682816,
		"rcvOrgId": "2322542927713536",
		"rcvOrgName": "珠海工厂",
		"orgId": "2322542927713536",
		"orgName": "珠海工厂",
		"transTypeId": "2384748293935360",
		"transTypeCode": "WWDH01",
		"transTypeName": "委外到货",
		"transTypeKeyField": "transTypeId",
		"status": 0,
		"vouchdate": "2022-03-20 00:00:00",
		"code": "WWDH202203200001",
		"subcontractVendorId": 2324971366895872,
		"subcontractVendorName": "供应商A",
		"departmentId": "2322723989655808",
		"departmentName": "业务二部",
		"tcId": "2322393516396800",
		"tcName": "人民币",
		"tcMoneyDigit": 3,
		"tcPriceDigit": 6,
		"fcId": "2322393516396800",
		"fcName": "人民币",
		"fcMoneyDigit": 3,
		"fcPriceDigit": 6,
		"invoiceVendorId": 2324971366895872,
		"invoiceVendorName": "供应商A",
		"tcOrgId": "2322540979148032",
		"tcOrgName": "集团总部",
		"tcFCExchRateType": "0000KQHNR7XADA8EC70000",
		"tcFCExchRateTypeName": "基准汇率",
		"tcFCExchRateTypeDigit": 6,
		"tcFCExchRate": 1,
		"totalMoneyTC": 7.105,
		"taxTC": 0.105,
		"netMoneyTC": 7,
		"totalMoneyFC": 7.105,
		"taxFC": 0.105,
		"netMoneyFC": 7,
		"remark": "表头备注",
		"creatorId": 2323534017974528,
		"creator": "13662080373",
		"createDate": "2022-03-20 00:00:00",
		"createTime": "2022-03-20 19:27:13",
		"sourceType": "7",
		"masterOrgKeyField": "orgId",
		"isWfControlled": false,
		"isFlowCoreBill": false,
		"pubts": "2022-03-20 19:27:17",
		"osmArriveOrderProduct": [
			{
				"id": 2696407171699200,
				"lineNo": 10,
				"arriveOrderId": 2696407171682816,
				"demandOrgId": "2322542927713536",
				"demandOrgName": "珠海工厂",
				"productId": 2322675338465536,
				"productCode": "000002",
				"productName": "P10",
				"materialId": 2322675347313664,
				"materialCode": "000002",
				"materialName": "P10",
				"skuId": 2322675344167168,
				"skuCode": "000002",
				"skuName": "P10",
				"isPresent": false,
				"arriveQuantity": 1,
				"acceptQuantity": 1,
				"refuseQuantity": 0,
				"replenishQuantity": 0,
				"mainUnit": 2322545814343936,
				"mainUnitName": "袋",
				"mainUnitPrecision": 2,
				"mainUnitTruncationType": 0,
				"arriveSubQuantity": 1,
				"acceptSubQuantity": 1,
				"refuseSubQuantity": 0,
				"replenishSubQuantity": 0,
				"subcontractUnitId": 2322545814343936,
				"subcontractUnitName": "袋",
				"subcontractUnitPrecision": 2,
				"subcontractUnitTruncationType": 0,
				"changeRate": 1,
				"changeType": 0,
				"arriveQuantityPU": 1,
				"acceptQuantityPU": 1,
				"refuseQuantityPU": 0,
				"replenishQuantityPU": 0,
				"priceUnitId": 2322545814343936,
				"priceUnitName": "袋",
				"priceUnitPrecision": 2,
				"priceUnitTruncationType": 0,
				"subcontractToPrice": 1,
				"isBatchManage": false,
				"isExpiryDateManage": false,
				"isTaxPrice": false,
				"oriTaxUnitPrice": 7.105,
				"oriUnitPrice": 7,
				"oriMoney": 7,
				"oriSum": 7.105,
				"oriTax": 0.105,
				"taxRateId": "fd0b9b65ab7fc32fee472b161bcb5523",
				"taxRateName": "1.5%",
				"taxRate": 1.5,
				"natTaxUnitPrice": 7.105,
				"natUnitPrice": 7,
				"natMoney": 7,
				"natSum": 7.105,
				"natTax": 0.105,
				"warehousingQuantity": 0,
				"auxilaryWarehousingQuantity": 0,
				"rcvAutoVerify": false,
				"firstSource": "po_subcontract_order",
				"firstUpCode": "WWDD20210701000004",
				"firstLineNo": 10,
				"firstSourceAutoId": 2325665323176705,
				"sourceType": "7",
				"source": "po_subcontract_order",
				"sourceid": 2325665323176704,
				"upcode": "WWDD20210701000004",
				"sourceautoid": 2325665323176705,
				"makeRuleCode": "subcontractOrderToArriveOrder",
				"sourceLineNo": 10,
				"deliveryDate": "2021-07-01 00:00:00",
				"productId_reservation": false,
				"discountTaxType": "0",
				"remark": "表体备注",
				"kittingCheck": false,
				"productionType": "0",
				"OsmArriveOrderProductExt": {
					"id": 2384748293935360,
					"offChartReceipt": true
				}
			}
		],
		"signType": 1,
		"rcvCustomer": 1257656456833434,
		"rcvVendor": 18928394348348,
		"signerEnterpriseId": 12323213213,
		"requireSign": 0,
		"rcvAddrType": 1
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
0	未传入优惠券档案id	coupon_id值填写有误
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-23	
更新
请求说明
新增
返回参数 (4)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

