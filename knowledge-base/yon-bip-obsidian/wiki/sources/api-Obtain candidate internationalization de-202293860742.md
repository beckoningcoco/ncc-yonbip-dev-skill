---
title: "获取候选人国际化详细信息MDD"
apiId: "2022938607428304903"
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

# 获取候选人国际化详细信息MDD

>  请求方式	POST | Candidate Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/HRCloud/getGlobalCandidateDetail
请求方式	POST
ContentType	application/json
应用场景	开放API
API类别	详情查询
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	候选人ID，与候选人编码二选一
code	string	否	否	候选人编码，与候选人ID二选一
loadDataEntityKeys	string	是	否	实体keys
tplid	string	否	否	模板id
billnum	string	否	否	模板billnum

## 3. 请求示例

Url: /yonbip/hrcloud/HRCloud/getGlobalCandidateDetail?access_token=访问令牌
Body: {
	"id": "",
	"code": "",
	"loadDataEntityKeys": [
		""
	],
	"tplid": "",
	"billnum": ""
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
data	object	否	候选人数据
attachlist	string	否	附件 示例：f0b7e210-4c20-11ec-a04b-adf7820e8ff1
birthDate	string	否	出生日期 示例：1988-11-09 00:00:00
bizManTag	int	否	业务员 0:否 1:是 示例：1
annualsalary	Decimal	否	年薪 示例：56789.00
salarystructure	string	否	薪资结构 示例：3456
probationwage	Decimal	否	试用期工资 示例：4567.00
formalwage	Decimal	否	转正工资 示例：3456.00
resumeUrl	string	否	简历链接 示例：https://34erf/7uyhg
evaluationUrl	string	否	面试评价链接 示例：https://34erf/7uyhg
assessUrl	string	否	测评链接 示例：https://34erf/7uyhg
examinationresults	string	否	笔试成绩链接 示例：https://34erf/7uyhg
recruitmenttype	string	否	招聘类型 示例：这是招聘类型
resumesource	string	否	简历来源 示例：这是简历来源
personnelinformation	string	否	人员信息采集表链接 示例：https://34erf/7uyhg
recruitmentitem	string	否	招聘项目 示例：这是招聘项目
recruitPostId	string	否	招聘职位id 示例：534536456
bloodType	string	否	血型.id 示例：49690e3f-c37f-4f25-b32f-7b5490f60046
bloodTypeName	string	否	血型 示例：O型
certNo	string	否	证件号 示例：110101198611019935
certType	string	否	证件类型.id 示例：0008-7ce7-45c2-b4ba-ac907d1b76c7
certTypeName	string	否	证件类型 示例：出生证
characterrpr	string	否	户口性质.id 示例：9ca88f98-6605-4bc1-8c14-dd51d1c55f64
characterrprName	string	否	户口性质 示例：外阜城镇
code	string	否	候选人编码 示例：106328
candidateStaffCode	string	否	候选人员工编码
workAge	Decimal	否	工龄 示例：2.5
applyId	string	否	大易申请id 示例：231211118909
documenterId	string	否	制单人id 示例：3123435453645
country	string	否	国籍地区.id 示例：0040be98-735b-44c0-afe5-54d11a96037b
countryName	string	否	国籍地区 示例：中国大陆
degree	string	否	学位.id 示例：2524655698301440
degreeName	string	否	学位 示例：名誉博士
education	string	否	学历.id 示例：2524654981517824
educationName	string	否	学历 示例：高中
email	string	否	邮箱 示例：88889989@163.com
enable	string	否	启用状态 0：初始化 1：启用 2：停用 示例：1
id	string	否	候选人id 示例：2365489600648192
joinPolityDate	string	否	加入党团时间 示例：2021-12-01
joinWorkDate	string	否	参加工作日期 示例：2020-11-01
linkAddr	string	否	联系地址 示例：联系地址
linkedIn	string	否	领英 示例：linkedInliu
marital	string	否	婚姻状况.id 示例：2438398174516480
maritalName	string	否	婚姻状况 示例：w11002845
mobile	string	否	手机号 示例：+86-13611106321
name	string	否	候选人姓名 示例：刘嘻嘻
photo	string	否	头像url 示例：https://yyfw-oss2.oss-cn-beijing.aliyuncs.com/test_ggxeyop5_0000005429.jpg
nationality	string	否	民族.id 示例：694d8570-3da8-4162-b521-1d0dfa2a13ea
nationalityName	string	否	民族 示例：阿昌族
officeTel	string	否	办公电话 示例：010-88889989
orgId	string	否	公司.id 示例：2365489471230208
orgName	string	否	公司 示例：部门名称106328
origin	string	否	籍贯.id 示例：bfbceff7-5cf3-11e9-817e-7cd30abea0c0
originName	string	否	籍贯 示例：和平区
permanreside	string	否	户口所在地.id 示例：bfad109f-5cf3-11e9-817e-7cd30abea0c0
permanresideName	string	否	户口所在地 示例：东城区
political	string	否	政治面貌.id 示例：2155547434276110
politicalName	string	否	政治面貌 示例：中共预备党员
qq	string	否	QQ 示例：878878788
selfEmail	string	否	个人邮箱 示例：geren88889989@163.com
sex	int	否	性别 0: 未知 1:男 2:女 示例：1
shopAssisTag	int	否	是否店员 0:否 1:是 示例：1
shortName	string	否	候选人姓名简拼 示例：zwj
userId	string	否	关联用户 示例：6fc2e502-9858-4a3c-9435-3e96e7318fce
weiXin	string	否	微信 示例：weiXin88
masterOrgKeyField	string	否	主实体属性标记 示例：subOrgId
firstName	string	否	候选人姓 示例：张
middleName	string	否	候选人中间名 示例：无
lastName	string	否	候选人名 示例：无忌
entrySchemeId	string	否	入职方案id 示例：66876565779080890
entrySchemeName	string	否	入职方案名称 示例：方案A
entrySchemeCategoryId	string	否	入职方案类别id 示例：897897868767576567576576
entrySchemeCategoryName	string	否	入职方案类别名称 示例：方案类别A
langAbility	object	是	语言能力
techPost	object	是	专业技术职务
ass	object	是	绩效记录
certificate	object	是	证书子集
dotline	object	是	虚线上级
bankAcct	object	是	银行账户
cert	object	是	证件信息
socialRel	object	是	社会关系
orgRel	object	是	工作关系集合
title	object	是	职称记录
candidateJob	object	是	任职信息
reward	object	是	奖励情况
protocol	object	是	协议信息
probation	object	是	试用信息
train	object	是	培训记录
resume	object	是	履历信息
proqualify	object	是	职业资格
edu	object	是	学历信息
ctrt	object	是	合同信息
interview	object	是	面试伦次集合
referenceCheck	object	是	背调信息集合
referenceCheckExternal	object	是	外部背调信息集合
evaluationMessage	object	是	测评信息集合
writtenExamination	object	是	笔试信息集合
defineSet	object	是	自定义信息集名称
address	object	是	地址信息
globalInfoCHN	object	是	中国大陆全球化个人信息
globalInfoGBR	object	是	英国全球化个人信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"attachlist": "f0b7e210-4c20-11ec-a04b-adf7820e8ff1",
		"birthDate": "1988-11-09 00:00:00",
		"bizManTag": 1,
		"annualsalary": 56789,
		"salarystructure": "3456",
		"probationwage": 4567,
		"formalwage": 3456,
		"resumeUrl": "https://34erf/7uyhg",
		"evaluationUrl": "https://34erf/7uyhg",
		"assessUrl": "https://34erf/7uyhg",
		"examinationresults": "https://34erf/7uyhg",
		"recruitmenttype": "这是招聘类型",
		"resumesource": "这是简历来源",
		"personnelinformation": "https://34erf/7uyhg",
		"recruitmentitem": "这是招聘项目",
		"recruitPostId": "534536456",
		"bloodType": "49690e3f-c37f-4f25-b32f-7b5490f60046",
		"bloodTypeName": "O型",
		"certNo": "110101198611019935",
		"certType": "0008-7ce7-45c2-b4ba-ac907d1b76c7",
		"certTypeName": "出生证",
		"characterrpr": "9ca88f98-6605-4bc1-8c14-dd51d1c55f64",
		"characterrprName": "外阜城镇",
		"code": "106328",
		"candidateStaffCode": "",
		"workAge": 2.5,
		"applyId": "231211118909",
		"documenterId": "3123435453645",
		"country": "0040be98-735b-44c0-afe5-54d11a96037b",
		"countryName": "中国大陆",
		"degree": "2524655698301440",
		"degreeName": "名誉博士",
		"education": "2524654981517824",
		"educationName": "高中",
		"email": "88889989@163.com",
		"enable": "1",
		"id": "2365489600648192",
		"joinPolityDate": "2021-12-01",
		"joinWorkDate": "2020-11-01",
		"linkAddr": "联系地址",
		"linkedIn": "linkedInliu",
		"marital": "2438398174516480",
		"maritalName": "w11002845",
		"mobile": "+86-13611106321",
		"name": "刘嘻嘻",
		"photo": "https://yyfw-oss2.oss-cn-beijing.aliyuncs.com/test_ggxeyop5_0000005429.jpg",
		"nationality": "694d8570-3da8-4162-b521-1d0dfa2a13ea",
		"nationalityName": "阿昌族",
		"officeTel": "010-88889989",
		"orgId": "2365489471230208",
		"orgName": "部门名称106328",
		"origin": "bfbceff7-5cf3-11e9-817e-7cd30abea0c0",
		"originName": "和平区",
		"permanreside": "bfad109f-5cf3-11e9-817e-7cd30abea0c0",
		"permanresideName": "东城区",
		"political": "2155547434276110",
		"politicalName": "中共预备党员",
		"qq": "878878788",
		"selfEmail": "geren88889989@163.com",
		"sex": 1,
		"shopAssisTag": 1,
		"shortName": "zwj",
		"userId": "6fc2e502-9858-4a3c-9435-3e96e7318fce",
		"weiXin": "weiXin88",
		"masterOrgKeyField": "subOrgId",
		"firstName": "张",
		"middleName": "无",
		"lastName": "无忌",
		"entrySchemeId": "66876565779080890",
		"entrySchemeName": "方案A",
		"entrySchemeCategoryId": "897897868767576567576576",
		"entrySchemeCategoryName": "方案类别A",
		"langAbility": [
			{
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"proLevel": "2475282966107140",
				"language": "f74e0f14-5970-45f0-a09e-77d9d73849a1",
				"id": "2524738586775814",
				"recordNum": 0,
				"proLevelName": "精通",
				"languageName": "中文(简体)",
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"certName": "英语6级",
				"certNo": "1651616",
				"langLevel": "高级",
				"memo": "备注",
				"getDate": "2020-11-22"
			}
		],
		"techPost": [
			{
				"beginDate": "2020-11-06",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"titleName": "测试1",
				"endDate": "2020-11-22",
				"id": "2524738586775811",
				"title": "2508987893993728",
				"recordNum": 0,
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
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
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"endDate": "2019-11-23",
				"id": "2524738586775808",
				"recordNum": 0,
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"score": "100",
				"assDoc": "151",
				"rank": "1"
			}
		],
		"certificate": [
			{
				"beginDate": "2021-11-18",
				"certificateCode": "156161",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"endDate": "2021-12-18",
				"certificateName": "11",
				"id": "2524738586775816",
				"recordNum": 0,
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"authority": "腾讯"
			}
		],
		"dotline": [
			{
				"endDate": "2020-11-09",
				"lineName": "40017894856903424",
				"lineTypeName": "娃哈哈",
				"recordNum": 1,
				"beginDate": "2020-11-08",
				"lineNameName": "测试录用1234",
				"lineType": "2476736877794560",
				"id": "2524738586775821",
				"candidateId": "2509224682574080",
				"lastFlag": false,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"memo": "备注"
			}
		],
		"bankAcct": [
			{
				"bankCode": "102",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"openBank": "2493691868090624",
				"sysid": "diwork",
				"isDefaultCard": false,
				"bankName": "中国工商银行",
				"recordNum": 0,
				"openBankName": "测试网点",
				"bank": "2482441004520705",
				"currencyName": "人民币",
				"acctType": "BAT00001",
				"currency": "2475282863117312",
				"id": "2524738586775813",
				"candidateId": "2509224682574080",
				"account": "165161",
				"lastFlag": 0,
				"tenant": "0000KURZD1WR4P0VIC0000"
			}
		],
		"cert": [
			{
				"certNo": "152020",
				"certType": "0017-2647-4d9f-81ea-4d6a96be26b2",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"certTypeName": "警官证",
				"id": "2524738586775822",
				"recordNum": 0,
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"endDate": "2021-11-19",
				"memo": "说明",
				"beginDate": "2021-11-19",
				"extendOrg": "阿里巴巴"
			}
		],
		"socialRel": [
			{
				"relName": "李浩",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"relationName": "配偶",
				"id": "2524738586775810",
				"linkTel": "+86-15142845632",
				"recordNum": 0,
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"relation": "2475282878944265",
				"linkAddr": "上海",
				"workCorp": "腾讯",
				"isUrgent": false,
				"workDuty": "程序员"
			}
		],
		"orgRel": [
			{
				"id": "53455645645",
				"candidateId": "756756876867",
				"groupWorkAgeAdj": 2,
				"seniorityAdj": 2,
				"rmChannel": "453453645645",
				"entrySrc": "75675675876867",
				"recruitPostId": "64575787686769",
				"isReturn": false
			}
		],
		"title": [
			{
				"certType": "2476752253768960",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"certTypeName": "哈哈哈哈哈哈哈或",
				"certCode": "02313",
				"endDate": "2021-11-11",
				"certRankName": "5A",
				"certRank": "2476752765736192",
				"isPrint": false,
				"recordNum": 0,
				"beginDate": "2021-11-02",
				"assOrg": "华信",
				"id": "2524738586775819",
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"memo": "备注",
				"proField": "英语"
			}
		],
		"candidateJob": [
			{
				"deptName": "部门",
				"isMainJob": true,
				"orgPath": "天海总公司",
				"endDate": "2021-11-02",
				"endFlag": true,
				"recordNum": 3,
				"orgId": "2475303020597504",
				"orgRelId": "289ab53c5e2246c9880196a290373816",
				"assgId": 1,
				"psnclName": "自有员工",
				"newAttachment": "051636af-ac64-4aea-ba67-7b556c3f37af",
				"staffFte": "100%",
				"id": "2509224682574081",
				"psnclId": "d1170ea764cb4d95a30554cda58866c9",
				"trnsType": "2475282865689711",
				"lastFlag": false,
				"trnsEvent": 1,
				"trnsTypeName": "正式员工录用",
				"trnsReasonName": "",
				"trnsReason": "534556456457467",
				"orgName": "天海总公司",
				"deptId": "2475353647993088",
				"beginDate": "2020-11-01",
				"showOrder": 9999999,
				"candidateId": "2509224682574080",
				"memo": "备注",
				"jobName": "职务名称",
				"jobId": "88462662626",
				"jobTypeName": "职务类别名称",
				"jobTypeId": "88462662626",
				"postStatusName": "在职状态名称",
				"postStatus": "",
				"addrName": "地点名称",
				"addrId": "1515151",
				"bmLocationName": "社保缴纳地名称",
				"bmLocation": "大连",
				"directorName": "主管姓名",
				"director": "",
				"jobRankName": "职等名称",
				"jobRankId": "1",
				"jobGradeName": "职级名称",
				"jobGradeId": "59261",
				"waStruct": "2345",
				"postId": "15",
				"isweaken": true,
				"effectiveNumber": "",
				"wageGroup": "5435345345",
				"newPostId": "54353463",
				"empform": "65465464",
				"localOrgId": "878768678"
			}
		],
		"reward": [
			{
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"rewardReason": "李浩",
				"rewardOrg": "华信",
				"id": "2524738586775820",
				"rewardDate": "2021-11-02",
				"rewardItem": "大奖",
				"recordNum": 0,
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"memo": "备注"
			}
		],
		"protocol": [
			{
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"termMonth": 0,
				"endDate": "2020-11-26",
				"protocolNum": "PROT000057",
				"majorCorpId": "2479635332305152",
				"protocolType": "2475283024958467",
				"contType": 1,
				"signDate": "2020-11-12",
				"recordNum": 0,
				"beginDate": "2020-11-21",
				"newAttachment": "c6bce09e-f3e3-4142-903d-afc030a5d23a",
				"majorCorpName": "3241234",
				"id": "2524738586775815",
				"protocolTypeName": "保密协议",
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"isReceive": false,
				"memo": "备注",
				"workAddr": "工作地点",
				"termUnit": ""
			}
		],
		"probation": [
			{
				"result": 1,
				"beginDate": "2020-11-01",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"positiveDate": "2020-11-12",
				"endDate": "2020-11-07",
				"endFlag": false,
				"id": "2524738586775823",
				"type": 1,
				"lastFlag": true,
				"candidateId": "2509224682574080",
				"tenant": "0000KURZD1WR4P0VIC0000",
				"memo": "备注",
				"recordnum": "1"
			}
		],
		"train": [
			{
				"beginDate": "2021-11-03",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"endDate": "2021-11-13",
				"id": "2524738586775809",
				"recordNum": 0,
				"candidateId": "2509224682574080",
				"content": "英语",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"status": "1",
				"earnHours": "33",
				"earnCredit": "100",
				"courseId": "78456",
				"classifiCation": "543543534",
				"hours": "3",
				"memo": "备注",
				"protocolNo": "3453",
				"fee": "500",
				"score": "100",
				"dayOrHours": "1",
				"trainingChannels": "",
				"trainingChannelsCode": "",
				"trainingChannelsName": "",
				"trainingType": "",
				"trainingTypeCode": "",
				"trainingTypeName": "",
				"trainingLocation": "",
				"trainingLocationCode": "",
				"trainingLocationName": ""
			}
		],
		"resume": [
			{
				"workCorp": "天海总公司",
				"beginDate": "2023-11-01",
				"workDept": "部门",
				"staffJobId": "2522091852140800",
				"id": "a7e34c2a12c74e92aa062757560ba634",
				"recordNum": 1,
				"candidateId": "2509224682574080",
				"lastFlag": false,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"endDate": "2022-11-19",
				"memo": "备注",
				"workDuty": "劳动",
				"workPost": "华信",
				"workJob": "123",
				"certifier": "哈哈"
			}
		],
		"proqualify": [
			{
				"beginDate": "2020-11-18",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"titleName": "主治医师",
				"getDate": "2021-11-01",
				"id": "2524738586775818",
				"title": "a7baf563-d9a1-4ac5-9331-fb640bc04aae",
				"recordNum": 0,
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"memo": "备注",
				"certNo": "123",
				"ratingOrg": "123551516",
				"isPrefs": true,
				"endDate": "2021-11-01"
			}
		],
		"edu": [
			{
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"education": "2476728898130176",
				"endDate": "2019-11-22",
				"studyModeName": "非全日制",
				"degree": "2476730871353600",
				"degreeName": "学士",
				"recordNum": 0,
				"beginDate": "2019-11-07",
				"educationName": "高中",
				"newAttachment": "3e55f0e1-99bf-4cf5-93d9-47641d7c8709",
				"id": "2524738586759424",
				"studyMode": "05c03019-156f-47b5-8d46-20f57944a594",
				"candidateId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"major": "2524738586759424",
				"memo": "备注",
				"eduSystem": "1",
				"certifCode": "2524738586759424",
				"educationCtifCode": "2524738586759424",
				"isPrefs": false,
				"school": ""
			}
		],
		"ctrt": [
			{
				"continueTime": 1,
				"endDate": "2021-02-20",
				"termType": 1,
				"signDate": "2020-11-11",
				"recordNum": 0,
				"orgrelId": "289ab53c5e2246c9880196a290373816",
				"probEndDate": "2020-12-20",
				"newAttachment": "76614af0-b8fb-45ec-95c9-27c2d062cfec",
				"majorCorpName": "3241234",
				"staffJobId": "2522091852140800",
				"id": "2524738586775817",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"termMonth": 3,
				"majorCorpId": "2479635332305152",
				"workAddr": "2479635732058368",
				"isReceive": false,
				"contType": 1,
				"beginDate": "2020-11-20",
				"probSalary": 200,
				"proMonth": 1,
				"contractNum": "CTRT000459",
				"workAddrName": "1235123",
				"candidateId": "2509224682574080",
				"neconomy": 100,
				"startSalary": 50000,
				"unchReason": "123",
				"memo": "备注",
				"presenter": "645645645",
				"contractCode": "120",
				"breachMoney": 5000,
				"proBeginDate": "2020-11-20",
				"termUnit": ""
			}
		],
		"interview": [
			{
				"id": "22432434",
				"candidateId": "7567567567",
				"interviewBeginTime": "2021-09-01 12:20:00",
				"interviewEndTime": "2021-09-01 13:00:00",
				"interviewPlace": "这是面试地点",
				"interviewType": "初试",
				"round": 2,
				"interviewResult": 1,
				"interviewScore": [
					{
						"id": "543534536",
						"interviewId": "5676575676",
						"evaluateTime": "2021-09-01 14:00:09",
						"interviewExternalKey": "5345343",
						"interviewName": "这是面试官姓名",
						"interviewEmail": "42355345345@qq.com",
						"isMain": false,
						"isForCc": false,
						"score": 89,
						"interviewEvaluation": [
							{
								"id": "78678678",
								"interviewScoreId": "6456456546",
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
				"id": "5345345645645",
				"candidateId": "53453453",
				"intervieweeName": "这是被访谈人",
				"intervieweeCorp": "这是被访谈人单位",
				"intervieweePhone": "13432321111",
				"interviewDate": "2023-09-01",
				"interviewAdvice": "这是访谈建议",
				"intervieweeRelation": "这是与候选人关系",
				"interviewExecutor": "这是访谈执行人",
				"interviewMode": "这是访谈方式",
				"intervieweePost": "这是被访谈人职位",
				"interviewSituation": "这是访谈情况",
				"newAttachment": "5453453-4234234"
			}
		],
		"referenceCheckExternal": [
			{
				"id": "5345435345",
				"candidateId": "42342342",
				"type": 1,
				"riskLevel": "这是背调风险等级",
				"timeLine": "这是阶段报告",
				"createTime": "2023-09-01 12:01:09",
				"orderCode": "424243",
				"menus": "这是背调套餐",
				"reportUrl": "https://edc34/3wwss",
				"status": "这是背调状态",
				"jiaoZhenMenuPrice": 1234,
				"jiaoZhenRemark": "这是较真备注(较真)",
				"orderPrice": 2345,
				"menuIteam": "这是包含产品",
				"workNumber": "这是工作段数",
				"newAttachment": "4234324-76756756"
			}
		],
		"evaluationMessage": [
			{
				"id": "424234234",
				"candidateId": "756758678",
				"score": "89",
				"overallEvaluation": "这是心理健康总评",
				"name": "这是测评名称",
				"type": 2,
				"newAttachment": "4234234-6456456"
			}
		],
		"writtenExamination": [
			{
				"id": "8678678678",
				"candidateId": "353453453",
				"score": 99,
				"round": 2,
				"passStatus": "这是笔试结果",
				"totalScore": 98,
				"writternUrl": "https://1qsw33/tg67yy",
				"type": 1
			}
		],
		"defineSet": [
			{
				"id": "43235453453654"
			}
		],
		"address": [
			{
				"vid": "",
				"id": "",
				"effectiveTime": "2026-06-07",
				"addressType": "",
				"country": "",
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
					"addressfifteen": "",
					"addressTypeName": "",
					"countryCode": ""
				}
			}
		],
		"globalInfoCHN": [
			{
				"vid": "",
				"id": "",
				"country": "",
				"sex": "",
				"effectiveTime": "2026-06-07",
				"marital": "",
				"characterrpr": "",
				"permanreside": "",
				"political": "",
				"origin": "",
				"nationality": "",
				"joinPolityDate": "2026-06-07",
				"nationalityName": "",
				"originName": "",
				"politicalName": "",
				"permanresideName": "",
				"characterrprName": "",
				"maritalName": "",
				"countryCode": "",
				"marriageDate": "2026-06-07",
				"formalPartyDate": "",
				"citizenship": "",
				"citizenshipName": ""
			}
		],
		"globalInfoGBR": [
			{
				"vid": "",
				"id": "",
				"country": "",
				"sex": "",
				"marital": "",
				"effectiveTime": "2026-06-07",
				"religion": "",
				"ethnicity": "",
				"noc": 0,
				"countryCode": "",
				"maritalName": "",
				"religionName": "",
				"ethnicityName": "",
				"citizenship": "",
				"globalInfoIND": [
					{
						"vid": "",
						"id": "",
						"country": "",
						"sex": 0,
						"marital": "",
						"effectiveTime": "2026-06-07",
						"religion": "",
						"casteOfIndia": "",
						"noc": "",
						"occupationCode": "",
						"countryCode": "",
						"maritalName": "",
						"religionName": "",
						"casteOfIndiaName": "",
						"occupationCodeName": "",
						"citizenship": "",
						"citizenshipName": ""
					}
				],
				"globalInfoMAS": [
					{
						"vid": "",
						"id": "",
						"country": "",
						"sex": 0,
						"marital": "",
						"effectiveTime": "2026-06-07",
						"religion": "",
						"aboriginal": true,
						"countryCode": "",
						"maritalName": "",
						"religionName": "",
						"citizenship": "",
						"citizenshipName": ""
					}
				],
				"globalInfoSIN": [
					{
						"vid": "",
						"id": "",
						"country": "",
						"sex": 0,
						"marital": "",
						"effectiveTime": "2026-06-07",
						"religion": "",
						"ethnicity": "",
						"noc": 0,
						"countryCode": "",
						"maritalName": "",
						"religionName": "",
						"ethnicityName": "",
						"citizenship": "",
						"citizenshipName": ""
					}
				],
				"globalInfoUSA": [
					{
						"vid": "",
						"id": "",
						"country": "",
						"sex": "",
						"marital": "",
						"effectiveTime": "2026-06-07",
						"exsoldier": true,
						"ethnicity": "",
						"maritalName": "",
						"ethnicityName": "",
						"citizenship": "",
						"citizenshipName": ""
					}
				],
				"globalInfoHK": [
					{
						"vid": "",
						"id": "",
						"citizenship": "",
						"sex": "",
						"marital": "",
						"maritalName": "",
						"foreignNationality": true,
						"arriveHKDate": "2026-06-07",
						"marriageDate": "",
						"citizenshipName": "",
						"continuousContributions": true,
						"industryPlan": true,
						"contributionSchemeName": "",
						"retirementPlan": ""
					}
				]
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
999	根据候选人编码未查找到有效候选人信息!	请输入正确的候选人id或编码

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-20	
新增
返回参数 (9)
新增培训渠道、培训类型、培训地

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

