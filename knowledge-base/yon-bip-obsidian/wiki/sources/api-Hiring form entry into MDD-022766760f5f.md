---
title: "录用单写入MDD"
apiId: "022766760f5f4449bdff35754c501ba5"
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

# 录用单写入MDD

>  请求方式	POST | Offer and Others (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/bill/save
请求方式	POST
ContentType	application/json
应用场景	开放API
API类别	单条保存/更新
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	整体数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	录用单主表id。非必填，操作update时 必填 示例：23456168764
applicantid	string	否	是	申请人id 示例：2304007344492800
applicantname	string	否	否	申请人姓名 示例：13681311431
applydate	DateTime	否	否	申请日期 示例：2021-07-09 22:02:50
entrytype	string	否	否	入职类型id(入职类型id和入职类型code不能同时为空) 示例：2302932051104000
entrytypeCode	string	否	否	入职类型code(入职类型id和入职类型code不能同时为空) 示例：254687645613
name	string	否	是	姓名 示例：name1
certtype	string	否	否	证件类型id(证件类型id和证件类型code不能同时为空) 示例：0002-e756-4390-8c50-251e26b06594
certtypeCode	string	否	否	证件类型code(证件类型id和证件类型code不能同时为空) 示例：0000000003
certno	string	否	是	证件号 示例：1231231231
birthdate	DateTime	否	否	出生日期 示例：1999-07-01
sex	string	否	否	性别。0：未知；1：男；2：女 示例：1
selfemail	string	否	是	个人邮箱 示例：99876@99876.com
mobile	string	否	是	联系电话 示例：+86-18767899876
highestqualification	string	否	否	最高学历id 示例：2335209397620992
highestqualificationCode	string	否	否	最高学历code 示例：684641687469413
begindate	DateTime	否	是	预计入职日期 示例：2021-07-10
rmchannelid	string	否	否	招聘渠道 示例：2292995404108032
rmchannelidCode	string	否	否	招聘渠道code 示例：0017
entrysrcid	string	否	否	进入来源 示例：2308086666662197
entrysrcidCode	string	否	否	进入来源code 示例：0007
signdate	DateTime	否	否	合同签订日期 示例：2021-07-09
termtype	string	否	否	合同期限类型，1：固定期限；2：无固定期限；3：以完成一定工作任务为期限 示例：1
startdate	DateTime	否	否	合同开始日期 示例：2021-07-10
termmonth	long	否	否	合同期限 示例：36
enddate	DateTime	否	否	合同结束日期 示例：2024-07-09
contractnum	string	否	否	合同编码 示例：77616596841684
majorcorpid	string	否	否	合同主体id 示例：2297052764557568
majorcorpidCode	string	否	否	合同主体Code 示例：hrcm_contractentity_ref
trialperiod	string	否	否	试用期限 示例：3
trialenddate	DateTime	否	否	试用截止日期 示例：2021-10-09
conmemo	string	否	否	合同备注 示例：合同备注
marriageandchildbirth	string	否	否	婚育情况 示例：已婚已孕
personnelinformation	string	否	否	人员信息采集表链接 示例：www.baidu.com
recruitmentitem	string	否	否	招聘项目 示例：校园招聘
reemployment	boolean	否	否	是否二次入职，true:是;false:否 示例：true
resumeUrl	string	否	否	简历链接 示例：www.baidu.com
examinationresults	string	否	否	笔试成绩链接 示例：www.baidu.com
assessUrl	string	否	否	测评链接地址 示例：www.baidu.com
email	string	否	否	工作邮箱 示例：100000001@11.com
linkedin	boolean	否	否	领英，true:是;false:否 示例：true
weixin	string	否	否	微信 示例：130000001
qq	string	否	否	QQ 示例：420073050
joinpolitydate	DateTime	否	否	加入党团时间日期 示例：2021-10-09
permanresideCode	string	否	否	户口所在地Code 示例：100001
permanreside	string	否	否	户口所在地id 示例：1000013563273298
maritalCode	string	否	否	婚姻状况code 示例：100001
marital	string	否	否	婚姻状况id 示例：1000013563273298
shopassistag	boolean	否	否	是否店员，true:是;false:否 示例：true
bizmantag	boolean	否	否	业务员，true:是;false:否 示例：true
linkaddr	string	否	否	通讯地址 示例：XX省XX市XX区XX街道XX小区XX号楼XX单元XX号
staffcode	string	否	否	人员编码 示例：3487437
billcode	string	否	否	单据编号 示例：3487437
officetel	string	否	否	办公电话 示例：3487437
useNewStaffCode	boolean	否	否	是否使用新员工编码，true:是;false:否 示例：true
evaluationUrl	string	否	否	面试评价链接 示例：www.baidu.com
recruitmenttype	string	否	否	招聘类型 示例：校园招聘
resumesource	string	否	否	简历来源 示例：boss直聘
jobpostidCode	string	否	否	职位Code
jobpostid	string	否	否	职位id
orgid	string	否	否	所属组织id(所属组织id和所属组织code不能同时为空) 示例：2303747810431232
orgidCode	string	否	否	所属组织code(所属组织id和所属组织code不能同时为空) 示例：2303747810431232
deptid	string	否	否	所属部门id(所属部门id和所属部门code不能同时为空) 示例：2304053382484224
deptidCode	string	否	否	所属部门code(所属部门id和所属部门code不能同时为空) 示例：HRZP001
psnclid	string	否	否	人员类别id(人员类别id和人员类别code不能同时为空) 示例：2297049398105088
psnclidCode	string	否	否	人员类别Code(人员类别id和人员类别code不能同时为空) 示例：01
postStatusid	string	否	否	在岗状态id 示例：2308086666645997
postStatusidCode	string	否	否	在岗状态code
postid	string	否	否	岗位id 示例：1111111111
postidCode	string	否	否	岗位Code 示例：10054
jobid	string	否	否	职务id 示例：2302887610947072
jobidCode	string	否	否	职务Code 示例：100001344
jobtypeid	string	否	否	职务类别id 示例：db22abe440944d5abac1921493ac0fac
jobtypeidCode	string	否	否	职务类别Code 示例：100001
jobgradeid	string	否	否	职级id 示例：2302885674407424
jobgradeidCode	string	否	否	职级Code 示例：8493418964
jobrankid	string	否	否	职等id 示例：2302881459508736
jobrankidCode	string	否	否	职等Code 示例：1000013
rptrel	string	否	否	主管id(主管id和主管code不能同时为空) 示例：2311452439269632
rptrelCode	string	否	否	主管code(主管id和主管code不能同时为空) 示例：00000000000000000001
joinworkdate	DateTime	否	否	参加工作日期 示例：2020-10-01 00:00:00
origin	string	否	否	籍贯id 示例：2308086666645997
recruitPostIdCode	string	否	否	招聘职位code 示例：100001
recruitPostId	string	否	否	招聘职位id 示例：1000013563273298
bloodtypeCode	string	否	否	血型code 示例：100001
bloodtype	string	否	否	血型id 示例：1000013563273298
memo	string	否	否	备注 示例：XXX面试表现优异
originCode	string	否	否	籍贯Code
nationality	string	否	否	民族id 示例：2308086666645997
nationalityCode	string	否	否	民族Code
political	string	否	否	政治面貌id 示例：2308086666645997
politicalCode	string	否	否	政治面貌Code
characterrpr	string	否	否	户口性质id 示例：2308086666645997
characterrprCode	string	否	否	户口性质Code
country	string	否	否	国籍地区id 示例：2308086666645997
countryCode	string	否	否	国籍地区Code
workaddr	string	否	否	工作地点id 示例：2297050603671808
workaddrCode	string	否	否	工作地点Code 示例：26
socialinsuraddr	string	否	否	社保缴纳地id 示例：2297050603671808
socialinsuraddrCode	string	否	否	社保缴纳地Code 示例：26
formalwage	long	否	否	转正工资 示例：15000
probationwage	long	否	否	试用期工资 示例：12000
salarystructure	string	否	否	薪资结构 示例：14
annualsalary	long	否	否	年薪 示例：210000
attachment	string	否	否	附件 示例：5b7e6430-e0be-11eb-b6a2-77ce4443d927
salarychgdocList	object	是	否	入职单定调薪档案
entryResumeList	object	是	否	入职单履历信息
entryEduList	object	是	否	入职单学历信息
entrySocialRelList	object	是	否	入职单社会关系
_status	string	否	是	操作标识，Insert：新增；Update：更新 示例：Insert
seniorityAdj	int	否	否	调整司龄(月)
groupWorkAgeAdj	BigDecimal	否	否	调整集团工龄(月)
staffAttachment	string	否	否	员工附件
photo	string	否	否	头像
groupDate	DateTime	否	否	入集团日期 示例：2021-07-09
bJobWeaken	boolean	否	否	档案关系弱化字段 ， true 是，false否，当字段为false时，岗职位/职务/职级/职等之间强制联动；当字段为true时，取消岗职位/职务/职级/职等强制校验 默认值：true

## 3. 请求示例

Url: /yonbip/hrcloud/bill/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "23456168764",
		"applicantid": "2304007344492800",
		"applicantname": "13681311431",
		"applydate": "2021-07-09 22:02:50",
		"entrytype": "2302932051104000",
		"entrytypeCode": "254687645613",
		"name": "name1",
		"certtype": "0002-e756-4390-8c50-251e26b06594",
		"certtypeCode": "0000000003",
		"certno": "1231231231",
		"birthdate": "1999-07-01",
		"sex": "1",
		"selfemail": "99876@99876.com",
		"mobile": "+86-18767899876",
		"highestqualification": "2335209397620992",
		"highestqualificationCode": "684641687469413",
		"begindate": "2021-07-10",
		"rmchannelid": "2292995404108032",
		"rmchannelidCode": "0017",
		"entrysrcid": "2308086666662197",
		"entrysrcidCode": "0007",
		"signdate": "2021-07-09",
		"termtype": "1",
		"startdate": "2021-07-10",
		"termmonth": 36,
		"enddate": "2024-07-09",
		"contractnum": "77616596841684",
		"majorcorpid": "2297052764557568",
		"majorcorpidCode": "hrcm_contractentity_ref",
		"trialperiod": "3",
		"trialenddate": "2021-10-09",
		"conmemo": "合同备注",
		"marriageandchildbirth": "已婚已孕",
		"personnelinformation": "www.baidu.com",
		"recruitmentitem": "校园招聘",
		"reemployment": true,
		"resumeUrl": "www.baidu.com",
		"examinationresults": "www.baidu.com",
		"assessUrl": "www.baidu.com",
		"email": "100000001@11.com",
		"linkedin": true,
		"weixin": "130000001",
		"qq": "420073050",
		"joinpolitydate": "2021-10-09",
		"permanresideCode": "100001",
		"permanreside": "1000013563273298",
		"maritalCode": "100001",
		"marital": "1000013563273298",
		"shopassistag": true,
		"bizmantag": true,
		"linkaddr": "XX省XX市XX区XX街道XX小区XX号楼XX单元XX号",
		"staffcode": "3487437",
		"billcode": "3487437",
		"officetel": "3487437",
		"useNewStaffCode": true,
		"evaluationUrl": "www.baidu.com",
		"recruitmenttype": "校园招聘",
		"resumesource": "boss直聘",
		"jobpostidCode": "",
		"jobpostid": "",
		"orgid": "2303747810431232",
		"orgidCode": "2303747810431232",
		"deptid": "2304053382484224",
		"deptidCode": "HRZP001",
		"psnclid": "2297049398105088",
		"psnclidCode": "01",
		"postStatusid": "2308086666645997",
		"postStatusidCode": "",
		"postid": "1111111111",
		"postidCode": "10054",
		"jobid": "2302887610947072",
		"jobidCode": "100001344",
		"jobtypeid": "db22abe440944d5abac1921493ac0fac",
		"jobtypeidCode": "100001",
		"jobgradeid": "2302885674407424",
		"jobgradeidCode": "8493418964",
		"jobrankid": "2302881459508736",
		"jobrankidCode": "1000013",
		"rptrel": "2311452439269632",
		"rptrelCode": "00000000000000000001",
		"joinworkdate": "2020-10-01 00:00:00",
		"origin": "2308086666645997",
		"recruitPostIdCode": "100001",
		"recruitPostId": "1000013563273298",
		"bloodtypeCode": "100001",
		"bloodtype": "1000013563273298",
		"memo": "XXX面试表现优异",
		"originCode": "",
		"nationality": "2308086666645997",
		"nationalityCode": "",
		"political": "2308086666645997",
		"politicalCode": "",
		"characterrpr": "2308086666645997",
		"characterrprCode": "",
		"country": "2308086666645997",
		"countryCode": "",
		"workaddr": "2297050603671808",
		"workaddrCode": "26",
		"socialinsuraddr": "2297050603671808",
		"socialinsuraddrCode": "26",
		"formalwage": 15000,
		"probationwage": 12000,
		"salarystructure": "14",
		"annualsalary": 210000,
		"attachment": "5b7e6430-e0be-11eb-b6a2-77ce4443d927",
		"salarychgdocList": [
			{
				"id": "848546894897315",
				"newPkWaItem": "4f3aff79d53d42758e4e0bd1b43e4168",
				"newPkWaItemCode": "876464351365654",
				"newBeginDate": "2021-07-01",
				"newEndDate": "2023-10-18",
				"newNegotiation": false,
				"newSalaryStandardType": "35a00159775b40fdb586f8b8969b894a",
				"newSalaryStandardTypeCode": "654879846153578964",
				"newSalaryStandard": "43ce6fa0b3c14047b3b98b608670b57a",
				"newProbationProportion": 50,
				"newProbationSalary": 0,
				"newSalary": 2222,
				"_status": "Insert"
			}
		],
		"entryResumeList": [
			{
				"id": "84876313543",
				"beginDate": "2021-07-10",
				"endDate": "2021-08-01",
				"workCorp": "用友网络",
				"workDept": "研发部",
				"workJobPost": "",
				"workJob": "职务",
				"workPost": "职位",
				"workDuty": "敲代码",
				"certifier": "我大哥",
				"memo": "备注",
				"_status": "Insert"
			}
		],
		"entryEduList": [
			{
				"id": "984646416",
				"major": "计算机",
				"studyModeCode": "8",
				"studyMode": "6e529e61-f0ec-4fae-80b7-f7ef18d55ece",
				"memo": "备注",
				"educationCode": "3400874796454425",
				"isPrefs": "",
				"education": "1513fd4d-c4ab-4b86-8f7a-b15628d71bef",
				"degreeCode": "3400874796454424",
				"degree": "38364a01-62bc-4a2e-ab93-d8c853fe7392",
				"school": "清华大学",
				"eduSystem": "4",
				"educationCtifCode": "351513531",
				"certifCode": "262622245234525",
				"beginDate": "2017-07-09",
				"endDate": "2021-07-09",
				"_status": "Insert"
			}
		],
		"entrySocialRelList": [
			{
				"id": "",
				"relName": "姓名",
				"isUrgent": true,
				"relationCode": "894641635",
				"relation": "2308086666645997",
				"workCorp": "家里蹲",
				"workDuty": "带娃",
				"linkAddr": "北京",
				"linkTel": "+86-18767899876",
				"_status": "Insert"
			}
		],
		"_status": "Insert",
		"seniorityAdj": 0,
		"groupWorkAgeAdj": 0,
		"staffAttachment": "",
		"photo": "",
		"groupDate": "2021-07-09",
		"bJobWeaken": true
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
infos	object	是	数据

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
		"infos": [
			{
				"billstate": 1,
				"applicantid": "2304007344492800",
				"applicantname": "13681311431",
				"applydate": "",
				"entrytype": "2302932051104000",
				"entrytypeCode": "75413235",
				"name": "name1",
				"certtype": "0002-e756-4390-8c50-251e26b06594",
				"certtypeCode": "0000000003",
				"certno": "1231231231",
				"birthdate": "",
				"sex": "1",
				"selfemail": "99876@99876.com",
				"mobile": "+86-18767899876",
				"highestqualification": "2335209397620992",
				"isWfControlled": true,
				"begindate": "",
				"groupDate": "",
				"seniorityAdj": 0,
				"groupWorkAgeAdj": 0,
				"rmchannelid": "2292995404108032",
				"rmchannelidCode": "846513",
				"entrysrcid": "2308086666662197",
				"entrysrcidCode": "6556",
				"signdate": "",
				"termtype": "1",
				"startdate": "",
				"termmonth": 36,
				"enddate": "",
				"majorcorpid": "2297052764557568",
				"majorcorpidCode": "00002",
				"trialperiod": "3",
				"trialenddate": "",
				"conmemo": "合同备注",
				"orgid": "2303747810431232",
				"orgidCode": "1213",
				"deptid": "2304053382484224",
				"deptidCode": "HRZP001",
				"psnclid": "2297049398105088",
				"psnclidCode": "01",
				"postStatusid": "",
				"postid": "1111111111",
				"postidCode": "0001",
				"jobid": "2302887610947072",
				"jobidCode": "0006",
				"jobtypeid": "db22abe440944d5abac1921493ac0fac",
				"jobtypeidCode": "0002",
				"jobgradeid": "2302885674407424",
				"jobgradeidCode": "0003",
				"jobrankid": "2302881459508736",
				"jobrankidCode": "0008",
				"rptrel": "2311452439269632",
				"rptrelCode": "00000000000000000001",
				"workaddr": "2297050603671808",
				"workaddrCode": "00001",
				"joinworkdate": "",
				"socialinsuraddr": "2297050603671808",
				"socialinsuraddrCode": "00001",
				"isreturn": false,
				"formalwage": 15000,
				"probationwage": 12000,
				"salarystructure": "14",
				"annualsalary": 210000,
				"attachment": "5b7e6430-e0be-11eb-b6a2-77ce4443d927",
				"salarychgdocList": [
					{
						"newPkWaItem": "4f3aff79d53d42758e4e0bd1b43e4168",
						"newBeginDate": "",
						"newNegotiation": false,
						"newSalaryStandardType": "35a00159775b40fdb586f8b8969b894a",
						"newSalaryStandard": "43ce6fa0b3c14047b3b98b608670b57a",
						"newSalary": 2222,
						"newSalaryLevelScope": "10000.00",
						"tenant": "0000KV600HDK0GAOSP0000",
						"id": "2533352031277315",
						"entrybill_id": "2533352031277312",
						"pubts": ""
					}
				],
				"entryResumeList": [
					{
						"beginDate": "",
						"endDate": "",
						"workCorp": "用友网络",
						"workDept": "研发部",
						"workJob": "职务",
						"workPost": "职位",
						"workDuty": "敲代码",
						"certifier": "我大哥",
						"memo": "备注",
						"tenant": "0000KV600HDK0GAOSP0000",
						"id": "2533352031277315",
						"entrybill_id": "2533352031277312",
						"pubts": ""
					}
				],
				"entryEduList": [
					{
						"major": "计算机",
						"studyModeCode": "0003",
						"studyMode": "6e529e61-f0ec-4fae-80b7-f7ef18d55ece",
						"memo": "备注",
						"educationCode": "0005",
						"education": "1513fd4d-c4ab-4b86-8f7a-b15628d71bef",
						"degreeCode": "00006",
						"degree": "38364a01-62bc-4a2e-ab93-d8c853fe7392",
						"school": "清华大学",
						"eduSystem": "4",
						"educationCtifCode": "32525352",
						"certifCode": "235265235252352",
						"beginDate": "",
						"endDate": "",
						"tenant": "0000KV600HDK0GAOSP0000",
						"id": "2533352031277315",
						"entrybill_id": "2533352031277312",
						"pubts": ""
					}
				],
				"entrySocialRelList": [
					{
						"relName": "姓名",
						"relationCode": "00003",
						"relation": "2308086666645997",
						"workCorp": "家里蹲",
						"workDuty": "带娃",
						"linkAddr": "北京",
						"linkTel": "+86-18767899876",
						"tenant": "0000KV600HDK0GAOSP0000",
						"id": "2533352031277315",
						"entrybill_id": "2533352031277312",
						"pubts": ""
					}
				],
				"entrystaff": "",
				"submitdate": "",
				"creator": "李四",
				"createTime": "",
				"tenant": "0000KV600HDK0GAOSP0000",
				"billcode": "RZ008163",
				"dr": "0",
				"id": "2533352031277312",
				"pubts": "",
				"postStatusidCode": "001",
				"origin": "2533352031277312",
				"originCode": "001",
				"nationality": "2533352031277312",
				"nationalityCode": "001",
				"political": "2533352031277312",
				"politicalCode": "001",
				"characterrpr": "2533352031277312",
				"photo": "",
				"staffAttachment": "",
				"characterrprCode": "001",
				"country": "2533352031277312",
				"countryCode": "001"
			}
		]
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

