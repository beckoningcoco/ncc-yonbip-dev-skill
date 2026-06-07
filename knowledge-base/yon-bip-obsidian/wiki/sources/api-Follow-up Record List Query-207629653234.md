---
title: "跟进记录列表查询"
apiId: "2076296532341030915"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Follow-up Record"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Follow-up Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 跟进记录列表查询

>  请求方式	POST | Follow-up Record (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/followup/list
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:4	否	是	每页行数 示例：10 默认值：10
code	string	否	否	单据号 示例：20240829021748
simpleVOs	object	是	否	查询条件（档案类型的字段应该用xxx.code或者xxx.name,不能用xxx_code或者xxx_name）
field	string	否	否	可作为查询条件的参数如：followTime(跟进时间) 示例：followTime
op	string	否	否	逻辑符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空） 示例：between
value1	string	否	否	查询条件值1 示例：2024-08-01 00:00:00
value2	string	否	否	查询条件值2 示例：2024-08-30 23:59:59

## 3. 请求示例

Url: /yonbip/crm/followup/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "20240829021748",
	"simpleVOs": [
		{
			"field": "followTime",
			"op": "between",
			"value1": "2024-08-01 00:00:00",
			"value2": "2024-08-30 23:59:59"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
recordList	object	是	子表集合

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"returncount": 0,
				"verifystate": 0,
				"code": "20240829021748",
				"followContext": "新增商机：20240827新商机（编码: 20240827000242）",
				"followUpMethod": "5",
				"oppt": "2074911276535906311",
				"oppt_name": "20240827新商机",
				"opptStage_name": "挖掘商机",
				"id": "2076169693366321156",
				"pubts": "2024-08-29 10:19:23",
				"ower": "1884702611124256781",
				"ower_name": "张三",
				"creator": "张三",
				"org": "1884698324742176769",
				"org_name": "集团",
				"isWfControlled": false,
				"saleArea_name": "华北大区",
				"followRecordDefineCharacter__CRM023": "d53739e3-7ea5-41d2-901d-abbf7a2bf541",
				"followRecordDefineCharacter__CRM01": "777",
				"saleArea": "1884703933956882438",
				"followContextRichText": "新增商机：20240827新商机（编码: 20240827000242）",
				"dept": "1884699295404785664",
				"dept_name": "销管二部",
				"bustype": "1884699295404785664",
				"bustype_code": "zy001",
				"bustype_name": "测试交易类型",
				"bustype_extend_attrs_json": "{\\\"signRange\\\":1000,\\\"isSign\\\":true}",
				"merchantAppliedDetail_isPotential": false,
				"followRecordDefineCharacter": {
					"ytenant": "0000LQ4VPUHD1E4RUY0000",
					"CRM023": "d53739e3-7ea5-41d2-901d-abbf7a2bf541",
					"CRM01": "777",
					"id": "2076169693366321157",
					"pubts": "2024-08-29 10:19:23"
				},
				"followTime": "2024-08-28 09:51:13",
				"createTime": "2024-08-29 10:19:23",
				"opptStage": "1884107844041573438",
				"followMethodDoc": "1884107852631507043",
				"followMethodDoc_code": "workfollow",
				"followMethodDoc_name": "业务推进",
				"customer": "1887213483348983810",
				"customer_name": "北京小米智能科技有限公司-测试",
				"contact": "2031811984106717188",
				"contact_name": "李四",
				"followUpTime": "2024-08-02 00:00:00",
				"followUpContext": "测试",
				"signInId": "2031811984106717188",
				"location": "北京市海淀区北清路68号",
				"locationTime": "2024-08-29 10:19:23",
				"longitude": 116.241113,
				"latitude": 40.073291,
				"signInImg": "949aa31e-d9a7-4d84-8a48-a2713e381adc",
				"auditor": "张三",
				"auditTime": "2024-08-29 10:19:23",
				"modifier": "张三",
				"modifyTime": "2024-08-29 10:19:23",
				"picture1": "949aa31e-d9a7-4d84-8a48-a2713e381adc",
				"picture2": "949aa31e-d9a7-4d84-8a48-a2713e381adc",
				"picture3": "949aa31e-d9a7-4d84-8a48-a2713e381adc",
				"picture4": "949aa31e-d9a7-4d84-8a48-a2713e381adc",
				"picture5": "949aa31e-d9a7-4d84-8a48-a2713e381adc",
				"taskId": "1887213483348983810",
				"taskId_code": "20240829001",
				"clue": "1887213483348983810",
				"clue_name": "测试线索",
				"motion": "1887213483348983810",
				"motion_name": "测试关联动作",
				"contractDraft": "1887213483348983810",
				"contractDraft_name": "测试合同草案",
				"customerIndustry": "1887213483348983810",
				"customerIndustry_Name": "测试行业",
				"tenderSheet": "1887213483348983810",
				"tenderSheet_name": "测试投标单",
				"opptReport": "1887213483348983810",
				"opptReport_name": "测试商机报备"
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

