---
title: "获取当前登录用户的推荐休假类型"
apiId: "2539426197251555332"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Leave Type"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取当前登录用户的推荐休假类型

>  请求方式	POST | Leave Type (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/leave/levelTypeRecommendation
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
leaveType	string	否	否	休假类型名称 示例：年假
leaveBeginTime	string	否	是	请假开始时间 示例：2026-05-21 08:00:00
leaveEndTime	string	否	否	请假结束时间 示例：2026-05-21 17:30:00

## 3. 请求示例

Url: /yonbip/HCC/time/leave/levelTypeRecommendation?access_token=访问令牌
Body: {
	"leaveType": "年假",
	"leaveBeginTime": "2026-05-21 08:00:00",
	"leaveEndTime": "2026-05-21 17:30:00"
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
code	number
小数位数:0,最大长度:10	否	响应编码 示例：200
message	string	否	响应消息 示例：操作成功
data	object	是	数据
leaveSort	number
小数位数:0,最大长度:10	否	假别顺序类型 示例：0
isRecommend	number
小数位数:0,最大长度:10	否	是否推荐 示例：1
isEnough	number
小数位数:0,最大长度:10	否	是否足够 示例：1
businessData	string	否	休假类型ID 示例：2294567294315528205
name	string	否	名称 示例：加班转调休（剩余额度1124.50小时）
typeName	string	否	休假类型名称 示例：加班转调休
isSelected	number
小数位数:0,最大长度:10	否	是否选择 示例：1
isLimit	string	否	是否额度限制 示例：1
restQuota	number
小数位数:1,最大长度:10	否	可用额度 示例：1124.5
typeCode	string	否	休假类型编码 示例：10

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"leaveSort": 0,
			"isRecommend": 1,
			"isEnough": 1,
			"businessData": "2294567294315528205",
			"name": "加班转调休（剩余额度1124.50小时）",
			"typeName": "加班转调休",
			"isSelected": 1,
			"isLimit": "1",
			"restQuota": 1124.5,
			"typeCode": "10"
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
500	获取休假类型失败	检查休假类型

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

