---
title: "建筑业项目涉税外经证信息导入"
apiId: "1760134248719187976"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax-related items information of construction industry"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax-related items information of construction industry]
platform_version: "BIP"
source_type: community-api-docs
---

# 建筑业项目涉税外经证信息导入

>  请求方式	POST | Tax-related items information of construction industry (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxbuilding/api/project/importwjz
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
orgCode	string	否	是	税务组织编码 示例：ceshi
projectCode	string	否	是	项目编号 示例：1111
projectName	string	否	是	项目名称 示例：项目名称
taxOfficeName	string	否	是	主管税务机关 示例：税务机关
verifyNumber	string	否	是	跨区域涉税事项报验管理编号 示例：ceshi
crossRegionStatus	string	否	否	跨地区涉税事项表状态: -2-已报告未报验 0-已报告未反馈,1-已反馈 2-作废 示例：0
effectiveDateStart	string	否	是	有效日期起 示例：2023-01-01
effectiveDateEnd	string	否	是	有效日期止 示例：2023-01-31
operateAddress	string	否	是	跨区域经营地址 示例：测
operateMethod	string	否	是	经营方式：1-建筑安装。2-装饰修饰。3-修理修配。4-加工。5-批发。6-零售。7-批零兼营。8-零批兼营。9-其他。 示例：1

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbuilding/api/project/importwjz?access_token=访问令牌
Body: {
	"orgCode": "ceshi",
	"projectCode": "1111",
	"projectName": "项目名称",
	"taxOfficeName": "税务机关",
	"verifyNumber": "ceshi",
	"crossRegionStatus": "0",
	"effectiveDateStart": "2023-01-01",
	"effectiveDateEnd": "2023-01-31",
	"operateAddress": "测",
	"operateMethod": "1"
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
code	string	否	状态码 示例：200
message	string	否	操作描述 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	系统异常	根据具体返回信息调整数据
1001	参数校验	根据具体返回信息调整数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-16	
更新
请求说明
更新
请求参数 crossRegionStatus
跨地区涉税事项状态描述修改
	2	2025-07-03	
更新
请求参数 (10)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

