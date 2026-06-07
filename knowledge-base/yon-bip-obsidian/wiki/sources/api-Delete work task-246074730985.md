---
title: "工作任务详情查询"
apiId: "2460747309850296324"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Task Management"
domain: "PLMPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Task Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作任务详情查询

>  请求方式	GET | Task Management (PLMPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/tempTask/v1/detail
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	id

## 3. 请求示例

Url: /yonbip/RDC/openapi/tempTask/v1/detail?access_token=访问令牌&id=

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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
		否	
		否	
createorg	string	否	创建组织ID 示例：2427197258809737226
code	string	否	编码 示例：TT-00000008
lifeStatus	string	否	生命周期状态 示例：Planning
ownedorg	string	否	所属组织ID 示例：2427197258809737226
classifyId	string	否	工作任务类型ID 示例：2430172700474867712
directorYht	string	否	负责人友互通 示例：9a0a7699-cce6-44ba-8768-1ebcdddd18e3
creator_userName	string	否	创建人 示例：黎壹
ownerId	string	否	所有者ID 示例：2429581498240729095
path	string	否	路径 示例：2460734425050644486|
directorDept_name	string	否	负责人部门 示例：多语测试
lifecycleAttrId_name	string	否	生命周期状态 示例：编制中
state	string	否	启用状态 示例：0
id	string	否	id 示例：2460734425050644486
lifecycleUseId_name	string	否	生命周期使用 示例：TEIN-工作任务-默认模板使用
pubts	string	否	时间戳 示例：2026-01-29 14:13:11
syncCreate	number
小数位数:0,最大长度:10	否	同步创建 示例：0
ownedorg_name	string	否	所属组织 示例：jin20251203内容多语改造日常测试租
ownerDept	string	否	所有者部门ID 示例：2427197636766859271
ownerId_name	string	否	所有者 示例：黎壹
creator	string	否	创建人 示例：43d70812-a497-4987-902d-eb47e9fb3aab
level	number
小数位数:0,最大长度:10	否	层级 示例：1
ytenant	string	否	租户ID 示例：0000MISDH7OUGVXP1J0000
director	string	否	负责人ID 示例：2428683326079893513
ownerDept_name	string	否	所有者部门 示例：多语测试
tempTaskFileList	object	是	附件
fileName	string	否	附件名 示例：屏幕截图(1)
creator	string	否	创建人ID 示例：43d70812-a497-4987-902d-eb47e9fb3aab
fileSize	string	否	附件大小 示例：452.79KB
ytenant	string	否	租户ID 示例：0000MISDH7OUGVXP1J0000
format	string	否	格式 示例：png
creator_userName	string	否	创建人 示例：黎壹
creationtime	string	否	创建时间 示例：2026-01-29 14:13:11
id	string	否	id 示例：2460734425050644487
pubts	string	否	时间戳 示例：2026-01-29 14:13:11
url	string	否	url 示例：016njmmdACLrWw1BD5S834fdc57852b8da7f55d8ecb981830c1349b95da45840c4de3935c15e230f13cfdd198ab4050b8b42cc70a6d556d0e71
taskId	string	否	工作任务ID 示例：2460734425050644486
isEnd	boolean	否	是否末级 示例：true
planTimeMode	string	否	计划结束时间模式 示例：custom
classifyId_name	string	否	工作任务类型 示例：1111
directorDept	string	否	负责人部门ID 示例：2427197636766859271
tempTaskLinkObjectList	object	是	关联对象
code	string	否	编码 示例：ME00000001
bizType	string	否	对象类型 示例：10190
ytenant	string	否	租户ID 示例：0000MISDH7OUGVXP1J0000
name	string	否	名称 示例：1111
bizTypeName	string	否	对象类型名称 示例：会议
bizId	string	否	对象ID 示例：2429579659993153542
creationtime	string	否	创建时间 示例：2026-01-29 14:13:11
id	string	否	id 示例：2460734425050644488
pubts	string	否	时间戳 示例：2026-01-29 14:13:11
taskId	string	否	工作任务ID 示例：2460734425050644486
name	string	否	名称 示例：ccc
director_name	string	否	负责人 示例：ycc
lifecycleUseId	string	否	生命周期使用ID 示例：2429514453799665683
creationtime	string	否	创建时间 示例：2026-01-29 14:13:11
wfstate	number
小数位数:0,最大长度:10	否	流程状态 示例：0
lifecycleAttrId	string	否	生命周期状态ID 示例：2429514453799665673
createorg_name	string	否	创建组织 示例：jin20251203内容多语改造日常测试租
Deletable	boolean	否	可删除 示例：false
Viewable	boolean	否	可查看 示例：false
Editable	boolean	否	可编辑 示例：false
Publish	boolean	否	可发布 示例：false
Suspend	boolean	否	可暂停 示例：false
Execute	boolean	否	可恢复 示例：false
Terminate	boolean	否	可终止 示例：false

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"createorg": "2427197258809737226",
		"code": "TT-00000008",
		"lifeStatus": "Planning",
		"ownedorg": "2427197258809737226",
		"classifyId": "2430172700474867712",
		"directorYht": "9a0a7699-cce6-44ba-8768-1ebcdddd18e3",
		"creator_userName": "黎壹",
		"ownerId": "2429581498240729095",
		"path": "2460734425050644486|",
		"directorDept_name": "多语测试",
		"lifecycleAttrId_name": "编制中",
		"state": "0",
		"id": "2460734425050644486",
		"lifecycleUseId_name": "TEIN-工作任务-默认模板使用",
		"pubts": "2026-01-29 14:13:11",
		"syncCreate": 0,
		"ownedorg_name": "jin20251203内容多语改造日常测试租",
		"ownerDept": "2427197636766859271",
		"ownerId_name": "黎壹",
		"creator": "43d70812-a497-4987-902d-eb47e9fb3aab",
		"level": 1,
		"ytenant": "0000MISDH7OUGVXP1J0000",
		"director": "2428683326079893513",
		"ownerDept_name": "多语测试",
		"tempTaskFileList": [
			{
				"fileName": "屏幕截图(1)",
				"creator": "43d70812-a497-4987-902d-eb47e9fb3aab",
				"fileSize": "452.79KB",
				"ytenant": "0000MISDH7OUGVXP1J0000",
				"format": "png",
				"creator_userName": "黎壹",
				"creationtime": "2026-01-29 14:13:11",
				"id": "2460734425050644487",
				"pubts": "2026-01-29 14:13:11",
				"url": "016njmmdACLrWw1BD5S834fdc57852b8da7f55d8ecb981830c1349b95da45840c4de3935c15e230f13cfdd198ab4050b8b42cc70a6d556d0e71",
				"taskId": "2460734425050644486"
			}
		],
		"isEnd": true,
		"planTimeMode": "custom",
		"classifyId_name": "1111",
		"directorDept": "2427197636766859271",
		"tempTaskLinkObjectList": [
			{
				"code": "ME00000001",
				"bizType": "10190",
				"ytenant": "0000MISDH7OUGVXP1J0000",
				"name": "1111",
				"bizTypeName": "会议",
				"bizId": "2429579659993153542",
				"creationtime": "2026-01-29 14:13:11",
				"id": "2460734425050644488",
				"pubts": "2026-01-29 14:13:11",
				"taskId": "2460734425050644486"
			}
		],
		"name": "ccc",
		"director_name": "ycc",
		"lifecycleUseId": "2429514453799665683",
		"creationtime": "2026-01-29 14:13:11",
		"wfstate": 0,
		"lifecycleAttrId": "2429514453799665673",
		"createorg_name": "jin20251203内容多语改造日常测试租",
		"Deletable": false,
		"Viewable": false,
		"Editable": false,
		"Publish": false,
		"Suspend": false,
		"Execute": false,
		"Terminate": false
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
0	未传入优惠券档案id	coupon_id值填写有误
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

