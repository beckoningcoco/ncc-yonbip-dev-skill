---
title: "出差调整申请写入"
apiId: "1622169093013504008"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Trip Adjustment Document"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Trip Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 出差调整申请写入

>  请求方式	POST | Business Trip Adjustment Document (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/businessTrip/generateBill
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	请求体
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
userId	string	否	否	用户id 示例：f322bb55-d693-46eb-ab4c-6868fa2c1bad
mainid	string	否	是	原单据id 示例：12343490er8-20210318
offType	long	否	是	0=部分调整，1=未出差 示例：0
tripbegintime	long	否	否	出差实际开始时间，如果offType=0，则该字段为必传字段 示例：1616025636000
tripendtime	long	否	否	出差实际结束时间，如果offType=0，则该字段为必传字段 示例：1616040036000
startDayType	number
小数位数:0,最大长度:1	否	否	1 上午 2 下午 示例：1
endDayType	number
小数位数:0,最大长度:1	否	否	1 上午 2 下午 示例：2
destination	string	否	否	出差地点，需要修改出差地点时传此参数 示例：北京
remark	string	否	否	出差事由，需要修改出差事由时传此参数 示例：北京出差

## 3. 请求示例

Url: /yonbip/hrcloud/time/businessTrip/generateBill?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"userId": "f322bb55-d693-46eb-ab4c-6868fa2c1bad",
			"mainid": "12343490er8-20210318",
			"offType": 0,
			"tripbegintime": 1616025636000,
			"tripendtime": 1616040036000,
			"startDayType": 1,
			"endDayType": 2,
			"destination": "北京",
			"remark": "北京出差"
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
code	string	否	状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	是	返回信息结果集
id	string	否	id，是原单据id，也就是传入的mainid 示例：12345678
msg	string	否	错误信息
status	long	否	0=成功，1=失败 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "12345678",
			"msg": "",
			"status": 0
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
500	解析出差调整单JSON失败！	检查json

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

