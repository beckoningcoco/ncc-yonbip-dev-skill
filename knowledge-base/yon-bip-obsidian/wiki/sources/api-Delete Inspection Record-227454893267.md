---
title: "检验记录保存"
apiId: "2274548932677730309"
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

# 检验记录保存

>  请求方式	POST | Inspection Record (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/semrecordcard/save
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
data	object	是	是	检验记录对象
id	string	否	否	检验记录主表主键，更新时必输；
pk_org	string	否	是	资产组织 示例：1811418477406715910
pk_fiorg	string	否	是	会计主体 示例：1811418477406715910
bill_code	string	否	否	记录单号 示例：JYJL202502180001
pk_recorder	string	否	否	经办人 示例：1811424370087690244
pk_raorg	string	否	否	利润中心
project	string	否	否	项目
wbs	string	否	否	WBS
activity	string	否	否	活动
memo	string	否	否	备注 示例：123
bill_code_src	string	否	否	申报单号
bill_type	string	否	否	单据类型 示例：4A54 默认值：4A54
transi_type	string	否	否	交易类型 示例：4A54-01 默认值：4A54-01
billmaker	string	否	否	制单人 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间 示例：2025-05-23 15:25:09
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳 示例：2023-06-15 19:51:15
_status	string	否	是	主表状态：1.Insert：新增；2.Update：更新； 示例：Insert
bodyvos	object	是	是	检验记录表体

## 3. 请求示例

Url: /yonbip/am/semrecordcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"pk_org": "1811418477406715910",
			"pk_fiorg": "1811418477406715910",
			"bill_code": "JYJL202502180001",
			"pk_recorder": "1811424370087690244",
			"pk_raorg": "",
			"project": "",
			"wbs": "",
			"activity": "",
			"memo": "123",
			"bill_code_src": "",
			"bill_type": "4A54",
			"transi_type": "4A54-01",
			"billmaker": "ffde1766-84ad-4059-abd4-7f1a7c451354",
			"billmaketime": "2025-05-23 15:25:09",
			"pubts": "2023-06-15 19:51:15",
			"_status": "Insert",
			"bodyvos": [
				{
					"id": "rowId_96",
					"pk_equip": "1811462818648031251",
					"pk_spec_equip": "1811462818648031252",
					"certificate_no": "",
					"checker": "ICBC",
					"registration_authority": "ICBI",
					"registration_code": "likun-testCard-yonyou",
					"check_date_after": "2025-02-18 00:00:00",
					"next_date_check_after": "2026-02-17 00:00:00",
					"check_category": "",
					"check_conclusion": "1",
					"pk_costcenter_manage": "",
					"pk_profitcenter_manage": "",
					"pk_costcenter_use": "",
					"pk_profitcenter_use": "",
					"check_money_org": 2,
					"identifier_name": "123",
					"memo": "123",
					"pk_jobmngfil": "",
					"unqualified_deal": "",
					"pk_workorder": "",
					"check_period_name": "",
					"_status": "Insert",
					"grandvos": [
						{
							"id": "rowId_163",
							"project": "1234",
							"standard": "123",
							"result": "123",
							"memo": "123",
							"_status": "Insert"
						}
					]
				}
			]
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
小数位数:0,最大长度:10	否	总数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数量 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
messages	object	是	返回详细信息
infos	object	是	数据详细信息
failInfos	object	是	错误信息

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
				"pk_recorder": "1811424370087690244",
				"bill_code": "JYJL202502180001",
				"memo": "123",
				"pk_org": "1811418477406715910",
				"pk_fiorg": "1811418477406715910",
				"bill_type": "4A54",
				"id": "2204803774726275072",
				"pubts": "2025-02-18 18:02:20",
				"pk_currency": "1763914111891537950",
				"_status": "",
				"bill_status": 0,
				"transi_type": "4A54-01",
				"bodyvos": [
					{
						"registration_authority": "ICBI",
						"memo": "123",
						"checker": "ICBC",
						"pk_org": "1811418477406715910",
						"pk_costcenter_use": "",
						"check_conclusion": "1",
						"id": "2204803774726275073",
						"pk_profitcenter_use": "",
						"check_period": "1年",
						"next_date_check_after": "2026-02-17 00:00:00",
						"pk_costcenter_manage": "",
						"grandvos": [
							{
								"project": "1234",
								"standard": "123",
								"result": "123",
								"memo": "123",
								"id": "2204803774726275074",
								"ytenant": "0000LJPGZ3RX3YAKG10000"
							}
						],
						"identifier_name": "123",
						"pk_profitcenter_manage": "",
						"check_date_after": "2025-02-18 00:00:00",
						"ytenant": "0000LJPGZ3RX3YAKG10000",
						"pk_equip": "1811462818648031251",
						"registration_code": "likun-testCard-yonyou",
						"pk_jobmngfil": "1945712355162193966",
						"check_money_org": 2
					}
				]
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
999	错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
新增
请求参数 (15)
更新
请求参数 (33)
更新
返回参数 (48)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

