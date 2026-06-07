---
title: "问题整改单列表查询"
apiId: "1581251618187771909"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Problem Remediation"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Problem Remediation]
platform_version: "BIP"
source_type: community-api-docs
---

# 问题整改单列表查询

>  请求方式	POST | Problem Remediation (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/synergy/rectificationList
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	int	否	是	页码 示例：1 默认值：1
pageSize	int	否	是	页面数据量 示例：10 默认值：10
code	string	否	否	单据编号 示例：WTZGPRCA20221107000002
vouchdate	string	否	否	单据日期 示例：2022-11-07|2022-11-09
rectificationTitle	string	否	否	整改标题 示例：问题整改但OpenApi测试
problemTime	DateTime	否	否	问题发生时间 示例：2022-11-07 10:50:27
icaRequestTime	DateTime	否	否	ICA要求时间 示例：2022-11-07 10:47:52
pcaRequestTime	DateTime	否	否	PCA要求时间 示例：2022-11-07 10:47:54
transType	string	否	否	交易类型 示例：1582753765737365511
validationResult	int	否	否	验证结果（验证不通过：0，验证通过：1） 示例：1
verifystate	int	否	否	审核状态（开立：0,审核中：1,已审核：2,审核驳回：4） 示例：0
synergyStatus	int	否	否	协同状态（待发布：10，待受理：11，待ICA反馈：12，ICA驳回：13，ICA已提交：14，待PCA反馈：15，PCA驳回：16，PCA已提交：17，完成报告：18，已执行：19，验证不通过：20，问题关闭：21） 示例：1
pubts	string	否	否	时间戳 示例：2023-12-16 23:59:59|2023-12-26 23:59:59
modifyTime	string	否	否	修改时间 示例：2023-12-16 23:59:59|2023-12-26 23:59:59
createTime	string	否	否	创建时间 示例：2023-12-16 23:59:59|2023-12-26 23:59:59
auditTime	string	否	否	审批时间 示例：2023-12-16 23:59:59|2023-12-26 23:59:59
simpleVOs	object	是	否	扩展条件
logicOp	string	否	否	逻辑连接符(and:且，or:或) 示例：or
conditions	object	是	否	查询条件

## 3. 请求示例

Url: /yonbip/cpu/synergy/rectificationList?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "WTZGPRCA20221107000002",
	"vouchdate": "2022-11-07|2022-11-09",
	"rectificationTitle": "问题整改但OpenApi测试",
	"problemTime": "2022-11-07 10:50:27",
	"icaRequestTime": "2022-11-07 10:47:52",
	"pcaRequestTime": "2022-11-07 10:47:54",
	"transType": "1582753765737365511",
	"validationResult": 1,
	"verifystate": 0,
	"synergyStatus": 1,
	"pubts": "2023-12-16 23:59:59|2023-12-26 23:59:59",
	"modifyTime": "2023-12-16 23:59:59|2023-12-26 23:59:59",
	"createTime": "2023-12-16 23:59:59|2023-12-26 23:59:59",
	"auditTime": "2023-12-16 23:59:59|2023-12-26 23:59:59",
	"simpleVOs": [
		{
			"logicOp": "or",
			"conditions": [
				{
					"field": "pubts",
					"op": "between",
					"value1": "2021-11-17 00:00:00",
					"value2": "2021-12-16 23:59:59"
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
code	string	否	响应状态码 示例：200
message	string	否	响应状态内容 示例：操作成功
data	object	否	业务数据
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页大小 示例：20
recordCount	long	否	列表行数 示例：1
recordList	object	是	列表数据
pageCount	long	否	页码总数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"returncount": 0,
				"verifystate": 0,
				"code": "WTZGPRCA20221028000001",
				"problemFinder": "头条日报VS",
				"problemLocationOccur": "吧v突然升高v突然升高突然",
				"problemTime": "2022-10-28 11:14:46",
				"supplierContact_contactmobile": "18989999104",
				"problemBriefDescription": "v而按规律太夫人",
				"vouchdate": "2022-10-28 00:00:00",
				"synergyStatus": "11",
				"emergencyLevel": "1",
				"supplier": 2766825815085312,
				"purchaser_name": "总部采购",
				"id": 3010181781901568,
				"icaRequestTime": "2022-10-28 00:07:00",
				"pubts": "2022-11-01 13:35:22",
				"supplier_name": "mdd云采测试专用供应商04",
				"purchaseOrg": "1450503124116570113",
				"identifyCause": "v而通过踏入歌坛如果",
				"creator": "昵称-yc_18989999102",
				"defectType_name": "包装",
				"importanceDegree": "2",
				"isWfControlled": 0,
				"purchaser": "1450509618123374592",
				"completionRequestTime": "2022-10-31 11:14:30",
				"problemDescription": "v二哥v夫人",
				"rectificationTitle": "测试整改拉单",
				"purchaseOrg_name": "天海总公司（mdd融合）",
				"createTime": "2022-10-28 11:15:15",
				"pcaRequestTime": "2022-10-30 11:14:27",
				"vendorTenant": "0000L2VLXM4Z7TOHKZ0000",
				"supplierContact_contactname": "gys04",
				"defectType": 1557554634366124033,
				"isClaim": true,
				"supplierContact": 2766825815085318,
				"problemType": 1557554101790179328,
				"status": 0,
				"problemType_name": "问题类型-质量"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
999	系统异常，请联系管理员查看后台日志	联系对应的开发人员

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

