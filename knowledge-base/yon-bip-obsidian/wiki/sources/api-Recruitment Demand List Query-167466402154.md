---
title: "招聘需求列表查询"
apiId: "1674664021549645829"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Requisition"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 招聘需求列表查询

>  请求方式	POST | Job Requisition (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/staffing/list
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
pageIndex	int	否	是	页号 默认值：1
pageSize	int	否	是	每页行数 默认值：20
name	string	否	否	需求名称 示例：zhangsa
result	string	否	否	发布状态"0" 未发布 "7"已发布 "9"部分发布 "13"取消发布 示例：0
recruitOrg	string	否	否	所属组织id 示例：test0001
billstate	string	否	否	需求状态：“1”未提交，“3”审批中，“4”审批通过，“10”已撤销，“12”已驳回，“13”终止，“14”关闭 示例：1
recruitType	string	否	否	招聘类型id 示例：HRZP00001
recruitYear	string	否	否	需求年度 示例：2023

## 3. 请求示例

Url: /yonbip/hrcloud/staffing/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"name": "zhangsa",
	"result": "0",
	"recruitOrg": "test0001",
	"billstate": "1",
	"recruitType": "HRZP00001",
	"recruitYear": "2023"
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
code	string	否	编码 示例：200表示成功
message	string	否	说明 示例：操作成功
data	object	否	返回数据
pageCount	int	否	总页数 示例：4
pageSize	int	否	每行页数 示例：默认值10
recordCount	int	否	总数 示例：45
recordList	object	否	返回数据集合

## 5. 正确返回示例

{
	"code": "200表示成功",
	"message": "操作成功",
	"data": {
		"pageCount": 4,
		"pageSize": NaN,
		"recordCount": 45,
		"recordList": {
			"applicantDeptId": "1567907549936615427",
			"applicantDeptName": "夸父",
			"applicantId": "1574499740610461703",
			"applicantIdName": "songyy",
			"applicantOrgId": "1567906544927899652",
			"applicantOrgName": "天宫",
			"billstate": 4,
			"code": "JR00000133",
			"createTime": "2023-04-11 11:15:31",
			"id": "1700660419218636805",
			"isWfControlled": true,
			"name": "0411社会招聘01",
			"pubts": "2023-04-14 14:09:41",
			"recruitNum": 11,
			"recruitOrg": "1524095688065417217",
			"recruitOrgName": "业务单元00-更正",
			"recruitType": "1524017992122762050",
			"recruitTypeChange": "1524017992122762073",
			"recruitTypeName": "社会招聘",
			"recruitYear": "2019",
			"result": "0",
			"submitdate": "2023-04-11 11:15:31",
			"verifystate": 2
		}
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
500	查询失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2023-12-27	
新增
请求参数 recruitOrg
新增
请求参数 recruitType
删除
请求参数 orgId
删除
请求参数 recruitId
更新
返回参数 (30)
1

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

