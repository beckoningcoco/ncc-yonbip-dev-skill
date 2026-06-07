---
title: "休假调整申请写入"
apiId: "1623654275524591622"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Leave Adjustment Document"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 休假调整申请写入

>  请求方式	POST | Leave Adjustment Document (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/leave/generatebill
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
userId	string	否	否	userId用户信息 示例：bf810f9e-35f4-4799-b79d-9a7b6bfc45f3
data	object	是	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
staffId	string	否	否	员工id（staffId、staffCode、userId三选一必填，staffId、staffCode同时传值时以staffId为准，有staffId时优先使用staffId） 示例：2059124616614144
staffCode	string	否	否	员工编码（staffId、staffCode、userId三选一必填，staffId、staffCode同时传值时以staffId为准，有staffId时优先使用staffId） 示例：0000134668
userId	string	否	否	用户userId（staffId、staffCode、userId三选一必填，staffId、staffCode同时传值时以staffId为准，有staffId时优先使用staffId） 示例：bf810f9e-35f4-4799-b79d-9a7b6bfc45f3
mainid	string	否	是	必填，休假单主键 示例：4facfb079fdd4fdea0997c734c735634
offType	long	否	是	休假调整类型 1=未休假 0=部分调整 示例：0
leaveoffbegintime	long	否	否	休假调整开始时间，如果offType=0，则该字段为必传项 示例：1614662446000
leaveoffendtime	long	否	否	休假调整结束时间，如果offType=0，则该字段为必传项 示例：1614676846000
applydate	string	否	否	申请日期 示例：2021-03-02
startDayType	long	否	否	适用于半天假，若休假类型为半天假且offType=0，则该字段为必传项。1=班次上半段，2=班次下半段。非半天假，这个字段不能传 示例：1
endDayType	long	否	否	适用于半天假，若休假类型为半天假且offType=0，则该字段为必传项。1=班次上半段，2=班次下半段。非半天假，这个字段不能传 示例：1
approveStatus	number
小数位数:0,最大长度:1	否	否	审核状态，1:草稿 3:审核中 4:审核完成，不填默认为4审核完成 示例：3
remark	string	否	否	休假调整单备注 示例：休假调整

## 3. 请求示例

Url: /yonbip/hrcloud/time/leave/generatebill?access_token=访问令牌
Body: {
	"userId": "bf810f9e-35f4-4799-b79d-9a7b6bfc45f3",
	"data": [
		{
			"resubmitCheckKey": "",
			"staffId": "2059124616614144",
			"staffCode": "0000134668",
			"userId": "bf810f9e-35f4-4799-b79d-9a7b6bfc45f3",
			"mainid": "4facfb079fdd4fdea0997c734c735634",
			"offType": 0,
			"leaveoffbegintime": 1614662446000,
			"leaveoffendtime": 1614676846000,
			"applydate": "2021-03-02",
			"startDayType": 1,
			"endDayType": 1,
			"approveStatus": 3,
			"remark": "休假调整"
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
yonyouId	string	否	休假调整单ID 示例：12345678
msg	string	否	错误信息，若无错误消息，则返回调整后的请假时长
status	long	否	0=成功，1=失败 示例：0
mainId	string	否	请假单ID 示例：2179477014188130309

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"yonyouId": "12345678",
			"msg": "",
			"status": 0,
			"mainId": "2179477014188130309"
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
500	解析休假调整单JSON失败	检查json

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-26	
更新
请求说明
更新
请求参数 (6)
更新
返回参数 data
更新
返回参数 yonyouId
更新
返回参数 msg
更新
错误码 500
	2	2025-06-25	
新增
请求参数 approveStatus
新增
请求参数 remark
新增
请求参数 leaveOffDetailDefine
新增
返回参数 mainId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

