---
title: "使用权调出保存"
apiId: "1867098837243920391"
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

# 使用权调出保存

>  请求方式	POST | Right of Use Transfer-out (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/deployusedout/save
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
data	object	否	是	使用权调出主表
pk_org	string	否	是	资产组织主键 示例：1785995191672897543
pk_usedorg_out	string	否	是	调出使用单位主键 示例：1785995191672897543
bill_code	string	否	否	调出单号 示例：SYDC202311080001
bill_date	Date	否	否	调拨日期 示例：2023-11-08
pk_usedorg_in	string	否	是	调入使用单位主键 示例：1785995191672897543
pk_recorder	string	否	否	调出经办人主键 示例：1785995191672897543
memo	string	否	否	备注 示例：备注信息
transi_type	string	否	是	交易类型编码 示例：4A47-01 默认值：4A47-01
busi_type	string	否	否	业务类型 示例：1457005695971885057
billmaker	string	否	否	制单人主键 示例：1785995191672897543
billmaketime	DateTime	否	否	制单时间 示例：2023-11-08 17:23:02
creator	string	否	否	创建人主键 示例：1785995191672897543
creationtime	DateTime	否	否	创建时间 示例：2023-11-08 17:23:02
pk_recorder_in	string	否	否	调入经办人主键 示例：1785995191672897543
push_status	long	否	否	固资对接生单状态(0：没有推固定资产 1：下游正在生单 2：下游生单成功 3：下游生单失败) 示例：0 默认值：0
error_msg	string	否	否	固资对接异常信息 示例：固资对接异常信息
bodyvos	object	是	是	使用权调出子表

## 3. 请求示例

Url: /yonbip/am/deployusedout/save?access_token=访问令牌
Body: {
	"data": {
		"pk_org": "1785995191672897543",
		"pk_usedorg_out": "1785995191672897543",
		"bill_code": "SYDC202311080001",
		"bill_date": "2023-11-08",
		"pk_usedorg_in": "1785995191672897543",
		"pk_recorder": "1785995191672897543",
		"memo": "备注信息",
		"transi_type": "4A47-01",
		"busi_type": "1457005695971885057",
		"billmaker": "1785995191672897543",
		"billmaketime": "2023-11-08 17:23:02",
		"creator": "1785995191672897543",
		"creationtime": "2023-11-08 17:23:02",
		"pk_recorder_in": "1785995191672897543",
		"push_status": 0,
		"error_msg": "固资对接异常信息",
		"bodyvos": [
			{
				"pk_equip": "1785995191672897543",
				"pk_addreducestyle": "1785995191672897543",
				"pk_reason": "1785995191672897543",
				"pk_usedept_after": "1785995191672897543",
				"memo": "表体备注信息",
				"pk_location_after": "1785995191672897543",
				"pk_user_after": "1785995191672897543",
				"pk_warehouse_in": "1785995191672897543",
				"associate_flag_before": false,
				"pk_icorg_in": "1785995191672897543",
				"pk_org_after": "1785995191672897543",
				"src_bill_type": "1517341173465743369",
				"src_pk_bill": "1785995191672897543",
				"src_pk_bill_b": "1785995191672897543",
				"src_pk_transitype": "1785995191672897543",
				"src_transitype": "4YBZ-01",
				"pk_costcenter_used_in": "1785995191672897543",
				"pk_profitcenter_used_in": "1785995191672897543",
				"pk_jobmngfil_after": "1785995191672897543"
			}
		]
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pk_org	string	否	资产组织主键 示例：1785995191672897543
pk_org__name	string	否	资产组织 示例：资产组织
pk_usedorg_out	string	否	调出使用单位主键 示例：1785995191672897543
pk_usedorg_out__name	string	否	调出使用单位 示例：资产使用单位
bill_code	string	否	调出单号 示例：SYDC202311080001
bill_date	Date	否	调拨日期 示例：2023-11-08
bill_status	long	否	单据状态 （0：开立，1：审批中，2：审批通过，3：流程终止，4：退回制单） 示例：0
pk_usedorg_in	string	否	调入使用单位主键 示例：1785995191672897543
pk_usedorg_in__name	string	否	调入使用单位 示例：调入使用单位
pk_recorder	string	否	调出经办人主键 示例：1785995191672897543
pk_recorder__name	string	否	调出经办人 示例：调出经办人
workflow_status	long	否	工作流状态 示例：0
memo	string	否	备注 示例：表头备注信息
bill_type	string	否	单据类型 示例：4A47
pk_transitype	string	否	交易类型主键 示例：1785995191672897543
pk_transitype__name	string	否	交易类型 示例：使用权权调出
transi_type	string	否	交易类型编码 示例：4A47-01
busi_type	string	否	业务类型
id	string	否	使用权调出表头主键 示例：1785995191672897543
pubts	DateTime	否	时间戳 示例：2023-11-01 15:21:38
sysid	string	否	系统标识
isWfControlled	boolean	否	是否审核流控制（false：否，true：是） 示例：false
verifystate	long	否	审批状态 （0：开立，1：审批中，2：审批通过，3：流程终止，4：退回制单） 示例：0
returncount	long	否	退回次数 示例：0
billmaker	string	否	制单人主键 示例：1785995191672897543
billmaker__name	string	否	制单人 示例：制单人
billmaketime	DateTime	否	制单时间 示例：2023-11-01 15:21:38
modifier	string	否	修改人主键 示例：1785995191672897543
modifier__name	string	否	最后修改人 示例：最后修改人
modifiedtime	DateTime	否	最后修改时间 示例：2023-11-01 15:21:38
auditor	string	否	审核人主键 示例：1785995191672897543
auditor__name	string	否	审核人 示例：审核人
audittime	DateTime	否	审核时间 示例：2023-11-01 15:21:38
check_opinion	string	否	审核意见 示例：审核意见
creator	string	否	创建人主键 示例：1785995191672897543
creator__name	string	否	创建人 示例：创建人
creationtime	string	否	创建时间 示例：2023-11-01 15:21:38
bizFlow_name	string	否	流程名称 示例：流程名称
bizFlow	string	否	流程Id 示例：1785995191672897543
isFlowCoreBill	boolean	否	是否流程核心单据（false：否，true：是） 示例：false
bizFlow_version	string	否	版本信息 示例：V1.0
pk_recorder_in	string	否	调入经办人主键 示例：1785995191672897543
pk_recorder_in__name	string	否	调入经办人 示例：调入经办人
push_status	long	否	固资对接生单状态(0：没有推固定资产 1：下游正在生单 2：下游生单成功 3：下游生单失败) 示例：0
error_msg	string	否	固资对接异常信息 示例：固资对接异常信息
bodyvos	object	是	详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pk_org": "1785995191672897543",
		"pk_org__name": "资产组织",
		"pk_usedorg_out": "1785995191672897543",
		"pk_usedorg_out__name": "资产使用单位",
		"bill_code": "SYDC202311080001",
		"bill_date": "2023-11-08",
		"bill_status": 0,
		"pk_usedorg_in": "1785995191672897543",
		"pk_usedorg_in__name": "调入使用单位",
		"pk_recorder": "1785995191672897543",
		"pk_recorder__name": "调出经办人",
		"workflow_status": 0,
		"memo": "表头备注信息",
		"bill_type": "4A47",
		"pk_transitype": "1785995191672897543",
		"pk_transitype__name": "使用权权调出",
		"transi_type": "4A47-01",
		"busi_type": "",
		"id": "1785995191672897543",
		"pubts": "2023-11-01 15:21:38",
		"sysid": "",
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": 0,
		"billmaker": "1785995191672897543",
		"billmaker__name": "制单人",
		"billmaketime": "2023-11-01 15:21:38",
		"modifier": "1785995191672897543",
		"modifier__name": "最后修改人",
		"modifiedtime": "2023-11-01 15:21:38",
		"auditor": "1785995191672897543",
		"auditor__name": "审核人",
		"audittime": "2023-11-01 15:21:38",
		"check_opinion": "审核意见",
		"creator": "1785995191672897543",
		"creator__name": "创建人",
		"creationtime": "2023-11-01 15:21:38",
		"bizFlow_name": "流程名称",
		"bizFlow": "1785995191672897543",
		"isFlowCoreBill": false,
		"bizFlow_version": "V1.0",
		"pk_recorder_in": "1785995191672897543",
		"pk_recorder_in__name": "调入经办人",
		"push_status": 0,
		"error_msg": "固资对接异常信息",
		"bodyvos": [
			{
				"pk_equip": "1785995191672897543",
				"pk_equip__materialFree": "自由项特征组",
				"pk_equip__equip_code": "EAM-DAILY-202310260394",
				"equip_name": "资产名称",
				"equip_spec": "规格",
				"equip_model": "型号",
				"pk_category": "1785995191672897543",
				"pk_category__category_name": "资产类别",
				"pk_icorg_out": "1785995191672897543",
				"pk_icorg_out__name": "调出库存组织",
				"pk_addreducestyle": "1785995191672897543",
				"pk_addreducestyle__name": "调拨方式",
				"pk_reason": "1785995191672897543",
				"pk_reason__name": "调拨原因",
				"pk_usedept_after": "1785995191672897543",
				"pk_usedept_after__name": "调入使用部门",
				"origin_value": 100,
				"accu_dep": 10,
				"new_value": 90,
				"begin_date": "2023-11-01",
				"service_month": 2,
				"memo": "备注",
				"pk_location_after": "1785995191672897543",
				"pk_location_after__name": "调入位置",
				"pk_user_after": "1785995191672897543",
				"pk_user_after__name": "调入责任人",
				"pk_warehouse_in": "1785995191672897543",
				"pk_warehouse_in__name": "调入仓库",
				"pk_equip__pk_icorg": "1785995191672897543",
				"pk_equip__pk_location__pk_warehouse": "1785995191672897543",
				"pk_equip__serial_num": "0001",
				"pk_equip__pk_material_sku": "SKU",
				"pk_equip__pk_material_batchno": "001",
				"pk_equip__pk_material": "1785995191672897543",
				"pk_currency": "1785995191672897543",
				"pk_equip__pk_currency_fi": "1785995191672897543",
				"pk_equip__pk_currency_fi__name": "财务币种",
				"pk_equip__pk_currency_fi__moneyDigit": 2,
				"pk_equip__pk_material__code": "WLBM0001",
				"net_money": 0,
				"dep_amount": 0,
				"used_month": 0,
				"salvage": 0,
				"associate_flag_before": false,
				"salvage_rate": 0,
				"pre_devaluate": 0,
				"pk_user_before": "1785995191672897543",
				"pk_user_before__name": "调出责任人",
				"pk_location_before": "1785995191672897543",
				"pk_location_before__name": "调拨前位置",
				"pk_warehouse_out": "1785995191672897543",
				"pk_warehouse_out__name": "调出仓库",
				"service_month_before": 0,
				"origin_value_before": 0,
				"accu_dep_before": 0,
				"new_value_before": 0,
				"net_money_before": 0,
				"dep_amount_before": 0,
				"used_month_before": 0,
				"salvage_before": 0,
				"salvage_rate_before": 10,
				"begin_date_before": "2023-11-01",
				"pre_devaluate_before": 10,
				"pk_jobmngfil": "1785995191672897543",
				"pk_jobmngfil__name": "项目",
				"pk_status_before": "1785995191672897543",
				"pk_status_before__status_name": "调拨前状态",
				"pk_status_after": "1785995191672897543",
				"pk_status_after__status_name": "调拨后状态",
				"status_date_before": "2023-11-01",
				"status_date_after": "2023-11-01",
				"stock_out_flag": false,
				"stock_in_flag": false,
				"bill_code_src": "来源单据号",
				"pk_org": "1785995191672897543",
				"pk_icorg_in": "1785995191672897543",
				"pk_icorg_in__name": "调入库存组织",
				"pk_usedorg_out": "1785995191672897543",
				"pk_usedorg_out__name": "调出使用单位",
				"pk_usedept_before": "1785995191672897543",
				"pk_usedept_before__name": "调出使用部门",
				"pk_org_before": "1785995191672897543",
				"pk_org_before__name": "调拨前资产主组织",
				"pk_org_after": "1785995191672897543",
				"pk_org_after__name": "调拨后资产主组织",
				"src_bill_type": "",
				"src_pk_bill": "1785995191672897543",
				"src_pk_bill_b": "1785995191672897543",
				"src_pk_transitype": "1785995191672897543",
				"src_transitype": "",
				"id": "使用权调出表体主键",
				"pubts": "2023-11-01 15:21:38",
				"main_id": "1785995191672897543",
				"pk_costcenter_used_in": "1785995191672897543",
				"pk_costcenter_used_in__name": "调入使用成本中心",
				"pk_profitcenter_used_in": "1785995191672897543",
				"pk_profitcenter_used_in__name": "调入使用利润中心",
				"pk_costcenter_used_out": "1785995191672897543",
				"pk_costcenter_used_out__name": "调出使用成本中心",
				"pk_profitcenter_used_out": "1785995191672897543",
				"pk_profitcenter_used_out__name": "调出使用利润中心",
				"pk_equip__pk_ownerorg": "1785995191672897543",
				"pk_jobmngfil_before": "1785995191672897543",
				"pk_jobmngfil_before__name": "调出项目",
				"pk_jobmngfil_after": "1785995191672897543",
				"pk_jobmngfil_after__name": "调入项目"
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

