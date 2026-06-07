---
title: "检定记录详情查询"
apiId: "2335397117334388743"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Record"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 检定记录详情查询

>  请求方式	POST | Inspection Record (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/verificationrecordcard/detail
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
id	string	否	否	单据ID 示例：2099205587164725249
code	string	否	否	记录单号 示例：JDJL202507010002

## 3. 请求示例

Url: /yonbip/ACC/verificationrecordcard/detail?access_token=访问令牌
Body: {
	"id": "2099205587164725249",
	"code": "JDJL202507010002"
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
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	string	否	返回结果编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pk_recorder	string	否	经办人主键 示例：2111265717973680137
verifystate	number
小数位数:0,最大长度:10	否	审批状态【0 开立，1 审批中，2 审批通过，3 流程终止，4 退回制单】 示例：2
pk_mandept__name	string	否	经办部门 示例：likun-DP.Name-01
bill_code	string	否	记录单号 示例：JDJL202504250001
pk_recorder_date	string	否	经办日期 示例：2025-04-25
total_expenses	number
小数位数:0,最大长度:10	否	费用合计 示例：0
verification_org_after__name	string	否	检定机构 示例：LIKUNTEST-天猫超市
pk_mandept	string	否	经办部门主键 示例：2111228497794433025
pk_org	string	否	资产组织主键 示例：2111225611567497225
pk_transitype	string	否	交易类型主键 示例：2107554909184851990
pk_fiorg	string	否	会计主体主键 示例：2111225611567497225
verification_org_after	string	否	检定机构主键 示例：2111295808539721736
bill_type	string	否	单据编码 示例：4A74
pk_org__pk_fiorg__currency	string	否	本币币种 示例：2107554866232033332
id	string	否	主键ID 示例：2253447767040458759
pubts	string	否	时间戳 示例：2025-04-25 07:04:12
creator__name	string	否	创建人名称 示例：LIKUN
isFlowCoreBill	boolean	否	是否流程核心单据 示例：false
tenant	string	否	租户ID 示例：0000M232Z6A20YFPC30000
userDefines__id	string	否	特征组关联ID 示例：2253447767040458771
creator	string	否	创建人ID 示例：707f7ad7-bdb5-4b4d-88a6-77663ac387aa
billmaketime	string	否	制单时间 示例：2025-04-25 07:04:08
audittime	string	否	审核时间 示例：2025-04-25 07:04:12
sysid	string	否	系统标识 示例：MIM
isWfControlled	boolean	否	是否审批流 示例：false
pk_org__name	string	否	资产组织 示例：likun-OrgName-All
pk_transitype__name	string	否	交易类型 示例：检定记录
auditor	string	否	审核人ID 示例：707f7ad7-bdb5-4b4d-88a6-77663ac387aa
auditor__name	string	否	审核人名称 示例：LIKUN
pk_org__pk_fiorg__currency__moneyDigit	string	否	本币币种精度 示例：2
billmaker__name	string	否	制单人名称 示例：LIKUN
bill_status	string	否	单据状态【0 开立，1 已审核，2 已关闭，3 审核中】 示例：1
pk_recorder__name	string	否	经办人 示例：李坤-员工-01[Myself]
billmaker	string	否	制单人主键 示例：707f7ad7-bdb5-4b4d-88a6-77663ac387aa
transi_type	string	否	交易类型编码 示例：4A74-01
creationtime	string	否	创建时间 示例：2025-04-25 07:04:08
pk_fiorg__name	string	否	会计主体 示例：likun-OrgName-All
pk_group	string	否	集团
modifier	string	否	修改人主键
modifier__name	string	否	最后修改人
modifiedtime	string	否	最后修改时间
busi_type	string	否	业务类型
check_opinion	string	否	审核意见
bizFlow	string	否	流程Id
project	string	否	项目主键
project__name	string	否	项目
wbs__name	string	否	WBS任务
wbs	string	否	WBS
activity	string	否	活动主键
activity__taskName	string	否	活动
memo	string	否	备注
ecsuiteperson	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
bodyvos	object	是	检定记录子表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pk_recorder": "2111265717973680137",
		"verifystate": 2,
		"pk_mandept__name": "likun-DP.Name-01",
		"bill_code": "JDJL202504250001",
		"pk_recorder_date": "2025-04-25",
		"total_expenses": 0,
		"verification_org_after__name": "LIKUNTEST-天猫超市",
		"pk_mandept": "2111228497794433025",
		"pk_org": "2111225611567497225",
		"pk_transitype": "2107554909184851990",
		"pk_fiorg": "2111225611567497225",
		"verification_org_after": "2111295808539721736",
		"bill_type": "4A74",
		"pk_org__pk_fiorg__currency": "2107554866232033332",
		"id": "2253447767040458759",
		"pubts": "2025-04-25 07:04:12",
		"creator__name": "LIKUN",
		"isFlowCoreBill": false,
		"tenant": "0000M232Z6A20YFPC30000",
		"userDefines__id": "2253447767040458771",
		"creator": "707f7ad7-bdb5-4b4d-88a6-77663ac387aa",
		"billmaketime": "2025-04-25 07:04:08",
		"audittime": "2025-04-25 07:04:12",
		"sysid": "MIM",
		"isWfControlled": false,
		"pk_org__name": "likun-OrgName-All",
		"pk_transitype__name": "检定记录",
		"auditor": "707f7ad7-bdb5-4b4d-88a6-77663ac387aa",
		"auditor__name": "LIKUN",
		"pk_org__pk_fiorg__currency__moneyDigit": "2",
		"billmaker__name": "LIKUN",
		"bill_status": "1",
		"pk_recorder__name": "李坤-员工-01[Myself]",
		"billmaker": "707f7ad7-bdb5-4b4d-88a6-77663ac387aa",
		"transi_type": "4A74-01",
		"creationtime": "2025-04-25 07:04:08",
		"pk_fiorg__name": "likun-OrgName-All",
		"pk_group": "",
		"modifier": "",
		"modifier__name": "",
		"modifiedtime": "",
		"busi_type": "",
		"check_opinion": "",
		"bizFlow": "",
		"project": "",
		"project__name": "",
		"wbs__name": "",
		"wbs": "",
		"activity": "",
		"activity__taskName": "",
		"memo": "",
		"ecsuiteperson": "",
		"ecsuiteuser": "",
		"bodyvos": [
			{
				"pk_ownerorg_equip": "2111225611567497225",
				"equip_extend__verification_cycle_unit": "2",
				"accuracy_level": "高级",
				"pk_equip__facturer_name": "中国工程物理研究院",
				"pk_ownerorg_equip__name": "likun-OrgName-All",
				"equip_extend__verification_method": "0",
				"pk_ownerunit_equip__name": "likun-OrgName-All",
				"pk_mandept_equip__name": "likun-DP.Name-01",
				"pk_equip__equip_code": "EAM-2025010400012917",
				"verification_date_before": "2025-10-14 00:00:00",
				"pk_ownerunit_equip": "2111225611567497225",
				"pk_manager_equip": "2111265717973680137",
				"id": "2253447767040458760",
				"pk_usedept_equip": "2111775384570167298",
				"pk_equip__model": "Model-20250102",
				"userDefines__id": "2253447767040458763",
				"uncertainty_after": "1.5",
				"verification_result_before": "0",
				"verification_expiry_date_before": "2026-10-13 00:00:00",
				"pk_equip__precoding": "CCBM-001-001",
				"equip_extend__verification_cycle": "1",
				"pk_usedept_equip__name": "likun-DP.Name-EAM",
				"verification_expiry_date_after": "2026-04-24 00:00:00",
				"verification_report_code_before": "likuntest-001-002",
				"pk_equip__spec": "Spec-20250102",
				"pk_mandept_equip": "2111228497794433025",
				"pk_usedorg_equip": "2111226814158340106",
				"verification_org_before": "2111295808539721736",
				"pk_measure_instrument_category__catalog": "称重传感器",
				"pk_category__category_name": "LIKUNTEST-大数据场景验证",
				"pk_usedorg_equip__name": "likun-OrgName-资产组织",
				"verification_result_after": "0",
				"pk_manager_equip__name": "李坤-员工-01[Myself]",
				"main_id": "2253447767040458759",
				"pk_category": "2169954109628612609",
				"pk_user_equip__name": "李大壮",
				"pk_equip": "2171350455016226841",
				"pk_measure_instrument_category": "2111289031077658676",
				"verification_report_code_after": "likun-001001",
				"pk_equip__equip_name": "likun-testCard-yonyou",
				"uncertainty_before": "1.5",
				"verification_date_after": "2025-04-25 00:00:00",
				"pk_user_equip": "2111775874201681924",
				"check_status_before": "",
				"report_code": "",
				"pk_costcenter_use__name": "",
				"pk_costcenter_use": "",
				"verification_basis": "",
				"verification_certifier": "",
				"verification_verifier": "",
				"verifier": "",
				"src_pk_bill": "",
				"src_pk_bill_b": "",
				"grandvos": [
					{
						"items_name": "检查项目001",
						"qualified": "0",
						"standard_description": "检查项目001",
						"main_id": "2253447767040458760",
						"id": "2253447767040458761",
						"verification_result": "100",
						"pubts": "2025-04-25 07:04:08",
						"tenant": "0000M232Z6A20YFPC30000",
						"memo": ""
					}
				]
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
999	报错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原因

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

