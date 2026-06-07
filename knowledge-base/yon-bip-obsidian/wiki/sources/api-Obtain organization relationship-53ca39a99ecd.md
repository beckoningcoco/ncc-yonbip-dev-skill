---
title: "获取组织关系"
apiId: "53ca39a99ecd49f2bfb0d4f94a92d269"
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

# 获取组织关系

>  请求方式	GET | Employee Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/HRCloud/getStaffOrgrel
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

Url: /yonbip/hrcloud/HRCloud/getStaffOrgrel?access_token=访问令牌&ids=

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
data	object	是	数据
_md	string	否	元数据 示例：staff_orgrel
creator	string	否	创建人 示例：dcdfecb6-e5f0-447d-b0cb-5d57fd53b2a9
begindate	long	否	开始日期 示例：1591027200000
modifier	string	否	最后修改人 示例：dcdfecb6-e5f0-447d-b0cb-5d57fd53b2a9
regdate	long	否	转正日期
isregular	boolean	否	转正标识 示例：false
lastflag	boolean	否	最新标志 示例：true
senioritydate	long	否	司龄开始日期 示例：1591027200000
isreturn	boolean	否	是否再聘 示例：false
recordnum	long	否	记录号 示例：0
indocflag	boolean	否	是否转入人员档案 示例：true
modifiedtime	long	否	上次修改时间 示例：1592511324000
staff_id	string	否	员工id 示例：1791723483648256
tenantid	string	否	租户id 示例：tlyq4hmy
id	string	否	主键 示例：5333e4b256974bcf8dd413143d04745d
trialResult	string	否	试用结果
delayRegdate	long	否	延长转正日期
creationtime	long	否	创建时间 示例：1592511324000
endflag	boolean	否	结束标志 示例：false
dr	long	否	删除标识 示例：0
entityFullName	string	否	全路径类名 示例：com.yonyou.hrcloud.staff.model.StaffOrgRel
entityMetaDefinedName	string	否	元数据实体aDefinedName 示例：staff_orgrel
entityNameSpace	string	否	空间 示例：hrcloud
es	long	否	标识 示例：0
staffId	string	否	员工id 示例：1791723483648256
seniorityadj	int	否	调整司龄（月）
entrysrc	string	否	进入来源
rmchannel	string	否	招聘渠道
enddate	long	否	结束日期
ts	long	否	时间戳 示例：1592558124000

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": [
		{
			"_md": "staff_orgrel",
			"creator": "dcdfecb6-e5f0-447d-b0cb-5d57fd53b2a9",
			"begindate": 1591027200000,
			"modifier": "dcdfecb6-e5f0-447d-b0cb-5d57fd53b2a9",
			"regdate": 0,
			"isregular": false,
			"lastflag": true,
			"senioritydate": 1591027200000,
			"isreturn": false,
			"recordnum": 0,
			"indocflag": true,
			"modifiedtime": 1592511324000,
			"staff_id": "1791723483648256",
			"tenantid": "tlyq4hmy",
			"id": "5333e4b256974bcf8dd413143d04745d",
			"trialResult": "",
			"delayRegdate": 0,
			"creationtime": 1592511324000,
			"endflag": false,
			"dr": 0,
			"entityFullName": "com.yonyou.hrcloud.staff.model.StaffOrgRel",
			"entityMetaDefinedName": "staff_orgrel",
			"entityNameSpace": "hrcloud",
			"es": 0,
			"staffId": "1791723483648256",
			"seniorityadj": 0,
			"entrysrc": "",
			"rmchannel": "",
			"enddate": 0,
			"ts": 1592558124000
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
500	查询失败	

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

