---
title: "时间型预防性维护详情查询"
apiId: "2336118560187219970"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Time-based Preventive Maintenance"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Time-based Preventive Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 时间型预防性维护详情查询

>  请求方式	POST | Time-based Preventive Maintenance (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/pvmpremaintaincard/detail
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
id	string	否	否	ID 示例：2336117108475691017
code	string	否	否	预防性维护编码 示例：SJPM202508140001

## 3. 请求示例

Url: /yonbip/ACC/pvmpremaintaincard/detail?access_token=访问令牌
Body: {
	"id": "2336117108475691017",
	"code": "SJPM202508140001"
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
code	string	否	返回值编码，200请求成功，其他请求失败 示例：200
message	string	否	返回值提示语 示例：操作成功！
data	object	否	返回值数据
pk_director	string	否	主管人 示例：2117175472615325696
enablestate	number
小数位数:0,最大长度:10	否	启用状态：2已启用 示例：2
wo_content	string	否	工作内容 示例：工作内容
update_template_flag	boolean	否	随预防性维护模板更新 示例：false
pk_location__location_code	string	否	位置编码 示例：LOC25010003
pk_location	string	否	位置ID 示例：2179504390226837507
pk_project	string	否	项目ID 示例：2139443074182938633
pk_org	string	否	维修组织ID 示例：2099319085960527881
pk_equip__equip_code	string	否	资产编码 示例：20-202501160001
pk_transitype	string	否	交易类型ID 示例：2086855417276137592
pk_priority__name	string	否	工单优先级 示例：一周内解决
bill_type	string	否	单据类型 示例：4B72
pk_wo_status__status_type	number
小数位数:0,最大长度:10	否	状态类别 示例：0
id	string	否	预防性维护ID 示例：2336117108475691017
pm_work_obj	object	是	预防性维护作业对象
pk_director__code	string	否	主管人编码 示例：00000003
is_halt	boolean	否	是否停机 示例：false
pk_project__code	string	否	项目编码 示例：xm1
isWfControlled	boolean	否	是否工作流控制 示例：false
pk_org__name	string	否	维修组织 示例：全职能组织
pk_transitype__name	string	否	交易类型 示例：时间型预防性维护
periods_unit	number
小数位数:0,最大长度:10	否	周期单位 示例：1
plan_psn_default_team_member_flag	number
小数位数:0,最大长度:10	否	班组成员带入工单计划人工 示例：0
pk_wo_dept	string	否	负责部门ID 示例：2099319352248500228
pk_executor__name	string	否	执行人 示例：刘大哥
billmaker__name	string	否	制单人 示例：刘大哥
pk_psn_group__name	string	否	工作班组 示例：维修班组T1
wo_pk_transitype__code	string	否	下游单据交易类型编码 示例：4B36-01
pk_overhaul__code	string	否	检修清单 示例：JXQD202411090001
pk_director__name	string	否	主管人 示例：刘龙
billmaker	string	否	制单人ID 示例：5dd8fa6d-285c-4302-ad63-3b754ef4e649
pk_specialty	string	否	负责专业ID 示例：2184630553950552067
pm_std_job	object	是	预防性维护标准工作包频次
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
pk_wo_dept__name	string	否	负责部门 示例：营销部门
pk_wo_status__name	string	否	工单状态 示例：待批准
pk_org__code	string	否	维修组织编码 示例：cc
bill_code	string	否	单据编码 示例：SJPM202508140001
pk_priority	string	否	工单优先级ID 示例：PRESET03_0000M0Z8652LF1ZI810000
pk_project__name	string	否	项目 示例：项目1
pk_currtype	string	否	币种ID 示例：2086855305617997892
pk_priority__cfgColor	string	否	字体颜色 示例：#fff
pk_wo_status	string	否	工单状态ID 示例：2164484657656102920
pk_executor__code	string	否	执行人编码 示例：00000005
next_std_job	string	否	下一工作包ID 示例：2180201197113704453
pk_equip__pk_category	string	否	资产类别ID 示例：2121425308418048001
pk_overhaul	string	否	检修清单ID 示例：2129802281330147329
pk_specialty__special_name	string	否	负责专业 示例：专业001
pk_psn_group	string	否	工作班组ID 示例：2235934874598375426
ahead_days	number
小数位数:0,最大长度:10	否	提前期（天） 示例：0
initial_date	string	否	开始日期 示例：2025-08-14
periods	number
小数位数:0,最大长度:10	否	周期 示例：1
wo_pk_transitype__name	string	否	下游单据交易类型 示例：工单管理
pubts	string	否	时间戳 示例：2025-08-14 16:23:47
origin_next_start_date	string	否	下一工单目标日期 示例：2025-08-14
billmaketime	string	否	制单时间 示例：2025-08-14 16:23:46
origin_alter_flag	boolean	否	可变计划 示例：false
next_std_job__name	string	否	下一工作包 示例：工作包0109-1427
pk_location__location_name	string	否	位置名称 示例：测试位置
counter	number
小数位数:0,最大长度:10	否	计数器 示例：0
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
pk_equip	string	否	资产编码ID 示例：2180370255628468226
wo_pk_transitype	string	否	工单交易类型ID 示例：2086855417276137578
next_start_date	string	否	下一工单目标日期 示例：2025-08-14
pk_priority__cbgColor	string	否	背景颜色 示例：#2992FF
alter_flag	boolean	否	可变计划 示例：false
wo_mode	number
小数位数:0,最大长度:10	否	工作模式 示例：0
transi_type	string	否	交易类型编码 示例：4B72-01
pk_wo_dept__code	string	否	负责部门编码 示例：x1
pk_equip__pk_category__category_name	string	否	资产类别名称 示例：一级资产
pk_equip__equip_name	string	否	资产名称 示例：位置资产0116-1954
pk_specialty__special_code	string	否	负责专业编码 示例：zy001
pk_executor	string	否	执行人 示例：2131255535062745095
persist_flag	boolean	否	永久调整 示例：false
executed_wo_num	number
小数位数:0,最大长度:10	否	已执行工单数量 示例：0
to_be_execute_wo_num	number
小数位数:0,最大长度:10	否	待执行工单数量 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pk_director": "2117175472615325696",
		"enablestate": 2,
		"wo_content": "工作内容",
		"update_template_flag": false,
		"pk_location__location_code": "LOC25010003",
		"pk_location": "2179504390226837507",
		"pk_project": "2139443074182938633",
		"pk_org": "2099319085960527881",
		"pk_equip__equip_code": "20-202501160001",
		"pk_transitype": "2086855417276137592",
		"pk_priority__name": "一周内解决",
		"bill_type": "4B72",
		"pk_wo_status__status_type": 0,
		"id": "2336117108475691017",
		"pm_work_obj": [
			{
				"rowno": "10",
				"pk_location__location_name": "测试位置",
				"main_id": "2336117108475691017",
				"memo": "备注",
				"pk_location__location_code": "LOC25010003",
				"pk_location": "2179504390226837507",
				"pk_org": "2099319085960527881",
				"pk_equip__equip_code": "20-202501160001",
				"pk_equip": "2180370255628468226",
				"pk_equip__equip_name": "位置资产0116-1954",
				"id": "2336117108475691020",
				"pubts": "2025-08-14 16:23:46"
			}
		],
		"pk_director__code": "00000003",
		"is_halt": false,
		"pk_project__code": "xm1",
		"isWfControlled": false,
		"pk_org__name": "全职能组织",
		"pk_transitype__name": "时间型预防性维护",
		"periods_unit": 1,
		"plan_psn_default_team_member_flag": 0,
		"pk_wo_dept": "2099319352248500228",
		"pk_executor__name": "刘大哥",
		"billmaker__name": "刘大哥",
		"pk_psn_group__name": "维修班组T1",
		"wo_pk_transitype__code": "4B36-01",
		"pk_overhaul__code": "JXQD202411090001",
		"pk_director__name": "刘龙",
		"billmaker": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
		"pk_specialty": "2184630553950552067",
		"pm_std_job": [
			{
				"frequence_num": 1,
				"pk_std_job__name": "工作包0109-1427",
				"pk_org__name": "2099319085960527881",
				"pk_std_job": "2180201197113704453",
				"main_id": "2336117108475691017",
				"id": "2336117108475691018",
				"oid": "2180201197113704453",
				"pubts": "2025-08-14 16:23:46",
				"pk_std_job__code": "GZB0009",
				"pk_org": "2099319085960527881",
				"predict_hours": 4
			}
		],
		"returncount": 0,
		"verifystate": 0,
		"pk_wo_dept__name": "营销部门",
		"pk_wo_status__name": "待批准",
		"pk_org__code": "cc",
		"bill_code": "SJPM202508140001",
		"pk_priority": "PRESET03_0000M0Z8652LF1ZI810000",
		"pk_project__name": "项目1",
		"pk_currtype": "2086855305617997892",
		"pk_priority__cfgColor": "#fff",
		"pk_wo_status": "2164484657656102920",
		"pk_executor__code": "00000005",
		"next_std_job": "2180201197113704453",
		"pk_equip__pk_category": "2121425308418048001",
		"pk_overhaul": "2129802281330147329",
		"pk_specialty__special_name": "专业001",
		"pk_psn_group": "2235934874598375426",
		"ahead_days": 0,
		"initial_date": "2025-08-14",
		"periods": 1,
		"wo_pk_transitype__name": "工单管理",
		"pubts": "2025-08-14 16:23:47",
		"origin_next_start_date": "2025-08-14",
		"billmaketime": "2025-08-14 16:23:46",
		"origin_alter_flag": false,
		"next_std_job__name": "工作包0109-1427",
		"pk_location__location_name": "测试位置",
		"counter": 0,
		"bill_status": 0,
		"pk_equip": "2180370255628468226",
		"wo_pk_transitype": "2086855417276137578",
		"next_start_date": "2025-08-14",
		"pk_priority__cbgColor": "#2992FF",
		"alter_flag": false,
		"wo_mode": 0,
		"transi_type": "4B72-01",
		"pk_wo_dept__code": "x1",
		"pk_equip__pk_category__category_name": "一级资产",
		"pk_equip__equip_name": "位置资产0116-1954",
		"pk_specialty__special_code": "zy001",
		"pk_executor": "2131255535062745095",
		"persist_flag": false,
		"executed_wo_num": 0,
		"to_be_execute_wo_num": 0
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
999	id 和 code 不能同时为空！	请填写ID或者预防性维护编码，填写ID根据ID详情查询，如果ID为空填写了编码根据编码查询

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

