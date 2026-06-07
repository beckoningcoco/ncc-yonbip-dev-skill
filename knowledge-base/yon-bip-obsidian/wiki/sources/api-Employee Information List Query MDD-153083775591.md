---
title: "员工信息列表查询MDD"
apiId: "1530837755915927552"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Information"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工信息列表查询MDD

>  请求方式	POST | Employee Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/staff/listmdd
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
pageIndex	int	否	是	页号 示例：1 默认值：1
pageSize	int	否	是	每页行数 示例：10 默认值：10
code	string	否	否	编码 示例：00001
name	string	否	否	名称 示例：张三
mobile	string	否	否	手机号 示例：+86-18345768974
email	string	否	否	邮箱 示例：24356477@qq.com
orgId	string	否	否	任职组织ID或组织编码 示例：45654323456
deptId	string	否	否	部门ID或部门编码 示例：34567654334567
enable	int	否	否	员工状态（0:未启用，1启用，2停用） 示例：1
simple	object	否	否	扩展查询
pubts	string	否	否	查询大于等于该时间戳的数据 示例：2022-08-26 11:31:40

## 3. 请求示例

Url: /yonbip/hrcloud/staff/listmdd?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "00001",
	"name": "张三",
	"mobile": "+86-18345768974",
	"email": "24356477@qq.com",
	"orgId": "45654323456",
	"deptId": "34567654334567",
	"enable": 1,
	"simple": {
		"pubts": "2022-08-26 11:31:40"
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
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	编码 示例：200表示成功
message	string	否	说明 示例：操作成功
data	object	否	返回数据
pageCount	string	否	总页数 示例：100
pageSIze	int	否	每页行数 示例：默认值 10
recordCount	int	否	总数 示例：1000
recordList	object	是	返回数据集合
beginPageIndex	int	否	开始页码（第一页） 示例：1
pageIndex	int	否	当前页数 示例：默认值：1
endPageIndex	int	否	结束页码（有多少页） 示例：50

## 5. 正确返回示例

{
	"code": "200表示成功",
	"message": "操作成功",
	"data": {
		"pageCount": "100",
		"pageSIze": NaN,
		"recordCount": 1000,
		"recordList": [
			{
				"dr": "0",
				"ordernumber": 9999999,
				"user_id": "3456787654345678",
				"dept_id": "24543456765445",
				"email": "12345434@qq.com",
				"id": "23443234543234",
				"name": "张三",
				"pubts": "格式为:yyyy-MM-dd HH:mm:ss",
				"mobile": "18346578965",
				"org_id": "2345434543223443",
				"enable": 1,
				"enddate": "没有任职结束时间则不展示",
				"code": "3454323454345654",
				"org_id_name": "组织",
				"dept_id_name": "部门",
				"sex": 1,
				"staffJob_deptPath": "BIP/人力云",
				"staffJob_orgPath": "BIP",
				"modifiedtime": "2023-11-20 14:57:02",
				"psnclName": "自有员工",
				"psnclId": "3454323454345654"
			}
		],
		"beginPageIndex": 1,
		"pageIndex": NaN,
		"endPageIndex": 50
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

