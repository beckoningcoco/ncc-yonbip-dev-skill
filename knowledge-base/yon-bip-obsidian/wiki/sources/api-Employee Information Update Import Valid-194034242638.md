---
title: "员工信息更新MDD"
apiId: "1940342426382106633"
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

# 员工信息更新MDD

>  请求方式	POST | Employee Information (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/Updatedetail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
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
name	string	否	否	员工姓名 示例：张三
formerName	string	否	否	曾用名 示例：张三三
englishName	string	否	否	英文名 示例：Tom
certType	string	否	否	证件类型 传入id或code 示例：0010-3600-41e2-8568-42fbc6c96c9d
certNo	string	否	否	证件号 示例：0909765437777
documentValidity	string	否	否	证件有效期 示例：2035-12-31
sex	string	否	否	性别 1-男；2-女；0-未知 示例：1
birthDate	string	否	否	出生日期 示例：2000-01-01
mobile	string	否	否	手机号 手机号和邮箱不能同时为空 示例：+86-13911111111
officeTel	string	否	否	办公电话 示例：010-12345678
height	string	否	否	身高 示例：180
weight	string	否	否	体重 示例：70
email	string	否	否	邮箱 手机号和邮箱不能同时为空 示例：zhangsan@123.com
postcode	string	否	否	邮政编码 示例：100000
workAgeAdjType	string	否	否	工龄调整方式 1-增加；0-减少 示例：1
workAgeAdjYea	number
小数位数:0,最大长度:2	否	否	调整工龄（年数） 按年为单位填写工龄调整值（如工龄调整1年2个月3天，此处填写1），最大不超过99 示例：1
workAgeAdjMon	number
小数位数:0,最大长度:2	否	否	调整工龄(月数)：分别按年、月、日为单位填写司龄调整（如司龄调整1年2个月3天，此处填写2），最大不超过12 示例：2
workAgeAdjDay	number
小数位数:0,最大长度:2	否	否	调整工龄（天数） 分别按天为单位填写工龄调整（如工龄调整1年2个月3天，此处填写3），最大不超过30 示例：3
birthPlace	string	否	否	出生地 支持传入id或code 示例：001
selfEmail	string	否	否	个人邮箱 示例：zhangsan@123.com
joinWorkDate	string	否	否	参加工作日期 示例：2000-01-01
linkAddr	string	否	否	联系地址 示例：北京市海淀区北清路68号
marital	string	否	否	婚姻状况 支持传入id或code 示例：001
bloodType	string	否	否	血型 支持传入id或code 示例：001
isOnlyChild	boolean	否	否	独生子女 true-是；false-否 示例：true
characterrpr	string	否	否	户口性质 支持传入id或code 示例：001
permanreside	string	否	否	户口所在地 支持传入id或code 示例：001
religion	string	否	否	宗教信仰 支持传入id或code 示例：001
political	string	否	否	政治面貌 支持传入id或code 示例：001
joinPolityDate	string	否	否	加入党团时间 示例：2015-01-01
code	string	否	否	员工编码 当「编码规则」设置为“手工编号”时必填 示例：EMP000001
nationality	string	否	否	民族 支持传入id或code 示例：001
country	string	否	否	国籍地区 支持传入id或code 示例：001
origin	string	否	否	籍贯 支持传入id或code 示例：001
qq	string	否	否	QQ 示例：123456
attachlist	string	否	否	附件 通过API文档中的「文件上传」API，上传本地文件并关联businessId（businessId 支持自定义，可上传uuid），businessType固定上传hrcloud。完成后再通过businessId进行传参 示例：3f9ebc70-4058-11ec-863d-bb0606e88ccf
weiXin	string	否	否	微信 示例：wx123456
hobby	string	否	否	特长爱好 示例：游泳
dataCreateSource	string	否	否	数据来源 仅新增时填写，不支持更新 示例：API
dataCreateBillid	string	否	否	数据来源单据ID 仅新增时填写，不支持更新 示例：123456
idCardFront	string	否	否	身份证国徽面 通过API文档中的「文件上传」API，上传本地文件并关联businessId（businessId 支持自定义，可上传uuid），businessType固定上传hrcloud。完成后再通过businessId进行传参 示例：3f9ebc70-4058-11ec-863d-bb0606e88ccf
idCardReverse	string	否	否	身份证人像面 通过API文档中的「文件上传」API，上传本地文件并关联businessId（businessId 支持自定义，可上传uuid），businessType固定上传hrcloud。完成后再通过businessId进行传参 示例：3f9ebc70-4058-11ec-863d-bb0606e88ccf
photo	string	否	否	头像 通过API文档中的「文件上传」API，上传本地文件并关联businessId（businessId 支持自定义，可上传uuid），businessType固定上传hrcloud。完成后再通过businessId进行传参 示例：3f9ebc70-4058-11ec-863d-bb0606e88ccf
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
staffReward	object	是	否	奖励信息
staffProtocol	object	是	否	协议信息
staffProbation	object	是	否	试用信息
staffTrain	object	是	否	培训记录
staffResume	object	是	否	履历信息
staffEdu	object	是	否	学历信息
staffProqualify	object	是	否	职业资格
staffCtrt	object	是	否	合同信息
staffDirectiorSupervisor	object	是	否	董监高信息
staffOrgRel	object	是	否	工作关系 只能更新 不能新增
defineSet	object	是	否	自定义信息集名称，表名+List
staffLeadershipTrade	object	是	否	党组/工会信息
staffSocietyEmployment	object	是	否	社会任职信息
staffHealthSituation	object	是	否	健康信息
staffTrialEvaluation	object	是	否	试用考核结果
staffPunishment	object	是	否	惩处信息
staffCadre	object	是	否	任免信息
evaluationMessage	object	是	否	测评信息

## 3. 请求示例

Url: /yonbip/hrcloud/Updatedetail?access_token=访问令牌
Body: {
	"data": {
		"id": "2511871812849920",
		"name": "张三",
		"formerName": "张三三",
		"englishName": "Tom",
		"certType": "0010-3600-41e2-8568-42fbc6c96c9d",
		"certNo": "0909765437777",
		"documentValidity": "2035-12-31",
		"sex": "1",
		"birthDate": "2000-01-01",
		"mobile": "+86-13911111111",
		"officeTel": "010-12345678",
		"height": "180",
		"weight": "70",
		"email": "zhangsan@123.com",
		"postcode": "100000",
		"workAgeAdjType": "1",
		"workAgeAdjYea": 1,
		"workAgeAdjMon": 2,
		"workAgeAdjDay": 3,
		"birthPlace": "001",
		"selfEmail": "zhangsan@123.com",
		"joinWorkDate": "2000-01-01",
		"linkAddr": "北京市海淀区北清路68号",
		"marital": "001",
		"bloodType": "001",
		"isOnlyChild": true,
		"characterrpr": "001",
		"permanreside": "001",
		"religion": "001",
		"political": "001",
		"joinPolityDate": "2015-01-01",
		"code": "EMP000001",
		"nationality": "001",
		"country": "001",
		"origin": "001",
		"qq": "123456",
		"attachlist": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
		"weiXin": "wx123456",
		"hobby": "游泳",
		"dataCreateSource": "API",
		"dataCreateBillid": "123456",
		"idCardFront": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
		"idCardReverse": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
		"photo": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
		"staffLangAbility": [
			{
				"proLevel": "001",
				"language": "001",
				"id": "2203007224531910777",
				"certNo": "123456",
				"langLevel": "专业八级",
				"memo": "备注说明",
				"getDate": "2020-01-01",
				"_status": "Update",
				"certName": "TEM-8",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffTechPost": [
			{
				"beginDate": "2020-01-01",
				"endDate": "2035-12-31",
				"id": "2203007224531910777",
				"title": "001",
				"ratingOrg": "用友集团",
				"isPrefs": true,
				"certNo": "123456",
				"memo": "备注说明",
				"level": "001",
				"professionalTitleSeries": "会计专业人员",
				"subseries": "会计师",
				"qualificationNumber": "123456",
				"professionSpecialties": "账务核算",
				"acquisitionMethod": "01",
				"_status": "Update",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffAss": [
			{
				"beginDate": "2020-01-01",
				"endDate": "2035-12-31",
				"id": "2203007224531910777",
				"score": "100",
				"assDoc": "2020年度部门绩效",
				"rank": "001",
				"_status": "Update",
				"memo": "备注说明",
				"dataCreateSource": "API",
				"dataCreateBillid": "API"
			}
		],
		"staffCertificate": [
			{
				"beginDate": "2020-01-01",
				"certificateCode": "123456",
				"endDate": "2035-12-31",
				"id": "2203007224531910777",
				"authority": "用友集团",
				"_status": "Update",
				"certificateName": "注册会计师证书（CPA）",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffDotline": [
			{
				"endDate": "2035-12-31",
				"lineName": "001",
				"beginDate": "2020-01-01",
				"lineType": "001",
				"id": "2203007224531910777",
				"memo": "备注说明",
				"_status": "Update",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffBankAcct": [
			{
				"openBank": "001",
				"isDefaultCard": true,
				"bank": "001",
				"acctType": "BAT00001",
				"currency": "001",
				"id": "2203007224531910777",
				"account": "123456",
				"accountName": "张三",
				"bankAnnex": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"_status": "Update",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffPart": [
			{
				"isMainJob": false,
				"endDate": "2035-12-31",
				"deptId": "001",
				"orgId": "001",
				"country": "001",
				"beginDate": "2020-01-01",
				"id": "2203007224531910777",
				"postId": "001",
				"jobId": "001",
				"jobTypeId": "001",
				"memo": "备注说明",
				"jobGradeId": "001",
				"jobMgrGradeId": "001",
				"director": "001",
				"addrId": "001",
				"staffFte": "50%",
				"_status": "Update",
				"isweaken": true,
				"trnsEvent": 5,
				"trnsType": "001",
				"trnsReason": "001",
				"staffjobCode": "ASG001",
				"jobRankId": "001",
				"empform": "001",
				"newAttachment": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"effectiveNumber": 1,
				"psnclId": "001",
				"planEndDate": "2035-12-31",
				"newPostId": "001",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456",
				"otherJobType": "1"
			}
		],
		"staffCert": [
			{
				"certNo": "123456",
				"certType": "001",
				"id": "2203007224531910777",
				"endDate": "2035-12-31",
				"memo": "备注说明",
				"beginDate": "2020-01-01",
				"cetrySignAddress": "北京市公安局出入境管理局",
				"extendOrg": "用友集团",
				"isPrefs": true,
				"certAnnex": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"country": "001",
				"_status": "Update",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffSocialRel": [
			{
				"relName": "李四",
				"id": "2203007224531910777",
				"linkTel": "+86-13511111111",
				"birthDate": "2000-01-01",
				"political": "001",
				"presentSituation": "1",
				"relation": "001",
				"certType": "001",
				"certNo": "123456",
				"linkAddr": "北京市海淀区北清路68号",
				"workCorp": "用友集团",
				"isUrgent": true,
				"workDuty": "会计主管",
				"isRelocate": true,
				"_status": "Update",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456",
				"certIssuePlace": "北京市公安局出入境管理局"
			}
		],
		"staffJob": [
			{
				"endDate": "2035-12-31",
				"orgId": "001",
				"newAttachment": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"staffFte": "100%",
				"id": "2203007224531910777",
				"psnclId": "001",
				"wageGroup": "001",
				"country": "001",
				"trnsType": "001",
				"trnsEvent": 1,
				"deptId": "001",
				"beginDate": "2020-01-01",
				"showOrder": 9999999,
				"memo": "备注说明",
				"jobId": "001",
				"jobTypeId": "001",
				"postStatus": "001",
				"addrId": "001",
				"trnsReason": "001",
				"director": "001",
				"jobRankId": "001",
				"jobGradeId": "001",
				"jobMgrGradeId": "001",
				"postId": "001",
				"disexplain": "个人职业规划调整",
				"dispositon": "自主创业",
				"_status": "Update",
				"isweaken": true,
				"effectiveNumber": 1,
				"newPostId": "001",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffReward": [
			{
				"rewardReason": "工作表现突出",
				"rewardOrg": "用友集团",
				"rewardType": "001",
				"id": "2203007224531910777",
				"rewardDate": "2020-01-01",
				"rewardItem": "最佳新人奖",
				"rewardItem_supplement": "奖励补充",
				"rewardCategory": "703",
				"awardLevel": "001",
				"awardYear": "2024-01-01",
				"approvalNo": "no33453",
				"certificateNo": "123456",
				"incentives": "奖励",
				"approverLevel": "101",
				"approvalTime": "2024-02-03",
				"newAttachment": "c6bce09e-f3e3-4142-903d-afc030a5d23a",
				"memo": "备注说明",
				"_status": "Update",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffProtocol": [
			{
				"termMonth": 1,
				"endDate": "2035-12-31",
				"protocolNum": "123456",
				"majorCorpId": "001",
				"protocolType": "001",
				"contType": 1,
				"signDate": "2020-01-01",
				"relieveDate": "2035-12-31",
				"beginDate": "2020-01-01",
				"termUnit": "1",
				"newAttachment": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"id": "2203007224531910777",
				"isReceive": "true",
				"memo": "备注说明",
				"workAddr": "001",
				"_status": "Update",
				"belongJob": "001",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffProbation": [
			{
				"result": 1,
				"beginDate": "2020-01-01",
				"positiveDate": "2020-04-01",
				"endDate": "2035-12-31",
				"actualEndDate": "2035-12-31",
				"devaluationLevel": "001",
				"evaluationScore": "100",
				"overallEvaluation": "试用期评价内容",
				"workSummary": "试用期工作总结",
				"endFlag": true,
				"id": "2203007224531910777",
				"memo": "备注说明",
				"_status": "Update",
				"promonth": 3,
				"termUnit": "2",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffTrain": [
			{
				"beginDate": "2020-01-01",
				"endDate": "2035-12-3",
				"id": "2203007224531910777",
				"content": "财务核算规范",
				"status": "已完成",
				"earnHours": "30",
				"earnCredit": "10",
				"courseId": "123456",
				"classifiCation": "财务核算规范与风险防控",
				"hours": "20",
				"memo": "备注说明",
				"protocolNo": "123456",
				"fee": "500",
				"score": "100",
				"dayOrHours": "1",
				"_status": "Update",
				"trainProjectName": "财务专业能力培训",
				"trainProjectCode": "123456",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456",
				"trainingChannels": "001",
				"trainingType": "001",
				"trainingLocation": "001"
			}
		],
		"staffResume": [
			{
				"workCorp": "用友集团",
				"beginDate": "2020-01-01",
				"workDept": "部人力资源部门",
				"id": "2203007224531910777",
				"endDate": "2035-12-31",
				"memo": "备注说明",
				"workDuty": "人力实务管理",
				"workPost": "人力资源专员",
				"newPost": "人力资源专员",
				"workJob": "专员",
				"rankName": "P6",
				"certifier": "李四",
				"_status": "Update",
				"resumeType": 1,
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffEdu": [
			{
				"education": "001",
				"endDate": "2035-12-31",
				"degree": "001",
				"beginDate": "2020-01-01",
				"educationAnnex": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"degreeAnnex": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"newAttachment": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"id": "2203007224531910777",
				"studyMode": "001",
				"major": "人力资源",
				"memo": "备注说明",
				"eduSystem": "3",
				"certifCode": "123456",
				"educationCtifCode": "123456",
				"isPrefs": "true",
				"isHighestDegree": "true",
				"isHighestFullDegree": "true",
				"school": "北京大学",
				"_status": "Update",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffProqualify": [
			{
				"beginDate": "2020-01-01",
				"getDate": "2020-01-01",
				"id": "2203007224531910777",
				"title": "001",
				"memo": "备注说明",
				"certNo": "123456",
				"ratingOrg": "用友集团",
				"isPrefs": "true",
				"endDate": "2035-12-31",
				"_status": "Update",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffCtrt": [
			{
				"continueTime": 1,
				"endDate": "2035-12-31",
				"termType": 1,
				"signDate": "2020-01-01",
				"newAttachment": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"id": "2203007224531910777",
				"termMonth": 3,
				"termUnit": "1",
				"majorCorpId": "001",
				"contractType": "001",
				"workAddr": "001",
				"cmpDissReason": "001",
				"labDissReason": "001",
				"isReceive": true,
				"contType": 1,
				"beginDate": "2020-01-01",
				"contractNum": "123456",
				"unchReason": "001",
				"memo": "备注说明",
				"contractCode": "123456",
				"presenter": "2",
				"relieveDate ": "2035-12-31",
				"_status": "Update",
				"belongJob": "001",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffDirectiorSupervisor": [
			{
				"id": "2203007224531910777",
				"beginDate": "2020-01-01",
				"endDate": "2035-12-31",
				"termOfOffice": 12,
				"organization": "用友集团",
				"independentDirector": true,
				"memo": "备注说明",
				"_status": "",
				"duties": "董事",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456",
				"positionType": "1",
				"configurationMethod": "1",
				"employeeDirector": true,
				"interPartDirector": true,
				"employeeSupervisor": true,
				"externalSupervisor": true
			}
		],
		"staffOrgRel": [
			{
				"isReturn": false,
				"endFlag": true,
				"beginDate": "2020-01-01",
				"id": "2203007224531910777",
				"seniorityDate": "2020-01-01",
				"endDate": "2035-12-31",
				"rmChannel": "001",
				"entrySrc": "001",
				"_status": "Update",
				"staffCode": "EMP000010",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456",
				"seniorityAdjType": "1",
				"seniorityAdjYea": 1,
				"seniorityAdjMon": 2,
				"seniorityAdjDay": 3,
				"groupAgeAdjType": "1",
				"groupAgeAdjYea": 1,
				"groupAgeAdjMon": 2,
				"groupAgeAdjDay": 3,
				"newAttachment": "3f9ebc70-4058-11ec-863d-bb0606e88ccf"
			}
		],
		"defineSet": [
			{
				"id": "2533125235413248",
				"_status": "Update"
			}
		],
		"staffLeadershipTrade": [
			{
				"id": "2203007224531910777",
				"commissionBeginDate": "2020-01-01",
				"commissionEndDate": "2035-12-31",
				"leadershipName": "用友集团党组工会",
				"leadershipDuties": "工会委员",
				"memo": "备注说明",
				"_status": "",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffSocietyEmployment": [
			{
				"id": "2203007224531910777",
				"beginDate": "2020-01-01",
				"endDate": "2035-12-31",
				"memo": "备注说明",
				"duties": "理事",
				"certifier": "李四",
				"certifierMobile": "13911111111",
				"organization": "用友集团",
				"_status": "",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffHealthSituation": [
			{
				"id": "2203007224531910777",
				"deformity": true,
				"deformityCertNo": "123456",
				"deformityCertDate": "2020-01-01",
				"pastHistory": "心脏病",
				"deformityLevel": "001",
				"healthCondition": "良好",
				"_status": "",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456",
				"memo": "备注说明"
			}
		],
		"staffTrialEvaluation": [
			{
				"id": "2203007224531910777",
				"beginDate": "2020-01-01",
				"endDate": "2035-12-31",
				"devaluationLevel": "001",
				"evaluationScore": "100",
				"overallEvaluation": "试用期评价内容",
				"memo": "备注说明",
				"electronicSignature": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"_status": "",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffPunishment": [
			{
				"id": "2203007224531910777",
				"approvalCancellationDocumentNo": "",
				"approvalReleaseTime": "2026-06-07",
				"dismissalOfPunishmentDocumentNo": "",
				"dismissalofpunishmentReason": "期满解除",
				"isTerminate": true,
				"punishedUnit": "用友集团",
				"punishmentCancellationEffectiveTime": "2035-12-31",
				"punishmentMeasures": "",
				"punishmentNameSupplement": "",
				"punishmentNo": "",
				"punishmentReason": "无故旷工",
				"punishmentTime": "2020-01-01",
				"punishmentItem": "警告",
				"punishmentCategory": "001",
				"newAttachment": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"remarks": "备注说明",
				"_status": "",
				"dataCreateSource": "API",
				"dataCreateBillid": "123456"
			}
		],
		"staffCadre": [
			{
				"id": "",
				"FormOfAppointment": "",
				"appointmentApprovalUnit": "",
				"appointmentDeadline": "2026-06-07",
				"appointmentNumber": "",
				"appointmentReason": "",
				"department": "",
				"dismissalApprovalUnit": "",
				"dismissalNumber": "",
				"dismissalReason": "",
				"jobAttributes": "",
				"jobCategory": "",
				"jobGrade": "",
				"jobTitle": "",
				"remarks": "",
				"removalTime": "2026-06-07",
				"selectionMethod": "",
				"workingTime": "2026-06-07",
				"workingUnit": "",
				"staffId": "",
				"_status": "",
				"dataCreateSource": "",
				"dataCreateBillid": ""
			}
		],
		"evaluationMessage": [
			{
				"id": "2203007224531910777",
				"name": "年度中层管理者能力测评",
				"attachment": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"evaluationDate": "2025-03-12",
				"evaluationYear": "2025",
				"questionnaireName": "中层管理者领导力评估问卷",
				"evaluationdimension_name": "001",
				"evaluationrating_name": "001",
				"memo": "备注说明",
				"newScore": 92.5,
				"dataCreateSource": "API",
				"dataCreateBillid": "123456",
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
				"formerName": "测试5678",
				"englishName": "test1234",
				"certType": "0010-3600-41e2-8568-42fbc6c96c9d",
				"certNo": "090976543111111",
				"documentValidity": "2014-03-23",
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
				"height": "173",
				"weight": "70",
				"marital": "2475282874225665",
				"bloodType": "41eb36a1-4f93-4504-b4ae-91837e5b1a7e",
				"characterrpr": "5db087f8-8dbf-4426-9b61-9c3886f812a3",
				"workAgeAdjType": "1",
				"permanreside": "bfbd1620-5cf3-11e9-817e-7cd30abea0c0",
				"religion": "1493439902010001",
				"political": "2508983411364096",
				"joinPolityDate": "2020-11-09 00:00:00",
				"departDate": "2023-09-09",
				"isOnlyChild": true,
				"nationality": "694d8570-3da8-4162-b521-1d0dfa2a13ea",
				"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
				"workAgeAdjYea": 1,
				"origin": "c04c67b2-5cf3-11e9-817e-7cd30abea0c0",
				"qq": "7787845448",
				"linkedIn": "0215141185",
				"postcode": "431728",
				"birthPlace": "北京",
				"bizManTag": false,
				"shopAssisTag": true,
				"workAgeAdjMon": 1,
				"attachlist": "3f9ebc70-4058-11ec-863d-bb0606e88ccf",
				"fromApi_staff": true,
				"importMode": 2,
				"modifyTime": "2022-11-09 00:00:00",
				"modifier": "9a996f31-4315-4b93-b33f-f3e0fb0f39d2",
				"modifier_userName": "李四",
				"shortName": "lh888",
				"workAgeAdjDay": 1,
				"hobby": "打篮球",
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
						"channel": "途径",
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
						"assPeriod": "2382939266666639",
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
						}
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
						}
					}
				],
				"staffSocialRel": [
					{
						"relName": "李浩",
						"id": "2524738586775810",
						"linkTel": "+86-15142845632",
						"relation": "2475282878944265",
						"linkAddr": "上海",
						"certType": "0010-3600-41e2-8568-42fbc6c96c9d",
						"certNo": "0000232441122",
						"isRelocate": "true",
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
						"rewardItem_supplement": "奖励补充",
						"rewardCategory": "共和国勋章",
						"awardLevel": "1970911435205115935",
						"awardYear": "",
						"awardGrade": "特等奖",
						"approvalNo": "no33453",
						"certificateNo": "645465677",
						"rewardNature": "行政",
						"incentives": "奖励",
						"approverCode": "REWARD_001",
						"approverLevel": "中央、国家级(正)",
						"approvalTime": "2024-02-03",
						"awardCancellation": "false",
						"awardCancellationTime": "2024-04-21",
						"cancellationReason": "违反纪律",
						"newAttachment": "c6bce09e-f3e3-4142-903d-afc030a5d23a",
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
						"staffTrainVODefine": {
							"define1": "242424",
							"define2_name": "00000004"
						},
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
						"isHighestDegree": "true",
						"isHighestFullDegree": "true",
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
	1	2026-03-12	
更新
请求说明
新增
请求参数 (57)
更新
请求参数 (462)
删除
请求参数 (119)
更新
返回参数 (68)
API文档描述治理-v2
	2	2025-06-20	
新增
请求参数 isOnlyChild
新增
请求参数 certIssuePlace
新增
返回参数 isOnlyChild
新增
返回参数 certIssuePlace
新增独生子女
	3	2025-05-08	
更新
请求说明
新增
请求参数 (34)
更新
请求参数 (8)
新增
返回参数 (23)
更新
返回参数 title
更新
返回参数 ratingOrg
更新
返回参数 channel
修改描述

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

