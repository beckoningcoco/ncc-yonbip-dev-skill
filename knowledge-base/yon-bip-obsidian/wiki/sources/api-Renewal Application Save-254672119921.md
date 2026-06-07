---
title: "续借申请详情查询"
apiId: "2546721199216394243"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Renewal Application"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Renewal Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 续借申请详情查询

>  请求方式	POST | Renewal Application (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/renewapply/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	是	续借申请主表主键 示例：2286573509772050436

## 3. 请求示例

Url: /yonbip/ACC/renewapply/detail?access_token=访问令牌
Body: {
	"id": "2286573509772050436"
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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
bill_code	string	否	单据编码 示例：XJSQ202507220003
bill_date	date
格式:yyyy-MM-dd	否	申请时间
bill_status	string	否	枚举: 0 开立, 3 审核中, 1 已审核, 2 已关闭 示例：0
bill_type	string	否	单据类型 示例：5B05
id	string	否	主键 示例：2319017486587527173
isWfControlled	string	否	是否审批流控制 示例：1
memo	string	否	备注
pk_applier	string	否	申请人 示例：2108090912532856836
pk_applier__name	string	否	申请人
pk_applydept	string	否	申请部门 示例：2108083052746375173
pk_applydept__name	string	否	申请部门
pk_org	string	否	资产组织 示例：2108082485779759108
pk_org__name	string	否	资产组织
pk_renewer	string	否	续借人 示例：2108090912532856836
pk_renewer__name	string	否	续借人
pk_transitype	string	否	交易类型 示例：2107554909184851999
pk_transitype__name	string	否	交易类型
pubts	string	否	时间戳 示例：2025-11-10 10:49:10
returncount	string	否	退回次数 示例：0
sysid	string	否	系统标识 示例：AUM
transi_type	string	否	交易类型编码 示例：5B05-01
verifystate	string	否	枚举: 0 开立, 1 审批中, 2 审批通过, 3 流程终止, 4 退回制单 示例：0
auditor	string	否	审核人主键
auditor__name	string	否	审核人
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	审核时间
billmaker	string	否	制单人主键 示例：1982e7b0-40a5-4b80-8ea6-adc846a926bf
billmaker__name	string	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	制单时间 示例：2025-07-22 15:26:07
check_opinion	string	否	审核意见
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2025-07-22 15:26:07
creator	string	否	创建人主键 示例：1982e7b0-40a5-4b80-8ea6-adc846a926bf
creator__name	string	否	创建人
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	最后修改时间
modifier	string	否	最后修改人主键
modifier__name	string	否	最后修改人
bodyvos	object	是	表体信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"bill_code": "XJSQ202507220003",
		"bill_date": "2026-06-07",
		"bill_status": "0",
		"bill_type": "5B05",
		"id": "2319017486587527173",
		"isWfControlled": "1",
		"memo": "",
		"pk_applier": "2108090912532856836",
		"pk_applier__name": "",
		"pk_applydept": "2108083052746375173",
		"pk_applydept__name": "",
		"pk_org": "2108082485779759108",
		"pk_org__name": "",
		"pk_renewer": "2108090912532856836",
		"pk_renewer__name": "",
		"pk_transitype": "2107554909184851999",
		"pk_transitype__name": "",
		"pubts": "2025-11-10 10:49:10",
		"returncount": "0",
		"sysid": "AUM",
		"transi_type": "5B05-01",
		"verifystate": "0",
		"auditor": "",
		"auditor__name": "",
		"audittime": "2026-06-07 13:22:15",
		"billmaker": "1982e7b0-40a5-4b80-8ea6-adc846a926bf",
		"billmaker__name": "",
		"billmaketime": "2025-07-22 15:26:07",
		"check_opinion": "",
		"creationtime": "2025-07-22 15:26:07",
		"creator": "1982e7b0-40a5-4b80-8ea6-adc846a926bf",
		"creator__name": "",
		"modifiedtime": "2026-06-07 13:22:15",
		"modifier": "",
		"modifier__name": "",
		"bodyvos": [
			{
				"cancel_renew_reason": "",
				"confirmer_date": "2025-07-22 08:00:00",
				"confirm_flag": "true",
				"id": "2319017486587527174",
				"pk_confirmer": "1982e7b0-40a5-4b80-8ea6-adc846a926bf",
				"pk_confirmer__name": "",
				"pk_equip": "2108096779432493059",
				"pk_equip__equip_code": "",
				"pk_equip__equip_name": "",
				"pk_equip__manufacture_date": "2026-06-07",
				"pk_equip__model": "",
				"pk_equip__pk_category__category_name": "",
				"pk_equip__pk_jobmngfil__name": "",
				"pk_equip__pk_location__location_name": "",
				"pk_equip__pk_manager__name": "",
				"pk_equip__pk_mandept__name": "",
				"pk_equip__pk_supplier__name": "",
				"pk_equip__pk_usedept__name": "",
				"pk_equip__pk_used_status__status_name": "",
				"pk_equip__pk_user__name": "",
				"pk_equip__precoding": "",
				"pk_equip__spec": "",
				"pk_equip__start_used_date": "2026-06-07",
				"renew_period": "2025-07-23",
				"renew_reason": "",
				"renew_time": 1,
				"renew_time_unit": "0",
				"revertible_date": "2025-07-22",
				"src_pk_bill": "2319013938944540672",
				"src_pk_bill_b": "2319013938944540673"
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
999	系统异常	

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

