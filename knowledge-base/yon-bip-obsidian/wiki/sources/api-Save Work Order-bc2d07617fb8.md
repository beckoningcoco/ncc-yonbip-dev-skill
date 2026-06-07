---
title: "工单保存"
apiId: "bc2d07617fb840e28acf3b5d03af4ed8"
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

# 工单保存

>  请求方式	POST | Work Order Management (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rmmworkordercard/save
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
data	object	是	是	工单参数对象
transi_type	string	否	是	交易类型编码，默认4B36-01，，最大传参长度：50 示例：4B36-01
pk_currtype	string	否	是	币种id或编码，最大传参长度：36 示例：2450028335174912
pk_org	string	否	是	维修组织id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2092784483045632
bill_code	string	否	否	工单号（设置自动编号时可不填、手工编号必须填写），最大传参长度：50 示例：WO2203020001
wo_content	string	否	是	工作内容，最大传参长度：2000 示例：更换备件
pk_wo_status_init	string	否	是	工单初始状态id或编码（该值需要与工单状态保持一致），最大传参长度：id（最大36位），编码（最大50位） 示例：PRESET02_0000KU26QT9NELGXSF0000
pk_wo_status	string	否	是	工单状态id或编码（当工单状态填写待审、已报告、关闭、作废时，不允许录入实际物料、实际人工、实际其他费用参数以及作业方案中实际工时、实际开始时间、实际结束时间、已执行这些参数，当工单状态填写已批准、进行中、完成的状态时，允许填写以上信息），最大传参长度：id（最大36位），编码（最大50位） 示例：PRESET02_0000KU26QT9NELGXSF0000
wo_statustype	int	否	是	工单状态类别（0：待批准，1：已批准，2：进行中，3：完成，4：已报告，5：关闭，6：作废） 示例：2
status_time	DateTime	否	是	状态日期（格式：yyyy-MM-dd） 示例：2022-01-26
pk_worktype	string	否	否	工作类型id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：PRESET04_jl6x46vl
pk_equip	string	否	否	资产卡片id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2093081861346048
pk_ownerorg	string	否	否	资产管理组织id或编码（填写资产卡片的资产管理组织），最大传参长度：id（最大36位），编码（最大50位） 示例：2450028335174912
pk_mandept	string	否	否	资产管理部门id或编码（填写资产卡片的资产管理部门），最大传参长度：id（最大36位），编码（最大50位） 示例：2102845825749504
pk_manager	string	否	否	资产管理人id或编码（填写资产卡片的资产管理人），最大传参长度：id（最大36位），编码（最大50位） 示例：2106960730050816
pk_usedept	string	否	否	资产使用部门id或编码（填写资产卡片的资产使用部门），最大传参长度：id（最大36位），编码（最大50位） 示例：2222031239041280
pk_usedorg	string	否	否	资产使用单位id或编码（填写资产卡片的资产使用单位），最大传参长度：id（最大36位），编码（最大50位） 示例：2094488662675712
pk_user	string	否	否	资产责任人id或编码（填写资产卡片的资产责任人），最大传参长度：id（最大36位），编码（最大50位） 示例：2114628058190336
pk_location	string	否	否	位置id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2093005697536768
pk_priority	string	否	否	优先级id或编码，最大传参长度：id（最大36位），编码（最大40位） 示例：2106143277044224
pri_clause	string	否	否	优先级理由，最大传参长度：200 示例：需一周内解决
workload	string	否	否	主要工作量，最大传参长度：200 示例：维修维护
need_confirm	boolean	否	否	需确认，勾选后，在工单变为完成状态时校验是否签名：true确认，false不需要确认 示例：false
pk_parent_wo	string	否	否	父工单id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2102845825749504
status_follow	boolean	否	否	继承父工单（取值：true和false，如果填写了父工单并将该值填写为true，表示工单状态变动会跟着父工单变） 示例：false
warrant_flag	boolean	否	否	在保（取值true和false，true表示工单在保） 示例：false
memo	string	否	否	备注，最大传参长度：2000 示例：维修工单
failure_time	DateTime	否	否	故障异常时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2022-01-22 10:09:39
pk_failure_detect	string	否	否	故障发现途径id或编码，最大传参长度：id（最大36位），编码（最大40位） 示例：2102785036325376
failure_detail	string	否	否	故障详细说明，最大传参长度：2000 示例：测量结果异常
failure_influence	string	否	否	故障影响，最大传参长度：100 示例：警报一直在对工作环境影响大
pk_reportedby	string	否	否	申请人id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2106960730050816
report_time	DateTime	否	否	申请日期（格式：yyyy-MM-dd） 示例：2021-12-30
pk_executor	string	否	否	工单执行人id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2246086629150976
pk_director	string	否	否	工单主管人id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2101614773342464
pk_psn_group	string	否	否	工作班组id或编码，最大传参长度：id（最大36位），编码（最大40位） 示例：2094573197398528
pk_wo_dept	string	否	否	负责部门id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2092851164352768
pk_specialty	string	否	否	负责专业id或编码，最大传参长度：id（最大36位），编码（最大40位） 示例：2222031239041280
pk_project	string	否	否	项目id或编码，最大传参长度：id（最大36位），编码（最大100位） 示例：2226263615885824
pk_repair_plan	string	否	否	维修计划id，最大传参长度：36 示例：2560388174614784
pk_repair_plan_b	string	否	否	维修计划行id，最大传参长度：36 示例：2372002369982977
targ_start_time	DateTime	否	否	目标开始时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2021-12-30 10:40:08
targ_end_time	DateTime	否	否	目标结束时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2021-12-30 10:40:08
plan_start_time	DateTime	否	否	计划开始时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2021-12-30 10:40:08
plan_end_time	DateTime	否	否	计划结束时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2021-12-30 10:40:08
plan_sthalt_time	DateTime	否	否	计划开始停机时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2021-12-30 10:40:08
plan_endhalt_time	DateTime	否	否	计划结束停机时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2021-12-30 10:40:08
pk_std_job	string	否	否	标准工作包id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2245919455138048
total_normal_hours	number
小数位数:2,最大长度:10	否	否	标准总工时(小时)：此处填写取此处的数据，否则根据计划人工中的数据自动计算 示例：10
consign_flag	boolean	否	否	委外（取值true和false，ture表示该工单由委外厂商执行，为true时，应填写委外原因和供应商，为false时，委外原因和供应商不能填写） 示例：false
consign_reason	string	否	否	委外原因，最大传参长度：200 示例：成本高
pk_provider	string	否	否	供应商id或编码，数据范围：id（长整型数据范围），编码（字符串类型，最大255位） 示例：2094488662675712
actu_start_time	DateTime	否	否	实际开始时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2021-12-30 10:40:08
actu_end_time	DateTime	否	否	实际结束时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2021-12-30 10:40:08
total_actual_hours	number
小数位数:2,最大长度:10	否	否	实际总工时(小时)：此处填写取此处的数据，否则根据实际人工中的数据自动计算 示例：10
actu_sthalt_time	DateTime	否	否	实际开始停机时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2021-12-30 10:40:08
actu_endhalt_time	DateTime	否	否	实际结束停机时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2021-12-30 10:40:08
pk_failure_type	string	否	否	故障类别id或编码，最大传参长度：id（最大36位），编码（最大40位） 示例：2114628058190336
pk_failure_symptom	string	否	否	故障现象id或编码，最大传参长度：id（最大36位），编码（最大40位） 示例：2107213674762752
pk_failure_reason	string	是	否	故障原因id或编码，最大传参长度：id（最大36位），编码（最大40位） 示例：["2251410713235712"]
pk_service_step	string	否	否	维修措施id或编码，最大传参长度：id（最大36位），编码（最大40位） 示例：2107228143522304
failure_reason_desc	string	否	否	故障原因说明，最大传参长度：200 示例：备件故障
service_step_desc	string	否	否	维修措施说明，最大传参长度：200 示例：人工修复
task_progress	string	否	否	工作情况，最大传参长度：200 示例：已修复
task_summary	string	否	否	工作总结，最大传参长度：200 示例：已修复
left_problem	string	否	否	遗留问题，最大传参长度：200 示例：无
opinion	string	否	否	验收意见，最大传参长度：200 示例：通过验收
pl_mtr_mny_org	float	否	否	计划物料成本（仅支持两位小数） 示例：1.32
ac_mtr_mny_org	float	否	否	实际物料成本（仅支持两位小数） 示例：10.52
pl_lbr_mny_org	float	否	否	计划人工成本（仅支持两位小数） 示例：12
ac_lbr_mny_org	float	否	否	实际人工成本（仅支持两位小数） 示例：13
pl_oth_mny_org	float	否	否	计划其他成本（仅支持两位小数） 示例：13
ac_oth_mny_org	float	否	否	实际其他成本（仅支持两位小数） 示例：14
pl_ttl_mny_org	float	否	否	计划总成本（仅支持两位小数） 示例：19
ac_ttl_mny_org	float	否	否	实际总成本（仅支持两位小数） 示例：300.33
_status	string	否	是	状态（目前仅支持Insert） 示例：Insert 默认值：Insert
defines	object	否	否	自定义项（支持60个自定义项）
wo_taskobj	object	是	是	作业对象集合（注意：作业对象必须填写）
wo_task	object	是	否	作业方案集合（当作业方案填写内容时，作业序号必须填写）
wo_plan_inv	object	是	否	计划物料集合
wo_plan_psn	object	是	否	计划人工集合
wo_plan_tool	object	是	否	使用工具集合
wo_planotherexes	object	是	否	计划其他费用集合
wo_precaution	object	是	否	危险预控集合
wo_actual_inv	object	是	否	实际物料集合（工单状态字段传待审、已报告、关闭、作废时，不允许填写实际物料，实际人工，实际其他费用信息，详细描述见工单状态参数）
wo_actual_psn	object	是	否	实际人工集合（工单状态字段传待审、已报告、关闭、作废时，不允许填写实际物料，实际人工，实际其他费用信息，详细描述见工单状态参数）
wo_actualotherexes	object	是	否	实际其他费用集合（工单状态字段传待审、已报告、关闭、作废时，不允许填写实际物料，实际人工，实际其他费用信息，详细描述见工单状态参数）
wo_log	object	是	否	工单日志集合
wo_structure	object	是	否	工单结构集合

## 3. 请求示例

Url: /yonbip/am/rmmworkordercard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"transi_type": "4B36-01",
			"pk_currtype": "2450028335174912",
			"pk_org": "2092784483045632",
			"bill_code": "WO2203020001",
			"wo_content": "更换备件",
			"pk_wo_status_init": "PRESET02_0000KU26QT9NELGXSF0000",
			"pk_wo_status": "PRESET02_0000KU26QT9NELGXSF0000",
			"wo_statustype": 2,
			"status_time": "2022-01-26",
			"pk_worktype": "PRESET04_jl6x46vl",
			"pk_equip": "2093081861346048",
			"pk_ownerorg": "2450028335174912",
			"pk_mandept": "2102845825749504",
			"pk_manager": "2106960730050816",
			"pk_usedept": "2222031239041280",
			"pk_usedorg": "2094488662675712",
			"pk_user": "2114628058190336",
			"pk_location": "2093005697536768",
			"pk_priority": "2106143277044224",
			"pri_clause": "需一周内解决",
			"workload": "维修维护",
			"need_confirm": false,
			"pk_parent_wo": "2102845825749504",
			"status_follow": false,
			"warrant_flag": false,
			"memo": "维修工单",
			"failure_time": "2022-01-22 10:09:39",
			"pk_failure_detect": "2102785036325376",
			"failure_detail": "测量结果异常",
			"failure_influence": "警报一直在对工作环境影响大",
			"pk_reportedby": "2106960730050816",
			"report_time": "2021-12-30",
			"pk_executor": "2246086629150976",
			"pk_director": "2101614773342464",
			"pk_psn_group": "2094573197398528",
			"pk_wo_dept": "2092851164352768",
			"pk_specialty": "2222031239041280",
			"pk_project": "2226263615885824",
			"pk_repair_plan": "2560388174614784",
			"pk_repair_plan_b": "2372002369982977",
			"targ_start_time": "2021-12-30 10:40:08",
			"targ_end_time": "2021-12-30 10:40:08",
			"plan_start_time": "2021-12-30 10:40:08",
			"plan_end_time": "2021-12-30 10:40:08",
			"plan_sthalt_time": "2021-12-30 10:40:08",
			"plan_endhalt_time": "2021-12-30 10:40:08",
			"pk_std_job": "2245919455138048",
			"total_normal_hours": 10,
			"consign_flag": false,
			"consign_reason": "成本高",
			"pk_provider": "2094488662675712",
			"actu_start_time": "2021-12-30 10:40:08",
			"actu_end_time": "2021-12-30 10:40:08",
			"total_actual_hours": 10,
			"actu_sthalt_time": "2021-12-30 10:40:08",
			"actu_endhalt_time": "2021-12-30 10:40:08",
			"pk_failure_type": "2114628058190336",
			"pk_failure_symptom": "2107213674762752",
			"pk_failure_reason": [
				"2251410713235712"
			],
			"pk_service_step": "2107228143522304",
			"failure_reason_desc": "备件故障",
			"service_step_desc": "人工修复",
			"task_progress": "已修复",
			"task_summary": "已修复",
			"left_problem": "无",
			"opinion": "通过验收",
			"pl_mtr_mny_org": 1.32,
			"ac_mtr_mny_org": 10.52,
			"pl_lbr_mny_org": 12,
			"ac_lbr_mny_org": 13,
			"pl_oth_mny_org": 13,
			"ac_oth_mny_org": 14,
			"pl_ttl_mny_org": 19,
			"ac_ttl_mny_org": 300.33,
			"_status": "Insert",
			"defines": {
				"define1": ""
			},
			"wo_taskobj": [
				{
					"sequence_num": 10,
					"pk_equip": "2383571745214976",
					"pk_location": "2356360677742080",
					"memo": "作业对象",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_task": [
				{
					"sequence_num": 10,
					"job_content": "作业方案",
					"std_need": "无",
					"check_means": "日检",
					"normal_hours": 1.32,
					"plan_start_time": "2021-12-30 10:40:08",
					"plan_end_time": "2021-12-30 10:40:08",
					"executed_flag": false,
					"actual_hours": 1.02,
					"actu_start_time": "2021-12-30 10:40:08",
					"actu_end_time": "2021-12-30 10:40:08",
					"memo": "日检",
					"pk_tool": "2352221681078784",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_plan_inv": [
				{
					"sequence_num": 10,
					"pk_material": "2452681396687104",
					"castunitid": "2452679720784128",
					"nnum": 10,
					"vchangerate": 1,
					"pk_measdoc": "2452679720784128",
					"nassistnum": 1,
					"required_date": "2021-12-30",
					"outer_flag": false,
					"pk_stockorg": "2425774269567232",
					"pk_stordoc": "2352221681078784",
					"price_org": 10.32,
					"money_org": 10.11,
					"memo": "备注",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_plan_psn": [
				{
					"sequence_num": 10,
					"pk_job_type": "2425774269567232",
					"person_num": 10,
					"pk_psndoc": "2352247730622720",
					"man_hours": 1,
					"rate": 1.3,
					"money": 3.12,
					"memo": "备注",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_plan_tool": [
				{
					"sequence_num": 10,
					"pk_tool": "2452356266333952",
					"tools_num": 10,
					"memo": "备注",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_planotherexes": [
				{
					"sequence_num": 10,
					"exestype": "计划费用",
					"pk_inoutbusiclass": "2352247172796672",
					"exesmoney": 10.35,
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_precaution": [
				{
					"pk_precaution": "2452930992509184",
					"risk_zone": "危险机器",
					"precaution_content": "1米内禁止入内",
					"memo": "备注",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_actual_inv": [
				{
					"sequence_num": 10,
					"vouchdate": "2020-02-11",
					"pk_material": "2452930992509184",
					"castunitid": "2452356266333952",
					"nnum": 1,
					"vchangerate": 1,
					"pk_measdoc": "2452356266333952",
					"nassistnum": 1,
					"outer_flag": false,
					"pk_stockorg": "2454081040601344",
					"pk_stordoc": "2454082041270528",
					"inout_date": "2021-12-30",
					"price_org": 130.2,
					"money_org": 130.2,
					"memo": "备注",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_actual_psn": [
				{
					"sequence_num": 10,
					"pk_job_type": "2452358030807296",
					"pk_psndoc": "2454081040601344",
					"man_hours": 10,
					"rate": 100,
					"money": 1000,
					"memo": "备注",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_actualotherexes": [
				{
					"sequence_num": 10,
					"exestype": "收支费用",
					"pk_inoutbusiclass": "PRESET02_0000KU26QT9NELGXSF0000",
					"exesmoney": 100,
					"memo": "备注",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_log": [
				{
					"pk_recorder": "2452356266333952",
					"rec_time": "2022-01-26",
					"content": "工单日志",
					"meno": "备注",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			],
			"wo_structure": [
				{
					"id": "2505049005740288",
					"_status": "Insert",
					"defines": {
						"define1": ""
					}
				}
			]
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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
count	long	否	总数 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	string	是	返回详细信息 示例：[]
infos	object	是	数据详细信息
failInfos	string	是	错误详细信息 示例：[]

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [],
		"infos": [
			{
				"pk_director": "2551546173378816",
				"consign_reason": "委外原因：成本高",
				"wo_content": "工单0214-101",
				"actu_end_time": "2022-02-15 15:20:14",
				"total_actual_hours": 10,
				"pk_std_job": "2620826304254208",
				"total_normal_hours": 10,
				"memo": "主表备注",
				"pk_location": "2493505317589248",
				"pk_project": "2563388614153472",
				"pk_org": "2491180698735360",
				"pk_transitype": "2450028335617430",
				"failure_reason_desc": "故障原因说明",
				"bill_type": "4B36",
				"status_follow": false,
				"status_time": "2022-02-15 00:00:00",
				"id": "2669357696389376",
				"pk_service_step": "2466810610798848",
				"tenant": "0000KU26QT9NELGXSF0000",
				"consign_flag": false,
				"pk_wo_dept": "2492105228570880",
				"failure_detail": "故障详细说明",
				"report_time": "2022-02-15 00:00:00",
				"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"pk_specialty": "2493506792313088",
				"actu_start_time": "2021-12-30 10:40:08",
				"pk_reportedby": "2551546173378816",
				"creationtime": "2022-03-01 16:51:04",
				"actu_sthalt_time": "2021-12-30 10:40:08",
				"plan_end_time": "2022-02-15 00:00:00",
				"pk_parent_wo": "2493506792313088",
				"targ_end_time": "2022-02-15 00:00:00",
				"service_step_desc": "维修措施说明",
				"plan_start_time": "2021-12-30 10:40:08",
				"pk_priority": "PRESET01_0000KU26QT9NELGXSF0000",
				"bill_code": "WO2203010010",
				"pk_worktype": "PRESET03_0000KU26QT9NELGXSF0000",
				"pk_currtype": "2503414337246976",
				"pk_wo_status": "PRESET01_0000KU26QT9NELGXSF0000",
				"failure_time": "2022-02-15 14:32:22",
				"innercode": "123",
				"pk_failure_symptom": "2466795670393088",
				"need_confirm": false,
				"haschild_flag": false,
				"pk_repair_plan_b": "2648027955893250",
				"pri_clause": "优先级理由",
				"pk_equip": "2669357696389376",
				"failure_influence": "警报一直在对工作环境影响大",
				"transi_type": "4B36-01",
				"task_summary": "工作总结",
				"pk_failure_reason": [
					"2466808922476800"
				],
				"pk_executor": "2551546173378816",
				"pk_provider": 2611166171566336,
				"plan_endhalt_time": "2022-02-15 00:00:00",
				"plan_sthalt_time": "2021-12-30 10:40:08",
				"wo_taskobj": [
					{
						"memo": "子表备注",
						"main_id": "2669357696389376",
						"pk_location": "2466795670393088",
						"pk_equip": "2465437695414528",
						"pk_equip__equip_name": "bx专业点检",
						"pk_equip__equip_code": "202110080003",
						"id": "2669357696389377"
					}
				],
				"wo_his": [
					{
						"main_id": "2669357696389376",
						"pk_changer": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"id": "2669357696405760",
						"pk_wostatus": "PRESET01_0000KU26QT9NELGXSF0000"
					}
				],
				"wo_task": [
					{
						"sequence_num": "10",
						"job_content": "预防性维护使用",
						"std_need": "标准要求"
					}
				],
				"wo_plan_inv": [
					{
						"sequence_num": "10",
						"pk_material": "2452681396687104",
						"nnum": "1",
						"nassistnum": "1",
						"pk_measdoc": "2452679720784128",
						"castunitid": "2452679720784128",
						"vchangerate": "1",
						"price_org": "1",
						"money_org": "1",
						"pk_material__name": "11",
						"pk_material__code": "000001",
						"pk_measdoc__code": "1",
						"pk_measdoc__name": "1"
					}
				],
				"wo_plan_psn": [
					{
						"sequence_num": "10",
						"pk_job_type": "2452983277719808",
						"pk_job_type__code": "01bx",
						"person_num": "1",
						"man_hours": "1",
						"rate": "1",
						"money": "1"
					}
				],
				"wo_plan_tool": [
					{
						"sequence_num": "10",
						"pk_tool": "2541604705554688",
						"pk_tool__code": "01test",
						"pk_tool__name": "test-停启用工具",
						"tools_num": "1"
					}
				],
				"wo_structure": [
					{
						"id__bill_code": "WO2203020039",
						"id": "2670946084557824",
						"id__wo_content": "测试openapi",
						"id__pk_worktype": "PRESET03_0000KU26QT9NELGXSF0000",
						"id__pk_worktype__name": "缺陷维修",
						"id__pk_wo_status": "PRESET04_0000KU26QT9NELGXSF0000",
						"id__pk_wo_status__name": "完成"
					}
				],
				"wo_planotherexes": {
					"sequence_num": "10",
					"pk_inoutbusiclass": "2553473576849920",
					"pk_inoutbusiclass__name": "费用项目test",
					"exestype": "1"
				},
				"wo_precaution": {
					"pk_precaution": "2582645450526976",
					"pk_precaution__code": "001QY",
					"pk_precaution__name": "企业级-风险",
					"risk_zone": "风险点",
					"precaution_content": "点检防控",
					"memo": "11"
				},
				"wo_log": {
					"pk_recorder": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
					"rec_time": "2022-03-02 00:00:00",
					"content": "11",
					"memo": "11"
				}
			}
		],
		"failInfos": []
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
999	报错具体提示信息，例如：输入的长度不能超过40位	

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

