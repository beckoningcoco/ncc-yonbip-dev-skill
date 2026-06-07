---
title: "文库应用企业文档文件上传"
apiId: "592f2604dff84dfda6d1c9d7cfa32b7a"
apiPath: "请求方式	POST"
method: "ContentType	multipart/form-data"
category: "Library"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Library]
platform_version: "BIP"
source_type: community-api-docs
---

# 文库应用企业文档文件上传

>  请求方式	POST | Library (OA)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/uspace/rest/openapi/file/upload
请求方式	POST
ContentType	multipart/form-data
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
dirId	string	query	是	目录id    示例: 1957926003265454085
orgId	string	query	是	组织id    示例: 0
userId	string	query	是	用户id    示例: 9682562d-9af3-4b34-b3c8-a42aace2e1b9
tenantId	string	query	是	租户id    示例: iyxtw5cm
secretCode	string	query	否	密级编码    示例: mm
extendParams	string	query	否	密级扩展参数    示例: {"mb":"1","ndiParams":""}
Body参数
名称	类型	数组	必填	描述
file	file	否	否	文件

## 3. 请求示例

Url: /yonbip/uspace/rest/openapi/file/upload?access_token=访问令牌&dirId=1957926003265454085&orgId=0&userId=9682562d-9af3-4b34-b3c8-a42aace2e1b9&tenantId=iyxtw5cm&secretCode=mm&extendParams=%7B%22mb%22%3A%221%22%2C%22ndiParams%22%3A%22%22%7D

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
fid	number
小数位数:0,最大长度:19	否	fid 示例：1905587825904976000
title	string	否	title 示例：测试
bid	number
小数位数:0,最大长度:19	否	bid 示例：1904747876310843400
parentPath	string	否	parentPath 示例：1904018968829493255,1904747876310843396,
tenantId	string	否	tenantId 示例：0000KN5SBWC43JE9SF0000
userId	string	否	userId 示例：11d6dd77-dde4-445b-bf33-927e452bdc3e
orgId	string	否	orgId 示例：0
pubts	number
小数位数:0,最大长度:13	否	pubts 示例：1705039620401

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"fid": 1905587825904976000,
		"title": "测试",
		"bid": 1904747876310843400,
		"parentPath": "1904018968829493255,1904747876310843396,",
		"tenantId": "0000KN5SBWC43JE9SF0000",
		"userId": "11d6dd77-dde4-445b-bf33-927e452bdc3e",
		"orgId": "0",
		"pubts": 1705039620401
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
请求参数 secretCode
新增
请求参数 extendParams
更新
请求参数 file
新增
返回参数 (10)
删除
返回参数 (8)
	2	2025-12-08	
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

