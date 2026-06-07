---
title: "查询租户员工信息"
apiId: "1157c73a49cb4843be9b64712aed1838"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Employee Information"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询租户员工信息

>  请求方式	GET | Employee Information (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/getStaffInfo
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
pageNum	int	query	否	分页Num    示例: 1
pageSize	int	query	否	分页Size    示例: 5

## 3. 请求示例

Url: /yonbip/hrcloud/getStaffInfo?access_token=访问令牌&pageNum=1&pageSize=5

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
data	object	否	data
content	object	是	content
pageable	object	否	分页信息
totalPages	long	否	总页数 示例：1706
totalElements	long	否	总数 示例：1706
last	boolean	否	尾页 示例：false
first	boolean	否	首页 示例：true
numberOfElements	long	否	当前页数 示例：1
sort	object	否	排序信息
size	long	否	size 示例：1
number	long	否	number 示例：0
empty	boolean	否	empty 示例：false

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"data": {
			"content": [
				{
					"code": "A000002",
					"name": "冰老虎",
					"sex": 0,
					"corpname": "A",
					"deptname": "ee测试部门名称",
					"psnclname": "A",
					"email": "111@qq.com",
					"mobile": "+1-1990611",
					"ss_staff_job_id": "2183717380133120",
					"bd_staffb_id": "1791723483648256",
					"user_id": "a0c46fa0-b0cd-431f-aba9-2735dffac738",
					"deptid": "1930264425878528",
					"orgid": "1775733611008256",
					"bd_staffb_enable": 1,
					"ss_staff_joba_endflag": 0,
					"ss_staff_jobb_jobgradeid": "1567875567898765",
					"postid": "167666648635734",
					"postname": "总裁",
					"jobid": "1567432899848823",
					"jobname": "管理",
					"ss_staff_jobb_enddate": "",
					"ss_staff_jobb_begindate": "1616256000000"
				}
			],
			"pageable": {
				"sort": {
					"sorted": "",
					"unsorted": "",
					"empty": true
				},
				"pageNumber": 0,
				"pageSize": 1,
				"offset": 0,
				"paged": true,
				"unpaged": false
			},
			"totalPages": 1706,
			"totalElements": 1706,
			"last": false,
			"first": true,
			"numberOfElements": 1,
			"sort": {
				"sorted": false,
				"unsorted": true,
				"empty": true
			},
			"size": 1,
			"number": 0,
			"empty": false
		}
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
500	查询失败	

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

