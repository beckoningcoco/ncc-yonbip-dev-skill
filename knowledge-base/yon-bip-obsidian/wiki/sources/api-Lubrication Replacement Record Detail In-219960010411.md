---
title: "换油记录详情查询"
apiId: "2199600104112914440"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lubrication Record"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lubrication Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 换油记录详情查询

>  请求方式	POST | Lubrication Record (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/oilchangecard/detail
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
code	string	否	否	换油单号 示例：HYDH2502120001
id	string	否	否	主键 示例：2235099151277228043

## 3. 请求示例

Url: /yonbip/am/oilchangecard/detail?access_token=访问令牌
Body: {
	"code": "HYDH2502120001",
	"id": "2235099151277228043"
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
小数位数:0,最大长度:10	否	返回http状态码（200：正常，其他：异常） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pk_org	string	否	资产组织主键 示例：2097854596607115265
pk_org__name	string	否	资产组织 示例：G公司
bill_code	string	否	换油单号 示例：HYDH2410240001
bill_status	string	否	单据状态:{"0":"开立","3":"审核中","1":"已审核","2":"已关闭"} 示例：0
verifystate	string	否	审批状态:{"0":"开立","1":"审批中","2":"审批通过","3":"流程终止","4":"退回制单"} 示例：0
pk_applyer	string	否	经办人主键 示例：2097855747668836356
pk_applyer__name	string	否	经办人 示例：郭亚鑫
pk_apply_dept	string	否	经办部门主键 示例：2097854845709975552
pk_apply_dept__name	string	否	经办部门 示例：部门1
applydate	date
格式:yyyy-MM-dd	否	经办日期 示例：2024-10-24
memo	string	否	备注 示例：表头备注
billmaker	string	否	制单人主键 示例：15f8b2be-87b7-4947-bc06-6ffabfccc73a
billmaker__name	string	否	制单人 示例：g1员工
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	制单时间 示例：2024-10-24 15:16:45
modifier	string	否	最后修改人主键 示例：15f8b2be-87b7-4947-bc06-6ffabfccc73a
modifier__name	string	否	最后修改人 示例：g1员工
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	最后修改时间 示例：2024-10-24 15:16:50
auditor	string	否	审核人主键 示例：15f8b2be-87b7-4947-bc06-6ffabfccc73a
auditor__name	string	否	审核人 示例：g1员工
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	审核时间 示例：2024-10-24 15:17:45
bodyvos	object	是	换油记录子表详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_org": "2097854596607115265",
		"pk_org__name": "G公司",
		"bill_code": "HYDH2410240001",
		"bill_status": "0",
		"verifystate": "0",
		"pk_applyer": "2097855747668836356",
		"pk_applyer__name": "郭亚鑫",
		"pk_apply_dept": "2097854845709975552",
		"pk_apply_dept__name": "部门1",
		"applydate": "2024-10-24",
		"memo": "表头备注",
		"billmaker": "15f8b2be-87b7-4947-bc06-6ffabfccc73a",
		"billmaker__name": "g1员工",
		"billmaketime": "2024-10-24 15:16:45",
		"modifier": "15f8b2be-87b7-4947-bc06-6ffabfccc73a",
		"modifier__name": "g1员工",
		"modifiedtime": "2024-10-24 15:16:50",
		"auditor": "15f8b2be-87b7-4947-bc06-6ffabfccc73a",
		"auditor__name": "g1员工",
		"audittime": "2024-10-24 15:17:45",
		"bodyvos": [
			{
				"pk_equip": "2121664005503713282",
				"pk_equip__equip_code": "202410290004",
				"pk_equip__equip_name": "特种设备3",
				"pk_ownerunit": "2097854596607115265",
				"pk_ownerunit__name": "G公司",
				"pk_ownerorg": "2097854596607115265",
				"pk_ownerorg__name": "G公司",
				"pk_mandept": "2097854845709975552",
				"pk_mandept__name": "部门1",
				"pk_manager": "2097855747668836356",
				"pk_manager__name": "郭亚鑫",
				"pk_usedorg": "2097854596607115265",
				"pk_usedorg__name": "G公司",
				"pk_usedept": "2097854845709975552",
				"pk_usedept__name": "部门1",
				"pk_user": "2097855747668836356",
				"pk_user__name": "郭亚鑫",
				"pk_equip__pk_location": "2132042132539047942",
				"pk_equip__pk_location__location_code": "LOC24110001",
				"pk_equip__pk_location__location_name": "测试位置1",
				"lubrication_part": "部位",
				"lubrication_point": 10,
				"plan_time": "2024-10-29",
				"pk_lubricantdefine_std": "2097858917335826439",
				"pk_lubricantdefine_std__code": "RHY202409270001",
				"pk_lubricantdefine_std__name": "98油",
				"pk_lubricantdefine_std__oilbrand_code": "98油牌号",
				"pk_lubricantdefine_std__pk_measdoc__name": "立方米",
				"std_fuel_quantity": "10",
				"pk_oil_change_dept": "2097854845709975552",
				"pk_oil_change_dept__name": "部门1",
				"pk_change_psn_group": "2097878751504236553",
				"pk_change_psn_group__name": "a班组",
				"pk_principal": "2097855747668836356",
				"pk_principal__name": "郭亚鑫",
				"change_memo": "换油备注",
				"pk_lubricate_planner": "2097878751504236553",
				"pk_lubricate_planner__name": "郭亚鑫",
				"exec_flag": "1",
				"actu_time": "2025-02-11 15:38:52",
				"pk_lubricantdefine_actu": "2097858917335826439",
				"pk_lubricantdefine_actu__code": "RHY202409270001",
				"pk_lubricantdefine_actu__name": "98油",
				"pk_lubricantdefine_actu__oilbrand_code": "98油牌号",
				"actu_fuel_quantity": "10",
				"pk_act_oil_change_dept": "2097854845709975552",
				"pk_act_oil_change_dept__name": "部门1",
				"pk_change_psn_group_actu": "2097878751504236553",
				"pk_change_psn_group_actu__name": "a班组",
				"pk_principal_actu": "2097855747668836356",
				"pk_principal_actu__name": "郭亚鑫",
				"cycle": 1,
				"oil_cycle_unit": "0",
				"next_time": "2025-02-12",
				"memo": "表体备注"
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
999	服务端逻辑异常	服务端逻辑异常

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

