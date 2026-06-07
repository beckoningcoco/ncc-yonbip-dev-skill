---
title: "按条件查询录用单"
apiId: "1602030017148092420"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Offer and Others"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Offer and Others]
platform_version: "BIP"
source_type: community-api-docs
---

# 按条件查询录用单

>  请求方式	POST | Offer and Others (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/bill/getEntryBillByParam
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
certtype	string	否	否	证件类型id。填写证件类型id时，须同步填写证件号 示例：0001-5130-48de-ae28-4233a47e3797
certno	string	否	否	证件号。填写证件号时，须同步填写证件类型id。证件号/姓名/个人邮箱/手机号 四选一必填 示例：110101199003074039
name	string	否	否	姓名。证件号/姓名/个人邮箱/手机号 四选一必填 示例：马军
mobile	string	否	否	手机号。证件号/姓名/个人邮箱/手机号 四选一必填 示例：+86-17900114321
selfemail	string	否	否	个人邮箱。证件号/姓名/个人邮箱/手机号 四选一必填 示例：12345@qq.com

## 3. 请求示例

Url: /yonbip/hrcloud/bill/getEntryBillByParam?access_token=访问令牌
Body: {
	"certtype": "0001-5130-48de-ae28-4233a47e3797",
	"certno": "110101199003074039",
	"name": "马军",
	"mobile": "+86-17900114321",
	"selfemail": "12345@qq.com"
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
code	string	否	返回码 示例：200
message	string	否	消息 示例：操作成功
data	object	是	整体数据
id	string	否	录用单主表id 示例：23456168764
groupWorkAgeAdj	BigDecimal	否	调整集团工龄(月)
seniorityAdj	int	否	调整司龄(月)
groupDate	DateTime	否	入集团日期
employerId_name	string	否	工作关系主体姓名
employerId	string	否	工作关系主体id
billstate	long	否	单据状态：未提交 - 1,已提交 - 2,审核中 - 3,审核通过 - 4,已终止 - 5,已发Offer - 6,接受Offer - 7,拒绝offer - 8,待入职 - 9,已入职 - 10,拒绝入职 - 11,驳回 - 12,终止 - 13,撤回 - 14,待发offer - 15,单据状态错误 16,预入职复核 - 17,面试通过 - 18 示例：1 默认值：1
applicantid	string	否	申请人id 示例：2304007344492800
applicantname	string	否	申请人姓名 示例：13681311431
applydate	DateTime	否	申请日期 示例：2021-07-09 22:02:50
entrytype	string	否	入职类型id 示例：2302932051104000
entrytype_name	string	否	入职类型名称 示例：正式员工录用
name	string	否	姓名 示例：name1
certtype	string	否	证件类型id 示例：0002-e756-4390-8c50-251e26b06594
certno	string	否	证件号 示例：1231231231
birthdate	DateTime	否	出生日期 示例：1999-07-01
sex	long	否	性别。0：未知；1：男；2：女 示例：1
selfemail	string	否	个人邮箱 示例：99876@99876.com
mobile	string	否	联系电话 示例：+86-18767899876
highestqualification	string	否	最高学历id 示例：2335209397620992
isWfControlled	boolean	否	是否审批流控制。true：受控制；false：不受控制 示例：true
verifystate	long	否	审批状态：0 - 待审批，1 - 审批中，2 - 已审批，3 - 已撤回，4 - 已驳回 示例：0
begindate	DateTime	否	预计入职日期 示例：2021-07-10
rmchannelid	string	否	招聘渠道 示例：2292995404108032
entrysrcid	string	否	进入来源 示例：2308086666662197
entryctrtList	object	是	合同子集数据
orgid	string	否	所属组织id 示例：2303747810431232
deptid	string	否	所属部门id 示例：2304053382484224
psnclid	string	否	人员类别id 示例：2297049398105088
psnclid_name	string	否	人员类别名称 示例：自有员工
postid	string	否	岗位id 示例：1111111111
jobid	string	否	职务id 示例：2302887610947072
jobid_name	string	否	职务名称 示例：100001344
jobtypeid	string	否	职务类别id 示例：db22abe440944d5abac1921493ac0fac
jobgradeid	string	否	职级id 示例：2302885674407424
jobrankid	string	否	职等id 示例：2302881459508736
rptrel	string	否	主管id 示例：2311452439269632
origin	string	否	籍贯id
origin_name	string	否	籍贯
joinworkdate	DateTime	否	参加工作日期 示例：2020-10-01 00:00:00
nationality	string	否	民族id 示例：2308086666645997
political	string	否	政治面貌id 示例：2308086666645997
characterrpr	string	否	户口性质id 示例：2308086666645997
country	string	否	国籍地区id 示例：2308086666645997
socialinsuraddr_name	string	否	社保缴纳地 示例：北京
socialinsuraddr	string	否	社保缴纳地id 示例：2297050603671808
isreturn	boolean	否	是否再聘。true：再聘；false：不是再聘 示例：false
formalwage	long	否	转正工资 示例：15000
probationwage	long	否	试用期工资 示例：12000
salarystructure	string	否	薪资结构 示例：14
annualsalary	long	否	年薪 示例：210000
attachment	string	否	附件 示例：5b7e6430-e0be-11eb-b6a2-77ce4443d927
bJobWeaken	boolean	否	档案关系弱化字段 ， true 是，false否 默认值：true
salarychgdocList	object	是	入职单定调薪档案
entryResumeList	object	是	入职单履历信息
entryEduList	object	是	入职单学历信息
entrySocialRelList	object	是	入职单社会关系

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "23456168764",
			"groupWorkAgeAdj": 0,
			"seniorityAdj": 0,
			"groupDate": "",
			"employerId_name": "",
			"employerId": "",
			"billstate": 1,
			"applicantid": "2304007344492800",
			"applicantname": "13681311431",
			"applydate": "2021-07-09 22:02:50",
			"entrytype": "2302932051104000",
			"entrytype_name": "正式员工录用",
			"name": "name1",
			"certtype": "0002-e756-4390-8c50-251e26b06594",
			"certno": "1231231231",
			"birthdate": "1999-07-01",
			"sex": 1,
			"selfemail": "99876@99876.com",
			"mobile": "+86-18767899876",
			"highestqualification": "2335209397620992",
			"isWfControlled": true,
			"verifystate": 0,
			"begindate": "2021-07-10",
			"rmchannelid": "2292995404108032",
			"entrysrcid": "2308086666662197",
			"entryctrtList": [
				{
					"signdate": "2021-07-09",
					"termtype": 1,
					"begindate": "2021-07-10",
					"termmonth": 36,
					"enddate": "合同结束日期",
					"contractnum": "77616596841684",
					"majorcorp_id": "2297052764557568",
					"majorcorpid_name": "北分",
					"memo": "合同备注",
					"workaddr": "2303747810431233",
					"workaddr_name": "北京",
					"probenddate": "2021-10-09",
					"promonth": 4
				}
			],
			"orgid": "2303747810431232",
			"deptid": "2304053382484224",
			"psnclid": "2297049398105088",
			"psnclid_name": "自有员工",
			"postid": "1111111111",
			"jobid": "2302887610947072",
			"jobid_name": "100001344",
			"jobtypeid": "db22abe440944d5abac1921493ac0fac",
			"jobgradeid": "2302885674407424",
			"jobrankid": "2302881459508736",
			"rptrel": "2311452439269632",
			"origin": "",
			"origin_name": "",
			"joinworkdate": "2020-10-01 00:00:00",
			"nationality": "2308086666645997",
			"political": "2308086666645997",
			"characterrpr": "2308086666645997",
			"country": "2308086666645997",
			"socialinsuraddr_name": "北京",
			"socialinsuraddr": "2297050603671808",
			"isreturn": false,
			"formalwage": 15000,
			"probationwage": 12000,
			"salarystructure": "14",
			"annualsalary": 210000,
			"attachment": "5b7e6430-e0be-11eb-b6a2-77ce4443d927",
			"bJobWeaken": true,
			"salarychgdocList": [
				{
					"id": "848546894897315",
					"newPkWaItem_name": "1",
					"newPkWaItem": "4f3aff79d53d42758e4e0bd1b43e4168",
					"newBeginDate": "2021-07-01",
					"newNegotiation": false,
					"newSalaryStandardType": "35a00159775b40fdb586f8b8969b894a",
					"newSalaryStandardType_name": "123",
					"newSalaryStandard": "43ce6fa0b3c14047b3b98b608670b57a",
					"newSalary": 2222
				}
			],
			"entryResumeList": [
				{
					"id": "84876313543",
					"beginDate": "2021-07-10",
					"endDate": "2021-08-01",
					"workCorp": "用友网络",
					"workDept": "研发部",
					"workJob": "职务",
					"workPost": "职位",
					"workDuty": "敲代码",
					"certifier": "我大哥",
					"memo": "备注"
				}
			],
			"entryEduList": [
				{
					"id": "984646416",
					"major": "计算机",
					"studyMode": "6e529e61-f0ec-4fae-80b7-f7ef18d55ece",
					"memo": "备注",
					"education": "1513fd4d-c4ab-4b86-8f7a-b15628d71bef",
					"degree": "38364a01-62bc-4a2e-ab93-d8c853fe7392",
					"school": "清华大学",
					"eduSystem": 4,
					"beginDate": "2017-07-09",
					"endDate": "2021-07-09"
				}
			],
			"entrySocialRelList": [
				{
					"id": "",
					"relName": "姓名",
					"relation": "2308086666645997",
					"workDuty": "带娃",
					"linkAddr": "北京",
					"linkTel": "+86-18767899876"
				}
			]
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
999	参数异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-30	
更新
返回参数 (108)
修改目录

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

