---
title: "查询项目里程碑列表"
apiId: "2547561810199314438"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询项目里程碑列表

>  请求方式	POST | Project (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/oa-project/rest/openapi/project/getProjectMilestoneList
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
pageNo	int	否	否	当前页码 示例：1 默认值：1
pageSize	int	否	否	每页记录数 示例：20 默认值：20
commonUserIds	string	是	否	用户ID列表 示例：["user001"]
userRoles	int	是	否	用户角色列表 示例：[1,2,3]
projectName	string	否	否	项目名称 示例：测试项目
taskName	string	否	否	任务名称 示例：测试任务
classifyId	string	否	否	项目分类ID 示例：classify001
archiveName	string	否	否	档案名称 示例：档案
archiveType	string	否	否	档案类型 示例：default
status	int	否	否	项目状态 示例：0
startTime	string	否	否	开始时间 示例：2026-05-25
endTime	string	否	否	结束时间 示例：2026-05-31
panelFlag	int	否	否	视图类型：0看板、1列表 示例：1
includeComplete	boolean	否	否	是否包含已完成项目 示例：true
projectId	string	否	否	项目ID 示例：project001
includeUserRole	boolean	否	否	是否包含角色 示例：true
parentId	string	否	否	父任务ID 示例：task001
executors	string	是	否	项目执行人列表 示例：["user003"]
participants	string	是	否	项目参与人列表 示例：["user002"]
sortByNameFlag	int	否	否	按任务名称排序：0不排序、1升序、2降序 示例：0
sortByUpdateTimeFlag	int	否	否	按更新时间排序：0不排序、1升序、2降序 示例：0
showSubTask	boolean	否	否	是否展示子任务 示例：false

## 3. 请求示例

Url: /yonbip/SCCC/oa-project/rest/openapi/project/getProjectMilestoneList?access_token=访问令牌
Body: {
	"pageNo": 1,
	"pageSize": 20,
	"commonUserIds": [
		"user001"
	],
	"userRoles": [
		1,
		2,
		3
	],
	"projectName": "测试项目",
	"taskName": "测试任务",
	"classifyId": "classify001",
	"archiveName": "档案",
	"archiveType": "default",
	"status": 0,
	"startTime": "2026-05-25",
	"endTime": "2026-05-31",
	"panelFlag": 1,
	"includeComplete": true,
	"projectId": "project001",
	"includeUserRole": true,
	"parentId": "task001",
	"executors": [
		"user003"
	],
	"participants": [
		"user002"
	],
	"sortByNameFlag": 0,
	"sortByUpdateTimeFlag": 0,
	"showSubTask": false
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
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

