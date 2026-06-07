---
title: "集成插件-工单资本化生成价值调整单"
apiId: "2360629216989937671"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Order Management"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Order Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 集成插件-工单资本化生成价值调整单

>  请求方式	POST | Work Order Management (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/workorder/capital
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
id	string	否	否	主键
bill_code	string	否	否	单据编码
transi_type	string	否	否	交易类型编码
pk_transitype	string	否	否	交易类型
bill_type	string	否	否	单据类型
bill_status	number
小数位数:0,最大长度:10	否	否	单据状态
memo	string	否	否	备注
creator	string	否	否	创建人
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间
modifier	string	否	否	最后修改人
auditor	string	否	否	审批人
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批时间
billmaker	string	否	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间
ts	string	否	否	ts
ac_ttl_mny_org	number
小数位数:8,最大长度:20	否	否	实际总成本
ac_tol_mny_org	number
小数位数:8,最大长度:20	否	否	实际工具成本
ac_oth_mny_org	number
小数位数:8,最大长度:20	否	否	实际其他成本
ac_mtr_mny_org	number
小数位数:8,最大长度:20	否	否	实际物料成本
ac_lbr_mny_org	number
小数位数:8,最大长度:20	否	否	实际人工成本
actu_end_time	date
格式:yyyy-MM-dd HH:mm:ss	否	否	实际结束时间
actu_start_time	date
格式:yyyy-MM-dd HH:mm:ss	否	否	实际开始时间
capitalize_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	资本化日期
maintenance_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	维修日期
error_msg	string	否	否	固资对接异常信息
pk_equip	string	否	否	资产卡片
pk_director	string	否	否	工单主管人
pk_contract	string	否	否	维修合同
pk_contract_basic	string	否	否	合同基本
pk_costcenter_bear	string	否	否	承担成本中心
pk_costcenter_repair	string	否	否	维修成本中心
pk_costcenter_use	string	否	否	使用成本中心
pk_currtype	string	否	否	币种
pk_customer	string	否	否	内部客户
pk_equip_capital	string	否	否	资本化资产
pk_equip_top	string	否	否	顶级资产
pk_fiorg	string	否	否	固定资产会计主体
pk_fiorg_ap	string	否	否	应付会计主体
pk_fiorg_apmt	string	否	否	维修应付会计主体
pk_fiorg_armt	string	否	否	维修应收会计主体
pk_fiorg_ic	string	否	否	领料会计主体
pk_location	string	否	否	位置
pk_manager	string	否	否	资产管理人
pk_mandept	string	否	否	资产管理部门
pk_org	string	否	否	维修组织
pk_ownerorg	string	否	否	资产管理组织
pk_ownerunit	string	否	否	所有权
pk_stockorg	string	否	否	库存组织
pk_project	string	否	否	项目
pk_provider	string	否	否	供应商
pk_profitcen_ap	string	否	否	应付利润中心
pk_profitcen_apmt	string	否	否	维修应付利润中心
pk_profitcen_armt	string	否	否	维修应收利润中心
pk_profitcenter_repair	string	否	否	维修利润中心
pk_profitcenter_use	string	否	否	使用利润中心
pk_usedept	string	否	否	资产使用部门
pk_usedorg	string	否	否	资产使用单位
pk_user	string	否	否	资产责任人
pk_wo_dept	string	否	否	负责部门
pk_wo_status	string	否	否	工单状态
pk_worktype	string	否	否	工作类型
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳
push_status	number
小数位数:0,最大长度:10	否	否	固资对接生单状态
tenant	string	否	否	租户
work_order_type	number
小数位数:0,最大长度:10	否	否	工单类型
wo_actual_inv	object	是	否	实际物料
id	string	否	否	主键
main_id	string	否	否	主表主键
first_billid	string	否	否	源头单据
first_billbid	string	否	否	源头单据表体
cother_billid	string	否	否	对应实际物料表头
cother_bill_bid	string	否	否	对应实际物料行
castunitid	string	否	否	单位
origcurrtypeid	string	否	否	原币币种
pk_materia	string	否	否	物料
pk_measdoc	string	否	否	主单位
pk_org	string	否	否	维修组织
pk_stockorg	string	否	否	库存组织
pk_stordoc	string	否	否	仓库
pk_stordoc_ret	string	否	否	本次退库仓库
src_bill_code	string	否	否	单据号
src_bill_type	string	否	否	来源单据类型
src_pk_bill	string	否	否	来源单据表头
src_pk_bill_b	string	否	否	来源单据表体
src_pk_transitype	string	否	否	来源交易类型
src_rowno	string	否	否	来源单据行号
src_transitype	string	否	否	来源交易类型编码
sysid	string	否	否	应用标识
serial_num	string	否	否	物料序列号
money	number
小数位数:8,最大长度:20	否	否	原币金额
money_org	number
小数位数:8,最大长度:20	否	否	金额
nassistnum	number
小数位数:8,最大长度:20	否	否	数量
nnum	number
小数位数:8,最大长度:20	否	否	主数量
price	number
小数位数:8,最大长度:20	否	否	原币单价
price_org	number
小数位数:8,最大长度:20	否	否	单价
retnum	number
小数位数:8,最大长度:20	否	否	已退主数量
return_assnum	number
小数位数:8,最大长度:20	否	否	本次退库数量
return_num	number
小数位数:8,最大长度:20	否	否	本次退库主数量
rowno	number
小数位数:8,最大长度:20	否	否	行号
vchangerate	number
小数位数:8,最大长度:20	否	否	换算率
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳
src_body_ts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	来源单据表体时间戳
src_head_ts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	来源单据表头时间戳
vouchdate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据日期
wo_plan_inv	object	是	否	计划物料
required_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	需求日期
tgathertime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	汇总时间
applynum	number
小数位数:8,最大长度:20	否	否	计划申请主数量
buynum	number
小数位数:8,最大长度:20	否	否	已请购主数量
money_org	number
小数位数:8,最大长度:20	否	否	参考成本
naccustornum	number
小数位数:8,最大长度:20	否	否	库存满足主数量
nassistnum	number
小数位数:8,最大长度:20	否	否	数量
nnetnum	number
小数位数:8,最大长度:20	否	否	转净需求/请购数量
nnum	number
小数位数:8,最大长度:20	否	否	主数量
nreqrsnum	number
小数位数:8,最大长度:20	否	否	预留数量
outnum	number
小数位数:8,最大长度:20	否	否	已发主数量
price_org	number
小数位数:8,最大长度:20	否	否	主参考单价
vchangerate	number
小数位数:8,最大长度:20	否	否	换算率
castunitid	string	否	否	汇总人
main_id	string	否	否	主表主键
pk_material	string	否	否	物料
pk_measdoc	string	否	否	主单位
pk_org	string	否	否	维修组织
pk_stockorg	string	否	否	库存组织
pk_stordoc	string	否	否	仓库
rowno	string	否	否	行号
serial_num	string	否	否	物料序列号
src_bill_code	string	否	否	来源单据编码
src_bill_type	string	否	否	来源单据类型
src_pk_bill	string	否	否	来源单据表头主键
src_pk_bill_b	string	否	否	来源单据表体主键
src_pk_transitype	string	否	否	来源交易类型主键
src_rowno	string	否	否	来源单据行号
src_transitype	string	否	否	来源交易类型
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳
src_body_ts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	来源单据表体时间戳
src_head_ts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	来源单据表头时间戳

## 3. 请求示例

Url: /yonbip/ACC/workorder/capital?access_token=访问令牌
Body: {
	"id": "",
	"bill_code": "",
	"transi_type": "",
	"pk_transitype": "",
	"bill_type": "",
	"bill_status": 0,
	"memo": "",
	"creator": "",
	"creationtime": "2026-06-07 13:24:44",
	"modifier": "",
	"auditor": "",
	"audittime": "2026-06-07 13:24:44",
	"billmaker": "",
	"billmaketime": "2026-06-07 13:24:44",
	"ts": "",
	"ac_ttl_mny_org": 0,
	"ac_tol_mny_org": 0,
	"ac_oth_mny_org": 0,
	"ac_mtr_mny_org": 0,
	"ac_lbr_mny_org": 0,
	"actu_end_time": "2026-06-07 13:24:44",
	"actu_start_time": "2026-06-07 13:24:44",
	"capitalize_date": "2026-06-07 13:24:44",
	"maintenance_date": "2026-06-07 13:24:44",
	"error_msg": "",
	"pk_equip": "",
	"pk_director": "",
	"pk_contract": "",
	"pk_contract_basic": "",
	"pk_costcenter_bear": "",
	"pk_costcenter_repair": "",
	"pk_costcenter_use": "",
	"pk_currtype": "",
	"pk_customer": "",
	"pk_equip_capital": "",
	"pk_equip_top": "",
	"pk_fiorg": "",
	"pk_fiorg_ap": "",
	"pk_fiorg_apmt": "",
	"pk_fiorg_armt": "",
	"pk_fiorg_ic": "",
	"pk_location": "",
	"pk_manager": "",
	"pk_mandept": "",
	"pk_org": "",
	"pk_ownerorg": "",
	"pk_ownerunit": "",
	"pk_stockorg": "",
	"pk_project": "",
	"pk_provider": "",
	"pk_profitcen_ap": "",
	"pk_profitcen_apmt": "",
	"pk_profitcen_armt": "",
	"pk_profitcenter_repair": "",
	"pk_profitcenter_use": "",
	"pk_usedept": "",
	"pk_usedorg": "",
	"pk_user": "",
	"pk_wo_dept": "",
	"pk_wo_status": "",
	"pk_worktype": "",
	"pubts": "2026-06-07 13:24:44",
	"push_status": 0,
	"tenant": "",
	"work_order_type": 0,
	"wo_actual_inv": [
		{
			"id": "",
			"main_id": "",
			"first_billid": "",
			"first_billbid": "",
			"cother_billid": "",
			"cother_bill_bid": "",
			"castunitid": "",
			"origcurrtypeid": "",
			"pk_materia": "",
			"pk_measdoc": "",
			"pk_org": "",
			"pk_stockorg": "",
			"pk_stordoc": "",
			"pk_stordoc_ret": "",
			"src_bill_code": "",
			"src_bill_type": "",
			"src_pk_bill": "",
			"src_pk_bill_b": "",
			"src_pk_transitype": "",
			"src_rowno": "",
			"src_transitype": "",
			"sysid": "",
			"serial_num": "",
			"money": 0,
			"money_org": 0,
			"nassistnum": 0,
			"nnum": 0,
			"price": 0,
			"price_org": 0,
			"retnum": 0,
			"return_assnum": 0,
			"return_num": 0,
			"rowno": 0,
			"vchangerate": 0,
			"pubts": "2026-06-07 13:24:44",
			"src_body_ts": "2026-06-07 13:24:44",
			"src_head_ts": "2026-06-07 13:24:44",
			"vouchdate": "2026-06-07 13:24:44"
		}
	],
	"wo_plan_inv": [
		{
			"required_date": "2026-06-07 13:24:44",
			"tgathertime": "2026-06-07 13:24:44",
			"applynum": 0,
			"buynum": 0,
			"money_org": 0,
			"naccustornum": 0,
			"nassistnum": 0,
			"nnetnum": 0,
			"nnum": 0,
			"nreqrsnum": 0,
			"outnum": 0,
			"price_org": 0,
			"vchangerate": 0,
			"castunitid": "",
			"main_id": "",
			"pk_material": "",
			"pk_measdoc": "",
			"pk_org": "",
			"pk_stockorg": "",
			"pk_stordoc": "",
			"rowno": "",
			"serial_num": "",
			"src_bill_code": "",
			"src_bill_type": "",
			"src_pk_bill": "",
			"src_pk_bill_b": "",
			"src_pk_transitype": "",
			"src_rowno": "",
			"src_transitype": "",
			"pubts": "2026-06-07 13:24:44",
			"src_body_ts": "2026-06-07 13:24:44",
			"src_head_ts": "2026-06-07 13:24:44"
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
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
id	string	否	主键
bill_code	string	否	单据编码
transi_type	string	否	交易类型编码
pk_transitype	string	否	交易类型
bill_type	string	否	单据类型
bill_status	number
小数位数:0,最大长度:10	否	单据状态
memo	string	否	备注
creator	string	否	创建人
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间
modifier	string	否	最后修改人
auditor	string	否	审批人
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	审批时间
billmaker	string	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	制单时间
ts	string	否	ts
ac_ttl_mny_org	number
小数位数:8,最大长度:20	否	实际总成本
ac_tol_mny_org	number
小数位数:8,最大长度:20	否	实际工具成本
ac_oth_mny_org	number
小数位数:8,最大长度:20	否	实际其他成本
ac_mtr_mny_org	number
小数位数:8,最大长度:20	否	实际物料成本
ac_lbr_mny_org	number
小数位数:8,最大长度:20	否	实际人工成本
actu_end_time	date
格式:yyyy-MM-dd HH:mm:ss	否	实际结束时间
actu_start_time	date
格式:yyyy-MM-dd HH:mm:ss	否	实际开始时间
capitalize_date	date
格式:yyyy-MM-dd HH:mm:ss	否	资本化日期
maintenance_date	date
格式:yyyy-MM-dd HH:mm:ss	否	维修日期
error_msg	string	否	固资对接异常信息
pk_equip	string	否	资产卡片
pk_director	string	否	工单主管人
pk_contract	string	否	维修合同
pk_contract_basic	string	否	合同基本
pk_costcenter_bear	string	否	承担成本中心
pk_costcenter_repair	string	否	维修成本中心
pk_costcenter_use	string	否	使用成本中心
pk_currtype	string	否	币种
pk_customer	string	否	内部客户
pk_equip_capital	string	否	资本化资产
pk_equip_top	string	否	顶级资产
pk_fiorg	string	否	固定资产会计主体
pk_fiorg_ap	string	否	应付会计主体
pk_fiorg_apmt	string	否	维修应付会计主体
pk_fiorg_armt	string	否	维修应收会计主体
pk_fiorg_ic	string	否	领料会计主体
pk_location	string	否	位置
pk_manager	string	否	资产管理人
pk_mandept	string	否	资产管理部门
pk_org	string	否	维修组织
pk_ownerorg	string	否	资产管理组织
pk_ownerunit	string	否	所有权
pk_stockorg	string	否	库存组织
pk_project	string	否	项目
pk_provider	string	否	供应商
pk_profitcen_ap	string	否	应付利润中心
pk_profitcen_apmt	string	否	维修应付利润中心
pk_profitcen_armt	string	否	维修应收利润中心
pk_profitcenter_repair	string	否	维修利润中心
pk_profitcenter_use	string	否	使用利润中心
pk_usedept	string	否	资产使用部门
pk_usedorg	string	否	资产使用单位
pk_user	string	否	资产责任人
pk_wo_dept	string	否	负责部门
pk_wo_status	string	否	工单状态
pk_worktype	string	否	工作类型
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳
push_status	number
小数位数:0,最大长度:10	否	固资对接生单状态
tenant	string	否	租户
work_order_type	number
小数位数:0,最大长度:10	否	工单类型
wo_actual_inv	object	是	实际物料
id	string	否	主键
main_id	string	否	主表主键
first_billid	string	否	源头单据
first_billbid	string	否	源头单据表体
cother_billid	string	否	对应实际物料表头
cother_bill_bid	string	否	对应实际物料行
castunitid	string	否	单位
origcurrtypeid	string	否	原币币种
pk_materia	string	否	物料
pk_measdoc	string	否	主单位
pk_org	string	否	维修组织
pk_stockorg	string	否	库存组织
pk_stordoc	string	否	仓库
pk_stordoc_ret	string	否	本次退库仓库
src_bill_code	string	否	单据号
src_bill_type	string	否	来源单据类型
src_pk_bill	string	否	来源单据表头
src_pk_bill_b	string	否	来源单据表体
src_pk_transitype	string	否	来源交易类型
src_rowno	string	否	来源单据行号
src_transitype	string	否	来源交易类型编码
sysid	string	否	应用标识
serial_num	string	否	物料序列号
money	number
小数位数:8,最大长度:20	否	原币金额
money_org	number
小数位数:8,最大长度:20	否	金额
nassistnum	number
小数位数:8,最大长度:20	否	数量
nnum	number
小数位数:8,最大长度:20	否	主数量
price	number
小数位数:8,最大长度:20	否	原币单价
price_org	number
小数位数:8,最大长度:20	否	单价
retnum	number
小数位数:8,最大长度:20	否	已退主数量
return_assnum	number
小数位数:8,最大长度:20	否	本次退库数量
return_num	number
小数位数:8,最大长度:20	否	本次退库主数量
rowno	number
小数位数:8,最大长度:20	否	行号
vchangerate	number
小数位数:8,最大长度:20	否	换算率
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳
src_body_ts	date
格式:yyyy-MM-dd HH:mm:ss	否	来源单据表体时间戳
src_head_ts	date
格式:yyyy-MM-dd HH:mm:ss	否	来源单据表头时间戳
vouchdate	date
格式:yyyy-MM-dd HH:mm:ss	否	单据日期
wo_plan_inv	object	是	计划物料
required_date	date
格式:yyyy-MM-dd HH:mm:ss	否	需求日期
tgathertime	date
格式:yyyy-MM-dd HH:mm:ss	否	汇总时间
applynum	number
小数位数:8,最大长度:20	否	计划申请主数量
buynum	number
小数位数:8,最大长度:20	否	已请购主数量
money_org	number
小数位数:8,最大长度:20	否	参考成本
naccustornum	number
小数位数:8,最大长度:20	否	库存满足主数量
nassistnum	number
小数位数:8,最大长度:20	否	数量
nnetnum	number
小数位数:8,最大长度:20	否	转净需求/请购数量
nnum	number
小数位数:8,最大长度:20	否	主数量
nreqrsnum	number
小数位数:8,最大长度:20	否	预留数量
outnum	number
小数位数:8,最大长度:20	否	已发主数量
price_org	number
小数位数:8,最大长度:20	否	主参考单价
vchangerate	number
小数位数:8,最大长度:20	否	换算率
castunitid	string	否	汇总人
main_id	string	否	主表主键
pk_material	string	否	物料
pk_measdoc	string	否	主单位
pk_org	string	否	维修组织
pk_stockorg	string	否	库存组织
pk_stordoc	string	否	仓库
rowno	string	否	行号
serial_num	string	否	物料序列号
src_bill_code	string	否	来源单据编码
src_bill_type	string	否	来源单据类型
src_pk_bill	string	否	来源单据表头主键
src_pk_bill_b	string	否	来源单据表体主键
src_pk_transitype	string	否	来源交易类型主键
src_rowno	string	否	来源单据行号
src_transitype	string	否	来源交易类型
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳
src_body_ts	date
格式:yyyy-MM-dd HH:mm:ss	否	来源单据表体时间戳
src_head_ts	date
格式:yyyy-MM-dd HH:mm:ss	否	来源单据表头时间戳

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"bill_code": "",
		"transi_type": "",
		"pk_transitype": "",
		"bill_type": "",
		"bill_status": 0,
		"memo": "",
		"creator": "",
		"creationtime": "2026-06-07 13:24:44",
		"modifier": "",
		"auditor": "",
		"audittime": "2026-06-07 13:24:44",
		"billmaker": "",
		"billmaketime": "2026-06-07 13:24:44",
		"ts": "",
		"ac_ttl_mny_org": 0,
		"ac_tol_mny_org": 0,
		"ac_oth_mny_org": 0,
		"ac_mtr_mny_org": 0,
		"ac_lbr_mny_org": 0,
		"actu_end_time": "2026-06-07 13:24:44",
		"actu_start_time": "2026-06-07 13:24:44",
		"capitalize_date": "2026-06-07 13:24:44",
		"maintenance_date": "2026-06-07 13:24:44",
		"error_msg": "",
		"pk_equip": "",
		"pk_director": "",
		"pk_contract": "",
		"pk_contract_basic": "",
		"pk_costcenter_bear": "",
		"pk_costcenter_repair": "",
		"pk_costcenter_use": "",
		"pk_currtype": "",
		"pk_customer": "",
		"pk_equip_capital": "",
		"pk_equip_top": "",
		"pk_fiorg": "",
		"pk_fiorg_ap": "",
		"pk_fiorg_apmt": "",
		"pk_fiorg_armt": "",
		"pk_fiorg_ic": "",
		"pk_location": "",
		"pk_manager": "",
		"pk_mandept": "",
		"pk_org": "",
		"pk_ownerorg": "",
		"pk_ownerunit": "",
		"pk_stockorg": "",
		"pk_project": "",
		"pk_provider": "",
		"pk_profitcen_ap": "",
		"pk_profitcen_apmt": "",
		"pk_profitcen_armt": "",
		"pk_profitcenter_repair": "",
		"pk_profitcenter_use": "",
		"pk_usedept": "",
		"pk_usedorg": "",
		"pk_user": "",
		"pk_wo_dept": "",
		"pk_wo_status": "",
		"pk_worktype": "",
		"pubts": "2026-06-07 13:24:44",
		"push_status": 0,
		"tenant": "",
		"work_order_type": 0,
		"wo_actual_inv": [
			{
				"id": "",
				"main_id": "",
				"first_billid": "",
				"first_billbid": "",
				"cother_billid": "",
				"cother_bill_bid": "",
				"castunitid": "",
				"origcurrtypeid": "",
				"pk_materia": "",
				"pk_measdoc": "",
				"pk_org": "",
				"pk_stockorg": "",
				"pk_stordoc": "",
				"pk_stordoc_ret": "",
				"src_bill_code": "",
				"src_bill_type": "",
				"src_pk_bill": "",
				"src_pk_bill_b": "",
				"src_pk_transitype": "",
				"src_rowno": "",
				"src_transitype": "",
				"sysid": "",
				"serial_num": "",
				"money": 0,
				"money_org": 0,
				"nassistnum": 0,
				"nnum": 0,
				"price": 0,
				"price_org": 0,
				"retnum": 0,
				"return_assnum": 0,
				"return_num": 0,
				"rowno": 0,
				"vchangerate": 0,
				"pubts": "2026-06-07 13:24:44",
				"src_body_ts": "2026-06-07 13:24:44",
				"src_head_ts": "2026-06-07 13:24:44",
				"vouchdate": "2026-06-07 13:24:44"
			}
		],
		"wo_plan_inv": [
			{
				"required_date": "2026-06-07 13:24:44",
				"tgathertime": "2026-06-07 13:24:44",
				"applynum": 0,
				"buynum": 0,
				"money_org": 0,
				"naccustornum": 0,
				"nassistnum": 0,
				"nnetnum": 0,
				"nnum": 0,
				"nreqrsnum": 0,
				"outnum": 0,
				"price_org": 0,
				"vchangerate": 0,
				"castunitid": "",
				"main_id": "",
				"pk_material": "",
				"pk_measdoc": "",
				"pk_org": "",
				"pk_stockorg": "",
				"pk_stordoc": "",
				"rowno": "",
				"serial_num": "",
				"src_bill_code": "",
				"src_bill_type": "",
				"src_pk_bill": "",
				"src_pk_bill_b": "",
				"src_pk_transitype": "",
				"src_rowno": "",
				"src_transitype": "",
				"pubts": "2026-06-07 13:24:44",
				"src_body_ts": "2026-06-07 13:24:44",
				"src_head_ts": "2026-06-07 13:24:44"
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

