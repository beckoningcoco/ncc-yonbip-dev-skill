---
title: "查询员工一段时间内的外出情况"
apiId: "2225587722866655237"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Out-of-Office Application Document"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Out-of-Office Application Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询员工一段时间内的外出情况

>  请求方式	GET | Out-of-Office Application Document (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/outTrip/queryallouttrip
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
userId	string	query	否	用户userId（staffId、staffCode、userId三选一必填，有staffId时优先使用staffId，没有staffId时优先使用staffCode，如果staffId和staffCode都没有，则使用userId）    示例: 001
staffId	string	query	否	员工id（staffId、staffCode、userId三选一必填，有staffId时优先使用staffId，没有staffId时优先使用staffCode，如果staffId和staffCode都没有，则使用userId）    示例: 001
staffCode	string	query	否	员工code（staffId、staffCode、userId三选一必填，有staffId时优先使用staffId，没有staffId时优先使用staffCode，如果staffId和staffCode都没有，则使用userId）    示例: 001
beginDate	string	query	是	开始时间    示例: 2023-09-01
endDate	string	query	是	结束时间    示例: 2023-09-30
approveStatus	string	query	否	单据审批状态（0表示仅展示审批通过的外出单，传1或者不传时，展示审批中以及审批通过的外出单）    示例: 0
adjusting	string	query	否	是否过滤调整中的单据，传0时调整中的单据不返回    示例: 0

## 3. 请求示例

Url: /yonbip/hrcloud/time/outTrip/queryallouttrip?access_token=访问令牌&userId=001&staffId=001&staffCode=001&beginDate=2023-09-01&endDate=2023-09-30&approveStatus=0&adjusting=0

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
code	string	否	返回信息码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	是	信息集
id	string	否	单据id 示例：2074716998002540550
staffid	string	否	员工id 示例：2079349291340032
outtype	string	否	外出类型 示例：外地外出
outdays	string	否	外出时长 示例：5天
remark	string	否	外出原因 示例：拜访客户
outbegintime	string	否	外出开始时间 示例：2023-09-01 09:00:00
outendtime	string	否	外出结束时间 示例：2023-09-05 17:00:00
startDayType	string	否	外出开始时间上下午标识，1表示上午，2表示下午 示例：1
endDayType	string	否	外出结束时间上下午标识，1表示上午，2表示下午 示例：2
showbegindate	string	否	外出开始时间，供前端展示使用。整天外出时，返回年月日格式；上下午外出时，返回“年月日+上午下午”格式；小时外出时，返回年月日时分秒格式 示例：2023-09-01 上午
showenddate	string	否	外出结束时间，供前端展示使用。整天外出时，返回年月日格式；上下午外出时，返回“年月日+上午下午”格式；小时外出时，返回年月日时分秒格式 示例：2023-09-01 下午
destination	string	否	外出地点 示例：上海
approveStatus	string	否	外出单审批状态，1表示未提交，3表示审核中，4表示审核通过，10表示已撤回，12表示已驳回，13表示终止 示例：4
revokeApproveStatus	string	否	外出调整单审批状态，1表示未提交，3表示审核中，4表示审核通过，10表示已撤回，12表示已驳回，13表示终止 示例：4

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "2074716998002540550",
			"staffid": "2079349291340032",
			"outtype": "外地外出",
			"outdays": "5天",
			"remark": "拜访客户",
			"outbegintime": "2023-09-01 09:00:00",
			"outendtime": "2023-09-05 17:00:00",
			"startDayType": "1",
			"endDayType": "2",
			"showbegindate": "2023-09-01 上午",
			"showenddate": "2023-09-01 下午",
			"destination": "上海",
			"approveStatus": "4",
			"revokeApproveStatus": "4"
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
401	参数JSON中缺少beginDate！	需要传递外出开始时间

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
新增
返回参数 outTripApplyDefine

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

