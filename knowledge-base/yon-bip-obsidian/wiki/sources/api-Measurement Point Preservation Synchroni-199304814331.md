---
title: "测量点保存同步IOT"
apiId: "1993048143318482946"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Card"
domain: "APS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 测量点保存同步IOT

>  请求方式	POST | Asset Card (APS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/sync/aic/measurepoint/save
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
measure_point_code	string	否	是	测量点编码
measure_point_name	string	否	是	测量点名称
pk_equip	string	否	否	资产卡片
routingkey	string	否	否	路由键 默认值：aic
rent_object	string	否	否	租赁对象
rent_object_explain	string	否	否	租赁对象描述
meas_item_explain	string	否	否	测量项目说明
identifier	string	否	否	测量标识符
result_type	number
小数位数:0,最大长度:11	否	否	测量结果类型
pk_measuredoc	string	否	否	计量单位
warning_lower	number
小数位数:1,最大长度:28	否	否	预警下限
work_upper	number
小数位数:1,最大长度:28	否	否	操作上限
work_lower	number
小数位数:1,最大长度:28	否	否	操作下限
last_meas_time	date
格式:yyyy-MM-dd HH:mm:ss	否	否	最后测量时间
pk_last_measpsn	string	否	否	最后测量人
last_meas_result	number
小数位数:8,最大长度:28	否	否	最后测量结果
frequency	number
小数位数:0,最大长度:11	否	否	频率
frequency_unit	number
小数位数:0,最大长度:11	否	否	频率单位
range	number
小数位数:0,最大长度:11	否	否	取值类型
start_number_time	string	否	否	开始取数时间
start_time	string	否	否	有效开始时间
synchronous_state	number
小数位数:0,最大长度:11	否	否	同步状态
cause_synchronization	string	否	否	同步失败原因
last_sync_time	date
格式:yyyy-MM-dd HH:mm:ss	否	否	最后同步时间
memo	string	否	否	备注
the_last_time	date
格式:yyyy-MM-dd HH:mm:ss	否	否	最后取数时间
process_no	string	否	否	IOT工艺位号
iot_device_code	string	否	否	IOT设备编码
iot_device_name	string	否	否	IOT设备名称
iot_property_name	string	否	否	IOT属性名称

## 3. 请求示例

Url: /yonbip/am/sync/aic/measurepoint/save?access_token=访问令牌
Body: {
	"measure_point_code": "",
	"measure_point_name": "",
	"pk_equip": "",
	"routingkey": "",
	"rent_object": "",
	"rent_object_explain": "",
	"meas_item_explain": "",
	"identifier": "",
	"result_type": 0,
	"pk_measuredoc": "",
	"warning_lower": 0,
	"work_upper": 0,
	"work_lower": 0,
	"last_meas_time": "2026-06-07 13:20:18",
	"pk_last_measpsn": "",
	"last_meas_result": 0,
	"frequency": 0,
	"frequency_unit": 0,
	"range": 0,
	"start_number_time": "",
	"start_time": "",
	"synchronous_state": 0,
	"cause_synchronization": "",
	"last_sync_time": "2026-06-07 13:20:18",
	"memo": "",
	"the_last_time": "2026-06-07 13:20:18",
	"process_no": "",
	"iot_device_code": "",
	"iot_device_name": "",
	"iot_property_name": ""
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
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

