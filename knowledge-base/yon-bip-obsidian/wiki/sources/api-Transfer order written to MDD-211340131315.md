---
title: "转单写入MDD"
apiId: "2113401313155874824"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Checklist Processing"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Checklist Processing]
platform_version: "BIP"
source_type: community-api-docs
---

# 转单写入MDD

>  请求方式	POST | Checklist Processing (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/staff/handover/createHandover
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
TransferDTO	object	否	是	数据结构体
id	string	否	是	主单据id 示例：134982123
staffId	string	否	是	员工id 示例：2308394853060864
code	string	否	否	员工编码 示例：000000000000000000000067
name	string	否	否	人员姓名 示例：张三
workaddr	string	否	否	工作地点 示例：1939753259860230152
psnclid	string	否	否	人员类别 示例：2295649757057536
orgid	string	否	是	组织id 示例：2295650139787520
localOrgId	string	否	否	人力管理组织id 示例：2295649757057536
deptid	string	否	否	部门id 示例：2295650139787520
handovertype	string	否	是	交易类型 示例：2305736239681792
majorcorpid	string	否	否	合同主体 示例：2296988978566144
businessdate	date
格式:yyyy-MM-dd	否	否	业务日期 示例：2024-10-10
businesstype	string	否	是	业务类型 1-录用,2-离职,3-调动,4-入职,5-转正,6-其他任职 示例：1
frontTask	string	否	否	前置任务 示例：2302465445320192
frontTaskName	string	否	否	前置任务名称 示例：还电脑
itemType	string	否	否	交接项单据类型 示例：2
type	string	否	否	转单类型 0-转入 1-转出 示例：1
entryDirector	string	否	否	主管 示例：2402165445330992
candidateFlag	string	否	是	是否候选人 0-否，1-是 示例：0
postId	string	否	否	岗位 示例：024654453
jobId	string	否	否	职务 示例：5445320192
empform	string	否	否	用工形式 示例：2555194553618689
currentBusiAction	string	否	否	当前触发业务动作 示例：3001

## 3. 请求示例

Url: /yonbip/hrcloud/staff/handover/createHandover?access_token=访问令牌
Body: {
	"TransferDTO": {
		"id": "134982123",
		"staffId": "2308394853060864",
		"code": "000000000000000000000067",
		"name": "张三",
		"workaddr": "1939753259860230152",
		"psnclid": "2295649757057536",
		"orgid": "2295650139787520",
		"localOrgId": "2295649757057536",
		"deptid": "2295650139787520",
		"handovertype": "2305736239681792",
		"majorcorpid": "2296988978566144",
		"businessdate": "2024-10-10",
		"businesstype": "1",
		"frontTask": "2302465445320192",
		"frontTaskName": "还电脑",
		"itemType": "2",
		"type": "1",
		"entryDirector": "2402165445330992",
		"candidateFlag": "0",
		"postId": "024654453",
		"jobId": "5445320192",
		"empform": "2555194553618689",
		"currentBusiAction": "3001"
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
code	string	否	响应参数 示例：200
message	string	否	整体响应信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	后台逻辑异常	联系管理员

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

