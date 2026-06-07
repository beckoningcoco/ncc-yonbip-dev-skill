---
title: "表单数据查询"
apiId: "1568047316761837569"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Approval"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Approval]
platform_version: "BIP"
source_type: community-api-docs
---

# 表单数据查询

>  请求方式	POST | Approval (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/openapi/iform/queryIFormDatas
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pkBo	string	否	是	表单模型主键 示例：18d20b2f4fd2418889f67821768d8102
pkBoinsList	string	是	否	数据主键集合，查询多条数据时传入pk_boins数组 示例：["8a99ef93f05040c18e0205990942f186"]
pkBoins	string	否	否	数据主键，查询单条数据时传入（pk_boins） 示例：8a99ef93f05040c18e0205990942f186
iformUserId	string	否	是	用户友互通userId 示例：d2769a9a-e1e5-4775-b1da-907e666b46b3
appSource	string	否	否	表单应用租户标识（diwork环节需要传，ec.diwork环节不用传） 示例：approve
start	long	否	否	分页起始记录索引 示例：0 默认值：0
size	long	否	否	分页查询记录数 示例：1000 默认值：1000
paramMap	object	否	是	请求扩展参数
includeSubForm	boolean	否	否	是否包含查询子表数据 示例：true 默认值：true
includeRefData	boolean	否	否	是否查询关联字段值 示例：true 默认值：true
includeFormModel	boolean	否	否	是否包含表单模型设计信息 示例：true 默认值：false
andQueryConditions	object	是	否	控件过滤条件，条件组合（并）的逻辑生效
columnCode	string	否	否	过滤控件的columnCode 示例：ts
columnValue	string	否	否	过滤控件的过滤值内容 示例：2022-10-14 12:25:49
queryOperator	string	否	否	过滤规则(Equal-全等，Like-模糊匹配，NotLike-模糊不匹配，In-包含，More-大于，Less-小于，MoreAndEqual-大于等于，LessAndEqual-小于等于) 示例：MoreAndEqual
orQueryConditions	object	是	否	控件过滤条件，条件组合（或）的逻辑生效
columnCode	string	否	否	过滤控件的columnCode 示例：createuser
columnValue	string	否	否	过滤控件的过滤值内容 示例：d2769a9a-e1e5-4775-b1da-907e666b46b3
queryOperator	string	否	否	过滤规则(Equal-全等，Like-模糊匹配，NotLike-模糊不匹配，In-包含，More-大于，Less-小于，MoreAndEqual-大于等于，LessAndEqual-小于等于) 示例：Equal
queryOperator	string	否	否	条件组合规则（使用orQueryConditions时和其它条件组的组合规则）Or-逻辑或，And-逻辑与 示例：Or 默认值：And

## 3. 请求示例

Url: /yonbip/uspace/openapi/iform/queryIFormDatas?access_token=访问令牌
Body: {
	"pkBo": "18d20b2f4fd2418889f67821768d8102",
	"pkBoinsList": [
		"8a99ef93f05040c18e0205990942f186"
	],
	"pkBoins": "8a99ef93f05040c18e0205990942f186",
	"iformUserId": "d2769a9a-e1e5-4775-b1da-907e666b46b3",
	"appSource": "approve",
	"start": 0,
	"size": 1000,
	"paramMap": {
		"includeSubForm": true,
		"includeRefData": true,
		"includeFormModel": true
	},
	"andQueryConditions": [
		{
			"columnCode": "ts",
			"columnValue": "2022-10-14 12:25:49",
			"queryOperator": "MoreAndEqual"
		}
	],
	"orQueryConditions": [
		{
			"columnCode": "createuser",
			"columnValue": "d2769a9a-e1e5-4775-b1da-907e666b46b3",
			"queryOperator": "Equal"
		}
	],
	"queryOperator": "Or"
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
code	long	否	接口返回状态（200成功，负责接口异常） 示例：200
message	string	否	接口调用返回信息
data	object	否	接口返回数据对象
data	object	是	表单查询数据对象
total	long	否	总记录数 示例：2
start	long	否	分页查询记录起始索引 示例：0
size	long	否	分页查询记录条数 示例：1
errcode	long	否	错误状态码 示例：0
errmsg	string	否	错误信息描述 示例：ok
form	object	否	表单模型信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {
		"data": [
			{
				"wb_1665721450216162": "测试api查询表单数据2",
				"1c60baee74de46dda1470d697c50816d": [
					{
						"ytenant_id": "ddok9sw4",
						"xm_1665721450218514": "刘备",
						"nl_1665721450218652": "54",
						"pk": "4e7873cbb4af40d7b8ac4f50d0ffcd58_1",
						"version": 1,
						"pk_boins": "4e7873cbb4af40d7b8ac4f50d0ffcd58",
						"dr": 1,
						"ts": "2022-10-14 14:34:36"
					}
				],
				"yprk_1665721450217558": "299874dd51e74b0fa1bd37fbe298d8ef",
				"createuser": "d2769a9a-e1e5-4775-b1da-907e666b46b3",
				"version": 1,
				"pk_boins": "4e7873cbb4af40d7b8ac4f50d0ffcd58",
				"dr": 0,
				"khdz_1665721450218943_showValue": "北京昌平区沙河",
				"ytenant_id": "ddok9sw4",
				"yprk_1665721450217558_showValue": "北京用友产业园",
				"khdz_1665721450218943": "北京昌平区沙河##1463873288621522949",
				"pk_procdef": "processKey:1:d1e67da4-305c-11eb-8477-f663f978a02b",
				"pk_procdefins": "4638a254-4b8a-11ed-9885-fadae610db72",
				"pk_temp": "93f8100949804bcfb1e10869308d7ba9",
				"sysversion": 0,
				"startdept": "2026315703718144",
				"startorg": "2019609293689088",
				"ms_1665721450217126": "测试表单里的描述控件2",
				"status": "end",
				"ts": "2022-10-14 14:34:36"
			}
		],
		"total": 2,
		"start": 0,
		"size": 1,
		"errcode": 0,
		"errmsg": "ok",
		"form": {
			"errcode": 0,
			"errmsg": "ok",
			"id": "18d20b2f4fd2418889f67821768d8102",
			"tenantId": "ddok9sw4_approve",
			"revision": 1,
			"pkBo": "18d20b2f4fd2418889f67821768d8102",
			"boName": "api查询数据",
			"boName2": "api查询数据",
			"pkBotype": "b1e8a88550c042fe85e5fe1e9dda23b3",
			"boTablename": "iform_ddok9sw4_approve_apicxsj",
			"publishedrefer": false,
			"pkTemp": "93f8100949804bcfb1e10869308d7ba9",
			"pkForm": "iform_ddok9sw4_approve_apicxsj",
			"jsontemp": "{\"formLayout\":{\"layoutDetail\":\"{\\\"layoutDetail\\\":[{\\\"fieldId\\\":\\\"20221014122057CUn2AhqtFb\\\",\\\"title\\\":\\\"文本\\\",\\\"componentKey\\\":\\\"Text\\\",\\\"invisible\\\":false,\\\"editable\\\":\\\"\\\",\\\"complexCal\\\":\\\"\\\",\\\"complexTrueVal\\\":\\\"\\\",\\\"numberFields\\\":\\\"\\\",\\\"complexCalRelateField\\\":[],\\\"numberFieldArr\\\":[],\\\"textAlign\\\":\\\"\\\",\\\"isReadonly\\\":false,\\\"contentTextAlign\\\":\\\"left\\\",\\\"inLeft\\\":false,\\\"flexibleTitle\\\":false,\\\"crux\\\":false,\\\"hideTitle\\\":false,\\\"hideTopTitle\\\":false,\\\"required\\\":false,\\\"mainTableField\\\":\\\"\\\",\\\"visible\\\":true,\\\"isOperationRule\\\":false,\\\"showOperValueInGird\\\":true,\\\"rowCount\\\":true,\\\"rowCountUnique\\\":false,\\\"isTotal\\\":false,\\\"average\\\":false,\\\"maxInGird\\\":false,\\\"minInGird\\\":false,\\\"calculate\\\":false,\\\"calType\\\":\\\"2\\\",\\\"size\\\":\\\"large\\\",\\\"borderColor\\\":\\\"\\\",\\\"titleBold\\\":false,\\\"titleUnderline\\\":false,\\\"titleFontColor\\\":\\\"\\\",\\\"titleFontFamily\\\":\\\"\\\",\\\"titleFontSize\\\":\\\"\\\",\\\"tips\\\":\\\"\\\",\\\"margin\\\":\\\"\\\",\\\"uniqueCheck\\\":false,\\\"isTextArea\\\":false,\\\"defaultValue\\\":\\\"\\\",\\\"uniqueCheckText\\\":\\\"\\\",\\\"columncode\\\":\\\"wb_1665721450216162\\\"},{\\\"fieldId\\\":\\\"2022101412210796qGP8M3em\\\",\\\"title\\\":\\\"描述\\\",\\\"componentKey\\\":\\\"Text\\\",\\\"invisible\\\":false,\\\"editable\\\":\\\"\\\",\\\"complexCal\\\":\\\"\\\",\\\"complexTrueVal\\\":\\\"\\\",\\\"numberFields\\\":\\\"\\\",\\\"complexCalRelateField\\\":[],\\\"numberFieldArr\\\":[],\\\"textAlign\\\":\\\"\\\",\\\"isReadonly\\\":false,\\\"contentTextAlign\\\":\\\"left\\\",\\\"inLeft\\\":false,\\\"flexibleTitle\\\":false,\\\"crux\\\":false,\\\"hideTitle\\\":false,\\\"hideTopTitle\\\":false,\\\"required\\\":false,\\\"mainTableField\\\":\\\"\\\",\\\"visible\\\":true,\\\"isOperationRule\\\":false,\\\"showOperValueInGird\\\":true,\\\"rowCount\\\":true,\\\"rowCountUnique\\\":false,\\\"isTotal\\\":false,\\\"average\\\":false,\\\"maxInGird\\\":false,\\\"minInGird\\\":false,\\\"calculate\\\":false,\\\"calType\\\":\\\"2\\\",\\\"size\\\":\\\"large\\\",\\\"borderColor\\\":\\\"\\\",\\\"titleBold\\\":false,\\\"titleUnderline\\\":false,\\\"titleFontColor\\\":\\\"\\\",\\\"titleFontFamily\\\":\\\"\\\",\\\"titleFontSize\\\":\\\"\\\",\\\"tips\\\":\\\"\\\",\\\"margin\\\":\\\"10px 20px 10px 20px\\\",\\\"uniqueCheck\\\":false,\\\"isTextArea\\\":false,\\\"defaultValue\\\":\\\"\\\",\\\"uniqueCheckText\\\":\\\"\\\",\\\"columncode\\\":\\\"ms_1665721450217126\\\"},{\\\"fieldId\\\":\\\"20221014122113hrSDMSqVqR\\\",\\\"title\\\":\\\"用品入库\\\",\\\"componentKey\\\":\\\"Reference\\\",\\\"invisible\\\":false,\\\"editable\\\":\\\"\\\",\\\"complexCal\\\":\\\"\\\",\\\"complexTrueVal\\\":\\\"\\\",\\\"complexCalRelateField\\\":[],\\\"numberFieldArr\\\":[],\\\"textAlign\\\":\\\"\\\",\\\"isReadonly\\\":false,\\\"inLeft\\\":false,\\\"flexibleTitle\\\":false,\\\"crux\\\":false,\\\"hideTitle\\\":false,\\\"hideTopTitle\\\":false,\\\"required\\\":false,\\\"mainTableField\\\":\\\"\\\",\\\"visible\\\":true,\\\"isOperationRule\\\":false,\\\"showOperValueInGird\\\":true,\\\"rowCount\\\":true,\\\"rowCountUnique\\\":false,\\\"isTotal\\\":false,\\\"average\\\":false,\\\"maxInGird\\\":false,\\\"minInGird\\\":false,\\\"calculate\\\":false,\\\"calType\\\":\\\"2\\\",\\\"size\\\":\\\"large\\\",\\\"borderColor\\\":\\\"\\\",\\\"titleBold\\\":false,\\\"titleUnderline\\\":false,\\\"titleFontColor\\\":\\\"\\\",\\\"titleFontFamily\\\":\\\"\\\",\\\"titleFontSize\\\":\\\"\\\",\\\"tips\\\":\\\"\\\",\\\"margin\\\":\\\"10px 20px 10px 20px\\\",\\\"pk_bo\\\":\\\"18d20b2f4fd2418889f67821768d8102\\\",\\\"specUsers\\\":[],\\\"specDepts\\\":[],\\\"specUserGroups\\\":[],\\\"specPosts\\\":[],\\\"specDutys\\\":[],\\\"userDeptScope\\\":\\\"manual\\\",\\\"userDeptFields\\\":[],\\\"contMeta\\\":\\\"03654fbfdeb74f78a850ceeabec2ea14\\\",\\\"hasLinkage\\\":false,\\\"contMetaName\\\":\\\"用品入库\\\",\\\"contMetaOption\\\":{\\\"fieldIds\\\":[{\\\"name\\\":\\\"保管员\\\",\\\"fieldName\\\":\\\"保管员\\\",\\\"fieldId\\\":\\\"20180607183000ZHLDuCOfaB\\\"},{\\\"name\\\":\\\"入库日期\\\",\\\"fieldName\\\":\\\"入库日期\\\",\\\"fieldId\\\":\\\"20180607183040EmVNRuMm0f\\\"},{\\\"name\\\":\\\"采购员\\\",\\\"fieldName\\\":\\\"采购员\\\",\\\"fieldId\\\":\\\"20180607183101gHJD85GkxV\\\"},{\\\"name\\\":\\\"存放地点\\\",\\\"fieldName\\\":\\\"存放地点\\\",\\\"fieldId\\\":\\\"20180607183116fkvKfx88wy\\\"},{\\\"name\\\":\\\"入库类型\\\",\\\"fieldName\\\":\\\"入库类型\\\",\\\"fieldId\\\":\\\"20180607183148QcSWwxuK28\\\"}]},\\\"multiLinkage\\\":[{\\\"linkComp\\\":\\\"\\\",\\\"linkField\\\":\\\"\\\"}],\\\"isMutiSelect\\\":false,\\\"contMetaType\\\":\\\"user\\\",\\\"referDisplayFields\\\":[{\\\"name\\\":\\\"存放地点\\\",\\\"fieldName\\\":\\\"存放地点\\\",\\\"fieldId\\\":\\\"20180607183116fkvKfx88wy\\\"}],\\\"relatedToSubTable\\\":\\\"\\\",\\\"isLinked\\\":false,\\\"curSubTable\\\":\\\"\\\",\\\"subFormLinkType\\\":\\\"fill\\\",\\\"subTableDisplayFields\\\":[],\\\"subTableFields\\\":[],\\\"isAllDataRange\\\":true,\\\"isPartDataRange\\\":false,\\\"dataRange_dept\\\":\\\"\\\",\\\"dataRange_deptName\\\":\\\"\\\",\\\"dataRange_notReleted\\\":\\\"0\\\",\\\"dataRange_source\\\":\\\"mine\\\",\\\"dataRange_specUserGroups\\\":[],\\\"dataRange_status\\\":\\\"end\\\",\\\"isSetDefaultValue\\\":\\\"\\\",\\\"defaultType\\\":\\\"\\\",\\\"defaultVal\\\":\\\"[{\\\\\\\"trueValue\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"showValue\\\\\\\":\\\\\\\"\\\\\\\"}]\\\",\\\"default_email_field\\\":\\\"\\\",\\\"default_phone_field\\\":\\\"\\\",\\\"defualt_user_fieldId\\\":\\\"\\\",\\\"ptRange\\\":[\\\"1\\\",\\\"2\\\",\\\"3\\\"],\\\"ptStatus\\\":[\\\"1\\\",\\\"5\\\"],\\\"filterRulesTriggerFields\\\":[],\\\"autoFillTriggerFields\\\":[],\\\"filterRulesTrueValue\\\":\\\"\\\",\\\"filterRulesShowValue\\\":\\\"\\\",\\\"filterRulesRebuild\\\":[{\\\"children\\\":[{\\\"id\\\":\\\"\\\",\\\"name\\\":\\\"\\\",\\\"formId\\\":\\\"\\\",\\\"field\\\":{\\\"type\\\":{\\\"name\\\":\\\"date\\\"}},\\\"left\\\":\\\"\\\",\\\"right\\\":\\\"\\\",\\\"type\\\":\\\"\\\",\\\"relationType\\\":\\\"and\\\",\\\"isLeaf\\\":true,\\\"children\\\":[]}],\\\"relationType\\\":\\\"and\\\"}],\\\"filterTrueValueStr\\\":\\\"\\\",\\\"splitable\\\":false,\\\"pubrefDisplayType\\\":\\\"0\\\",\\\"isReadOnly\\\":false,\\\"projectFieldId\\\":\\\"\\\",\\\"timeConfigs\\\":[{\\\"start\\\":\\\"\\\",\\\"end\\\":\\\"\\\",\\\"cause\\\":\\\"\\\",\\\"applier\\\":\\\"\\\",\\\"carrier\\\":\\\"\\\",\\\"controller\\\":\\\"\\\"}],\\\"couldScan\\\":false,\\\"formula\\\":\\\"\\\",\\\"columncode\\\":\\\"yprk_1665721450217558\\\"},{\\\"fieldId\\\":\\\"20221014122148ov1E1ML2e8\\\",\\\"title\\\":\\\"客户地址\\\",\\\"componentKey\\\":\\\"Reference\\\",\\\"invisible\\\":false,\\\"editable\\\":\\\"\\\",\\\"complexCal\\\":\\\"\\\",\\\"complexTrueVal\\\":\\\"\\\",\\\"complexCalRelateField\\\":[],\\\"numberFieldArr\\\":[],\\\"textAlign\\\":\\\"\\\",\\\"isReadonly\\\":false,\\\"inLeft\\\":false,\\\"flexibleTitle\\\":false,\\\"crux\\\":false,\\\"hideTitle\\\":false,\\\"hideTopTitle\\\":false,\\\"required\\\":false,\\\"mainTableField\\\":\\\"\\\",\\\"visible\\\":true,\\\"isOperationRule\\\":false,\\\"showOperValueInGird\\\":true,\\\"rowCount\\\":true,\\\"rowCountUnique\\\":false,\\\"isTotal\\\":false,\\\"average\\\":false,\\\"maxInGird\\\":false,\\\"minInGird\\\":false,\\\"calculate\\\":false,\\\"calType\\\":\\\"2\\\",\\\"size\\\":\\\"large\\\",\\\"borderColor\\\":\\\"\\\",\\\"titleBold\\\":false,\\\"titleUnderline\\\":false,\\\"titleFontColor\\\":\\\"\\\",\\\"titleFontFamily\\\":\\\"\\\",\\\"titleFontSize\\\":\\\"\\\",\\\"tips\\\":\\\"\\\",\\\"margin\\\":\\\"10px 20px 10px 20px\\\",\\\"pk_bo\\\":\\\"18d20b2f4fd2418889f67821768d8102\\\",\\\"specUsers\\\":[],\\\"specDepts\\\":[],\\\"specUserGroups\\\":[],\\\"specPosts\\\":[],\\\"specDutys\\\":[],\\\"userDeptScope\\\":\\\"manual\\\",\\\"userDeptFields\\\":[],\\\"contMeta\\\":\\\"U8CPUBREF_productcenter.aa_merchantaddressref\\\",\\\"hasLinkage\\\":false,\\\"contMetaName\\\":\\\"客户地址\\\",\\\"contMetaOption\\\":{\\\"fieldIds\\\":[{\\\"name\\\":\\\"主键ID\\\",\\\"fieldName\\\":\\\"主键ID\\\",\\\"fieldId\\\":\\\"id\\\"},{\\\"name\\\":\\\"地址编码\\\",\\\"fieldName\\\":\\\"地址编码\\\",\\\"fieldId\\\":\\\"addressCode\\\"},{\\\"name\\\":\\\"注册地区\\\",\\\"fieldName\\\":\\\"注册地区\\\",\\\"fieldId\\\":\\\"region\\\"},{\\\"name\\\":\\\"注册地区编码\\\",\\\"fieldName\\\":\\\"注册地区编码\\\",\\\"fieldId\\\":\\\"regionCode\\\"},{\\\"name\\\":\\\"详细地址\\\",\\\"fieldName\\\":\\\"详细地址\\\",\\\"fieldId\\\":\\\"address\\\"}]},\\\"multiLinkage\\\":[{\\\"linkComp\\\":\\\"\\\",\\\"linkField\\\":\\\"\\\"}],\\\"isMutiSelect\\\":false,\\\"contMetaType\\\":\\\"thirdref\\\",\\\"referDisplayFields\\\":[{\\\"name\\\":\\\"详细地址\\\",\\\"fieldName\\\":\\\"详细地址\\\",\\\"fieldId\\\":\\\"address\\\"}],\\\"relatedToSubTable\\\":\\\"\\\",\\\"isLinked\\\":false,\\\"curSubTable\\\":\\\"\\\",\\\"subFormLinkType\\\":\\\"fill\\\",\\\"subTableDisplayFields\\\":[],\\\"subTableFields\\\":[],\\\"isAllDataRange\\\":true,\\\"isPartDataRange\\\":false,\\\"dataRange_dept\\\":\\\"\\\",\\\"dataRange_deptName\\\":\\\"\\\",\\\"dataRange_notReleted\\\":\\\"0\\\",\\\"dataRange_source\\\":\\\"mine\\\",\\\"dataRange_specUserGroups\\\":[],\\\"dataRange_status\\\":\\\"end\\\",\\\"isSetDefaultValue\\\":\\\"\\\",\\\"defaultType\\\":\\\"\\\",\\\"defaultVal\\\":\\\"[{\\\\\\\"trueValue\\\\\\\":\\\\\\\"\\\\\\\",\\\\\\\"showValue\\\\\\\":\\\\\\\"\\\\\\\"}]\\\",\\\"default_email_field\\\":\\\"\\\",\\\"default_phone_field\\\":\\\"\\\",\\\"defualt_user_fieldId\\\":\\\"\\\",\\\"ptRange\\\":[\\\"1\\\",\\\"2\\\",\\\"3\\\"],\\\"ptStatus\\\":[\\\"1\\\",\\\"5\\\"],\\\"filterRulesTriggerFields\\\":[],\\\"autoFillTriggerFields\\\":[],\\\"filterRulesTrueValue\\\":\\\"\\\",\\\"filterRulesShowValue\\\":\\\"\\\",\\\"filterRulesRebuild\\\":[{\\\"children\\\":[{\\\"id\\\":\\\"\\\",\\\"name\\\":\\\"\\\",\\\"formId\\\":\\\"\\\",\\\"field\\\":{\\\"type\\\":{\\\"name\\\":\\\"date\\\"}},\\\"left\\\":\\\"\\\",\\\"right\\\":\\\"\\\",\\\"type\\\":\\\"\\\",\\\"relationType\\\":\\\"and\\\",\\\"isLeaf\\\":true,\\\"children\\\":[]}],\\\"relationType\\\":\\\"and\\\"}],\\\"filterTrueValueStr\\\":\\\"\\\",\\\"splitable\\\":false,\\\"pubrefDisplayType\\\":\\\"0\\\",\\\"isReadOnly\\\":false,\\\"projectFieldId\\\":\\\"\\\",\\\"timeConfigs\\\":[{\\\"start\\\":\\\"\\\",\\\"end\\\":\\\"\\\",\\\"cause\\\":\\\"\\\",\\\"applier\\\":\\\"\\\",\\\"carrier\\\":\\\"\\\",\\\"controller\\\":\\\"\\\"}],\\\"couldScan\\\":false,\\\"formula\\\":\\\"\\\",\\\"columncode\\\":\\\"khdz_1665721450218943\\\"},{\\\"fieldId\\\":\\\"20221014122401HMx1y4XnXp\\\",\\\"title\\\":\\\"明细子表1\\\",\\\"componentKey\\\":\\\"DataTable\\\",\\\"inputBorderColor\\\":\\\"\\\",\\\"invisible\\\":false,\\\"editable\\\":\\\"\\\",\\\"textAlign\\\":\\\"\\\",\\\"isReadonly\\\":false,\\\"inLeft\\\":false,\\\"flexibleTitle\\\":false,\\\"crux\\\":false,\\\"hideTitle\\\":false,\\\"hideTopTitle\\\":false,\\\"required\\\":false,\\\"mainTableField\\\":\\\"\\\",\\\"visible\\\":true,\\\"isOperationRule\\\":false,\\\"showOperValueInGird\\\":true,\\\"rowCount\\\":true,\\\"rowCountUnique\\\":false,\\\"isTotal\\\":false,\\\"average\\\":false,\\\"maxInGird\\\":false,\\\"minInGird\\\":false,\\\"size\\\":\\\"large\\\",\\\"borderColor\\\":\\\"\\\",\\\"titleBold\\\":false,\\\"titleUnderline\\\":false,\\\"titleFontColor\\\":\\\"\\\",\\\"titleFontFamily\\\":\\\"\\\",\\\"titleFontSize\\\":\\\"\\\",\\\"tips\\\":\\\"\\\",\\\"available\\\":true,\\\"borderWidth\\\":1,\\\"margin\\\":\\\"\\\",\\\"subTabletitleBold\\\":\\\"\\\",\\\"subTabletitleFontColor\\\":\\\"\\\",\\\"subTabletitleUnderline\\\":\\\"\\\",\\\"subTabletitleFontFamily\\\":\\\"\\\",\\\"subTabletextAlign\\\":\\\"\\\",\\\"subTabletitleFontSize\\\":\\\"\\\",\\\"subFormId\\\":\\\"20221014122401EpJrsdCOcy\\\",\\\"bodyBacColor\\\":\\\"\\\",\\\"bodyFontColor\\\":\\\"\\\",\\\"cwType\\\":\\\"cw_default\\\",\\\"defaultRows\\\":1,\\\"displayTitle\\\":\\\"序号\\\",\\\"headBacColor\\\":\\\"\\\",\\\"headFontColor\\\":\\\"\\\",\\\"isDisplayNo\\\":false,\\\"pk_sub_bo\\\":\\\"1c60baee74de46dda1470d697c50816d\\\",\\\"referToSubForm\\\":\\\"\\\",\\\"tableName\\\":\\\"iform_ddok9sw4_approve_apicxsj_1\\\",\\\"layoutDetail\\\":[{\\\"fieldId\\\":\\\"20221014122409CiXzqf6SYz\\\",\\\"title\\\":\\\"姓名\\\",\\\"componentKey\\\":\\\"Text\\\",\\\"invisible\\\":false,\\\"editable\\\":\\\"\\\",\\\"complexCal\\\":\\\"\\\",\\\"complexTrueVal\\\":\\\"\\\",\\\"numberFields\\\":\\\"\\\",\\\"complexCalRelateField\\\":[],\\\"numberFieldArr\\\":[],\\\"textAlign\\\":\\\"\\\",\\\"isReadonly\\\":false,\\\"contentTextAlign\\\":\\\"left\\\",\\\"inLeft\\\":false,\\\"flexibleTitle\\\":false,\\\"crux\\\":false,\\\"hideTitle\\\":false,\\\"hideTopTitle\\\":false,\\\"required\\\":false,\\\"mainTableField\\\":\\\"\\\",\\\"visible\\\":true,\\\"isOperationRule\\\":false,\\\"showOperValueInGird\\\":true,\\\"rowCount\\\":true,\\\"rowCountUnique\\\":false,\\\"isTotal\\\":false,\\\"average\\\":false,\\\"maxInGird\\\":false,\\\"minInGird\\\":false,\\\"calculate\\\":false,\\\"calType\\\":\\\"2\\\",\\\"size\\\":\\\"large\\\",\\\"borderColor\\\":\\\"\\\",\\\"titleBold\\\":false,\\\"titleUnderline\\\":false,\\\"titleFontColor\\\":\\\"\\\",\\\"titleFontFamily\\\":\\\"\\\",\\\"titleFontSize\\\":\\\"\\\",\\\"tips\\\":\\\"\\\",\\\"margin\\\":\\\"\\\",\\\"uniqueCheck\\\":false,\\\"isTextArea\\\":false,\\\"defaultValue\\\":\\\"\\\",\\\"uniqueCheckText\\\":\\\"\\\",\\\"subFormId\\\":\\\"20221014122401EpJrsdCOcy\\\",\\\"columncode\\\":\\\"xm_1665721450218514\\\",\\\"layoutDetail\\\":null},{\\\"fieldId\\\":\\\"20221014122411S1oWqDeEe6\\\",\\\"title\\\":\\\"年龄\\\",\\\"componentKey\\\":\\\"Text\\\",\\\"invisible\\\":false,\\\"editable\\\":\\\"\\\",\\\"complexCal\\\":\\\"\\\",\\\"complexTrueVal\\\":\\\"\\\",\\\"numberFields\\\":\\\"\\\",\\\"complexCalRelateField\\\":[],\\\"numberFieldArr\\\":[],\\\"textAlign\\\":\\\"\\\",\\\"isReadonly\\\":false,\\\"contentTextAlign\\\":\\\"left\\\",\\\"inLeft\\\":false,\\\"flexibleTitle\\\":false,\\\"crux\\\":false,\\\"hideTitle\\\":false,\\\"hideTopTitle\\\":false,\\\"required\\\":false,\\\"mainTableField\\\":\\\"\\\",\\\"visible\\\":true,\\\"isOperationRule\\\":false,\\\"showOperValueInGird\\\":true,\\\"rowCount\\\":true,\\\"rowCountUnique\\\":false,\\\"isTotal\\\":false,\\\"average\\\":false,\\\"maxInGird\\\":false,\\\"minInGird\\\":false,\\\"calculate\\\":false,\\\"calType\\\":\\\"2\\\",\\\"size\\\":\\\"large\\\",\\\"borderColor\\\":\\\"\\\",\\\"titleBold\\\":false,\\\"titleUnderline\\\":false,\\\"titleFontColor\\\":\\\"\\\",\\\"titleFontFamily\\\":\\\"\\\",\\\"titleFontSize\\\":\\\"\\\",\\\"tips\\\":\\\"\\\",\\\"margin\\\":\\\"10px 20px 10px 20px\\\",\\\"uniqueCheck\\\":false,\\\"isTextArea\\\":false,\\\"defaultValue\\\":\\\"\\\",\\\"uniqueCheckText\\\":\\\"\\\",\\\"subFormId\\\":\\\"20221014122401EpJrsdCOcy\\\",\\\"columncode\\\":\\\"nl_1665721450218652\\\",\\\"layoutDetail\\\":null}],\\\"colWidthArr\\\":[\\\"\\\",\\\"\\\"],\\\"emptyRowNotAllowed\\\":false}],\\\"index\\\":0,\\\"title\\\":\\\"\\\",\\\"order\\\":0,\\\"componentKey\\\":\\\"ColumnPanel\\\",\\\"size\\\":\\\"1\\\",\\\"titleFontSize\\\":\\\"\\\"}\"},\"form\":{\"source_pkBo\":\"18d20b2f4fd2418889f67821768d8102\",\"id\":\"18d20b2f4fd2418889f67821768d8102\",\"formStyle\":\"{\\\"titleFontFamily\\\":\\\"\\\",\\\"textAlign\\\":\\\"left\\\"}\",\"describe\":\"\",\"auth_userDuty\":[],\"auth_userGroup\":[],\"auth_userIds\":{},\"auth_userOrgIds\":[],\"auth_userOrganizationIds\":[],\"auth_userPost\":[],\"canSavePDF\":true,\"canWebPrint\":true,\"hideCopyPerson\":0,\"hideProcessAnnex\":0,\"showThankPage\":false,\"thankPageMessage\":\"感谢您的填写!\",\"customizedButtons\":\"[]\",\"processLauncher\":\"\",\"processDefId\":null,\"processDefName\":\"api查询数据\",\"ispublishedrefer\":\"0\",\"processAuthinfo\":{},\"isVerifyData\":false,\"forbidModify\":false,\"showlist\":\"0\",\"icon\":\"icon-1\",\"isMultiBPM\":false,\"multiProcess\":[],\"formBtnVal\":{},\"defaultComment\":{},\"isAdvancedFreeFlow\":false,\"dataPreset\":{},\"pk_botype\":\"b1e8a88550c042fe85e5fe1e9dda23b3\",\"BPMTabView\":\"HISTORY\",\"operator\":{\"tenant_id\":\"\",\"user_id\":\"\",\"id\":\"\"},\"name\":\"api查询数据\",\"title\":\"api查询数据\",\"sortIndex\":{}},\"enable\":true,\"processTitle\":[],\"processDefId\":null,\"version\":2,\"pk_bo\":\"18d20b2f4fd2418889f67821768d8102\"}",
			"enable": true,
			"enableVersion": 1,
			"uts": "2022-10-14 12:24:10",
			"versionId": 1
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
40211	表单模型在当前租户下不存在	确认正确的表单模型

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

