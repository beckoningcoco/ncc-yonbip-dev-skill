---
title: "委外手工核销"
apiId: "3b775b3905cc499ba932d02ef6e985ae"
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

# 委外手工核销

>  请求方式	POST | Subcontracting Settlement (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/verification/save
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
data	object	是	否	请求参数
transTypeId	string	否	否	交易类型id。若交易类型id和交易类型编码同时为空，取默认交易类型，未设置默认取第一个，若同时传入，以id为准 示例：2489190546624769
transTypeCode	string	否	否	交易类型编码。若交易类型id和交易类型编码同时为空，取默认交易类型，未设置默认取第一个，若同时传入，以id为准 示例：HX001
vouchdate	string	否	否	单据日期。为空默认取值业务日期，格式“2022-02-25” 示例：2022-02-25
lineId	long	否	是	委外入库单行id 示例：2471205665707777
remark	string	否	否	备注 示例：备注
materials	object	是	是	核销材料信息

## 3. 请求示例

Url: /yonbip/mfg/verification/save?access_token=访问令牌
Body: {
	"data": [
		{
			"transTypeId": "2489190546624769",
			"transTypeCode": "HX001",
			"vouchdate": "2022-02-25",
			"lineId": 2471205665707777,
			"remark": "备注",
			"materials": [
				{
					"lineId": 2471205665707770,
					"qty": 100
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
code	string	否	单据编号
code	string	否	单据编号
code	string	否	接口返回码，成功时返回200 示例：200
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
count	long	否	新增核销总数 示例：2
sucessCount	long	否	成功数 示例：1
failCount	long	否	失败数 示例：1
messages	string	是	失败信息汇总
infos	object	是	新增成功数据列表
failInfos	object	是	失败信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			""
		],
		"infos": [
			{
				"id": 2610124950852608,
				"orgId": "2471205665707776",
				"transTypeId": "2113001955774740",
				"vouchdate": "2022-01-18 00:00:00",
				"vendorId": 2471315499847936,
				"code": "HX20220118X10054",
				"isReturn": false,
				"sourceType": "2",
				"docType": "0",
				"verificationType": "0",
				"purinOrgId": "2471205665707776",
				"financeOrgName": "成本域校验公司",
				"financeOrgId": "2471205665707776",
				"purinrecordsId": 2489190546624769,
				"subcontractproductId": 2489184810832640,
				"purinDate": "2021-10-25 00:00:00",
				"productId": 2394918473240832,
				"materialId": 2394918491935744,
				"skuId": 2394918488543488,
				"unitId": 2305368882106624,
				"stockUnitId": 2305368882106624,
				"purinQuantity": 1,
				"purinStockQuantity": 1,
				"purinwarehouseId": 2476724435112192,
				"tenant": 2112998705172736,
				"status": 0,
				"isScrap": false,
				"isUpdateCost": false,
				"pubts": "2022-01-18 20:36:27",
				"creatorId": 2373445390029056,
				"creator": "15373088287",
				"createDate": "2022-01-18 20:36:27",
				"createTime": "2022-01-18 20:36:27",
				"verificationDetail": [
					{
						"id": 2610124950868992,
						"lineNo": 10,
						"subcontractId": 2489184810816256,
						"subcontractproductId": 2489184810832640,
						"isLast": false,
						"isBackflush": true,
						"materialOutId": 2489190585651457,
						"makeRuleCode": "materialOutToVerification",
						"source": "ustock.st_materialout",
						"verificationQuantity": 0,
						"unitUseQuantity": 1,
						"purinrecordsId": 2489190546624769,
						"materialOutQuantity": 1,
						"curVerificationStockQuantity": 1,
						"unitId": 2305368882106624,
						"stockToMain": 1,
						"pubts": "2022-01-18 20:36:27",
						"tenant": 2112998705172736,
						"curVerificationQuantity": 1,
						"sourceid": 2489190585651456,
						"ordermaterialId": 2489184810832641,
						"fixedQuantity": 0,
						"productId": 2394920756629760,
						"materialId": 2394920772342784,
						"skuId": 2394920768868608,
						"sourceautoid": 2489190585651457,
						"warehouseId": 2165045429670144,
						"upcode": "CLCK20211025000001",
						"stockOrgId": "2471205665707776",
						"stockUnitId": 2305368882106624,
						"verificationBy": "0",
						"verificationId": 2610124950852608,
						"isFromOSMIn": false,
						"isScrap": false,
						"isUpdateCost": false
					}
				]
			}
		],
		"failInfos": [
			{}
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
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
更新
请求参数 (9)
更新
返回参数 (78)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

