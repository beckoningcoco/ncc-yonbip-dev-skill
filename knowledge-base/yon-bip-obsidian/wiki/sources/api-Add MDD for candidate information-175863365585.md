---
title: "候选人信息国际化新增MDD"
apiId: "1758633655856005121"
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

# 候选人信息国际化新增MDD

>  请求方式	POST | Candidate Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/insertGlobalCandidate
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
code	string	否	是	候选人编码 示例：2511871812849920
candidateStaffCode	string	否	否	候选人员工编码，当开启 “候选人阶段是否生成员工编码”租户级参数配置时候必填
documenterId	string	否	否	制单人id 示例：453465447567567
applyId	string	否	否	大易申请id 例如: 123212909876 示例：234329098767
photo	string	否	否	头像地址url 示例：https://yyfw-oss2.oss-cn-beijing.aliyuncs.com/test_ggxeyop5_0000005429.jpg
age	int	否	否	年龄 示例：29
sex	int	否	否	性别；0：未知；1：男；2：女； 示例：2
birthDate	string	否	否	出生日期 如：2022-09-01 示例：2013-11-09
mobile	string	否	是	手机号 示例：+86-13842985777
officeTel	string	否	否	办公电话 示例：1546816777
email	string	否	否	邮箱 示例：321321@777.com
selfEmail	string	否	是	个人邮箱 示例：7777@qq.com
joinWorkDate	string	否	否	参加工作日期 如：2022-09-01 示例：2020-11-01
linkAddr	string	否	否	联系地址 示例：沈阳
education	string	否	否	学历 传入id或code 示例：2476728905519360
degree	string	否	否	学位 传入id或code 示例：2476730873303296
marital	string	否	否	婚姻状况 传入id或code 示例：2475282874225665
bloodType	string	否	否	血型 传入id或code 示例：41eb36a1-4f93-4504-b4ae-91837e5b1a7e
characterrpr	string	否	否	户口性质 传入id或code 示例：5db087f8-8dbf-4426-9b61-9c3886f812a3
permanreside	string	否	否	户口所在地 传入id或code 示例：bfbd1620-5cf3-11e9-817e-7cd30abea0c0
political	string	否	否	政治面貌 传入id或code 示例：2508983411364096
joinPolityDate	string	否	否	加入党团时间 如：2022-09-01 示例：2017-11-07
nationality	string	否	否	民族 传入id或code 示例：694d8570-3da8-4162-b521-1d0dfa2a13ea
country	string	否	否	国籍地区 传入id或code 示例：6cefdb2b-180f-4ba5-8710-fa5a27a108bb
origin	string	否	否	籍贯 传入id或code 示例：c04c67b2-5cf3-11e9-817e-7cd30abea0c0
qq	string	否	否	QQ 示例：7787845448
linkedIn	string	否	否	领英 示例：0215141185
bizManTag	int	否	否	业务员，1：是；0：否 示例：0
shopAssisTag	int	否	否	是否店员，1：是；0：否 示例：0
workAge	Decimal	否	否	工龄 示例：3.50
attachlist	string	否	否	附件 通过协同云的文件上传api，上传本地文件，绑定id，保存信息时附件设置为该id实现附件上传 示例：3f9ebc70-4058-11ec-863d-bb0606e88ccf
weiXin	string	否	否	微信 示例：42254565wx
firstName	string	否	否	候选人姓 示例：张
middleName	string	否	否	候选人中间名 示例：无
workAgeAdjType	string	否	否	工龄调整方式，1：增加；0：减少 示例：1
lastName	string	否	否	候选人名 示例：无忌
workAgeAdjYea	number
小数位数:0,最大长度:2	否	否	调整工龄(年数)：分别按年、月、日为单位填写司龄调整（如司龄调整1年2个月3天，此处填写1），最大不超过99 示例：1
shortName	string	否	否	候选人姓名简拼 示例：zwj
workAgeAdjMon	number
小数位数:0,最大长度:2	否	否	调整工龄(月数)：分别按年、月、日为单位填写司龄调整（如司龄调整1年2个月3天，此处填写2），最大不超过12 示例：1
personnelinformation	string	否	否	人员信息采集表链接 示例：https://ewrer/ytuyyuy
workAgeAdjDay	number
小数位数:0,最大长度:2	否	否	调整工龄(天数)：分别按年、月、日为单位填写司龄调整（如司龄调整1年2个月3天，此处填写3），最大不超过30 示例：1
recruitmentitem	string	否	否	招聘项目 示例：这是招聘项目
assessUrl	string	否	否	测评链接 示例：https://wrewrwere/qeweqeopopo
evaluationUrl	string	否	否	面试评价链接 示例：https://434terterytyrt/uiui878
recruitPostId	string	否	否	招聘职位id 示例：543433654767567
recruitmenttype	string	否	否	招聘类型 示例：这是招聘类型
resumesource	string	否	否	简历来源 示例：这是简历来源
formalwage	Decimal	否	否	转正工资 示例：2345.76
salarystructure	string	否	否	薪资结构 示例：2345
probationwage	Decimal	否	否	试用期工资 示例：1234.00
examinationresults	string	否	否	笔试成绩链接 示例：https://wewerer/ytytuyiui
resumeUrl	string	否	否	简历链接 示例：https://ewefdfd/hghgjhjh
annualsalary	Decimal	否	否	年薪 示例：456787.00
entrySchemeId	string	否	否	入职方案id 示例：66876565779080890
entrySchemeCategoryId	string	否	否	入职方案类别id 示例：897897868767576567576576
langAbility	object	是	否	语言能力
techPost	object	是	否	专业技术职务
ass	object	是	否	绩效记录
certificate	object	是	否	证书子集
dotline	object	是	否	虚线上级
bankAcct	object	是	否	银行账户
cert	object	是	是	证件信息
socialRel	object	是	否	社会关系
orgRel	object	是	否	工作关系子集
candidateJob	object	是	是	任职信息
title	object	是	否	职称记录
reward	object	是	否	奖励情况
protocol	object	是	否	协议信息
probation	object	是	否	试用信息
train	object	是	否	培训记录
resume	object	是	否	履历信息
edu	object	是	否	学历信息
proqualify	object	是	否	职业资格
ctrt	object	是	否	合同信息
referenceCheck	object	是	否	背调信息集合
referenceCheckExternal	object	是	否	外部背调信息集合
evaluationMessage	object	是	否	测评信息集合
writtenExamination	object	是	否	笔试信息集合
interview	object	是	否	面试轮次集合
defineSet	object	是	否	自定义信息集名称，表名+List
_status	string	否	是	操作标识, Insert:新增 示例：Insert 默认值：Insert
billFlag	int	否	是	单据标识 1：新增候选人必填 示例：1 默认值：1
nameDefines	object	否	是	姓名子集
address	object	是	否	地址信息子集
globalInfoHK	object	是	否	香港子集
globalInfoCHN	object	是	否	中国大陆子集
globalInfoUSA	object	是	否	美国子集
globalInfoGBR	object	是	否	英国全球化个人信息
globalInfoIND	object	是	否	印度全球化个人信息
globalInfoMAS	object	是	否	马来西亚全球化个人信息
globalInfoSIN	object	是	否	新加坡全球化个人信息

## 3. 请求示例

Url: /yonbip/hrcloud/insertGlobalCandidate?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "2511871812849920",
		"candidateStaffCode": "",
		"documenterId": "453465447567567",
		"applyId": "234329098767",
		"photo": "https://yyfw-oss2.oss-cn-beijing.aliyuncs.com/test_ggxeyop5_0000005429.jpg",
		"age": 29,
		"sex": 2,
		"birthDate": "2013-11-09",
		"mobile": "+86-13842985777",
		"officeTel": "1546816777",
		"email": "321321@777.com",
		"selfEmail": "7777@qq.com",
		"joinWorkDate": "2020-11-01",
		"linkAddr": "沈阳",
		"education": "2476728905519360",
		"degree": "2476730873303296",
		"marital": "2475282874225665",
		"bloodType": "41eb36a1-4f93-4504-b4ae-91837e5b1a7e",
		"characterrpr": "5db087f8-8dbf-4426-9b61-9c3886f812a3",
		"permanreside": "bfbd1620-5cf3-11e9-817e-7cd30abea0c0",
		"political": "2508983411364096",
		"joinPolityDate": "2017-11-07",
		"nationality": "694d8570-3da8-4162-b521-1d0dfa2a13ea",
		"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
		"origin": "c04c67b2-5cf3-11e9-817e-7cd30abea0c0",
		"qq": "7787845448",
		"linkedIn": "0215141185",
		"bizManTag": 0,
		"shopAssisTag": 0,
		"workAge": 3.5,
		"attachlist": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
		"weiXin": "42254565wx",
		"firstName": "张",
		"middleName": "无",
		"workAgeAdjType": "1",
		"lastName": "无忌",
		"workAgeAdjYea": 1,
		"shortName": "zwj",
		"workAgeAdjMon": 1,
		"personnelinformation": "https://ewrer/ytuyyuy",
		"workAgeAdjDay": 1,
		"recruitmentitem": "这是招聘项目",
		"assessUrl": "https://wrewrwere/qeweqeopopo",
		"evaluationUrl": "https://434terterytyrt/uiui878",
		"recruitPostId": "543433654767567",
		"recruitmenttype": "这是招聘类型",
		"resumesource": "这是简历来源",
		"formalwage": 2345.76,
		"salarystructure": "2345",
		"probationwage": 1234,
		"examinationresults": "https://wewerer/ytytuyiui",
		"resumeUrl": "https://ewefdfd/hghgjhjh",
		"annualsalary": 456787,
		"entrySchemeId": "66876565779080890",
		"entrySchemeCategoryId": "897897868767576567576576",
		"langAbility": [
			{
				"proLevel": "2475282966107140",
				"language": "f74e0f14-5970-45f0-a09e-77d9d73849a1",
				"certNo": "1651616",
				"langLevel": "高级",
				"memo": "备注",
				"getDate": "2020-11-22",
				"_status": "Insert",
				"certName": "证书"
			}
		],
		"techPost": [
			{
				"beginDate": "2020-11-06",
				"endDate": "2020-11-22",
				"title": "2508987893993728",
				"ratingOrg": "腾讯",
				"isPrefs": false,
				"certNo": "15615165",
				"memo": "备注",
				"channel": "途径",
				"_status": "Insert"
			}
		],
		"ass": [
			{
				"beginDate": "2019-11-13",
				"endDate": "2019-11-23",
				"score": "100",
				"assDoc": "151",
				"rank": "1",
				"_status": "Insert",
				"memo": "备注"
			}
		],
		"certificate": [
			{
				"beginDate": "2021-11-18",
				"certificateCode": "156161",
				"endDate": "2021-12-18",
				"authority": "腾讯",
				"_status": "Insert",
				"certificateName": "证书"
			}
		],
		"dotline": [
			{
				"endDate": "2020-11-09",
				"lineName": "40017894856903424",
				"beginDate": "2020-11-08",
				"lineType": "2476736877794560",
				"memo": "备注",
				"_status": "Insert"
			}
		],
		"bankAcct": [
			{
				"openBank": "2493691868090624",
				"sysid": "diwork",
				"isDefaultCard": false,
				"acctType": "BAT00001",
				"bank": "2482441004520705",
				"currency": "2475282863117312",
				"account": "165161",
				"accountName": "2345",
				"_status": "Insert",
				"countryName": ""
			}
		],
		"cert": [
			{
				"certNo": "152020",
				"certType": "0017-2647-4d9f-81ea-4d6a96be26b2",
				"endDate": "2021-11-19",
				"memo": "说明",
				"beginDate": "2021-11-19",
				"extendOrg": "阿里巴巴",
				"_status": "Insert",
				"isPrefs": "",
				"countryName": ""
			}
		],
		"socialRel": [
			{
				"relName": "李浩",
				"linkTel": "+86-15142845632",
				"relation": "2475282878944265",
				"linkAddr": "上海",
				"workCorp": "腾讯",
				"isUrgent": false,
				"_status": "Insert",
				"workDuty": "程序员"
			}
		],
		"orgRel": [
			{
				"groupWorkAgeAdj": 2,
				"seniorityAdj": 2,
				"rmChannel": "3453654645",
				"entrySrc": "756756756756756",
				"recruitPostId": "53456765876868678",
				"isReturn": false,
				"_status": "Insert",
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
		"candidateJob": [
			{
				"endDate": "2021-11-02",
				"orgId": "2475303020597504",
				"newAttachment": "051636af-ac64-4aea-ba67-7b556c3f37af",
				"staffFte": "100%",
				"psnclId": "d1170ea764cb4d95a30554cda58866c9",
				"trnsType": "2475282865689711",
				"trnsEvent": 1,
				"trnsReason": "534536564576756",
				"deptId": "2475353647993088",
				"beginDate": "2020-11-01",
				"memo": "备注",
				"jobId": "88462662626",
				"jobTypeId": "88462662626",
				"postStatus": "567565786786",
				"addrId": "1515151",
				"director": "423423432235435",
				"jobRankId": "1",
				"jobGradeId": "59261",
				"postId": "15",
				"_status": "Insert",
				"isweaken": false,
				"wageGroup": "2345",
				"waStruct": "78798989",
				"newPostId": "2345",
				"bmLocation": "1515151",
				"empform": "2345",
				"localOrgId": "7867855543545"
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
				"memo": "备注",
				"proField": "英语",
				"_status": "Insert"
			}
		],
		"reward": [
			{
				"rewardReason": "李浩",
				"rewardOrg": "华信",
				"rewardDate": "2021-11-02",
				"rewardItem": "大奖",
				"memo": "备注",
				"_status": "Insert"
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
				"isReceive": false,
				"memo": "备注",
				"workAddr": "工作地点",
				"_status": "Insert",
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
				"type": 1,
				"memo": "备注",
				"_status": "Insert"
			}
		],
		"train": [
			{
				"beginDate": "2021-11-03",
				"endDate": "2021-11-13",
				"content": "英语",
				"status": "1",
				"earnHours": "33",
				"earnCredit": "100",
				"courseId": "78456",
				"classifiCation": "这是课程名称",
				"hours": "3",
				"memo": "备注",
				"protocolNo": "4564756",
				"fee": "500",
				"score": "100",
				"dayOrHours": "1",
				"_status": "Insert",
				"trainProjectName": "这是培训项目名称",
				"trainProjectCode": "3423",
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
				"endDate": "2022-11-19",
				"memo": "备注",
				"workDuty": "劳动",
				"workPost": "华信",
				"workJob": "123",
				"certifier": "哈哈",
				"_status": "Insert"
			}
		],
		"edu": [
			{
				"education": "2476728898130176",
				"endDate": "2019-11-22",
				"degree": "2476730871353600",
				"beginDate": "2019-11-07",
				"newAttachment": "3e55f0e1-99bf-4cf5-93d9-47641d7c8709",
				"studyMode": "05c03019-156f-47b5-8d46-20f57944a594",
				"major": "2524738586759424",
				"memo": "备注",
				"eduSystem": "1",
				"certifCode": "2524738586759424",
				"educationCtifCode": "2524738586759424",
				"isPrefs": false,
				"school": "23423454545",
				"_status": "Insert"
			}
		],
		"proqualify": [
			{
				"beginDate": "2020-11-18",
				"getDate": "2021-11-01",
				"title": "a7baf563-d9a1-4ac5-9331-fb640bc04aae",
				"memo": "备注",
				"certNo": "123",
				"ratingOrg": "123551516",
				"isPrefs": true,
				"endDate": "2021-11-01",
				"_status": "Insert"
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
				"termMonth": 3,
				"majorCorpId": "2479635332305152",
				"isReceive": false,
				"contType": 1,
				"beginDate": "2020-11-20",
				"probSalary": 200,
				"proMonth": 1,
				"contractNum": "CTRT000459",
				"neconomy": 100,
				"startSalary": 50000,
				"memo": "备注",
				"contractCode": "120",
				"presenter": "53456456457",
				"breachMoney": 5000,
				"proBeginDate": "2020-11-20",
				"_status": "Insert",
				"termUnit": "",
				"workAddr": ""
			}
		],
		"referenceCheck": [
			{
				"intervieweeName": "杨一一",
				"intervieweeCorp": "我是单位",
				"intervieweePhone": "13000292827",
				"interviewDate": "2021-09-09",
				"interviewAdvice": "我是访谈建议",
				"intervieweeRelation": "关系",
				"interviewExecutor": "执行人",
				"interviewMode": "访谈方式",
				"intervieweePost": "职位",
				"interviewSituation": "访谈情况",
				"newAttachment": "53453465475675878",
				"_status": "Insert"
			}
		],
		"referenceCheckExternal": [
			{
				"type": 1,
				"riskLevel": "我是背调风险等级",
				"timeLine": "阶段报告",
				"createTime": "2021-09-09 12:01:01",
				"orderCode": "3232434343",
				"menus": "背调套餐",
				"reportUrl": "我是报告链接",
				"status": "我是背调状态",
				"jiaoZhenMenuPrice": 2223,
				"jiaoZhenRemark": "较真备注(较真)",
				"orderPrice": 234,
				"menuIteam": "包含产品",
				"workNumber": "我是工作段数",
				"newAttachment": "中/英文报告",
				"_status": "Insert"
			}
		],
		"evaluationMessage": [
			{
				"score": "234",
				"overallEvaluation": "心理健康总评",
				"name": "测评名称",
				"type": 0,
				"newAttachment": "测评报告",
				"_status": "Insert"
			}
		],
		"writtenExamination": [
			{
				"score": 123,
				"round": 1,
				"totalScore": 234,
				"passStatus": "我是笔试结果",
				"writternUrl": "我是笔试链接",
				"type": 1,
				"_status": "Insert"
			}
		],
		"interview": [
			{
				"interviewBeginTime": "2021-09-08 13:30:00",
				"interviewEndTime": "2021-09-08 14:30:00",
				"interviewPlace": "我是面试地点",
				"interviewType": "初试",
				"round": 1,
				"interviewResult": 0,
				"_status": "Insert",
				"interviewScore": [
					{
						"evaluateTime": "2021-09-08 15:00:00",
						"interviewEmail": "1234543@qq.com",
						"isMain": false,
						"interviewExternalKey": "12345678",
						"score": 87,
						"interviewName": "面试官姓名",
						"isForCc": false,
						"_status": "Insert",
						"interviewEvaluation": [
							{
								"evaluationInfo": "这是面试评价信息集",
								"evaluationPro": "这是评价项目名称",
								"evaluationContent": "这是点评内容",
								"_status": "Insert"
							}
						]
					}
				]
			}
		],
		"defineSet": [
			{
				"_status": "Insert"
			}
		],
		"_status": "Insert",
		"billFlag": 1,
		"nameDefines": {
			"country_name": "",
			"middle_name": "",
			"_status": "",
			"first_name": "",
			"last_name": "",
			"nick_name": "",
			"local_name": "",
			"father_name": "",
			"mother_name": "",
			"appellation": "",
			"displayName": ""
		},
		"address": [
			{
				"addressType": "",
				"country": "",
				"isPrefs": true,
				"addressDefines": {
					"displayName": "",
					"province": "",
					"city": "",
					"district": "",
					"postcode": "",
					"addressone": "",
					"addresstwo": "",
					"addressthree": "",
					"addressfour": "",
					"addressfive": "",
					"addresssix": "",
					"addressseven": "",
					"addresseight": "",
					"addressnine": "",
					"addressten": "",
					"addresseleven": "",
					"addresstwelve": "",
					"addressthirteen": "",
					"addressfourteen": "",
					"addressfifteen": "",
					"_status": ""
				},
				"_status": ""
			}
		],
		"globalInfoHK": [
			{
				"citizenship": "",
				"sex": "",
				"marital": "",
				"foreignNationality": true,
				"arriveHKDate": "2026-06-07",
				"marriageDate": "2026-06-07",
				"_status": "",
				"effectiveTime": "2026-06-07",
				"continuousContributions": true,
				"industryPlan": true,
				"contributionSchemeName": "",
				"retirementPlan": 0
			}
		],
		"globalInfoCHN": [
			{
				"sex": "",
				"characterrpr": "",
				"political": "",
				"origin": "",
				"nationality": "",
				"joinPolityDate": "2026-06-07",
				"citizenship": "",
				"formalPartyDate": "2026-06-07",
				"marriageDate": "2026-06-07",
				"_status": "",
				"maritalName": "",
				"religionName": "",
				"effectiveTime": "2026-06-07"
			}
		],
		"globalInfoUSA": [
			{
				"sex": "",
				"exsoldier": true,
				"ethnicity": "",
				"citizenship": "",
				"_status": "",
				"maritalName": "",
				"effectiveTime": "2026-06-07"
			}
		],
		"globalInfoGBR": [
			{
				"effectiveTime": "2026-06-07",
				"sex": "",
				"marital": "",
				"religion": "",
				"ethnicity": "",
				"noc": 0,
				"_status": ""
			}
		],
		"globalInfoIND": [
			{
				"effectiveTime": "2026-06-07",
				"sex": "",
				"marital": "",
				"religion": "",
				"casteOfIndia": "",
				"noc": 0,
				"occupationCode": "",
				"citizenship": "",
				"_status": ""
			}
		],
		"globalInfoMAS": [
			{
				"effectiveTime": "2026-06-07",
				"sex": "",
				"marital": "",
				"religion": "",
				"aboriginal": true,
				"citizenship": "",
				"_status": ""
			}
		],
		"globalInfoSIN": [
			{
				"effectiveTime": "2026-06-07",
				"sex": 0,
				"marital": "",
				"religion": "",
				"ethnicity": "",
				"noc": 0,
				"citizenship": "",
				"_status": ""
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
code	string	否	状态码 示例：200
message	string	否	消息 示例：操作成功
data	object	否	返回结果集
infos	object	是	候选人信息
failInfos	object	否	失败信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"infos": [
			{
				"id": "2511871812849920",
				"name": "测试1234",
				"photo": "https://yyfw-oss2.oss-cn-beijing.aliyuncs.com/test_ggxeyop5_0000005429.jpg",
				"code": "534656",
				"candidateStaffCode": "",
				"applyId": "678987670090",
				"certType": "0010-3600-41e2-8568-42fbc6c96c9d",
				"certNo": "0909765437777",
				"documenterId": "5346564756765",
				"annualsalary": 456780,
				"salarystructure": "1234",
				"probationwage": 1234,
				"formalwage": 2345,
				"resumeUrl": "https://qw23/3edcv",
				"evaluationUrl": "https://qw23/3edcv",
				"assessUrl": "https://qw23/3edcv",
				"examinationresults": "https://qw23/3edcv",
				"recruitmenttype": "这是招聘类型",
				"resumesource": "这是简历来源",
				"personnelinformation": "https://qw23/3edcv",
				"recruitmentitem": "这是招聘项目",
				"recruitPostId": "354667879898",
				"sex": 2,
				"birthDate": "2013-11-09",
				"mobile": "+86-13842985777",
				"officeTel": "1546816777",
				"email": "321321@777.com",
				"workAgeAdjType": "1",
				"selfEmail": "7777@qq.com",
				"joinWorkDate": "2020-11-01",
				"age": 29,
				"workAgeAdjYea": 1,
				"linkAddr": "沈阳",
				"education": "2476728905519360",
				"degree": "2476730873303296",
				"workAgeAdjMon": 1,
				"marital": "2475282874225665",
				"bloodType": "41eb36a1-4f93-4504-b4ae-91837e5b1a7e",
				"characterrpr": "5db087f8-8dbf-4426-9b61-9c3886f812a3",
				"workAgeAdjDay": 1,
				"permanreside": "bfbd1620-5cf3-11e9-817e-7cd30abea0c0",
				"political": "2508983411364096",
				"joinPolityDate": "2017-11-07",
				"nationality": "694d8570-3da8-4162-b521-1d0dfa2a13ea",
				"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
				"origin": "c04c67b2-5cf3-11e9-817e-7cd30abea0c0",
				"qq": "7787845448",
				"linkedIn": "0215141185",
				"bizManTag": 0,
				"shopAssisTag": 0,
				"attachlist": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"shortName": "zwj",
				"staffId": "34567890",
				"weiXin": "43565656wx",
				"firstName": "张",
				"middleName": "无",
				"lastName": "无忌",
				"entrySchemeId": "66876565779080890",
				"entrySchemeCategoryId": "897897868767576567576576",
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
						"account": "165161",
						"accountName": "345"
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
						"workDuty": "程序员"
					}
				],
				"orgRel": [
					{
						"id": "756758768678",
						"candidateId": "645645645645",
						"groupWorkAgeAdj": 2,
						"seniorityAdj": 2,
						"rmChannel": "425345346546456",
						"entrySrc": "535343354534",
						"recruitPostId": "53465645756756",
						"isReturn": false,
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
				"candidateJob": [
					{
						"isMainJob": true,
						"endDate": "2021-11-02",
						"endFlag": true,
						"orgId": "2475303020597504",
						"newAttachment": "051636af-ac64-4aea-ba67-7b556c3f37af",
						"staffFte": "100%",
						"id": "2509224682574081",
						"psnclId": "d1170ea764cb4d95a30554cda58866c9",
						"trnsType": "2475282865689711",
						"trnsEvent": 1,
						"trnsReason": "5334654676575",
						"deptId": "2475353647993088",
						"beginDate": "2020-11-01",
						"showOrder": 9999999,
						"memo": "备注",
						"jobId": "88462662626",
						"jobTypeId": "88462662626",
						"postStatus": "656457657567",
						"addrId": "1515151",
						"bmLocation": "大连",
						"director": "2342343254324",
						"jobRankId": "1",
						"jobGradeId": "59261",
						"waStruct": "75675675674645",
						"postId": "15",
						"empform": "675675867867",
						"staffjobCode": "ASG001",
						"staffjobId": "123353242223",
						"effectiveNumber": 0,
						"isweaken": true,
						"wageGroup": "32433434",
						"newPostId": "职位",
						"localOrgId": "65468679789"
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
						"isReceive": false,
						"memo": "备注",
						"workAddr": "工作地点",
						"belongJob": "123432444444",
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
						"classifiCation": "这是课程名称",
						"hours": "3",
						"memo": "备注",
						"protocolNo": "45644",
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
						"endDate": "2019-11-22",
						"degree": "2476730871353600",
						"beginDate": "2019-11-07 00:00:00",
						"newAttachment": "3e55f0e1-99bf-4cf5-93d9-47641d7c8709",
						"id": "2524738586759424",
						"studyMode": "05c03019-156f-47b5-8d46-20f57944a594",
						"major": "2524738586759424",
						"memo": "备注",
						"eduSystem": "1",
						"certifCode": "2524738586759424",
						"educationCtifCode": "2524738586759424",
						"isPrefs": false,
						"school": ""
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
						"neconomy": 100,
						"startSalary": 50000,
						"memo": "备注",
						"contractCode": "120",
						"presenter": "5353453534",
						"breachMoney": 5000,
						"proBeginDate": "2020-11-20",
						"belongJob": "143311112243",
						"termUnit": ""
					}
				],
				"interview": [
					{
						"id": "345445454534",
						"candidateId": "32343435454",
						"interviewBeginTime": "2021-09-09 12:09:09",
						"interviewEndTime": "2021-09-10 13:00:00",
						"interviewPlace": "面试地点",
						"interviewType": "初试",
						"round": 1,
						"interviewResult": 0,
						"interviewScore": [
							{
								"id": "3232434343",
								"interviewId": "909898978788",
								"evaluateTime": "2021-09-09-12:00:01",
								"interviewExternalKey": "12345654",
								"interviewName": "我是面试官姓名",
								"interviewEmail": "1019191818@qq.com",
								"isMain": false,
								"isForCc": false,
								"score": "12",
								"interviewEvaluation": [
									{
										"id": "434343545",
										"interviewScoreId": "898932938293",
										"evaluationInfo": "我是面试评价信息集",
										"evaluationPro": "我是评价项目名称",
										"evaluationContent": "我是点评内容"
									}
								]
							}
						]
					}
				],
				"referenceCheck": [
					{
						"id": "76756756756",
						"candidateId": "76756767567",
						"intervieweeName": "我是被访谈人",
						"intervieweeCorp": "我是被访谈人单位",
						"intervieweePhone": "13209890981",
						"interviewDate": "2021-08-01",
						"interviewAdvice": "我是访谈建议",
						"intervieweeRelation": "我是与候选人关系",
						"interviewExecutor": "我是访谈执行人",
						"interviewMode": "我是访谈方式",
						"intervieweePost被访谈人职位": "我是被访谈人职位",
						"interviewSituation": "我是访谈情况",
						"newAttachment": "我是背调附件"
					}
				],
				"referenceCheckExternal": [
					{
						"id": "867867866878",
						"candidateId": "756567567567",
						"type": 1,
						"riskLevel": "我是背调风险等级",
						"timeLine": "我是阶段报告",
						"createTime": "2021-09-09 12:09:08",
						"orderCode": "24234234",
						"menus": "我是背调套餐",
						"reportUrl": "我是报告链接",
						"status": "我是背调状态",
						"jiaoZhenMenuPrice": 234,
						"jiaoZhenRemark": "我是较真备注(较真)",
						"orderPrice": 232,
						"menuIteam": "我是包含产品",
						"workNumber": "我是工作段数",
						"newAttachment": "我是中/英文报告"
					}
				],
				"evaluationMessage": [
					{
						"id": "86799879789",
						"candidateId": "5346456456456",
						"score": "123",
						"overallEvaluation": "我是心理健康总评",
						"name": "我是测评名称",
						"type": 0,
						"newAttachment": "我是测评报告"
					}
				],
				"writtenExamination": [
					{
						"id": "4234234234",
						"candidateId": "756756757",
						"score": "222",
						"round": 1,
						"passStatus": "我是笔试结果",
						"totalScore": 89,
						"writternUrl": "我是笔试链接",
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
999	证件类型错误!	请修改证件类型

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-20	
新增
请求参数 trainingChannels
新增
请求参数 trainingType
新增
请求参数 trainingLocation
新增
返回参数 trainingChannels
新增
返回参数 trainingType
新增
返回参数 trainingLocation
新增培训渠道、培训类型和培训地
	2	2025-05-15	
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

