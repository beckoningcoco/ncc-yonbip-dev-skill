---
title: "转正单写入MDD"
apiId: "3b21888f4b9b40bf8a5b42216d0115cc"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "End of Probation"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, End of Probation]
platform_version: "BIP"
source_type: community-api-docs
---

# 转正单写入MDD

>  请求方式	POST | End of Probation (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/staffreg/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据结构体
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	id 新增不必填,更新必填 示例：2532193789333760
chgtypeid	string	否	否	转正类型id（转正类型id和转正类型编码不能同时为空） 示例：2302934585872640
chgtypeCode	string	否	否	转正类型编码（转正类型id和转正类型编码不能同时为空） 示例：hrem_reg1
chgreasonid	string	否	否	变动原因id 示例：1939753259860230152
chgreasonCode	string	否	否	变动原因编码 示例：50
staffid	string	否	否	转正员工id（转正员工id和转正员工编码不能同时为空） 示例：2308394853060864
staffcode	string	否	否	转正员工编码（转正员工id和转正员工编码不能同时为空） 示例：000000000000000000000067
regbegindate	string	否	否	转正日期 示例：2021-06-01 00:00:00
regorgid	string	否	否	转正所属公司id 示例：2295649757057536
regorgCode	string	否	否	转正所属公司编码 示例：2295649757
regdeptid	string	否	否	转正所属部门id 示例：2295650139787520
regdeptCode	string	否	否	转正所属部门编码 示例：A1991
regpsnclid	string	否	否	转正人员类别id 示例：d831bd17811b4aeb8834169b6ecde94c
regpsnclode	string	否	否	转正人员类别编码 示例：06
regrptrel	string	否	否	转正后主管id 示例：2305736239681792
regrptrelCode	string	否	否	转正后主管编码 示例：00000012
regjobtypeid	string	否	否	转正后职务类别id 示例：35d49875e4c1426ea13b10ce8d71c3a8
regjobtypeCode	string	否	否	转正后职务类别编码 示例：30
regjobid	string	否	否	转正后职务id 示例：2296988978566144
regjobCode	string	否	否	转正后职务编码 示例：10
regpostid	string	否	否	转正后岗位id 示例：2302465445320192
regpostCode	string	否	否	转正后岗位编码 示例：06
regjobpostid	string	否	否	转正后职位id 示例：2402165445330992
regjobpostCode	string	否	否	转正后职位编码 示例：18
regjobgradeid	string	否	否	转正后职级iid 示例：5445320192
regjobgradeCode	string	否	否	转正后职级编码 示例：职位1
regjobrankid	string	否	否	转正后职等id 示例：024654453
regjobrankidCode	string	否	否	转正后职等编码 示例：职等3
memo	string	否	否	工作总结 示例：1423423
formalwage	number
小数位数:0,最大长度:10	否	否	转正工资 示例：10000
probationwage	number
小数位数:0,最大长度:10	否	否	试用期工资 示例：8000
bJobWeaken	boolean	否	否	档案关系弱化字段 ， true 是，false否，当字段为false时，岗职位/职务/职级/职等之间强制联动；当字段为true时，取消岗职位/职务/职级/职等强制校验 示例：true 默认值：true
_status	string	否	是	数据操作方式Insert(插入)Update(更新) 示例：Insert
StaffRegJob	object	是	否	转正后任职
staffProbation	object	是	否	试用信息
staffTrialEvaluationList	object	是	否	试用考核信息
salarychgdocList	object	是	否	薪资结构体

## 3. 请求示例

Url: /yonbip/hrcloud/staffreg/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2532193789333760",
		"chgtypeid": "2302934585872640",
		"chgtypeCode": "hrem_reg1",
		"chgreasonid": "1939753259860230152",
		"chgreasonCode": "50",
		"staffid": "2308394853060864",
		"staffcode": "000000000000000000000067",
		"regbegindate": "2021-06-01 00:00:00",
		"regorgid": "2295649757057536",
		"regorgCode": "2295649757",
		"regdeptid": "2295650139787520",
		"regdeptCode": "A1991",
		"regpsnclid": "d831bd17811b4aeb8834169b6ecde94c",
		"regpsnclode": "06",
		"regrptrel": "2305736239681792",
		"regrptrelCode": "00000012",
		"regjobtypeid": "35d49875e4c1426ea13b10ce8d71c3a8",
		"regjobtypeCode": "30",
		"regjobid": "2296988978566144",
		"regjobCode": "10",
		"regpostid": "2302465445320192",
		"regpostCode": "06",
		"regjobpostid": "2402165445330992",
		"regjobpostCode": "18",
		"regjobgradeid": "5445320192",
		"regjobgradeCode": "职位1",
		"regjobrankid": "024654453",
		"regjobrankidCode": "职等3",
		"memo": "1423423",
		"formalwage": 10000,
		"probationwage": 8000,
		"bJobWeaken": true,
		"_status": "Insert",
		"StaffRegJob": [
			{
				"regbegindate": "2021-06-01 00:00:00",
				"regorgid": "2295649757057536",
				"regorgCode": "2295649757",
				"regdeptid": "2295650139787520",
				"regdeptCode": "A1991",
				"regpsnclid": "2305736239681792",
				"regrptrelCode": "00000012",
				"regjobtypeid": "35d49875e4c1426ea13b10ce8d71c3a8",
				"regjobtypeCode": "30",
				"regjobid": "2296988978566144",
				"regjobCode": "10",
				"regpostid": "2302465445320192",
				"regpostCode": "06",
				"regjobpostid": "2402165445330992",
				"regjobpostCode": "18",
				"regjobgradeid": "5445320192",
				"regjobgradeCode": "",
				"regjobrankid": "",
				"regjobrankidCode": "职等3",
				"memo": "123",
				"_status": "Insert"
			}
		],
		"staffProbation": [
			{
				"regbegindate": "2021-06-01 00:00:00",
				"result": "1",
				"delayRegdate": "2025-03-19",
				"workSummary": "",
				"memo": "",
				"_status": "Insert",
				"_tableDisplayOutlineAll": false
			}
		],
		"staffTrialEvaluationList": [
			{
				"beginDate": "2024-06-01 00:00:00",
				"endDate": "2024-06-19 00:00:00",
				"devaluationLevel": "1920529785080512601",
				"devaluationLevel_name": "B+",
				"evaluationScore": 70,
				"overallEvaluation": "eeee",
				"_status": "Insert",
				"_tableDisplayOutlineAll": false
			}
		],
		"salarychgdocList": [
			{
				"id": "2555194553618689",
				"newBeginDate": "2021-07-13",
				"newEndDate": "2023-01-13",
				"newNegotiation": false,
				"newPkWaItem": "4f3aff79d53d42758e4e0bd1b43e4168",
				"newPkWaItemcode": "f_n_4",
				"newSalaryStandardType": "35a00159775b40fdb586f8b8969b894a",
				"newSalaryStandardTypecode": "001",
				"newSalary": 2222,
				"newSalaryStandard": "43ce6fa0b3c14047b3b98b608670b57a",
				"_status": "Insert"
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
code	string	否	响应参数 示例：200
message	string	否	整体响应信息 示例：操作成功
data	object	否	整体数据
count	long	否	总数据条数 示例：1
sucessCount	long	否	成功数据条数 示例：1
failCount	long	否	失败数据条数 示例：0
messages	string	是	响应信息
infos	object	否	数据
failInfos	object	否	失败信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": {
			"billcode": "自动编码",
			"billstate": 1,
			"applicantname": "19904588888",
			"applydate": "2021-07-02 00:00:00",
			"chgtypeid": "2302934585872640",
			"chgtypeid_name": "试用期转正",
			"chgreasonid": "1939753259860230152",
			"chgreasonid_name": "表现良好",
			"staffid": "2308394853060864",
			"name": "老街",
			"code": "0123",
			"entrydate": "2021-06-01 00:00:00",
			"orgid": "2295649757057536",
			"orgid_name": "王者",
			"deptid": "2295650139787520",
			"deptid_name": "安其拉",
			"psnclid": "d831bd17811b4aeb8834169b6ecde94c",
			"psnclid_name": "自有员工",
			"isWfControlled": "1",
			"verifystate": 0,
			"regbegindate": "2021-06-01 00:00:00",
			"regorgid": "2295649757057536",
			"regorgid_name": "王者",
			"employerId": "2295649757057536",
			"employerId_name": "王者",
			"regdeptid": "2295650139787520",
			"regdeptid_name": "安其拉",
			"regpsnclid": "d831bd17811b4aeb8834169b6ecde94c",
			"regpsnclid_name": "自有员工",
			"regrptrel": "2305736239681792",
			"regrptrel_name": "周一",
			"regjobtypeid": "35d49875e4c1426ea13b10ce8d71c3a8",
			"regjobtypeid_name": "产品管理",
			"regjobid": "2296988978566144",
			"regjobid_name": "nu",
			"regpostid": "2302465445320192",
			"regpostid_name": "产品经理",
			"regjobpostid": "2402165445330992",
			"regjobpostid_name": "行政主管",
			"regjobgradeid": "2296990512796672",
			"regjobgradeid_name": "1",
			"regjobrankid": "2308140605182211",
			"regjobrankid_name": "3",
			"memo": "1423423",
			"formalwage": 10000,
			"probationwage": 8000,
			"regwastruct": "2",
			"annualsalary": 20000,
			"salarychgdocList": [
				{
					"newBeginDate": "2022-01-13 00:00:00",
					"newPkWaItem": "7df9b433738f487d9ae07a87de6cb2fb",
					"newSalaryStandardType": "35a00159775b40fdb586f8b8969b894a",
					"newSalaryStandardTypecode": "0056",
					"newSalary": 30000,
					"newSalaryStandard": "1eb3793fa56645b692a99579e42e91f8",
					"newSalaryStandard_value": 30000,
					"newSalaryLevelScope": "30000",
					"oldSalary": "10000",
					"oldSalaryStandardType_name": "周测03",
					"oldSalaryStandard_name": "薪级1/薪档1",
					"oldSalaryLevelScope": "10000.00",
					"billId": "2552291209793792",
					"id": "2552291209793793",
					"staffId": "2534691055587584",
					"newEndDate": "2022-03-13",
					"_status": "Insert(插入)、Update(更新)"
				}
			]
		}
	},
	"failInfos": {}
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
	1	2026-05-07	
更新
请求说明
新增
请求参数 (5)
更新
请求参数 (4)
	2	2025-05-14	
新增
请求参数 (36)
更新
请求参数 (9)
试用结果写值问题

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

