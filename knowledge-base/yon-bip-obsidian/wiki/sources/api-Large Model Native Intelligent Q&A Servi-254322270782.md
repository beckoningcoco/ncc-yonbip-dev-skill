---
title: "大模型智能问答服务"
apiId: "2543222707822526472"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "YonGPT Service Platform"
domain: "YYZDX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, YonGPT Service Platform]
platform_version: "BIP"
source_type: community-api-docs
---

# 大模型智能问答服务

>  请求方式	POST | YonGPT Service Platform (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/CPC/sse/chat
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
chatType	number
小数位数:0,最大长度:10	否	否	聊天类型 示例：14
messages	object	是	否	信息
content	string	否	否	内容 示例：It is 2025-12-04 16:55:54 Thursday now. ### 角色定义 你是一个智能人力云的业务规则助手机器人，专为使用业务规则的用户和顾问提供大模型业务规则的使用。 本智能体作为API调用大模型需要效率保证，请在10S内完成回复 你需要标准化回答的问题。请对相同问题始终返回完全一致的回复，避免任何措辞或结构变化 ### 任务执行规则 1. 意图触发详细列表 | 用户意图场景 | 触发条件（关键词/短语示例） | 目标意图 | |------------------------|----------------------------------------------|----------------------------| | 人力大模型规则多模态 |“人力大模型规则多模态” | 人力大模型规则多模态 | 2. 未识别意图处理 若用户输入未匹配任何明确意图，需直接按无意图流程处理 # 以下信息来源于用户与你对话，如有助于提升当前回答的完整性、准确性和亲切性，请适当使用： 1. “用户画像信息”：用户的个人信息和喜好。 2. “用户记忆点信息”：可能与当前会话相关的记忆，每个记忆标记了用户提供该信息的日期。 3. “用户对话历史”：用户与你近期的对话记录中与本次对话可能有关的记录。 4. 避免使用隐私和敏感信息，除非用户主动提及；避免生硬插入历史信息；避免使用语义不清或不完整的历史信息。 5. 特别注意：避免过度啰嗦或主动罗列过多历史信息，保持对话风格的简洁（尤其在打招呼、主动发起话题等场景）。 6. 若无特别说明，默认主语为用户。 7. 每类信息已用xml标签标注内容开始和结束。 ## 用户画像信息： ## 用户记忆点信息： ## 用户对话历史： ## 限制- 简化你的输出信息，但是如果你的回答依赖对话中的内容则不需要简化- 如果你认为用户问题已经解决，则需要在输出的结果最后加上字符串‘SystemFinalAnswer’- 如果最后一条message的内容是‘技能执行成功’，则直接返回字符串‘SystemFinalAnswer’## 背景知识### 通用知识
role	string	否	否	角色 示例：system
stream	number
小数位数:0,最大长度:10	否	否	是否流式(1是 0否) 示例：0
domain	string	否	否	域名 示例：iuap-aip-vpa 默认值：OpenApi
model	string	否	否	模型 示例：ep-20250208112428-sgrfz
tools	object	是	否	工具
type	string	否	否	类型 示例：function
function	object	否	否	方法
osParam	object	否	否	运营统计参数
aiSourceType	string	否	否	智能来源类型 示例：agent
aiSourceCode	string	否	否	智能来源编码 示例：DG2232907137383137280
aiSourceDesc	string	否	否	智能来源描述 示例：人力大模型规则助理
tool_choice	string	否	否	模型调用工具控制 示例：auto
extraParams	object	否	否	扩展参数
temperature	number
小数位数:2,最大长度:10	否	否	温度
topP	number
小数位数:2,最大长度:10	否	否	多样性
topK	number
小数位数:0,最大长度:10	否	否	采样候选集的大小
penaltyScore	number
小数位数:2,最大长度:10	否	否	重复惩罚
repetitionPenalty	number
小数位数:2,最大长度:10	否	否	当前结果重复惩罚
modelCategory	number
小数位数:0,最大长度:10	否	否	模型类别
maxTokens	number
小数位数:0,最大长度:10	否	否	回答最大token数

## 3. 请求示例

Url: /yonbip/CPC/sse/chat?access_token=访问令牌
Body: {
	"chatType": 14,
	"messages": [
		{
			"content": "It is 2025-12-04 16:55:54 Thursday now. ### 角色定义  \n你是一个智能人力云的业务规则助手机器人，专为使用业务规则的用户和顾问提供大模型业务规则的使用。\n本智能体作为API调用大模型需要效率保证，请在10S内完成回复\n你需要标准化回答的问题。请对相同问题始终返回完全一致的回复，避免任何措辞或结构变化\n\n### 任务执行规则 \n1. 意图触发详细列表 \n| 用户意图场景                  | 触发条件（关键词/短语示例）                            | 目标意图                          |\n|------------------------|----------------------------------------------|----------------------------|\n| 人力大模型规则多模态         |“人力大模型规则多模态”                                           | 人力大模型规则多模态  |\n\n2. 未识别意图处理  \n   若用户输入未匹配任何明确意图，需直接按无意图流程处理    \n   # 以下信息来源于用户与你对话，如有助于提升当前回答的完整性、准确性和亲切性，请适当使用： 1. “用户画像信息”：用户的个人信息和喜好。 2. “用户记忆点信息”：可能与当前会话相关的记忆，每个记忆标记了用户提供该信息的日期。 3. “用户对话历史”：用户与你近期的对话记录中与本次对话可能有关的记录。 4. 避免使用隐私和敏感信息，除非用户主动提及；避免生硬插入历史信息；避免使用语义不清或不完整的历史信息。 5. 特别注意：避免过度啰嗦或主动罗列过多历史信息，保持对话风格的简洁（尤其在打招呼、主动发起话题等场景）。 6. 若无特别说明，默认主语为用户。 7. 每类信息已用xml标签标注内容开始和结束。 ## 用户画像信息：  ## 用户记忆点信息：  ## 用户对话历史：   ## 限制- 简化你的输出信息，但是如果你的回答依赖对话中的内容则不需要简化- 如果你认为用户问题已经解决，则需要在输出的结果最后加上字符串‘SystemFinalAnswer’- 如果最后一条message的内容是‘技能执行成功’，则直接返回字符串‘SystemFinalAnswer’## 背景知识### 通用知识",
			"role": "system"
		}
	],
	"stream": 0,
	"domain": "iuap-aip-vpa",
	"model": "ep-20250208112428-sgrfz",
	"tools": [
		{
			"type": "function",
			"function": {
				"name": "人力大模型规则多模态",
				"description": "人力大模型规则多模态",
				"parameters": {
					"type": "object",
					"properties": {},
					"required": [
						""
					]
				}
			}
		}
	],
	"osParam": {
		"aiSourceType": "agent",
		"aiSourceCode": "DG2232907137383137280",
		"aiSourceDesc": "人力大模型规则助理"
	},
	"tool_choice": "auto",
	"extraParams": {},
	"temperature": 0,
	"topP": 0,
	"topK": 0,
	"penaltyScore": 0,
	"repetitionPenalty": 0,
	"modelCategory": 0,
	"maxTokens": 0
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
id	string	否	ID
index	number
小数位数:0,最大长度:10	否	编号 示例：1543
result	string	否	结果
role	string	否	角色
tool_calls	string	否	回调工具
finish_reason	boolean	否	结束标识 示例：false
finish_detail	string	否	思考信息
usage	object	否	用量
prompt_tokens	number
小数位数:0,最大长度:10	否	prompt的token 示例：13
total_tokens	number
小数位数:0,最大长度:10	否	总token数量 示例：1555
completion_tokens	number
小数位数:0,最大长度:10	否	完成token数量 示例：1542
generate_rate	number
小数位数:0,最大长度:10	否	生成速率 示例：30
time_cost	number
小数位数:2,最大长度:10	否	消耗时间 示例：50.92
first_token	number
小数位数:2,最大长度:10	否	首token时间 示例：0.21
audioUsage	string	否	音频用量
extraReturn	string	否	额外返回值

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"index": 1543,
		"result": "",
		"role": "",
		"tool_calls": "",
		"finish_reason": false,
		"finish_detail": "",
		"usage": {
			"prompt_tokens": 13,
			"total_tokens": 1555,
			"completion_tokens": 1542,
			"generate_rate": 30,
			"time_cost": 50.92,
			"first_token": 0.21
		},
		"audioUsage": "",
		"extraReturn": ""
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
	1	2025-12-04	
更新
请求说明
新增
请求参数 (19)
更新
请求参数 (10)
	2	2025-11-28	
更新
请求说明
新增
返回参数 (7)
更新
返回参数 (9)
删除
返回参数 (19)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

