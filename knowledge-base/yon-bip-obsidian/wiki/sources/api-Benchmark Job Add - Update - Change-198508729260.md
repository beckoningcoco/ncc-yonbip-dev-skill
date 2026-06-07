---
title: "基准职位新增|更新|变更"
apiId: "1985087292603105286"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Benchmark Job"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Benchmark Job]
platform_version: "BIP"
source_type: community-api-docs
---

# 基准职位新增|更新|变更

>  请求方式	POST | Benchmark Job (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/basepost/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	是	编码，时间轴租户，变更和编辑时，编码不允许修改 示例：BP000098
name	string	否	是	名称 示例：基准职位0001
orgId	string	否	是	所属组织，id或者编码 示例：111223445566
effectiveDate	date
格式:yyyy-MM-dd	否	否	生效日期，非时间轴租户必填 示例：2024-04-08
id	string	否	否	主键，新增时不填，更新时必填，时间轴变更时必填
postSequenceId	string	否	否	职位序列id或者编码 示例：1985031131585052675
jobtype_id	string	否	否	职务类别id或者编码 示例：1915968109021233157
job_id	string	否	否	所属职务id或者编码 示例：1936168912155049985
majorId	string	否	否	专业类别id或者编码 示例：1898954214536118731
jobDuty	string	否	否	工作职责 示例：开发，测试
enable	number
小数位数:0,最大长度:1	否	是	启用状态，1启用 0停用 示例：1
jobgrade_id	string	否	否	职级id或者编码 示例：1936167632267378688
minrank_id	string	否	否	最低职等id或者编码 示例：1936168001621983237
maxrank_id	string	否	否	最高职等id或者编码 示例：1936167958684893186
education	string	否	否	最低学历要求id或者编码 示例：11a5da9f-6b74-4e0d-acfa-b5b29f0a5d11
degree	string	否	否	最低学位要求id或者编码 示例：3f7a192e-725c-44f6-a353-e416b6a36159
jobTitle	string	否	否	最低职称要求id或者编码 示例：1898954214536118439
workExperience	string	否	否	工作经验要求 示例：勤劳努力
workYear	string	否	否	最低工作年限 示例：5年
age	string	否	否	年龄要求 示例：30岁
other	string	否	否	其他要求 示例：需要
_status	string	否	是	操作标识，Insert新增 Update更新，时间轴租户Insert新增|变更，Update更新 示例：Insert
starttime	date
格式:yyyy-MM-dd	否	否	生效日期,时间轴租户新增和变更时，该字段必填 示例：2024-04-28
vid	string	否	否	时间轴租户主键，非时间轴租户不填，时间轴租户更新|变更时必填，新增不填
description	string	否	否	变更说明，非时间轴租户不填，时间轴租户变更时填写 示例：变更11

## 3. 请求示例

Url: /yonbip/hrcloud/basepost/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "BP000098",
		"name": "基准职位0001",
		"orgId": "111223445566",
		"effectiveDate": "2024-04-08",
		"id": "",
		"postSequenceId": "1985031131585052675",
		"jobtype_id": "1915968109021233157",
		"job_id": "1936168912155049985",
		"majorId": "1898954214536118731",
		"jobDuty": "开发，测试",
		"enable": 1,
		"jobgrade_id": "1936167632267378688",
		"minrank_id": "1936168001621983237",
		"maxrank_id": "1936167958684893186",
		"education": "11a5da9f-6b74-4e0d-acfa-b5b29f0a5d11",
		"degree": "3f7a192e-725c-44f6-a353-e416b6a36159",
		"jobTitle": "1898954214536118439",
		"workExperience": "勤劳努力",
		"workYear": "5年",
		"age": "30岁",
		"other": "需要",
		"_status": "Insert",
		"starttime": "2024-04-28",
		"vid": "",
		"description": "变更11"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
code	string	否	code 示例：BP000098
name	string	否	name 示例：zcm0001101
postSequenceId	string	否	postSequenceId 示例：1985031131585052675
jobtype_id	string	否	jobtype_id 示例：1915968109021233157
job_id	string	否	job_id 示例：1936168912155049985
majorId	string	否	majorId 示例：1898954214536118731
jobDuty	string	否	jobDuty 示例：12324343
effectiveDate	string	否	effectiveDate 示例：2024-04-28 00:00:00
enable	string	否	enable 示例：1
jobgrade_id	string	否	jobgrade_id 示例：1936167632267378688
minrank_id	string	否	minrank_id 示例：1936168001621983237
maxrank_id	string	否	maxrank_id 示例：1936167958684893186
education	string	否	education 示例：11a5da9f-6b74-4e0d-acfa-b5b29f0a5d11
degree	string	否	degree 示例：3f7a192e-725c-44f6-a353-e416b6a36159
jobTitle	string	否	jobTitle 示例：1898954214536118439
workExperience	string	否	workExperience 示例：6565656765
workYear	string	否	workYear 示例：12312312
age	string	否	age 示例：234234324
other	string	否	other 示例：464565465454
starttime	string	否	starttime 示例：2024-04-28 00:00:00
endtime	string	否	endtime 示例：9999-12-31 00:00:00
vid	string	否	vid 示例：1985035581171171336
id	string	否	id 示例：1985035581171171336
description	string	否	description 示例：新增档案

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "BP000098",
		"name": "zcm0001101",
		"postSequenceId": "1985031131585052675",
		"jobtype_id": "1915968109021233157",
		"job_id": "1936168912155049985",
		"majorId": "1898954214536118731",
		"jobDuty": "12324343",
		"effectiveDate": "2024-04-28 00:00:00",
		"enable": "1",
		"jobgrade_id": "1936167632267378688",
		"minrank_id": "1936168001621983237",
		"maxrank_id": "1936167958684893186",
		"education": "11a5da9f-6b74-4e0d-acfa-b5b29f0a5d11",
		"degree": "3f7a192e-725c-44f6-a353-e416b6a36159",
		"jobTitle": "1898954214536118439",
		"workExperience": "6565656765",
		"workYear": "12312312",
		"age": "234234324",
		"other": "464565465454",
		"starttime": "2024-04-28 00:00:00",
		"endtime": "9999-12-31 00:00:00",
		"vid": "1985035581171171336",
		"id": "1985035581171171336",
		"description": "新增档案"
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
999	操作失败	

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

