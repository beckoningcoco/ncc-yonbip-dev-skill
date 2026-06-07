---
title: "停开机记录保存"
apiId: "34fd5ebdfb6e4fbba76a40b23dd0bcc8"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Power-on/off Record"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Power-on/off Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 停开机记录保存

>  请求方式	POST | Power-on/off Record (MRO)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/aomhaltstartcard/save
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
data	object	是	是	停开机记录参数对象
transi_type	string	否	是	交易类型编码，最大传参长度：50 示例：4B05-01 默认值：4B05-01
bill_code	string	否	否	记录号（当设置为手工编码时，必须填写，当设置为自动编码时，不必填写），最大传参长度：50 示例：TKJJL20220302TTT-0005
pk_org	string	否	否	资产组织id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2452356266333952
pk_equip	string	否	是	资产id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2469571437646080
record_type	int	否	是	停开机类型（0：停机，1：开机） 示例：0
haltstart_time	DateTime	否	是	停开机时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2022-01-27 10:38:59
pk_halt_reason	string	否	否	停机原因id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：PRESET01_0000KRFP13N1AJ3BI90000
source	string	否	否	来源，最大传参长度：36
pk_recorder	string	否	否	记录人id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2373554756423936
memo	string	否	否	备注，最大传参长度：200 示例：停机
_status	string	否	是	状态（仅支持Insert一种状态） 示例：Insert 默认值：Insert
defines	object	否	否	自定义项（支持60个自定义项）

## 3. 请求示例

Url: /yonbip/am/aomhaltstartcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"transi_type": "4B05-01",
			"bill_code": "TKJJL20220302TTT-0005",
			"pk_org": "2452356266333952",
			"pk_equip": "2469571437646080",
			"record_type": 0,
			"haltstart_time": "2022-01-27 10:38:59",
			"pk_halt_reason": "PRESET01_0000KRFP13N1AJ3BI90000",
			"source": "",
			"pk_recorder": "2373554756423936",
			"memo": "停机",
			"_status": "Insert",
			"defines": {
				"define1": ""
			}
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
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：*操作成功！
data	object	否	返回数据
count	long	否	总数 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	object	是	返回详细信息
infos	object	是	数据详细信息
failInfos	object	是	错误详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "*操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"bill_status": 0,
				"bill_type": "4B05",
				"transi_type": "4B05-01",
				"confirm_result": 0,
				"pk_org": "2452356266333952",
				"pk_equip": "2492236813111552",
				"record_type": 0,
				"haltstart_time": "2022-02-27 10:38:59",
				"pk_halt_reason": "PRESET01_0000KRFP13N1AJ3BI90000",
				"source": "MES",
				"pk_recorder": "2373554756423936",
				"memo": "备注",
				"bill_code": "TKJJL20220301201-0001",
				"id": "2669324872831232",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creationtime": "2022-03-01 16:17:40",
				"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"billmaketime": "2022-03-01 16:17:40",
				"tenant": "0000KU26QT9NELGXSF0000",
				"defines": {
					"define1": "",
					"define2": "",
					"define3": "",
					"id": "2669324872831232"
				}
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
999	报错具体提示信息，例如：输入的长度不能超过40位	

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

