---
title: "国际化获取员工详细信息MDD"
apiId: "1938991977002434565"
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

# 国际化获取员工详细信息MDD

>  请求方式	POST | Employee Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/HRCloud/getGlobalStaffDetail
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
id	string	否	否	人员ID
loadDataEntityKeys	string	是	否	实体keys，可多传，逗号分隔
code	string	否	否	人员编码

## 3. 请求示例

Url: /yonbip/hrcloud/HRCloud/getGlobalStaffDetail?access_token=访问令牌
Body: {
	"id": "",
	"loadDataEntityKeys": [
		""
	],
	"code": ""
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
data	object	否	子表数据
attachlist	string	否	附件 示例：f0b7e210-4c20-11ec-a04b-adf7820e8ff1
birthDate	string	否	出生日期 示例：1988-11-09 00:00:00
bizManTag	string	否	业务员 0:否 1:是 示例：1
bloodType	string	否	血型.id 示例：49690e3f-c37f-4f25-b32f-7b5490f60046
bloodTypeCode	string	否	血型.code
joinedDate	string	否	入职日期 示例：2022-01-01
bloodTypeName	string	否	血型 示例：O型
certNo	string	否	证件号 示例：110101198611019935
departDate	string	否	离职日期 示例：2022-09-09
certType	string	否	证件类型.id 示例：0008-7ce7-45c2-b4ba-ac907d1b76c7
certTypeCode	string	否	证件类型.code
certTypeName	string	否	证件类型 示例：出生证
characterrpr	string	否	户口性质.id 示例：9ca88f98-6605-4bc1-8c14-dd51d1c55f64
characterrprCode	string	否	户口性质.code
characterrprName	string	否	户口性质 示例：外阜城镇
code	string	否	员工编码 示例：106328
country	string	否	国籍地区.id 示例：0040be98-735b-44c0-afe5-54d11a96037b
countryCode	string	否	国籍地区.code
countryName	string	否	国籍地区 示例：中国大陆
degree	string	否	学位.id 示例：2524655698301440
degreeCode	string	否	学位.code
degreeName	string	否	学位 示例：名誉博士
education	string	否	学历.id 示例：2524654981517824
educationCode	string	否	学历.code
educationName	string	否	学历 示例：高中
email	string	否	邮箱 示例：88889989@163.com
enable	string	否	启用状态 0：初始化 1：启用 2：停用 示例：1
id	string	否	员工id 示例：2365489600648192
joinPolityDate	string	否	加入党团时间 示例：2021-12-01 00:00:00
joinWorkDate	string	否	参加工作日期 示例：2020-11-01 00:00:00
linkAddr	string	否	联系地址 示例：联系地址
linkedIn	string	否	领英 示例：linkedInliu
majorcorpid	string	否	合同主体单位
marital	string	否	婚姻状况.id 示例：2438398174516480
maritalCode	string	否	婚姻状况.code
maritalName	string	否	婚姻状况 示例：w11002845
mobile	string	否	手机号 示例：+86-13611106321
name	string	否	员工姓名 示例：刘嘻嘻
nationality	string	否	民族.id 示例：694d8570-3da8-4162-b521-1d0dfa2a13ea
nationalityCode	string	否	民族.code
nationalityName	string	否	民族 示例：阿昌族
officeTel	string	否	办公电话 示例：010-88889989
orgId	string	否	公司.id 示例：2365489471230208
orgName	string	否	公司 示例：部门名称106328
origin	string	否	籍贯.id 示例：bfbceff7-5cf3-11e9-817e-7cd30abea0c0
originCode	string	否	籍贯.code
originName	string	否	籍贯 示例：和平区
permanreside	string	否	户口所在地.id 示例：bfad109f-5cf3-11e9-817e-7cd30abea0c0
permanresideCode	string	否	户口所在地.code
permanresideName	string	否	户口所在地 示例：东城区
political	string	否	政治面貌.id 示例：2155547434276110
politicalCode	string	否	政治面貌.code
politicalName	string	否	政治面貌 示例：中共预备党员
pubts	string	否	时间戳 示例：2021-12-09 19:34:55
qq	string	否	QQ 示例：878878788
selfEmail	string	否	个人邮箱 示例：geren88889989@163.com
sex	string	否	性别 0: 未知 1:男 2:女
shopAssisTag	string	否	是否店员 0:否 1:是 示例：1
shortName	string	否	姓名简拼 示例：lxx
tenant	string	否	租户ID 示例：csrka3z7
userId	string	否	关联用户 示例：6fc2e502-9858-4a3c-9435-3e96e7318fce
weiXin	string	否	微信 示例：weiXin88
masterOrgKeyField	string	否	主实体属性标记 示例：subOrgId
subOrgId	string	否	主组织ID 示例：2475303020597504
staffLangAbility	object	是	语言能力
staffTechPost	object	是	专业技术职务
staffAss	object	是	绩效记录
staffCertificate	object	是	证书子集
staffDotline	object	是	虚线上级
staffBankAcct	object	是	银行账户
staffCert	object	是	证件信息
staffSocialRel	object	是	社会关系
staffJob	object	是	任职信息
staffTitle	object	是	职称记录
staffReward	object	是	奖励情况
staffProtocol	object	是	协议信息
staffTrain	object	是	培训记录
staffResume	object	是	履历信息
staffEdu	object	是	学历信息
staffProqualify	object	是	职业资格
staffCtrt	object	是	合同信息
staffOrgRel	object	是	工作关系
psnclId	string	否	人员类别id 示例：2467754435799
staffPart	object	是	其他任职信息
staffProbation	object	是	试用信息
staffNameTZDefines	object	是	姓名时间轴数据
staffAddress	object	是	地址信息
staffGlobalInfoCHN	object	是	中国大陆全球化个人信息
staffGlobalInfoGBR	object	是	英国全球化个人信息
staffGlobalInfoIND	object	是	印度全球化个人信息
staffGlobalInfoMAS	object	是	马来西亚全球化个人信息
staffGlobalInfoSIN	object	是	新加坡全球化个人信息
staffGlobalInfoUSA	object	是	美国全球化个人信息
staffPunishment	object	是	惩处信息
staffCadre	object	是	任免信息
staffHealthSituation	object	是	健康信息
staffSocietyEmployment	object	是	社会任职信息
staffGlobalInfoHK	object	是	香港全球化个人信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"attachlist": "f0b7e210-4c20-11ec-a04b-adf7820e8ff1",
		"birthDate": "1988-11-09 00:00:00",
		"bizManTag": "1",
		"bloodType": "49690e3f-c37f-4f25-b32f-7b5490f60046",
		"bloodTypeCode": "",
		"joinedDate": "2022-01-01",
		"bloodTypeName": "O型",
		"certNo": "110101198611019935",
		"departDate": "2022-09-09",
		"certType": "0008-7ce7-45c2-b4ba-ac907d1b76c7",
		"certTypeCode": "",
		"certTypeName": "出生证",
		"characterrpr": "9ca88f98-6605-4bc1-8c14-dd51d1c55f64",
		"characterrprCode": "",
		"characterrprName": "外阜城镇",
		"code": "106328",
		"country": "0040be98-735b-44c0-afe5-54d11a96037b",
		"countryCode": "",
		"countryName": "中国大陆",
		"degree": "2524655698301440",
		"degreeCode": "",
		"degreeName": "名誉博士",
		"education": "2524654981517824",
		"educationCode": "",
		"educationName": "高中",
		"email": "88889989@163.com",
		"enable": "1",
		"id": "2365489600648192",
		"joinPolityDate": "2021-12-01 00:00:00",
		"joinWorkDate": "2020-11-01 00:00:00",
		"linkAddr": "联系地址",
		"linkedIn": "linkedInliu",
		"majorcorpid": "",
		"marital": "2438398174516480",
		"maritalCode": "",
		"maritalName": "w11002845",
		"mobile": "+86-13611106321",
		"name": "刘嘻嘻",
		"nationality": "694d8570-3da8-4162-b521-1d0dfa2a13ea",
		"nationalityCode": "",
		"nationalityName": "阿昌族",
		"officeTel": "010-88889989",
		"orgId": "2365489471230208",
		"orgName": "部门名称106328",
		"origin": "bfbceff7-5cf3-11e9-817e-7cd30abea0c0",
		"originCode": "",
		"originName": "和平区",
		"permanreside": "bfad109f-5cf3-11e9-817e-7cd30abea0c0",
		"permanresideCode": "",
		"permanresideName": "东城区",
		"political": "2155547434276110",
		"politicalCode": "",
		"politicalName": "中共预备党员",
		"pubts": "2021-12-09 19:34:55",
		"qq": "878878788",
		"selfEmail": "geren88889989@163.com",
		"sex": "",
		"shopAssisTag": "1",
		"shortName": "lxx",
		"tenant": "csrka3z7",
		"userId": "6fc2e502-9858-4a3c-9435-3e96e7318fce",
		"weiXin": "weiXin88",
		"masterOrgKeyField": "subOrgId",
		"subOrgId": "2475303020597504",
		"staffLangAbility": [
			{
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"proLevel": "2475282966107140",
				"language": "f74e0f14-5970-45f0-a09e-77d9d73849a1",
				"id": "2524738586775814",
				"recordNum": 0,
				"proLevelName": "精通",
				"languageName": "中文(简体)",
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"certName": "英语6级",
				"certNo": "1651616",
				"langLevel": "高级",
				"memo": "备注",
				"getDate": "2020-11-22 00:00:00",
				"proLevelCode": "",
				"languageCode": ""
			}
		],
		"staffTechPost": [
			{
				"beginDate": "2020-11-06 00:00:00",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"titleName": "测试1",
				"endDate": "2020-11-22 00:00:00",
				"id": "2524738586775811",
				"title": "2508987893993728",
				"recordNum": 0,
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"ratingOrg": "腾讯",
				"isPrefs": false,
				"certNo": "15615165",
				"memo": "备注",
				"channel": "获取方式",
				"titleCode": "",
				"level": "",
				"levelName": "",
				"levelCode": "",
				"professionalTitleSeries": "",
				"subseries": "",
				"qualificationNumber": "",
				"professionSpecialties": "",
				"acquisitionMethod": ""
			}
		],
		"staffAss": [
			{
				"beginDate": "2019-11-13 00:00:00",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"endDate": "2019-11-23 00:00:00",
				"id": "2524738586775808",
				"recordNum": 0,
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"score": "100",
				"assDoc": "151",
				"rank": "1",
				"rankCode": ""
			}
		],
		"staffCertificate": [
			{
				"beginDate": "2021-11-18 00:00:00",
				"certificateCode": "156161",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"endDate": "2021-12-18 00:00:00",
				"certificateName": "11",
				"id": "2524738586775816",
				"recordNum": 0,
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"authority": "腾讯"
			}
		],
		"staffDotline": [
			{
				"endDate": "2020-11-09 00:00:00",
				"lineName": "40017894856903424",
				"lineTypeName": "娃哈哈",
				"recordNum": 1,
				"lineNameName": "测试录用1234",
				"beginDate": "2020-11-08 00:00:00",
				"lineType": "2476736877794560",
				"id": "2524738586775821",
				"pubts": "2021-11-19 12:56:56",
				"staffId": "2509224682574080",
				"lastFlag": false,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"memo": "备注",
				"lineNameCode": "",
				"lineTypeCode": ""
			}
		],
		"staffBankAcct": [
			{
				"bankCode": "102",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"openBank": "2493691868090624",
				"sysid": "diwork",
				"isDefaultCard": 0,
				"bankName": "中国工商银行",
				"recordNum": 0,
				"openBankName": "测试网点",
				"bank": "2482441004520705",
				"currencyName": "人民币",
				"acctType": "BAT00001",
				"currency": "2475282863117312",
				"id": "2524738586775813",
				"staffId": "2509224682574080",
				"account": "165161",
				"lastFlag": 0,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"currencyCode": "",
				"openBankCode": "",
				"country": ""
			}
		],
		"staffCert": [
			{
				"certNo": "152020",
				"certType": "0017-2647-4d9f-81ea-4d6a96be26b2",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"certTypeName": "警官证",
				"id": "2524738586775822",
				"recordNum": 0,
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"endDate": "2021-11-19 12:56:55",
				"memo": "说明",
				"beginDate": "2021-11-19 12:56:55",
				"extendOrg": "阿里巴巴",
				"certTypeCode": "",
				"isPrefs": false,
				"country": "id"
			}
		],
		"staffSocialRel": [
			{
				"relName": "李浩",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"relationName": "配偶",
				"id": "2524738586775810",
				"linkTel": "+86-15142845632",
				"recordNum": 0,
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"relation": "2475282878944265",
				"linkAddr": "上海",
				"workCorp": "腾讯",
				"isUrgent": 0,
				"workDuty": "程序员",
				"relationCode": "",
				"certIssuePlace": ""
			}
		],
		"staffJob": [
			{
				"deptName": "部门",
				"isMainJob": true,
				"orgPath": "天海总公司",
				"endDate": "2021-11-02 00:00:00",
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
				"pubts": "2021-11-17 16:04:30",
				"trnsType": "2475282865689711",
				"lastFlag": false,
				"trnsEvent": 1,
				"trnsTypeName": "正式员工录用",
				"orgName": "天海总公司",
				"deptId": "2475353647993088",
				"beginDate": "2020-11-01 00:00:00",
				"deptPath": "天海总公司/部门",
				"showOrder": 9999999,
				"staffId": "2509224682574080",
				"memo": "备注",
				"jobName": "",
				"jobId": "88462662626",
				"jobTypeName": "",
				"jobTypeId": "88462662626",
				"postStatusName": "",
				"postStatus": "",
				"addrName": "",
				"addrId": "1515151",
				"trnsReasonName": "",
				"trnsReason": "484841262",
				"bmLocationName": "",
				"bmLocation": "大连",
				"directorName": "",
				"director": "",
				"jobRankName": "",
				"jobRankId": "1",
				"jobGradeName": "",
				"jobGradeId": "59261",
				"waStruct": "",
				"postId": "15",
				"disexplain": "",
				"dispositon": "上海",
				"jobMinRankId": "",
				"jobMaxRankId": "",
				"staffjobId": "23455677754",
				"isweaken": true,
				"staffjobCode": "",
				"effectiveNumber": "",
				"trnsTypeCode": "",
				"empformCode": "",
				"trnsReasonCode": "",
				"orgVidCode": "",
				"deptVidCode": "",
				"psnclIdCode": "",
				"newPostVidCode": "",
				"postVidCode": "",
				"jobGradeVidCode": "",
				"jobVidCode": "",
				"jobRankVidCode": "",
				"directorCode": "",
				"addrIdCode": "",
				"postStatusCode": "",
				"wageGroupCode": "",
				"dispositonCode": "",
				"localOrgVidCode": "",
				"jobTypeVidCode": ""
			}
		],
		"staffTitle": [
			{
				"certType": "2476752253768960",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"certTypeName": "哈哈哈哈哈哈哈或",
				"certCode": "02313",
				"endDate": "2021-11-11 00:00:00",
				"certRankName": "5A",
				"certRank": "2476752765736192",
				"isPrint": false,
				"recordNum": 0,
				"beginDate": "2021-11-02 00:00:00",
				"assOrg": "华信",
				"id": "2524738586775819",
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"memo": "备注",
				"proField": "英语",
				"certRankCode": "",
				"certTypeCode": ""
			}
		],
		"staffReward": [
			{
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"rewardReason": "李浩",
				"rewardOrg": "华信",
				"id": "2524738586775820",
				"rewardDate": "2021-11-02 00:00:00",
				"rewardItem": "大奖",
				"recordNum": 0,
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"memo": "备注"
			}
		],
		"staffProtocol": [
			{
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"termMonth": 0,
				"endDate": "2020-11-26 00:00:00",
				"protocolNum": "PROT000057",
				"majorCorpId": "2479635332305152",
				"protocolType": "2475283024958467",
				"contType": 1,
				"signDate": "2020-11-12 00:00:00",
				"recordNum": 0,
				"beginDate": "2020-11-21 00:00:00",
				"newAttachment": "c6bce09e-f3e3-4142-903d-afc030a5d23a",
				"majorCorpName": "3241234",
				"id": "2524738586775815",
				"protocolTypeName": "保密协议",
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"isReceive": "false",
				"memo": "备注",
				"workAddr": "工作地点",
				"belongJob": "",
				"majorCorpCode": "",
				"protocolTypeCode": "",
				"workAddrCode": "",
				"belongJobCode": ""
			}
		],
		"staffTrain": [
			{
				"beginDate": "2021-11-03 00:00:00",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"endDate": "2021-11-13 00:00:00",
				"id": "2524738586775809",
				"recordNum": 0,
				"staffId": "2509224682574080",
				"content": "英语",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
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
		"staffResume": [
			{
				"workCorp": "天海总公司",
				"beginDate": "2023-11-01 00:00:00",
				"workDept": "部门",
				"staffJobId": "2522091852140800",
				"id": "a7e34c2a12c74e92aa062757560ba634",
				"pubts": "2021-11-19 12:56:55",
				"recordNum": 1,
				"staffId": "2509224682574080",
				"lastFlag": false,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"endDate": "2022-11-19 12:56:55",
				"memo": "备注",
				"workDuty": "劳动",
				"workPost": "华信",
				"workJob": "123",
				"certifier": "哈哈",
				"resumeType": 0
			}
		],
		"staffEdu": [
			{
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"education": "2476728898130176",
				"endDate": "2019-11-22 00:00:00",
				"studyModeName": "非全日制",
				"degree": "2476730871353600",
				"degreeName": "学士",
				"recordNum": 0,
				"beginDate": "2019-11-07 00:00:00",
				"educationName": "高中",
				"newAttachment": "3e55f0e1-99bf-4cf5-93d9-47641d7c8709",
				"id": "2524738586759424",
				"studyMode": "05c03019-156f-47b5-8d46-20f57944a594",
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"major": "2524738586759424",
				"memo": "备注",
				"eduSystem": "1",
				"certifCode": "2524738586759424",
				"educationCtifCode": "2524738586759424",
				"isPrefs": false,
				"school": "",
				"studyModeCode": "",
				"educationCode": "",
				"degreeCode": ""
			}
		],
		"staffProqualify": [
			{
				"beginDate": "2020-11-18 00:00:00",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"titleName": "主治医师",
				"getDate": "2021-11-01 00:00:00",
				"id": "2524738586775818",
				"title": "a7baf563-d9a1-4ac5-9331-fb640bc04aae",
				"recordNum": 0,
				"staffId": "2509224682574080",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"memo": "备注",
				"certNo": "123",
				"ratingOrg": "123551516",
				"isPrefs": true,
				"endDate": "2021-11-01 00:00:00",
				"titleCode": ""
			}
		],
		"staffCtrt": [
			{
				"continueTime": 1,
				"endDate": "2021-02-20 00:00:00",
				"termType": 1,
				"signDate": "2020-11-11 00:00:00",
				"recordNum": 0,
				"orgrelId": "289ab53c5e2246c9880196a290373816",
				"probEndDate": "2020-12-20 00:00:00",
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
				"beginDate": "2020-11-20 00:00:00",
				"probSalary": 200,
				"proMonth": 1,
				"contractNum": "CTRT000459",
				"workAddrName": "1235123",
				"staffId": "2509224682574080",
				"neconomy": "100",
				"startSalary": "50000",
				"unchReason": "123",
				"memo": "备注",
				"contractCode": "120",
				"presenter": "",
				"breachMoney": "5000",
				"proBeginDate": "2020-11-20 00:00:00",
				"belongJob": "",
				"majorCorpCode": "",
				"workAddrCode": "",
				"unchReasonCode": "",
				"belongJobCode": ""
			}
		],
		"staffOrgRel": [
			{
				"isRegular": true,
				"isReturn": false,
				"regDate": "2021-11-03 00:00:00",
				"endFlag": false,
				"recordNum": 0,
				"beginDate": "2020-11-01 00:00:00",
				"id": "289ab53c5e2246c9880196a290373816",
				"pubts": "2021-11-17 16:00:52",
				"staffId": "2509224682574080",
				"seniorityDate": "2020-11-01 00:00:00",
				"lastFlag": true,
				"tenant": "0000KURZD1WR4P0VIC0000",
				"indocFlag": true,
				"endDate": "2021-11-17 16:00:52",
				"rmChannel": "2155547485345034",
				"entrySrc": "2155547436242177",
				"seniorityAdj": "12",
				"rmChannelName": "网络招聘",
				"code": "",
				"staffCode": "",
				"employer": "",
				"delayRegdate": "",
				"trialResult": "1",
				"entrySrcCode": "",
				"rmChannelCode": "",
				"employerCode": "",
				"entrySource": "",
				"entrySourceCode": "",
				"entrySourceName": ""
			}
		],
		"psnclId": "2467754435799",
		"staffPart": [
			{
				"isMainJob": true,
				"deptName": "",
				"endDate": "",
				"orgPath": "",
				"deptId": "",
				"partTypeName": "",
				"endFlag": true,
				"recordNum": "",
				"orgId": "",
				"orgRelId": "",
				"beginDate": "",
				"deptPath": "",
				"id": "",
				"pubts": "",
				"staffId": "",
				"partType": "",
				"lastFlag": true,
				"tenant": "",
				"postId": "",
				"jobId": "",
				"jobTypeId": "",
				"memo": "",
				"jobGradeId": "",
				"addrId": "",
				"director": "",
				"staffFte": "",
				"jobTypeName": "",
				"jobMaxRankId": "",
				"jobMinRankId": "",
				"directorName": "",
				"postName": "",
				"jobName": "",
				"jobGradeName": "",
				"addrName": "",
				"trnsType": "",
				"trnsEvent": 0,
				"effectiveNumber": "",
				"staffjobCode": "",
				"orgName": "",
				"psnclName": "",
				"psnclId": "",
				"jobRankId": "",
				"empformName": "",
				"empform": "",
				"belongJob": "",
				"bmLocationName": "",
				"bmLocation": "",
				"assgId": "",
				"trnsTypeName": "",
				"jobRankName": "",
				"showOrder": "",
				"staffjobId": "",
				"belongJobCode": "",
				"empformCode": "",
				"localOrgVidCode": "",
				"trnsTypeCode": "",
				"trnsReasonCode": "",
				"wageGroupCode": "",
				"postStatusCode": "",
				"bmLocationCode": "",
				"orgVidCode": "",
				"psnclIdCode": "",
				"postVidCode": "",
				"newPostVidCode": "",
				"jobGradeVidCode": "",
				"jobVidCode": "",
				"directorCode": "",
				"addrIdCode": "",
				"partTypeCode": "",
				"deptVidCode": "",
				"jobRankVidCode": "",
				"jobTypeVidCode": "",
				"planEndDate": "2023-10-10"
			}
		],
		"staffProbation": [
			{
				"result": 1,
				"beginDate": "2020-11-01 00:00:00",
				"creator": "65e24ddd-7af0-4fd0-a7de-c2e437697ae5",
				"positiveDate": "2020-11-12 00:00:00",
				"endDate": "2020-11-07 00:00:00",
				"endFlag": false,
				"id": "2524738586775823",
				"type": 1,
				"lastFlag": true,
				"staffId": "2509224682574080",
				"tenant": "0000KURZD1WR4P0VIC0000",
				"memo": "备注",
				"recordnum": "1",
				"promonth": 1
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
				"effectiveTime": "2026-06-07",
				"countryCode": ""
			}
		],
		"staffAddress": [
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
					"addressfifteen": ""
				},
				"addressTypeName": "",
				"countryCode": ""
			}
		],
		"staffGlobalInfoCHN": [
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
				"joinPolityDate": "",
				"nationalityName": "",
				"originName": "",
				"politicalName": "",
				"permanresideName": "",
				"characterrprName": "",
				"maritalName": "",
				"countryCode": "",
				"marriageDate": "2026-06-07",
				"formalPartyDate": "2026-06-07",
				"citizenship": "",
				"citizenshipName": ""
			}
		],
		"staffGlobalInfoGBR": [
			{
				"vid": "",
				"id": "",
				"country": "",
				"sex": 0,
				"marital": "",
				"effectiveTime": "2026-06-07",
				"religion": "",
				"ethnicity": "",
				"noc": "",
				"countryCode": "",
				"maritalName": "",
				"religionName": "",
				"ethnicityName": "",
				"citizenship": "",
				"citizenshipName": ""
			}
		],
		"staffGlobalInfoIND": [
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
		"staffGlobalInfoMAS": [
			{
				"vid": "",
				"id": "",
				"country": "",
				"sex": 0,
				"marital": "",
				"effectiveTime": "2026-06-07",
				"religion": "",
				"aboriginal": "",
				"countryCode": "",
				"maritalName": "",
				"religionName": "",
				"citizenship": "",
				"citizenshipName": ""
			}
		],
		"staffGlobalInfoSIN": [
			{
				"vid": "",
				"id": "",
				"country": "",
				"sex": 0,
				"marital": "",
				"effectiveTime": "2026-06-07",
				"religion": "",
				"ethnicity": "",
				"noc": "",
				"countryCode": "",
				"maritalName": "",
				"religionName": "",
				"ethnicityName": "",
				"citizenship": "",
				"citizenshipName": ""
			}
		],
		"staffGlobalInfoUSA": [
			{
				"vid": "",
				"id": "",
				"country": "",
				"sex": 0,
				"marital": "",
				"effectiveTime": "2026-06-07",
				"exsoldier": true,
				"ethnicity": "",
				"countryCode": "",
				"maritalName": "",
				"ethnicityName": "",
				"citizenship": "",
				"citizenshipName": ""
			}
		],
		"staffPunishment": [
			{
				"id": "",
				"staffId": "",
				"approvalCancellationDocumentNo": "",
				"approvalOfDissolutionUnit": "",
				"approvalOfDissolutionUnitCode": "",
				"approvalOfDissolutionUnitLevel": "",
				"approvalReleaseTime": "2026-06-07 12:58:15",
				"dismissalOfPunishmentDocumentNo": "",
				"dismissalofpunishmentReason": "",
				"isTerminate": true,
				"punishedUnit": "",
				"punishedUnitCode": "",
				"punishedUnitLevel": "",
				"punishedUnitLevelName": "",
				"unishmentCancellationEffectiveTime": "2026-06-07 12:58:15",
				"punishmentMeasures": "",
				"punishmentName": "",
				"punishmentNameSupplement": "",
				"punishmentNo": "",
				"punishmentReason": "",
				"punishmentTime": "2026-06-07 12:58:15",
				"punishmentType": 0,
				"remarks": "",
				"staffPunishmentTZDefines": {}
			}
		],
		"staffCadre": [
			{
				"id": "",
				"appointmentApprovalUnit": "",
				"appointmentDeadline": "",
				"department": "",
				"departmentName": "",
				"departmentPath": "",
				"jobTitle": "",
				"jobTitleName": "",
				"organizationalPath": "",
				"staff_id": "",
				"workingTime": "2026-06-07 12:58:15",
				"workingUnit": "",
				"workingUnitName": "",
				"FormOfAppointment": "",
				"FormOfAppointmentName": "",
				"jobAttributes": "",
				"jobAttributesName": "",
				"jobCategory": "",
				"jobGrade": "",
				"jobGradeName": "",
				"selectionMethod": "",
				"selectionMethodName": "",
				"removalTime": "2026-06-07 12:58:15"
			}
		],
		"staffHealthSituation": [
			{
				"id": "",
				"staff_id": "",
				"deformity": true,
				"deformityCertDate": "2026-06-07 12:58:15",
				"deformityCertNo": "",
				"deformityLevel": "",
				"deformityLevelName": "",
				"healthCondition": "",
				"organization": ""
			}
		],
		"staffSocietyEmployment": [
			{
				"id": "",
				"staff_id": "",
				"beginDate": "2026-06-07 12:58:15",
				"certifier": "",
				"certifierMobile": "",
				"duties": "",
				"endDate": "2026-06-07 12:58:15",
				"memo": "",
				"organization": "",
				"staffDirectiorSupervisor": [
					{
						"id": "",
						"staff_id": "",
						"beginDate": "2026-06-07 12:58:15",
						"duties": "",
						"endDate": "2026-06-07 12:58:15",
						"independentDirector": true,
						"memo": "",
						"organization": "",
						"termOfOffice": 0,
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
						"staffId": "",
						"commissionBeginDate": "2026-06-07 12:58:15",
						"commissionEndDate": "2026-06-07 12:58:15",
						"leadershipDuties": "",
						"leadershipName": "",
						"memo": ""
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
						"electronicSignature": "",
						"memo": ""
					}
				]
			}
		],
		"staffGlobalInfoHK": [
			{
				"id": "",
				"vid": "",
				"citizenship": "",
				"sex": "",
				"marital": "",
				"maritalName": "",
				"foreignNationality": true,
				"arriveHKDate": "2026-06-07",
				"marriageDate": "2026-06-07",
				"citizenshipName": "",
				"retirementPlan": 0,
				"contributionSchemeName": "",
				"industryPlan": true,
				"continuousContributions": true
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
暂时没有数据哦~

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

