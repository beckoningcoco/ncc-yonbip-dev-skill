---
title: "资产报废详情查询"
apiId: "2063672901910396933"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Scrap"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Scrap]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产报废详情查询

>  请求方式	POST | Asset Scrap (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/scrapCard/detail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	资产报废主表主键 示例：2074711466078371850

## 3. 请求示例

Url: /yonbip/am/scrapCard/detail?access_token=访问令牌
Body: {
	"id": "2074711466078371850"
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
auditor__name	string	否	审核人
auditor	string	否	审核人
bill_code_src	string	否	来源单据编码
is_openapi	boolean	否	是否openapi接口保存
memo	string	否	备注
pk_currency	string	否	组织币种
pk_recorder	string	否	经办人 示例：1525595937317060616
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
bill_date	string	否	单据日期 示例：2022-09-14
bill_code	string	否	单据编码 示例：ZCBF202209140002
pk_org	string	否	资产组织 示例：1525588386773467139
pk_transitype	string	否	交易类型 示例：1515209332007896098
bill_type	string	否	单据类型 示例：4A19
id	string	否	主键 示例：1545726388910686216
pubts	string	否	时间戳 示例：2022-09-14 17:03:56
creator__name	string	否	创建人 示例：默认用户
tenant	string	否	租户主键 示例：0000L6EN2KLCEQ7W3B0000
creator	string	否	创建人 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
billmaketime	string	否	制单人 示例：2022-09-14 17:03:55
push_status	number
小数位数:0,最大长度:10	否	固资状态 示例：0
sysid	string	否	所属服务 示例：AUM
isWfControlled	boolean	否	是否审批流控制 示例：true
pk_org__name	string	否	资产组织 示例：云智化工
pk_transitype__name	string	否	交易类型 示例：资产报废
billmaker__name	string	否	制单人 示例：默认用户
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
pk_recorder__name	string	否	经办人 示例：白璇
billmaker	string	否	制单人 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
transi_type	string	否	交易类型 示例：4A19-01
creationtime	string	否	创建时间 示例：2022-09-14 17:03:55
bodyvos	object	是	子表
pk_addreducestyle__name	string	否	减少方式 示例：出售
main_id	string	否	主表主键 示例：1545726388910686216
close_flag	boolean	否	关闭 示例：true
stock_out_flag	boolean	否	出库标记 示例：true
pk_org	string	否	资产组织 示例：1525588386773467139
pk_equip__equip_code	string	否	资产卡片编码 示例：202208200002
pk_equip	string	否	资产卡片主键 示例：1526989327804923906
pk_equip__pk_ownerunit	string	否	使用单位 示例：1525588386773467139
confirm_flag	boolean	否	确认标记 示例：true
pk_equip__equip_name	string	否	资产名称 示例：EAM-岸边起重机001
pk_addreducestyle	string	否	增减方式 示例：1515209314831695912
id	string	否	主键 示例：1545726388910686217
pubts	string	否	时间戳 示例：2022-09-14 17:03:56
stock_in_flag	boolean	否	入库标记 示例：true
tenant	string	否	租户主键 示例：0000L6EN2KLCEQ7W3B0000
pk_currency_fi	string	否	财务币种
origin_value	number
小数位数:2,最大长度:10	否	原值
accu_dep	number
小数位数:2,最大长度:10	否	累计折旧
new_value	number
小数位数:2,最大长度:10	否	净值
pre_devaluate	number
小数位数:2,最大长度:10	否	减值准备
net_money	number
小数位数:2,最大长度:10	否	净额
salvage_rate	number
小数位数:2,最大长度:10	否	净残值率%
salvage	number
小数位数:2,最大长度:10	否	净残值
begin_date	string	否	开始使用日期
service_month	number
小数位数:0,最大长度:10	否	使用月限
used_month	number
小数位数:0,最大长度:10	否	已计提期数
pk_reason	string	否	报废原因
pk_location_before	string	否	报废前位置
pk_location_after	string	否	报废位置
pk_warehouse_in	string	否	报废入库
pk_warehouse_out	string	否	出库仓库
src_transitype	string	否	来源交易类型
bill_code_src	string	否	来源单据号
pk_icorg	string	否	入库库存组织
pk_icorg_out	string	否	出库库存组织即卡片库存组织
pk_confirmer	string	否	确认人
pk_jobmngfil	string	否	项目
memo	string	否	备注
pk_status_before	string	否	变动前设备状态
pk_status_after	string	否	变动后设备状态
status_date_before	string	否	变动前状态日期
status_date_after	string	否	变动后状态日期
masterOrgKeyField	string	否	主组织字段编码 示例：pk_org
transTypeKeyField	string	否	交易类型字段编码 示例：pk_transitype

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"auditor__name": "",
		"auditor": "",
		"bill_code_src": "",
		"is_openapi": true,
		"memo": "",
		"pk_currency": "",
		"pk_recorder": "1525595937317060616",
		"returncount": 0,
		"verifystate": 0,
		"bill_date": "2022-09-14",
		"bill_code": "ZCBF202209140002",
		"pk_org": "1525588386773467139",
		"pk_transitype": "1515209332007896098",
		"bill_type": "4A19",
		"id": "1545726388910686216",
		"pubts": "2022-09-14 17:03:56",
		"creator__name": "默认用户",
		"tenant": "0000L6EN2KLCEQ7W3B0000",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"billmaketime": "2022-09-14 17:03:55",
		"push_status": 0,
		"sysid": "AUM",
		"isWfControlled": true,
		"pk_org__name": "云智化工",
		"pk_transitype__name": "资产报废",
		"billmaker__name": "默认用户",
		"bill_status": 0,
		"pk_recorder__name": "白璇",
		"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"transi_type": "4A19-01",
		"creationtime": "2022-09-14 17:03:55",
		"bodyvos": [
			{
				"pk_addreducestyle__name": "出售",
				"main_id": "1545726388910686216",
				"close_flag": true,
				"stock_out_flag": true,
				"pk_org": "1525588386773467139",
				"pk_equip__equip_code": "202208200002",
				"pk_equip": "1526989327804923906",
				"pk_equip__pk_ownerunit": "1525588386773467139",
				"confirm_flag": true,
				"pk_equip__equip_name": "EAM-岸边起重机001",
				"pk_addreducestyle": "1515209314831695912",
				"id": "1545726388910686217",
				"pubts": "2022-09-14 17:03:56",
				"stock_in_flag": true,
				"tenant": "0000L6EN2KLCEQ7W3B0000",
				"pk_currency_fi": "",
				"origin_value": 0,
				"accu_dep": 0,
				"new_value": 0,
				"pre_devaluate": 0,
				"net_money": 0,
				"salvage_rate": 0,
				"salvage": 0,
				"begin_date": "",
				"service_month": 0,
				"used_month": 0,
				"pk_reason": "",
				"pk_location_before": "",
				"pk_location_after": "",
				"pk_warehouse_in": "",
				"pk_warehouse_out": "",
				"src_transitype": "",
				"bill_code_src": "",
				"pk_icorg": "",
				"pk_icorg_out": "",
				"pk_confirmer": "",
				"pk_jobmngfil": "",
				"memo": "",
				"pk_status_before": "",
				"pk_status_after": "",
				"status_date_before": "",
				"status_date_after": ""
			}
		],
		"masterOrgKeyField": "pk_org",
		"transTypeKeyField": "pk_transitype"
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

