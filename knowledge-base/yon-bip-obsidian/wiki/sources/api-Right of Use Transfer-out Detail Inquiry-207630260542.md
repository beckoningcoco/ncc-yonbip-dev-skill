---
title: "使用权调出详情查询"
apiId: "2076302605424787464"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Right of Use Transfer-out"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Right of Use Transfer-out]
platform_version: "BIP"
source_type: community-api-docs
---

# 使用权调出详情查询

>  请求方式	POST | Right of Use Transfer-out (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/deployUsedOut/detail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	使用权调出主表主键 示例：2076285983804358657

## 3. 请求示例

Url: /yonbip/am/deployUsedOut/detail?access_token=访问令牌
Body: {
	"id": "2076285983804358657"
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
auditor__name	string	否	审核人
auditor	string	否	审核人
pk_group	string	否	集团
workflow_status	string	否	工作流状态
memo	string	否	备注
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
bill_date	string	否	调拨日期 示例：2024-08-29
bill_code	string	否	调出单号 示例：SYDC202408290001
pk_usedorg_in	string	否	调入使用管理组织 示例：2045095175384989699
bizFlow	string	否	业务流主键 示例：43def4cc-bc7c-44ac-8ed0-0b24aa423c69
pk_org	string	否	资产组织 示例：1971926043804565510
pk_recorder_in	string	否	调入经办人 示例：2045097194034298887
pk_transitype	string	否	交易类型主键 示例：1969308072258045606
pk_usedorg_in__name	string	否	调入使用组织 示例：LQ测试组织
bill_type	string	否	单据类型 示例：4A47
pk_usedorg_out__name	string	否	调入使用组织名称 示例：资产组织
id	string	否	主键 示例：2076285983804358657
pubts	string	否	时间戳 示例：2024-08-29 14:05:03
creator__name	string	否	创建人 示例：昵称-18804080381
isFlowCoreBill	boolean	否	是否有审批流 示例：true
tenant	string	否	租户主键 示例：0000LUOWYQE74EIUBN0000
creator	string	否	创建人 示例：f7f824b1-df21-4576-98e4-f789923178c9
push_status	number
小数位数:0,最大长度:10	否	固资对接状态 示例：0
billmaketime	string	否	制单时间 示例：2024-08-29 14:05:02
sysid	string	否	所属服务 示例：AUM
isWfControlled	boolean	否	是否审批流 示例：false
pk_org__name	string	否	资产组织名称 示例：资产组织
pk_transitype__name	string	否	交易类型名称 示例：使用权调出
billmaker__name	string	否	制单人名称 示例：昵称-18804080381
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
pk_recorder	string	否	调出经办人
pk_recorder_in__name	string	否	调入经办人名称 示例：测试员工001
billmaker	string	否	制单人主键 示例：f7f824b1-df21-4576-98e4-f789923178c9
pk_usedorg_out	string	否	调出使用管理组织 示例：1971926043804565510
transi_type	string	否	交易类型 示例：4A47-01
creationtime	string	否	创建时间 示例：2024-08-29 14:05:02
bodyvos	object	是	表体
pk_addreducestyle	string	否	调拨方式 示例：1969308072282685831
pk_addreducestyle__name	string	否	增减方式 示例：投资转出
pk_usedept_after	string	否	调入使用部门 示例：2045096309267365892
pk_usedept_after__name	string	否	调入使用部门 示例：LQ_测试部门
pk_reason	string	否	调拨原因 示例：2076285760477069313
pk_category__category_name	string	否	资产类别名称 示例：HT租赁
stock_out_flag	boolean	否	出库标志 示例：false
pk_org	string	否	资产组织 示例：1971926043804565510
associate_flag_before	boolean	否	联动固定资产 示例：false
pk_usedorg_out__name	string	否	调出使用组织 示例：资产组织
id	string	否	主键 示例：2076285983804358658
pubts	string	否	时间戳 示例：2024-08-29 14:05:02
tenant	string	否	租户主键 示例：0000LUOWYQE74EIUBN0000
pk_equip	string	否	资产卡片 示例：2075563218131484681
pk_equip__equip_code	string	否	资产卡片编码 示例：2024082800004
pk_equip__pk_ownerorg	string	否	管理组织 示例：1971926043804565510
pk_equip__special_flag	boolean	否	特种设备标识 示例：false
pk_reason__name	string	否	调出原因 示例：暂时不用
rowno	string	否	行号 示例：10
main_id	string	否	主表主键 示例：2076285983804358657
equip_name	string	否	设备名称 示例：合同统计
pk_category	string	否	设备类别 示例：2019930206098161671
pk_usedorg_out	string	否	调出使用管理组织 示例：1971926043804565510
stock_in_flag	boolean	否	入库标志 示例：false
pk_usedunit_in	string	否	调入使用权
pk_user_after	string	否	调入责任人
pk_location_after	string	否	调入位置
pk_icorg_in	string	否	调入库存组织
pk_warehouse_in	string	否	调入仓库
pk_currency	string	否	财务币种
origin_value	number
小数位数:8,最大长度:28	否	原值
accu_dep	number
小数位数:8,最大长度:28	否	累计折旧
new_value	number
小数位数:8,最大长度:28	否	净值
net_money	number
小数位数:8,最大长度:28	否	净额
dep_amount	number
小数位数:8,最大长度:28	否	月折旧额
used_month	number
小数位数:0,最大长度:10	否	已计提期数
service_month	number
小数位数:0,最大长度:10	否	使用月限
salvage	number
小数位数:8,最大长度:28	否	净残值
begin_date	string	否	开始使用日期
salvage_rate	number
小数位数:8,最大长度:28	否	净残值率%
pre_devaluate	number
小数位数:8,最大长度:28	否	减值准备
pk_usedunit_out	string	否	调出使用权
pk_usedept_before	string	否	调出使用部门
pk_user_before	string	否	调出责任人
pk_location_before	string	否	调拨前位置
pk_icorg_out	string	否	调出库存组织
pk_warehouse_out	string	否	调出仓库
origin_value_before	number
小数位数:8,最大长度:28	否	调拨前原值
accu_dep_before	number
小数位数:8,最大长度:28	否	调拨前累计折旧
new_value_before	number
小数位数:8,最大长度:28	否	调拨前净值
net_money_before	number
小数位数:8,最大长度:28	否	调拨前净额
dep_amount_before	number
小数位数:8,最大长度:28	否	调拨前月折旧额
used_month_before	number
小数位数:0,最大长度:11	否	调拨前已计提月份
service_month_before	number
小数位数:0,最大长度:11	否	调拨前使用月限
salvage_before	number
小数位数:8,最大长度:28	否	调拨前净残值
salvage_rate_before	number
小数位数:8,最大长度:28	否	调拨前净残值率%
begin_date_before	string	否	调拨前开始使用日期
pre_devaluate_before	number
小数位数:8,最大长度:28	否	调拨前减值准备
pk_card_before	string	否	调拨前卡片
associate_status_flag_before	boolean	否	联动固定资产状态
pk_jobmngfil	string	否	项目
pk_status_before	string	否	调拨前状态
pk_status_after	string	否	调拨后状态
status_date_before	string	否	调拨前状态日期
status_date_after	string	否	调拨后状态日期
memo	string	否	备注
pk_org_before	string	否	调拨前设备主组织
pk_org_after	string	否	调拨后设备主组织
equip_spec	string	否	规格
equip_model	string	否	型号
bill_code_src	string	否	来源单据号
isapprove_deployin	string	否	下游单据是否审批
pk_costcenter_used_in	string	否	调入使用成本中心
pk_profitcenter_used_in	string	否	调入使用利润中心
pk_costcenter_used_out	string	否	调出使用成本中心
pk_profitcenter_used_out	string	否	调出使用利润中心
pk_jobmngfil_before	string	否	调出项目
pk_jobmngfil_after	string	否	调入项目
_viewmodel	string	否	视图
masterOrgKeyField	string	否	主组织字段 示例：pk_org
transTypeKeyField	string	否	交易类型字段编码 示例：pk_transitype
_mddFormulaExecuteFlag	string	否	公式执行标记 示例：true
step	number
小数位数:0,最大长度:10	否	调出调入步骤 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"auditor__name": "",
		"auditor": "",
		"pk_group": "",
		"workflow_status": "",
		"memo": "",
		"returncount": 0,
		"verifystate": 0,
		"bill_date": "2024-08-29",
		"bill_code": "SYDC202408290001",
		"pk_usedorg_in": "2045095175384989699",
		"bizFlow": "43def4cc-bc7c-44ac-8ed0-0b24aa423c69",
		"pk_org": "1971926043804565510",
		"pk_recorder_in": "2045097194034298887",
		"pk_transitype": "1969308072258045606",
		"pk_usedorg_in__name": "LQ测试组织",
		"bill_type": "4A47",
		"pk_usedorg_out__name": "资产组织",
		"id": "2076285983804358657",
		"pubts": "2024-08-29 14:05:03",
		"creator__name": "昵称-18804080381",
		"isFlowCoreBill": true,
		"tenant": "0000LUOWYQE74EIUBN0000",
		"creator": "f7f824b1-df21-4576-98e4-f789923178c9",
		"push_status": 0,
		"billmaketime": "2024-08-29 14:05:02",
		"sysid": "AUM",
		"isWfControlled": false,
		"pk_org__name": "资产组织",
		"pk_transitype__name": "使用权调出",
		"billmaker__name": "昵称-18804080381",
		"bill_status": 0,
		"pk_recorder": "",
		"pk_recorder_in__name": "测试员工001",
		"billmaker": "f7f824b1-df21-4576-98e4-f789923178c9",
		"pk_usedorg_out": "1971926043804565510",
		"transi_type": "4A47-01",
		"creationtime": "2024-08-29 14:05:02",
		"bodyvos": [
			{
				"pk_addreducestyle": "1969308072282685831",
				"pk_addreducestyle__name": "投资转出",
				"pk_usedept_after": "2045096309267365892",
				"pk_usedept_after__name": "LQ_测试部门",
				"pk_reason": "2076285760477069313",
				"pk_category__category_name": "HT租赁",
				"stock_out_flag": false,
				"pk_org": "1971926043804565510",
				"associate_flag_before": false,
				"pk_usedorg_out__name": "资产组织",
				"id": "2076285983804358658",
				"pubts": "2024-08-29 14:05:02",
				"tenant": "0000LUOWYQE74EIUBN0000",
				"pk_equip": "2075563218131484681",
				"pk_equip__equip_code": "2024082800004",
				"pk_equip__pk_ownerorg": "1971926043804565510",
				"pk_equip__special_flag": false,
				"pk_reason__name": "暂时不用",
				"rowno": "10",
				"main_id": "2076285983804358657",
				"equip_name": "合同统计",
				"pk_category": "2019930206098161671",
				"pk_usedorg_out": "1971926043804565510",
				"stock_in_flag": false,
				"pk_usedunit_in": "",
				"pk_user_after": "",
				"pk_location_after": "",
				"pk_icorg_in": "",
				"pk_warehouse_in": "",
				"pk_currency": "",
				"origin_value": 0,
				"accu_dep": 0,
				"new_value": 0,
				"net_money": 0,
				"dep_amount": 0,
				"used_month": 0,
				"service_month": 0,
				"salvage": 0,
				"begin_date": "",
				"salvage_rate": 0,
				"pre_devaluate": 0,
				"pk_usedunit_out": "",
				"pk_usedept_before": "",
				"pk_user_before": "",
				"pk_location_before": "",
				"pk_icorg_out": "",
				"pk_warehouse_out": "",
				"origin_value_before": 0,
				"accu_dep_before": 0,
				"new_value_before": 0,
				"net_money_before": 0,
				"dep_amount_before": 0,
				"used_month_before": 0,
				"service_month_before": 0,
				"salvage_before": 0,
				"salvage_rate_before": 0,
				"begin_date_before": "",
				"pre_devaluate_before": 0,
				"pk_card_before": "",
				"associate_status_flag_before": true,
				"pk_jobmngfil": "",
				"pk_status_before": "",
				"pk_status_after": "",
				"status_date_before": "",
				"status_date_after": "",
				"memo": "",
				"pk_org_before": "",
				"pk_org_after": "",
				"equip_spec": "",
				"equip_model": "",
				"bill_code_src": "",
				"isapprove_deployin": "",
				"pk_costcenter_used_in": "",
				"pk_profitcenter_used_in": "",
				"pk_costcenter_used_out": "",
				"pk_profitcenter_used_out": "",
				"pk_jobmngfil_before": "",
				"pk_jobmngfil_after": ""
			}
		],
		"_viewmodel": "",
		"masterOrgKeyField": "pk_org",
		"transTypeKeyField": "pk_transitype",
		"_mddFormulaExecuteFlag": "true",
		"step": 1
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
暂时没有数据哦~

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

