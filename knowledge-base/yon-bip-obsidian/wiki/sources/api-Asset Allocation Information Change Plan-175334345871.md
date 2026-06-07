---
title: "资产分配信息变动计划详情查询"
apiId: "1753343458716680193"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Distribution Information Change Plan"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Distribution Information Change Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产分配信息变动计划详情查询

>  请求方式	POST | Asset Distribution Information Change Plan (GAM)


## 1. 通过OpenAPI查询资产分配信息变动计划详情；


## 2. 支持的查询条件及操作符：id（等于）；

3. 返回信息包括资产分配信息变动计划表头、表体(子表，孙表)信息（字段与出厂预置的WEB端UI模板默认显示字段一致）；

## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/asgmtalterplanlist/detail
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
id	string	否	是	资产分配信息变动计划主表主键 示例：1774844262582059012

## 3. 请求示例

Url: /yonbip/am/asgmtalterplanlist/detail?access_token=访问令牌
Body: {
	"id": "1774844262582059012"
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
returncount	long	否	退回次数 示例：0
pk_recorder	string	否	经办人 示例：1736996460910608384
verifystate	long	否	审批状态 示例：0
modifiedtime	string	否	修改时间
transTypeKeyField	string	否	交易类型主键字段
sysid	string	否	应用编码
modifier	string	否	修改人主键
memo	string	否	备注
_viewmodel	string	否	模型
modifier__name	string	否	修改人名称
masterOrgKeyField	string	否	主组织 示例：pk_org
bill_date	string	否	计划生效日期 示例：2023-07-21
bill_code	string	否	变动计划单号 示例：FPBD202307210001
pk_org	string	否	资产组织 示例：1717719299076915209
pk_fiorg	string	否	会计主体 示例：1717719299076915209
id	string	否	主键 示例：1775833702678396933
pubts	string	否	时间戳 示例：2023-07-21 18:10:52
creator__name	string	否	创建人名称 示例：昵称-15727377404
creator	string	否	创建人编码 示例：018532e9-5aff-43e3-8157-c583afb6db67
billmaketime	string	否	制单时间 示例：2023-07-21 18:10:52
isWfControlled	long	否	工作流控制 示例：0
pk_org__name	string	否	资产组织 示例：WUHF固定资产组织
make_bill_flag	long	否	生单标记 示例：0
billmaker__name	string	否	制单人 示例：昵称-15727377404
bill_status	long	否	单据状态 示例：0
pk_recorder__name	string	否	经办人名称 示例：武慧峰
billmaker	string	否	制单人主键 示例：018532e9-5aff-43e3-8157-c583afb6db67
creationtime	string	否	创建时间 示例：2023-07-21 18:10:52
pk_fiorg__name	string	否	会计主体名称 示例：WUHF固定资产组织
bodyvos	object	是	子表信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"returncount": 0,
		"pk_recorder": "1736996460910608384",
		"verifystate": 0,
		"modifiedtime": "",
		"transTypeKeyField": "",
		"sysid": "",
		"modifier": "",
		"memo": "",
		"_viewmodel": "",
		"modifier__name": "",
		"masterOrgKeyField": "pk_org",
		"bill_date": "2023-07-21",
		"bill_code": "FPBD202307210001",
		"pk_org": "1717719299076915209",
		"pk_fiorg": "1717719299076915209",
		"id": "1775833702678396933",
		"pubts": "2023-07-21 18:10:52",
		"creator__name": "昵称-15727377404",
		"creator": "018532e9-5aff-43e3-8157-c583afb6db67",
		"billmaketime": "2023-07-21 18:10:52",
		"isWfControlled": 0,
		"pk_org__name": "WUHF固定资产组织",
		"make_bill_flag": 0,
		"billmaker__name": "昵称-15727377404",
		"bill_status": 0,
		"pk_recorder__name": "武慧峰",
		"billmaker": "018532e9-5aff-43e3-8157-c583afb6db67",
		"creationtime": "2023-07-21 18:10:52",
		"pk_fiorg__name": "WUHF固定资产组织",
		"bodyvos": [
			{
				"pk_equip__equip_code": "202307210002",
				"pk_equip": "1775771623231062025",
				"main_id": "1775833702678396933",
				"pk_equip__equip_name": "chenjiut005",
				"id": "1775833702678396934",
				"grandvos": [
					{
						"rowno": "10",
						"deltaProportion": 50,
						"proportion": 50,
						"pk_usedept": "1717721403606695945",
						"main_id": "1775833702678396934",
						"pk_costcenter_use__name": "WUHF固定资产成本中心",
						"proportion_before": 0,
						"pk_costcenter_use": 1726028600509464585,
						"id": "1775833702678396936",
						"pk_usedept__name": "WUHF固定资产部门",
						"memo": "",
						"pk_jobmngfil": "",
						"pk_jobmngfil__name": "",
						"pk_material": "",
						"pk_material__name": "",
						"pk_profitcenter_use": "",
						"pk_profitcenter_use__name": ""
					}
				],
				"pk_equip__model": "",
				"pk_equip__spec": "",
				"pk_reason": "",
				"pk_reason__name": ""
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
999	报错具体提示信息	结合报错提示信息查找原因

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

