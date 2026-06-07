---
title: "使用权调入详情查询"
apiId: "2081498914561196032"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Right of Use Transfer-in"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Right of Use Transfer-in]
platform_version: "BIP"
source_type: community-api-docs
---

# 使用权调入详情查询

>  请求方式	POST | Right of Use Transfer-in (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/deployUsedin/detail
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
id	string	否	否	使用权调入主表主键 示例：2023608922899742728

## 3. 请求示例

Url: /yonbip/am/deployUsedin/detail?access_token=访问令牌
Body: {
	"id": "2023608922899742728"
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
auditor__name	string	否	审核人 示例：张三
auditor	string	否	审核人 示例：1982040657426907136
memo	string	否	备注 示例：备注
pk_recorder	string	否	经办人主键 示例：1982040657426907136
returncount	number
小数位数:0,最大长度:10	否	返回数量 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审核状态 示例：0
bill_date	string	否	单据日期 示例：2024-06-19
bill_code	string	否	单据编码 示例：SYDR202406190001
pk_usedorg_in	string	否	调入使用单位 示例：1980535426005860360
pk_org	string	否	资产组织 示例：1980535426005860360
pk_transitype	string	否	交易类型 示例：4A48-01
pk_usedorg_in__name	string	否	调入使用单位名称 示例：WUHF集团资产组织
bill_type	string	否	单据类型 示例：4A48
pk_usedorg_out__name	string	否	调出使用单位 示例：WUHF资产组织
id	string	否	主键 示例：2023608922899742728
pubts	string	否	时间戳 示例：2024-06-19 14:38:06
creator__name	string	否	创建人名称 示例：昵称-15727377404
tenant	string	否	租户 示例：0000LV53NH2Z4URDOP0000
creator	string	否	创建人 示例：018532e9-5aff-43e3-8157-c583afb6db67
billmaketime	string	否	制单时间 示例：2024-06-19 14:38:04
sysid	string	否	服务编码 示例：AUM
isWfControlled	boolean	否	流程控制 示例：false
pk_org__name	string	否	资产组织名称 示例：WUHF集团资产组织
billmaker__name	string	否	制单人名称 示例：昵称-15727377404
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
pk_recorder__name	string	否	经办人名称 示例：武慧峰
billmaker	string	否	制单人主键 示例：018532e9-5aff-43e3-8157-c583afb6db67
pk_usedorg_out	string	否	调出使用单位 示例：1980536027314389001
transi_type	string	否	交易类型 示例：4A48-01
creationtime	string	否	创建时间 示例：2024-06-19 14:38:04
bodyvos	object	是	使用权调入表体
bill_code_src	string	否	来源单据号 示例：SYDC202406190002
src_pk_bill	string	否	来源单据主键 示例：2023608751101050886
pk_usedept_before	string	否	调入前使用部门 示例：1980537255661928456
src_bill_type	string	否	来源单据类型 示例：4A47
pk_costcenter_used_out	string	否	调出利润中心 示例：2001976521241133059
memo	string	否	备注 示例：sss
main_id	string	否	主表主键 示例：2023608922899742728
src_pk_bill_b	string	否	来源单据子表主键 示例：2023608751101050887
pk_equip__pk_category	string	否	资产类别 示例：1986521605413011465
pk_org	string	否	资产组织 示例：1980535426005860360
src_transitype	string	否	来源交易类型 示例：4A47-01
pk_equip__equip_code	string	否	资产卡片编码 示例：202405210001
pk_equip	string	否	资产卡片主键 示例：2001987250055282690
pk_costcenter_used_out__name	string	否	利润中心 示例：有效类别
pk_equip__pk_category__category_name	string	否	资产类别 示例：技术参数类别
pk_equip__equip_name	string	否	资产卡片名称 示例：001
id	string	否	子表主键 示例：2023608922899742729
pubts	string	否	时间戳 示例：2024-06-19 14:38:05
tenant	string	否	租户id 示例：0000LV53NH2Z4URDOP0000
stock_in_flag	boolean	否	入库标记 示例：false
pk_usedept_before__name	string	否	调出使用部门名称 示例：WUHF资产部门
pk_equip__pk_ownerorg	string	否	资产卡片管理组织 示例：1980536027314389001
pk_addreducestyle	string	否	调拨方式 示例：1
pk_reason	string	否	调拨原因 示例：1982040657426907136
pk_usedunit_out	string	否	调出使用权 示例：2023608922899742729
pk_usedunit_in	string	否	调入使用权 示例：2023608922899742729
pk_usedept_after	string	否	调入使用部门 示例：2023608922899742729
pk_user_before	string	否	调出责任人 示例：2023608922899712722
pk_user_after	string	否	调入责任人 示例：201336089228997427
pk_jobmngfil	string	否	项目 示例：13323608922899742729
pk_location_before	string	否	调拨前位置 示例：34236089228997427
pk_location_after	string	否	调入位置 示例：2023608922899742781
pk_warehouse_in	string	否	调入仓库 示例：2023608922899742729
pk_warehouse_out	string	否	调出仓库 示例：20236089228997541134
pre_devaluate	string	否	减值准备 示例：12.9
pre_devaluate_before	string	否	调拨前减值准备 示例：22
begin_date_before	date
格式:yyyy-MM-dd	否	调拨前开始使用日期 示例：2024-10-11
begin_date	date
格式:yyyy-MM-dd	否	开始使用日期 示例：2024-11-12
pk_currency	string	否	币种 示例：20236089228997541134
pk_icorg_in	string	否	调入库存组织 示例：2001987250055282690
pk_icorg_out	string	否	调出库存组织 示例：2001987250055282651
pk_costcenter_used_in	string	否	调入使用成本中心 示例：2001987250055282690
pk_profitcenter_used_in	string	否	调入使用利润中心 示例：2001987250055873412
pk_profitcenter_used_out	string	否	调出使用利润中心 示例：6131987250055282690
pk_jobmngfil_before	string	否	调出项目 示例：2001987250055282690
pk_jobmngfil_after	string	否	调入项目 示例：5161987250055282690
accu_dep_before	number
小数位数:8,最大长度:28	否	调拨前累计折旧 示例：331
accu_dep	number
小数位数:8,最大长度:28	否	累计折旧 示例：641
dep_amount_before	number
小数位数:2,最大长度:28	否	调拨前月折旧额 示例：111
dep_amount	number
小数位数:8,最大长度:28	否	月折旧额 示例：111
net_money_before	number
小数位数:8,最大长度:28	否	调拨前净额 示例：231
net_money	number
小数位数:2,最大长度:28	否	净额 示例：231
new_value_before	number
小数位数:2,最大长度:28	否	调拨前净值 示例：651
new_value	number
小数位数:2,最大长度:28	否	净值 示例：651
origin_value_before	number
小数位数:8,最大长度:28	否	调拨前原值 示例：908
origin_value	number
小数位数:8,最大长度:28	否	原值 示例：908
salvage_before	number
小数位数:8,最大长度:28	否	调拨前净残值 示例：13
salvage	number
小数位数:8,最大长度:28	否	净残值 示例：13
salvage_rate	number
小数位数:8,最大长度:28	否	净残值率% 示例：2.9
salvage_rate_before	number
小数位数:8,最大长度:28	否	调拨前净残值率% 示例：2.9
service_month	number
小数位数:0,最大长度:11	否	使用月限 示例：21
service_month_before	number
小数位数:0,最大长度:11	否	调拨前使用月限 示例：21
pk_location_after__name	string	否	调入位置 示例：位置1
used_month	number
小数位数:0,最大长度:11	否	已计提期数 示例：12
used_month_before	number
小数位数:0,最大长度:11	否	调拨前已计提期数 示例：12
pk_location_before__name	string	否	调拨前位置 示例：位置1
step	number
小数位数:0,最大长度:10	否	调拨进度 示例：3

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"auditor__name": "张三",
		"auditor": "1982040657426907136",
		"memo": "备注",
		"pk_recorder": "1982040657426907136",
		"returncount": 0,
		"verifystate": 0,
		"bill_date": "2024-06-19",
		"bill_code": "SYDR202406190001",
		"pk_usedorg_in": "1980535426005860360",
		"pk_org": "1980535426005860360",
		"pk_transitype": "4A48-01",
		"pk_usedorg_in__name": "WUHF集团资产组织",
		"bill_type": "4A48",
		"pk_usedorg_out__name": "WUHF资产组织",
		"id": "2023608922899742728",
		"pubts": "2024-06-19 14:38:06",
		"creator__name": "昵称-15727377404",
		"tenant": "0000LV53NH2Z4URDOP0000",
		"creator": "018532e9-5aff-43e3-8157-c583afb6db67",
		"billmaketime": "2024-06-19 14:38:04",
		"sysid": "AUM",
		"isWfControlled": false,
		"pk_org__name": "WUHF集团资产组织",
		"billmaker__name": "昵称-15727377404",
		"bill_status": 0,
		"pk_recorder__name": "武慧峰",
		"billmaker": "018532e9-5aff-43e3-8157-c583afb6db67",
		"pk_usedorg_out": "1980536027314389001",
		"transi_type": "4A48-01",
		"creationtime": "2024-06-19 14:38:04",
		"bodyvos": [
			{
				"bill_code_src": "SYDC202406190002",
				"src_pk_bill": "2023608751101050886",
				"pk_usedept_before": "1980537255661928456",
				"src_bill_type": "4A47",
				"pk_costcenter_used_out": "2001976521241133059",
				"memo": "sss",
				"main_id": "2023608922899742728",
				"src_pk_bill_b": "2023608751101050887",
				"pk_equip__pk_category": "1986521605413011465",
				"pk_org": "1980535426005860360",
				"src_transitype": "4A47-01",
				"pk_equip__equip_code": "202405210001",
				"pk_equip": "2001987250055282690",
				"pk_costcenter_used_out__name": "有效类别",
				"pk_equip__pk_category__category_name": "技术参数类别",
				"pk_equip__equip_name": "001",
				"id": "2023608922899742729",
				"pubts": "2024-06-19 14:38:05",
				"tenant": "0000LV53NH2Z4URDOP0000",
				"stock_in_flag": false,
				"pk_usedept_before__name": "WUHF资产部门",
				"pk_equip__pk_ownerorg": "1980536027314389001",
				"pk_addreducestyle": "1",
				"pk_reason": "1982040657426907136",
				"pk_usedunit_out": "2023608922899742729",
				"pk_usedunit_in": "2023608922899742729",
				"pk_usedept_after": "2023608922899742729",
				"pk_user_before": "2023608922899712722",
				"pk_user_after": "201336089228997427",
				"pk_jobmngfil": "13323608922899742729",
				"pk_location_before": "34236089228997427",
				"pk_location_after": "2023608922899742781",
				"pk_warehouse_in": "2023608922899742729",
				"pk_warehouse_out": "20236089228997541134",
				"pre_devaluate": "12.9",
				"pre_devaluate_before": "22",
				"begin_date_before": "2024-10-11",
				"begin_date": "2024-11-12",
				"pk_currency": "20236089228997541134",
				"pk_icorg_in": "2001987250055282690",
				"pk_icorg_out": "2001987250055282651",
				"pk_costcenter_used_in": "2001987250055282690",
				"pk_profitcenter_used_in": "2001987250055873412",
				"pk_profitcenter_used_out": "6131987250055282690",
				"pk_jobmngfil_before": "2001987250055282690",
				"pk_jobmngfil_after": "5161987250055282690",
				"accu_dep_before": 331,
				"accu_dep": 641,
				"dep_amount_before": 111,
				"dep_amount": 111,
				"net_money_before": 231,
				"net_money": 231,
				"new_value_before": 651,
				"new_value": 651,
				"origin_value_before": 908,
				"origin_value": 908,
				"salvage_before": 13,
				"salvage": 13,
				"salvage_rate": 2.9,
				"salvage_rate_before": 2.9,
				"service_month": 21,
				"service_month_before": 21,
				"pk_location_after__name": "位置1",
				"used_month": 12,
				"used_month_before": 12,
				"pk_location_before__name": "位置1"
			}
		],
		"step": 3
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

