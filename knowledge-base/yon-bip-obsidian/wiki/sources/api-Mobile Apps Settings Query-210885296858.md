---
title: "移动应用设置查询"
apiId: "2108852968582283269"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Label App"
domain: "APS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Label App]
platform_version: "BIP"
source_type: community-api-docs
---

# 移动应用设置查询

>  请求方式	POST | Asset Label App (APS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/mobileoption/batchQuery
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
data	object	否	否	数据参数
pkOrgList	string	是	否	组织ID 示例：[9999999,898888]

## 3. 请求示例

Url: /yonbip/am/mobileoption/batchQuery?access_token=访问令牌
Body: {
	"data": {
		"pkOrgList": [
			9999999,
			898888
		]
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
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
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
code	number
小数位数:0,最大长度:10	否	返回编码,200代表成功 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	是	返回的数据
pk_org	string	否	组织ID 示例：19021390929991
data	object	否	参数集合
errorDetail	object	是	错误信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": [
		{
			"pk_org": "19021390929991",
			"data": {
				"AMC_RMMWO200": 0,
				"AMC_SIM08": 0,
				"AMC_AUM61": 0,
				"AMC_AUM60": 1,
				"AMC_SIM14": "album,file,camera,videoFromAlbum,videoFromCamera",
				"AMC_SIM05": 3,
				"AMC_SIM12": "album,file,camera,videoFromAlbum,videoFromCamera",
				"AMC_SIM09": 0,
				"AMC_SIM06": 0,
				"AMC_SIM10": 0,
				"AMC_SIM13": "album,file,camera,videoFromAlbum,videoFromCamera",
				"AMC_SIM11": 0,
				"AMC_SIM07": 0,
				"AMC_SIM15": 0,
				"AMC_SIM02": 3,
				"AMC_SIM03": "标签损坏,信号源异常,移动端异常",
				"AMC_SIM04": 30,
				"AMC_AUM13": "album,file,camera,videoFromAlbum,videoFromCamera",
				"AMC_SIM17": 1,
				"AMC_LM01": 1,
				"AMC_MAS200": "RCXJ,GZTB",
				"AMC_MAS210": "拍照人,拍照时间",
				"AMC_MAS211": "01,02",
				"AMC_SIM16": "1,2"
			}
		}
	],
	"errorDetail": [
		{}
	]
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
999	服务端逻辑异常	服务端逻辑异常

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

