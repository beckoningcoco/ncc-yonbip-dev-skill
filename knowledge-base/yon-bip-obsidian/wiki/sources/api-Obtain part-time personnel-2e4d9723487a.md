---
title: "获取人员兼职"
apiId: "2e4d9723487a42838af14b1aa9f94b15"
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

# 获取人员兼职

>  请求方式	GET | Employee Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/HRCloud/getStaffPartgetStaffPart
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

Url: /yonbip/hrcloud/HRCloud/getStaffPartgetStaffPart?access_token=访问令牌&ids=

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
code	string	否	返回码 示例：200
message	string	否	操作信息 示例：查询成功
data	object	是	数据
_md	string	否	元数据 示例：staff_part
begindate	long	否	开始日期 示例：1590940800000
modifier	string	否	修改人 示例：f322bb55-d693-46eb-ab4c-6868fa2c1bad
deptid	string	否	部门 示例：1678457845141760
lastflag	boolean	否	是否最新数据 示例：true
rptrel	string	否	主管 示例：1818741052379392
postid	string	否	职位 示例：1818798100877568
parttype	string	否	兼职类型 示例：4b4284d44dda492b868da13ecb41a213
trnsevent	long	否	变动事件 示例：1
jobid	string	否	职务ID 示例：1818796277780736
modifiedtime	long	否	修改时间 示例：1594905344000
tenantid	string	否	租户ID 示例：co0eyvdu
id	string	否	ID 示例：1830179608793344
staffFte	string	否	占编比例 示例：100%
showorder	long	否	展示顺序 示例：9999999
creator	string	否	创建人 示例：f322bb55-d693-46eb-ab4c-6868fa2c1bad
recordnum	long	否	记录号 示例：0
jobgradeid	string	否	职级ID 示例：1818795484008704
orgid	string	否	组织ID 示例：1678457839866112
assgid	long	否	人员任职ID 示例：2
orgrelid	string	否	组织关系 示例：56759099960c432da8ccc51daf9913a0
enddate	long	否	结束时间 示例：1596038400000
jobtypeid	string	否	职务类型ID 示例：1818793459650816
addrid	string	否	工作地点 示例：2781570734364bd9824acac7e0cc372e
ismainjob	boolean	否	是否主职 示例：false
creationtime	long	否	创建时间 示例：1594905299000
endflag	boolean	否	是否结束 示例：false
dr	long	否	逻辑删除标识 示例：0
entityFullName	string	否	对象路径 示例：com.yonyou.hrcloud.staff.model.StaffPart
entityMetaDefinedName	string	否	元数据定义 示例：staff_part
entityNameSpace	string	否	元数据命名空间 示例：hrcloud
es	long	否	es信息 示例：0
extJSON	object	否	扩展字段
staffId	string	否	人员ID 示例：1818741052379392
staff_id	string	否	人员ID 示例：1818741052379392
ts	long	否	时间戳 示例：1594905344000

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": [
		{
			"_md": "staff_part",
			"begindate": 1590940800000,
			"modifier": "f322bb55-d693-46eb-ab4c-6868fa2c1bad",
			"deptid": "1678457845141760",
			"lastflag": true,
			"rptrel": "1818741052379392",
			"postid": "1818798100877568",
			"parttype": "4b4284d44dda492b868da13ecb41a213",
			"trnsevent": 1,
			"jobid": "1818796277780736",
			"modifiedtime": 1594905344000,
			"tenantid": "co0eyvdu",
			"id": "1830179608793344",
			"staffFte": "100%",
			"showorder": 9999999,
			"creator": "f322bb55-d693-46eb-ab4c-6868fa2c1bad",
			"recordnum": 0,
			"jobgradeid": "1818795484008704",
			"orgid": "1678457839866112",
			"assgid": 2,
			"orgrelid": "56759099960c432da8ccc51daf9913a0",
			"enddate": 1596038400000,
			"jobtypeid": "1818793459650816",
			"addrid": "2781570734364bd9824acac7e0cc372e",
			"ismainjob": false,
			"creationtime": 1594905299000,
			"endflag": false,
			"dr": 0,
			"entityFullName": "com.yonyou.hrcloud.staff.model.StaffPart",
			"entityMetaDefinedName": "staff_part",
			"entityNameSpace": "hrcloud",
			"es": 0,
			"extJSON": {},
			"staffId": "1818741052379392",
			"staff_id": "1818741052379392",
			"ts": 1594905344000
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

