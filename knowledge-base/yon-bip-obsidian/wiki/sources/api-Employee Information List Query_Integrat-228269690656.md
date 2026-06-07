---
title: "员工信息列表查询_集成_API"
apiId: "2282696906563911683"
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

# 员工信息列表查询_集成_API

>  请求方式	POST | Employee Information (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/staff/listdetailmdd
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
loadDataEntityKeys	string	query	否	实体keys，可多传，逗号分隔    示例: staffJob,staffEdu
Body参数
名称	类型	数组	必填	描述
pageIndex	int	否	是	页号 示例：1 默认值：1
pageSize	int	否	是	每页行数 示例：10 默认值：10
code	string	否	否	编码 示例：00001
name	string	否	否	名称 示例：张三
mobile	string	否	否	手机号 示例：+86-18345768974
email	string	否	否	邮箱 示例：24356477@qq.com
orgId	string	否	否	任职组织ID或组织编码 示例：45654323456
deptId	string	否	否	部门ID或部门编码 示例：34567654334567
enable	number
小数位数:0,最大长度:2	否	否	员工状态（0:未启用，1启用，2停用） 示例：1
simple	object	否	否	扩展查询
pubts	string	否	否	查询大于等于该时间戳的数据 示例：2022-08-26 11:31:40
needDetailData	boolean	否	否	是否需要详情数据 默认值：false
needMergeJob	boolean	否	否	是否需要合并主职、兼职数据 默认值：false
containsPtJob	boolean	否	否	组织是否过滤兼职组织（当兼职组织满足过滤条件时也返回数据） 默认值：false

## 3. 请求示例

Url: /yonbip/hrcloud/staff/listdetailmdd?access_token=访问令牌&loadDataEntityKeys=staffJob%2CstaffEdu
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "00001",
	"name": "张三",
	"mobile": "+86-18345768974",
	"email": "24356477@qq.com",
	"orgId": "45654323456",
	"deptId": "34567654334567",
	"enable": 1,
	"simple": {
		"pubts": "2022-08-26 11:31:40"
	},
	"needDetailData": true,
	"needMergeJob": true,
	"containsPtJob": true
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
code	string	否	编码 示例：200表示成功
message	string	否	说明 示例：操作成功
data	object	否	返回数据
recordCount	number
小数位数:0,最大长度:10	否	总数 示例：1000
pageIndex	number
小数位数:0,最大长度:10	否	当前页数 示例：默认值：1
pageSize	number
小数位数:0,最大长度:10	否	每页行数 示例：默认值 10
haveNextPage	boolean	否	是否有下一页 示例：true
pageCount	number
小数位数:0,最大长度:10	否	总页数
recordList	object	是	返回数据集合

## 5. 正确返回示例

{
	"code": "200表示成功",
	"message": "操作成功",
	"data": {
		"recordCount": 1000,
		"pageIndex": NaN,
		"pageSize": NaN,
		"haveNextPage": true,
		"pageCount": 0,
		"recordList": [
			{
				"attachlist": "f0b7e210-4c20-11ec-a04b-adf7820e8ff1",
				"birthDate": "1988-11-09 00:00:00",
				"bizManTag": "1",
				"formerName": "",
				"bloodType": "49690e3f-c37f-4f25-b32f-7b5490f60046",
				"englishName": "",
				"bloodTypeCode": "",
				"joinedDate": "2022-01-01",
				"documentValidity": "2022-01-01",
				"bloodTypeName": "O型",
				"certNo": "110101198611019935",
				"departDate": "2022-09-09",
				"height": "",
				"weight": "",
				"birthPlace": "",
				"postcode": "",
				"certType": "0008-7ce7-45c2-b4ba-ac907d1b76c7",
				"religion": "",
				"hobby": "",
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
						"channel": "途径",
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
						"rankCode": "",
						"assPeriod": "23782737712",
						"rankName": "",
						"memo": ""
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
						"accountName": ""
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
						"certTypeCode": ""
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
						"certType": "",
						"certNo": "3234342",
						"isRelocate": "1",
						"birthDate": "2026-06-07",
						"certTypeName": "",
						"certTypeCode": "",
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
						"jobTypeVidCode": "",
						"entrySource": "",
						"entrySourceCode": "",
						"entrySourceName": "",
						"localOrgName": "",
						"newPostName": "",
						"postName": "",
						"empform": "",
						"localOrgId": "",
						"newPostId": "",
						"wageGroup": "",
						"wageGroupName": "",
						"dispositonName": ""
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
						"memo": "备注",
						"rewardItem_supplement": "",
						"rewardCategory": "",
						"awardLevel": "",
						"awardYear": "",
						"awardGrade": "",
						"approvalNo": "",
						"certificateNo": "",
						"rewardNature": "",
						"incentives": "",
						"approverCode": "",
						"approverLevel": "",
						"approvalTime": "2022-02-21",
						"awardCancellation": "true",
						"awardCancellationTime": "2022-02-21",
						"cancellationReason": "",
						"newAttachment": "c6bce09e-f3e3-4142-903d-afc030a5d23a",
						"awardLevelName": "",
						"awardLevelCode": ""
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
						"belongJobCode": "",
						"performStatus": "",
						"termUnit": "",
						"workAddrName": ""
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
						"trainingLocationName": "",
						"trainProjectName": "",
						"trainProjectCode": ""
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
						"resumeType": 0,
						"newPost": "",
						"rankName": ""
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
						"degreeCode": "",
						"isHighestDegree": "true",
						"isHighestFullDegree": "true"
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
						"belongJobCode": "",
						"unchReasonName": ""
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
						"entrySourceName": "",
						"orgName": "",
						"secretaryAge": 0,
						"groupDate": "2026-06-07",
						"groupWorkAgeAdj": 0,
						"groupWorkAge": 0,
						"entrySrcName": ""
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
						"planEndDate": "2023-10-10",
						"trnsReason": "484841262",
						"trnsReasonName": "",
						"localOrgName": "",
						"newPostName": "",
						"postStatusName": "",
						"wageGroupName": "",
						"localOrgId": "",
						"newPostId": "",
						"postStatus": "",
						"wageGroup": "",
						"newAttachment": "",
						"otherJobType": "1"
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
						"promonth": 1,
						"termUnit": "",
						"actualEndDate": "2026-06-07"
					}
				],
				"staffLeadershipTrade": [
					{
						"commissionBeginDate": "2026-06-07",
						"commissionEndDate": "",
						"leadershipDuties": "",
						"leadershipName": "",
						"id": "",
						"staffId": "",
						"memo": ""
					}
				],
				"staffTrialEvaluation": [
					{
						"beginDate": "2026-06-07",
						"endDate": "2026-06-07",
						"devaluationLevel": "",
						"evaluationScore": "",
						"overallEvaluation": "",
						"electronicSignature": "",
						"memo": "",
						"id": "",
						"staffId": ""
					}
				],
				"staffDirectiorSupervisor": [
					{
						"id": "",
						"beginDate": "2026-06-07",
						"endDate": "2026-06-07",
						"termOfOffice": 0,
						"staffId": "",
						"organization": "",
						"independentDirector": true,
						"duties": "",
						"memo": "",
						"positionType": "",
						"configurationMethod": "",
						"employeeDirector": true,
						"interPartDirector": true,
						"employeeSupervisor": true,
						"externalSupervisor": true
					}
				],
				"staffSocietyEmployment": [
					{
						"id": "",
						"beginDate": "2026-06-07",
						"endDate": "2026-06-07",
						"staffId": "",
						"organization": "",
						"duties": "",
						"certifier": "",
						"certifierMobile": "",
						"memo": ""
					}
				],
				"staffHealthSituation": [
					{
						"id": "",
						"pastHistory": "",
						"deformity": true,
						"staffId": "",
						"deformityCertNo": "",
						"deformityCertDate": "2026-06-07",
						"memo": "",
						"healthCondition": "",
						"deformityLevel": "",
						"deformityLevelName": ""
					}
				],
				"staffPunishment": [
					{
						"id": "",
						"staffId": "",
						"punishmentName": "",
						"punishmentNameSupplement": "",
						"punishmentType": "",
						"punishmentTime": "2026-06-07",
						"punishedUnit": "",
						"punishedUnitCode": "",
						"punishedUnitLevel": "",
						"punishedUnitLevelName": "",
						"punishmentNo": "",
						"punishmentReason": "",
						"punishmentMeasures": "",
						"appointmentExemptionForm": true,
						"approvalReleaseTime": "2026-06-07",
						"approvalOfDissolutionUnit": "",
						"approvalOfDissolutionUnitCode": "",
						"approvalOfDissolutionUnitLevel": "",
						"approvalOfDissolutionUnitLevelName": "",
						"approvalCancellationDocumentNo": "",
						"dismissalOfPunishmentDocumentNo": "",
						"punishmentCancellationEffectiveTime": "2026-06-07",
						"remarks": "",
						"dismissalofpunishmentReason": "",
						"isTerminate": true
					}
				],
				"staffCadre": [
					{
						"id": "",
						"staffId": "",
						"workingUnit": "",
						"workingUnitName": "",
						"organizationalPath": "",
						"department": "",
						"departmentName": "",
						"departmentPath": "",
						"workingTime": "2026-06-07",
						"trialPeriodDeadline": "2026-06-07",
						"jobTitle": "",
						"jobTitleName": "",
						"jobGrade": "",
						"appointmentNumber": "",
						"appointmentApprovalUnit": "",
						"jobCategory": "",
						"rankAdjustmentMethod": "",
						"leadershipTeam": true,
						"leadership": true,
						"professionalManager": true,
						"parttime": true,
						"exceptionalPromotion": true,
						"appointmentExemptionForm": true,
						"mainSequenceNumber": "",
						"appointmentReason": "",
						"removalTime": "2026-06-07",
						"dismissalNumber": "",
						"dismissalApprovalUnit": "",
						"dismissalReason": "",
						"remarks": "",
						"appointmentDeadline": "2026-06-07",
						"officeJobClassification": "",
						"officeJobClassificationName": "",
						"jobAttributes": "",
						"jobAttributesName": "",
						"FormOfAppointment": "",
						"FormOfAppointmentName": "",
						"selectionMethod": "",
						"selectionMethodName": ""
					}
				],
				"photo": "",
				"age": 0,
				"religionName": "",
				"workAge": "",
				"birthPlaceName": "",
				"birthPlaceCode": "",
				"religionCode": "",
				"majorcorpname": "",
				"majorcorpCode": "",
				"creator": "",
				"createTime": "2026-06-07 12:58:42",
				"modifier": "",
				"modifyTime": "2026-06-07 12:58:42"
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
	1	2026-03-13	
新增
请求参数 containsPtJob
更新
请求参数 simple
更新
请求参数 needDetailData
更新
请求参数 needMergeJob
	2	2025-12-10	
更新
请求说明
新增
请求参数 loadDataEntityKeys

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

