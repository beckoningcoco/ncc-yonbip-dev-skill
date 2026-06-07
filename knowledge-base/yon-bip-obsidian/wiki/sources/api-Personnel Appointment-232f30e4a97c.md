---
title: "写入人员任职"
apiId: "232f30e4a97c4c6a8bae0371e4bb9dce"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Information"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 写入人员任职

>  请求方式	POST | Employee Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/HRCloud/writeStaffjobSubSet
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
staffId	string	否	是	员工ID 示例：人员ID
subSetCode	string	否	是	员工子集code 示例：staff_job 默认值：staff_job
dataJson	object	否	是	人员任职
addrid	string	否	否	地点 示例：d9d363aa8ecd4e5d8f8c9959f2d52279
assgid	long	否	否	顺序号，从1开始，1为主职 ，2以上为兼职，兼职变更，assgid不变 示例：1
begindate	long	否	是	任职开始日期 示例：1593532800000
bmlocation	string	否	否	社保缴纳地 示例：d9d363aa8ecd4e5d8f8c9959f2d52279
deptid	string	否	是	部门id 示例：1821309884322048
dr	long	否	否	逻辑删除标识，0未删除，1已删除 示例：0
endflag	boolean	否	否	结束标识 示例：false
extJSON	object	否	否	扩展字段
extension	string	否	否	扩展字段 示例：{}
isSubEntity	boolean	否	否	是否子集 示例：true
ismainjob	boolean	否	否	是否主职 示例：true
jobgradeid	string	否	否	职级 示例：3d017ce66dd14ad8909997923f212c36
jobid	string	否	否	职务 示例：80f830d1ae894748b7d0dc4e85808a0d
jobrankid	string	否	否	职等 示例：46c63984d63b4215a8f07e6b2b7b8f81
jobtypeid	string	否	否	职务类别 示例：160307c206364259988b4ae62572061b
lastflag	boolean	否	否	最新标识 示例：true
memo	string	否	否	备注 示例：123
orgid	string	否	是	组织id 示例：1775733611008256
orgrelid	string	否	否	组织关系id 示例：4e6c54f46a704fb7860fe600e11b39e9
oribillid	string	否	否	来源单据主键 示例：449a727e81ab428191a371069f84b122
oribilltype	string	否	否	来源单据类型 示例：010101
psnclid	string	否	否	人员类别 示例：52637ad7574340d783dbba6cbe7f112a
recordnum	long	否	否	记录序号 示例：0
rptrel	string	否	否	主管 示例：1791648673616133
scope	string	否	否	上下文 示例：tlyq4hmy
showorder	long	否	否	查询默认序号 示例：1
staffFte	string	否	否	FTE 示例：100%
tenantId	string	否	否	租户id 示例：tlyq4hmy
tenantid	string	否	否	租户id 示例：tlyq4hmy
trnsevent	long	否	是	变动事件，1入职2转正3调动4离职 示例：1
trnstype	string	否	是	变动类型 示例：tlyq4hmy0000000000001
ts	long	否	否	时间戳 示例：1617774435000
wastruct	string	否	否	薪资结构 示例：1
ytenantId	string	否	否	友互通租户id 示例：tlyq4hmy

## 3. 请求示例

Url: /yonbip/hrcloud/HRCloud/writeStaffjobSubSet?access_token=访问令牌
Body: {
	"staffId": "人员ID",
	"subSetCode": "staff_job",
	"dataJson": {
		"addrid": "d9d363aa8ecd4e5d8f8c9959f2d52279",
		"assgid": 1,
		"begindate": 1593532800000,
		"bmlocation": "d9d363aa8ecd4e5d8f8c9959f2d52279",
		"deptid": "1821309884322048",
		"dr": 0,
		"endflag": false,
		"extJSON": {},
		"extension": "{}",
		"isSubEntity": true,
		"ismainjob": true,
		"jobgradeid": "3d017ce66dd14ad8909997923f212c36",
		"jobid": "80f830d1ae894748b7d0dc4e85808a0d",
		"jobrankid": "46c63984d63b4215a8f07e6b2b7b8f81",
		"jobtypeid": "160307c206364259988b4ae62572061b",
		"lastflag": true,
		"memo": "123",
		"orgid": "1775733611008256",
		"orgrelid": "4e6c54f46a704fb7860fe600e11b39e9",
		"oribillid": "449a727e81ab428191a371069f84b122",
		"oribilltype": "010101",
		"psnclid": "52637ad7574340d783dbba6cbe7f112a",
		"recordnum": 0,
		"rptrel": "1791648673616133",
		"scope": "tlyq4hmy",
		"showorder": 1,
		"staffFte": "100%",
		"tenantId": "tlyq4hmy",
		"tenantid": "tlyq4hmy",
		"trnsevent": 1,
		"trnstype": "tlyq4hmy0000000000001",
		"ts": 1617774435000,
		"wastruct": "1",
		"ytenantId": "tlyq4hmy"
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
code	long	否	编码 示例：200
data	string	否	数据 示例：{}
message	string	否	执行后的返回信息 示例：保存子集数据成功

## 5. 正确返回示例

{
	"code": 200,
	"data": "{}",
	"message": "保存子集数据成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
500	同步失败	

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

