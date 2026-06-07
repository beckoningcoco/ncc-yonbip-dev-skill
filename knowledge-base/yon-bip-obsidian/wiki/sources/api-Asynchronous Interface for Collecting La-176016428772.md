---
title: "财务数据大文件采集异步接口"
apiId: "1760164287720456192"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 财务数据大文件采集异步接口

>  请求方式	POST | Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxreturn/api/large/async/upload
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
nsrsbh	string	否	否	税号，与组织编码择一必填 示例：012345678555666
scqqlsh	string	否	是	上传数据请求流水号 示例：111
filePath	string	否	是	云存储路径：支持obs、yms方式，支持大文 件存储 示例：obs://2022-10-08/ffece64ae4b0a71394a45321.zip
downLoadUrl	string	否	否	http下载路径 示例：http://www.aaa.com/a.zip
orgcode	string	否	否	组织编码，与税号择一必填 示例：1
version	string	否	否	财务数据版本:2010 2025 示例：2010 默认值：2010
format	string	否	否	财务数据上传格式:XML、JSON 示例：XML 默认值：XML

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxreturn/api/large/async/upload?access_token=访问令牌
Body: {
	"nsrsbh": "012345678555666",
	"scqqlsh": "111",
	"filePath": "obs://2022-10-08/ffece64ae4b0a71394a45321.zip",
	"downLoadUrl": "http://www.aaa.com/a.zip",
	"orgcode": "1",
	"version": "2010",
	"format": "XML"
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
1001	参数异常	根据具体返回信息调整数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-04	
新增
请求参数 version
新增
请求参数 format
财务数据采集支持新版24589

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

