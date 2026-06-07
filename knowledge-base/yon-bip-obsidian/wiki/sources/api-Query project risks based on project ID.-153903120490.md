---
title: "根据项目ID查询项目风险"
apiId: "1539031204907974661"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Risk Record"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Risk Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据项目ID查询项目风险

>  请求方式	POST | Project Risk Record (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/project/findRiskByProjectId
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
projectId	string	否	否	项目ID，项目ID和编码至少录入一项，项目ID和项目编码同时存在，以项目ID为准 示例：2489863446238208
projectCode	string	否	否	项目编码 示例：00000028

## 3. 请求示例

Url: /yonbip/pm/project/findRiskByProjectId?access_token=访问令牌
Body: {
	"projectId": "2489863446238208",
	"projectCode": "00000028"
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
message	string	否	请求状态描述 示例：操作成功
data	object	是	返回数据
promotePlan	string	否	推动计划 示例：让国人
riskSolverStaffId	string	否	风险应对负责人ID（员工档案ID） 示例：2481054125576448
verifystate	short	否	审批状态（初始开立：0，审批中：1，审批完成：2，不通过流程终止：3，驳回到制单：4） 示例：2
riskFinishDate	Date	否	风险预计解决日期 示例：2022-07-09 00:00:00
riskSolveDesc	string	否	风险应对策略 示例：人工费
billTypeCode	string	否	单据类型编码 示例：PMC8001
progressState	string	否	进度说明 示例：拖后腿
code	string	否	单据编码 示例：FXJL202207090007
riskLevel	short	否	风险等级（高：0，中：1，低：2） 示例：0
riskStartDate	Date	否	风险提出日期 示例：2022-07-09 00:00:00
solveFlag	boolean	否	风险是否解决 示例：true
memo	string	否	备注 示例：123
description	string	否	说明 示例：个体融合
transiTypeId	string	否	交易类型 示例：1475267106810888193
orgId	string	否	立项企业ID (业务单元ID) 示例：2469709537334528
dr	short	否	逻辑删除标记（0：未删除，1：已删除） 示例：0
modifyTime	DateTime	否	修改时间 示例：2022-07-12 10:28:02
transiTypeCode	string	否	交易类型编码 示例：PMC8001-01
collaborators	string	否	协作人ID（员工档案ID） 示例：1462550765102956545
id	long	否	主键ID 示例：1496011266271477769
pubts	DateTime	否	时间戳 示例：2022-08-03 17:27:00
processingPeriod	int	否	执行周期 示例：4
riskIndexName	string	否	风险指标名称 示例：我问问2
billTypeId	string	否	单据类型 示例：1475265612185337861
riskIndexId	long	否	风险指标 示例：1478755178597318660
creator	string	否	创建人 示例：e2257f99-2f1f-4203-8585-30e42fabf6a7
isWfControlled	boolean	否	是否受审批流控制 示例：false
ytenant	string	否	租户ID 示例：0000KUM991V7BR516C0000
exchangedFlag	boolean	否	是否退换货 示例：true
estimateSolveDate	Date	否	预计解决日期 示例：2022-07-11 00:00:00
passFlag	boolean	否	是否通过 示例：true
riskClosedDate	Date	否	风险关闭日期 示例：2022-07-12 00:00:00
riskDesc	string	否	风险描述 示例：咕咕咕咕咕
createTime	DateTime	否	创建时间 示例：2022-07-09 17:23:53
riskTypeId	long	否	风险类型 示例：1477211825058086912
riskStatus	short	否	风险状态（待上报：0，待处理：1，待确认：2，已关闭：3） 示例：3
projectId	string	否	项目 示例：2489863446238208
status	short	否	单据状态（开立：0，已审核：1，已关闭：2，审核中：3，锁定：4） 示例：1
riskReportDate	Date	否	风险上报日期 示例：2022-07-09 00:00:00
orgName	string	否	立项企业名称 (业务单元名称) 示例：用友网络科技股份有限公司
orgCode	string	否	立项企业Code (业务单元Code) 示例：10
projectCode	string	否	项目档案编码 示例：00000028
projectName	string	否	项目档案名称 示例：10086
riskSolverStaffName	string	否	风险应对负责人名称（员工档案名称） 示例：高璐
collaboratorsName	string	否	协作人名称（员工档案名称） 示例：诸葛亮
defines	object	否	风险自定义项

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"promotePlan": "让国人",
			"riskSolverStaffId": "2481054125576448",
			"verifystate": 2,
			"riskFinishDate": "2022-07-09 00:00:00",
			"riskSolveDesc": "人工费",
			"billTypeCode": "PMC8001",
			"progressState": "拖后腿",
			"code": "FXJL202207090007",
			"riskLevel": 0,
			"riskStartDate": "2022-07-09 00:00:00",
			"solveFlag": true,
			"memo": "123",
			"description": "个体融合",
			"transiTypeId": "1475267106810888193",
			"orgId": "2469709537334528",
			"dr": 0,
			"modifyTime": "2022-07-12 10:28:02",
			"transiTypeCode": "PMC8001-01",
			"collaborators": "1462550765102956545",
			"id": 1496011266271477769,
			"pubts": "2022-08-03 17:27:00",
			"processingPeriod": 4,
			"riskIndexName": "我问问2",
			"billTypeId": "1475265612185337861",
			"riskIndexId": 1478755178597318660,
			"creator": "e2257f99-2f1f-4203-8585-30e42fabf6a7",
			"isWfControlled": false,
			"ytenant": "0000KUM991V7BR516C0000",
			"exchangedFlag": true,
			"estimateSolveDate": "2022-07-11 00:00:00",
			"passFlag": true,
			"riskClosedDate": "2022-07-12 00:00:00",
			"riskDesc": "咕咕咕咕咕",
			"createTime": "2022-07-09 17:23:53",
			"riskTypeId": 1477211825058086912,
			"riskStatus": 3,
			"projectId": "2489863446238208",
			"status": 1,
			"riskReportDate": "2022-07-09 00:00:00",
			"orgName": "用友网络科技股份有限公司",
			"orgCode": "10",
			"projectCode": "00000028",
			"projectName": "10086",
			"riskSolverStaffName": "高璐",
			"collaboratorsName": "诸葛亮",
			"defines": {
				"define1": "",
				"define2": ""
			}
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
1032001990099	其他异常	稍后重试
1032001990001	未接收到参数	检查是否填写了参数
1032001990002	项目ID和项目编码不允许同时为空	检查是否输入了项目ID或项目编码
1032001990003	未查询到项目	检查是否输入了有效的项目ID或项目编码

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

