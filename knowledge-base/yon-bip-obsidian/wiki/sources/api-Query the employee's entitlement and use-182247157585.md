---
title: "查询员工所有休假类型的享有额度和已休额度"
apiId: "1822471575852023814"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Leave Quota"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Leave Quota]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询员工所有休假类型的享有额度和已休额度

>  请求方式	GET | Leave Quota (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/leave/queryallbalance
请求方式	GET
ContentType	
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
year	string	query	否	年份    示例: 2023
month	string	query	否	月份    示例: 9

## 3. 请求示例

Url: /yonbip/hrcloud/time/leave/queryallbalance?access_token=访问令牌&userId=001&staffId=001&staffCode=001&year=2023&month=9

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
staffid	string	否	员工id 示例：2079349291340032
year	string	否	年度 示例：2023
month	string	否	月份 示例：9
leavetype	string	否	休假类别 示例：年假
leavetypeid	string	否	休假类别Id 示例：111
totalquota	string	否	享有额度 示例：5天
totalusedquota	string	否	已休合计 示例：2.5天
totalinitquota	string	否	初始已休合计 示例：0天
totalrestquota	string	否	剩余可休额度合计 示例：2.5天

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"staffid": "2079349291340032",
			"year": "2023",
			"month": "9",
			"leavetype": "年假",
			"leavetypeid": "111",
			"totalquota": "5天",
			"totalusedquota": "2.5天",
			"totalinitquota": "0天",
			"totalrestquota": "2.5天"
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
401	该用户无可用的休假类型！	在时间管理中配置用户适用的休假类型

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-01	
更新
请求说明
新增
返回参数 leavetypeid
更新
返回参数 totalusedquota
	2	2025-06-25	
新增
返回参数 totalinitquota
新增
返回参数 totalrestquota

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

