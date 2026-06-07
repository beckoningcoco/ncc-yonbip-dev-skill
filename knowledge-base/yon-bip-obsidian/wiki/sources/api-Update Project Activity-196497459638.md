---
title: "更新项目活动"
apiId: "1964974596382261251"
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

# 更新项目活动

>  请求方式	POST | Project Activity (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/task/updateActivity
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
data	object	否	是	更新数据
projectId	string	否	否	项目ID(项目ID和编码至少录入一项，项目ID和项目编码同时存在，以项目ID为准) 示例：1534383079529381889
projectCode	string	否	否	项目编码 示例：1534383070939447300
activityId	string	否	否	活动ID(活动ID和活动编码至少输入一项，活动ID和活动编码同时存在，以活动ID为准) 示例：1969308347064647680
activityCode	string	否	否	活动编码 示例：gzhzkl001
wbsId	string	否	否	所属wbsId(所属wbsId和所属wbsCode同时存在，以所属wbsId为准) 示例：1534383079529381889
wbsCode	string	否	否	所属wbsCode 示例：1534383070939447300
activityName	string	否	否	活动名称 示例：项目活动更新
activityUpdateCode	string	否	否	项目活动编码(更新后的编码) 示例：gzhzkl002
milestoneFlag	number
小数位数:0,最大长度:10	否	否	里程碑标识，1代表是，0代表否 示例：1
planStartDate	date
格式:yyyy-MM-dd	否	否	计划开始日期 示例：2022-01-01
planEndDate	date
格式:yyyy-MM-dd	否	否	计划完成日期 示例：2022-01-01
actualStartDate	date
格式:yyyy-MM-dd	否	否	实际开始日期 示例：2024-01-01
actualEndDate	date
格式:yyyy-MM-dd	否	否	实际完成日期 示例：2024-01-01
planTime	number
小数位数:0,最大长度:10	否	否	计划工期(单位:天,计算公式为:计划结束日期-计划开始日期+1；若计划开始、计划结束、工期三者全填写，则关系一定要填写对，否则后端会用计划结束-计划开始+1来得到工期)；若只填写其中两个，会根据计算公式计算出另外一个；若只填写一个，其他两个不会联动计算得出 示例：10
actualTime	number
小数位数:0,最大长度:10	否	否	实际工期(单位:天,计算公式为:实际结束日期-实际开始日期+1；若实际开始、实际结束、实际工期三者全填写，则关系一定要填写对，否则后端会用实际结束-实际开始+1来得到实际工期)；若只填写其中两个，会根据计算公式计算出另外一个；若只填写一个，其他两个不会联动计算得出 示例：10
completionRatio	number
小数位数:0,最大长度:10	否	否	完成比 示例：10
responsibleId	string	否	否	责任人ID 示例：1530682312368324613
responsibleCode	string	否	否	责任人编码 示例：qq001
departmentId	string	否	否	责任部门ID 示例：1660017847957979142
departmentCode	string	否	否	责任部门编码 示例：xmy01

## 3. 请求示例

Url: /yonbip/pm/task/updateActivity?access_token=访问令牌
Body: {
	"data": {
		"projectId": "1534383079529381889",
		"projectCode": "1534383070939447300",
		"activityId": "1969308347064647680",
		"activityCode": "gzhzkl001",
		"wbsId": "1534383079529381889",
		"wbsCode": "1534383070939447300",
		"activityName": "项目活动更新",
		"activityUpdateCode": "gzhzkl002",
		"milestoneFlag": 1,
		"planStartDate": "2022-01-01",
		"planEndDate": "2022-01-01",
		"actualStartDate": "2024-01-01",
		"actualEndDate": "2024-01-01",
		"planTime": 10,
		"actualTime": 10,
		"completionRatio": 10,
		"responsibleId": "1530682312368324613",
		"responsibleCode": "qq001",
		"departmentId": "1660017847957979142",
		"departmentCode": "xmy01"
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
code	string	否	请求响应编码 示例：200
message	string	否	请求响应信息 示例：操作成功
data	string	否	返回数据 示例：项目活动更新成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "项目活动更新成功"
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
1032001990001	未接收到参数	传入的参数为空
1032001990002	项目ID和项目编码不允许同时为空	项目ID和项目编码至少输入一项
1032001990003	活动ID和活动编码不允许同时为空	活动ID和活动编码至少输入一项
1032001990004	未查询到项目	根据项目ID未查询到对应的项目
1032001990008	项目编码不存在	根据项目编码未找到对应的项目
1032001990009	活动编码不存在	根据活动编码未找到对应的活动
1032001990014	未找到符合条件的数据	根据传入的条件，没有找到对应的活动
1032001990015	所属wbsId错误	传入的wbsId在该项目下找不到对应的数据
1032001990016	所属wbsCode错误	传入的wbsCode在该项目下找不到对应的数据
1032001990018	项目活动未生效，不能通过openApi进行更新	不能更新未生效的项目活动
1032001990017	完工比的输入范围应该在[0,100]	完工比范围不正确
1032001990099	其他报错信息	其他错误信息，联系接口负责人排查
1032001990010	项目id为:XX,项目编码为XX的项目责任部门id为XX错误	责任部门ID错误
1032001990011	项目id为XX,项目编码为XX的项目责人id为XX错误	责任人ID错误
1032001990030	项目id为:XX,项目编码为XX的项目责任部门编码为XX错误	责任部门编码错误
1032001990013	项目id为,项目编码为XX的项目责人编码为XX错误	责任人编码错误
1032001990019	项目活动的名称不能超过200个字符	项目活动名称过长
1032001990020	项目活动的编码不能超过50个字符	项目活动编码过长
1032001990021	计划开始日期不能晚于计划完成日期	计划开始日期不能晚于计划完成日期
1032001990022	实际开始日期不能晚于实际完成日期	实际开始日期不能晚于实际完成日期
1032001990023	计划工期不能为小于1	计划工期应该大于等于1
1032001990024	实际工期不能为小于1	实际工期应该大于等于1
1032001990025	责任部门不在所属组织下	责任部门应该在所属组织下
1032001990026	里程碑标识的枚举值只能是0或1	枚举值不合法，只能是0或者1
1032001990012	活动ID数据格式不正确	活动ID的格式错误
1032001990031	项目活动已经完成，不能通过openApi进行更新	已经完成的项目活动不能通过接口更新
1032001990032	项目活动正在审批中，不能通过openApi进行更新	审批中的项目活动不能通过接口更新
1032001990033	更新特征时应该传入特征id	更新特征没有传入特征id
1032001990034	更新的特征id值错误	更新特征穿日的id的值是错误的
1032001990035	原先该活动中没有特征，新增的特征无需传入特征id	没有特征无需传入特征值

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

