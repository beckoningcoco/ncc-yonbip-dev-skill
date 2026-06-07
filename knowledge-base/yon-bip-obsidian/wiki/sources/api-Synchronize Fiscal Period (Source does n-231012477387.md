---
title: "同步会计期间(来源没有季度、半年)"
apiId: "2310124773876695098"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fiscal Period"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fiscal Period]
platform_version: "BIP"
source_type: community-api-docs
---

# 同步会计期间(来源没有季度、半年)

>  请求方式	POST | Fiscal Period (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/FCC/period/api/u8c/saveOrUpdate
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
serviceCode	string	query	是	服务编码    示例: accperiod    默认值: accperiod
Body参数
名称	类型	数组	必填	描述
data	object	是	否	请求数据
accId	string	否	是	期间方案编码 示例：u8c_code
begindate	string	否	是	期间开始日期 示例：2024-01-01
enddate	string	否	是	期间结束日期 示例：2024-01-31
objid	string	否	否	数据来源id 示例：1
periodNo	string	否	是	期间的月份 示例：1
year	string	否	是	期间年编码 示例：2024

## 3. 请求示例

Url: /yonbip/FCC/period/api/u8c/saveOrUpdate?access_token=访问令牌&serviceCode=accperiod
Body: {
	"data": [
		{
			"accId": "u8c_code",
			"begindate": "2024-01-01",
			"enddate": "2024-01-31",
			"objid": "1",
			"periodNo": "1",
			"year": "2024"
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功！
data	object	否	响应数据体
count	number
小数位数:0,最大长度:10	否	总条数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	同步成功条数 示例：1
failCount	number
小数位数:0,最大长度:10	否	同步失败条数 示例：0
messages	string	是	错误提示信息集合
infos	object	是	响应信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"data": {
					"accId": "u8c_code",
					"begindate": "2023-12-31T16:00:00.000+00:00",
					"enddate": "2024-01-30T16:00:00.000+00:00",
					"objid": "1",
					"periodNo": "1",
					"year": "2024",
					"accperiodscheme": 2175745168462839816,
					"id": 2175747814162694146,
					"_status": "Update",
					"code": "2024-01",
					"accperiodyear2": "2024",
					"periodyear": 2175747822752628742,
					"codedate": "2024-01",
					"localcode": "2024-01"
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

