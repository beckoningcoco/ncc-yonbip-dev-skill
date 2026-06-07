---
title: "根据任务id修改任务的状态"
apiId: "1811339458675998727"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Activity"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Activity]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据任务id修改任务的状态

>  请求方式	POST | Project Activity (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/task/taskExecute
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
taskId	long	否	是	任务id 示例：2443179914449152
pubts	string	否	是	任务最终修改时间,与任务最新的pubts时间相等 示例：2022-06-17 17:21:58
projectId	string	否	否	项目id,与项目编码至少输入一个,若同时输入,以id为准 示例：2316832809046272
projectCode	string	否	否	项目编码,与项目id至少同时输入一个 示例：00000453

## 3. 请求示例

Url: /yonbip/pm/task/taskExecute?access_token=访问令牌
Body: {
	"taskId": 2443179914449152,
	"pubts": "2022-06-17 17:21:58",
	"projectId": "2316832809046272",
	"projectCode": "00000453"
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
code	string	否	请求状态码 示例：200
message	string	否	请求状态信息 示例：操作成功
data	string	否	返回请求结果，成功时为“更新状态成功”，请求错误时不返回该参数 示例：更新状态成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "更新状态成功"
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
1032001990006	任务id不能为空	请求中加入任务id参数
1032001990007	项目id不能为空	请求中加入项目id参数
1032001990008	参数pubts不允许为空	请求中加入pubts参数
1032001990009	错误的任务id,未查询到可操作的任务	检查任务id是否存在后再试
1032001990005	未指定项目进度模型,请先到项目中心变更	先到项目中心节点指定项目的模型参数
1032001990015	任务状态已经完成,无法继续变更.	任务已经完成,无需继续变更
1032001990004	未查询到项目	检查输入的项目id是否正确
1032001990011	输入了错误的时间参数	检查pubts参数是否正确
1032001990012	当前输入的项目为里程碑类型,无法进行修改.仅可修改wbs型和清单任务型的项目下的任务	修改成清单任务型项目或wbs型项目
1032001990013	项目id和编码不能同时为空	至少输入一个项目id或者编码
1032001990010	当前单据不是最新状态，请刷新重试。	重新确认pubts时间后重试
1032001990016	当前单据已经完成,因为存在阶段验收,将在阶段验收通过后自动完成.	可在阶段验收节点完成任务,验收之后状态自动变为完成
1001001000003	当前任务的成果物:还未上传,不允许完成,请检查	请在完成填报成果物后再完成

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
更新
请求参数 taskId
更新
请求参数 pubts
更新
请求参数 projectId
更新
返回参数 code
更新
返回参数 message
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

