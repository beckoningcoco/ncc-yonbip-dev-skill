---
title: "基准职位批量新增更新_集成_API"
apiId: "2132732686099283971"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Benchmark Job"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Benchmark Job]
platform_version: "BIP"
source_type: community-api-docs
---

# 基准职位批量新增更新_集成_API

>  请求方式	POST | Benchmark Job (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/basepost/batchSaveOrUpdateForIntegration
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	data
other	string	否	否	其他要求 示例：12
education	string	否	否	最低学历要求id 示例：ff683bf3-da6f-4449-bc73-b6c6f4735b79
code	string	否	是	编码 示例：1
jobTitle	string	否	否	最低职称要求id 示例：2127369165273038869
workExperience	string	否	否	工作经验要求 示例：1打算
jobtype_id	string	否	否	职务类别id 示例：2136451449161252868
dr	number
小数位数:0,最大长度:10	否	否	删除状态，0:未删除，1:删除 示例：0
orgId	string	否	是	所属组织id 示例：2127375693623853057
jobgrade_id	string	否	否	职级id 示例：2136451749813157893
enable	number
小数位数:0,最大长度:10	否	是	启用状态，1启用 0停用 示例：1
orgGroupId	string	否	否	适用范围id 示例：1940320324493508610
minrank_id	string	否	否	最低职等id 示例：2136452016099557376
id	string	否	否	主键 示例：2136452909452230667
pubts	string	否	否	时间戳 示例：2024-11-18 15:44:13
tenant	string	否	否	租户id 示例：0000M358B9M63D1F5T0000
creator	string	否	否	创建人 示例：8c4a75a9-41ac-4367-abbd-5692a1bee11d
majorId	string	否	否	专业类别id 示例：2127369165273039162
ytenant	string	否	否	租户id 示例：0000M358B9M63D1F5T0000
maxrank_id	string	否	否	最高职等id 示例：2136452016099557376
degree	string	否	否	最低学位要求id 示例：38364a01-62bc-4a2e-ab93-d8c853fe7392
createTime	string	否	否	创建时间 示例：2024-11-18 15:44:14
postSequenceId	string	否	否	职位序列id 示例：2136450968127012869
job_id	string	否	否	所属职务id 示例：2136452342514450437
jobDuty	string	否	否	工作职责 示例：撒大苏打
distributionSite	string	否	否	站点来源
name	object	否	是	名称
orgGroupDetailList	object	是	否	适用范围详情
workYear	string	否	否	最低工作年限 示例：12
effectiveDate	string	否	否	生效日期，非时间轴租户必填 示例：2024-11-18 00:00:00
modifier	string	否	否	修改人 示例：81ee321b-8c73-49ee-9335-3e53c795f66a
modifyTime	string	否	否	修改时间 示例：2024-04-03 10:50:13
age	string	否	否	年龄要求 示例：12
objid	string	否	否	来源id 如果id有值，则要与id值保持一致
hashCode	string	否	否	适用范围HASH
attachlist	string	否	否	附件

## 3. 请求示例

Url: /yonbip/hrcloud/basepost/batchSaveOrUpdateForIntegration?access_token=访问令牌
Body: {
	"data": [
		{
			"other": "12",
			"education": "ff683bf3-da6f-4449-bc73-b6c6f4735b79",
			"code": "1",
			"jobTitle": "2127369165273038869",
			"workExperience": "1打算",
			"jobtype_id": "2136451449161252868",
			"dr": 0,
			"orgId": "2127375693623853057",
			"jobgrade_id": "2136451749813157893",
			"enable": 1,
			"orgGroupId": "1940320324493508610",
			"minrank_id": "2136452016099557376",
			"id": "2136452909452230667",
			"pubts": "2024-11-18 15:44:13",
			"tenant": "0000M358B9M63D1F5T0000",
			"creator": "8c4a75a9-41ac-4367-abbd-5692a1bee11d",
			"majorId": "2127369165273039162",
			"ytenant": "0000M358B9M63D1F5T0000",
			"maxrank_id": "2136452016099557376",
			"degree": "38364a01-62bc-4a2e-ab93-d8c853fe7392",
			"createTime": "2024-11-18 15:44:14",
			"postSequenceId": "2136450968127012869",
			"job_id": "2136452342514450437",
			"jobDuty": "撒大苏打",
			"distributionSite": "",
			"name": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"orgGroupDetailList": [
				{
					"groupId": "1940320324493508610",
					"id": "1940320324493508611",
					"orgId": "666666"
				}
			],
			"workYear": "12",
			"effectiveDate": "2024-11-18 00:00:00",
			"modifier": "81ee321b-8c73-49ee-9335-3e53c795f66a",
			"modifyTime": "2024-04-03 10:50:13",
			"age": "12",
			"objid": "",
			"hashCode": "",
			"attachlist": ""
		}
	]
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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
count	number
小数位数:0,最大长度:10	否	count 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	sucessCount 示例：1
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：0
messages	object	是	messages
infos	object	是	infos

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"data": {
					"other": "12",
					"education": "ff683bf3-da6f-4449-bc73-b6c6f4735b79",
					"code": "1",
					"jobTitle": "2127369165273038869",
					"workExperience": "1打算",
					"jobtype_id": "2136451449161252868",
					"dr": 0,
					"orgId": "2127375693623853057",
					"jobgrade_id": "2136451749813157893",
					"enable": 1,
					"orgGroupId": "1940320324493508610",
					"minrank_id": "2136452016099557376",
					"id": "2136452909452230667",
					"pubts": "2024-11-18 15:44:13",
					"tenant": "0000M358B9M63D1F5T0000",
					"creator": "8c4a75a9-41ac-4367-abbd-5692a1bee11d",
					"majorId": "2127369165273039162",
					"ytenant": "0000M358B9M63D1F5T0000",
					"maxrank_id": "2136452016099557376",
					"degree": "38364a01-62bc-4a2e-ab93-d8c853fe7392",
					"createTime": "2024-11-18 15:44:14",
					"postSequenceId": "2136450968127012869",
					"job_id": "2136452342514450437",
					"jobDuty": "撒大苏打",
					"distributionSite": "",
					"name": {
						"zh_CN": "基准职位",
						"en_US": "",
						"zh_TW": ""
					},
					"orgGroupDetailList": [
						{
							"ytenant": "0000LDVLBFJI3Y0MIR0000",
							"groupId": "1940320324493508610",
							"id": "1940320324493508611",
							"orgId": "666666"
						}
					],
					"workYear": "12",
					"effectiveDate": "2024-11-18 00:00:00",
					"modifier": "81ee321b-8c73-49ee-9335-3e53c795f66a",
					"modifyTime": "2024-04-03 10:50:13",
					"user_define_character": {
						"ytenant": "0000LSU86TH67MZUOG0000",
						"id": "1966344373138358281",
						"pubts": "2024-04-03 10:50:14"
					},
					"age": "12",
					"hashCode": ""
				}
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
999	操作失败	

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

