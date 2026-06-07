---
title: "委外核销取本单的材料出库"
apiId: "014671e97e854a67b751bb3d85ed798b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Settlement"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外核销取本单的材料出库

>  请求方式	POST | Subcontracting Settlement (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/verification/getdetails
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	委外核销单数据集
detailId	long	否	是	委外入库行id 示例：1967600514994432

## 3. 请求示例

Url: /yonbip/mfg/verification/getdetails?access_token=访问令牌
Body: {
	"data": [
		{
			"detailId": 1967600514994432
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
code	string	否	单据编号
code	string	否	单据编号
code	long	否	返回码，调用成功时返回200 示例：200
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
osmInRecord	object	是	入库核销信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"osmInRecord": [
			{
				"verificationBy": "0",
				"unitUseQuantity": 1.68367,
				"ordermaterialId": 2326383836222209,
				"fixedQuantity": 0,
				"productId": 2325569972998400,
				"materialId": 2325569983681024,
				"skuId": 2325569980780800,
				"warehouseId": 2325544527892736,
				"subcontractproductId": 2326383836222208,
				"subcontractId": 2326383836205824,
				"isUpdateCost": true,
				"isScrap": false,
				"isFromOSMIn": false,
				"isBackflush": false,
				"materialOutQuantity": 16.8367,
				"verificationQuantity": 0,
				"curVerificationQuantity": 16.8367,
				"makeRuleCode": "materialOutToVerification",
				"source": "ustock.st_materialout",
				"sourceid": 2539060247974400,
				"sourceautoid": 2539060247974401,
				"upcode": "CLCK20211129000002",
				"materialOutPubts": "2021-11-29 15:45:50",
				"sourceMainPubts": "2021-11-29 15:45:50",
				"stockOrgId": "2325505713575680",
				"materialOutId": 2539060247974401,
				"unitId": 2325530395463936,
				"stockUnitId": 2325530395463936,
				"stockToMain": 1,
				"curVerificationStockQuantity": 16.8367,
				"isLast": false,
				"rowno": 10,
				"lineNo": 10
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
0	未传入优惠券档案id	coupon_id值填写有误
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
请求参数 data
更新
请求参数 detailId
更新
返回参数 (37)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

