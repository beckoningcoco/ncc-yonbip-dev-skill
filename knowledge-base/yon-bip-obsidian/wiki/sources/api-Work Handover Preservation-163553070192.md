---
title: "工作移交保存"
apiId: "1635530701928923145"
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

# 工作移交保存

>  请求方式	POST | Work Handover (CRM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/crm/workhandover/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	单据数据
id	string	否	否	单据主键，新增时不传，更新时传 示例：2174983121100865567
code	string	否	是	单据编码，当勾选自动编码且勾选手动可改时以填入值为准，未勾选手动可改时填入值不生效 示例：20250101001
bustype	string	否	是	交易类型ID，支持传入id或者code 示例：1567036161096941835
creatorId	string	否	否	创建人ID 示例：1567063236583358465
effectiveMode	string	否	是	生效方式（0：审核生效；1：移交人员停用生效；2：生效日期生效） 示例：0
effectiveDate	date
格式:yyyy-MM-dd	否	否	生效日期，当生效方式选择“生效日期生效”时需填写 示例：2025-01-15
hanOverDate	date
格式:yyyy-MM-dd	否	是	单据日期 示例：2025-01-09
org	string	否	是	申请组织，支持传入id或者code 示例：1567050927217049609
ower	string	否	是	申请人，支持传入id或者code 示例：1567062987461099526
dept	string	否	否	申请部门，支持传入id或者code 示例：1570721500729180162
oldOwner	string	否	是	移交人，支持传入id或者code 示例：689456edcfcf11edae1008c0ebd50df6
oldOwnerOrg	string	否	是	移交组织，支持传入id或者code 示例：1567050111173263368
oldOwnerDept	string	否	否	移交部门，支持传入id或者code 示例：1567051571443269632
oldOwnerArea	string	否	否	移交销售区域，支持传入id或者code 示例：1567051571443269632
oldCust	string	否	否	移交伙伴，支持传入id或者code，伙伴内移交或跨伙伴移交时需填写 示例：1567051571443269632
oldPartnerPerson	string	否	否	移交伙伴负责人，支持传入id或者code，伙伴内移交时需填写 示例：1567051571443269632
newOwner	string	否	是	接收人，支持传入id或者code 示例：6894a89bcfcf11edae1008c0ebd50df6
newOwnerOrg	string	否	是	接收组织，支持传入id或者code 示例：1567050111173263368
newOwnerDept	string	否	是	接收部门，支持传入id或者code 示例：1567051571443269632
newOwnerArea	string	否	否	接收销售区域，支持传入id或者code 示例：1567051571443269632
newCust	string	否	否	接收伙伴，支持传入id或者code，伙伴内移交或跨伙伴移交时需填写 示例：1567051571443269632
newPartnerPerson	string	否	否	接收伙伴负责人，支持传入id或者code，伙伴内移交时需填写 示例：1567051571443269632
handOverMode	string	否	是	移交方式（0：全部移交；1按明细移交） 示例：0
handOverRole	string	否	是	移交角色，多选时用逗号分隔（0：负责人；1：参与人；2：伙伴；3：伙伴负责人） 示例：0
participantRange	string	否	否	参与人数据范围（0：移交组织；1：所有组织） 示例：0 默认值：0
handoverOrgCustomerStop	boolean	否	否	移交组织客户停用 示例：false 默认值：false
customerAssociatedData	boolean	否	否	同步移交客户关联的数据 示例：false 默认值：false
range_cust	boolean	否	否	移交范围-客户 示例：true 默认值：false
range_contact	boolean	否	否	移交范围-联系人 示例：false 默认值：false
range_clue	boolean	否	否	移交范围-线索 示例：false 默认值：false
range_oppt	boolean	否	否	移交范围-商机 示例：false 默认值：false
range_contendquotation	boolean	否	否	移交范围-竞品采集 示例：false 默认值：false
range_activity	boolean	否	否	移交范围-营销活动 示例：false 默认值：false
range_terminal	boolean	否	否	移交范围-终端 示例：false 默认值：false
range_sales_area	boolean	否	否	移交范围-销售范围 示例：false 默认值：false
range_perf_result	boolean	否	否	移交范围-业绩确认 示例：false 默认值：false
range_tender_sheet	boolean	否	否	移交范围-投标单 示例：false 默认值：false
range_cust_sub_cust	boolean	否	否	移交范围-客户的下级客户 示例：false 默认值：false
range_cust_sub_terminal	boolean	否	否	移交范围-客户的下级终端 示例：false 默认值：false
workHandOverCustDetailList	object	是	否	工作移交客户明细，移交方式为按明细移交并且移交范围选择客户时需填写
workHandOverContactDetailList	object	是	否	工作移交联系人明细，移交方式为按明细移交并且移交范围选择联系人时需填写
workHandOverClueDetailList	object	是	否	工作移交线索明细，移交方式为按明细移交并且移交范围选择线索时需填写
workHandOverOpptDetailList	object	是	否	工作移交商机明细，移交方式为按明细移交并且移交范围选择商机时可填写
workHandOverOpptReportDetailList	object	是	否	工作移交商机报备明细，移交方式为按明细移交并且移交范围选择商机时可填写
workHandOverQuotationDetailList	object	是	否	工作移交竞品采集明细，移交方式为按明细移交并且移交范围选择竞品采集时需填写
workHandOverMarketingplanDetailList	object	是	否	工作移交营销方案明细，移交方式为按明细移交并且移交范围选择营销活动时可填写
workHandOverActivityDetailList	object	是	否	工作移交营销活动明细，移交方式为按明细移交并且移交范围选择营销时可填写
workHandOverSummaryDetailList	object	是	否	工作移交活动小结明细，移交方式为按明细移交并且移交范围选择营销活动时可填写
workHandOverTerminalDetailList	object	是	否	工作移交终端明细，移交方式为按明细移交并且移交范围选择终端时需填写
workHandOverSalesAreaDetailList	object	是	否	工作移交销售范围明细，移交方式为按明细移交并且移交范围选择销售范围时需填写
workHandOverPerformanceApplyDetailList	object	是	否	工作移交业绩确认申请明细，移交方式为按明细移交并且移交范围选择业绩确认时可填写
workHandOverPerformanceResultDetailList	object	是	否	工作移交业绩确认结果明细，移交方式为按明细移交并且移交范围选择业绩确认时可填写
workHandOverTenderSheetDetailList	object	是	否	工作移交投标单明细，移交方式为按明细移交并且移交范围选择投标单时需填写
_status	string	否	是	保存类型，Insert：新增，Update：更新 示例：Insert

## 3. 请求示例

Url: /yonbip/crm/workhandover/save?access_token=访问令牌
Body: {
	"data": {
		"id": "2174983121100865567",
		"code": "20250101001",
		"bustype": "1567036161096941835",
		"creatorId": "1567063236583358465",
		"effectiveMode": "0",
		"effectiveDate": "2025-01-15",
		"hanOverDate": "2025-01-09",
		"org": "1567050927217049609",
		"ower": "1567062987461099526",
		"dept": "1570721500729180162",
		"oldOwner": "689456edcfcf11edae1008c0ebd50df6",
		"oldOwnerOrg": "1567050111173263368",
		"oldOwnerDept": "1567051571443269632",
		"oldOwnerArea": "1567051571443269632",
		"oldCust": "1567051571443269632",
		"oldPartnerPerson": "1567051571443269632",
		"newOwner": "6894a89bcfcf11edae1008c0ebd50df6",
		"newOwnerOrg": "1567050111173263368",
		"newOwnerDept": "1567051571443269632",
		"newOwnerArea": "1567051571443269632",
		"newCust": "1567051571443269632",
		"newPartnerPerson": "1567051571443269632",
		"handOverMode": "0",
		"handOverRole": "0",
		"participantRange": "0",
		"handoverOrgCustomerStop": false,
		"customerAssociatedData": false,
		"range_cust": true,
		"range_contact": false,
		"range_clue": false,
		"range_oppt": false,
		"range_contendquotation": false,
		"range_activity": false,
		"range_terminal": false,
		"range_sales_area": false,
		"range_perf_result": false,
		"range_tender_sheet": false,
		"range_cust_sub_cust": false,
		"range_cust_sub_terminal": false,
		"workHandOverCustDetailList": [
			{
				"id": "",
				"customer": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverContactDetailList": [
			{
				"id": "",
				"contact": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverClueDetailList": [
			{
				"id": "",
				"clue": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverOpptDetailList": [
			{
				"id": "",
				"oppt": "2180835228694609925",
				"_status": "Insert"
			}
		],
		"workHandOverOpptReportDetailList": [
			{
				"id": "",
				"opptReport": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverQuotationDetailList": [
			{
				"id": "",
				"quotation": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverMarketingplanDetailList": [
			{
				"id": "",
				"marketingplan": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverActivityDetailList": [
			{
				"id": "",
				"activity": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverSummaryDetailList": [
			{
				"id": "",
				"summary": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverTerminalDetailList": [
			{
				"id": "",
				"terminal": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverSalesAreaDetailList": [
			{
				"id": "",
				"salesArea": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverPerformanceApplyDetailList": [
			{
				"id": "",
				"performanceApply": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverPerformanceResultDetailList": [
			{
				"id": "",
				"performanceResult": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"workHandOverTenderSheetDetailList": [
			{
				"id": "",
				"tenderSheet": "2086571288028512256",
				"_status": "Insert"
			}
		],
		"_status": "Insert"
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
code	string	否	返回代码 示例：200
message	string	否	返回消息 示例：操作成功
data	object	否	返回数据
code	string	否	单据编码 示例：260104
bustype	string	否	交易类型ID 示例：1498917550392606720
effectiveMode	string	否	生效方式（0：审核生效；1：移交人员停用生效；2：生效日期生效） 示例：0
hanOverDate	date
格式:yyyy-MM-dd HH:mm:ss	否	移交日期 示例：2023-01-13 00:00:00
org	string	否	申请组织 示例：1567050927217049609
ower	string	否	申请人 示例：1567063013230903306
oldOwner	string	否	移交人 示例：1567063013230903306
oldOwnerOrg	string	否	移交组织 示例：1567050111173263368
newOwner	string	否	接收人 示例：1567063013230903306
newOwnerOrg	string	否	接收组织 示例：1567050111173263368
newOwnerDept	string	否	接收部门 示例：1567051571443269632
handOverMode	string	否	移交方式（0：全部移交；1按明细移交） 示例：0
handOverRole	string	否	移交角色，多选时用逗号分隔（0：负责人；1：参与人；2：伙伴；3：伙伴负责人） 示例：0
participantRange	string	否	参与人数据范围（0：移交组织；1：所有组织） 示例：0
handoverOrgCustomerStop	boolean	否	移交组织客户停用 示例：false
customerAssociatedData	boolean	否	同步移交客户关联的数据 示例：false
createdDetail	string	否	是否已生成明细（0：未生成；1：已生成） 示例：0
isWfControlled	boolean	否	是否使用审批流 示例：false
verifystate	number
小数位数:0,最大长度:20	否	审批状态：0-开立，1-审批中，-2审批通过，3-审批不通过，4-驳回 示例：0
range_cust	boolean	否	移交范围-客户 示例：true
range_contact	boolean	否	移交范围-联系人 示例：true
range_clue	boolean	否	移交范围-线索 示例：true
range_oppt	boolean	否	移交范围-商机 示例：true
range_contendquotation	boolean	否	移交范围-竞品采集 示例：true
range_activity	boolean	否	移交范围-营销活动 示例：true
range_terminal	boolean	否	移交范围-终端 示例：true
range_sales_area	boolean	否	移交范围-销售范围 示例：true
range_perf_result	boolean	否	移交范围-业绩确认 示例：true
range_tender_sheet	boolean	否	移交范围-投标单 示例：true
range_cust_sub_cust	boolean	否	移交范围-客户的下级客户 示例：false
range_cust_sub_terminal	boolean	否	移交范围-客户的下级终端 示例：false
range	string	否	移交范围 示例：range_contendquotation,range_clue,range_opptreport,range_oppt,range_cust,range_contact
workHandOverCustDetailList	object	是	移交客户明细
workHandOverContactDetailList	object	是	移交联系人明细
workHandOverClueDetailList	object	是	移交线索明细
workHandOverOpptReportDetailList	object	是	移交商机报备明细
workHandOverOpptDetailList	object	是	移交商机明细
workHandOverQuotationDetailList	object	是	移交竞品采集明细
workHandOverMarketingplanDetailList	object	是	移交营销方案明细
workHandOverActivityDetailList	object	是	移交营销活动明细
workHandOverSummaryDetailList	object	是	移交活动小结明细
workHandOverTerminalDetailList	object	是	移交终端明细
workHandOverSalesAreaDetailList	object	是	移交销售范围明细
workHandOverPerformanceApplyDetailList	object	是	移交业绩确认申请明细
workHandOverPerformanceResultDetailList	object	是	移交业绩确认结果明细
workHandOverTenderSheetDetailList	object	是	移交投标单明细
workHandOverRangeCountList	object	是	移交范围数据
id	number
小数位数:0,最大长度:20	否	主表ID 示例：1637574230160179200
creatorId	string	否	创建人ID 示例：2601058885911552
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2023-01-16 11:12:11
createDate	date
格式:yyyy-MM-dd HH:mm:ss	否	创建日期 示例：2023-01-16 11:12:11
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	最近变动时间戳 示例：2023-01-16 11:12:12
tenant	number
小数位数:0,最大长度:20	否	租户ID 示例：2601058755186944
yTenantId	string	否	租户ID 示例：0000KYAY7F959CQUBP0000

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "260104",
		"bustype": "1498917550392606720",
		"effectiveMode": "0",
		"hanOverDate": "2023-01-13 00:00:00",
		"org": "1567050927217049609",
		"ower": "1567063013230903306",
		"oldOwner": "1567063013230903306",
		"oldOwnerOrg": "1567050111173263368",
		"newOwner": "1567063013230903306",
		"newOwnerOrg": "1567050111173263368",
		"newOwnerDept": "1567051571443269632",
		"handOverMode": "0",
		"handOverRole": "0",
		"participantRange": "0",
		"handoverOrgCustomerStop": false,
		"customerAssociatedData": false,
		"createdDetail": "0",
		"isWfControlled": false,
		"verifystate": 0,
		"range_cust": true,
		"range_contact": true,
		"range_clue": true,
		"range_oppt": true,
		"range_contendquotation": true,
		"range_activity": true,
		"range_terminal": true,
		"range_sales_area": true,
		"range_perf_result": true,
		"range_tender_sheet": true,
		"range_cust_sub_cust": false,
		"range_cust_sub_terminal": false,
		"range": "range_contendquotation,range_clue,range_opptreport,range_oppt,range_cust,range_contact",
		"workHandOverCustDetailList": [
			{
				"customer": "1508637138584862700",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverContactDetailList": [
			{
				"contact": "1504117810908364800",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverClueDetailList": [
			{
				"clue": "1504042090612392000",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverOpptReportDetailList": [
			{
				"opptReport": "1613171591786004500",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverOpptDetailList": [
			{
				"oppt": "1504131099521974300",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverQuotationDetailList": [
			{
				"quotation": "1494682600980086800",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverMarketingplanDetailList": [
			{
				"marketingplan": "1508637138584862700",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverActivityDetailList": [
			{
				"activity": "1508637138584862700",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverSummaryDetailList": [
			{
				"summary": "1508637138584862700",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverTerminalDetailList": [
			{
				"terminal": "1508637138584862700",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverSalesAreaDetailList": [
			{
				"salesArea": "1508637138584862700",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverPerformanceApplyDetailList": [
			{
				"performanceApply": "1508637138584862700",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverPerformanceResultDetailList": [
			{
				"performanceResult": "1508637138584862700",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverTenderSheetDetailList": [
			{
				"tenderSheet": "1508637138584862700",
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"workHandOverRangeCountList": [
			{
				"handOverBillNo": "sfa.clue.Clue",
				"handOverBillName": "线索",
				"handOverPrincipalCount": 1,
				"handOverParticipantCount": 0,
				"handOverAllCount": 1,
				"realPrincipalCount": 0,
				"realParticipantCount": 0,
				"realAllCount": 0,
				"handOverStatus": 0,
				"id": 1637574230160179200,
				"workHandOverApplyId": 1637574230160179200,
				"pubts": "2023-01-16 11:12:12",
				"tenant": 2601058755186944,
				"yTenantId": "0000KYAY7F959CQUBP0000"
			}
		],
		"id": 1637574230160179200,
		"creatorId": "2601058885911552",
		"createTime": "2023-01-16 11:12:11",
		"createDate": "2023-01-16 11:12:11",
		"pubts": "2023-01-16 11:12:12",
		"tenant": 2601058755186944,
		"yTenantId": "0000KYAY7F959CQUBP0000"
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
090-501-101845	交易类型必填	需要填写交易类型

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

