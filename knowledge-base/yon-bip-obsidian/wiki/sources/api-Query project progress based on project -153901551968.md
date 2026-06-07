---
title: "进度计划批量保存"
apiId: "1539015519687409666"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Schedule"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Schedule]
platform_version: "BIP"
source_type: community-api-docs
---

# 进度计划批量保存

>  请求方式	POST | Schedule (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/project/schedule/batch/save
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
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	计划编制ID 更新时，计划编制ID和计划编制编码至少录入一项，ID和编码同时存在，以计划编制ID为准 示例：202962322571345345
code	string	否	否	计划编制编码 不支持修改计划编制编码 示例：138001
projectId	string	否	否	项目ID，项目ID和编码至少录入一项，项目ID和项目编码同时存在，以项目ID为准。更新时无法更新项目ID和编码 示例：2029623225713426438
projectCode	string	否	否	项目编码 更新时无法更新项目ID和编码 示例：1-671003B-
status	string	否	否	单据状态 根据需要传入 新增:Insert 修改:Update，默认 Insert 示例：Insert 默认值：Insert
autoSubmit	boolean	否	否	true时保存后自动提交 示例：false
billMakeCode	string	否	否	新增时传入，来源为员工编码
itemParamOpenApiDtoList	object	是	是	明细 最大支持5000条

## 3. 请求示例

Url: /yonbip/pm/project/schedule/batch/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "202962322571345345",
		"code": "138001",
		"projectId": "2029623225713426438",
		"projectCode": "1-671003B-",
		"status": "Insert",
		"autoSubmit": false,
		"billMakeCode": "",
		"itemParamOpenApiDtoList": [
			{
				"id": "541344545352133",
				"code": "JDJH202208300001",
				"name": "测试",
				"departmentId": "2712090677973248",
				"departmentCode": "00123",
				"responsibleId": "41760979200480256",
				"responsibleCode": "00000192",
				"planStartDate": "2024-07-02 00:00:00",
				"planTime": 1,
				"wbsType": "1",
				"stageInspectionFlag": "",
				"remark": "测试",
				"parent": "1",
				"level": 1,
				"serial": 2000,
				"milestoneFlag": "0",
				"priority": 0,
				"costAccountingFlag": true,
				"costAccountingStartDate": "2026-06-07 13:26:00",
				"bustypeCode": "PMC5004-01",
				"wbsBudgetFlag": false,
				"relations": [
					{
						"relation": "FS",
						"preNode": "RWXZ202406250011",
						"postNode": "RWXZ202406260001",
						"lag": 0
					}
				],
				"status": "Insert"
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
code	number
小数位数:0,最大长度:10	否	请求响应编码 示例：200
message	string	否	响应信息 示例：操作成功
data	string	否	返回数据 示例：{ "code": "200", "message": "操作成功", "data": { "sourceId": "2300331569992695818", "busiObj": "prjc_project_schedule_card", "verifystate": 0, "billTypeCode": "PMC5002", "code": "2300331569992695817", "projectScheduleItems": [ { "verify

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": "{  \"code\": \"200\",  \"message\": \"操作成功\",  \"data\": {   \"sourceId\": \"2300331569992695818\",   \"busiObj\": \"prjc_project_schedule_card\",   \"verifystate\": 0,   \"billTypeCode\": \"PMC5002\",   \"code\": \"2300331569992695817\",   \"projectScheduleItems\": [    {     \"verify"
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
1032001990023	当前计划下无生效计划项	根据项目查询生效计划为空
1032001990024	编码不存在，请重新输入	输入的编码在当前计划下不存在
1032001990025	状态为空或者状态值不对, 生效后的计划项状态为Delete	计划生效后操作计划项，状态为Delete
1032001990026	树结构中间不允许删除	删除计划项不能断层删除
1032001990002	项目ID和项目编码不允许同时为空	项目ID和项目编码不允许同时为空
1032001990003	未查询到项目	查询项目为空
1032001990004	传入计划项目为空	明细传入为空
1032001990005	超出最大计划条数，请调整	最大输入条数5000
1032001990006	部门ID查询为空, 请输入正确部门ID	责任部门ID输入错误
1032001990007	责任人ID查询为空, 请输入正确责任人ID	责任人ID输入错误
1032001990008	项目编码翻译出错，请检查是否存在	项目编码输入错误
1032001990009	责任部门编码查询为空，请重新输入	责任部门编码输入错误
1032001990010	责任人编码查询为空，请重新输入	责任人编码输入错误
1032001990011	项目下已存在计划，不允许新增	计划已存在
1032001990012	项目下根节点WBS档案不存在	项目下缺少根节点wbs档案
1032001990099	其他错误	请联系开发人员
1032001990013	名称超出最大长度范围, 请修改	名称字段超长
1032001990014	编码字段超出最大长度范围, 请修改	编码字段长度超长
1032001990016	注字段超出最大长度范围, 请修改	备注字段长度超长
1032001990017	层级大于1, 必须指定父级, parent传入父级的编码	传入父级编码
1032001990018	层级大于1, 必须指定编码	层级大于1，编码必填
1032001990019	活动参与人时间超出时间范围	参与人中计划开始开始与结束日期不在活动计划开始和结束日期内
1032001990020	前置活动编码有值，前置活动关系和间隔日期不能为空	前置活动编码有值，前置活动关系和间隔日期必输
1001001000003	以下节点逻辑关系存在环	前后置关系存在环
1032001990022	优先级输入错误	优先级不在枚举范围内

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-22	
新增
请求参数 billMakeCode
新增
请求参数 wbsBudgetFlag
更新
请求参数 (7)
更新
返回参数 data
新增字段
	2	2025-12-08	
新增
请求参数 autoSubmit
	3	2025-11-06	
更新
请求说明
新增
请求参数 id
新增
请求参数 code
新增
请求参数 id
更新
请求参数 (12)
更新id和code的字段描述
	4	2025-07-03	
新增
请求参数 status
新增
请求参数 status
更新
请求参数 code
新增
错误码 (4)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

