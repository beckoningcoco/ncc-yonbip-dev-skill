---
title: "获取企业文档列表"
apiId: "1904302084490002433"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Library"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Library]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取企业文档列表

>  请求方式	GET | Library (OA)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/uspace/rest/openapi/file/enterprise/list
请求方式	GET
ContentType	
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
dirId	number
小数位数:1,最大长度:20	query	是	目录文件夹id    示例: 190474787631084339
tenantId	string	query	是	租户id    示例: 0000KN5SBWC43JE9SF000
userId	string	query	是	用户id    示例: 0000KN5SBWC43JE9SF000
orgId	string	query	是	组织id    示例: 0
page	number
小数位数:1,最大长度:10	query	是	页码    示例: 1
count	number
小数位数:1,最大长度:10	query	是	每页大小    示例: 10
lastUpdateTime	number
小数位数:1,最大长度:10	query	否	起始时间戳    示例: 1717679881156

## 3. 请求示例

Url: /yonbip/uspace/rest/openapi/file/enterprise/list?access_token=访问令牌&dirId=190474787631084339&tenantId=0000KN5SBWC43JE9SF000&userId=0000KN5SBWC43JE9SF000&orgId=0&page=1&count=10&lastUpdateTime=1717679881156

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
data	object	否	data
deleteFlag	number
小数位数:0,最大长度:10	否	deleteFlag 示例：0
list	object	是	list
total	number
小数位数:0,最大长度:10	否	total 示例：76
rootFid	string	否	rootFid 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"deleteFlag": 0,
		"list": [
			{
				"fid": 2412505223558070278,
				"title": "测试ikm 251125",
				"createTime": 1764052572,
				"updateTime": 1766475327,
				"bid": 0,
				"parentPath": "",
				"tenantId": "0000L6YQ8AVLFUZPXD0000",
				"userId": "99ea7655-00a2-4bda-b23c-19ade37ea574"
			}
		],
		"total": 76,
		"rootFid": "0"
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
	1	2026-04-07	
新增
返回参数 (14)
删除
返回参数 (14)
	2	2026-01-07	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

