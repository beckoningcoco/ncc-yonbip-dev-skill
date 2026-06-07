---
title: "资产变动集成_弃审删除固定资产变动"
apiId: "1628831257300303876"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Change"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产变动集成_弃审删除固定资产变动

>  请求方式	POST | Asset Change (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/alterCardIntegrate/unapprove
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
pk_alter	string	否	否	变动单主键
pk_group	string	否	否	集团
pk_org	string	否	否	资产组织最新版本
pk_org_v	string	否	否	资产组织
busi_type	string	否	否	业务类型
bill_code	string	否	否	变动单号
bill_type	string	否	否	单据类型
pk_transitype	string	否	否	交易类型
transi_type	string	否	否	交易类型编码
bill_status	number
小数位数:0,最大长度:38	否	否	单据状态
bill_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	变动日期
pk_recorder	string	否	否	经办人
creator	string	否	否	创建人
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间
auditor	string	否	否	审批人
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批时间
check_opinion	string	否	否	审批意见
modifier	string	否	否	最后修改人
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	最后修改时间
memo	string	否	否	备注
billmaker	string	否	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间
saga_gtxid	string	否	否	全局事务
saga_btxid	string	否	否	子事务
saga_frozen	number
小数位数:0,最大长度:38	否	否	冻结状态
saga_status	number
小数位数:0,最大长度:38	否	否	事务状态
alterinfo	string	否	否	变动信息
pre_text1	string	否	否	预置字符1
pre_text2	string	否	否	预置字符2
pre_text3	string	否	否	预置字符3
pre_text4	string	否	否	预置字符4
pre_text5	string	否	否	预置字符5
pre_text6	string	否	否	预置字符6
pre_text7	string	否	否	预置字符7
pre_text8	string	否	否	预置字符8
pre_text9	string	否	否	预置字符9
pre_text10	string	否	否	预置字符10
def1	string	否	否	自定义项1
def2	string	否	否	自定义项2
def3	string	否	否	自定义项3
def4	string	否	否	自定义项4
def5	string	否	否	自定义项5
def6	string	否	否	自定义项6
def7	string	否	否	自定义项7
def8	string	否	否	自定义项8
def9	string	否	否	自定义项9
def10	string	否	否	自定义项10
def11	string	否	否	自定义项11
def12	string	否	否	自定义项12
def13	string	否	否	自定义项13
def14	string	否	否	自定义项14
def15	string	否	否	自定义项15
def16	string	否	否	自定义项16
def17	string	否	否	自定义项17
def18	string	否	否	自定义项18
def19	string	否	否	自定义项19
def20	string	否	否	自定义项20
body	object	是	否	变动单明细
pk_alter_b	string	否	否	子表主键
pk_group	string	否	否	集团
rowno	string	否	否	行号
pk_org	string	否	否	资产组织最新版本
pk_org_v	string	否	否	资产组织
pk_equip	string	否	否	设备
pk_reason	string	否	否	变动原因
deal_result	string	否	否	处理结果
memo	string	否	否	备注
pk_jobmngfil	string	否	否	项目
def1	string	否	否	自定义项1
def2	string	否	否	自定义项2
def3	string	否	否	自定义项3
def4	string	否	否	自定义项4
def5	string	否	否	自定义项5
def6	string	否	否	自定义项6
def7	string	否	否	自定义项7
def8	string	否	否	自定义项8
def9	string	否	否	自定义项9
def10	string	否	否	自定义项10
def11	string	否	否	自定义项11
def12	string	否	否	自定义项12
def13	string	否	否	自定义项13
def14	string	否	否	自定义项14
def15	string	否	否	自定义项15
def16	string	否	否	自定义项16
def17	string	否	否	自定义项17
def18	string	否	否	自定义项18
def19	string	否	否	自定义项19
def20	string	否	否	自定义项20
pk_mandept_before	string	否	否	变动前管理部门
pk_mandept_after	string	否	否	变动后管理部门
pk_usedept_before	string	否	否	变动前使用部门
pk_usedept_after	string	否	否	变动后使用部门
pk_user_before	string	否	否	变动前责任人
pk_user_after	string	否	否	变动后责任人
pk_location_before	string	否	否	变动前位置
pk_location_after	string	否	否	变动后位置
pk_jobmngfil_before	string	否	否	变动前项目
pk_jobmngfil_after	string	否	否	变动后项目

## 3. 请求示例

Url: /yonbip/am/alterCardIntegrate/unapprove?access_token=访问令牌
Body: {
	"pk_alter": "",
	"pk_group": "",
	"pk_org": "",
	"pk_org_v": "",
	"busi_type": "",
	"bill_code": "",
	"bill_type": "",
	"pk_transitype": "",
	"transi_type": "",
	"bill_status": 0,
	"bill_date": "2026-06-07 13:21:30",
	"pk_recorder": "",
	"creator": "",
	"creationtime": "2026-06-07 13:21:30",
	"auditor": "",
	"audittime": "2026-06-07 13:21:30",
	"check_opinion": "",
	"modifier": "",
	"modifiedtime": "2026-06-07 13:21:30",
	"memo": "",
	"billmaker": "",
	"billmaketime": "2026-06-07 13:21:30",
	"saga_gtxid": "",
	"saga_btxid": "",
	"saga_frozen": 0,
	"saga_status": 0,
	"alterinfo": "",
	"pre_text1": "",
	"pre_text2": "",
	"pre_text3": "",
	"pre_text4": "",
	"pre_text5": "",
	"pre_text6": "",
	"pre_text7": "",
	"pre_text8": "",
	"pre_text9": "",
	"pre_text10": "",
	"def1": "",
	"def2": "",
	"def3": "",
	"def4": "",
	"def5": "",
	"def6": "",
	"def7": "",
	"def8": "",
	"def9": "",
	"def10": "",
	"def11": "",
	"def12": "",
	"def13": "",
	"def14": "",
	"def15": "",
	"def16": "",
	"def17": "",
	"def18": "",
	"def19": "",
	"def20": "",
	"body": [
		{
			"pk_alter_b": "",
			"pk_group": "",
			"rowno": "",
			"pk_org": "",
			"pk_org_v": "",
			"pk_equip": "",
			"pk_reason": "",
			"deal_result": "",
			"memo": "",
			"pk_jobmngfil": "",
			"def1": "",
			"def2": "",
			"def3": "",
			"def4": "",
			"def5": "",
			"def6": "",
			"def7": "",
			"def8": "",
			"def9": "",
			"def10": "",
			"def11": "",
			"def12": "",
			"def13": "",
			"def14": "",
			"def15": "",
			"def16": "",
			"def17": "",
			"def18": "",
			"def19": "",
			"def20": "",
			"pk_mandept_before": "",
			"pk_mandept_after": "",
			"pk_usedept_before": "",
			"pk_usedept_after": "",
			"pk_user_before": "",
			"pk_user_after": "",
			"pk_location_before": "",
			"pk_location_after": "",
			"pk_jobmngfil_before": "",
			"pk_jobmngfil_after": ""
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	数据
count	number
小数位数:0,最大长度:10	否	数量 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数量 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
messages	object	是	返回信息
infos	object	是	成功数据
failInfos	object	是	失败数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"_entityName": "aum.alter.AlterBillHeadVO",
				"pk_org": "2578616857580032",
				"alterinfo": "pk_priority",
				"bill_date": "2023-03-02 00:00:00",
				"bill_type": "4A07",
				"transi_type": "4A07-07",
				"bill_status": 0,
				"bodyvos": [
					{
						"pk_equip__equip_code": "202204210001",
						"pk_priority_before": "PRESET01_0000KV7VR8GU3W81730000",
						"pk_priority_after": "PRESET02_0000KV7VR8GU3W81730000",
						"pk_equip": "2741060145533953",
						"detail": [
							{
								"old_content": "PRESET01_0000KV7VR8GU3W81730000",
								"new_content": "PRESET02_0000KV7VR8GU3W81730000",
								"id": "1671102806553526282",
								"item_code": "pk_priority",
								"main_id": "1671102806553526281"
							}
						],
						"id": "1671102806553526281",
						"main_id": "1671102806553526280",
						"pk_org": "2578616857580032"
					}
				],
				"id": "1671102806553526280",
				"sysid": "AUM",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator__name": "默认用户",
				"creationtime": "2023-03-02 15:26:11",
				"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"billmaker__name": "默认用户",
				"billmaketime": "2023-03-02 15:26:11",
				"pk_transitype": "2491027558486554",
				"isWfControlled": false,
				"verifystate": 0,
				"bill_code": "ZCBD202303020006",
				"pubts": "2023-03-02 15:26:12"
			}
		],
		"failInfos": [
			{}
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

