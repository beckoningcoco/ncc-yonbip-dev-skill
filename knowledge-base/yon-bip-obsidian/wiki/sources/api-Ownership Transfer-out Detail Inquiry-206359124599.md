---
title: "所有权调出详情查询"
apiId: "2063591245991641096"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Ownership Transfer-out"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Ownership Transfer-out]
platform_version: "BIP"
source_type: community-api-docs
---

# 所有权调出详情查询

>  请求方式	POST | Ownership Transfer-out (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/deployOut/detail
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
id	string	否	否	所有权调出主表主键 示例：2074711466078371850

## 3. 请求示例

Url: /yonbip/am/deployOut/detail?access_token=访问令牌
Body: {
	"id": "2074711466078371850"
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
djqqlsh	string	否	单据请求流水号
pk_recorder_in	string	否	调入经办人
pk_recorder	string	否	调出经办人
deploy_in_taxNo	string	否	调入纳税人识别号
deploy_in_title	string	否	调入发票抬头
tax_bill_type	string	否	发票类型
pk_costcenter_manage_in	string	否	调入成本中心
taxpayer_type	string	否	调出纳税人类型
taxpayer_name	string	否	调出纳税人名称
taxpayer_id	string	否	调出纳税人识别号
pk_profitcenter_manage	string	否	调出利润中心
pk_costcenter_manage	string	否	调出成本中心
memo	string	否	备注
pk_usedorg_in	string	否	调入使用管理组织
pk_usedorg_out	string	否	调出使用管理组织
pk_ownerunit_out	string	否	调出所有权 示例：1795743032269602824
pk_currency__moneyRount	number
小数位数:0,最大长度:10	否	币种舍位规则 示例：4
bill_date	string	否	业务日期 示例：2023-12-12
modifier	string	否	最后修改人 示例：f68d175f-cf48-4185-8717-0b78af6dca79
pk_ownerorg_out	string	否	调出管理组织 示例：1795743032269602824
pk_org	string	否	资产组织 示例：1795743032269602824
pk_transitype	string	否	交易类型主键 示例：1785361014001239586
pk_ownerunit_in	string	否	调入使用单位 示例：1785460219150598154
bill_type	string	否	单据类型 示例：4A33
id	string	否	主键 示例：1882625942880256003
pk_ownerunit_in__name	string	否	调入使用单位 示例：hxx-组织
creator__name	string	否	创建人 示例：赵艳玲
tenant	string	否	租户主键 示例：0000LKUKLMA0B7RHFL0000
userDefines__id	string	否	自定义项主键 示例：1882625942880256005
pk_customer__name	string	否	供应商名称 示例：hxx-组织内部客户
pk_currency__name	string	否	币种 示例：人民币
push_status	number
小数位数:0,最大长度:10	否	固资状态 示例：0
pk_currency	string	否	币种 示例：1785361014007531991
audittime	string	否	审批时间 示例：2024-01-12 20:25:11
pk_ownerorg_in	string	否	调入管理组织 示例：1785460219150598154
sysid	string	否	所属服务 示例：AUM
isWfControlled	boolean	否	是否审批流控制 示例：false
pk_org__name	string	否	资产组织名称 示例：bx-维修组织
pk_transitype__name	string	否	交易类型名称 示例：所有权调出
pk_ownerunit_out__name	string	否	调出使用单位 示例：bx-维修组织
pk_ownerorg_out__name	string	否	调出使用单位名称 示例：bx-维修组织
billmaker__name	string	否	制单人名称 示例：赵艳玲
modifier__name	string	否	最后修改人名称 示例：赵艳玲
total_amount	number
小数位数:0,最大长度:10	否	总金额 示例：0
billmaker	string	否	制单人 示例：f68d175f-cf48-4185-8717-0b78af6dca79
creationtime	string	否	创建时间 示例：2023-12-12 15:35:05
bodyvos	object	是	子表
isapprove_deployin	boolean	否	下游单据是否审批 示例：false
real_opening_amount	number
小数位数:0,最大长度:10	否	实开金额 示例：0
pk_status_before__status_name	string	否	使用状态 示例：在用
collection_tax	number
小数位数:0,最大长度:10	否	收款税额 示例：0
pk_user_before	string	否	调出前使用人 示例：1795734365037133832
pk_status_after__status_name	string	否	调入使用状态 示例：在用
stock_out_flag	boolean	否	材料出库标记 示例：false
status_date_after	string	否	调入状态日期 示例：2023-12-12
pk_org	string	否	资产组织 示例：1795743032269602824
notaxassets_amount	number
小数位数:0,最大长度:10	否	无税金额 示例：0
pk_user_before__name	string	否	调入前使用人 示例：刘龙
pk_equip__equip_code	string	否	资产卡片编码 示例：EAM-DAILY-WU202311200102191149
associate_flag_before	boolean	否	调入前联动固定资产标记 示例：false
assets_amount_tax	number
小数位数:0,最大长度:10	否	税额 示例：0
pk_mandept_before__name	string	否	调入前管理部门 示例：移动部门
pk_usedorg_out__name	string	否	调出使用组织 示例：河南机械设备有限公司
id	string	否	主键 示例：1882625942880256004
pubts	string	否	时间戳 示例：2023-12-12 15:35:06
pk_status_after	string	否	调入使用状态 示例：PRESET01_0000LKUKLMA0B7RHFL0000
tenant	string	否	租户主键 示例：0000LKUKLMA0B7RHFL0000
pk_status_before	string	否	调入前使用状态 示例：PRESET01_0000LKUKLMA0B7RHFL0000
pk_category__category_name	string	否	资产类别名称 示例：资产类别A
rowno	string	否	行号 示例：10
pk_usedept_before	string	否	调入前使用部门 示例：1843142755217833988
pk_equip__materialFree	object	否	自由项特征组
amount_received	number
小数位数:0,最大长度:10	否	收款金额 示例：0
status_date_before	string	否	调入前状态日期 示例：2023-11-20
invoicing_generated	number
小数位数:0,最大长度:10	否	已生成开票记录 示例：0
assets_amount	number
小数位数:0,最大长度:10	否	含税金额 示例：0
main_id	string	否	主表主键 示例：1882625942880256003
equip_name	string	否	资产名称 示例：别克V7
pk_category	string	否	资产类别 示例：1866369568990035973
pk_mandept_after	string	否	调入管理部门
pk_mandept_before	string	否	调出管理部门 示例：1795743238428033032
pk_equip	string	否	资产卡片主键 示例：1866370866070159431
associate_status_flag_before	boolean	否	调入前联动固定资产标记 示例：false
pk_usedorg_out	string	否	调出使用组织 示例：1795733574751617025
invoicing_flag	boolean	否	是否开票 示例：false
stock_in_flag	boolean	否	生成入库单标记 示例：false
pk_usedept_before__name	string	否	调出使用部门 示例：营销子部门
pk_manager_after	string	否	调入管理人
pk_usedunit_in	string	否	调入使用权
pk_usedept_after	string	否	调入使用部门
pk_user_after	string	否	调入责任人
pk_location_after	string	否	调入位置
pk_icorg_in	string	否	调入库存组织
pk_warehouse_in	string	否	调入仓库
pk_faorg_in	string	否	调入会计主体
pk_addreducestyle	string	否	调拨方式
pk_reason	string	否	调拨原因
pk_currency	string	否	财务币种
origin_value	number
小数位数:0,最大长度:10	否	原值
accu_dep	number
小数位数:0,最大长度:10	否	累计折旧
new_value	number
小数位数:0,最大长度:10	否	净值
net_money	number
小数位数:0,最大长度:10	否	净额
dep_amount	number
小数位数:0,最大长度:10	否	月折旧额
used_month	number
小数位数:0,最大长度:10	否	已计提期数
service_month	number
小数位数:0,最大长度:10	否	使用月限
salvage	number
小数位数:0,最大长度:10	否	净残值
begin_date	string	否	开始使用日期
salvage_rate	number
小数位数:0,最大长度:10	否	净残值率%
pre_devaluate	number
小数位数:0,最大长度:10	否	减值准备
pk_jobmngfil	string	否	项目
pk_faorg_out	string	否	调出会计主体
pk_ownerunit_out	string	否	调出所有权
pk_ownerorg_out	string	否	调出资产管理组织
pk_manager_before	string	否	调出管理人
pk_usedunit_out	string	否	调出使用权
pk_icorg_out	string	否	调出库存组织
pk_warehouse_out	string	否	调出仓库
pk_location_before	string	否	调出位置
origin_value_before	number
小数位数:2,最大长度:10	否	调拨前原值
accu_dep_before	number
小数位数:2,最大长度:10	否	调拨前累计折旧
new_value_before	number
小数位数:2,最大长度:10	否	调拨前净值
net_money_before	number
小数位数:2,最大长度:10	否	调拨前净额
dep_amount_before	number
小数位数:2,最大长度:10	否	调拨前月折旧额
used_month_before	number
小数位数:2,最大长度:10	否	调拨前已计提月份
service_month_before	number
小数位数:2,最大长度:10	否	调拨前使用月限
salvage_before	number
小数位数:2,最大长度:10	否	调拨前净残值
begin_date_before	string	否	调拨前开始使用日期
salvage_rate_before	number
小数位数:2,最大长度:10	否	调拨前净残值率%
pre_devaluate_before	number
小数位数:2,最大长度:10	否	调拨前减值准备
pk_card_before	string	否	调拨前固定资产卡片
memo	string	否	备注
pk_org_before	string	否	调拨前设备主组织
pk_org_after	string	否	调拨后设备主组织
equip_spec	string	否	规格
equip_model	string	否	型号
bill_code_src	string	否	来源单据号
pk_usedorg_in	string	否	调入使用单位
expense_item	string	否	费用项目
material_name	string	否	开票名称
tax_classification_code	string	否	税收分类编码
ntaxrate_code	string	否	销项税率编码
ntaxrate_name	string	否	销项税率描述
ntaxrate	string	否	销项税率主键
material_tax	string	否	销项税率
pk_costcenter_manage_in	string	否	调入管理成本中心
pk_costcenter_used_in	string	否	调入使用成本中心
pk_profitcenter_manage_in	string	否	调入管理利润中心
pk_profitcenter_used_in	string	否	调入使用利润中心
pk_costcenter_manage_out	string	否	调出管理成本中心
pk_costcenter_used_out	string	否	调出使用成本中心
pk_profitcenter_manage_out	string	否	调出管理利润中心
pk_profitcenter_used_out	string	否	调出使用利润中心
pk_jobmngfil_before	string	否	调出项目
pk_jobmngfil_after	string	否	调入项目
invoiced_record_code	string	否	开票记录号
pk_material	string	否	物料
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审核状态 示例：2
bill_code	string	否	单据编码 示例：ZCDC202312120001
pk_currency__priceRount	number
小数位数:0,最大长度:10	否	币种舍位标记 示例：4
bizFlow	string	否	业务流主键 示例：45142329-f998-4099-b361-a6552755a1c3
postAccountStatus	number
小数位数:0,最大长度:10	否	过账状态 示例：0
modifiedtime	string	否	修改时间 示例：2023-12-12 15:35:47
userDefines	object	否	特征组
ytenant	string	否	租户主键 示例：0000LKUKLMA0B7RHFL0000
id	string	否	主键 示例：1882625942880256005
dr	number
小数位数:0,最大长度:10	否	删除标记 示例：0
pk_currency__digit	number
小数位数:0,最大长度:10	否	币种精度 示例：2
postAccountVersion	number
小数位数:0,最大长度:10	否	过账状态 示例：1
total_amount_tax	number
小数位数:0,最大长度:10	否	含税金额 示例：0
notaxtotal_amount	number
小数位数:0,最大长度:10	否	无税金额 示例：0
pk_ownerorg_in__name	string	否	调入管理组织 示例：hxx-组织
pubts	string	否	时间戳 示例：2024-01-12 20:25:11
actual_invoice_amount	number
小数位数:0,最大长度:10	否	开票金额 示例：0
isFlowCoreBill	boolean	否	是否有业务流 示例：true
creator	string	否	创建人 示例：f68d175f-cf48-4185-8717-0b78af6dca79
billmaketime	string	否	制单时间 示例：2023-12-12 15:35:05
pk_customer	string	否	供应商 示例：1841646775161585670
auditor	string	否	审批人 示例：d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44
auditor__name	string	否	审批人名称 示例：昵称-白璇
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：1
transi_type	string	否	交易类型 示例：4A33-01
masterOrgKeyField	string	否	主组织字段编码 示例：pk_ownerorg_out
transTypeKeyField	string	否	交易类型字段编码 示例：pk_transitype

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"djqqlsh": "",
		"pk_recorder_in": "",
		"pk_recorder": "",
		"deploy_in_taxNo": "",
		"deploy_in_title": "",
		"tax_bill_type": "",
		"pk_costcenter_manage_in": "",
		"taxpayer_type": "",
		"taxpayer_name": "",
		"taxpayer_id": "",
		"pk_profitcenter_manage": "",
		"pk_costcenter_manage": "",
		"memo": "",
		"pk_usedorg_in": "",
		"pk_usedorg_out": "",
		"pk_ownerunit_out": "1795743032269602824",
		"pk_currency__moneyRount": 4,
		"bill_date": "2023-12-12",
		"modifier": "f68d175f-cf48-4185-8717-0b78af6dca79",
		"pk_ownerorg_out": "1795743032269602824",
		"pk_org": "1795743032269602824",
		"pk_transitype": "1785361014001239586",
		"pk_ownerunit_in": "1785460219150598154",
		"bill_type": "4A33",
		"id": "1882625942880256003",
		"pk_ownerunit_in__name": "hxx-组织",
		"creator__name": "赵艳玲",
		"tenant": "0000LKUKLMA0B7RHFL0000",
		"userDefines__id": "1882625942880256005",
		"pk_customer__name": "hxx-组织内部客户",
		"pk_currency__name": "人民币",
		"push_status": 0,
		"pk_currency": "1785361014007531991",
		"audittime": "2024-01-12 20:25:11",
		"pk_ownerorg_in": "1785460219150598154",
		"sysid": "AUM",
		"isWfControlled": false,
		"pk_org__name": "bx-维修组织",
		"pk_transitype__name": "所有权调出",
		"pk_ownerunit_out__name": "bx-维修组织",
		"pk_ownerorg_out__name": "bx-维修组织",
		"billmaker__name": "赵艳玲",
		"modifier__name": "赵艳玲",
		"total_amount": 0,
		"billmaker": "f68d175f-cf48-4185-8717-0b78af6dca79",
		"creationtime": "2023-12-12 15:35:05",
		"bodyvos": [
			{
				"isapprove_deployin": false,
				"real_opening_amount": 0,
				"pk_status_before__status_name": "在用",
				"collection_tax": 0,
				"pk_user_before": "1795734365037133832",
				"pk_status_after__status_name": "在用",
				"stock_out_flag": false,
				"status_date_after": "2023-12-12",
				"pk_org": "1795743032269602824",
				"notaxassets_amount": 0,
				"pk_user_before__name": "刘龙",
				"pk_equip__equip_code": "EAM-DAILY-WU202311200102191149",
				"associate_flag_before": false,
				"assets_amount_tax": 0,
				"pk_mandept_before__name": "移动部门",
				"pk_usedorg_out__name": "河南机械设备有限公司",
				"id": "1882625942880256004",
				"pubts": "2023-12-12 15:35:06",
				"pk_status_after": "PRESET01_0000LKUKLMA0B7RHFL0000",
				"tenant": "0000LKUKLMA0B7RHFL0000",
				"pk_status_before": "PRESET01_0000LKUKLMA0B7RHFL0000",
				"pk_category__category_name": "资产类别A",
				"rowno": "10",
				"pk_usedept_before": "1843142755217833988",
				"pk_equip__materialFree": {
					"ytenant": "0000LKUKLMA0B7RHFL0000",
					"id": "1866370866070159433",
					"dr": 0
				},
				"amount_received": 0,
				"status_date_before": "2023-11-20",
				"invoicing_generated": 0,
				"assets_amount": 0,
				"main_id": "1882625942880256003",
				"equip_name": "别克V7",
				"pk_category": "1866369568990035973",
				"pk_mandept_after": "",
				"pk_mandept_before": "1795743238428033032",
				"pk_equip": "1866370866070159431",
				"associate_status_flag_before": false,
				"pk_usedorg_out": "1795733574751617025",
				"invoicing_flag": false,
				"stock_in_flag": false,
				"pk_usedept_before__name": "营销子部门",
				"pk_manager_after": "",
				"pk_usedunit_in": "",
				"pk_usedept_after": "",
				"pk_user_after": "",
				"pk_location_after": "",
				"pk_icorg_in": "",
				"pk_warehouse_in": "",
				"pk_faorg_in": "",
				"pk_addreducestyle": "",
				"pk_reason": "",
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
				"pk_jobmngfil": "",
				"pk_faorg_out": "",
				"pk_ownerunit_out": "",
				"pk_ownerorg_out": "",
				"pk_manager_before": "",
				"pk_usedunit_out": "",
				"pk_icorg_out": "",
				"pk_warehouse_out": "",
				"pk_location_before": "",
				"origin_value_before": 0,
				"accu_dep_before": 0,
				"new_value_before": 0,
				"net_money_before": 0,
				"dep_amount_before": 0,
				"used_month_before": 0,
				"service_month_before": 0,
				"salvage_before": 0,
				"begin_date_before": "",
				"salvage_rate_before": 0,
				"pre_devaluate_before": 0,
				"pk_card_before": "",
				"memo": "",
				"pk_org_before": "",
				"pk_org_after": "",
				"equip_spec": "",
				"equip_model": "",
				"bill_code_src": "",
				"pk_usedorg_in": "",
				"expense_item": "",
				"material_name": "",
				"tax_classification_code": "",
				"ntaxrate_code": "",
				"ntaxrate_name": "",
				"ntaxrate": "",
				"material_tax": "",
				"pk_costcenter_manage_in": "",
				"pk_costcenter_used_in": "",
				"pk_profitcenter_manage_in": "",
				"pk_profitcenter_used_in": "",
				"pk_costcenter_manage_out": "",
				"pk_costcenter_used_out": "",
				"pk_profitcenter_manage_out": "",
				"pk_profitcenter_used_out": "",
				"pk_jobmngfil_before": "",
				"pk_jobmngfil_after": "",
				"invoiced_record_code": "",
				"pk_material": ""
			}
		],
		"returncount": 0,
		"verifystate": 2,
		"bill_code": "ZCDC202312120001",
		"pk_currency__priceRount": 4,
		"bizFlow": "45142329-f998-4099-b361-a6552755a1c3",
		"postAccountStatus": 0,
		"modifiedtime": "2023-12-12 15:35:47",
		"userDefines": {
			"ytenant": "0000LKUKLMA0B7RHFL0000",
			"id": "1882625942880256005",
			"dr": 0
		},
		"pk_currency__digit": 2,
		"postAccountVersion": 1,
		"total_amount_tax": 0,
		"notaxtotal_amount": 0,
		"pk_ownerorg_in__name": "hxx-组织",
		"pubts": "2024-01-12 20:25:11",
		"actual_invoice_amount": 0,
		"isFlowCoreBill": true,
		"creator": "f68d175f-cf48-4185-8717-0b78af6dca79",
		"billmaketime": "2023-12-12 15:35:05",
		"pk_customer": "1841646775161585670",
		"auditor": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
		"auditor__name": "昵称-白璇",
		"bill_status": 1,
		"transi_type": "4A33-01",
		"masterOrgKeyField": "pk_ownerorg_out",
		"transTypeKeyField": "pk_transitype"
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

