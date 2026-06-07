---
title: "换油记录保存"
apiId: "2180237128796995590"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lubrication Method"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lubrication Method]
platform_version: "BIP"
source_type: community-api-docs
---

# 换油记录保存

>  请求方式	POST | Lubrication Method (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/oilchangecard/save
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
data	object	否	是	参数
bill_type	string	否	否	单据类型 示例：4B9B
pk_transitype	string	否	否	交易类型主键 示例：1514549616457547776
pk_transitype__name	string	否	否	交易类型名称 示例：换油记录
transi_type	string	否	否	交易类型编码 示例：4B9B-01
pk_org	string	否	是	资产组织主键 示例：2112522880685178882
pk_org__name	string	否	是	资产组织 示例：东新科技股份优先公司
bill_code	string	否	是	换油单号 示例：HYDH2412090001
bill_status	number
小数位数:0,最大长度:10	否	是	单据状态(0:开立 1：审核中 2：已审核 3：关闭 默认为开立) 示例：0
verifystate	number
小数位数:0,最大长度:10	否	否	审批状态 示例：0
pk_applyer	string	否	否	经办人主键 示例：2152001498520223748
pk_apply_dept	string	否	否	经办部门主键 示例：2112523026714066947
applydate	date
格式:yyyy-MM-dd	否	否	经办日期 示例：2024-12-09
memo	string	否	否	表头备注 示例：表头备注
billmaker	string	否	否	制单人主键 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间 示例：2024-12-09 15:51:53
bodyvos	object	是	是	换油记录子表详情
_status	string	否	否	状态，Insert 新增 Update 更新 示例：Insert

## 3. 请求示例

Url: /yonbip/am/oilchangecard/save?access_token=访问令牌
Body: {
	"data": {
		"bill_type": "4B9B",
		"pk_transitype": "1514549616457547776",
		"pk_transitype__name": "换油记录",
		"transi_type": "4B9B-01",
		"pk_org": "2112522880685178882",
		"pk_org__name": "东新科技股份优先公司",
		"bill_code": "HYDH2412090001",
		"bill_status": 0,
		"verifystate": 0,
		"pk_applyer": "2152001498520223748",
		"pk_apply_dept": "2112523026714066947",
		"applydate": "2024-12-09",
		"memo": "表头备注",
		"billmaker": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"billmaketime": "2024-12-09 15:51:53",
		"bodyvos": [
			{
				"exec_flag": true,
				"oil_cycle_unit": "0",
				"rowno": 1,
				"plan_time": "2024-12-09",
				"pk_equip": "2152026340593238022",
				"pk_location": "2111274282151051268",
				"pk_ownerorg": "2112522880685178882",
				"pk_mandept": "2112523026714066947",
				"pk_manager": "2117122782081843200",
				"pk_usedept": "2112523026714066947",
				"pk_usedorg": "2112522880685178882",
				"pk_user": "2117122782081843200",
				"pk_ownerunit": "2112522880685178882",
				"lubrication_part": "表",
				"lubrication_point": 66,
				"pk_lubricationmethod": "2152029424389718017",
				"pk_lubricantdefine_std": "2152029948371009540",
				"pk_lubricantdefine_sub": "2131816380587048963",
				"std_fuel_quantity": 655,
				"pk_oil_change_dept": "2112523026714066947",
				"pk_change_psn_group": "2127508674429583363",
				"pk_principal": "2117122782081843200",
				"change_memo": "换油",
				"pk_lubricate_planner": "2128129872711647232",
				"actu_time": "2024-12-09 15:53:22",
				"pk_lubricantdefine_actu": "2152029948371009540",
				"actu_fuel_quantity": 655,
				"pk_act_oil_change_dept": "2112523026714066947",
				"pk_change_psn_group_actu": "2127508674429583363",
				"pk_principal_actu": "2117122782081843200",
				"cycle": 3,
				"next_time": "2024-12-12",
				"memo": "表体备注",
				"_status": "Insert"
			}
		],
		"_status": "Insert"
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
小数位数:0,最大长度:10	否	http返回码(200:成功，其他：异常) 示例：200
message	string	否	返回的信息 示例：操作成功！
data	object	否	返回数据
bill_type	string	否	单据类型 示例：4B9B
pk_transitype	string	否	交易类型主键 示例：1514549616457547776
pk_transitype__name	string	否	交易类型名称 示例：换油记录
transi_type	string	否	交易类型编码 示例：4B9B-01
pk_org	string	否	资产组织主键 示例：2112522880685178882
pk_org__name	string	否	资产组织 示例：东新科技股份优先公司
bill_code	string	否	换油单号 示例：HYDH2412090001
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
pk_applyer	string	否	经办人主键 示例：2152001498520223748
pk_applyer__name	string	否	经办人 示例：API
pk_apply_dept	string	否	经办部门主键 示例：2112523026714066947
pk_apply_dept__name	string	否	经办部门 示例：营销部门
applydate	string	否	经办日期 示例：2024-12-09 00:00:00
memo	string	否	表头备注 示例：表头备注
billmaker	string	否	制单人主键 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
billmaker__name	string	否	制单人 示例：API
billmaketime	string	否	制单时间 示例：2024-12-09 15:53:50
bodyvos	object	是	换油记录子表详情
_status	string	否	换油记录状态（仅支持Insert一种状态） 示例: Insert 示例：Insert
id	string	否	主键 示例：2152043443166117893
creator	string	否	创建人主键 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
creator__name	string	否	创建人 示例：API
creationtime	string	否	创建时间 示例：2024-12-09 15:53:50
isWfControlled	boolean	否	审批流 示例：false
errorDetail	string	否	错误详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"bill_type": "4B9B",
		"pk_transitype": "1514549616457547776",
		"pk_transitype__name": "换油记录",
		"transi_type": "4B9B-01",
		"pk_org": "2112522880685178882",
		"pk_org__name": "东新科技股份优先公司",
		"bill_code": "HYDH2412090001",
		"bill_status": 0,
		"verifystate": 0,
		"pk_applyer": "2152001498520223748",
		"pk_applyer__name": "API",
		"pk_apply_dept": "2112523026714066947",
		"pk_apply_dept__name": "营销部门",
		"applydate": "2024-12-09 00:00:00",
		"memo": "表头备注",
		"billmaker": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"billmaker__name": "API",
		"billmaketime": "2024-12-09 15:53:50",
		"bodyvos": [
			{
				"exec_flag": true,
				"oil_cycle_unit": "0",
				"rowno": "1",
				"attachmentId": "cc697424-9eff-4c19-a65c-23bb62bcffc8",
				"plan_time": "2024-12-09 00:00:00",
				"pk_equip__equip_code": "EAM-202412090043",
				"pk_equip": "2152026340593238022",
				"pk_equip__equip_name": "发送机",
				"pk_location": "2111274282151051268",
				"pk_location__location_code": "LOC24100001",
				"pk_location__location_name": "朝阳国家体育场",
				"pk_ownerorg": "2112522880685178882",
				"pk_ownerorg__name": "东新科技股份优先公司",
				"pk_mandept": "2112523026714066947",
				"pk_mandept__name": "营销部门",
				"pk_manager": "2117122782081843200",
				"pk_manager__name": "刘龙",
				"pk_usedept": "2112523026714066947",
				"pk_usedept__name": "营销部门",
				"pk_usedorg": "2112522880685178882",
				"pk_usedorg__name": "东新科技股份优先公司",
				"pk_user": "2117122782081843200",
				"pk_user__name": "刘龙",
				"pk_ownerunit": "2112522880685178882",
				"pk_ownerunit__name": "东新科技股份优先公司",
				"lubrication_part": "表",
				"lubrication_point": "66",
				"pk_lubricationmethod__name": "润滑油A",
				"pk_lubricationmethod": "2152029424389718017",
				"pk_lubricantdefine_std__code": "RHY202412090001",
				"pk_lubricantdefine_std": "2152029948371009540",
				"pk_lubricantdefine_std__name": "润滑油B",
				"pk_lubricantdefine_std__oilbrand_code": "BB",
				"pk_lubricantdefine_std__pk_measdoc": "2111278233525157904",
				"pk_lubricantdefine_std__pk_measdoc__name": "箱",
				"pk_lubricantdefine_std__pk_measdoc__precision": "0",
				"pk_lubricantdefine_sub__code": "RHY202411120001",
				"pk_lubricantdefine_sub": "2131816380587048963",
				"pk_lubricantdefine_sub__name": "aa",
				"pk_lubricantdefine_sub__oilbrand_code": "aa",
				"std_fuel_quantity": 655,
				"pk_oil_change_dept__name": "营销部门",
				"pk_oil_change_dept": "2112523026714066947",
				"pk_change_psn_group__name": "班组1",
				"pk_change_psn_group": "2127508674429583363",
				"pk_principal__name": "刘龙",
				"pk_principal": "2117122782081843200",
				"change_memo": "换油",
				"pk_lubricate_planner__name": "周普超",
				"pk_lubricate_planner": "2128129872711647232",
				"actu_time": "2024-12-09 15:53:22",
				"pk_lubricantdefine_actu": "2152029948371009540",
				"pk_lubricantdefine_actu__code": "RHY202412090001",
				"pk_lubricantdefine_actu__name": "润滑油B",
				"pk_lubricantdefine_actu__oilbrand_code": "BB",
				"actu_fuel_quantity": 655,
				"pk_act_oil_change_dept": "2112523026714066947",
				"pk_act_oil_change_dept__name": "营销部门",
				"pk_change_psn_group_actu": "2127508674429583363",
				"pk_change_psn_group_actu__name": "班组1",
				"pk_principal_actu": "2117122782081843200",
				"pk_principal_actu__name": "刘龙",
				"cycle": 3,
				"next_time": "2024-12-12 00:00:00",
				"memo": "表体备注",
				"_status": "Insert",
				"id": "2152043443166117894",
				"main_id": "2152043443166117893",
				"pk_org": "2112522880685178882"
			}
		],
		"_status": "Insert",
		"id": "2152043443166117893",
		"creator": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"creator__name": "API",
		"creationtime": "2024-12-09 15:53:50",
		"isWfControlled": false
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

