---
title: "资产盘点子表查询"
apiId: "2336657441152827392"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Stocktaking Sheet"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Stocktaking Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产盘点子表查询

>  请求方式	POST | Stocktaking Sheet (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/auminventorymobilecard/querydetail
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
data	object	否	是	数据
id	string	否	是	单据主键 示例：2336242796509790215
pageSize	number
小数位数:0,最大长度:1000	否	是	每页显示记录数 示例：50
pageIndex	number
小数位数:0,最大长度:1000	否	是	当前页码 示例：1
condition	object	否	否	子表筛选条件

## 3. 请求示例

Url: /yonbip/ACC/auminventorymobilecard/querydetail?access_token=访问令牌
Body: {
	"data": {
		"id": "2336242796509790215",
		"pageSize": 50,
		"pageIndex": 1,
		"condition": {
			"groupop": "",
			"filteritems": [
				{
					"name": "",
					"op": "",
					"value": ""
				}
			]
		}
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功！
data	object	否	数据
bill_code	string	否	单据编码 示例：ZCPD202508140005
totalCount	number
小数位数:0,最大长度:10	否	盘点单表体总数量 示例：20377
pk_org	string	否	资产组织主键 示例：2111225611567497225
pk_transitype	string	否	交易类型主键 示例：2107554909184852085
bill_type	string	否	单据类型 示例：4A35
id	string	否	单据主键 示例：2336242796509790215
pubts	string	否	时间戳 示例：2025-08-14 20:27:43
creator__name	string	否	创建人 示例：郝小侠
tenant	string	否	租户 示例：0000M232Z6A20YFPC30000
start_date	string	否	盘点开始日期 示例：2025-08-14
creator	string	否	创建人主键 示例：1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16
billmaketime	string	否	制单时间 示例：2025-08-14 20:27:38
inventory_mode	number
小数位数:0,最大长度:10	否	盘点模式 示例：1
pk_org__name	string	否	资产组织 示例：likun-OrgName-All
pk_transitype__name	string	否	交易类型 示例：资产盘点
billmaker__name	string	否	制单人 示例：郝小侠
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
billmaker	string	否	制单人主键 示例：1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16
transi_type	string	否	交易类型编码 示例：4A35-01
publish_flag	boolean	否	是否发布 示例：false
creationtime	string	否	创建时间 示例：2025-08-14 20:27:38
inventory_type	number
小数位数:0,最大长度:10	否	盘点类型 示例：1
inventory_range	string	否	盘点范围 示例：资产组织:likun-OrgName-All 盘点开始日期:2025.08.14 盘点组织类型:资产管理组织 盘点组织范围:likun-OrgName-All
bodyvos	object	是	盘点单表体
errorDetail	string	否	错误信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"bill_code": "ZCPD202508140005",
		"totalCount": 20377,
		"pk_org": "2111225611567497225",
		"pk_transitype": "2107554909184852085",
		"bill_type": "4A35",
		"id": "2336242796509790215",
		"pubts": "2025-08-14 20:27:43",
		"creator__name": "郝小侠",
		"tenant": "0000M232Z6A20YFPC30000",
		"start_date": "2025-08-14",
		"creator": "1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16",
		"billmaketime": "2025-08-14 20:27:38",
		"inventory_mode": 1,
		"pk_org__name": "likun-OrgName-All",
		"pk_transitype__name": "资产盘点",
		"billmaker__name": "郝小侠",
		"bill_status": 0,
		"billmaker": "1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16",
		"transi_type": "4A35-01",
		"publish_flag": false,
		"creationtime": "2025-08-14 20:27:38",
		"inventory_type": 1,
		"inventory_range": "资产组织:likun-OrgName-All \n盘点开始日期:2025.08.14 \n盘点组织类型:资产管理组织 \n盘点组织范围:likun-OrgName-All",
		"bodyvos": [
			{
				"pk_usedept_after": "2111775384570167298",
				"pk_manager_after__name": "李坤-员工-01[Myself]",
				"pk_ownerunit__name": "likun-OrgName-All",
				"pk_manager_after": "2111265717973680137",
				"pk_usedept_after__name": "likun-DP.Name-EAM",
				"pk_org": "2111225611567497225",
				"pk_used_status_before__status_name": "在用",
				"equip_code": "EAM-2025010400011682",
				"pk_manager_before__name": "李坤-员工-01[Myself]",
				"pk_manager_before": "2111265717973680137",
				"model": "Model-20250102",
				"inventory_result": 4,
				"id": "2336242796509790266",
				"tenant": "0000M232Z6A20YFPC30000",
				"pk_usedept_before": "2111775384570167298",
				"pk_mandept_after": "2111228497794433025",
				"pk_org__name": "likun-OrgName-All",
				"equip_name": {
					"en_US": "",
					"zh_TW": "",
					"zh_CN": "likun-testCard-yonyou"
				},
				"pk_used_status_after": "PRESET01_0000M232Z6A20YFPC30000",
				"pk_location_after__location_name": "北京故宫博物院",
				"pk_mandept_before": "2111228497794433025",
				"pk_usedept_before__name": "likun-DP.Name-EAM",
				"pk_usedorg": "2111226814158340106",
				"pk_user_before": "2111775874201681924",
				"pk_location_before": "2111274548439023619",
				"pk_user_before__name": "李大壮",
				"pk_ownerorg": "2111225611567497225",
				"pk_used_status_after__status_name": "在用",
				"pk_used_status_before": "PRESET01_0000M232Z6A20YFPC30000",
				"pk_mandept_before__name": "likun-DP.Name-01",
				"pubts": "2025-08-14 20:27:41",
				"pk_ownerunit": "2111225611567497225",
				"pk_category__category_name": "LIKUNTEST-大数据场景验证",
				"rowno": "51",
				"pk_mandept_after__name": "likun-DP.Name-01",
				"pk_usedorg__name": "likun-OrgName-资产组织",
				"pk_equip__status_date": "2025-01-04",
				"spec": "",
				"inventory_verfiresult": 4,
				"main_id": "2336242796509790215",
				"pk_location_after": "2111274548439023619",
				"pk_ownerorg__name": "likun-OrgName-All",
				"pk_user_after": "2111775874201681924",
				"pk_location_before__location_name": "北京故宫博物院",
				"inventory_flag": false,
				"pk_equip": "2171347242383835140",
				"pk_user_after__name": "李大壮"
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
999	Can't find attribute aum.inventory.InventoryBodyVO/category,oriName:category,tenantId:0000LFTDURFQ4U89HD0000	

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

