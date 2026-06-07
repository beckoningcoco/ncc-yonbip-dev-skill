---
title: "根据项目编码或活动编码查询项目活动"
apiId: "1810617543412940805"
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

# 根据项目编码或活动编码查询项目活动

>  请求方式	POST | Project Activity (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/task/queryactivitybyprojetId
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
projectId	string	否	否	项目ID 项目ID和编码至少录入一项，项目ID和项目编码同时存在，以项目ID为准 示例：1775011156417576968
projectCode	string	否	否	项目编码 示例：1775011156417576967
activityId	string	否	否	活动ID 活动ID和活动编码同时存在，以活动ID为准 示例：1777945074350948354
activityCode	string	否	否	活动编码 示例：RWXZ202307240016

## 3. 请求示例

Url: /yonbip/pm/task/queryactivitybyprojetId?access_token=访问令牌
Body: {
	"projectId": "1775011156417576968",
	"projectCode": "1775011156417576967",
	"activityId": "1777945074350948354",
	"activityCode": "RWXZ202307240016"
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
code	string	否	请求状态编码 示例：200
message	string	否	返回消息提示 示例：操作成功
data	object	是	返回数据
sourceId	string	否	来源id 示例：1535228792952324104
code	string	否	活动编码 示例：JDJH202209060001
modifier	string	否	修改人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574
orgId	string	否	组织id 示例：1525652227072458756
dr	long	否	删除标识 示例：0
actualTime	int	否	实际工期 示例：1
modifyTime	DateTime	否	修改时间 示例：2022-12-01 17:39:38
actualStartDate	Date	否	实际开始日期 示例：2022-09-06 00:00:00
responsibleId	string	否	责任人 示例：1582840532659339267
createrId	string	否	创建人 示例：1530682312368324613
id	long	否	主键ID 示例：1535228801528102917
completionRatio	long	否	完工比 示例：100
pubts	DateTime	否	时间戳 示例：2023-04-14 20:49:56
planEndDate	Date	否	计划结束日期 示例：2022-08-31 00:00:00
scheduleId	string	否	进度计划主表外键 示例：1535228801528102914
taskStatus	int	否	活动状态 0-未开始 1-进行中 2-已完成 示例：2
actualEndDate	Date	否	实际结束日期 示例：2022-09-06 00:00:00
isExternalPerson	boolean	否	是否外部人员 示例：false
effectFlag	boolean	否	生效标识 示例：true
scheduleItemId	string	否	wbs 示例：1535228801528102915
level	int	否	等级 示例：2
ytenant	string	否	租户 示例：0000L6YQ8AVLFUZPXD0000
milestoneFlag	string	否	是否里程碑 示例：0-否 1-是
ytenantId	string	否	租户id 示例：0000L6YQ8AVLFUZPXD0000
priority	long	否	优先级 0-低 1-中 2-高 示例：1
node	string	否	活动节点 示例：N20220831013505520344481
serial	int	否	排序 示例：2
planTime	int	否	计划工时 示例：1
taskName	string	否	活动名称 示例：高层访谈
planStartDate	Date	否	计划开始日期 示例：2022-08-31 00:00:00
projectId	string	否	项目id 示例：1535228792952324104

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"sourceId": "1535228792952324104",
			"code": "JDJH202209060001",
			"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"orgId": "1525652227072458756",
			"dr": 0,
			"actualTime": 1,
			"modifyTime": "2022-12-01 17:39:38",
			"actualStartDate": "2022-09-06 00:00:00",
			"responsibleId": "1582840532659339267",
			"createrId": "1530682312368324613",
			"id": 1535228801528102917,
			"completionRatio": 100,
			"pubts": "2023-04-14 20:49:56",
			"planEndDate": "2022-08-31 00:00:00",
			"scheduleId": "1535228801528102914",
			"taskStatus": 2,
			"actualEndDate": "2022-09-06 00:00:00",
			"isExternalPerson": false,
			"effectFlag": true,
			"scheduleItemId": "1535228801528102915",
			"level": 2,
			"ytenant": "0000L6YQ8AVLFUZPXD0000",
			"milestoneFlag": "0-否 1-是",
			"ytenantId": "0000L6YQ8AVLFUZPXD0000",
			"priority": 1,
			"node": "N20220831013505520344481",
			"serial": 2,
			"planTime": 1,
			"taskName": "高层访谈",
			"planStartDate": "2022-08-31 00:00:00",
			"projectId": "1535228792952324104"
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
1032001990001	未接收到参数	参数输入为空，请检查参数
1032001990002	项目ID和项目编码不允许同时为空	项目ID和项目编码不允许同时为空
1032001990004	未查询到项目	项目查询为空
1032001990008	项目编码不存在	请输入正确的项目编码
1032001990009	活动编码不存在	请输入正确的活动编码
1032001990099	其他错误	请联系相关开发人员
1032001990012	活动ID数据格式不正确	请输入正确的活动ID格式
1032001990014	活动ID输入位数不正确	请输入正确的活动ID
1032001990015	输入的项目编码下活动不存在	活动编码和项目编码同时输入,请检查是否对应
1032001990016	项目ID输入位数不正确	请输入正确的项目ID
1032001990017	查询活动列表为空	请检查查询参数是否正确

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

