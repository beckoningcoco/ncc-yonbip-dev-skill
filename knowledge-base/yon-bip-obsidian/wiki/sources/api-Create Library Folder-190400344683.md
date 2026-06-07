---
title: "创建文库文件夹"
apiId: "1904003446833938433"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Library"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Library]
platform_version: "BIP"
source_type: community-api-docs
---

# 创建文库文件夹

>  请求方式	POST | Library (OA)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/uspace/rest/openapi/file/createDir
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
bid	number
小数位数:1,最大长度:20	否	是	父文件夹id,根目录为0 示例：0
name	string	否	是	文件夹名称 示例：文件夹名
orgId	string	否	是	所属组织id 示例：0 默认值：0
tenantId	string	否	是	租户id 示例：iyxtw5cm
userId	string	否	是	用户id 示例：be8b3556-3801-4b18-aaf2-8649465d01d

## 3. 请求示例

Url: /yonbip/uspace/rest/openapi/file/createDir?access_token=访问令牌
Body: {
	"bid": 0,
	"name": "文件夹名",
	"orgId": "0",
	"tenantId": "iyxtw5cm",
	"userId": "be8b3556-3801-4b18-aaf2-8649465d01d"
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
message	string	否	message
data	object	否	data
fid	number
小数位数:0,最大长度:10	否	新建文件夹id 示例：0
title	string	否	文件夹名称
bid	number
小数位数:0,最大长度:10	否	父文件夹id 示例：0
parentPath	string	否	文件夹路径信息
tenantId	string	否	租户id
userId	string	否	用户id
orgId	string	否	组织id
pubts	string	否	创建时间

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"fid": 0,
		"title": "",
		"bid": 0,
		"parentPath": "",
		"tenantId": "",
		"userId": "",
		"orgId": "",
		"pubts": ""
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
返回参数 (11)
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

