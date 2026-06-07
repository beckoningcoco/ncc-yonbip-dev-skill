---
title: "候选人信息更新MDD"
apiId: "2022866701085835269"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Candidate Information"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Candidate Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 候选人信息更新MDD

>  请求方式	POST | Candidate Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/updateCandidate
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	是	候选人ID 示例：2511871812849920
name	string	否	否	候选人姓名 示例：测试1234
candidateStaffCode	string	否	否	候选人员工编码
certType	string	否	否	证件类型 传入id或code 示例：0010-3600-41e2-8568-42fbc6c96c9d
certNo	string	否	否	证件号 示例：0909765437777
sex	string	否	否	性别；0：未知； 1：男；2：女 示例：2
birthDate	string	否	否	出生日期 示例：2013-11-09
mobile	string	否	否	手机号 示例：+86-13842985777
officeTel	string	否	否	办公电话 示例：1546816777
email	string	否	否	邮箱 示例：321321@777.com
selfEmail	string	否	否	个人邮箱 示例：7777@qq.com
workAgeAdjType	string	否	否	工龄调整方式，1：增加；0：减少 示例：1
workAgeAdjYea	number
小数位数:0,最大长度:2	否	否	调整工龄(年数)：分别按年、月、日为单位填写司龄调整（如司龄调整1年2个月3天，此处填写1），最大不超过99 示例：1
workAgeAdjMon	number
小数位数:0,最大长度:2	否	否	调整工龄(月数)：分别按年、月、日为单位填写司龄调整（如司龄调整1年2个月3天，此处填写2），最大不超过12 示例：1
workAgeAdjDay	number
小数位数:0,最大长度:2	否	否	调整工龄(天数)：分别按年、月、日为单位填写司龄调整（如司龄调整1年2个月3天，此处填写3），最大不超过30 示例：1
joinWorkDate	string	否	否	参加工作日期 示例：2020-11-01
linkAddr	string	否	否	联系地址 示例：沈阳
education	string	否	否	学历 传入id或code 示例：2476728905519360
degree	string	否	否	学位 传入id或code 示例：2476730873303296
marital	string	否	否	婚姻状况 传入id或code 示例：2475282874225665
bloodType	string	否	否	血型 传入id或code 示例：41eb36a1-4f93-4504-b4ae-91837e5b1a7e
isOnlyChild	boolean	否	否	是否独生子女
characterrpr	string	否	否	户口性质 传入id或code 示例：5db087f8-8dbf-4426-9b61-9c3886f812a3
permanreside	string	否	否	户口所在地 传入id或code 示例：bfbd1620-5cf3-11e9-817e-7cd30abea0c0
political	string	否	否	政治面貌 传入id或code 示例：2508983411364096
joinPolityDate	string	否	否	加入党团时间 示例：2017-11-07
nationality	string	否	否	民族 传入id或code 示例：694d8570-3da8-4162-b521-1d0dfa2a13ea
country	string	否	否	国籍地区 传入id或code 示例：6cefdb2b-180f-4ba5-8710-fa5a27a108bb
workAge	Decimal	否	否	工龄 如：2.50 示例：2.50
origin	string	否	否	籍贯 传入id或code 示例：c04c67b2-5cf3-11e9-817e-7cd30abea0c0
qq	string	否	否	QQ 示例：7787845448
linkedIn	string	否	否	领英 示例：0215141185
bizManTag	string	否	否	业务员，1：是；0：否 示例：false
shopAssisTag	string	否	否	是否店员，1：是；0：否 示例：true
attachlist	string	否	否	附件 通过协同云的文件上传api，上传本地文件，绑定id，保存信息时附件设置为该id实现附件上传 示例：3f9ebc70-4058-11ec-863d-bb0606e88ccf
weiXin	string	否	否	微信 示例：534534645645wx
firstName	string	否	否	候选人姓 示例：张 示例：候选人姓 示例：张
middleName	string	否	否	候选人中间名 示例：无 示例：候选人中间名 示例：无
lastName	string	否	否	候选人名 示例：无忌 示例：候选人名 示例：无忌
annualsalary	Decimal	否	否	年薪 示例：23456.00
shortName	string	否	否	候选人姓名简称 示例：张无忌 示例：候选人姓名简称 示例：张无忌
probationwage	Decimal	否	否	试用期工资 示例：345678.00
salarystructure	string	否	否	薪资结构 示例：4567
formalwage	Decimal	否	否	转正工资 示例：567890.00
resumeUrl	string	否	否	简历链接 示例：https://12wq/ookj99
evaluationUrl	string	否	否	面试评价链接 示例：https://12wq/ookj99
assessUrl	string	否	否	测评链接 示例：https://12wq/ookj99
examinationresults	string	否	否	笔试成绩链接 示例：https://12wq/ookj99
recruitmenttype	string	否	否	招聘类型 示例：这是招聘类型
resumesource	string	否	否	简历来源 示例：这是简历来源
personnelinformation	string	否	否	人员信息采集表链接 示例：https://12wq/ookj99
recruitmentitem	string	否	否	招聘项目 示例：这是招聘项目
recruitPostId	string	否	否	招聘职位id 示例：867676465345
billFlag	int	否	否	单据操作标识 更新只能传递 2 示例：2 默认值：2
_status	string	否	是	操作标识, Insert:新增、Update:更新 默认值：Update
orgRel	object	是	否	工作关系子集
langAbility	object	是	否	语言能力
techPost	object	是	否	专业技术职务
ass	object	是	否	绩效记录
certificate	object	是	否	证书子集
dotline	object	是	否	虚线上级
bankAcct	object	是	否	银行账户
cert	object	是	否	证件信息
socialRel	object	是	否	社会关系
candidateJob	object	是	否	任职信息
title	object	是	否	职称记录
reward	object	是	否	奖励情况
protocol	object	是	否	协议信息
probation	object	是	否	试用信息
train	object	是	否	培训记录
resume	object	是	否	履历信息
edu	object	是	否	学历信息
ctrt	object	是	否	合同信息
proqualify	object	是	否	职业资格
interview	object	是	否	面试轮次集合
referenceCheck	object	是	否	背调信息集合
referenceCheckExternal	object	是	否	外部背调信息集合
evaluationMessage	object	是	否	测评信息集合
writtenExamination	object	是	否	笔试信息集合
defineSet	object	是	否	自定义信息集名称，表名+List

## 3. 请求示例

Url: /yonbip/hrcloud/updateCandidate?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2511871812849920",
		"name": "测试1234",
		"candidateStaffCode": "",
		"certType": "0010-3600-41e2-8568-42fbc6c96c9d",
		"certNo": "0909765437777",
		"sex": "2",
		"birthDate": "2013-11-09",
		"mobile": "+86-13842985777",
		"officeTel": "1546816777",
		"email": "321321@777.com",
		"selfEmail": "7777@qq.com",
		"workAgeAdjType": "1",
		"workAgeAdjYea": 1,
		"workAgeAdjMon": 1,
		"workAgeAdjDay": 1,
		"joinWorkDate": "2020-11-01",
		"linkAddr": "沈阳",
		"education": "2476728905519360",
		"degree": "2476730873303296",
		"marital": "2475282874225665",
		"bloodType": "41eb36a1-4f93-4504-b4ae-91837e5b1a7e",
		"isOnlyChild": true,
		"characterrpr": "5db087f8-8dbf-4426-9b61-9c3886f812a3",
		"permanreside": "bfbd1620-5cf3-11e9-817e-7cd30abea0c0",
		"political": "2508983411364096",
		"joinPolityDate": "2017-11-07",
		"nationality": "694d8570-3da8-4162-b521-1d0dfa2a13ea",
		"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
		"workAge": 2.5,
		"origin": "c04c67b2-5cf3-11e9-817e-7cd30abea0c0",
		"qq": "7787845448",
		"linkedIn": "0215141185",
		"bizManTag": "false",
		"shopAssisTag": "true",
		"attachlist": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
		"weiXin": "534534645645wx",
		"firstName": "候选人姓   示例：张",
		"middleName": "候选人中间名  示例：无",
		"lastName": "候选人名  示例：无忌",
		"annualsalary": 23456,
		"shortName": "候选人姓名简称  示例：张无忌",
		"probationwage": 345678,
		"salarystructure": "4567",
		"formalwage": 567890,
		"resumeUrl": "https://12wq/ookj99",
		"evaluationUrl": "https://12wq/ookj99",
		"assessUrl": "https://12wq/ookj99",
		"examinationresults": "https://12wq/ookj99",
		"recruitmenttype": "这是招聘类型",
		"resumesource": "这是简历来源",
		"personnelinformation": "https://12wq/ookj99",
		"recruitmentitem": "这是招聘项目",
		"recruitPostId": "867676465345",
		"billFlag": 2,
		"_status": "",
		"orgRel": [
			{
				"id": "6477869879089",
				"groupWorkAgeAdj": 2,
				"seniorityAdj": 2,
				"rmChannel": "6456676786784654",
				"entrySrc": "42342534534534",
				"recruitPostId": "321212123232323",
				"isReturn": false,
				"_status": "",
				"seniorityAdjType": "1",
				"seniorityAdjYea": 1,
				"seniorityAdjMon": 1,
				"seniorityAdjDay": 1,
				"groupAgeAdjType": "1",
				"groupAgeAdjYea": 1,
				"groupAgeAdjMon": 1,
				"groupAgeAdjDay": 1
			}
		],
		"langAbility": [
			{
				"proLevel": "2475282966107140",
				"language": "f74e0f14-5970-45f0-a09e-77d9d73849a1",
				"id": "2524738586775814",
				"certNo": "1651616",
				"langLevel": "高级",
				"memo": "备注",
				"getDate": "2020-11-22",
				"_status": "Update",
				"certName": "证书"
			}
		],
		"techPost": [
			{
				"beginDate": "2020-11-06",
				"endDate": "2020-11-22",
				"id": "2524738586775811",
				"title": "2508987893993728",
				"ratingOrg": "腾讯",
				"isPrefs": false,
				"certNo": "15615165",
				"memo": "备注",
				"channel": "途径",
				"_status": "Update"
			}
		],
		"ass": [
			{
				"beginDate": "2019-11-13",
				"endDate": "2019-11-23",
				"id": "2524738586775808",
				"score": "100",
				"assDoc": "151",
				"rank": "1",
				"_status": "Update",
				"memo": "备注"
			}
		],
		"certificate": [
			{
				"beginDate": "2021-11-18",
				"certificateCode": "156161",
				"endDate": "2021-12-18",
				"id": "2524738586775816",
				"authority": "腾讯",
				"_status": "Update",
				"certificateName": "证书"
			}
		],
		"dotline": [
			{
				"endDate": "2020-11-09",
				"lineName": "40017894856903424",
				"beginDate": "2020-11-08",
				"lineType": "2476736877794560",
				"id": "2524738586775821",
				"memo": "备注",
				"_status": "Update"
			}
		],
		"bankAcct": [
			{
				"openBank": "2493691868090624",
				"sysid": "diwork",
				"isDefaultCard": false,
				"bank": "2482441004520705",
				"acctType": "BAT00001",
				"currency": "2475282863117312",
				"id": "2524738586775813",
				"account": "165161",
				"_status": "Update"
			}
		],
		"cert": [
			{
				"certNo": "152020",
				"certType": "0017-2647-4d9f-81ea-4d6a96be26b2",
				"id": "2524738586775822",
				"endDate": "2021-11-19",
				"memo": "说明",
				"beginDate": "2021-11-19",
				"extendOrg": "阿里巴巴",
				"_status": "Update"
			}
		],
		"socialRel": [
			{
				"relName": "李浩",
				"id": "2524738586775810",
				"linkTel": "+86-15142845632",
				"relation": "2475282878944265",
				"linkAddr": "上海",
				"workCorp": "腾讯",
				"isUrgent": false,
				"workDuty": "程序员",
				"_status": "Update",
				"birthDate": "出生日期????示例：2021-11-18 00:00:00",
				"political": "政治面貌 传入id或code????示例：2508983411364096",
				"presentSituation": "现状 传入：企业职工",
				"appointmentExemptionForm": false
			}
		],
		"candidateJob": [
			{
				"endDate": "2021-11-02",
				"orgId": "2475303020597504",
				"newAttachment": "051636af-ac64-4aea-ba67-7b556c3f37af",
				"staffFte": "100%",
				"id": "2509224682574081",
				"psnclId": "d1170ea764cb4d95a30554cda58866c9",
				"trnsType": "2475282865689711",
				"trnsEvent": 1,
				"deptId": "2475353647993088",
				"beginDate": "2020-11-01",
				"showOrder": 9999999,
				"memo": "备注",
				"jobId": "88462662626",
				"jobTypeId": "88462662626",
				"postStatus": "4234543564564",
				"addrId": "1515151",
				"director": "34234534534",
				"jobRankId": "1",
				"jobGradeId": "59261",
				"postId": "15",
				"_status": "Update",
				"isweaken": false,
				"wageGroup": "薪资组",
				"waStruct": "3456",
				"bmLocation": "社保缴纳地",
				"newPostId": "32423",
				"empform": "用工形式"
			}
		],
		"title": [
			{
				"certType": "2476752253768960",
				"certCode": "02313",
				"endDate": "2021-11-11",
				"certRank": "2476752765736192",
				"isPrint": false,
				"beginDate": "2021-11-02",
				"assOrg": "华信",
				"id": "2524738586775819",
				"memo": "备注",
				"proField": "英语",
				"_status": "Update"
			}
		],
		"reward": [
			{
				"rewardReason": "李浩",
				"rewardOrg": "华信",
				"id": "2524738586775820",
				"rewardDate": "2021-11-02",
				"rewardItem": "大奖",
				"memo": "备注",
				"_status": "Update"
			}
		],
		"protocol": [
			{
				"termMonth": 1,
				"endDate": "2020-11-26",
				"protocolNum": "PROT000057",
				"majorCorpId": "2479635332305152",
				"protocolType": "2475283024958467",
				"contType": 1,
				"signDate": "2020-11-12",
				"beginDate": "2020-11-21",
				"newAttachment": "c6bce09e-f3e3-4142-903d-afc030a5d23a",
				"id": "2524738586775815",
				"isReceive": "false",
				"memo": "备注",
				"workAddr": "工作地点",
				"_status": "Update",
				"belongJob": "2524738586775815",
				"termUnit": ""
			}
		],
		"probation": [
			{
				"result": 1,
				"beginDate": "2020-11-01",
				"positiveDate": "2020-11-12",
				"endDate": "2020-11-07",
				"endFlag": false,
				"id": "2524738586775823",
				"type": 1,
				"memo": "备注",
				"_status": "Update"
			}
		],
		"train": [
			{
				"beginDate": "2021-11-03",
				"endDate": "2021-11-13",
				"id": "2524738586775809",
				"content": "英语",
				"status": "1",
				"earnHours": "33",
				"earnCredit": "100",
				"courseId": "78456",
				"classifiCation": "这是课程名称",
				"hours": "3",
				"memo": "备注",
				"protocolNo": "21212",
				"fee": "500",
				"score": "100",
				"dayOrHours": "1",
				"_status": "Update",
				"trainProjectName": "这是培训项目名称",
				"trainProjectCode": "45345",
				"trainingChannels": "1524147425060324276",
				"trainingType": "1541175827927663466",
				"trainingLocation": "1541175827927663544"
			}
		],
		"resume": [
			{
				"workCorp": "天海总公司",
				"beginDate": "2023-11-01",
				"workDept": "部门",
				"id": "a7e34c2a12c74e92aa062757560ba634",
				"endDate": "2022-11-19",
				"memo": "备注",
				"workDuty": "劳动",
				"workPost": "华信",
				"workJob": "123",
				"certifier": "哈哈",
				"_status": "Update"
			}
		],
		"edu": [
			{
				"education": "2476728898130176",
				"endDate": "2019-11-22",
				"degree": "2476730871353600",
				"beginDate": "2019-11-07",
				"newAttachment": "3e55f0e1-99bf-4cf5-93d9-47641d7c8709",
				"id": "2524738586759424",
				"studyMode": "05c03019-156f-47b5-8d46-20f57944a594",
				"major": "2524738586759424",
				"memo": "备注",
				"eduSystem": "1",
				"certifCode": "2524738586759424",
				"educationCtifCode": "2524738586759424",
				"isPrefs": false,
				"school": "42342354534",
				"_status": "Update"
			}
		],
		"ctrt": [
			{
				"continueTime": 1,
				"endDate": "2021-02-20",
				"termType": 1,
				"signDate": "2020-11-11",
				"probEndDate": "2020-12-2",
				"newAttachment": "76614af0-b8fb-45ec-95c9-27c2d062cfec",
				"id": "2524738586775817",
				"termMonth": 3,
				"majorCorpId": "2479635332305152",
				"workAddr": "2479635732058368",
				"isReceive": false,
				"contType": 1,
				"beginDate": "2020-11-20",
				"probSalary": 200,
				"proMonth": 1,
				"contractNum": "CTRT000459",
				"neconomy": "100",
				"startSalary": "50000",
				"memo": "备注",
				"contractCode": "120",
				"presenter": "45346456",
				"breachMoney": "5000",
				"proBeginDate": "2020-11-20",
				"_status": "Update",
				"belongJob": "2479635732058368",
				"termUnit": ""
			}
		],
		"proqualify": [
			{
				"beginDate": "2020-11-18",
				"getDate": "2021-11-01",
				"id": "2524738586775818",
				"title": "a7baf563-d9a1-4ac5-9331-fb640bc04aae",
				"memo": "备注",
				"certNo": "123",
				"ratingOrg": "123551516",
				"isPrefs": true,
				"endDate": "2021-11-01",
				"_status": "Update"
			}
		],
		"interview": [
			{
				"id": "7567876867867",
				"candidateId": "423423423423",
				"interviewEndTime": "2021-09-01 14:30:00",
				"interviewBeginTime": "2021-09-01 13:20:00",
				"interviewPlace": "面试地点",
				"interviewType": 1,
				"round": 2,
				"interviewResult": 1,
				"_status": "",
				"interviewScore": [
					{
						"id": "54336546456",
						"interviewId": "42343243424",
						"evaluateTime": "2021-09-01 14:39:00",
						"interviewExternalKey": "4324323",
						"interviewName": "这是面试官姓名",
						"interviewEmail": "32334545@qq.com",
						"isMain": false,
						"isForCc": true,
						"score": 89,
						"_status": "",
						"interviewEvaluation": [
							{
								"id": "423432423432",
								"interviewScoreId": "6755687867867",
								"evaluationInfo": "这是面试评价信息集",
								"evaluationPro": "这是评价项目名称",
								"evaluationContent": "这是点评内容",
								"_status": ""
							}
						]
					}
				]
			}
		],
		"referenceCheck": [
			{
				"id": "4323543536456456",
				"candidateId": "75675687",
				"intervieweeName": "被访谈人",
				"intervieweeCorp": "被访谈人单位",
				"intervieweePhone": "13222221111",
				"interviewDate": "2021-09-02",
				"interviewAdvice": "访谈建议",
				"intervieweeRelation": "与候选人关系",
				"interviewExecutor": "访谈执行人",
				"interviewMode": "访谈方式",
				"intervieweePost": "被访谈人职位",
				"interviewSituation": "访谈情况",
				"newAttachment": "423432425-4455656",
				"_status": ""
			}
		],
		"referenceCheckExternal": [
			{
				"id": "66456756",
				"candidateId": "423433243432",
				"type": 1,
				"riskLevel": "背调风险等级",
				"timeLine": "阶段报告",
				"createTime": "2023-09-08 12:01:09",
				"orderCode": "543534654",
				"menus": "背调套餐",
				"reportUrl": "https://3ed/5tgb",
				"status": "背调状态",
				"jiaoZhenMenuPrice": 123.98,
				"jiaoZhenRemark": "较真备注(较真)",
				"orderPrice": 12.88,
				"menuIteam": "包含产品",
				"workNumber": "工作段数",
				"newAttachment": "3232343rerer-434trtrtrt",
				"_status": ""
			}
		],
		"evaluationMessage": [
			{
				"id": "76878787878",
				"candidateId": "980909090",
				"name": "测评名称",
				"evaluationDate": "2026-06-07",
				"evaluationYear": "",
				"questionnaireName": "",
				"evaluationdimension_name": "",
				"newScore": 0,
				"evaluationrating_name": "",
				"attachlist": "",
				"score": "87",
				"memo": "",
				"type": 2,
				"dataCreateSource": "",
				"dataCreateBillid": "",
				"_status": "",
				"overallEvaluation": "心理健康总评",
				"newAttachment": "534534-4344657676"
			}
		],
		"writtenExamination": [
			{
				"id": "121323232",
				"candidateId": "45345564564747",
				"score": 23.99,
				"round": 1,
				"passStatus": "笔试结果",
				"totalScore": 87.9,
				"writternUrl": "https://12wqas/09ijhg",
				"type": 1,
				"_status": ""
			}
		],
		"defineSet": [
			{
				"id": "2533125235413248",
				"_status": "Update"
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
code	long	否	状态码 示例：200
message	string	否	消息 示例：操作成功
data	object	否	返回结果集
infos	object	是	候选人信息
failInfos	object	否	失败信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"infos": [
			{
				"id": "2548767078355200",
				"name": "李浩888",
				"certType": "0010-3600-41e2-8568-42fbc6c96c9d",
				"candidateStaffCode": "",
				"certNo": "090976543111111",
				"sex": "2",
				"birthDate": "2013-11-09",
				"mobile": "+86-13842946511",
				"officeTel": "1546816101",
				"email": "991111@1010.com",
				"selfEmail": "7111@qq.com",
				"joinWorkDate": "2018-11-09",
				"linkAddr": "沈阳",
				"education": "2476728905519360",
				"degree": "2476730873303296",
				"marital": "2475282874225665",
				"bloodType": "41eb36a1-4f93-4504-b4ae-91837e5b1a7e",
				"characterrpr": "5db087f8-8dbf-4426-9b61-9c3886f812a3",
				"permanreside": "bfbd1620-5cf3-11e9-817e-7cd30abea0c0",
				"workAgeAdjType": 1,
				"isOnlyChild": true,
				"political": "2508983411364096",
				"joinPolityDate": "2020-11-09",
				"nationality": "694d8570-3da8-4162-b521-1d0dfa2a13ea",
				"workAgeAdjDay": 1,
				"workAgeAdjMon": 1,
				"workAgeAdjYea": 1,
				"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
				"origin": "c04c67b2-5cf3-11e9-817e-7cd30abea0c0",
				"qq": "7787845448",
				"linkedIn": "0215141185",
				"bizManTag": false,
				"workAge": 2.5,
				"shopAssisTag": true,
				"attachlist": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"modifyTime": "2022-11-09 00:00:00",
				"modifier": "9a996f31-4315-4b93-b33f-f3e0fb0f39d2",
				"modifier_userName": "李四",
				"middleName": "这是中间名",
				"firstName": "张",
				"lastName": "无忌",
				"shortName": "lh888",
				"annualsalary": "434354.00",
				"salarystructure": "2345",
				"probationwage": 1234,
				"formalwage": 2345,
				"resumeUrl": "https://12wsx/4rfv",
				"evaluationUrl": "https://12wsx/4rfv",
				"assessUrl": "https://12wsx/4rfv",
				"examinationresults": "https://12wsx/4rfv",
				"recruitmenttype": "招聘类型",
				"resumesource": "这是来源",
				"personnelinformation": "https://12wsx/4rfv",
				"recruitmentitem": "这是招聘项目",
				"recruitPostId": "213243454656",
				"orgRel": [
					{
						"id": "53463564756756",
						"groupWorkAgeAdj": 2,
						"seniorityAdj": 2,
						"rmChannel": "",
						"entrySrc": "",
						"recruitPostId": "",
						"isReturn": true,
						"seniorityAdjType": "1",
						"seniorityAdjYea": 1,
						"seniorityAdjMon": 1,
						"seniorityAdjDay": 1,
						"groupAgeAdjType": "1",
						"groupAgeAdjYea": 1,
						"groupAgeAdjMon": 1,
						"groupAgeAdjDay": 1
					}
				],
				"langAbility": [
					{
						"proLevel": "2475282966107140",
						"language": "f74e0f14-5970-45f0-a09e-77d9d73849a1",
						"id": "2524738586775814",
						"certNo": "1651616",
						"langLevel": "高级",
						"memo": "备注",
						"getDate": "2020-11-22",
						"certName": "证书"
					}
				],
				"techPost": [
					{
						"beginDate": "2020-11-06",
						"endDate": "2020-11-22",
						"id": "2524738586775811",
						"title": "2508987893993728",
						"ratingOrg": "腾讯",
						"isPrefs": false,
						"certNo": "15615165",
						"memo": "备注",
						"channel": "途径"
					}
				],
				"ass": [
					{
						"beginDate": "2019-11-13",
						"endDate": "2019-11-23",
						"id": "2524738586775808",
						"score": "100",
						"assDoc": "151",
						"rank": "1",
						"memo": "备注"
					}
				],
				"certificate": [
					{
						"beginDate": "2021-11-18",
						"certificateCode": "156161",
						"endDate": "2021-12-18",
						"id": "2524738586775816",
						"authority": "腾讯",
						"certificateName": "证书"
					}
				],
				"dotline": [
					{
						"endDate": "2020-11-09",
						"lineName": "40017894856903424",
						"beginDate": "2020-11-08",
						"lineType": "2476736877794560",
						"id": "2524738586775821",
						"memo": "备注"
					}
				],
				"bankAcct": [
					{
						"openBank": "2493691868090624",
						"sysid": "diwork",
						"isDefaultCard": false,
						"bank": "2482441004520705",
						"acctType": "BAT00001",
						"currency": "2475282863117312",
						"id": "2524738586775813",
						"account": "165161"
					}
				],
				"cert": [
					{
						"certNo": "152020",
						"certType": "0017-2647-4d9f-81ea-4d6a96be26b2",
						"id": "2524738586775822",
						"endDate": "2021-11-19",
						"memo": "说明",
						"beginDate": "2021-11-19",
						"extendOrg": "阿里巴巴"
					}
				],
				"socialRel": [
					{
						"relName": "李浩",
						"id": "2524738586775810",
						"linkTel": "+86-15142845632",
						"relation": "2475282878944265",
						"linkAddr": "上海",
						"workCorp": "腾讯",
						"isUrgent": false,
						"workDuty": "程序员",
						"birthDate": "2000-11-09",
						"political": "5654767657"
					}
				],
				"candidateJob": [
					{
						"endDate": "2021-11-02",
						"orgId": "2475303020597504",
						"newAttachment": "051636af-ac64-4aea-ba67-7b556c3f37af",
						"staffFte": "100%",
						"id": "2509224682574081",
						"psnclId": "d1170ea764cb4d95a30554cda58866c9",
						"trnsType": "2475282865689711",
						"trnsEvent": 1,
						"deptId": "2475353647993088",
						"beginDate": "2020-11-01",
						"showOrder": 9999999,
						"memo": "备注",
						"jobId": "88462662626",
						"jobTypeId": "88462662626",
						"postStatus": "42325435345",
						"addrId": "1515151",
						"bmLocation": "大连",
						"director": "45645767567",
						"jobRankId": "1",
						"jobGradeId": "59261",
						"waStruct": "342345345345",
						"postId": "15",
						"staffjobCode": "ASG001",
						"empform": "564567567",
						"wageGroup": "7567566",
						"newPostId": "64574645"
					}
				],
				"title": [
					{
						"certType": "2476752253768960",
						"certCode": "02313",
						"endDate": "2021-11-11",
						"certRank": "2476752765736192",
						"isPrint": false,
						"beginDate": "2021-11-02",
						"assOrg": "华信",
						"id": "2524738586775819",
						"memo": "备注",
						"proField": "英语"
					}
				],
				"reward": [
					{
						"rewardReason": "李浩",
						"rewardOrg": "华信",
						"id": "2524738586775820",
						"rewardDate": "2021-11-02",
						"rewardItem": "大奖",
						"memo": "备注"
					}
				],
				"protocol": [
					{
						"termMonth": 0,
						"endDate": "2020-11-26",
						"protocolNum": "PROT000057",
						"majorCorpId": "2479635332305152",
						"protocolType": "2475283024958467",
						"contType": 1,
						"signDate": "2020-11-12",
						"beginDate": "2020-11-21",
						"newAttachment": "c6bce09e-f3e3-4142-903d-afc030a5d23a",
						"id": "2524738586775815",
						"isReceive": "false",
						"memo": "备注",
						"belongJob": "2524738586775815",
						"workAddr": "工作地点",
						"termUnit": ""
					}
				],
				"probation": [
					{
						"result": 1,
						"beginDate": "2020-11-01",
						"positiveDate": "2020-11-12",
						"endDate": "2020-11-07",
						"endFlag": false,
						"id": "2524738586775823",
						"type": 1,
						"memo": "备注"
					}
				],
				"train": [
					{
						"beginDate": "2021-11-03",
						"endDate": "2021-11-13",
						"id": "2524738586775809",
						"content": "英语",
						"status": "1",
						"earnHours": "33",
						"earnCredit": "100",
						"courseId": "78456",
						"classifiCation": "",
						"hours": "3",
						"memo": "备注",
						"protocolNo": "",
						"fee": "500",
						"score": "100",
						"dayOrHours": "1",
						"trainingChannels": "1524147425060324276",
						"trainingType": "1541175827927663466",
						"trainingLocation": "1541175827927663544"
					}
				],
				"resume": [
					{
						"workCorp": "天海总公司",
						"beginDate": "2023-11-01",
						"workDept": "部门",
						"id": "a7e34c2a12c74e92aa062757560ba634",
						"endDate": "2022-11-19 12:56:55",
						"memo": "备注",
						"workDuty": "劳动",
						"workPost": "华信",
						"workJob": "123",
						"certifier": "哈哈"
					}
				],
				"edu": [
					{
						"education": "2476728898130176",
						"endDate": "2019-11-22 00:00:00",
						"degree": "2476730871353600",
						"beginDate": "2019-11-07",
						"newAttachment": "3e55f0e1-99bf-4cf5-93d9-47641d7c8709",
						"id": "2524738586759424",
						"studyMode": "05c03019-156f-47b5-8d46-20f57944a594",
						"major": "2524738586759424",
						"memo": "备注",
						"eduSystem": "1",
						"certifCode": "2524738586759424",
						"educationCtifCode": "2524738586759424",
						"isPrefs": false,
						"school": "75675675675"
					}
				],
				"proqualify": [
					{
						"beginDate": "2020-11-18",
						"getDate": "2021-11-01",
						"id": "2524738586775818",
						"title": "a7baf563-d9a1-4ac5-9331-fb640bc04aae",
						"memo": "备注",
						"certNo": "123",
						"ratingOrg": "123551516",
						"isPrefs": true,
						"endDate": "2021-11-01"
					}
				],
				"ctrt": [
					{
						"continueTime": 1,
						"endDate": "2021-02-20",
						"termType": 1,
						"signDate": "2020-11-11",
						"probEndDate": "2020-12-20",
						"newAttachment": "76614af0-b8fb-45ec-95c9-27c2d062cfec",
						"id": "2524738586775817",
						"termMonth": 3,
						"majorCorpId": "2479635332305152",
						"workAddr": "2479635732058368",
						"isReceive": false,
						"contType": 1,
						"beginDate": "2020-11-20",
						"probSalary": 200,
						"proMonth": 1,
						"contractNum": "CTRT000459",
						"neconomy": "100",
						"startSalary": "50000",
						"memo": "备注",
						"contractCode": "120",
						"presenter": "867867678",
						"breachMoney": "5000",
						"belongJob": "2479635732058368",
						"proBeginDate": "2020-11-20",
						"termUnit": ""
					}
				],
				"interview": [
					{
						"id": "4564565464",
						"candidateId": "978978979797",
						"interviewBeginTime": "2021-09-01 12:30:30",
						"interviewEndTime": "2021-09-01 13:00:00",
						"interviewPlace": "这是面试地点",
						"interviewType": 1,
						"round": 1,
						"interviewResult": 0,
						"interviewScore": [
							{
								"id": "545345345",
								"interviewId": "6576587867",
								"evaluateTime": "2021-09-01 14:00:00",
								"interviewExternalKey": "654767556",
								"interviewName": "这是姓名",
								"interviewEmail": "233435@qq.com",
								"isMain": false,
								"isForCc": false,
								"score": 89,
								"interviewEvaluation": [
									{
										"id": "756756756",
										"interviewScoreId": "9797897978",
										"evaluationInfo": "这是面试评价信息集",
										"evaluationPro": "这是评价项目名称",
										"evaluationContent": "这是点评内容"
									}
								]
							}
						]
					}
				],
				"referenceCheck": [
					{
						"id": "424234234",
						"candidateId": "7567567567",
						"intervieweeName": "这是被访谈人",
						"intervieweeCorp": "这是被访谈人单位",
						"intervieweePhone": "13222090876",
						"interviewDate": "2023-09-09",
						"interviewAdvice": "这是访谈建议",
						"intervieweeRelation": "这是与候选人关系",
						"interviewExecutor": "这是访谈执行人",
						"interviewMode": "这是访谈方式",
						"intervieweePost": "这是被访谈人职位",
						"interviewSituation": "这是访谈情况",
						"newAttachment": "423432-65657676"
					}
				],
				"referenceCheckExternal": [
					{
						"id": "7575878",
						"candidateId": "3453534534",
						"type": 1,
						"riskLevel": "这是背调风险等级",
						"timeLine": "这是阶段报告",
						"createTime": "2023-09-08 13:20:21",
						"orderCode": "534536546",
						"menus": "这是背调套餐",
						"reportUrl": "https://qa345/fg678",
						"status": "这是背调状态",
						"jiaoZhenMenuPrice": 123.98,
						"jiaoZhenRemark": "这是较真备注(较真)",
						"orderPrice": 234.88,
						"menuIteam": "这是包含产品",
						"workNumber": "这是工作段数",
						"newAttachment": "54534534-24234234"
					}
				],
				"evaluationMessage": [
					{
						"id": "575675676",
						"candidateId": "6546456456",
						"name": "这是测评名称",
						"score": 12.88,
						"overallEvaluation": "这是心理健康总评",
						"type": 2,
						"newAttachment": "2534534-32423432"
					}
				],
				"writtenExamination": [
					{
						"id": "09089089908",
						"candidateId": "756756765756",
						"score": 34.9,
						"round": 2,
						"passStatus": "这是笔试结果",
						"totalScore": 89,
						"writternUrl": "https://2wsx/ty789",
						"type": 1
					}
				],
				"defineSet": [
					{
						"id": "2533125235413248"
					}
				]
			}
		],
		"failInfos": {}
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
"failCount": 1	"证件类型id:0010-3600-41e2-8568-42fbc6c96c9未找到	修正证件类型

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-14	
更新
请求说明
新增
请求参数 (10)
更新
请求参数 (73)
更新
返回参数 (43)
重新发布
	2	2025-06-20	
新增
请求参数 (4)
新增
返回参数 (4)
新增独生子女、培训渠道、培训类型和培训地
	3	2025-05-15	
新增
请求参数 (12)
更新
请求参数 workAddr
新增
返回参数 (12)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

