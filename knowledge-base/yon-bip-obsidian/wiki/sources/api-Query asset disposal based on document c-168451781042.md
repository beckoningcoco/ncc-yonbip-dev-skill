---
title: "根据资产卡片查询资产处置"
apiId: "1684517810421104645"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Disposal"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Disposal]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据资产卡片查询资产处置

>  请求方式	POST | Asset Disposal (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/salecard/detail
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
externalData	object	否	是	扩展字段
openapi_pk_equip	string	否	是	资产卡片主键id或code 示例：1673944562988482563

## 3. 请求示例

Url: /yonbip/am/salecard/detail?access_token=访问令牌
Body: {
	"externalData": {
		"openapi_pk_equip": "1673944562988482563"
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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回信息
id	string	否	主键 示例：1673944562988482563
pk_org	string	否	主组织 示例：1524200639876825094
pk_org__name	string	否	资产组织名称 示例：bx集团
pk_recorder	string	否	经办人 示例：1524200674255437831
pk_recorder__name	string	否	经办人名称 示例：bx集团员工
verifystate	BigDecimal	否	审批状态（0：开立，1：审批中，2：审批通过，3：流程终止，4：退回制单） 示例：0
bill_date	string	否	处置日期 示例：2023-03-06
bill_status	BigDecimal	否	单据状态（0：开立，1：已审核，2：已关闭，3：审核中） 示例：0
bill_code	string	否	处置单号 示例：ZCCZ202303060002
pk_fiorg	string	否	会计主体 示例：1524200639876825094
pk_fiorg__name	string	否	会计主体名称 示例：bx集团
pk_currency	string	否	币种 示例：1524173469914759191
pk_currency__name	string	否	币种名称 示例：人民币
pk_currency__moneyDigit	BigDecimal	否	币种精度 示例：8
memo	string	否	主表备注
pk_transitype	string	否	交易类型 示例：1524173469928391725
pk_transitype__name	string	否	交易类型名称 示例：资产处置
transi_type	string	否	交易类型 示例：4A18-01
transTypeKeyField	string	否	交易类型字段 示例：pk_transitype
bill_type	string	否	单据类型 示例：4A18
masterOrgKeyField	string	否	主组织字段 示例：pk_org
pubts	string	否	时间戳 示例：2023-03-06 11:19:56
modifier	string	否	修改人
modifier__name	string	否	修改人名称
modifiedtime	string	否	修改日期
creator	string	否	创建人 示例：d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44
creator__name	string	否	创建人名称 示例：昵称-白璇
creationtime	string	否	创建时间 示例：2023-03-06 11:19:55
billmaker	string	否	制单人 示例：d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44
billmaker__name	string	否	制单人名称 示例：昵称-白璇
billmaketime	string	否	制单时间 示例：2023-03-06 11:19:55
returncount	BigDecimal	否	退回次数 示例：0
isWfControlled	boolean	否	是否审批流控制 示例：true
sysid	string	否	系统标识 示例：AUM
bodyvos	object	是	表体
errorDetail	string	否	错误信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"id": "1673944562988482563",
		"pk_org": "1524200639876825094",
		"pk_org__name": "bx集团",
		"pk_recorder": "1524200674255437831",
		"pk_recorder__name": "bx集团员工",
		"verifystate": 0,
		"bill_date": "2023-03-06",
		"bill_status": 0,
		"bill_code": "ZCCZ202303060002",
		"pk_fiorg": "1524200639876825094",
		"pk_fiorg__name": "bx集团",
		"pk_currency": "1524173469914759191",
		"pk_currency__name": "人民币",
		"pk_currency__moneyDigit": 8,
		"memo": "",
		"pk_transitype": "1524173469928391725",
		"pk_transitype__name": "资产处置",
		"transi_type": "4A18-01",
		"transTypeKeyField": "pk_transitype",
		"bill_type": "4A18",
		"masterOrgKeyField": "pk_org",
		"pubts": "2023-03-06 11:19:56",
		"modifier": "",
		"modifier__name": "",
		"modifiedtime": "",
		"creator": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
		"creator__name": "昵称-白璇",
		"creationtime": "2023-03-06 11:19:55",
		"billmaker": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
		"billmaker__name": "昵称-白璇",
		"billmaketime": "2023-03-06 11:19:55",
		"returncount": 0,
		"isWfControlled": true,
		"sysid": "AUM",
		"bodyvos": [
			{
				"pk_org": "1524200639876825094",
				"pk_equip": "1566529475315761155",
				"pk_equip__equip_code": "EAM--20221012-bx00-0041",
				"pk_equip__equip_name": "bx集团",
				"pk_equip__spec": "",
				"pk_equip__model": "",
				"pk_addreducestyle": "1524173469927342409",
				"pk_addreducestyle__name": "盘亏",
				"pk_reason": "1606590954563174406",
				"pk_reason__name": "1qa",
				"purgerevenue": 12,
				"purgefee": 12,
				"pk_equip__pk_currency_fi": "1524173469914759191",
				"pk_equip__pk_currency_fi__name": "人民币",
				"pk_equip__pk_currency_fi__moneyDigit": 8,
				"accu_dep": 12.2,
				"origin_value": 12.3,
				"new_value": 12.3,
				"pre_devaluate": 1,
				"salvage": 1,
				"salvage_rate": 1,
				"net_money": 1,
				"begin_date": "022-09-30",
				"used_month": 1,
				"service_month": 1,
				"pk_jobmngfil": "1539689150964826118",
				"pk_jobmngfil__name": "项目共享测试2",
				"pk_warehouse_out": "1234324353464232",
				"pk_warehouse_out__name": "仓库名称",
				"pk_icorg_out": "124342343545454",
				"pk_icorg_out__name": "李坤-员工-01M",
				"pk_location_before": "1524837385978773505",
				"pk_location_before__location_name": "数字化体验馆",
				"pk_location_after__location_name": "1524837385978773505",
				"pk_location_after": "数字化体验馆",
				"pk_status_before": "PRESET01_0000L6VWE12DH6JBPJ0000",
				"pk_status_before__status_name": "在用",
				"memo": "",
				"receivable_flag": false,
				"stock_out_flag": false,
				"payable_flag": false,
				"stock_in_flag": false,
				"pk_usedorg_equip": "1524788397572358153",
				"pk_usedorg_equip__name": "likun-OrgName-All",
				"pk_ownerorg_equip": "1524788397572358153",
				"pk_ownerorg_equip__name": "ikun-OrgName-All",
				"pk_profitcenter_manage": "1598387034482278402",
				"pk_profitcenter_manage__name": "LIKUNTEST-会计主体001",
				"pk_costcenter_manage": "1592486050045362181",
				"pk_costcenter_manage__name": "LIKUNETST001",
				"pk_profitcenter_use": "1598387034482278402",
				"pk_profitcenter_use__name": "IKUNTEST-会计主体001",
				"pk_costcenter_use": "1592486050045362181",
				"pk_costcenter_use__name": "LIKUNETST001",
				"pubts": "2023-03-06 11:19:56",
				"id": "1673944562988482564",
				"main_id": "1673944562988482563"
			}
		]
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
999	报错具体提示信息	结合报错提示信息查找原因

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (96)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

