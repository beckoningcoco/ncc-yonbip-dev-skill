---
title: "外出申请写入"
apiId: "2064494640837427207"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Out-of-Office Application Document"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Out-of-Office Application Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 外出申请写入

>  请求方式	POST | Out-of-Office Application Document (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/outTrip/generateOutTripBill
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
userId	string	否	是	操作人userId 示例：bf810f9e-35f4-4799-b79d-9a7b6bfc45f3
data	object	是	否	请求体
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
userId	string	否	否	用户userId（staffId、staffCode、userId三选一必填，有staffId时优先使用staffId) 示例：bf810f9e-35f4-4799-b79d-9a7b6bfc45f3
staffId	string	否	否	申请员工id（staffId、staffCode、userId三选一必填，有staffId时优先使用staffId) 示例：2007899264047382533
staffCode	string	否	否	员工编码（staffId、staffCode、userId三选一必填，有staffId时优先使用staffId) 示例：0000001
outTypeId	string	否	是	外出类型 示例：0000LTFLEWTJ22U56C0000couttype01
outBeginTime	date
格式:yyyy-MM-dd HH:mm:ss	否	是	外出开始时间 示例：2024-06-09 09:00:00
outEndTime	date
格式:yyyy-MM-dd HH:mm:ss	否	是	外出结束时间 示例：2024-06-09 10:00:00
startDayType	number
小数位数:0,最大长度:1	否	否	1 上午 2 下午 示例：1
endDayType	number
小数位数:0,最大长度:1	否	否	1 上午 2 下午 示例：1
cost	number
小数位数:2,最大长度:10	否	否	外出费用 示例：300.00
destination	string	否	是	外出地点 示例：北京
remark	string	否	否	外出事由 示例：提交材料

## 3. 请求示例

Url: /yonbip/hrcloud/time/outTrip/generateOutTripBill?access_token=访问令牌
Body: {
	"userId": "bf810f9e-35f4-4799-b79d-9a7b6bfc45f3",
	"data": [
		{
			"resubmitCheckKey": "",
			"userId": "bf810f9e-35f4-4799-b79d-9a7b6bfc45f3",
			"staffId": "2007899264047382533",
			"staffCode": "0000001",
			"outTypeId": "0000LTFLEWTJ22U56C0000couttype01",
			"outBeginTime": "2024-06-09 09:00:00",
			"outEndTime": "2024-06-09 10:00:00",
			"startDayType": 1,
			"endDayType": 1,
			"cost": 300,
			"destination": "北京",
			"remark": "提交材料"
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
data	object	是	返回结果集
yonyouId	string	否	BIP主键（新增的外出单的主键） 示例：2034811546309754882
msg	string	否	错误信息。若写入成功，返回外出时长等信息
status	number
小数位数:0,最大长度:1	否	状态码，0=成功，1=失败 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"yonyouId": "2034811546309754882",
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
500	获取用户信息失败！	

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

