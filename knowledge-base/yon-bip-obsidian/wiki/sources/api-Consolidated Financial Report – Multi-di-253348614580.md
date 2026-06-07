---
title: "合并报表-多维数据导出"
apiId: "2533486145809416192"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-多维数据导出

>  请求方式	POST | Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/tbb/cube/expdbcsv
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
SCENARIO	string	否	是	业务方案 示例：Actual
YEARS	string	否	是	年 示例：2022,2023
PERIOD	string	否	是	期间 示例：1,2
VERSION	string	否	是	版本 示例：v0
VIEW	string	否	是	度量维 示例：YTD
ENTITY	string	否	是	组织 示例：S,S1
TRAIL	string	否	是	审计线索 示例：<EO>
ACCOUNT	string	否	否	科目 示例：AAA,CCC
ICP	string	否	否	客商 示例：[ICP_None]
C1	string	否	否	C1 示例：[None]
C2	string	否	否	C2 示例：[None]
note	string	否	否	导出文本 0不导出文本，1导出文本 示例：0 默认值：0
filetype	string	否	否	文件类型；0 txt, 1 csv, 2 dat 示例：1 默认值：1
pk_cube	string	否	否	模型主键 示例：2340559908554407936
sysParamJson	object	否	否	系统参数
appcode	string	否	否	appcode 示例：BCS05002 默认值：BCS05002
syscode	string	否	否	syscode 示例：BCS 默认值：BCS

## 3. 请求示例

Url: /yonbip/FCC/tbb/cube/expdbcsv?access_token=访问令牌
Body: {
	"SCENARIO": "Actual",
	"YEARS": "2022,2023",
	"PERIOD": "1,2",
	"VERSION": "v0",
	"VIEW": "YTD",
	"ENTITY": "S,S1",
	"TRAIL": "<EO>",
	"ACCOUNT": "AAA,CCC",
	"ICP": "[ICP_None]",
	"C1": "[None]",
	"C2": "[None]",
	"note": "0",
	"filetype": "1",
	"pk_cube": "2340559908554407936",
	"sysParamJson": {
		"appcode": "BCS05002",
		"syscode": "BCS"
	}
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
data	string	否	异步长任务ID，通过id调用 合并报表-长操作结果查询结果api 示例：2533483800778506241
success	boolean	否	success 示例：true

## 5. 正确返回示例

{
	"code": 200,
	"data": "2533483800778506241",
	"success": true
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
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

