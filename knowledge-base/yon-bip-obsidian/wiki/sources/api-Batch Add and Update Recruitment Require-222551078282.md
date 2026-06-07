---
title: "招聘需求批量新增更新"
apiId: "2225510782822514694"
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

# 招聘需求批量新增更新

>  请求方式	POST | Job Requisition (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/recruit/batchSaveOrUpdateRecruit
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
code	string	否	是	招聘需求编码
name	string	否	是	招聘需求名称
recruitOrg	string	否	是	需求组织
recruitType	string	否	是	招聘类型
recruitYear	date
格式:yyyy-MM-dd	否	否	需求年度
begindate	date
格式:yyyy-MM-dd	否	否	需求开始日期
enddate	date
格式:yyyy-MM-dd	否	否	需求结束日期
principalId	string	否	否	负责人id
_status	string	否	是	招聘需求操作标识 示例："Insert":新增，"Update":更新
id	string	否	否	招聘需求id 示例：更新操作必填，新增操作不需要填写
recruitPostVO	object	是	是	招聘职位数据
code	string	否	是	职位编码
name	string	否	是	职位名称
orgId	string	否	是	需求组织id
recruitType	string	否	是	招聘类型id
recruitNum	number
小数位数:0,最大长度:10	否	是	招聘人数
keyNeedsNum	number
小数位数:0,最大长度:10	否	否	重点需求人数
aSchoolNeedsNum	number
小数位数:0,最大长度:10	否	否	一本需求人数
bSchoolNeedsNum	number
小数位数:0,最大长度:10	否	否	二本需求人数
cSchoolNeedsNum	number
小数位数:0,最大长度:10	否	否	三本需求人数
workStartTime	date
格式:yyyy-MM-dd	否	否	工作开始日
workEndTime	date
格式:yyyy-MM-dd	否	否	工作结束日
solidGoldMin	number
小数位数:0,最大长度:10	否	否	单金下限
solidGoldMax	number
小数位数:0,最大长度:10	否	否	单金上限
positionId	string	否	否	岗位ID
empFormId	string	否	否	用工形式ID
personCategoryId	string	否	否	员工类别ID
degreeId	string	否	否	学位ID
jobTypeId	string	否	否	职务类别ID
locationId	string	否	否	工作地点ID
jobduty	string	否	否	工作职责
expectedDate	date
格式:yyyy-MM-dd	否	否	期望到岗日期
foreignLanguageLevel	string	否	否	外语能力
workExperience	number
小数位数:0,最大长度:2	否	否	工作经验 示例："0":在读学生,"1":应届毕业生,"2":1年,"3":2年,"4":3年,"5":4年,"6":5年,"7":6年,"8":7年,"9":8年,"10":9年,"11":10年及以上
jobCategory	number
小数位数:0,最大长度:1	否	否	工作性质 示例："0":实习,"1":兼职,"2":全职
jobRequirement	string	否	否	任职要求
memo	string	否	否	备注
settlementCurrency	string	否	否	结算币种
salaryId	number
小数位数:0,最大长度:1	否	否	薪资类别 示例："0":月薪，“1”：年薪
salaryMin	number
小数位数:2,最大长度:10	否	否	最低薪资
salaryMax	number
小数位数:2,最大长度:10	否	否	最高薪资
jobId	string	否	否	所属职务ID
recruitDeptVO	object	是	否	需求部门数据
recruitJobrankVO	object	是	否	职级数据
recruitJobgradeVO	object	是	否	职等数据
recruitEducationVO	object	是	否	学历要求数据
recruitWorkAddressVO	object	是	否	工作地点-行政区划数据
recruitMajorVO	object	是	否	专业类别数据
_status	string	否	是	招聘职位数据操作标识 示例："Insert":新增，"Update":更新
id	string	否	否	招聘职位id 示例：更新操作必填，新增操作不需要填写

## 3. 请求示例

Url: /yonbip/hrcloud/recruit/batchSaveOrUpdateRecruit?access_token=访问令牌
Body: [{
	"code": "",
	"name": "",
	"recruitOrg": "",
	"recruitType": "",
	"recruitYear": "2026-06-07",
	"begindate": "2026-06-07",
	"enddate": "2026-06-07",
	"principalId": "",
	"_status": "\"Insert\":新增，\"Update\":更新",
	"id": "更新操作必填，新增操作不需要填写",
	"recruitPostVO": [
		{
			"code": "",
			"name": "",
			"orgId": "",
			"recruitType": "",
			"recruitNum": 0,
			"keyNeedsNum": 0,
			"aSchoolNeedsNum": 0,
			"bSchoolNeedsNum": 0,
			"cSchoolNeedsNum": 0,
			"workStartTime": "2026-06-07",
			"workEndTime": "2026-06-07",
			"solidGoldMin": 0,
			"solidGoldMax": 0,
			"positionId": "",
			"empFormId": "",
			"personCategoryId": "",
			"degreeId": "",
			"jobTypeId": "",
			"locationId": "",
			"jobduty": "",
			"expectedDate": "2026-06-07",
			"foreignLanguageLevel": "",
			"workExperience": NaN,
			"jobCategory": NaN,
			"jobRequirement": "",
			"memo": "",
			"settlementCurrency": "",
			"salaryId": NaN,
			"salaryMin": 0,
			"salaryMax": 0,
			"jobId": "",
			"recruitDeptVO": [
				{
					"deptId": "",
					"_status": "\"Insert\":新增，\"Delete\":删除",
					"id": "删除操作必填，新增操作不需要填写"
				}
			],
			"recruitJobrankVO": [
				{
					"jobrankId": "",
					"_status": "\"Insert\":新增，\"Delete\":删除",
					"id": "删除操作必填，新增操作不需要填写"
				}
			],
			"recruitJobgradeVO": [
				{
					"jobgradeId": "",
					"_status": "\"Insert\":新增，\"Delete\":删除",
					"id": "删除操作必填，新增操作不需要填写"
				}
			],
			"recruitEducationVO": [
				{
					"education": "",
					"_status": "\"Insert\":新增，\"Delete\":删除",
					"id": "删除操作必填，新增操作不需要填写"
				}
			],
			"recruitWorkAddressVO": [
				{
					"workAddress": "",
					"_status": "\"Insert\":新增，\"Delete\":删除",
					"id": "删除操作必填，新增操作不需要填写"
				}
			],
			"recruitMajorVO": [
				{
					"majorId": "",
					"_status": "",
					"id": "删除操作必填，新增操作不需要填写"
				}
			],
			"_status": "\"Insert\":新增，\"Update\":更新",
			"id": "更新操作必填，新增操作不需要填写"
		}
	]
}]

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

## 5. 正确返回示例

{
	"code": "200",
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

