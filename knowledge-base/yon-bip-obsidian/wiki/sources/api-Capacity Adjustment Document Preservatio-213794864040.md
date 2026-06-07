---
title: "产能调节单保存"
apiId: "2137948640406667266"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Capacity Adjustment Order"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Capacity Adjustment Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 产能调节单保存

>  请求方式	POST | Capacity Adjustment Order (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/capacity/adjust/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据结构
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
orgId	string	否	否	组织ID和组织Code二选一必传
orgCode	string	否	否	组织Code和组织ID二选一必传
adjustObject	number
小数位数:0,最大长度:10	否	是	调节对象：0工作中心，当为工作中心时，工作中心编码和工作中心ID不能同时为空，1：生产线，当为生产线时，生产线编码和生产线ID不能同时为空
workCenterId	number
小数位数:0,最大长度:19	否	否	工作中心ID
workCenterCode	string	否	否	工作中心编码
productionLineId	number
小数位数:0,最大长度:19	否	否	生产线ID
productionLineCode	string	否	否	生产线编码
_status	string	否	是	插入：Insert，更新：Update
capacityAdjustDetail	object	是	否	子表

## 3. 请求示例

Url: /yonbip/mfg/capacity/adjust/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"orgId": "",
		"orgCode": "",
		"adjustObject": 0,
		"workCenterId": 0,
		"workCenterCode": "",
		"productionLineId": 0,
		"productionLineCode": "",
		"_status": "",
		"capacityAdjustDetail": [
			{
				"adjustDate": "2026-06-07",
				"adjustedTime": 0,
				"adjustedQuantity": 0,
				"_status": ""
			}
		]
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
code	string	否	接口返回状态 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
id	number
小数位数:0,最大长度:19	否	主表id 示例：2371860049892096
orgId	string	否	组织id 示例：1870887948554496
orgName	string	否	组织名称 示例：qing-gc001
adjustObject	number
小数位数:0,最大长度:10	否	调节对象，0：工作中心，1：生产线 示例：0
workCenterId	number
小数位数:0,最大长度:19	否	工作中心ID 示例：2107446624476725256
workCenterName	string	否	工作中心名称 示例：生产部
workCalendar	string	否	工作日历id 示例：kuguqrp9calendar000001
workCalendarName	string	否	工作日历名称 示例：默认工作日历方案
powerUnitType	string	否	能力单位类型{"S":时间，"E":产量} 示例：S
quantity	number
小数位数:0,最大长度:10	否	数量 示例：1
workTime	number
小数位数:0,最大长度:10	否	工作时间 示例：8
timeUnit	string	否	时间单位:hour-时,minute-分,second-秒 示例：hour
standardOutput	number
小数位数:2,最大长度:10	否	标准产量 示例：5.00
outputUnit	number
小数位数:0,最大长度:19	否	产量单位id 示例：2104217413030145
outputUnitName	string	否	产量单位名称 示例：台
remark	string	否	备注
capacityAdjustDetail	object	是	产能调节单子表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2371860049892096,
		"orgId": "1870887948554496",
		"orgName": "qing-gc001",
		"adjustObject": 0,
		"workCenterId": 2107446624476725256,
		"workCenterName": "生产部",
		"workCalendar": "kuguqrp9calendar000001",
		"workCalendarName": "默认工作日历方案",
		"powerUnitType": "S",
		"quantity": 1,
		"workTime": 8,
		"timeUnit": "hour",
		"standardOutput": 5,
		"outputUnit": 2104217413030145,
		"outputUnitName": "台",
		"remark": "",
		"capacityAdjustDetail": [
			{
				"id": 2371860049892097,
				"capacityAdjustId": 2188358046191872,
				"adjustDate": "2024-11-22 00:00:00",
				"adjustedQuantity": 0,
				"adjustedTime": 1
			}
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
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

