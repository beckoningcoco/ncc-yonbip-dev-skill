---
title: "工作移交列表查询"
apiId: "1613827020977340416"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Handover"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Handover]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作移交列表查询

>  请求方式	POST | Work Handover (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/workhandover/bill/list
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
pageSize	int	否	是	pageSize 示例：20 默认值：20
pageIndex	int	否	是	pageIndex 示例：1 默认值：1
simpleVOs	object	是	否	查询条件
field	string	否	否	可作为查询条件的参数包括{1:verifystate(单据状态[0-开立 1-审批中 2-审批通过 3-审批不通过 4-驳回]), 2:code(单据编码), 3:id(单据主键id), 4:hanOverDate(移交时间), 5:oldOwnerOrg(移交组织ID)/oldOwnerOrg.code(移交组织编码), 6: oldOwner(移交人员ID)/oldOwner.code(移交人员编码), 7:oldOwnerDept(移交部门ID)/oldOwnerDept.code(移交部门编码), 8: oldOwnerArea(移交区域ID)/oldOwnerArea.code(移交区域编码), 9:newOwnerOrg(接收组织ID)/newOwnerOrg.code(接收组织编码), 10:newOwner(接收人员ID)/newOwner.code(接收人员编码), 11:newOwnerDept(接收部门ID)/newOwnerDept.code(接收部门编码), 12:newOwnerArea(接收区域ID)/newOwnerArea.code(接收区域编码) 示例：hanOverDate
op	string	否	否	逻辑符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) 示例：between
value1	string	否	否	查询条件值1 示例：2022-12-01 00:00:00
value2	string	否	否	查询条件值2 示例：2022-12-30 23:59:59

## 3. 请求示例

Url: /yonbip/crm/workhandover/bill/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"simpleVOs": [
		{
			"field": "hanOverDate",
			"op": "between",
			"value1": "2022-12-01 00:00:00",
			"value2": "2022-12-30 23:59:59"
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
code	string	否	返回编码(200:成功，其他：失败) 示例：200
message	string	否	返回状态信息 示例：操作成功
data	object	否	返回数据
pageIndex	int	否	页数 示例：1
pageSize	int	否	条数 示例：20
recordCount	int	否	总数 示例：1
recordList	object	是	工作移交列表
pageCount	int	否	总页数 示例：1
beginPageIndex	int	否	开始页数 示例：1
endPageIndex	int	否	结束页数 示例：1

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
				"id": 1612323069384196097,
				"code": "000015",
				"creator": "李XX",
				"auditor": "李XX",
				"verifystate": 2,
				"bustype": "1529465694173266177",
				"oldOwnerOrg": "1529916339311345671",
				"oldOwnerOrg_name": "集团",
				"oldOwner": "1539576553990520843",
				"oldOwner_name": "张XX",
				"oldOwnerDept": "1539574569725591557",
				"oldOwnerDept_name": "销管一部",
				"oldOwnerArea": 1539574853184520176,
				"oldOwnerArea_name": "华北区",
				"newOwnerDeptId": "1539574853184520196",
				"newOwner": "1539575789486342158",
				"newOwner_name": "陈XX",
				"newOwnerDept_name": "业务一部",
				"newOwnerOrg": "1529916339311345671",
				"newOwnerOrg_name": "集团",
				"newOwnerArea": 1529916339311345672,
				"newOwnerArea_name": "华北区",
				"createTime": "2022-12-13 10:38:29",
				"auditTime": "2022-12-13 10:38:32",
				"hanOverDate": "2022-12-13 00:00:00",
				"pubts": "2022-12-13 10:38:32"
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (36)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

