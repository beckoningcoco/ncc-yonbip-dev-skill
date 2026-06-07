---
title: "升级申请详情查询"
apiId: "2542591424949387270"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Upgrade Application"
domain: "ASSAA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Upgrade Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 升级申请详情查询

>  请求方式	POST | Upgrade Application (ASSAA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/updateapply/detail
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
id	string	否	是	升级申请主表主键 示例：2286573509772050436

## 3. 请求示例

Url: /yonbip/ACC/updateapply/detail?access_token=访问令牌
Body: {
	"id": "2286573509772050436"
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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
bill_code	string	否	申请单号 示例：SJSQ202603060001
bill_date	string	否	申请时间 示例：2026-03-06
bill_status	string	否	枚举: 0 开立, 3 审核中, 1 已审核, 2 已关闭 示例：3
bill_type	string	否	单据类型 示例：5B03
bizFlow	string	否	流程Id
id	string	否	主键 示例：2487493780676018176
isFlowCoreBill	string	否	是否流程核心单据
isWfControlled	string	否	是否审批流控制 示例：1
needdept	string	否	needdept
pk_applier	string	否	申请人主键 示例：2126008562609029120
pk_applier__name	string	否	申请人 示例：HTRENT
pk_applydept	string	否	申请部门主键 示例：2116509108564656132
pk_applydept__name	string	否	申请部门 示例：技术部
pk_category	string	否	资产类别 示例：2167631382723428357
pk_equip	string	否	资产卡片 示例：2388602802932809735
pk_equip__equip_code	string	否	资产编码 示例：EAM-202510240005
pk_equip__equip_name	string	否	资产名称 示例：all-card
pk_equip__manufacture_date	date
格式:yyyy-MM-dd	否	生产日期
pk_equip__model	string	否	型号
pk_equip__pk_category__category_name	string	否	资产类别 示例：HTzu
pk_equip__pk_jobmngfil__name	string	否	项目
pk_equip__pk_location__location_name	string	否	位置 示例：HT库位
pk_equip__pk_manager__name	string	否	管理人 示例：HTRENT
pk_equip__pk_mandept__name	string	否	管理部门 示例：资产管理部
pk_equip__pk_supplier__name	string	否	供应商
pk_equip__pk_usedept__name	string	否	使用部门 示例：资产管理部
pk_equip__pk_used_status__status_name	string	否	资产状态 示例：在用
pk_equip__pk_user__name	string	否	使用人 示例：HTRENT
pk_equip__precoding	string	否	出厂编码
pk_equip__spec	string	否	规格
pk_equip__start_used_date	date
格式:yyyy-MM-dd	否	投用日期 示例：2025-10-24
pk_org	string	否	资产组织主键 示例：2113470926006779909
pk_org_repair	string	否	维修组织 示例：2113470926006779909
pk_org_repair__name	string	否	维修组织 示例：HT资产组织
pk_org__name	string	否	资产组织 示例：HT资产组织
pk_transitype	string	否	交易类型主键 示例：1547897898592632836
pk_transitype__name	string	否	交易类型 示例：升级申请
pubts	string	否	时间戳 示例：2026-03-19 11:29:13
repair_tickets	string	否	维修工单
repair_tickets_id	string	否	维修工单主键
repair_tickets_id__bill_code	string	否	维修工单
returncount	string	否	退回次数 示例：0
src_bill_type	string	否	来源单据类型
src_pk_bill	string	否	来源单据主键
src_pk_bill_b	string	否	来源单据表体主键
src_pk_transitype	string	否	来源交易类型主键
src_transitype	string	否	来源交易类型
sysid	string	否	系统标识 示例：SAA
transi_type	string	否	交易类型编码 示例：5B03-01
update_reason	string	否	升级原因
update_type	string	否	枚举: 0 技术升级, 1 零部件升级 示例：0
verifystate	string	否	枚举: 0 开立, 1 审批中, 2 审批通过, 3 流程终止, 4 退回制单 示例：1
auditor	string	否	审核人主键
auditor__name	string	否	审核人
audittime	string	否	审核时间
billmaker	string	否	制单人主键 示例：2f847281-6e57-4d90-85b7-0cc149d37667
billmaker__name	string	否	制单人 示例：HTRENT
billmaketime	string	否	制单时间 示例：2026-03-06 15:33:10
check_opinion	string	否	审核意见
creationtime	string	否	创建时间 示例：2026-03-06 15:33:10
creator	string	否	创建人主键 示例：2f847281-6e57-4d90-85b7-0cc149d37667
creator__name	string	否	创建人 示例：HTRENT
modifiedtime	string	否	最后修改时间
modifier	string	否	最后修改人主键
modifier__name	string	否	最后修改人
bodyvos	object	是	表体信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"bill_code": "SJSQ202603060001",
		"bill_date": "2026-03-06",
		"bill_status": "3",
		"bill_type": "5B03",
		"bizFlow": "",
		"id": "2487493780676018176",
		"isFlowCoreBill": "",
		"isWfControlled": "1",
		"needdept": "",
		"pk_applier": "2126008562609029120",
		"pk_applier__name": "HTRENT",
		"pk_applydept": "2116509108564656132",
		"pk_applydept__name": "技术部",
		"pk_category": "2167631382723428357",
		"pk_equip": "2388602802932809735",
		"pk_equip__equip_code": "EAM-202510240005",
		"pk_equip__equip_name": "all-card",
		"pk_equip__manufacture_date": "2026-06-07",
		"pk_equip__model": "",
		"pk_equip__pk_category__category_name": "HTzu",
		"pk_equip__pk_jobmngfil__name": "",
		"pk_equip__pk_location__location_name": "HT库位",
		"pk_equip__pk_manager__name": "HTRENT",
		"pk_equip__pk_mandept__name": "资产管理部",
		"pk_equip__pk_supplier__name": "",
		"pk_equip__pk_usedept__name": "资产管理部",
		"pk_equip__pk_used_status__status_name": "在用",
		"pk_equip__pk_user__name": "HTRENT",
		"pk_equip__precoding": "",
		"pk_equip__spec": "",
		"pk_equip__start_used_date": "2025-10-24",
		"pk_org": "2113470926006779909",
		"pk_org_repair": "2113470926006779909",
		"pk_org_repair__name": "HT资产组织",
		"pk_org__name": "HT资产组织",
		"pk_transitype": "1547897898592632836",
		"pk_transitype__name": "升级申请",
		"pubts": "2026-03-19 11:29:13",
		"repair_tickets": "",
		"repair_tickets_id": "",
		"repair_tickets_id__bill_code": "",
		"returncount": "0",
		"src_bill_type": "",
		"src_pk_bill": "",
		"src_pk_bill_b": "",
		"src_pk_transitype": "",
		"src_transitype": "",
		"sysid": "SAA",
		"transi_type": "5B03-01",
		"update_reason": "",
		"update_type": "0",
		"verifystate": "1",
		"auditor": "",
		"auditor__name": "",
		"audittime": "",
		"billmaker": "2f847281-6e57-4d90-85b7-0cc149d37667",
		"billmaker__name": "HTRENT",
		"billmaketime": "2026-03-06 15:33:10",
		"check_opinion": "",
		"creationtime": "2026-03-06 15:33:10",
		"creator": "2f847281-6e57-4d90-85b7-0cc149d37667",
		"creator__name": "HTRENT",
		"modifiedtime": "",
		"modifier": "",
		"modifier__name": "",
		"bodyvos": [
			{
				"advise_update": "",
				"advise_update_id": "",
				"archive_code": "",
				"archive_domain": "",
				"archive_name": "",
				"archive_return": "",
				"close_flag": "0",
				"controlType": "",
				"expect_update": "骨头",
				"expect_update_id": "",
				"filelist": "",
				"id": "2487493780676018177",
				"input_digit": "",
				"input_length": "",
				"main_id": "2487493780676018176",
				"old_spec": "",
				"pubts": "2026-03-06 15:33:10",
				"spec_id": "",
				"sysid": "",
				"techparams": "",
				"techparams__tech_showname": "",
				"techparams__tech_showvalue": "",
				"tech_id": "",
				"tech_index": "",
				"tech_showname": "",
				"tech_showvalue": "",
				"tech_value": ""
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
999	系统异常	

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

