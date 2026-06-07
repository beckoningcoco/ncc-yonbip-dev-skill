---
title: "国际化员工信息更新MDD"
apiId: "1938874904783880193"
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

# 国际化员工信息更新MDD

>  请求方式	POST | Employee Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/globalUpdatedetail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据
id	string	否	是	员工ID或编码 示例：2511871812849920
dataCreateSource	string	否	否	数据来源，仅新增赋值，不可更新
dataCreateBillid	string	否	否	数据来源单据号，仅新增赋值，不可更新
birthDate	string	否	否	出生日期 示例：2013-11-09
mobile	string	否	否	手机号 示例：+86-13842985777
officeTel	string	否	否	办公电话 示例：1546816777
email	string	否	否	邮箱 示例：321321@777.com
selfEmail	string	否	否	个人邮箱 示例：7777@qq.com
joinWorkDate	string	否	否	参加工作日期 示例：2020-11-01
education	string	否	否	学历 传入id或code 示例：2476728905519360
degree	string	否	否	学位 传入id或code 示例：2476730873303296
bloodType	string	否	否	血型 传入id或code 示例：41eb36a1-4f93-4504-b4ae-91837e5b1a7e
characterrpr	string	否	否	户口性质 传入id或code 示例：5db087f8-8dbf-4426-9b61-9c3886f812a3
permanreside	string	否	否	户口所在地 传入id或code 示例：bfbd1620-5cf3-11e9-817e-7cd30abea0c0
political	string	否	否	政治面貌 传入id或code 示例：2508983411364096
joinPolityDate	string	否	否	加入党团时间 示例：2017-11-07
workAgeAdjType	string	否	否	工龄调整方式，1：增加；0：减少 示例：1
workAgeAdjYea	number
小数位数:0,最大长度:2	否	否	调整工龄(年数)：分别按年、月、日为单位填写司龄调整（如司龄调整1年2个月3天，此处填写1），最大不超过99 示例：1
workAgeAdjMon	number
小数位数:0,最大长度:2	否	否	调整工龄(月数)：分别按年、月、日为单位填写司龄调整（如司龄调整1年2个月3天，此处填写2），最大不超过12 示例：1
workAgeAdjDay	number
小数位数:0,最大长度:2	否	否	调整工龄(天数)：分别按年、月、日为单位填写司龄调整（如司龄调整1年2个月3天，此处填写3），最大不超过30 示例：1
nationality	string	否	否	民族 传入id或code 示例：694d8570-3da8-4162-b521-1d0dfa2a13ea
country	string	否	否	国籍地区 传入id或code 示例：6cefdb2b-180f-4ba5-8710-fa5a27a108bb
origin	string	否	否	籍贯 传入id或code 示例：c04c67b2-5cf3-11e9-817e-7cd30abea0c0
qq	string	否	否	QQ 示例：7787845448
linkedIn	string	否	否	领英 示例：0215141185
bizManTag	string	否	否	业务员，1：是；0：否 示例：false
shopAssisTag	string	否	否	是否店员，1：是；0：否 示例：true
attachlist	string	否	否	附件 通过协同云的文件上传api，上传本地文件，绑定id，保存信息时附件设置为该id实现附件上传 示例：3f9ebc70-4058-11ec-863d-bb0606e88ccf
weiXin	string	否	否	微信
formerName	string	否	否	曾用名 示例：测试5678
englishName	string	否	否	英文名 示例：test1234
documentValidity	string	否	否	证件有效期 示例：2014-03-23
height	string	否	否	身高 示例：173
weight	string	否	否	体重 示例：70
postcode	string	否	否	邮政编码 示例：431728
birthPlace	string	否	否	出生地 传入id或code 示例：23789829322133
religion	string	否	否	宗教信仰 传入id或code 示例：1493439902010001
hobby	string	否	否	特长爱好
staffLangAbility	object	是	否	语言能力
staffTechPost	object	是	否	专业技术职务
staffAss	object	是	否	绩效记录
staffCertificate	object	是	否	证书子集
staffDotline	object	是	否	虚线上级
staffBankAcct	object	是	否	银行账户
staffPart	object	是	否	其他任职信息
staffCert	object	是	否	证件信息
staffSocialRel	object	是	否	社会关系
staffJob	object	是	否	任职信息 离职人员不允许编辑
staffTitle	object	是	否	职称记录
staffReward	object	是	否	奖励情况
staffProtocol	object	是	否	协议信息
staffProbation	object	是	否	试用信息
staffTrain	object	是	否	培训记录
staffResume	object	是	否	履历信息
staffEdu	object	是	否	学历信息
staffProqualify	object	是	否	职业资格
staffCtrt	object	是	否	合同信息
staffOrgRel	object	是	否	工作关系 只能更新 不能新增
staffVODefine	object	否	否	基本信息自定义项
defineSet	object	是	否	自定义信息集名称，表名+List
staffNameTZDefines	object	是	否	姓名时间轴数据子集
staffAddress	object	是	否	地址信息
staffGlobalInfoCHN	object	是	否	中国大陆全球化个人信息
staffGlobalInfoGBR	object	是	否	英国全球化个人信息
staffGlobalInfoIND	object	是	否	印度全球化个人信息
staffGlobalInfoMAS	object	是	否	马来西亚全球化个人信息
staffGlobalInfoSIN	object	是	否	新加坡全球化个人信息
staffGlobalInfoUSA	object	是	否	美国全球化个人信息
staffHealthSituation	object	否	否	健康信息
staffSocietyEmployment	object	是	否	社会任职信息
staffDirectiorSupervisor	object	是	否	董监高信息
staffLeadershipTrade	object	是	否	党组/工会信息
staffTrialEvaluation	object	是	否	试用考核结果
staffCadre	object	是	否	任免信息
staffPunishment	object	是	否	惩处信息
staffGlobalInfoHK	object	是	否	香港全球化个人信息

## 3. 请求示例

Url: /yonbip/hrcloud/globalUpdatedetail?access_token=访问令牌
Body: {
	"data": {
		"id": "2511871812849920",
		"dataCreateSource": "",
		"dataCreateBillid": "",
		"birthDate": "2013-11-09",
		"mobile": "+86-13842985777",
		"officeTel": "1546816777",
		"email": "321321@777.com",
		"selfEmail": "7777@qq.com",
		"joinWorkDate": "2020-11-01",
		"education": "2476728905519360",
		"degree": "2476730873303296",
		"bloodType": "41eb36a1-4f93-4504-b4ae-91837e5b1a7e",
		"characterrpr": "5db087f8-8dbf-4426-9b61-9c3886f812a3",
		"permanreside": "bfbd1620-5cf3-11e9-817e-7cd30abea0c0",
		"political": "2508983411364096",
		"joinPolityDate": "2017-11-07",
		"workAgeAdjType": "1",
		"workAgeAdjYea": 1,
		"workAgeAdjMon": 1,
		"workAgeAdjDay": 1,
		"nationality": "694d8570-3da8-4162-b521-1d0dfa2a13ea",
		"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
		"origin": "c04c67b2-5cf3-11e9-817e-7cd30abea0c0",
		"qq": "7787845448",
		"linkedIn": "0215141185",
		"bizManTag": "false",
		"shopAssisTag": "true",
		"attachlist": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
		"weiXin": "",
		"formerName": "测试5678",
		"englishName": "test1234",
		"documentValidity": "2014-03-23",
		"height": "173",
		"weight": "70",
		"postcode": "431728",
		"birthPlace": "23789829322133",
		"religion": "1493439902010001",
		"hobby": "",
		"staffLangAbility": [
			{
				"proLevel": "2475282966107140",
				"language": "f74e0f14-5970-45f0-a09e-77d9d73849a1",
				"id": "2524738586775814",
				"certNo": "1651616",
				"langLevel": "高级",
				"memo": "备注",
				"getDate": "2020-11-22 00:00:00",
				"_status": "Update",
				"certName": "证书",
				"staffLangAbilityVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffTechPost": [
			{
				"beginDate": "2020-11-06 00:00:00",
				"endDate": "2020-11-22 00:00:00",
				"id": "2524738586775811",
				"title": "2508987893993728",
				"ratingOrg": "腾讯",
				"isPrefs": false,
				"certNo": "15615165",
				"memo": "备注",
				"channel": "途径",
				"level": "",
				"professionalTitleSeries": "",
				"subseries": "",
				"qualificationNumber": "",
				"professionSpecialties": "",
				"acquisitionMethod": "",
				"_status": "Update",
				"staffTechPostVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffAss": [
			{
				"beginDate": "2019-11-13 00:00:00",
				"endDate": "2019-11-23 00:00:00",
				"id": "2524738586775808",
				"score": "100",
				"assDoc": "151",
				"rank": "1",
				"assPeriod": "134768927873722",
				"_status": "Update",
				"memo": "备注",
				"staffAssVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffCertificate": [
			{
				"beginDate": "2021-11-18 00:00:00",
				"certificateCode": "156161",
				"endDate": "2021-12-18 00:00:00",
				"id": "2524738586775816",
				"authority": "腾讯",
				"_status": "Update",
				"certificateName": "证书",
				"staffCertificateVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				}
			}
		],
		"staffDotline": [
			{
				"endDate": "2020-11-09 00:00:00",
				"lineName": "40017894856903424",
				"beginDate": "2020-11-08 00:00:00",
				"lineType": "2476736877794560",
				"id": "2524738586775821",
				"memo": "备注",
				"_status": "Update",
				"staffDotlineVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffBankAcct": [
			{
				"openBank": "2493691868090624",
				"sysid": "diwork",
				"isDefaultCard": 0,
				"bank": "2482441004520705",
				"acctType": "BAT00001",
				"currency": "2475282863117312",
				"id": "2524738586775813",
				"account": "165161",
				"_status": "Update",
				"staffBankAcctVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"country": "",
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffPart": [
			{
				"isMainJob": false,
				"endDate": "2021-11-03 00:00:00",
				"deptId": "2479811238465792",
				"endFlag": true,
				"orgId": "2475303020597504",
				"beginDate": "2021-11-01 00:00:00",
				"id": "2524738586775812",
				"postId": "851512632",
				"jobId": "151652632",
				"jobTypeId": "151652632",
				"memo": "备注",
				"jobGradeId": "1",
				"director": "王",
				"addrId": "8946126",
				"staffFte": "",
				"_status": "Update",
				"staffPartVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"isweaken": true,
				"trnsEvent": 5,
				"trnsType": "hrem_otherjob11",
				"partType": "2475283023074308",
				"staffjobCode": "ASG001",
				"jobRankId": "",
				"empform": "",
				"effectiveNumber": 1,
				"psnclId": "",
				"planEndDate": "2023-10-10",
				"dataCreateSource": "",
				"dataCreateBillid": "",
				"otherJobType": "1"
			}
		],
		"staffCert": [
			{
				"certNo": "152020",
				"certType": "0017-2647-4d9f-81ea-4d6a96be26b2",
				"id": "2524738586775822",
				"endDate": "2021-11-19 12:56:55",
				"memo": "说明",
				"beginDate": "2021-11-19 12:56:55",
				"extendOrg": "阿里巴巴",
				"_status": "Update",
				"staffCertVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"isPrefs": "",
				"country": ""
			}
		],
		"staffSocialRel": [
			{
				"relName": "李浩",
				"id": "2524738586775810",
				"linkTel": "+86-15142845632",
				"relation": "2475282878944265",
				"linkAddr": "上海",
				"workCorp": "腾讯",
				"isUrgent": false,
				"workDuty": "程序员",
				"certType": "0010-3600-41e2-8568-42fbc6c96c9d",
				"certNo": "152020",
				"isRelocate": "false",
				"_status": "Update",
				"staffSocialRelVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"dataCreateSource": "",
				"dataCreateBillid": "",
				"certIssuePlace": ""
			}
		],
		"staffJob": [
			{
				"endDate": "2021-11-02 00:00:00",
				"endFlag": true,
				"orgId": "2475303020597504",
				"newAttachment": "051636af-ac64-4aea-ba67-7b556c3f37af",
				"staffFte": "100%",
				"id": "2509224682574081",
				"psnclId": "d1170ea764cb4d95a30554cda58866c9",
				"trnsType": "2475282865689711",
				"trnsEvent": 1,
				"deptId": "2475353647993088",
				"beginDate": "2020-11-01 00:00:00",
				"deptPath": "天海总公司/部门",
				"showOrder": 9999999,
				"memo": "备注",
				"jobId": "88462662626",
				"jobTypeId": "88462662626",
				"postStatus": "",
				"addrId": "1515151",
				"trnsReason": "个人",
				"director": "",
				"jobRankId": "1",
				"jobGradeId": "59261",
				"postId": "15",
				"disexplain": "",
				"dispositon": "上海",
				"_status": "Update",
				"staffJobVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"isweaken": true,
				"effectiveNumber": 1,
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffTitle": [
			{
				"certType": "2476752253768960",
				"certCode": "02313",
				"endDate": "2021-11-11 00:00:00",
				"certRank": "2476752765736192",
				"isPrint": false,
				"beginDate": "2021-11-02 00:00:00",
				"assOrg": "华信",
				"id": "2524738586775819",
				"memo": "备注",
				"proField": "英语",
				"_status": "Update",
				"staffTitleVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffReward": [
			{
				"rewardReason": "李浩",
				"rewardOrg": "华信",
				"id": "2524738586775820",
				"rewardDate": "2021-11-02 00:00:00",
				"rewardItem": "大奖",
				"memo": "备注",
				"_status": "Update",
				"rewardItem_supplement": "奖励补充",
				"rewardCategory": "703",
				"awardLevel": "1970911435205115935",
				"awardYear": "2024-01-01",
				"awardGrade": "10",
				"approvalNo": "no33453",
				"certificateNo": "645465677",
				"rewardNature": "1",
				"incentives": "奖励",
				"approverCode": "REWARD_001",
				"approverLevel": "101",
				"approvalTime": "2024-02-03",
				"awardCancellation": "false",
				"awardCancellationTime": "2024-04-21",
				"cancellationReason": "",
				"newAttachment": "c6bce09e-f3e3-4142-903d-afc030a5d23a",
				"staffRewardVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffProtocol": [
			{
				"termMonth": 0,
				"endDate": "2020-11-26 00:00:00",
				"protocolNum": "PROT000057",
				"majorCorpId": "2479635332305152",
				"protocolType": "2475283024958467",
				"contType": 1,
				"signDate": "2020-11-12 00:00:00",
				"beginDate": "2020-11-21 00:00:00",
				"newAttachment": "c6bce09e-f3e3-4142-903d-afc030a5d23a",
				"id": "2524738586775815",
				"isReceive": "false",
				"memo": "备注",
				"workAddr": "工作地点",
				"_status": "Update",
				"staffProtocolVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"belongJob": "2524738586775815",
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffProbation": [
			{
				"result": 1,
				"beginDate": "2020-11-01 00:00:00",
				"positiveDate": "2020-11-12 00:00:00",
				"endDate": "2020-11-07 00:00:00",
				"endFlag": false,
				"id": "2524738586775823",
				"type": 1,
				"memo": "备注",
				"_status": "Update",
				"promonth": 1,
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffTrain": [
			{
				"beginDate": "2021-11-03 00:00:00",
				"endDate": "2021-11-13 00:00:00",
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
				"_status": "Update",
				"staffTrainVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"trainProjectName": "",
				"trainProjectCode": "",
				"dataCreateSource": "",
				"dataCreateBillid": "",
				"trainingChannels": "",
				"trainingType": "",
				"trainingLocation": ""
			}
		],
		"staffResume": [
			{
				"workCorp": "天海总公司",
				"beginDate": "2023-11-01 00:00:00",
				"workDept": "部门",
				"id": "a7e34c2a12c74e92aa062757560ba634",
				"endDate": "2022-11-19 12:56:55",
				"memo": "备注",
				"workDuty": "劳动",
				"workPost": "华信",
				"workJob": "123",
				"certifier": "哈哈",
				"_status": "Update",
				"staffResumeVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"resumeType": 2,
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffEdu": [
			{
				"education": "2476728898130176",
				"endDate": "2019-11-22 00:00:00",
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
				"isPrefs": "false",
				"school": "",
				"isHighestDegree": "false",
				"isHighestFullDegree": "false",
				"_status": "Update",
				"staffEduVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffProqualify": [
			{
				"beginDate": "2020-11-18 00:00:00",
				"getDate": "2021-11-01 00:00:00",
				"id": "2524738586775818",
				"title": "a7baf563-d9a1-4ac5-9331-fb640bc04aae",
				"memo": "备注",
				"certNo": "123",
				"ratingOrg": "123551516",
				"isPrefs": "true",
				"endDate": "2021-11-01 00:00:00",
				"_status": "Update",
				"staffProqualifyVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffCtrt": [
			{
				"continueTime": 1,
				"endDate": "2021-02-20 00:00:00",
				"termType": 1,
				"signDate": "2020-11-11 00:00:00",
				"probEndDate": "2020-12-20 00:00:00",
				"newAttachment": "76614af0-b8fb-45ec-95c9-27c2d062cfec",
				"id": "2524738586775817",
				"termMonth": 3,
				"majorCorpId": "2479635332305152",
				"workAddr": "2479635732058368",
				"isReceive": false,
				"contType": 1,
				"beginDate": "2020-11-20 00:00:00",
				"probSalary": 200,
				"proMonth": 1,
				"contractNum": "CTRT000459",
				"neconomy": "100",
				"startSalary": "50000",
				"unchReason": "123",
				"memo": "备注",
				"contractCode": "120",
				"presenter": "",
				"breachMoney": "5000",
				"proBeginDate": "2020-11-20 00:00:00",
				"_status": "Update",
				"staffCtrtVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"belongJob": "2479635732058368",
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffOrgRel": [
			{
				"isRegular": true,
				"isReturn": false,
				"regDate": "2021-11-03 00:00:00",
				"endFlag": false,
				"beginDate": "2020-11-01 00:00:00",
				"id": "289ab53c5e2246c9880196a290373816",
				"seniorityDate": "2020-11-01 00:00:00",
				"indocFlag": true,
				"endDate": "2021-11-17 16:00:52",
				"rmChannel": "2155547485345034",
				"entrySrc": "2155547436242177",
				"seniorityAdj": "12",
				"trialResult": "1",
				"_status": "Update",
				"delayRegdate": "2021-11-17 16:00:52",
				"staffOrgRelVODefine": {
					"define1": "242424",
					"define2_name": "00000004"
				},
				"staffCode": "34568990",
				"dataCreateSource": "",
				"dataCreateBillid": "",
				"entrySource": "",
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
		"staffVODefine": {
			"define1": "242424",
			"define2_name": "00000004",
			"define3": "{\\\"linkText\\\":\\\"1234\\\",\\\"linkAddress\\\":\\\"http://aaa.com\\\"}"
		},
		"defineSet": [
			{
				"id": "2533125235413248",
				"_status": "Update"
			}
		],
		"staffNameTZDefines": [
			{
				"effectiveTime": "",
				"country": "",
				"displayName": "",
				"first_name": "",
				"last_name": "",
				"middle_name": "",
				"nick_name": "",
				"local_name": "",
				"father_name": "",
				"mother_name": "",
				"appellation": ""
			}
		],
		"staffAddress": [
			{
				"effectiveTime": "2026-06-07",
				"addressType": "",
				"country": "",
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
					"addressfifteen": ""
				},
				"isPrefs": true
			}
		],
		"staffGlobalInfoCHN": [
			{
				"effectiveTime": "2026-06-07",
				"sex": 0,
				"marital": "",
				"characterrpr": "",
				"permanreside": "",
				"religion": "",
				"political": "",
				"origin": "",
				"nationality": "",
				"joinPolityDate": "2026-06-07",
				"citizenship": "",
				"marriageDate": "2026-06-07",
				"formalPartyDate": "2026-06-07"
			}
		],
		"staffGlobalInfoGBR": [
			{
				"effectiveTime": "2026-06-07",
				"sex": 0,
				"marital": "",
				"religion": "",
				"ethnicity": "",
				"noc": "",
				"citizenship": ""
			}
		],
		"staffGlobalInfoIND": [
			{
				"effectiveTime": "2026-06-07",
				"sex": 0,
				"marital": "",
				"religion": "",
				"casteOfIndia": "",
				"noc": 0,
				"occupationCode": "",
				"citizenship": ""
			}
		],
		"staffGlobalInfoMAS": [
			{
				"effectiveTime": "2026-06-07",
				"sex": 0,
				"marital": "",
				"religion": "",
				"aboriginal": true,
				"citizenship": ""
			}
		],
		"staffGlobalInfoSIN": [
			{
				"effectiveTime": "2026-06-07",
				"sex": 0,
				"marital": "",
				"religion": "",
				"ethnicity": "",
				"noc": 0,
				"citizenship": ""
			}
		],
		"staffGlobalInfoUSA": [
			{
				"effectiveTime": "2026-06-07",
				"sex": 0,
				"marital": "",
				"exsoldier": true,
				"ethnicity": "",
				"citizenship": ""
			}
		],
		"staffHealthSituation": {
			"deformity": true,
			"deformityCertDate": "2026-06-07",
			"deformityCertNo": "",
			"id": "",
			"deformityLevel": "",
			"healthCondition": "",
			"pastHistory": "",
			"_status": "",
			"dataCreateSource": "",
			"dataCreateBillid": ""
		},
		"staffSocietyEmployment": [
			{
				"beginDate": "2026-06-07",
				"id": "",
				"certifier": "",
				"staffId": "",
				"certifierMobile": "",
				"duties": "",
				"endDate": "2026-06-07",
				"memo": "",
				"organization": "",
				"_status": "",
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffDirectiorSupervisor": [
			{
				"id": "",
				"beginDate": "2026-06-07",
				"duties": "",
				"endDate": "2026-06-07",
				"independentDirector": true,
				"memo": "",
				"organization": "",
				"termOfOffice": 0,
				"_status": "",
				"dataCreateSource": "",
				"dataCreateBillid": "",
				"positionType": "",
				"configurationMethod": "",
				"employeeDirector": true,
				"interPartDirector": true,
				"employeeSupervisor": true,
				"externalSupervisor": true
			}
		],
		"staffLeadershipTrade": [
			{
				"id": "",
				"commissionBeginDate": "2026-06-07",
				"commissionEndDate": "2026-06-07",
				"leadershipDuties": "",
				"leadershipName": "",
				"memo": "",
				"_status": "",
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffTrialEvaluation": [
			{
				"id": "",
				"beginDate": "2026-06-07",
				"endDate": "2026-06-07",
				"devaluationLevel": "",
				"evaluationScore": "",
				"overallEvaluation": "",
				"memo": "",
				"electronicSignature": "",
				"_status": "",
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffCadre": [
			{
				"id": "",
				"FormOfAppointment": "",
				"appointmentApprovalUnit": "",
				"appointmentDeadline": "",
				"appointmentNumber": "",
				"appointmentReason": "",
				"department": "",
				"dismissalApprovalUnit": "",
				"dismissalReason": "",
				"dismissalNumber": "",
				"jobAttributes": "",
				"jobCategory": "",
				"jobGrade": "",
				"jobTitle": "",
				"remarks": "",
				"removalTime": "2026-06-07",
				"selectionMethod": "",
				"workingTime": "2026-06-07",
				"workingUnit": "",
				"_status": "",
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffPunishment": [
			{
				"id": "",
				"approvalCancellationDocumentNo": "",
				"approvalOfDissolutionUnit": "",
				"approvalOfDissolutionUnitCode": "",
				"approvalOfDissolutionUnitLevel": "",
				"approvalReleaseTime": "2026-06-07",
				"dismissalOfPunishmentDocumentNo": "",
				"dismissalofpunishmentReason": "",
				"isTerminate": true,
				"punishedUnit": "",
				"punishedUnitCode": "",
				"punishedUnitLevel": "",
				"punishmentCancellationEffectiveTime": "2026-06-07",
				"punishmentMeasures": "",
				"punishmentName": "",
				"punishmentNameSupplement": "",
				"punishmentNo": "",
				"punishmentReason": "",
				"punishmentTime": "2026-06-07",
				"punishmentType": "",
				"remarks": "",
				"_status": "",
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"staffGlobalInfoHK": [
			{
				"effectiveTime": "2026-06-07",
				"citizenship": "",
				"sex": "",
				"marital": "",
				"staffId": "",
				"foreignNationality": "",
				"arriveHKDate": "",
				"marriageDate": "",
				"continuousContributions": true,
				"industryPlan": true,
				"contributionSchemeName": "",
				"retirementPlan": 0
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
count	long	否	处理数据条数 示例：1
sucessCount	long	否	成功条数 示例：1
failCount	long	否	失败条数 示例：0
messages	string	是	返回信息
infos	object	是	员工信息
failInfos	string	是	失败信息

## 5. 正确返回示例

{
	"code": 200,
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
				"id": "2548767078355200",
				"name": "李浩888",
				"sex": "2",
				"birthDate": "2013-11-09 00:00:00",
				"mobile": "+86-13842946511",
				"officeTel": "1546816101",
				"email": "991111@1010.com",
				"selfEmail": "7111@qq.com",
				"joinWorkDate": "2018-11-09 00:00:00",
				"linkAddr": "沈阳",
				"education": "2476728905519360",
				"joinedDate": "2023-09-09",
				"degree": "2476730873303296",
				"marital": "2475282874225665",
				"bloodType": "41eb36a1-4f93-4504-b4ae-91837e5b1a7e",
				"characterrpr": "5db087f8-8dbf-4426-9b61-9c3886f812a3",
				"permanreside": "bfbd1620-5cf3-11e9-817e-7cd30abea0c0",
				"political": "2508983411364096",
				"joinPolityDate": "2020-11-09 00:00:00",
				"departDate": "2023-09-09",
				"nationality": "694d8570-3da8-4162-b521-1d0dfa2a13ea",
				"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
				"origin": "c04c67b2-5cf3-11e9-817e-7cd30abea0c0",
				"qq": "7787845448",
				"workAgeAdjType": "1",
				"linkedIn": "0215141185",
				"bizManTag": false,
				"shopAssisTag": true,
				"attachlist": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"fromApi_staff": true,
				"importMode": 2,
				"modifyTime": "2022-11-09 00:00:00",
				"workAgeAdjDay": 1,
				"workAgeAdjMon": 1,
				"workAgeAdjYea": 1,
				"modifier": "9a996f31-4315-4b93-b33f-f3e0fb0f39d2",
				"modifier_userName": "李四",
				"shortName": "lh888",
				"military_count_identify": true,
				"pubts": "2022-12-09 00:00:00",
				"staffLangAbility": [
					{
						"proLevel": "2475282966107140",
						"language": "f74e0f14-5970-45f0-a09e-77d9d73849a1",
						"id": "2524738586775814",
						"certNo": "1651616",
						"langLevel": "高级",
						"memo": "备注",
						"getDate": "2020-11-22 00:00:00",
						"certName": "证书",
						"staffLangAbilityVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffTechPost": [
					{
						"beginDate": "2020-11-06 00:00:00",
						"endDate": "2020-11-22 00:00:00",
						"id": "2524738586775811",
						"title": "2508987893993728",
						"ratingOrg": "腾讯",
						"isPrefs": false,
						"certNo": "15615165",
						"memo": "备注",
						"channel": "获取方式",
						"level": "2508987893993799",
						"professionalTitleSeries": "",
						"subseries": "",
						"qualificationNumber": "",
						"professionSpecialties": "",
						"acquisitionMethod": "",
						"staffTechPostVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffAss": [
					{
						"beginDate": "2019-11-13 00:00:00",
						"endDate": "2019-11-23 00:00:00",
						"id": "2524738586775808",
						"score": "100",
						"assDoc": "151",
						"rank": "1",
						"memo": "备注",
						"staffAssVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffCertificate": [
					{
						"beginDate": "2021-11-18 00:00:00",
						"certificateCode": "156161",
						"endDate": "2021-12-18 00:00:00",
						"id": "2524738586775816",
						"authority": "腾讯",
						"certificateName": "证书",
						"staffCertificateVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffDotline": [
					{
						"endDate": "2020-11-09 00:00:00",
						"lineName": "40017894856903424",
						"beginDate": "2020-11-08 00:00:00",
						"lineType": "2476736877794560",
						"id": "2524738586775821",
						"memo": "备注",
						"staffDotlineVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffBankAcct": [
					{
						"openBank": "2493691868090624",
						"sysid": "diwork",
						"isDefaultCard": 0,
						"bank": "2482441004520705",
						"acctType": "BAT00001",
						"currency": "2475282863117312",
						"id": "2524738586775813",
						"account": "165161",
						"staffBankAcctVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						},
						"country": ""
					}
				],
				"staffPart": [
					{
						"isMainJob": false,
						"endDate": "2021-11-03 00:00:00",
						"deptId": "2479811238465792",
						"endFlag": true,
						"orgId": "2475303020597504",
						"beginDate": "2021-11-01 00:00:00",
						"id": "2524738586775812",
						"partType": "2475283023074308",
						"postId": "851512632",
						"jobId": "151652632",
						"jobTypeId": "151652632",
						"memo": "备注",
						"jobGradeId": "1",
						"director": "王",
						"addrId": "8946126",
						"staffFte": "",
						"staffPartVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						},
						"trnsType": "17833327282822234",
						"trnsEvent": 5,
						"effectiveNumber": 1,
						"deptPath": "部门1/部门2",
						"orgPath": "组织1/组织2",
						"empform": "自由员工",
						"jobRankId": "",
						"staffjobCode": "ASG001",
						"psnclId": "2524738586775822",
						"planEndDate": "2023-10-10",
						"otherJobType": "1"
					}
				],
				"staffCert": [
					{
						"certNo": "152020",
						"certType": "0017-2647-4d9f-81ea-4d6a96be26b2",
						"id": "2524738586775822",
						"endDate": "2021-11-19 12:56:55",
						"memo": "说明",
						"beginDate": "2021-11-19 12:56:55",
						"extendOrg": "阿里巴巴",
						"staffCertVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						},
						"isPrefs": "",
						"country": ""
					}
				],
				"staffSocialRel": [
					{
						"relName": "李浩",
						"id": "2524738586775810",
						"linkTel": "+86-15142845632",
						"relation": "2475282878944265",
						"linkAddr": "上海",
						"workCorp": "腾讯",
						"isUrgent": false,
						"workDuty": "程序员",
						"staffSocialRelVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						},
						"certIssuePlace": ""
					}
				],
				"staffJob": [
					{
						"isMainJob": true,
						"endDate": "2021-11-02 00:00:00",
						"endFlag": true,
						"orgId": "2475303020597504",
						"newAttachment": "051636af-ac64-4aea-ba67-7b556c3f37af",
						"staffFte": "100%",
						"id": "2509224682574081",
						"psnclId": "d1170ea764cb4d95a30554cda58866c9",
						"trnsType": "2475282865689711",
						"trnsEvent": 1,
						"deptId": "2475353647993088",
						"beginDate": "2020-11-01 00:00:00",
						"deptPath": "天海总公司/部门",
						"showOrder": 9999999,
						"memo": "备注",
						"jobId": "88462662626",
						"jobTypeId": "88462662626",
						"postStatus": "",
						"addrId": "1515151",
						"trnsReason": "个人",
						"bmLocation": "大连",
						"director": "",
						"jobRankId": "1",
						"jobGradeId": "59261",
						"waStruct": "",
						"postId": "15",
						"disexplain": "",
						"dispositon": "上海",
						"effectiveNumber": 0,
						"staffjobCode": "ASG001",
						"empform": "",
						"staffJobVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffTitle": [
					{
						"certType": "2476752253768960",
						"certCode": "02313",
						"endDate": "2021-11-11 00:00:00",
						"certRank": "2476752765736192",
						"isPrint": false,
						"beginDate": "2021-11-02 00:00:00",
						"assOrg": "华信",
						"id": "2524738586775819",
						"memo": "备注",
						"proField": "英语",
						"staffTitleVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffReward": [
					{
						"rewardReason": "李浩",
						"rewardOrg": "华信",
						"id": "2524738586775820",
						"rewardDate": "2021-11-02 00:00:00",
						"rewardItem": "大奖",
						"memo": "备注",
						"staffRewardVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffProtocol": [
					{
						"termMonth": 0,
						"endDate": "2020-11-26 00:00:00",
						"protocolNum": "PROT000057",
						"majorCorpId": "2479635332305152",
						"protocolType": "2475283024958467",
						"contType": 1,
						"signDate": "2020-11-12 00:00:00",
						"beginDate": "2020-11-21 00:00:00",
						"newAttachment": "c6bce09e-f3e3-4142-903d-afc030a5d23a",
						"id": "2524738586775815",
						"isReceive": "false",
						"memo": "备注",
						"belongJob": "2524738586775815",
						"workAddr": "工作地点",
						"staffProtocolVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffProbation": [
					{
						"result": 1,
						"beginDate": "2020-11-01 00:00:00",
						"positiveDate": "2020-11-12 00:00:00",
						"endDate": "2020-11-07 00:00:00",
						"endFlag": false,
						"id": "2524738586775823",
						"type": 1,
						"memo": "备注",
						"promonth": 0
					}
				],
				"staffTrain": [
					{
						"beginDate": "2021-11-03 00:00:00",
						"endDate": "2021-11-13 00:00:00",
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
						"trainingChannels": "",
						"trainingType": "",
						"trainingLocation": "",
						"staffTrainVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffResume": [
					{
						"workCorp": "天海总公司",
						"beginDate": "2023-11-01 00:00:00",
						"workDept": "部门",
						"id": "a7e34c2a12c74e92aa062757560ba634",
						"endDate": "2022-11-19 12:56:55",
						"memo": "备注",
						"workDuty": "劳动",
						"workPost": "华信",
						"workJob": "123",
						"certifier": "哈哈",
						"staffResumeVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						},
						"resumeType": 1
					}
				],
				"staffEdu": [
					{
						"education": "2476728898130176",
						"endDate": "2019-11-22 00:00:00",
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
						"isPrefs": "false",
						"school": "",
						"staffEduVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffProqualify": [
					{
						"beginDate": "2020-11-18 00:00:00",
						"getDate": "2021-11-01 00:00:00",
						"id": "2524738586775818",
						"title": "a7baf563-d9a1-4ac5-9331-fb640bc04aae",
						"memo": "备注",
						"certNo": "123",
						"ratingOrg": "123551516",
						"isPrefs": "true",
						"endDate": "2021-11-01 00:00:00",
						"staffProqualifyVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffCtrt": [
					{
						"continueTime": 1,
						"endDate": "2021-02-20 00:00:00",
						"termType": 1,
						"signDate": "2020-11-11 00:00:00",
						"probEndDate": "2020-12-20 00:00:00",
						"newAttachment": "76614af0-b8fb-45ec-95c9-27c2d062cfec",
						"id": "2524738586775817",
						"termMonth": 3,
						"majorCorpId": "2479635332305152",
						"workAddr": "2479635732058368",
						"isReceive": false,
						"contType": 1,
						"beginDate": "2020-11-20 00:00:00",
						"probSalary": 200,
						"proMonth": 1,
						"contractNum": "CTRT000459",
						"neconomy": "100",
						"startSalary": "50000",
						"unchReason": "123",
						"memo": "备注",
						"contractCode": "120",
						"presenter": "",
						"breachMoney": "5000",
						"belongJob": "2479635732058368",
						"proBeginDate": "2020-11-20 00:00:00",
						"staffCtrtVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						}
					}
				],
				"staffOrgRel": [
					{
						"isRegular": true,
						"isReturn": false,
						"regDate": "2021-11-03 00:00:00",
						"endFlag": false,
						"beginDate": "2020-11-01 00:00:00",
						"id": "289ab53c5e2246c9880196a290373816",
						"seniorityDate": "2020-11-01 00:00:00",
						"indocFlag": true,
						"endDate": "2021-11-17 16:00:52",
						"rmChannel": "2155547485345034",
						"entrySrc": "2155547436242177",
						"seniorityAdj": "12",
						"trialResult": "1",
						"employer": "109849334568990",
						"staffCode": "34568990",
						"code": "ER0001",
						"delayRegdate": "2021-11-17 16:00:52",
						"staffOrgRelVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						},
						"entrySource": "",
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
				"staffVODefine": {
					"define1": "242424",
					"define2_name": "00000004",
					"define3": "{\\\"linkText\\\":\\\"1234\\\",\\\"linkAddress\\\":\\\"http://aaa.com\\\"}"
				},
				"defineSet": [
					{
						"id": "2533125235413248"
					}
				],
				"staffNameTZDefines": [
					{
						"vid": "",
						"id": "",
						"displayName": "",
						"country": "",
						"first_name": "",
						"middle_name": "",
						"last_name": "",
						"nick_name": "",
						"local_name": "",
						"father_name": "",
						"mother_name": "",
						"appellation": "",
						"effectiveTime": "2026-06-07"
					}
				],
				"staffAddress": [
					{
						"vid": "",
						"id": "",
						"effectiveTime": "2026-06-07",
						"addressType": "",
						"country": "",
						"isPrefs": true,
						"addressDefines": {
							"id": "",
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
							"addressfifteen": ""
						}
					}
				],
				"staffGlobalInfoCHN": [
					{
						"vid": "",
						"id": "",
						"country": "",
						"sex": "",
						"marital": "",
						"effectiveTime": "2026-06-07",
						"characterrpr": "",
						"permanreside": "",
						"political": "",
						"origin": "",
						"nationality": "",
						"joinPolityDate": "2026-06-07"
					}
				],
				"staffGlobalInfoGBR": [
					{
						"vid": "",
						"id": "",
						"effectiveTime": "2026-06-07",
						"country": "",
						"sex": "",
						"marital": "",
						"religion": "",
						"ethnicity": "",
						"noc": ""
					}
				],
				"staffGlobalInfoIND": [
					{
						"vid": "",
						"id": "",
						"effectiveTime": "2026-06-07",
						"country": "",
						"sex": "",
						"marital": "",
						"religion": "",
						"casteOfIndia": "",
						"noc": 0,
						"occupationCode": ""
					}
				],
				"staffGlobalInfoMAS": [
					{
						"vid": "",
						"id": "",
						"country": "",
						"sex": "",
						"marital": "",
						"effectiveTime": "2026-06-07",
						"religion": "",
						"aboriginal": ""
					}
				],
				"staffGlobalInfoSIN": [
					{
						"vid": "",
						"id": "",
						"country": "",
						"sex": "",
						"marital": "",
						"effectiveTime": "2026-06-07",
						"religion": "",
						"ethnicity": "",
						"noc": 0
					}
				],
				"staffGlobalInfoUSA": [
					{
						"vid": "",
						"id": "",
						"country": "",
						"sex": "",
						"marital": "",
						"effectiveTime": "2026-06-07",
						"exsoldier": true,
						"ethnicity": ""
					}
				]
			}
		],
		"failInfos": [
			""
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
"failCount": 1	"证件类型id:0010-3600-41e2-8568-42fbc6c96c9未找到	修正证件类型

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

