---
title: "保存工作汇报草稿"
apiId: "2542275573041856521"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Report"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 保存工作汇报草稿

>  请求方式	POST | Work Report (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/diary/diaryCommitDraft
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
at	object	是	否	被@用户列表
avatar	string	否	否	头像地址 示例：头像地址
replayUserName	string	否	否	被回复人名称 示例：被回复人名称
replyMemberId	string	否	否	被回复人用户ID 示例：被回复人用户ID
commonTenantId	string	否	否	公共租户ID 示例：公共租户ID
commonUserId	string	否	否	被@用户公共用户ID 示例：被@用户公共用户ID
userName	string	否	否	被@用户名称 示例：被@用户名称
createTime	number
小数位数:0,最大长度:10	否	否	创建时间 示例：1710000000000
teamName	string	否	否	团队或部门名称 示例：团队或部门名称
avatar	string	否	否	头像地址 示例：头像地址
commentNum	number
小数位数:0,最大长度:10	否	否	评论数量 示例：0
content	string	否	否	汇报内容 示例：[{"componentType":"TEXT","value":"汇报内容"}]
contentEncType	string	否	否	内容加密类型
createTime	number
小数位数:0,最大长度:10	否	否	创建时间 示例：1710000000000
dataStatus	number
小数位数:0,最大长度:10	否	否	数据状态 示例：0
dataType	number
小数位数:0,最大长度:10	否	否	数据类型 示例：1
commonDeptId	string	否	否	公共部门ID 示例：公共部门ID
deptName	string	否	否	部门名称 示例：部门名称
orgName	string	否	否	组织名称 示例：组织名称
diaryTime	number
小数位数:0,最大长度:10	否	否	汇报时间 示例：1710000000000
visibleRange	number
小数位数:0,最大长度:10	否	否	可见范围 示例：1
diaryTimeStatus	number
小数位数:0,最大长度:10	否	否	汇报时间状态 示例：1
diaryTimeDefault	number
小数位数:0,最大长度:10	否	否	默认汇报时间设置 示例：1
diaryTimeRequired	number
小数位数:0,最大长度:10	否	否	汇报时间是否必填 示例：1
diaryTimeType	number
小数位数:0,最大长度:10	否	否	汇报时间类型 示例：1
visibleRangeReadonly	number
小数位数:0,最大长度:10	否	否	可见范围是否只读 示例：1
favorite	object	否	否	收藏信息
fileStr	string	否	否	附件信息字符串 示例：[{"fileId":"文件ID","fileName":"文件名称"}]
gather	number
小数位数:0,最大长度:10	否	否	汇总标识 示例：0
id	string	否	否	汇报ID 示例：汇报ID
oldDiaryId	string	否	否	旧汇报ID 示例：旧汇报ID
draftId	string	否	否	草稿ID 示例：草稿ID
isRead	number
小数位数:0,最大长度:10	否	否	是否已读 示例：0
like	object	否	否	点赞信息
range	object	是	否	可见范围列表
dataType	number
小数位数:0,最大长度:10	否	否	数据类型 示例：1
commonUserId	string	否	否	公共用户ID 示例：公共用户ID
commonTenantId	string	否	否	公共租户ID 示例：公共租户ID
commonTenantName	string	否	否	租户名称 示例：租户名称
teamId	string	否	否	部门或群组ID 示例：部门或群组ID
teamName	string	否	否	部门或群组名称 示例：部门或群组名称
userName	string	否	否	用户名称 示例：用户名称
avatar	string	否	否	头像地址 示例：头像地址
commonObjectId	string	否	否	可见对象ID 示例：可见对象ID
objectName	string	否	否	可见对象名称 示例：可见对象名称
createTime	string	否	否	创建时间 示例：2026-05-12T10:00:00.000+08:00
visibleType	number
小数位数:0,最大长度:10	否	否	可见类型 示例：0
dataFlag	number
小数位数:0,最大长度:10	否	否	数据标识 示例：0
readCount	number
小数位数:0,最大长度:10	否	否	已读数量 示例：0
readLog	object	是	否	阅读记录列表
requiredLocation	number
小数位数:0,最大长度:10	否	否	是否要求定位 示例：0
source	number
小数位数:0,最大长度:10	否	否	来源 示例：1
commonTenantId	string	否	否	公共租户ID 示例：公共租户ID
templateId	string	否	否	模板ID 示例：模板ID
fixedDiaryRange	boolean	否	否	是否固定汇报范围 示例：false
makeUpType	string	否	否	补交类型 示例：UNLIMITED
makeUpDays	number
小数位数:0,最大长度:10	否	否	可补交天数 示例：0
makeUpHours	number
小数位数:0,最大长度:10	否	否	可补交小时数 示例：0
templateName	string	否	否	模板名称 示例：模板名称
userName	string	否	否	提交人名称 示例：提交人名称
status	number
小数位数:0,最大长度:10	否	否	状态 示例：1
version	string	否	否	模板版本号 示例：模板版本号
longitude	string	否	否	经度 示例：经度
latitude	string	否	否	纬度 示例：纬度
location	string	否	否	定位地址 示例：定位地址
hasSubordinate	number
小数位数:0,最大长度:10	否	否	是否有下属 示例：0
diaryComments	object	是	否	汇报评论列表
diaryComment	string	否	否	评论内容 示例：评论内容
recordStatus	string	否	否	记录状态 示例：NORMAL
diaryStartDate	number
小数位数:0,最大长度:10	否	否	汇报开始日期 示例：1710000000000
diaryEndDate	number
小数位数:0,最大长度:10	否	否	汇报结束日期 示例：1710000000000
reportObjectTypes	string	是	否	汇报对象类型列表 示例：["DEPT","DEPARTMENT_MANAGER","FIXED_RANGE"]
onlyCurrentPosition	boolean	否	否	是否仅当前岗位 示例：false
visibleRangeStr	string	否	否	可见范围字符串 示例：[{"dataType":1,"teamId":"部门ID","teamName":"部门名称","visibleType":0}]
atStr	string	否	否	被@用户字符串 示例：[{"commonUserId":"公共用户ID","userName":"用户名称","commonTenantId":"公共租户ID"}]
groupId	string	否	否	群组ID 示例：群组ID
targetMucId	string	否	否	目标群ID 示例：目标群ID
indexInfoStr	string	否	否	指标信息字符串 示例：[{"indexId":"指标ID","indexName":"指标名称","value":"指标值"}]
commonUserId	string	否	否	提交人公共用户ID 示例：提交人公共用户ID
enableCommonDeptId	string	否	否	启用部门负责人时的部门ID 示例：启用部门负责人时的部门ID
chargeLeaderId	string	否	否	分管领导用户ID 示例：分管领导用户ID
diaryFiles	object	是	否	汇报附件列表
id	string	否	否	附件记录ID 示例：附件记录ID
fileId	string	否	否	文件ID 示例：文件ID
fileKey	string	否	否	文件Key 示例：文件Key
bucketUrl	string	否	否	文件桶地址 示例：文件桶地址
previewUrl	string	否	否	预览地址 示例：预览地址
fileExtension	string	否	否	文件扩展名 示例：文件扩展名
fileSize	number
小数位数:0,最大长度:10	否	否	文件大小 示例：1024
fileSizeText	string	否	否	文件大小文本 示例：1KB
fileName	string	否	否	文件名称 示例：文件名称
extensionType	number
小数位数:0,最大长度:10	否	否	文件扩展类型 示例：1
commonUserId	string	否	否	上传人公共用户ID 示例：上传人公共用户ID
commonTenantId	string	否	否	公共租户ID 示例：公共租户ID
creatorName	string	否	否	上传人名称 示例：上传人名称
businessId	string	否	否	业务ID 示例：业务ID
diaryOperateLogs	object	是	否	汇报操作日志列表
readLogs	object	是	否	阅读日志列表
favorites	object	是	否	收藏列表
oldDataStatus	number
小数位数:0,最大长度:10	否	否	原数据状态 示例：0
draftType	string	否	否	草稿类型 示例：草稿类型
diaryTemplate	object	否	否	汇报模板信息
templateId	string	否	否	模板ID 示例：模板ID
templateName	string	否	否	模板名称 示例：模板名称
version	string	否	否	模板版本号 示例：模板版本号
diaryTimeStatus	number
小数位数:0,最大长度:10	否	否	汇报时间状态 示例：1
diaryTimeDefault	number
小数位数:0,最大长度:10	否	否	默认汇报时间设置 示例：1
diaryTimeRequired	number
小数位数:0,最大长度:10	否	否	汇报时间是否必填 示例：1
diaryTimeType	number
小数位数:0,最大长度:10	否	否	汇报时间类型 示例：1
thirdSourceType	string	是	否	第三方来源类型列表 示例：["CRM"]
indexInfos	object	是	否	指标信息列表
indexId	string	否	否	指标ID 示例：指标ID
indexName	string	否	否	指标名称 示例：指标名称
value	string	否	否	指标值 示例：指标值
enableEdit	boolean	否	否	是否允许编辑 示例：true
enableDelete	boolean	否	否	是否允许删除 示例：true
concernStatus	boolean	否	否	关注状态 示例：false
scheduleTs	number
小数位数:0,最大长度:10	否	否	定时提交时间戳 示例：1710000000000
submitType	string	否	否	提交类型 示例：SCHEDULE
creator	string	否	否	创建人ID 示例：创建人ID
submitState	number
小数位数:0,最大长度:10	否	否	提交状态 示例：0
scheduleSumbitFailMsg	string	否	否	定时提交失败原因 示例：定时提交失败原因

## 3. 请求示例

Url: /yonbip/SCCC/diary/diaryCommitDraft?access_token=访问令牌
Body: {
	"at": [
		{
			"avatar": "头像地址",
			"replayUserName": "被回复人名称",
			"replyMemberId": "被回复人用户ID",
			"commonTenantId": "公共租户ID",
			"commonUserId": "被@用户公共用户ID",
			"userName": "被@用户名称",
			"createTime": 1710000000000,
			"teamName": "团队或部门名称"
		}
	],
	"avatar": "头像地址",
	"commentNum": 0,
	"content": "[{\"componentType\":\"TEXT\",\"value\":\"汇报内容\"}]",
	"contentEncType": "",
	"createTime": 1710000000000,
	"dataStatus": 0,
	"dataType": 1,
	"commonDeptId": "公共部门ID",
	"deptName": "部门名称",
	"orgName": "组织名称",
	"diaryTime": 1710000000000,
	"visibleRange": 1,
	"diaryTimeStatus": 1,
	"diaryTimeDefault": 1,
	"diaryTimeRequired": 1,
	"diaryTimeType": 1,
	"visibleRangeReadonly": 1,
	"favorite": {},
	"fileStr": "[{\"fileId\":\"文件ID\",\"fileName\":\"文件名称\"}]",
	"gather": 0,
	"id": "汇报ID",
	"oldDiaryId": "旧汇报ID",
	"draftId": "草稿ID",
	"isRead": 0,
	"like": {},
	"range": [
		{
			"dataType": 1,
			"commonUserId": "公共用户ID",
			"commonTenantId": "公共租户ID",
			"commonTenantName": "租户名称",
			"teamId": "部门或群组ID",
			"teamName": "部门或群组名称",
			"userName": "用户名称",
			"avatar": "头像地址",
			"commonObjectId": "可见对象ID",
			"objectName": "可见对象名称",
			"createTime": "2026-05-12T10:00:00.000+08:00",
			"visibleType": 0,
			"dataFlag": 0
		}
	],
	"readCount": 0,
	"readLog": [
		{}
	],
	"requiredLocation": 0,
	"source": 1,
	"commonTenantId": "公共租户ID",
	"templateId": "模板ID",
	"fixedDiaryRange": false,
	"makeUpType": "UNLIMITED",
	"makeUpDays": 0,
	"makeUpHours": 0,
	"templateName": "模板名称",
	"userName": "提交人名称",
	"status": 1,
	"version": "模板版本号",
	"longitude": "经度",
	"latitude": "纬度",
	"location": "定位地址",
	"hasSubordinate": 0,
	"diaryComments": [
		{}
	],
	"diaryComment": "评论内容",
	"recordStatus": "NORMAL",
	"diaryStartDate": 1710000000000,
	"diaryEndDate": 1710000000000,
	"reportObjectTypes": [
		"DEPT",
		"DEPARTMENT_MANAGER",
		"FIXED_RANGE"
	],
	"onlyCurrentPosition": false,
	"visibleRangeStr": "[{\"dataType\":1,\"teamId\":\"部门ID\",\"teamName\":\"部门名称\",\"visibleType\":0}]",
	"atStr": "[{\"commonUserId\":\"公共用户ID\",\"userName\":\"用户名称\",\"commonTenantId\":\"公共租户ID\"}]",
	"groupId": "群组ID",
	"targetMucId": "目标群ID",
	"indexInfoStr": "[{\"indexId\":\"指标ID\",\"indexName\":\"指标名称\",\"value\":\"指标值\"}]",
	"commonUserId": "提交人公共用户ID",
	"enableCommonDeptId": "启用部门负责人时的部门ID",
	"chargeLeaderId": "分管领导用户ID",
	"diaryFiles": [
		{
			"id": "附件记录ID",
			"fileId": "文件ID",
			"fileKey": "文件Key",
			"bucketUrl": "文件桶地址",
			"previewUrl": "预览地址",
			"fileExtension": "文件扩展名",
			"fileSize": 1024,
			"fileSizeText": "1KB",
			"fileName": "文件名称",
			"extensionType": 1,
			"commonUserId": "上传人公共用户ID",
			"commonTenantId": "公共租户ID",
			"creatorName": "上传人名称",
			"businessId": "业务ID"
		}
	],
	"diaryOperateLogs": [
		{}
	],
	"readLogs": [
		{}
	],
	"favorites": [
		{}
	],
	"oldDataStatus": 0,
	"draftType": "草稿类型",
	"diaryTemplate": {
		"templateId": "模板ID",
		"templateName": "模板名称",
		"version": "模板版本号",
		"diaryTimeStatus": 1,
		"diaryTimeDefault": 1,
		"diaryTimeRequired": 1,
		"diaryTimeType": 1
	},
	"thirdSourceType": [
		"CRM"
	],
	"indexInfos": [
		{
			"indexId": "指标ID",
			"indexName": "指标名称",
			"value": "指标值"
		}
	],
	"enableEdit": true,
	"enableDelete": true,
	"concernStatus": false,
	"scheduleTs": 1710000000000,
	"submitType": "SCHEDULE",
	"creator": "创建人ID",
	"submitState": 0,
	"scheduleSumbitFailMsg": "定时提交失败原因"
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
code	number
小数位数:0,最大长度:10	否	响应状态码 示例：0
data	object	否	草稿详情
id	string	否	草稿ID 示例：draftId
createTime	number
小数位数:0,最大长度:13	否	创建时间 示例：1710000000000
updateTime	number
小数位数:0,最大长度:13	否	更新时间 示例：1710000000000
commonUserId	string	否	公共用户ID 示例：commonUserId
commonTenantId	string	否	公共租户ID 示例：commonTenantId
templateId	string	否	模板ID 示例：templateId
templateName	string	否	模板名称 示例：模板名称
version	string	否	版本号 示例：1710000000000
content	string	否	草稿内容 示例：草稿内容
dataStatus	number
小数位数:0,最大长度:10	否	数据状态 示例：0
dataType	number
小数位数:0,最大长度:10	否	数据类型 示例：1
visibleRange	number
小数位数:0,最大长度:10	否	可见范围 示例：1
diaryTime	number
小数位数:0,最大长度:13	否	汇报时间 示例：1710000000000
diaryStartDate	number
小数位数:0,最大长度:13	否	汇报开始时间 示例：1710000000000
diaryEndDate	number
小数位数:0,最大长度:13	否	汇报结束时间 示例：1710000000000
diaryTimeStatus	number
小数位数:0,最大长度:10	否	汇报时间状态 示例：0
diaryTimeDefault	number
小数位数:0,最大长度:10	否	默认汇报时间 示例：1
diaryTimeRequired	number
小数位数:0,最大长度:10	否	汇报时间是否必填 示例：1
diaryTimeType	number
小数位数:0,最大长度:10	否	汇报时间类型 示例：1
visibleRangeReadonly	number
小数位数:0,最大长度:10	否	可见范围是否只读 示例：0
requiredLocation	number
小数位数:0,最大长度:10	否	是否要求位置 示例：0
source	number
小数位数:0,最大长度:10	否	来源 示例：1
commonDeptId	string	否	公共部门ID 示例：commonDeptId
deptName	string	否	部门名称 示例：部门名称
orgName	string	否	组织名称 示例：组织名称
userName	string	否	用户名称 示例：用户名称
location	string	否	位置 示例：位置
longitude	string	否	经度 示例：116.397
latitude	string	否	纬度 示例：39.908
visibleRangeStr	string	否	可见范围字符串 示例：[{"dataType":1,"teamId":"deptId"}]
atStr	string	否	提及用户字符串 示例：[{"commonUserId":"commonUserId","userName":"用户名称"}]
fileStr	string	否	附件字符串 示例：[{"fileId":"fileId"}]
indexInfoStr	string	否	指标信息字符串 示例：[{"indexKey":"key","indexValue":"value"}]
range	object	是	可见范围明细
at	object	是	提及用户列表
diaryFiles	object	是	草稿附件列表
diaryTemplate	object	否	汇报模板
thirdSourceType	string	是	第三方来源类型 示例：["CRM"]
indexInfos	object	是	指标信息列表
scheduleTs	number
小数位数:0,最大长度:13	否	定时任务时间 示例：1710000000000
submitType	string	否	提交类型 示例：MANUAL
submitState	number
小数位数:0,最大长度:10	否	提交状态 示例：0
draftType	string	否	草稿类型 示例：NORMAL
scheduleSumbitFailMsg	string	否	定时提交失败原因 示例：失败原因

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"id": "draftId",
		"createTime": 1710000000000,
		"updateTime": 1710000000000,
		"commonUserId": "commonUserId",
		"commonTenantId": "commonTenantId",
		"templateId": "templateId",
		"templateName": "模板名称",
		"version": "1710000000000",
		"content": "草稿内容",
		"dataStatus": 0,
		"dataType": 1,
		"visibleRange": 1,
		"diaryTime": 1710000000000,
		"diaryStartDate": 1710000000000,
		"diaryEndDate": 1710000000000,
		"diaryTimeStatus": 0,
		"diaryTimeDefault": 1,
		"diaryTimeRequired": 1,
		"diaryTimeType": 1,
		"visibleRangeReadonly": 0,
		"requiredLocation": 0,
		"source": 1,
		"commonDeptId": "commonDeptId",
		"deptName": "部门名称",
		"orgName": "组织名称",
		"userName": "用户名称",
		"location": "位置",
		"longitude": "116.397",
		"latitude": "39.908",
		"visibleRangeStr": "[{\"dataType\":1,\"teamId\":\"deptId\"}]",
		"atStr": "[{\"commonUserId\":\"commonUserId\",\"userName\":\"用户名称\"}]",
		"fileStr": "[{\"fileId\":\"fileId\"}]",
		"indexInfoStr": "[{\"indexKey\":\"key\",\"indexValue\":\"value\"}]",
		"range": [
			{
				"dataType": 1,
				"commonUserId": "commonUserId",
				"commonTenantId": "commonTenantId",
				"commonTenantName": "租户名称",
				"teamId": "deptOrGroupId",
				"teamName": "部门或群组名称",
				"userName": "用户名称",
				"avatar": "avatarUrl",
				"commonObjectId": "objectId",
				"objectName": "对象名称",
				"createTime": "2026-05-11T10:00:00.000+00:00",
				"visibleType": 0,
				"dataFlag": 0
			}
		],
		"at": [
			{
				"avatar": "avatarUrl",
				"replayUserName": "被回复用户名称",
				"replyMemberId": "replyUserId",
				"commonTenantId": "commonTenantId",
				"commonUserId": "commonUserId",
				"userName": "用户名称",
				"createTime": 1710000000000,
				"teamName": "团队名称"
			}
		],
		"diaryFiles": [
			{
				"id": "fileRelationId",
				"createTime": 1710000000000,
				"updateTime": 1710000000000,
				"fileId": "fileId",
				"fileKey": "fileKey",
				"bucketUrl": "bucketUrl",
				"previewUrl": "previewUrl",
				"fileExtension": "docx",
				"fileSize": 1024,
				"fileSizeText": "1KB",
				"fileName": "附件.docx",
				"extensionType": 1,
				"commonUserId": "commonUserId",
				"commonTenantId": "commonTenantId",
				"creatorName": "创建人名称",
				"businessId": "draftId"
			}
		],
		"diaryTemplate": {
			"templateId": "templateId",
			"templateName": "模板名称",
			"version": "1710000000000",
			"diaryTimeStatus": 0,
			"diaryTimeDefault": 1,
			"diaryTimeRequired": 1,
			"diaryTimeType": 1
		},
		"thirdSourceType": [
			"CRM"
		],
		"indexInfos": [
			{
				"indexKey": "key",
				"indexValue": "value"
			}
		],
		"scheduleTs": 1710000000000,
		"submitType": "MANUAL",
		"submitState": 0,
		"draftType": "NORMAL",
		"scheduleSumbitFailMsg": "失败原因"
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

