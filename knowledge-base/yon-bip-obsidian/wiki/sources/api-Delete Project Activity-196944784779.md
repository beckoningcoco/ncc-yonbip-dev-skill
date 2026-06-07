---
title: "删除项目活动"
apiId: "1969447847790641155"
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

# 删除项目活动

>  请求方式	POST | Project Activity (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/task/deleteActivity
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
projectId	string	否	否	项目ID(项目ID和编码至少录入一项，项目ID和项目编码同时存在，以项目ID为准) 示例：1534383079529381889
projectCode	string	否	否	项目编码 示例：1534383070939447300
activityId	string	否	否	活动ID(活动ID和活动编码至少录入一项,活动ID和活动编码同时存在，以活动ID为准) 示例：1969308347064647680
activityCode	string	否	否	活动编码 示例：gzhzkl001

## 3. 请求示例

Url: /yonbip/pm/task/deleteActivity?access_token=访问令牌
Body: {
	"projectId": "1534383079529381889",
	"projectCode": "1534383070939447300",
	"activityId": "1969308347064647680",
	"activityCode": "gzhzkl001"
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
code	string	否	请求响应编码 示例：200
message	string	否	请求响应信息 示例：操作成功
data	string	否	返回数据 示例：项目活动删除成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "项目活动删除成功"
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
1032001990001	未接收到参数	未传入参数
1032001990002	项目ID和项目编码不允许同时为空	项目ID和项目编码至少输入一项
1032001990004	未查询到项目	根据项目ID未查询到对应的项目
1032001990008	项目编码不存在	根据项目编码未找到对应的项目
1032001990009	活动编码不存在	根据活动编码未找到对应的活动
1032001990014	未找到符合条件的数据	根据传入的条件，没有找到对应的活动
1032001990099	其他报错信息	其他错误信息，联系接口负责人排查
1032001990003	活动ID和活动编码不允许同时为空	活动ID和活动编码至少输入一项
1032001990010	该项目活动未生效，不能删除	只能删除生效的项目活动
1032001990011	该项目活动处于进行中或者已完成，不能删除	只能删除未开始的项目活动
1032001990012	活动ID数据格式不正确	活动ID的格式不正确
1032001990020	该项目活动处于审批中，不能删除	该项目活动处于审批中，不能删除

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

