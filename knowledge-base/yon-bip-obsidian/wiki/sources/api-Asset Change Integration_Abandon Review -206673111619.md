---
title: "资产变动弃审"
apiId: "2066731116195741697"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Change"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产变动弃审

>  请求方式	POST | Asset Change (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/aumaltercard/unsubmit
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
data	object	是	是	资产变动参数项
id	string	否	是	资产变动主键 示例：1730690972242176

## 3. 请求示例

Url: /yonbip/am/aumaltercard/unsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1730690972242176"
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
小数位数:0,最大长度:10	否	返回结果编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pk_recorder	string	否	经办人主键 示例：2108853629896097793
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
pk_org__finorgid	string	否	会计主体 示例：2108852349979590665
check_opinion	string	否	审核意见
bill_date	string	否	变动日期 示例：2025-04-27 00:00:00
bill_code	string	否	变动单号 示例：ZCBD202504270001
pk_org	string	否	资产组织主键 示例：2108852349979590665
pk_transitype	string	否	交易类型主键 示例：2107565491904053394
userDefines	object	否	特征
pk_recorder__dept_id	string	否	经办部门 示例：2108853114483769346
alterinfo	string	否	变动项目主键 示例：pk_usedept,pk_costcenter_use,pk_profitcenter_use,pk_user,pk_other_user
bill_type	string	否	单据类型 示例：4A07
id	string	否	主键 示例：2255188362581245961
pubts	string	否	时间戳 示例：2025-04-27 15:21:43
creator__name	string	否	创建人 示例：刘龙
tenant	string	否	租户 示例：0000M233OB73BD9ERM0000
creator	string	否	创建人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
push_status	number
小数位数:0,最大长度:10	否	固资对接生单状态 示例：0
billmaketime	string	否	制单时间 示例：2025-04-27 15:21:19
audittime	string	否	审核时间
pk_org__name	string	否	资产组织 示例：全职能组织
pk_transitype__name	string	否	交易类型 示例：资产变动
sysid	string	否	系统标识 示例：AUM
isWfControlled	boolean	否	是否审批流控制 示例：false
ytenant	string	否	租户 示例：0000M233OB73BD9ERM0000
auditor	string	否	审核人主键
auditor__name	string	否	审核人
billmaker__name	string	否	制单人 示例：刘龙
_status	string	否	状态
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
modifier__name	string	否	最后修改人
alterinfo__name	string	否	变动项目 示例：使用部门,责任人
pk_recorder__name	string	否	经办人 示例：刘龙
billmaker	string	否	制单人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
busi_type	string	否	业务类型
transi_type	string	否	交易类型编码 示例：4A07-07
pk_org_v	string	否	资产组织版本
creationtime	string	否	创建时间 示例：2025-04-27 15:21:19
bodyvos	object	是	变动子表
error_msg	string	否	固资对接异常信息
errorDetail	string	否	错误详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_recorder": "2108853629896097793",
		"verifystate": 0,
		"pk_org__finorgid": "2108852349979590665",
		"check_opinion": "",
		"bill_date": "2025-04-27 00:00:00",
		"bill_code": "ZCBD202504270001",
		"pk_org": "2108852349979590665",
		"pk_transitype": "2107565491904053394",
		"userDefines": {
			"_entityName": "",
			"_keyName": "",
			"id": "2255188362581245966",
			"x1_name": "",
			"x1": "",
			"_status": "",
			"ytenant": "0000M233OB73BD9ERM0000"
		},
		"pk_recorder__dept_id": "2108853114483769346",
		"alterinfo": "pk_usedept,pk_costcenter_use,pk_profitcenter_use,pk_user,pk_other_user",
		"bill_type": "4A07",
		"id": "2255188362581245961",
		"pubts": "2025-04-27 15:21:43",
		"creator__name": "刘龙",
		"tenant": "0000M233OB73BD9ERM0000",
		"creator": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"push_status": 0,
		"billmaketime": "2025-04-27 15:21:19",
		"audittime": "",
		"pk_org__name": "全职能组织",
		"pk_transitype__name": "资产变动",
		"sysid": "AUM",
		"isWfControlled": false,
		"ytenant": "0000M233OB73BD9ERM0000",
		"auditor": "",
		"auditor__name": "",
		"billmaker__name": "刘龙",
		"_status": "",
		"bill_status": 0,
		"modifier__name": "",
		"alterinfo__name": "使用部门,责任人",
		"pk_recorder__name": "刘龙",
		"billmaker": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"busi_type": "",
		"transi_type": "4A07-07",
		"pk_org_v": "",
		"creationtime": "2025-04-27 15:21:19",
		"bodyvos": [
			{
				"_entityName": "",
				"_keyName": "",
				"pk_jobmngfil_after": "",
				"pk_usedept_after": "2108853243351662601",
				"pk_manager_after__name": "",
				"pk_usedunit_after": "",
				"pk_manager_after": "",
				"pk_equip__pk_transitype": "2107565491904053251",
				"pk_capital_source_after": "",
				"pk_other_user_before__name": "",
				"pk_usedept_after__name": "市场部门",
				"start_used_date_before": "2024-12-24 00:00:00",
				"pk_equip__pk_material": "",
				"pk_manager_before": "",
				"pk_location_after__name": "chenjiut子位置验证",
				"id": "2255188362581245962",
				"pk_equip__pk_ownerorg": "2108852349979590665",
				"tenant": "0000M233OB73BD9ERM0000",
				"pk_usedept_before": "2108853114483769346",
				"pk_location_before__name": "chenjiut子位置验证",
				"pk_priority_after": "",
				"pk_used_status_before__name": "在用",
				"spec_after": "",
				"pk_supplier_after__name": "",
				"pk_used_status_after": "PRESET01_0000M233OB73BD9ERM0000",
				"_status": "",
				"pk_profitcenter_use_before__name": "",
				"pk_mandept_before": "2108853114483769346",
				"pk_equip__used_dept_follow_user": false,
				"pk_transitype_after": "2107565491904053251",
				"pk_supplier_before": "",
				"mddCoordinatedData": "",
				"detail": [
					{
						"_entityName": "",
						"_keyName": "",
						"item_code": "pk_usedept",
						"ytenant": "0000M233OB73BD9ERM0000",
						"old_content": "2108853114483769346",
						"main_id": "2255188362581245962",
						"id": "2255188362581245963",
						"_status": "",
						"new_content": "2108853243351662601",
						"tenant": "0000M233OB73BD9ERM0000"
					}
				],
				"pk_usedunit_before__name": "",
				"special_flag_before": false,
				"pk_specialty_before": "",
				"pk_transitype_before__name": "资产卡片",
				"pk_usedunit_after__name": "",
				"pk_equip__pk_usedorg__name": "全职能组织",
				"pk_costcenter_use_after": "",
				"equip_name_before": {
					"zh_TW": "",
					"en_US": "",
					"zh_CN": "共享卡片租赁调拨"
				},
				"pk_location_before": "2221824558404993026",
				"pk_user_before__name": "刘龙",
				"pk_icorg_after__name": "",
				"pk_capital_source_before__name": "",
				"pk_specialty_before__name": "",
				"pk_priority_after__name": "",
				"start_used_date_after": "2024-12-24 00:00:00",
				"pk_used_status_before": "PRESET01_0000M233OB73BD9ERM0000",
				"pk_mandept_before__name": "营销部门",
				"pk_jobmngfil_after__name": "",
				"pk_supplier_after": "",
				"pk_mandept_after__name": "营销部门",
				"error_msg": "",
				"facturer_name_before": "",
				"pk_location_after": "2221824558404993026",
				"pk_jobmngfil_before__name": "",
				"pk_icorg_before": "",
				"pk_priority_before__name": "",
				"pk_equip": "2162997525212561411",
				"pk_equip__bill_type": "4A00",
				"pk_used_status_after__name": "在用",
				"bar_code_before": "",
				"pk_costcenter_use_after__name": "",
				"pk_priority_before": "",
				"equip_name_after": {
					"zh_TW": "",
					"en_US": "",
					"zh_CN": "共享卡片租赁调拨"
				},
				"pk_profitcenter_use_before": "",
				"fk_parent_before__code": "",
				"pk_icorg_after": "",
				"pk_other_user_before": "",
				"pk_capital_source_after__name": "",
				"pk_org": "2108852349979590665",
				"pk_equip__equip_code": "EAM-TEST-202412240003",
				"pk_manager_before__name": "",
				"pk_costcenter_manage_after": "",
				"pk_capital_source_before": "",
				"pk_equip__model": "",
				"pk_equip__pk_ownerorg__name": "全职能组织",
				"pk_costcenter_manage_after__name": "",
				"fk_parent_after__code": "",
				"type_business_before": "2",
				"pk_profitcenter_manage_after__name": "",
				"pk_specialty_after__name": "",
				"pk_equip__equip_num": 1,
				"pk_mandept_after": "2108853114483769346",
				"pk_profitcenter_use_after": "",
				"status_date_before": "2025-02-26 00:00:00",
				"precoding_before": "",
				"pk_transitype_after__name": "资产卡片",
				"pk_supplier_before__name": "",
				"pk_other_user_after__name": "",
				"pk_category_after__name": "一级资产",
				"pk_profitcenter_manage_before": "",
				"pk_costcenter_use_before": "",
				"bar_code_after": "",
				"model_before": "",
				"pk_transitype_before": "2107565491904053251",
				"pk_costcenter_use_before__name": "",
				"pk_usedept_before__name": "营销部门",
				"pk_equip__spec": "",
				"pk_user_before": "2108853629896097793",
				"model_after": "",
				"fk_parent_after": "",
				"status_date_after": "2025-02-26 00:00:00",
				"pk_category_before__name": "一级资产",
				"pk_category_after": "2162981247308005383",
				"fk_parent_before": "",
				"type_business_after": "2",
				"pk_profitcenter_manage_after": "",
				"pk_jobmngfil_before": "",
				"pk_costcenter_manage_before__name": "",
				"spec_before": "",
				"pk_equip__pk_usedorg": "2108852349979590665",
				"ytenant": "0000M233OB73BD9ERM0000",
				"pk_category_before": "2162981247308005383",
				"pk_profitcenter_use_after__name": "",
				"special_flag_after": false,
				"main_id": "2255188362581245961",
				"pk_user_after": "2108853629896097793",
				"facturer_name_after": "",
				"pk_usedunit_before": "",
				"pk_icorg_before__name": "",
				"precoding_after": "",
				"pk_user_after__name": "刘龙",
				"pk_profitcenter_manage_before__name": "",
				"pk_other_user_after": "",
				"pk_specialty_after": "",
				"pk_equip__equip_name": "共享卡片租赁调拨",
				"pk_costcenter_manage_before": "",
				"pk_category__innercode": "E3AC"
			}
		],
		"error_msg": ""
	},
	"errorDetail": ""
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
999	报错具体提示信息	结合报错提示信息查找原因

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

