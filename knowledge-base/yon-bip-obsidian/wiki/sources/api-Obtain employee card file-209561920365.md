---
title: "获取员工卡片文件"
apiId: "2095619203659726854"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Card Settings"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Card Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取员工卡片文件

>  请求方式	GET | Card Settings (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/staffcard/file
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
staffId	string	query	否	员工主键，目前仅支持一个员工主键，与员工编码可二选一传值但最少有一个值不为空
staffCode	string	query	否	员工编码，目前仅支持一个员工员工编码，与员工主键可二选一传值但最少有一个值不为空
templateId	string	query	否	员工卡片模板主键，与员工卡片模板编码可二选一传值，如果都不传值则查询默认模板
templateCode	string	query	否	员工卡片模板编码，与员工卡片模板主键可二选一传值，如果都不传值则查询默认模板
isWord	number
小数位数:0,最大长度:1	query	否	是否是word文件    示例: 1：Word文件；0：PDF文件    默认值: 0
logonStaffId	string	query	否	当前登录人员工主键，供文字水印和查询默认模板跟据登陆人权限过滤时使用，可与当前登录人用户主键二选一，如果文本水印中没有员工相关字段信息，可不填
logonUserId	string	query	否	当前登录人用户主键，供文字水印和查询默认模板跟据登陆人权限过滤时使用，可与当前登录人员工主键二选一，如果文本水印中没有员工相关字段信息，可不填

## 3. 请求示例

Url: /yonbip/hrcloud/staffcard/file?access_token=访问令牌&staffId=&staffCode=&templateId=&templateCode=&isWord=1%EF%BC%9AWord%E6%96%87%E4%BB%B6%EF%BC%9B0%EF%BC%9APDF%E6%96%87%E4%BB%B6&logonStaffId=&logonUserId=

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
code	string	否	状态码
message	string	否	提示信息
data	object	否	文件数据，key是员工主键，value是文件地址

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {}
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
	1	2025-03-04	
更新
请求参数 (4)
修改描述信息

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

