---
title: "工单详情查询"
apiId: "1960515767524392961"
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

# 工单详情查询

>  请求方式	POST | Work Order Management (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rmmworkordercard/detail
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
id	string	否	否	工单主键 示例：1959801737788784642
externalData	object	否	否	扩展参数
bill_code	string	否	否	工单号

## 3. 请求示例

Url: /yonbip/am/rmmworkordercard/detail?access_token=访问令牌
Body: {
	"id": "1959801737788784642",
	"externalData": {
		"bill_code": ""
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
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pk_group	string	否	集团 示例：666666
wo_content	string	否	工作内容 示例：仓库位置故障处理
receivable_flag	boolean	否	已生成应收 示例：false
need_check	boolean	否	需验收 示例：false
source	string	否	来源 示例：ucf-amc-aom.aom_failure_card
pk_location__location_code	string	否	位置编码 示例：LOC2023122700001
pk_location	string	否	位置主键 示例：1893716441699975176
pk_org	string	否	维修组织 示例：1764630529618477058
wo_source	object	是	来源信息
pk_transitype	string	否	交易类型 示例：1763914120481473711
payable_flag	boolean	否	已生成应付 示例：false
payout_flag	boolean	否	已生成对外应付 示例：false
bill_type	string	否	单据类型 示例：4B36
settled_list_flag	boolean	否	已生成待结算清单标识 示例：false
wo_ticket	string	是	关联工作票
status_follow	boolean	否	继承父工单状态 示例：false
status_time	string	否	状态时间 示例：2024-03-26 14:08:15
id	string	否	主键 示例：1960509084444131336
creator__name	string	否	创建人名称 示例：昵称-18511801250
tenant	string	否	租户 示例：0000LJPGZ3RX3YAKG10000
haslatter_flag	boolean	否	后续工作 示例：false
failure_flag	boolean	否	已生成故障记录 示例：false
isWfControlled	boolean	否	是否审批流控制 示例：false
sysid	string	否	应用标识 示例：RMM
pk_transitype__name	string	否	来源交易类型名称 示例：工单管理
pk_org__name	string	否	维修组织名称 示例：全职能组织
pk_location__pk_org	string	否	资产组织 示例：1764630529618477058
pk_currtype__priceRount	number
小数位数:0,最大长度:10	否	四舍五入法则 示例：4
consign_flag	boolean	否	委外 示例：false
billmaker__name	string	否	制单人名称 示例：昵称-18511801250
failure_detail	string	否	故障详细说明 示例：部位,浓度,1.55,异常
report_time	string	否	申请时间 示例：2024-03-26 14:08:15
billmaker	string	否	制单人 示例：74163741-643b-4584-ad44-02385c3787de
pk_currtype__moneyRount	number
小数位数:0,最大长度:10	否	单价舍入规则 示例：4
creationtime	string	否	创建时间 示例：2024-03-26 14:08:16
file_before_repair	string	否	维修前图片/视频 示例：75307733-c370-a30d-eb94-f54aa20137cb
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
pk_wo_status__name	string	否	工单状态名称 示例：待审
requirepermit	boolean	否	需要许可 示例：false
settle_flag	boolean	否	已结算 示例：false
bill_code	string	否	工单号 示例：WO2403260002
makeRuleCode	string	否	生单规则编号 示例：failure2WorkOrder
pk_worktype	string	否	工作类型 示例：PRESET04_0000LJPGZ3RX3YAKG10000
pk_currtype	string	否	币种 示例：1763914111891537950
pk_currtype__name	string	否	币种名称 示例：人民币
pk_wo_status	string	否	工单状态 示例：PRESET01_0000LJPGZ3RX3YAKG10000
failure_time	string	否	故障异常时间 示例：2024-03-14 11:50:02
warrant_flag	boolean	否	在保 示例：false
haschild_flag	boolean	否	有子工单 示例：false
userDefines	object	否	工单管理自定义项
wo_taskobj	object	是	作业对象
check_plan_cost	boolean	否	检查维修计划成本 示例：false
ysFlag	boolean	否	是否是ys工单 示例：false
wo_statustype	number
小数位数:0,最大长度:10	否	状态类别 示例：0
pubts	string	否	时间戳 示例：2024-03-26 14:08:17
isFlowCoreBill	boolean	否	是否流程核心单据 示例：false
wo_check	string	是	验收记录
gen_failure_flag	boolean	否	生成故障记录 示例：false
pk_location__pk_org__name	string	否	资产组织 示例：全职能组织
sourceid	string	否	来源主键 示例：1954493063629373479
creator	string	否	创建人 示例：74163741-643b-4584-ad44-02385c3787de
billmaketime	string	否	制单时间 示例：2024-03-26 14:08:16
pk_location__location_name	string	否	位置名称 示例：仓库位置
pk_worktype__name	string	否	工作类型名称 示例：紧急维修
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
pk_currtype__priceDigit	number
小数位数:0,最大长度:10	否	币种单价精度 示例：3
sourceautoid	string	否	上游单据子表主键 示例：1954493063629373480
pk_currtype__moneyDigit	number
小数位数:0,最大长度:10	否	币种金额精度 示例：2
transi_type	string	否	交易类型编码 示例：4B36-01
pk_transitype__billtype_id	string	否	交易类型主键 示例：2146953523040512
pk_wo_status_init	string	否	工单初始状态 示例：PRESET01_0000LJPGZ3RX3YAKG10000
total_normal_hours	number
小数位数:2,最大长度:10	否	标准总工时(小时) 示例：10
total_actual_hours	number
小数位数:2,最大长度:10	否	实际总工时(小时) 示例：10
errorDetail	string	否	错误详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_group": "666666",
		"wo_content": "仓库位置故障处理",
		"receivable_flag": false,
		"need_check": false,
		"source": "ucf-amc-aom.aom_failure_card",
		"pk_location__location_code": "LOC2023122700001",
		"pk_location": "1893716441699975176",
		"pk_org": "1764630529618477058",
		"wo_source": [
			{
				"src_pk_bill": "1954493063629373479",
				"src_bill_type": "4B08",
				"makeRuleCode": "failure2WorkOrder",
				"src_bill_code": "GZJL20240318001",
				"source": "ucf-amc-aom.aom_failure_card",
				"pk_location__location_code": "LOC2023122700001",
				"pk_location": "1893716441699975176",
				"head_bill_type": "4B66",
				"src_pk_bill_b": "1954493063629373480",
				"src_pk_bill_type__name": "故障记录",
				"head_bill_code": "DJJL202403140005",
				"fault_time": "2024-03-14 11:50:02",
				"src_pk_transitype__name": "故障记录",
				"id": "1960509084444131338",
				"head_pk_transitype": "1763914120481473849",
				"fault_discoverer": "1764632960553713664",
				"sourceid": "1954493063629373479",
				"pk_location__location_name": "仓库位置",
				"main_id": "1960509084444131336",
				"src_pk_org": "1764630529618477058",
				"src_transitype": "4B08-01",
				"src_pk_bill_type": "2176628680823040",
				"fault_discoverer__name": "刘龙",
				"head_pk_transitype__name": "点检记录",
				"upcode": "GZJL20240318001",
				"src_pk_transitype": "1763914120481473738",
				"head_transitype": "4B66-01",
				"src_head_ts": "2024-03-19 15:34:13"
			}
		],
		"pk_transitype": "1763914120481473711",
		"payable_flag": false,
		"payout_flag": false,
		"bill_type": "4B36",
		"settled_list_flag": false,
		"wo_ticket": [
			""
		],
		"status_follow": false,
		"status_time": "2024-03-26 14:08:15",
		"id": "1960509084444131336",
		"creator__name": "昵称-18511801250",
		"tenant": "0000LJPGZ3RX3YAKG10000",
		"haslatter_flag": false,
		"failure_flag": false,
		"isWfControlled": false,
		"sysid": "RMM",
		"pk_transitype__name": "工单管理",
		"pk_org__name": "全职能组织",
		"pk_location__pk_org": "1764630529618477058",
		"pk_currtype__priceRount": 4,
		"consign_flag": false,
		"billmaker__name": "昵称-18511801250",
		"failure_detail": "部位,浓度,1.55,异常",
		"report_time": "2024-03-26 14:08:15",
		"billmaker": "74163741-643b-4584-ad44-02385c3787de",
		"pk_currtype__moneyRount": 4,
		"creationtime": "2024-03-26 14:08:16",
		"file_before_repair": "75307733-c370-a30d-eb94-f54aa20137cb",
		"returncount": 0,
		"verifystate": 0,
		"pk_wo_status__name": "待审",
		"requirepermit": false,
		"settle_flag": false,
		"bill_code": "WO2403260002",
		"makeRuleCode": "failure2WorkOrder",
		"pk_worktype": "PRESET04_0000LJPGZ3RX3YAKG10000",
		"pk_currtype": "1763914111891537950",
		"pk_currtype__name": "人民币",
		"pk_wo_status": "PRESET01_0000LJPGZ3RX3YAKG10000",
		"failure_time": "2024-03-14 11:50:02",
		"warrant_flag": false,
		"haschild_flag": false,
		"userDefines": {
			"id": "1960509084444131339",
			"ytenant": "0000LJPGZ3RX3YAKG10000",
			"dr": 0
		},
		"wo_taskobj": [
			{
				"sequence_num": 10,
				"src_bill_type": "4B08",
				"pk_location__location_name": "仓库位置",
				"src_bill_code": "GZJL20240318001",
				"main_id": "1960509084444131336",
				"pk_location__location_code": "LOC2023122700001",
				"pk_location": "1893716441699975176",
				"src_pk_bill_b": "1954493063629373480",
				"src_pk_bill_type": "2176628680823040",
				"src_pk_transitype__name": "故障记录",
				"id": "1960509084444131337",
				"src_pk_transitype": "1763914120481473738",
				"pubts": "2024-03-26 14:08:17",
				"tenant": "0000LJPGZ3RX3YAKG10000",
				"source_flag": false
			}
		],
		"check_plan_cost": false,
		"ysFlag": false,
		"wo_statustype": 0,
		"pubts": "2024-03-26 14:08:17",
		"isFlowCoreBill": false,
		"wo_check": [
			""
		],
		"gen_failure_flag": false,
		"pk_location__pk_org__name": "全职能组织",
		"sourceid": "1954493063629373479",
		"creator": "74163741-643b-4584-ad44-02385c3787de",
		"billmaketime": "2024-03-26 14:08:16",
		"pk_location__location_name": "仓库位置",
		"pk_worktype__name": "紧急维修",
		"bill_status": 0,
		"pk_currtype__priceDigit": 3,
		"sourceautoid": "1954493063629373480",
		"pk_currtype__moneyDigit": 2,
		"transi_type": "4B36-01",
		"pk_transitype__billtype_id": "2146953523040512",
		"pk_wo_status_init": "PRESET01_0000LJPGZ3RX3YAKG10000",
		"total_normal_hours": 10,
		"total_actual_hours": 10
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
999	报错具体提示信息	

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

