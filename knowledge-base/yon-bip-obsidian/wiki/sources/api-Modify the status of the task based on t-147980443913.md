---
title: "根据项目id或者项目编码查询任务列表"
apiId: "1479804439137615879"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Project Activity"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Activity]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据项目id或者项目编码查询任务列表

>  请求方式	GET | Project Activity (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/task/findTasksByProjetId
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
projectId	string	query	否	项目id,与项目编码至少输入一个,当项目id存在时以项目id为准    示例: 1478752807775371271
projectCode	string	query	否	项目编码,与项目id至少存在一个    示例: 0000453
delayed	boolean	query	否	是否只看延期任务,默认为false    示例: false
responsible	boolean	query	否	是否只查询我负责的任务,默认为false    示例: false

## 3. 请求示例

Url: /yonbip/pm/task/findTasksByProjetId?access_token=访问令牌&projectId=1478752807775371271&projectCode=0000453&delayed=false&responsible=false

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
code	string	否	请求状态编码 示例：200
message	string	否	请求状态描述 示例：操作成功
data	object	是	返回数据
id	long	否	任务id 示例：2443179914449152
pubts	string	否	最终编辑时间 示例：2022-06-17 17:22:44
code	string	否	任务编码 示例：JDRW202109220014
name	string	否	任务名称 示例：测试任务
taskStatus	long	否	任务状态;0:未开始,1:进行中,2:已完成 示例：2
responsibleId	string	否	责任人id 示例：2309413107175680
milestoneFlag	string	否	里程碑标识;0:不是,1:是 示例：0
planStartDate	string	否	计划开始日期 示例：2021-09-22 00:00:00
planEndDate	string	否	计划完成日期 示例：2021-09-26 00:00:00
planTime	long	否	计划工期 示例：5
actualStartDate	string	否	实际开始日期 示例：2022-06-17 00:00:00
actualEndDate	string	否	实际完成日期 示例：2022-06-17 00:00:00
actualTime	long	否	实际工期 示例：1
projectId	string	否	项目id 示例：2316832809046272
orgId	string	否	组织id 示例：2231538707042560
serial	long	否	序号 示例：1
node	string	否	任务节点Id 示例：N202109220928009789206
stageInspectionFlag	string	否	阶段验收标识。0:非阶段验收任务，1:阶段验收任务 示例：0
priority	long	否	优先级;0:低,1:中,2:高 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 2443179914449152,
			"pubts": "2022-06-17 17:22:44",
			"code": "JDRW202109220014",
			"name": "测试任务",
			"taskStatus": 2,
			"responsibleId": "2309413107175680",
			"milestoneFlag": "0",
			"planStartDate": "2021-09-22 00:00:00",
			"planEndDate": "2021-09-26 00:00:00",
			"planTime": 5,
			"actualStartDate": "2022-06-17 00:00:00",
			"actualEndDate": "2022-06-17 00:00:00",
			"actualTime": 1,
			"projectId": "2316832809046272",
			"orgId": "2231538707042560",
			"serial": 1,
			"node": "N202109220928009789206",
			"stageInspectionFlag": "0",
			"priority": 1
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
0	未传入优惠券档案id	coupon_id值填写有误
1032001990007	项目id不能为空	请求中加入项目id
1032001990099	服务端逻辑异常	咨询开发人员
1032001990004	未查询到项目	未查询到项目,请检查项目输入信息是否正确
1032001990005	未指定项目进度模型,请先到项目中心变更	请先到项目中心变更项目模型
1032001990013	项目id和编码不能同时为空	至少输入项目id或者编码中的一个
1032001990012	当前输入的项目为里程碑类型,无法进行修改.仅可修改wbs型和清单任务型的项目下的任务	更换wbs类型或清单任务型项目查询

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

