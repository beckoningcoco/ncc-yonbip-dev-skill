---
title: "查询下级工作汇报"
apiId: "2542275341113622541"
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

# 查询下级工作汇报

>  请求方式	POST | Work Report (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/diaryQuery/v2/getSubordinateDiary
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
templateId	string	否	否	模板ID 示例：模板ID
beginDate	string	否	否	开始日期 示例：2026-05-01
endDate	string	否	否	结束日期 示例：2026-05-12
startTime	number
小数位数:0,最大长度:10	否	否	开始时间戳 示例：1777564800000
endTime	number
小数位数:0,最大长度:10	否	否	结束时间戳 示例：1778515199999
pageNo	number
小数位数:0,最大长度:10	否	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	否	每页条数 示例：20
range	number
小数位数:0,最大长度:10	否	否	查询范围 示例：0
commonUserIds	string	否	否	公共用户ID列表 示例：公共用户ID1,公共用户ID2
groupIds	string	是	否	群组ID列表 示例：["群组ID"]
userIds	string	是	否	用户ID列表 示例：["用户ID"]
commonDeptIds	string	是	否	公共部门ID列表 示例：["公共部门ID"]
groupId	string	否	否	群组ID 示例：群组ID
commonDeptId	string	否	否	公共部门ID 示例：公共部门ID
commonUserId	string	否	否	查询下属所属的公共用户ID 示例：查询下属所属的公共用户ID
withPublic	boolean	否	否	是否包含公共数据 示例：true
dataStatus	number
小数位数:0,最大长度:10	否	否	数据状态 示例：1
deptManager	boolean	否	否	是否部门负责人 示例：false
templateIds	string	是	否	模板ID列表 示例：["模板ID"]
version	string	否	否	模板版本号 示例：模板版本号
diaryManager	boolean	否	否	是否汇报管理员 示例：false
enableDepartmentManagerQuery	object	否	否	部门负责人查询配置
enableDepartmentManager	boolean	否	否	是否启用部门负责人查询 示例：true
commonDeptId	string	否	否	公共部门ID 示例：公共部门ID
queryDiaryTime	boolean	否	否	是否查询汇报时间 示例：true
selfReadType	string	否	否	本人阅读类型 示例：null
diaryIds	string	是	否	汇报ID列表 示例：["汇报ID"]
myConcernGroupId	string	否	否	关注分组ID 示例：关注分组ID
concernType	string	否	否	关注类型 示例：CONCERN_PERSON
diaryTimeType	number
小数位数:0,最大长度:10	否	否	汇报时间类型 示例：1
versions	string	是	否	模板版本号列表 示例：["模板版本号"]
useIndex	boolean	否	否	是否使用索引 示例：false
unReaders	string	否	否	未读人公共用户ID列表 示例：未读人公共用户ID1,未读人公共用户ID2
diaryRoleDOAdapter	object	否	否	汇报角色信息
id	string	否	否	角色ID 示例：角色ID
commonTenantId	string	否	否	公共租户ID 示例：公共租户ID
commonUserId	string	否	否	公共用户ID 示例：公共用户ID
roleType	string	否	否	角色类型 示例：角色类型
contentFileUrlFlag	boolean	否	否	是否返回内容附件地址 示例：true
submitType	string	否	否	提交类型 示例：提交类型
queryType	string	否	否	查询类型 示例：查询类型
statsType	string	否	否	统计类型 示例：1
partJobDeptIds	string	是	否	兼职部门ID列表 示例：["兼职部门ID"]
onlyBasicInfo	boolean	否	否	是否仅查询基础信息 示例：false
diaryQueryDTO	object	否	否	汇报查询条件
flag	boolean	否	否	标识 示例：false

## 3. 请求示例

Url: /yonbip/SCCC/diaryQuery/v2/getSubordinateDiary?access_token=访问令牌
Body: {
	"templateId": "模板ID",
	"beginDate": "2026-05-01",
	"endDate": "2026-05-12",
	"startTime": 1777564800000,
	"endTime": 1778515199999,
	"pageNo": 1,
	"pageSize": 20,
	"range": 0,
	"commonUserIds": "公共用户ID1,公共用户ID2",
	"groupIds": [
		"群组ID"
	],
	"userIds": [
		"用户ID"
	],
	"commonDeptIds": [
		"公共部门ID"
	],
	"groupId": "群组ID",
	"commonDeptId": "公共部门ID",
	"commonUserId": "查询下属所属的公共用户ID",
	"withPublic": true,
	"dataStatus": 1,
	"deptManager": false,
	"templateIds": [
		"模板ID"
	],
	"version": "模板版本号",
	"diaryManager": false,
	"enableDepartmentManagerQuery": {
		"enableDepartmentManager": true,
		"commonDeptId": "公共部门ID"
	},
	"queryDiaryTime": true,
	"selfReadType": "null",
	"diaryIds": [
		"汇报ID"
	],
	"myConcernGroupId": "关注分组ID",
	"concernType": "CONCERN_PERSON",
	"diaryTimeType": 1,
	"versions": [
		"模板版本号"
	],
	"useIndex": false,
	"unReaders": "未读人公共用户ID1,未读人公共用户ID2",
	"diaryRoleDOAdapter": {
		"id": "角色ID",
		"commonTenantId": "公共租户ID",
		"commonUserId": "公共用户ID",
		"roleType": "角色类型"
	},
	"contentFileUrlFlag": true,
	"submitType": "提交类型",
	"queryType": "查询类型",
	"statsType": "1",
	"partJobDeptIds": [
		"兼职部门ID"
	],
	"onlyBasicInfo": false,
	"diaryQueryDTO": {},
	"flag": false
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
data	object	是	汇报列表
at	object	是	提及用户列表
avatar	string	否	头像 示例：avatarUrl
commentNum	number
小数位数:0,最大长度:10	否	评论数量 示例：0
content	string	否	汇报内容 示例：汇报内容
contentEncType	string	否	内容编码类型 示例：base64
createTime	number
小数位数:0,最大长度:13	否	创建时间 示例：1710000000000
dataStatus	number
小数位数:0,最大长度:10	否	数据状态 示例：1
dataType	number
小数位数:0,最大长度:10	否	数据类型 示例：1
commonDeptId	string	否	公共部门ID 示例：commonDeptId
deptName	string	否	部门名称 示例：部门名称
orgName	string	否	组织名称 示例：组织名称
diaryTime	number
小数位数:0,最大长度:13	否	汇报时间 示例：1710000000000
visibleRange	number
小数位数:0,最大长度:10	否	可见范围 示例：1
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
favorite	object	否	收藏信息
fileStr	string	否	附件字符串 示例：[{"fileId":"fileId"}]
gather	number
小数位数:0,最大长度:10	否	汇总标识 示例：0
id	string	否	汇报ID 示例：diaryId
oldDiaryId	string	否	原汇报ID 示例：oldDiaryId
draftId	string	否	草稿ID 示例：draftId
isRead	number
小数位数:0,最大长度:10	否	是否已读 示例：1
like	object	否	点赞信息
range	object	是	可见范围明细
readCount	number
小数位数:0,最大长度:10	否	阅读数量 示例：0
readLog	object	是	阅读日志
requiredLocation	number
小数位数:0,最大长度:10	否	是否要求位置 示例：0
source	number
小数位数:0,最大长度:10	否	来源 示例：1
commonTenantId	string	否	公共租户ID 示例：commonTenantId
templateId	string	否	模板ID 示例：templateId
fixedDiaryRange	boolean	否	是否固定汇报范围 示例：false
makeUpType	string	否	补交类型 示例：UNLIMITED
makeUpDays	number
小数位数:0,最大长度:10	否	可补交天数 示例：0
makeUpHours	number
小数位数:0,最大长度:10	否	可补交小时数 示例：0
templateName	string	否	模板名称 示例：模板名称
userName	string	否	用户名称 示例：汇报人名称
status	number
小数位数:0,最大长度:10	否	状态 示例：1
version	string	否	版本号 示例：1710000000000
longitude	string	否	经度 示例：116.397
latitude	string	否	纬度 示例：39.908
location	string	否	位置 示例：位置
hasSubordinate	number
小数位数:0,最大长度:10	否	是否有下属 示例：0
diaryComments	object	是	汇报评论列表
diaryComment	string	否	汇报评论 示例：评论内容
recordStatus	string	否	记录状态 示例：NORMAL
diaryStartDate	number
小数位数:0,最大长度:13	否	汇报开始时间 示例：1710000000000
diaryEndDate	number
小数位数:0,最大长度:13	否	汇报结束时间 示例：1710000000000
reportObjectTypes	string	是	汇报对象类型 示例：["DEPT"]
onlyCurrentPosition	boolean	否	是否仅当前岗位 示例：false
visibleRangeStr	string	否	可见范围字符串 示例：[{"dataType":1,"teamId":"deptId"}]
atStr	string	否	提及用户字符串 示例：[{"commonUserId":"commonUserId","userName":"用户名称"}]
groupId	string	否	群组ID 示例：groupId
targetMucId	string	否	目标群聊ID 示例：targetMucId
indexInfoStr	string	否	指标信息字符串 示例：[{"indexKey":"key","indexValue":"value"}]
commonUserId	string	否	公共用户ID 示例：commonUserId
enableCommonDeptId	string	否	启用部门ID 示例：commonDeptId
chargeLeaderId	string	否	负责人ID 示例：chargeLeaderId
diaryFiles	object	是	汇报附件列表
diaryOperateLogs	object	是	汇报操作日志
readLogs	object	是	阅读日志列表
favorites	object	是	收藏列表
oldDataStatus	number
小数位数:0,最大长度:10	否	原数据状态 示例：0
draftType	string	否	草稿类型 示例：NORMAL
diaryTemplate	object	否	汇报模板
thirdSourceType	string	是	第三方来源类型 示例：["CRM"]
indexInfos	object	是	指标信息列表
enableEdit	boolean	否	是否允许编辑 示例：true
enableDelete	boolean	否	是否允许删除 示例：true
concernStatus	boolean	否	关注状态 示例：false
scheduleTs	number
小数位数:0,最大长度:13	否	定时任务时间 示例：1710000000000
submitType	string	否	提交类型 示例：MANUAL
creator	string	否	创建人ID 示例：creatorUserId
submitState	number
小数位数:0,最大长度:10	否	提交状态 示例：1
scheduleSumbitFailMsg	string	否	定时提交失败原因 示例：失败原因

## 5. 正确返回示例

{
	"code": 0,
	"data": [
		{
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
			"avatar": "avatarUrl",
			"commentNum": 0,
			"content": "汇报内容",
			"contentEncType": "base64",
			"createTime": 1710000000000,
			"dataStatus": 1,
			"dataType": 1,
			"commonDeptId": "commonDeptId",
			"deptName": "部门名称",
			"orgName": "组织名称",
			"diaryTime": 1710000000000,
			"visibleRange": 1,
			"diaryTimeStatus": 0,
			"diaryTimeDefault": 1,
			"diaryTimeRequired": 1,
			"diaryTimeType": 1,
			"visibleRangeReadonly": 0,
			"favorite": {
				"favoriteNum": 0,
				"isFavorite": 0,
				"favorite": false
			},
			"fileStr": "[{\"fileId\":\"fileId\"}]",
			"gather": 0,
			"id": "diaryId",
			"oldDiaryId": "oldDiaryId",
			"draftId": "draftId",
			"isRead": 1,
			"like": {
				"likeNum": 0,
				"isLike": 0,
				"like": false
			},
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
			"readCount": 0,
			"readLog": [
				{
					"diaryId": "diaryId",
					"commonUserId": "commonUserId",
					"createTime": 1710000000000,
					"commonTenantId": "commonTenantId",
					"userName": "用户名称",
					"avatar": "avatarUrl",
					"spaceId": "spaceId"
				}
			],
			"requiredLocation": 0,
			"source": 1,
			"commonTenantId": "commonTenantId",
			"templateId": "templateId",
			"fixedDiaryRange": false,
			"makeUpType": "UNLIMITED",
			"makeUpDays": 0,
			"makeUpHours": 0,
			"templateName": "模板名称",
			"userName": "汇报人名称",
			"status": 1,
			"version": "1710000000000",
			"longitude": "116.397",
			"latitude": "39.908",
			"location": "位置",
			"hasSubordinate": 0,
			"diaryComments": [
				{
					"commentId": "commentId",
					"content": "评论内容",
					"commonUserId": "commonUserId",
					"userName": "用户名称",
					"createTime": 1710000000000
				}
			],
			"diaryComment": "评论内容",
			"recordStatus": "NORMAL",
			"diaryStartDate": 1710000000000,
			"diaryEndDate": 1710000000000,
			"reportObjectTypes": [
				"DEPT"
			],
			"onlyCurrentPosition": false,
			"visibleRangeStr": "[{\"dataType\":1,\"teamId\":\"deptId\"}]",
			"atStr": "[{\"commonUserId\":\"commonUserId\",\"userName\":\"用户名称\"}]",
			"groupId": "groupId",
			"targetMucId": "targetMucId",
			"indexInfoStr": "[{\"indexKey\":\"key\",\"indexValue\":\"value\"}]",
			"commonUserId": "commonUserId",
			"enableCommonDeptId": "commonDeptId",
			"chargeLeaderId": "chargeLeaderId",
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
					"businessId": "diaryId"
				}
			],
			"diaryOperateLogs": [
				{
					"commonUserId": "commonUserId",
					"reason": "操作原因",
					"userName": "用户名称",
					"createTime": 1710000000000
				}
			],
			"readLogs": [
				{
					"diaryId": "diaryId",
					"commonUserId": "commonUserId",
					"createTime": 1710000000000,
					"commonTenantId": "commonTenantId"
				}
			],
			"favorites": [
				{
					"commonUserId": "commonUserId",
					"commonTenantId": "commonTenantId",
					"diaryId": "diaryId"
				}
			],
			"oldDataStatus": 0,
			"draftType": "NORMAL",
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
			"enableEdit": true,
			"enableDelete": true,
			"concernStatus": false,
			"scheduleTs": 1710000000000,
			"submitType": "MANUAL",
			"creator": "creatorUserId",
			"submitState": 1,
			"scheduleSumbitFailMsg": "失败原因"
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

