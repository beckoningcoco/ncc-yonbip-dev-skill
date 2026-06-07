---
title: "检验记录详情查询"
apiId: "2205599185582424073"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Record"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验记录详情查询

>  请求方式	POST | Inspection Record (GAM)


## 1. 通过OpenAPI查询检验记录详情；


## 2. 支持的查询条件及操作符：记录单号（等于）

3. 返回信息包括检验记录表头、表体信息（字段与出厂预置的WEB端UI模板默认显示字段一致）；

## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/record/detail
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
id	string	否	否	单据ID 示例：1921184295075184646
code	string	否	否	记录单号 示例：JYJL202502200001

## 3. 请求示例

Url: /yonbip/am/record/detail?access_token=访问令牌
Body: {
	"id": "1921184295075184646",
	"code": "JYJL202502200001"
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
code	string	否	返回结果编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
bill_code	string	否	记录单号 示例：JYJL202502200001
modifier	string	否	修改人主键 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
memo	string	否	备注 示例：更新1
bizFlow	string	否	业务流ID 示例：7aa3a42b-abd3-4815-91a4-5795b290ded2
pk_org	string	否	资产组织ID 示例：2097854596607115265
pk_transitype	string	否	交易类型ID 示例：2097839796130414677
modifiedtime	string	否	最后修改时间ID 示例：2025-02-20 09:37:44
pk_fiorg	string	否	会计主体ID 示例：2097854596607115265
bizFlow_version	string	否	业务流版本号 示例：V1.0
bill_type	string	否	单据类型 示例：4A54
id	string	否	检验记录ID 示例：2206025409530167303
pubts	string	否	时间戳 示例：2025-02-20 09:37:45
creator__name	string	否	创建人名称 示例：默认用户
isFlowCoreBill	boolean	否	是否有工作流 示例：true
tenant	string	否	租户ID 示例：0000M1KDLF2WBNDBSX0000
creator	string	否	创建人ID 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
billmaketime	string	否	制单时间 示例：2025-02-20 09:32:38
sysid	string	否	业务系统 示例：SEM
isWfControlled	boolean	否	是否流程控制 示例：false
pk_org__name	string	否	资产组织名称 示例：G公司
pk_transitype__name	string	否	交易类型名称 示例：检验记录
billmaker__name	string	否	制单人名称 示例：默认用户
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
modifier__name	string	否	修改人名称 示例：默认用户
billmaker	string	否	制单人主键 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
transi_type	string	否	交易类型编码 示例：4A54-01
creationtime	string	否	创建时间 示例：2025-02-20 09:32:38
pk_fiorg__name	string	否	会计主体名称 示例：G公司
bodyvos	object	是	检验记录表体
bizFlow_name	string	否	业务流名称 示例：检验记录生成工单工作台
auditor	string	否	审核人ID 示例：df943d6e-074f-454a-8413-8bfd70fd0e29
auditor__name	string	否	审核人名称 示例：测试
audittime	string	否	审核时间 示例：2025-03-04 13:39:16

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"bill_code": "JYJL202502200001",
		"modifier": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"memo": "更新1",
		"bizFlow": "7aa3a42b-abd3-4815-91a4-5795b290ded2",
		"pk_org": "2097854596607115265",
		"pk_transitype": "2097839796130414677",
		"modifiedtime": "2025-02-20 09:37:44",
		"pk_fiorg": "2097854596607115265",
		"bizFlow_version": "V1.0",
		"bill_type": "4A54",
		"id": "2206025409530167303",
		"pubts": "2025-02-20 09:37:45",
		"creator__name": "默认用户",
		"isFlowCoreBill": true,
		"tenant": "0000M1KDLF2WBNDBSX0000",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"billmaketime": "2025-02-20 09:32:38",
		"sysid": "SEM",
		"isWfControlled": false,
		"pk_org__name": "G公司",
		"pk_transitype__name": "检验记录",
		"billmaker__name": "默认用户",
		"bill_status": 0,
		"modifier__name": "默认用户",
		"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"transi_type": "4A54-01",
		"creationtime": "2025-02-20 09:32:38",
		"pk_fiorg__name": "G公司",
		"bodyvos": [
			{
				"registration_authority": "111",
				"pk_spec_equip__calculation_method": 3,
				"pk_usedorg": "2097854596607115265",
				"pk_equip__pk_special_type": "2099946967234773007",
				"memo": "11",
				"checker": "更新1",
				"pk_spec_equip__check_period_num": 1,
				"pk_spec_equip__pk_equip__equip_code": "202410290003",
				"pk_equip__pk_category": "2099946280032665608",
				"pk_org": "2097854596607115265",
				"pk_spec_equip": "2121643733248114693",
				"pk_ownerorg": "2097854596607115265",
				"check_conclusion": "1",
				"pk_equip__pk_special_type__catalogue_name": "承压蒸汽锅炉",
				"pk_spec_equip__check_content_no": 1,
				"check_date_after": "2025-02-22",
				"id": "2206025409530167304",
				"pubts": "2025-02-20 09:37:45",
				"tenant": "0000M1KDLF2WBNDBSX0000",
				"check_period": "1日",
				"pk_spec_equip__check_status": 3,
				"next_date_check_after": "2025-02-23",
				"main_id": "2206025409530167303",
				"pk_equip__is_pre": false,
				"grandvos": [
					{
						"standard": "1234",
						"main_id": "2206025409530167304",
						"project": "12223",
						"memo": "更新1",
						"result": "1234",
						"id": "2206025409530167305",
						"pubts": "2025-02-20 09:37:45",
						"tenant": "0000M1KDLF2WBNDBSX0000"
					}
				],
				"pk_equip": "2121643733248114691",
				"check_category": "1",
				"registration_code": "111",
				"identifier_name": "111",
				"pk_spec_equip__check_period_unit": 3,
				"pk_equip__pk_category__category_name": "一级资产",
				"pk_equip__equip_name": "特种设备2",
				"certificate_no": "11",
				"check_money_org": 1
			}
		],
		"bizFlow_name": "检验记录生成工单工作台",
		"auditor": "df943d6e-074f-454a-8413-8bfd70fd0e29",
		"auditor__name": "测试",
		"audittime": "2025-03-04 13:39:16"
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

