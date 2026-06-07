---
title: "单次备货计划新增并发布"
apiId: "1549558487586963463"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Single Stocking Plan"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Single Stocking Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 单次备货计划新增并发布

>  请求方式	POST | Single Stocking Plan (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/order/saveSingleStockplan
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
orgId	string	否	否	采购组织ID（采购组织ID和采购组织编码不能同时为空） 示例：2670304525930752
orgId_code	string	否	否	采购组织编码（采购组织ID和采购组织编码不能同时为空） 示例：0001
transactionTypeCode	string	否	否	交易类型编码 示例：DE001
code	string	否	否	计划单号 示例：BH20220916000001
purchaseId	string	否	否	采购员人员ID 示例：2670402100941058
purchaseId_code	string	否	否	采购员人员编码 示例：0002
deptId	string	否	否	采购部门ID 示例：1486892500958314496
deptId_code	string	否	否	采购部门编码 示例：001
purchasePhone	string	否	否	采购员联系电话 示例：18632564569
supplierid	long	否	否	供应商ID（供应商ID和供应商编码不能同时为空） 示例：1245464546466
supplierid_code	string	否	否	供应商编码（供应商ID和供应商编码不能同时为空） 示例：002
billdate	string	否	否	单据日期 示例：2022-09-16
isFeedback	string	否	是	需供应商反馈（0 : 不需要;1：需要） 示例：0
currencyId	string	否	否	币种ID 示例：G001ZM0000DEFAULTCURRENCT00000000001
currencyId_code	string	否	否	币种编码 示例：CNY
memo	string	否	否	备注 示例：备注
feedbackStatus	string	否	否	反馈状态（2：无需反馈；3：待反馈） 示例：2
erpSourceHNo	string	否	否	来源单据号 示例：DCBHJH001
erpSourceHId	string	否	是	来源单据ID 示例：1002
defines	object	否	否	表头自定义项（1-60）
define1	string	否	否	表头自定义项1 示例：表头自定义项1
define2	string	否	否	表头自定义项2 示例：表头自定义项2
singlestockplanDetailList	object	否	是	物料子表数组
materialId	string	否	否	物料ID（物料ID和物料编码不能同时为空） 示例：2670420069880065
materialId_code	string	否	否	物料编码（物料ID和物料编码不能同时为空） 示例：WL001
skuId	long	否	否	sku ID 示例：2670420069880022
skuId_code	string	否	否	sku 编码 示例：001
purchaseUnitId	long	否	否	采购单位ID（采购单位ID和采购单位编码不能同时为空） 示例：2670419418665728
purchaseUnitId_code	string	否	否	采购单位编码（采购单位ID和采购单位编码不能同时为空） 示例：0001
unitId	long	否	否	计价单位ID（计价单位ID和计价单位编码不能同时为空） 示例：2670419418665728
unitId_code	string	否	否	计价单位编码（计价单位ID和计价单位编码不能同时为空） 示例：001
mainMetrologyId	string	否	否	主单位ID（主单位ID和主单位编码不能同时为空） 示例：2670419418665728
mainMetrologyId_code	string	否	否	主单位编码（主单位ID和主单位编码不能同时为空） 示例：001
purchaseNum	BigDecimal	否	是	需求数量
priceNum	BigDecimal	否	是	需求计价数量
mainNum	BigDecimal	否	是	需求主数量
purchaseExchRate	BigDecimal	否	是	采购换算率
purchaseExchRateNum	number
小数位数:8,最大长度:28	否	否	采购单位换算率分子 示例：1
purchaseExchRateDen	number
小数位数:8,最大长度:28	否	否	采购单位换算率分母 示例：1
priceExchRate	BigDecimal	否	是	计价换算率
priceExchRateNum	number
小数位数:8,最大长度:28	否	否	计价换算率分子 示例：1
priceExchRateDen	number
小数位数:8,最大长度:28	否	否	计价换算率分母 示例：1
planDeliverDate	string	否	否	期望交货日期 示例：2022-10-07
taxPrice	BigDecimal	否	否	含税单价
taxAmount	BigDecimal	否	否	含税金额
reqOrgId	string	否	否	需求组织ID 示例：2670304525930752
reqOrgId_code	string	否	否	需求组织编码 示例：001
recv_org	string	否	否	收货组织ID 示例：2670304525930752
recv_org_code	string	否	否	收货组织编码 示例：001
purMemo	string	否	否	采购方备注 示例：备注
erpSourceHNo	string	否	否	来源单据号 示例：JIHUADANHAO001
erpSourceBNo	string	否	否	来源单据行号 示例：2
erpSourceHId	string	否	是	来源单据ID 示例：1002
erpSourceBId	string	否	是	来源单据行ID 示例：1003
defines	object	否	否	表体自定义项（1-60）

## 3. 请求示例

Url: /yonbip/cpu/order/saveSingleStockplan?access_token=访问令牌
Body: {
	"orgId": "2670304525930752",
	"orgId_code": "0001",
	"transactionTypeCode": "DE001",
	"code": "BH20220916000001",
	"purchaseId": "2670402100941058",
	"purchaseId_code": "0002",
	"deptId": "1486892500958314496",
	"deptId_code": "001",
	"purchasePhone": "18632564569",
	"supplierid": 1245464546466,
	"supplierid_code": "002",
	"billdate": "2022-09-16",
	"isFeedback": "0",
	"currencyId": "G001ZM0000DEFAULTCURRENCT00000000001",
	"currencyId_code": "CNY",
	"memo": "备注",
	"feedbackStatus": "2",
	"erpSourceHNo": "DCBHJH001",
	"erpSourceHId": "1002",
	"defines": {
		"define1": "表头自定义项1",
		"define2": "表头自定义项2"
	},
	"singlestockplanDetailList": {
		"materialId": "2670420069880065",
		"materialId_code": "WL001",
		"skuId": 2670420069880022,
		"skuId_code": "001",
		"purchaseUnitId": 2670419418665728,
		"purchaseUnitId_code": "0001",
		"unitId": 2670419418665728,
		"unitId_code": "001",
		"mainMetrologyId": "2670419418665728",
		"mainMetrologyId_code": "001",
		"purchaseNum": 0,
		"priceNum": 0,
		"mainNum": 0,
		"purchaseExchRate": 0,
		"purchaseExchRateNum": 1,
		"purchaseExchRateDen": 1,
		"priceExchRate": 0,
		"priceExchRateNum": 1,
		"priceExchRateDen": 1,
		"planDeliverDate": "2022-10-07",
		"taxPrice": 0,
		"taxAmount": 0,
		"reqOrgId": "2670304525930752",
		"reqOrgId_code": "001",
		"recv_org": "2670304525930752",
		"recv_org_code": "001",
		"purMemo": "备注",
		"erpSourceHNo": "JIHUADANHAO001",
		"erpSourceBNo": "2",
		"erpSourceHId": "1002",
		"erpSourceBId": "1003",
		"defines": {
			"define1": "表体自定义项1",
			"define2": "表体自定义项2"
		}
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
code	string	否	是否成功，200表示成功 示例：200
message	string	否	返回信息 示例：单次备货计划API上传并发布成功！

## 5. 正确返回示例

{
	"code": "200",
	"message": "单次备货计划API上传并发布成功！"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
201	上传失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-21	
新增
请求参数 (4)
更新
请求参数 (13)
	2	2025-06-24	
更新
请求说明
更新
请求参数 (42)
更新
返回参数 code
更新
返回参数 message

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

