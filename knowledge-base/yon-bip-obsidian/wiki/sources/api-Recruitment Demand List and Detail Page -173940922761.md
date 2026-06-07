---
title: "招聘需求列表及详情页字段查询"
apiId: "1739409227615567873"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Requisition"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 招聘需求列表及详情页字段查询

>  请求方式	POST | Job Requisition (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/staffing/list_detail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	int	否	是	页号 默认值：1
pageSize	int	否	是	每页行数 默认值：20
name	string	否	否	需求名称 示例：zhangsa
result	string	否	否	发布状态"0" 未发布 "7"已发布 "9"部分发布 "13"取消发布 示例：0
billstate	string	否	否	需求状态：“1”未提交，“3”审批中，“4”审批通过，“10”已撤销，“12”已驳回，“13”终止，“14”关闭 示例：1
recruitYear	string	否	否	需求年度 示例：2023
scTime	DateTime	否	否	创建时间_开始时间
ecTime	DateTime	否	否	创建时间_结束时间
smTime	DateTime	否	否	修改时间_开始时间
emTime	DateTime	否	否	修改时间_结束时间

## 3. 请求示例

Url: /yonbip/hrcloud/staffing/list_detail?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"name": "zhangsa",
	"result": "0",
	"billstate": "1",
	"recruitYear": "2023",
	"scTime": "",
	"ecTime": "",
	"smTime": "",
	"emTime": ""
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
pageCount	int	否	总页数 示例：4
pageSize	int	否	每页记录数 示例：10
recordCount	int	否	总数 示例：45
recordList	object	是	返回数据集合

## 5. 正确返回示例

{
	"code": "200表示成功",
	"message": "操作成功",
	"data": {
		"pageCount": 4,
		"pageSize": 10,
		"recordCount": 45,
		"recordList": [
			{
				"applicantDeptId": "1567907549936615427",
				"applicantDeptName": "夸父",
				"applicantId": "1574499740610461703",
				"applicantIdName": "songyy",
				"applicantOrgId": "1567906544927899652",
				"applicantOrgName": "天宫",
				"billstate": 4,
				"code": "JR00000133",
				"createTime": "2023-04-11 11:15:31",
				"id": "1700660419218636805",
				"name": "0411社会招聘01",
				"pubts": "2023-04-14 14:09:41",
				"recruitNum": 11,
				"recruitOrg": "1524095688065417217",
				"recruitOrgName": "业务单元00-更正",
				"recruitType": "1524017992122762050",
				"recruitTypeName": "社会招聘",
				"recruitYear": "2019",
				"submitdate": "2023-04-11 11:15:31",
				"recruitPostVO": [
					{
						"code": "code00001",
						"createDate": "2023-02-17 00:00:00",
						"createTime": "2023-02-17 14:34:35",
						"creator": "张飒",
						"creatorId": "343345454545433",
						"enable": "0",
						"id": "1661427997417668609",
						"isDeleted": false,
						"name": "武打决赛",
						"orgId": "1525778851288317961",
						"postSource": 1,
						"pubts": "2023-02-17 14:34:36",
						"recruitId": "1661427997417668608",
						"recruitNum": 4,
						"recruitPostState": 1,
						"recruitType": "1525696834604892689",
						"orgIdName": "组织1",
						"salaryId": "0",
						"salaryMin": 233,
						"salaryMax": 34555,
						"recruitWorkAddressVO": [
							{
								"recruitPostId": "1711032455990870026",
								"workAddress": "bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
								"workAddressName": "北京"
							}
						],
						"recruitEducationVO": [
							{
								"education": "1733638775847780352",
								"recruitPostId": "1733346065246060549",
								"educationName": "本科"
							}
						],
						"recruitMajorVO": [
							{
								"majorId": "1685992367150596720",
								"majorIdName": "文学",
								"recruitPostId": "1733346065246060549"
							}
						],
						"recruitDeptVO": [
							{
								"deptIdName": "部门1",
								"recruitPostId": "1733346065246060549",
								"deptId": "1686001919164678151"
							}
						],
						"jobRequirement": "反反复复",
						"jobduty": "热热热",
						"positionId": "1656122639137112065",
						"positionIdName": "打铁",
						"empFormId": "43455",
						"empFormIdName": "合同制",
						"workExperience": "\"0\": \"在读学生\", \"1\": \"应届毕业生\", \"2\": \"1年\", \"3\": \"2年\", \"4\": \"3年\", \"5\": \"4年\", \"6\": \"5年\", \"7\": \"6年\", \"8\": \"7年\", \"9\": \"8年\", \"10\": \"9年\", \"11\": \"10年\"",
						"personCategoryId": "bc92c3146a26454c87ab8b109fc7d81a",
						"personCategoryIdName": "实习生",
						"locationId": "",
						"locationIdName": "上海",
						"jobTypeId": "1655610112099745799",
						"jobTypeIdName": "研发",
						"jobId": "1773694035999326215",
						"jobIdName": "市场调研",
						"foreignLanguageLevel": "",
						"degreeId": "1665888845018169352",
						"degreeIdName": "博士后"
					}
				]
			}
		]
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

