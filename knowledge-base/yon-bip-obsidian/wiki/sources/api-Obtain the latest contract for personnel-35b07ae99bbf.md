---
title: "获取人员最新合同"
apiId: "35b07ae99bbf4538b3ea6f0048529349"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Employee Information"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取人员最新合同

>  请求方式	GET | Employee Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/HRCloud/getStaffCtrt
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
ids	string	query	是	人员ids，支持查询多个人员已英文逗号隔开

## 3. 请求示例

Url: /yonbip/hrcloud/HRCloud/getStaffCtrt?access_token=访问令牌&ids=

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
code	string	否	状态码 示例：200
message	string	否	操作信息 示例：查询成功
data	object	是	业务数据
_md	string	否	元数据类型 示例：staff_ctrt
isreceive	boolean	否	员工领取合同标识 示例：false
begindate	long	否	合同开始日期 示例：1607702400000
modifier	string	否	最后修改人 示例：dcdfecb6-e5f0-447d-b0cb-5d57fd53b2a9
termmonth	long	否	合同期限月 示例：3
lastflag	boolean	否	最近记录标志 示例：true
majorcorpid	string	否	合同主体单位 示例：b9ef07b503874d9690dc1aa9931828f0
modifiedtime	long	否	上次修改时间 示例：1607743488000
continuetime	long	否	连续签订次数 示例：0
tenantid	string	否	租户id 示例：tlyq4hmy
conttype	long	否	业务类型 示例：1
contractnum	string	否	合同编号 示例：100002
workaddr	string	否	工作地点 示例：18cd63ee21674014a26ae2a96b0f5afc
id	string	否	人员子表主键 示例：16835d77a310439a9fc213677f07559d
staffjobid	string	否	任职记录主键 示例：1880760194355456
creator	string	否	创建人 示例：dcdfecb6-e5f0-447d-b0cb-5d57fd53b2a9
presenter	long	否	解除提出方 示例：1
recordnum	long	否	记录序号 示例：0
orgrelid	string	否	组织关系主键 示例：5333e4b256974bcf8dd413143d04745d
enddate	long	否	合同结束日期 示例：1615392000000
termtype	long	否	合同期限类型 示例：1
creationtime	long	否	创建时间 示例：1607743488000
signdate	long	否	业务发生日期 示例：1607702400000
dr	long	否	逻辑删除标识 示例：0
entityFullName	string	否	全路径类名 示例：com.yonyou.hrcloud.staff.model.StaffCtrt
entityMetaDefinedName	string	否	元数据 示例：staff_ctrt
entityNameSpace	string	否	空间 示例：hrcloud
es	long	否	标识 示例：0
extJSON	object	否	扩展字段
staffId	string	否	人员id 示例：1791723483648256
staff_id	string	否	人员id 示例：1791723483648256
ts	long	否	时间戳 示例：1607743657000

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": [
		{
			"_md": "staff_ctrt",
			"isreceive": false,
			"begindate": 1607702400000,
			"modifier": "dcdfecb6-e5f0-447d-b0cb-5d57fd53b2a9",
			"termmonth": 3,
			"lastflag": true,
			"majorcorpid": "b9ef07b503874d9690dc1aa9931828f0",
			"modifiedtime": 1607743488000,
			"continuetime": 0,
			"tenantid": "tlyq4hmy",
			"conttype": 1,
			"contractnum": "100002",
			"workaddr": "18cd63ee21674014a26ae2a96b0f5afc",
			"id": "16835d77a310439a9fc213677f07559d",
			"staffjobid": "1880760194355456",
			"creator": "dcdfecb6-e5f0-447d-b0cb-5d57fd53b2a9",
			"presenter": 1,
			"recordnum": 0,
			"orgrelid": "5333e4b256974bcf8dd413143d04745d",
			"enddate": 1615392000000,
			"termtype": 1,
			"creationtime": 1607743488000,
			"signdate": 1607702400000,
			"dr": 0,
			"entityFullName": "com.yonyou.hrcloud.staff.model.StaffCtrt",
			"entityMetaDefinedName": "staff_ctrt",
			"entityNameSpace": "hrcloud",
			"es": 0,
			"extJSON": {},
			"staffId": "1791723483648256",
			"staff_id": "1791723483648256",
			"ts": 1607743657000
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
500	操作失败	

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

