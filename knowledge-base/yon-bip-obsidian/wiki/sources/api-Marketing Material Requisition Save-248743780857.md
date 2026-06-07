---
title: "营销物料申领保存"
apiId: "2487437808575184900"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Marketing Material Application"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Marketing Material Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 营销物料申领保存

>  请求方式	POST | Marketing Material Application (CRM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/MCC/MarketingMaterialApplication/save
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
org	string	否	是	销售组织 示例：1567050111173263368
bustype	string	否	是	交易类型 示例：2054084267070717958
code	string	否	否	申请单号 示例：2026030600048
dept	string	否	否	所属部门 示例：1567051571443269632
saleArea	string	否	否	销售区域 示例：1970977362848776195
customer	string	否	否	客户 示例：1570239459373350917
applyReason	string	否	否	申请原因 示例：测试申请原因
remarks	string	否	否	备注 示例：测试备注
applyTime	string	否	是	申请时间 示例：2026-03-06 00:00:00
creatorId	string	否	否	创建人ID 示例：1567063219403489282
creator	string	否	否	创建人 示例：昵称-李亚苹
createTime	string	否	否	创建时间 示例：2026-03-06 10:10:47
stockOrgId	string	否	否	库存组织 示例：1567050111173263368
stockId	string	否	否	仓库 示例：1585753860525785093
isWfControlled	boolean	否	否	是否工作流控制 示例：false 默认值：false
terminalAssetsDefineCharacter	object	否	否	营销物料申领自定义项
terminalAssetsDetail	object	是	是	营销物料详情
_status	string	否	是	保存类型 Insert:新增 Update:更新 示例：Insert
proposer	string	否	是	申请人 示例：1567062987461099521
applyDept	string	否	否	申请部门 示例：1567051571443269632
applyArea	string	否	否	申请区域 示例：1970977362848776195
id	string	否	否	营销物料申领单id 示例：2054084267070717958

## 3. 请求示例

Url: /yonbip/MCC/MarketingMaterialApplication/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"org": "1567050111173263368",
		"bustype": "2054084267070717958",
		"code": "2026030600048",
		"dept": "1567051571443269632",
		"saleArea": "1970977362848776195",
		"customer": "1570239459373350917",
		"applyReason": "测试申请原因",
		"remarks": "测试备注",
		"applyTime": "2026-03-06 00:00:00",
		"creatorId": "1567063219403489282",
		"creator": "昵称-李亚苹",
		"createTime": "2026-03-06 10:10:47",
		"stockOrgId": "1567050111173263368",
		"stockId": "1585753860525785093",
		"isWfControlled": false,
		"terminalAssetsDefineCharacter": {},
		"terminalAssetsDetail": [
			{
				"customer": "1570239459373350917",
				"terminal": "2032602739022233607",
				"product": "1570762363075821574",
				"quantity": "10",
				"attachmentId": "ec81a4e8-e2a6-4fe3-a0af-54055a487f11",
				"terminalAssetsDetailDefineCharacter": {},
				"_status": "Insert",
				"id": ""
			}
		],
		"_status": "Insert",
		"proposer": "1567062987461099521",
		"applyDept": "1567051571443269632",
		"applyArea": "1970977362848776195",
		"id": "2054084267070717958"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	number
小数位数:0,最大长度:3	否	状态码 示例：200
message	string	否	消息 示例：操作成功
traceId	string	否	追踪ID 示例：efcbff3010d19cff
uploadable	string	否	可上传标识 示例：0
data	object	否	返回数据
id	string	否	主键ID 示例：2487332375713808392
code	string	否	申请单号 示例：2026030600048
bustype	string	否	交易类型ID 示例：2054084267070717958
bustype_name	string	否	交易类型名称 示例：测试加号123
org	string	否	销售组织ID 示例：1567050111173263368
org_code	string	否	销售组织编码 示例：JT01
org_name	string	否	销售组织名称 示例：集团
ower	string	否	负责人ID 示例：1567062987461099521
ower_name	string	否	负责人 示例：李亚苹
applyTime	string	否	申请时间 示例：2026-03-06 00:00:00
dept	string	否	所属部门ID 示例：1567051571443269632
dept_code	string	否	部门编码 示例：XG01
dept_name	string	否	部门名称 示例：销管一部
saleArea	string	否	销售区域ID 示例：1970977362848776195
saleArea_code	string	否	销售区域编码 示例：001
saleArea_name	string	否	销售区域名称 示例：yg测试
customer	string	否	客户ID 示例：1570239459373350917
customer_name	string	否	客户名称 示例：客户001
applyReason	string	否	申请原因 示例：测试申请原因
remarks	string	否	备注 示例：测试备注
verifystate	number
小数位数:0,最大长度:1	否	审批状态(0:待审批,1:已审批,2:已驳回) 示例：0 默认值：0
isWfControlled	boolean	否	是否工作流控制 示例：false 默认值：false
creatorId	string	否	创建人ID 示例：1567063219403489282
creator	string	否	创建人姓名 示例：昵称-李亚苹
createTime	string	否	创建时间 示例：2026-03-06 10:19:59
createDate	string	否	创建日期 示例：2026-03-06 10:19:59
bustype_extend	string	否	交易类型扩展信息(JSON) 示例：{"isStockManage":"false","innerStoreAllocation":"false","isAutoIssue":"false"}
stockOrgId	string	否	库存组织ID 示例：1567050111173263368
stockOrgId_name	string	否	库存组织名称 示例：集团
stockId	string	否	仓库ID 示例：1585753860525785093
stockName	string	否	仓库名称 示例：仓库1
proposer	string	否	申请人ID 示例：1567062987461099521
applyDept	string	否	申请部门ID 示例：1567051571443269632
applyArea	string	否	申请区域ID 示例：1970977362848776195
pubts	string	否	更新时间戳 示例：2026-03-06 10:20:00
tenant	number
小数位数:0,最大长度:16	否	租户ID 示例：2988880100563408
ytenant	string	否	租户标识 示例：0000L96F5SJC5IY8770000
yTenantId	string	否	租户ID 示例：0000L96F5SJC5IY8770000
terminalAssetsDefineCharacter	object	否	营销物料申领自定义项
terminalAssetsDetail	object	是	营销物料详情列表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"traceId": "efcbff3010d19cff",
	"uploadable": "0",
	"data": {
		"id": "2487332375713808392",
		"code": "2026030600048",
		"bustype": "2054084267070717958",
		"bustype_name": "测试加号123",
		"org": "1567050111173263368",
		"org_code": "JT01",
		"org_name": "集团",
		"ower": "1567062987461099521",
		"ower_name": "李亚苹",
		"applyTime": "2026-03-06 00:00:00",
		"dept": "1567051571443269632",
		"dept_code": "XG01",
		"dept_name": "销管一部",
		"saleArea": "1970977362848776195",
		"saleArea_code": "001",
		"saleArea_name": "yg测试",
		"customer": "1570239459373350917",
		"customer_name": "客户001",
		"applyReason": "测试申请原因",
		"remarks": "测试备注",
		"verifystate": 0,
		"isWfControlled": false,
		"creatorId": "1567063219403489282",
		"creator": "昵称-李亚苹",
		"createTime": "2026-03-06 10:19:59",
		"createDate": "2026-03-06 10:19:59",
		"bustype_extend": "{\"isStockManage\":\"false\",\"innerStoreAllocation\":\"false\",\"isAutoIssue\":\"false\"}",
		"stockOrgId": "1567050111173263368",
		"stockOrgId_name": "集团",
		"stockId": "1585753860525785093",
		"stockName": "仓库1",
		"proposer": "1567062987461099521",
		"applyDept": "1567051571443269632",
		"applyArea": "1970977362848776195",
		"pubts": "2026-03-06 10:20:00",
		"tenant": 2988880100563408,
		"ytenant": "0000L96F5SJC5IY8770000",
		"yTenantId": "0000L96F5SJC5IY8770000",
		"terminalAssetsDefineCharacter": {
			"id": "2487332375713808395",
			"pubts": "2026-03-06 10:20:00.130",
			"ytenant": "0000L96F5SJC5IY8770000"
		},
		"terminalAssetsDetail": [
			{
				"id": "2487332375713808393",
				"terminalassetsId": "2487332375713808392",
				"customer": "1570239459373350917",
				"customer_name": "客户001",
				"customer_code": "00000000000001",
				"terminal": "2032602739022233607",
				"terminal_codebianma": "013120240701",
				"terminal_name": "zy0701001",
				"product": "1570762363075821574",
				"product_name": "物料22",
				"product_code": "新物料编码\t\t存货编码",
				"productMainUnit": "1567037191908491270",
				"productMainUnit_name": "小时",
				"quantity": 10,
				"attachmentId": "ec81a4e8-e2a6-4fe3-a0af-54055a487f11",
				"enclosure_tempObjectId": "defda98f-8d20-495d-9dc3-53508a8715f3",
				"ttt_id": "rowId_347",
				"hasDefaultInit": true,
				"pubts": "2026-03-06 10:20:00.131",
				"tenant": 2988880100563408,
				"ytenant": "0000L96F5SJC5IY8770000",
				"yTenantId": "0000L96F5SJC5IY8770000",
				"terminalAssetsDetailDefineCharacter": {
					"id": "2487332375713808394",
					"pubts": "2026-03-06 10:20:00.131",
					"ytenant": "0000L96F5SJC5IY8770000"
				}
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

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

