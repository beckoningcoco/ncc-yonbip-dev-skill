---
title: "资产领用申请详情查询"
apiId: "2538752162288631813"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Collection Application"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Collection Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产领用申请详情查询

>  请求方式	POST | Asset Collection Application (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/aumassignapplycard/detail
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
id	string	否	是	资产领用申请主表主键 示例：2286573509772050436

## 3. 请求示例

Url: /yonbip/ACC/aumassignapplycard/detail?access_token=访问令牌
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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
bill_code	string	否	单据编码 示例：LYSQ202605140001
bill_date	string	否	申请时间 示例：2026-05-14 00:00:00
bill_status	string	否	单据状态 示例：3
bill_type	string	否	单据类型 示例：4A37
busi_type	string	否	业务类型
complete_flag	string	否	完成标记 示例：false
id	string	否	主键 示例：2538551398323191817
isWfControlled	string	否	是否审批流控制 示例：true
memo	string	否	申请说明
pk_applier	string	否	申请人主键
pk_applier__name	string	否	申请人
pk_appydept	string	否	申请部门主键
pk_appydept__name	string	否	申请部门
pk_group	string	否	集团主键
pk_org	string	否	资产组织主键 示例：2344282683139948547
pk_org__name	string	否	资产组织 示例：全组织zjt
pk_transitype	string	否	交易类型主键 示例：2339906154407657754
pk_transitype__name	string	否	交易类型 示例：领用申请
pk_unit_used	string	否	使用权主键
pk_unit_used__name	string	否	使用权
pk_usedept	string	否	申请部门主键 示例：2344283035329363968
pk_usedept__name	string	否	申请部门 示例：001
pk_user	string	否	申请人主键 示例：2379101751083532292
pk_user__name	string	否	申请人 示例：cs
pubts	string	否	时间戳 示例：2026-05-14 10:39:17
reason	string	否	原因理由
returncount	string	否	退回次数 示例：0
sysid	string	否	系统标识 示例：AUM
transi_type	string	否	交易类型编码 示例：4A37-01
verifystate	string	否	审批状态 示例：1
auditor	string	否	审核人主键
auditor__name	string	否	审核人
audittime	string	否	审核时间
billmaker	string	否	制单人主键 示例：df943d6e-074f-454a-8413-8bfd70fd0e29
billmaker__name	string	否	制单人 示例：萧小天
billmaketime	string	否	制单时间 示例：2026-05-14 10:37:58
check_opinion	string	否	审核意见
creationtime	string	否	创建时间 示例：2026-05-14 10:37:58
creator	string	否	创建人主键 示例：df943d6e-074f-454a-8413-8bfd70fd0e29
creator__name	string	否	创建人 示例：萧小天
modifiedtime	string	否	最后修改时间
modifier	string	否	最后修改人主键
modifier__name	string	否	最后修改人
assign	string	否	领用单主表主键
assign_b	string	否	领用单子表主键
facturer_name	string	否	生产厂商
main_id	string	否	主表主键
pk_category	string	否	资产类别主键
pk_category__category_name	string	否	资产类别
pk_equip	string	否	资产
pk_equip__equip_code	string	否	资产编码
pk_equip__equip_name	string	否	资产名称
pk_equip__model	string	否	型号
pk_equip__pk_location	string	否	位置主键
pk_equip__pk_location__location_name	string	否	位置
pk_equip__spec	string	否	规格
pk_jobmngfil	string	否	项目主键
pk_jobmngfil__name	string	否	项目
pk_manager	string	否	管理人id
pk_manager__name	string	否	管理人
pk_mandept	string	否	管理部门id
pk_mandept__name	string	否	管理部门
pk_ownerorg	string	否	资产管理组织主键
pk_ownerorg__name	string	否	资产管理组织
pk_ownerunit	string	否	所有权主键
pk_ownerunit__name	string	否	所有权
pk_supplier	string	否	供应商主键
pk_supplier__name	string	否	供应商
pk_usedorg	string	否	使用单位id
pk_usedorg__name	string	否	使用单位
src_bill_type	string	否	来源单据类型
src_pk_bill	string	否	来源单据主键
src_pk_bill_b	string	否	来源单据表体主键
src_pk_transitype	string	否	来源交易类型主键
src_transitype	string	否	来源交易类型
start_used_date	string	否	投用日期
bodyvos	object	是	表体信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"bill_code": "LYSQ202605140001",
		"bill_date": "2026-05-14 00:00:00",
		"bill_status": "3",
		"bill_type": "4A37",
		"busi_type": "",
		"complete_flag": "false",
		"id": "2538551398323191817",
		"isWfControlled": "true",
		"memo": "",
		"pk_applier": "",
		"pk_applier__name": "",
		"pk_appydept": "",
		"pk_appydept__name": "",
		"pk_group": "",
		"pk_org": "2344282683139948547",
		"pk_org__name": "全组织zjt",
		"pk_transitype": "2339906154407657754",
		"pk_transitype__name": "领用申请",
		"pk_unit_used": "",
		"pk_unit_used__name": "",
		"pk_usedept": "2344283035329363968",
		"pk_usedept__name": "001",
		"pk_user": "2379101751083532292",
		"pk_user__name": "cs",
		"pubts": "2026-05-14 10:39:17",
		"reason": "",
		"returncount": "0",
		"sysid": "AUM",
		"transi_type": "4A37-01",
		"verifystate": "1",
		"auditor": "",
		"auditor__name": "",
		"audittime": "",
		"billmaker": "df943d6e-074f-454a-8413-8bfd70fd0e29",
		"billmaker__name": "萧小天",
		"billmaketime": "2026-05-14 10:37:58",
		"check_opinion": "",
		"creationtime": "2026-05-14 10:37:58",
		"creator": "df943d6e-074f-454a-8413-8bfd70fd0e29",
		"creator__name": "萧小天",
		"modifiedtime": "",
		"modifier": "",
		"modifier__name": "",
		"assign": "",
		"assign_b": "",
		"facturer_name": "",
		"main_id": "",
		"pk_category": "",
		"pk_category__category_name": "",
		"pk_equip": "",
		"pk_equip__equip_code": "",
		"pk_equip__equip_name": "",
		"pk_equip__model": "",
		"pk_equip__pk_location": "",
		"pk_equip__pk_location__location_name": "",
		"pk_equip__spec": "",
		"pk_jobmngfil": "",
		"pk_jobmngfil__name": "",
		"pk_manager": "",
		"pk_manager__name": "",
		"pk_mandept": "",
		"pk_mandept__name": "",
		"pk_ownerorg": "",
		"pk_ownerorg__name": "",
		"pk_ownerunit": "",
		"pk_ownerunit__name": "",
		"pk_supplier": "",
		"pk_supplier__name": "",
		"pk_usedorg": "",
		"pk_usedorg__name": "",
		"src_bill_type": "",
		"src_pk_bill": "",
		"src_pk_bill_b": "",
		"src_pk_transitype": "",
		"src_transitype": "",
		"start_used_date": "",
		"bodyvos": [
			{
				"assign_quantity": 0,
				"close_flag": "false",
				"end_date": "",
				"expect_end_date": "2026-05-15",
				"expect_start_date": "",
				"id": "2538551398323191818",
				"main_id": "2538551398323191817",
				"memo": "",
				"model": "个人办公",
				"nonissue_quantity": 0,
				"pk_category": "2344284392532213760",
				"pk_category__category_name": "0001",
				"pk_category__innercode": "RIMF",
				"pk_equip": "",
				"pk_equip__card_code": "",
				"pk_equip__equip_code": "",
				"pk_equip__equip_name": "",
				"pk_equip__is_pre": "",
				"pk_group": "",
				"pk_jobmngfil": "",
				"pk_jobmngfil__name": "",
				"pk_material": "",
				"pk_material__code": "",
				"pk_org": "2344282683139948547",
				"pk_org__name": "全组织zjt",
				"pk_warehouse": "",
				"pk_warehouse__name": "",
				"processing_status": "0",
				"pubts": "2026-05-14 10:37:59",
				"purchase_requisition": 0,
				"quantity": 1,
				"rowno": "10",
				"serial_num": "",
				"spec": "111",
				"start_date": "2026-05-14",
				"sysid": "",
				"untreated_quantity": 1
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

