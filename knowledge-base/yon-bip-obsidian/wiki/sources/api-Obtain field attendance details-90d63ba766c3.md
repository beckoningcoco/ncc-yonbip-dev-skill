---
title: "获取外勤打卡明细"
apiId: "90d63ba766c34477829527d374b3dd11"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Comprehensive Check-in Details Card"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Comprehensive Check-in Details Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取外勤打卡明细

>  请求方式	GET | Comprehensive Check-in Details Card (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/sign/attendExternal/getOutSiteRecord
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
pageNum	int	query	是	当前页    示例: 1
pageSize	int	query	是	页大小（不能超过100）    示例: 10
beginDate	Date	query	是	开始时间    示例: 2022/01/02 00:00
endDate	Date	query	是	结束时间（开始时间结束时间间隔最多为1周）    示例: 2022/01/03 00:00
staffId	string	query	否	员工ID(多个用英文逗号分割)
staffCode	string	query	否	员工编码(多个用英文逗号分割)

## 3. 请求示例

Url: /yonbip/hrcloud/time/sign/attendExternal/getOutSiteRecord?access_token=访问令牌&pageNum=1&pageSize=10&beginDate=2022%2F01%2F02%2000%3A00&endDate=2022%2F01%2F03%2000%3A00&staffId=&staffCode=

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
message	string	否	提示消息 示例：返回成功
data	object	是	返回结果集
staffId	string	否	员工ID
staffCode	string	否	员工编码 示例：1007
staffName	string	否	员工姓名 示例：何宁
deptId	string	否	部门ID
deptVId	string	否	部门时间轴ID
deptName	string	否	部门名称 示例：北京分公司
orgId	string	否	组织ID
orgVId	string	否	组织时间轴ID
orgName	string	否	组织名称
signtime	DateTime	否	打卡时间 示例：2022-12-01 00:00:00
legWorkType	string	否	外勤类型 示例：公事外出
addressDetail	string	否	详细地址 示例：北京市海淀区西北旺镇永腾南路用友产业园中区
remark	string	否	外勤说明
dealStatus	string	否	审批状态 示例：审批通过
filePath	string	否	附件

## 5. 正确返回示例

{
	"code": "200",
	"message": "返回成功",
	"data": [
		{
			"staffId": "",
			"staffCode": "1007",
			"staffName": "何宁",
			"deptId": "",
			"deptVId": "",
			"deptName": "北京分公司",
			"orgId": "",
			"orgVId": "",
			"orgName": "",
			"signtime": "2022-12-01 00:00:00",
			"legWorkType": "公事外出",
			"addressDetail": "北京市海淀区西北旺镇永腾南路用友产业园中区",
			"remark": "",
			"dealStatus": "审批通过",
			"filePath": ""
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
310078	后端接口响应超时，请稍后重试！	确认租户后重试

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-12	
新增
请求参数 staffId
新增
请求参数 staffCode
新增
返回参数 (6)
更新
返回参数 staffCode
更新
返回参数 staffName
更新
返回参数 attendRecordDefine
	2	2025-05-30	
新增
返回参数 filePath
新增
返回参数 attendRecordDefine

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

