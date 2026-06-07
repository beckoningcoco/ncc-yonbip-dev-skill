---
title: "查看问卷详情"
apiId: "2428143852321243140"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Questionnaire"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Questionnaire]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看问卷详情

>  请求方式	GET | Questionnaire (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/Questionnaire/getbyid
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	问卷id    示例: 2331017261748480

## 3. 请求示例

Url: /yonbip/MCC/Questionnaire/getbyid?access_token=访问令牌&id=2331017261748480

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
code	number
小数位数:0,最大长度:10	否	编码 示例：200
message	string	否	消息 示例：操作成功
data	object	否	返回数据
applicableObjects	string	否	调查对象 示例：2
creator	string	否	创建人 示例：昵称-李亚苹
interactionMode	number
小数位数:0,最大长度:10	否	交互方式 示例：1
modifier	string	否	修改人 示例：昵称-李亚苹
scoreType	number
小数位数:0,最大长度:10	否	评分类型 示例：3
modifyTime	string	否	修改时间 示例：2025-12-16 14:31:17
createTime	string	否	创建时间 示例：2025-12-16 14:06:03
salesIntensityEvaluation	number
小数位数:0,最大长度:10	否	销售强度评测 示例：0
name	object	否	问卷名称
id	string	否	id 示例：2428075253086814213
describe	object	否	问卷描述
pubts	string	否	时间戳 示例：2025-12-16 14:31:17
questionnaireApplyOrg	object	是	问卷适用范围
stopstatus	number
小数位数:0,最大长度:10	否	问卷状态 示例：1
questionnaireDetail	object	是	问卷详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"applicableObjects": "2",
		"creator": "昵称-李亚苹",
		"interactionMode": 1,
		"modifier": "昵称-李亚苹",
		"scoreType": 3,
		"modifyTime": "2025-12-16 14:31:17",
		"createTime": "2025-12-16 14:06:03",
		"salesIntensityEvaluation": 0,
		"name": {
			"zh_CN": "LZYceshi"
		},
		"id": "2428075253086814213",
		"describe": {},
		"pubts": "2025-12-16 14:31:17",
		"questionnaireApplyOrg": [
			{
				"org": "1727458197554331652",
				"questionnaireId": "2428075253086814213",
				"id": "2428088266837721089",
				"pubts": "2025-12-16 14:31:17",
				"org_name": "营销费用",
				"org_code": "111"
			}
		],
		"stopstatus": 1,
		"questionnaireDetail": [
			{
				"questionId_questionType": 2,
				"questionOptionId": "1992297348583129093",
				"questionId": "1992297348583129092",
				"isSupportUploadImage": 0,
				"questionOptionSort": 0,
				"questionnaireId": "2428075253086814213",
				"questionOptionId_sort": 0,
				"mustAnswer": 1,
				"questionOptionId_name": "111",
				"questionOptionId_code": "选项一",
				"questionId_name": "问题一",
				"questionSort": 1,
				"id": "2428075253086814214",
				"pubts": "2025-12-16 14:06:03",
				"questionId_answerType": "1",
				"arrangementMethod": "2"
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

