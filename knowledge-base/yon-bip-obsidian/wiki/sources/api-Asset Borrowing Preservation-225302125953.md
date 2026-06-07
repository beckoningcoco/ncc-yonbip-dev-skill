---
title: "资产借用保存"
apiId: "2253021259533123591"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Borrowing Document Maintenance"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Borrowing Document Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产借用保存

>  请求方式	POST | Borrowing Document Maintenance (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/aumborrow/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	资产借用对象
id	string	否	否	资产借用ID 示例：2201039888808148997
pubts	string	否	否	资产借用表头时间戳 示例：2025-04-24 17:00:58
take_date	date
格式:yyyy-MM-dd	否	是	借用日期 示例：2025-02-13
bill_code	string	否	否	单据编码 示例：ZCJY202502130001
bill_status	number
小数位数:0,最大长度:10	否	是	单据状态 示例：0 默认值：0
bill_type	string	否	是	单据类型 示例：4A15 默认值：4A15
transi_type	string	否	是	交易类型 示例：4A15-01 默认值：4A15-01
pk_org	string	否	是	资产组织主键 示例：2097854596607115265
pk_transitype	string	否	否	交易类型主键 示例：2097839796130414658
pk_taker	string	否	是	借用人主键 示例：2097855747668836356
pk_dept	string	否	否	借用部门主键 示例：2097854845709975552
pk_recorder	string	否	否	经办人主键 示例：2097855747668836356
bodyvos	object	是	是	资产借用子表
_status	string	否	是	状态（若Update需要填主子表id） 示例：Insert或者Update 默认值：Insert
integratedAssetFlag	boolean	否	否	混合云插件回写标记 示例：false 默认值：false

## 3. 请求示例

Url: /yonbip/am/aumborrow/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2201039888808148997",
			"pubts": "2025-04-24 17:00:58",
			"take_date": "2025-02-13",
			"bill_code": "ZCJY202502130001",
			"bill_status": 0,
			"bill_type": "4A15",
			"transi_type": "4A15-01",
			"pk_org": "2097854596607115265",
			"pk_transitype": "2097839796130414658",
			"pk_taker": "2097855747668836356",
			"pk_dept": "2097854845709975552",
			"pk_recorder": "2097855747668836356",
			"bodyvos": [
				{
					"pk_usedept_after": "2097854845709975552",
					"status_date_after": "2025-02-13",
					"expect_end_date": "2025-02-13",
					"id": "2201039888808148998",
					"pubts": "2025-04-24 17:00:54",
					"pk_status_after": "PRESET01_0000M1KDLF2WBNDBSX0000",
					"pk_status_before": "PRESET01_0000M1KDLF2WBNDBSX0000",
					"status_date_before": "2025-02-13",
					"main_id": "2201039888808148997",
					"pk_category": "2097858204361818120",
					"pk_user_after": "2097855747668836356",
					"pk_equip": "2201037921724137476",
					"pk_location_after": "2132042132539047942",
					"_status": "Insert或者Update"
				}
			],
			"_status": "Insert或者Update",
			"integratedAssetFlag": false
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
code	string	否	编码 示例：200
message	string	否	信息 示例：操作成功！
data	object	否	返回数据
count	number
小数位数:0,最大长度:10	否	总数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数量 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
messages	string	是	信息
infos	object	是	返回内容
failInfos	string	是	失败信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": "2201039888808148997",
				"pubts": "2025-04-24 17:01:22",
				"take_date": "2025-02-13 00:00:00",
				"bill_code": "ZCJY202502130001",
				"bill_status": 0,
				"bill_type": "4A15",
				"transi_type": "4A15-01",
				"pk_org": "2097854596607115265",
				"pk_transitype": "2097839796130414658",
				"pk_taker": "2097855747668836356",
				"pk_dept": "2097854845709975552",
				"pk_recorder": "2097855747668836356",
				"bodyvos": [
					{
						"pk_usedept_after": "2097854845709975552",
						"expect_end_date": "2025-02-13 00:00:00",
						"id": "2201039888808148998",
						"pubts": "2025-04-24 17:00:54",
						"main_id": "2201039888808148997",
						"pk_category": "2097858204361818120",
						"pk_user_after": "2097855747668836356",
						"pk_equip": "2201037921724137476",
						"pk_location_after": "2132042132539047942",
						"stock_out_flag": false,
						"pk_usedept_after__name": "部门1",
						"pk_org": "2097854596607115265",
						"pk_equip__equip_code": "202502130001",
						"pk_category__category_name": "电子设备",
						"pk_user_after__name": "郭亚鑫",
						"pk_equip__equip_name": "视频卡片",
						"stock_in_flag": false,
						"pk_location_after__location_name": "测试位置1"
					}
				],
				"isWfControlled": false,
				"pk_org__name": "G公司",
				"pk_recorder__name": "郭亚鑫",
				"pk_transitype__name": "资产借用",
				"pk_taker__name": "郭亚鑫",
				"pk_dept__name": "部门1",
				"billmaker": "15f8b2be-87b7-4947-bc06-6ffabfccc73a",
				"billmaker__name": "g1员工",
				"billmaketime": "2025-02-13 16:19:28",
				"modifier": "df943d6e-074f-454a-8413-8bfd70fd0e29",
				"modifier__name": "萧小天",
				"modifiedtime": "2025-04-24 17:01:21",
				"creator": "15f8b2be-87b7-4947-bc06-6ffabfccc73a",
				"creator__name": "g1员工",
				"creationtime": "2025-02-13 16:19:28"
			}
		],
		"failInfos": [
			""
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
999	服务端逻辑异常	查看日志找对应异常服务定位产生原因

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-23	
更新
请求参数 (7)
新增
错误码 999

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

