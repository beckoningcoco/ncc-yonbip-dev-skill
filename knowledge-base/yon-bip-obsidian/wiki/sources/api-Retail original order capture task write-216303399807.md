---
title: "商超原单抓单任务回写"
apiId: "2163033998070120457"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supermarket Order Original Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supermarket Order Original Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 商超原单抓单任务回写

>  请求方式	POST | Supermarket Order Original Document (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/api/ka/callBackAfterNotifyRpaFetchTask
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
sysCode	string	否	是	系统编码 示例：7fresh
captureAccount	string	否	是	抓单账号 示例：daily00002
orderStartDate	string	否	否	订货开始日期 示例：2024-12-25
orderEndDate	string	否	否	订货结束日期 示例：2024-12-26
scOrderNo	string	否	否	商超订单号 示例：order202412250001
espOrderNo	string	否	否	ESP订单号 示例：esp202412250001
tenantCode	string	否	否	租户Code 示例：0000LE5BRMHJ0DA77O0000
execStatus	string	否	否	执行结果状态，成功EXEC_SUCCESS，失败为EXEC_FAIL 示例：EXEC_SUCCESS
execMsg	string	否	否	执行结果信息 示例：执行成功
name	string	否	否	任务名称 示例：益禾堂订单下载
uniqueNo	string	否	否	唯一标识 示例：uniqueNo0001
billType	string	否	否	单据类型 示例：KAPurchaseDoc
serviceCode	string	否	否	单据服务编码 示例：ka_order_orig

## 3. 请求示例

Url: /yonbip/sd/api/ka/callBackAfterNotifyRpaFetchTask?access_token=访问令牌
Body: {
	"sysCode": "7fresh",
	"captureAccount": "daily00002",
	"orderStartDate": "2024-12-25",
	"orderEndDate": "2024-12-26",
	"scOrderNo": "order202412250001",
	"espOrderNo": "esp202412250001",
	"tenantCode": "0000LE5BRMHJ0DA77O0000",
	"execStatus": "EXEC_SUCCESS",
	"execMsg": "执行成功",
	"name": "益禾堂订单下载",
	"uniqueNo": "uniqueNo0001",
	"billType": "KAPurchaseDoc",
	"serviceCode": "ka_order_orig"
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
code	number
小数位数:0,最大长度:12	否	状态码 示例：200
message	string	否	状态信息 示例：success
uniqueNo	string	否	唯一标识 示例：uniqueNo001

## 5. 正确返回示例

{
	"code": 200,
	"message": "success",
	"uniqueNo": "uniqueNo001"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	响应结果错误	响应结果错误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-13	
新增
返回参数 kaVendorCode
新增
返回参数 kaVendorName
添加供应商字段
	2	2025-12-08	
更新
返回参数 (4)
修改API分类

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

