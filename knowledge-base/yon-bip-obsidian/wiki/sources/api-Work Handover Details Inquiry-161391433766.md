---
title: "工作移交详情查询"
apiId: "1613914337662468099"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Work Handover"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Handover]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作移交详情查询

>  请求方式	GET | Work Handover (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/workhandover/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	主键（单据id）    示例: 1498927514778075136

## 3. 请求示例

Url: /yonbip/crm/workhandover/getbyid?access_token=访问令牌&id=1498927514778075136

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
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
id	long	否	工作移交单据id 示例：1534342414878113795
code	string	否	单据编码 示例：200099
verifystate	short	否	单据状态(0-开立 1-审批中 2-审批完成 3-终止 4-驳回) 示例：1
handoverOrgCustomerStop	boolean	否	移交组织客户是否停用 示例：false
bustype	string	否	交易类型ID 示例：1498917284093624324
bustype_name	string	否	交易类型名称 示例：组织内移交
range	string	否	移交范围 示例：range_contendquotation,range_clue,range_opptreport,range_oppt,range_cust,range_contact
handOverMode	string	否	移交方式（0-全部移交 1-按明细移交） 示例：0
handOverRole	string	否	移交角色(0-负责人 1-参与人) 示例：0
hanOverDate	string	否	单据日期 示例：2022-08-30 00:00:00
pubts	string	否	时间戳 示例：2022-10-24 15:00:37
creator	string	否	创建人 示例：李XX
oldOwner	string	否	移交人ID 示例：2642126860652800
oldOwner_name	string	否	移交组织名称 示例：李XX
oldOwnerOrg	string	否	移交组织ID 示例：2603873582240000
oldOwnerOrg_name	string	否	移交组织名称 示例：北京分公司
oldOwnerDept	string	否	移交部门ID 示例：2603874896122112
oldOwnerDept_name	string	否	移交部门名称 示例：销管一部
oldOwnerArea	long	否	移交区域ID 示例：260387489611231
oldOwnerArea_name	string	否	移交区域名称 示例：华北区
newOwner	string	否	接收人ID 示例：2678856248119552
newOwner_name	string	否	接收人姓名 示例：吴XX
newOwnerOrg	string	否	接收组织ID 示例：2603873582240000
newOwnerOrg_name	string	否	接收组织名称 示例：北京分公司
newOwnerDept	string	否	接收部门ID 示例：2603875438809344
newOwnerDept_name	string	否	接收部门名称 示例：业务一部
newOwnerArea	long	否	接收区域ID 示例：2603875438804311
newOwnerArea_name	string	否	接收区域名称 示例：华北区
range_cust	boolean	否	是否移交客户 示例：true
range_contact	boolean	否	是否移交联系人 示例：true
range_clue	boolean	否	是否移交线索 示例：true
range_opptreport	boolean	否	是否移交商机报备 示例：true
range_oppt	boolean	否	是否移交商机 示例：true
range_contendquotation	boolean	否	是否移交竞品价格采集 示例：true
workHandOverClueDetailList	object	是	移交线索明细集合
workHandOverContactDetailList	object	是	移交联系人明细集合
workHandOverCustDetailList	object	是	移交客户明细集合
workHandOverOpptDetailList	object	是	移交商机明细集合
workHandOverOpptReportDetailList	object	是	移交商机报备明细集合
workHandOverQuotationDetailList	object	是	移交竞品价格采集明细集合
workHandOverRangeCountList	object	是	移交明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 1534342414878113795,
		"code": "200099",
		"verifystate": 1,
		"handoverOrgCustomerStop": false,
		"bustype": "1498917284093624324",
		"bustype_name": "组织内移交",
		"range": "range_contendquotation,range_clue,range_opptreport,range_oppt,range_cust,range_contact",
		"handOverMode": "0",
		"handOverRole": "0",
		"hanOverDate": "2022-08-30 00:00:00",
		"pubts": "2022-10-24 15:00:37",
		"creator": "李XX",
		"oldOwner": "2642126860652800",
		"oldOwner_name": "李XX",
		"oldOwnerOrg": "2603873582240000",
		"oldOwnerOrg_name": "北京分公司",
		"oldOwnerDept": "2603874896122112",
		"oldOwnerDept_name": "销管一部",
		"oldOwnerArea": 260387489611231,
		"oldOwnerArea_name": "华北区",
		"newOwner": "2678856248119552",
		"newOwner_name": "吴XX",
		"newOwnerOrg": "2603873582240000",
		"newOwnerOrg_name": "北京分公司",
		"newOwnerDept": "2603875438809344",
		"newOwnerDept_name": "业务一部",
		"newOwnerArea": 2603875438804311,
		"newOwnerArea_name": "华北区",
		"range_cust": true,
		"range_contact": true,
		"range_clue": true,
		"range_opptreport": true,
		"range_oppt": true,
		"range_contendquotation": true,
		"workHandOverClueDetailList": [
			{
				"id": 1616878681061326872,
				"clue": 1554534739684098055,
				"clue_code": "2022092600114",
				"clue_name": "线索92604"
			}
		],
		"workHandOverContactDetailList": [
			{
				"id": 1616878681061326871,
				"contact": 1578303329200504832,
				"contact_name": "测试联系人"
			}
		],
		"workHandOverCustDetailList": [
			{
				"id": 1616878681061326870,
				"customer": 1565028375553114117,
				"customer_code": "00000000000206",
				"customer_name": "商家客户0823-2"
			}
		],
		"workHandOverOpptDetailList": [
			{
				"id": 1616878681061326874,
				"oppt": 1564036581705121799,
				"oppt_code": "2022100900298",
				"oppt_name": "商机测试潜客"
			}
		],
		"workHandOverOpptReportDetailList": [
			{
				"id": 1616878681061326873,
				"opptReport": 1608626966536650761,
				"opptReport_code": "2022120801376",
				"opptReport_name": "报备1111"
			}
		],
		"workHandOverQuotationDetailList": [
			{
				"id": 161687868106165487,
				"quotation": NaN,
				"quotation_code": "2022100900001"
			}
		],
		"workHandOverRangeCountList": [
			{
				"handOverParticipantCount": 0,
				"handOverPrincipalCount": 1,
				"realParticipantCount": 0,
				"realAllCount": 0,
				"handOverStatus": "0",
				"id": 1534342414878113796,
				"handOverBillName": "线索",
				"handOverAllCount": 1,
				"handOverBillNo": "sfa.clue.Clue",
				"realPrincipalCount": 0
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

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

