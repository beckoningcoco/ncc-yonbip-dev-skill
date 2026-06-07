---
title: "收款日报详情查询"
apiId: "2183978758285819908"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Daily Collection Report"
domain: "RetailServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Collection Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款日报详情查询

>  请求方式	POST | Daily Collection Report (RetailServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/gatherdailyreport/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	零售日报id    示例: 2134228623200092169
code	string	query	否	零售日报单号    示例: TJD20241115000001

## 3. 请求示例

Url: /yonbip/sd/uretail/gatherdailyreport/detail?access_token=访问令牌&id=2134228623200092169&code=TJD20241115000001

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
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	数据集
currency_moneyDigit	number
小数位数:0,最大长度:10	否	币种金额精度 示例：2
code	string	否	收款日报编码 示例：RG000020250121000001
fundSettleStatus	number
小数位数:0,最大长度:10	否	资金状态(0:未处理,1:无需处理,2:处理成功,3:处理失败) 示例：0
gatherType	number
小数位数:0,最大长度:10	否	收款类型(0:普通收款,1:预订收款,10:周期配送收款,11:周期配送尾款,12:收款调整,13:付费会员,3:赊销收款,4:储值销售,5:卡券销售,6:合并收款,7:预订尾款,8:储值赊销收款,9:卡券赊销收款) 示例：0
iMemberid	number
小数位数:0,最大长度:10	否	会员id 示例：0
iPaytype	number
小数位数:0,最大长度:10	否	收款方式(1:现金,10:收钱吧,11:杉德支付,12:银商咨询预付卡,13:无硬件POS通,14:营销联盟,15:平安银行支付(刷卡),16:平安银行支付(扫码),17:兴业银行支付,18:储值卡,19:聚合支付(微信、支付宝扫码),2:银联卡,20:线上商城收款,21:卡券,22:银联商务B扫C,23:工商银行(刷卡),24:工商银行(扫码),26:工行移动支付,28:平安移动扫码支付,29:平安移动pos,3:支付宝,4:微信,43:工银澳门(聚合支付),5:会员钱包,50:农业银行,51:交通银行 示例：1
rmDailyReport_code	string	否	关联零售日报编码 示例：RL539620250121000001
fCardDisApportion	number
小数位数:2,最大长度:10	否	卡券折扣分摊额 示例：0
rmDailyReport	string	否	关联零售日报id 示例：2183741384155463685
gatheringDailyRepotrDetails	object	是	收款日报明细集合
fGatheringMoney	number
小数位数:2,最大长度:10	否	收款金额 示例：55
gatheringDailyReportDefineCharacter	object	否	自定义项特征组
store_name	string	否	门店名称 示例：存量测试门店
currency	string	否	币种id 示例：1748193698452604425
id	string	否	收款日报明细id 示例：2183741384155463694
pubts	string	否	时间戳 示例：2025-01-21 08:55:56
org_name	string	否	组织名称 示例：零售组织
financeOrgId	string	否	开票组织ID 示例：1748230583634886664
org	string	否	组织id 示例：1748230583634886664
busiDate	date
格式:yyyy-MM-dd HH:mm:ss	否	业务日期 示例：2025-01-21 00:00:00
financeOrgId_name	string	否	开票组织 示例：零售组织
dept_name	string	否	部门 示例：零售部门
store	string	否	门店id 示例：1975876348671950849
dept	string	否	部门id 示例：1748230884282597376
vouchDate	date
格式:yyyy-MM-dd HH:mm:ss	否	单据日期 示例：2025-01-21 08:55:56
status	number
小数位数:0,最大长度:10	否	单据状态(0:未审核,1:已审核,2:已关闭) 示例：0
traceId	string	否	线索id 示例：aab4f5a504f2afc7

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"currency_moneyDigit": 2,
		"code": "RG000020250121000001",
		"fundSettleStatus": 0,
		"gatherType": 0,
		"iMemberid": 0,
		"iPaytype": 1,
		"rmDailyReport_code": "RL539620250121000001",
		"fCardDisApportion": 0,
		"rmDailyReport": "2183741384155463685",
		"gatheringDailyRepotrDetails": [
			{
				"fCardDisApportion": 0,
				"iPaymentid": "1748194342712904762",
				"fGatheringMoney": 55,
				"isPresell": 0,
				"iPaymentid_name": "现金2",
				"gatheringDailyReport": "2183741384155463694",
				"id": "2183741384155463695"
			}
		],
		"fGatheringMoney": 55,
		"gatheringDailyReportDefineCharacter": {
			"ytenant": "0000LIV5L9915D6J9E0000",
			"id": "2183741384155463696",
			"pubts": "2025-01-21 08:55:57"
		},
		"store_name": "存量测试门店",
		"currency": "1748193698452604425",
		"id": "2183741384155463694",
		"pubts": "2025-01-21 08:55:56",
		"org_name": "零售组织",
		"financeOrgId": "1748230583634886664",
		"org": "1748230583634886664",
		"busiDate": "2025-01-21 00:00:00",
		"financeOrgId_name": "零售组织",
		"dept_name": "零售部门",
		"store": "1975876348671950849",
		"dept": "1748230884282597376",
		"vouchDate": "2025-01-21 08:55:56",
		"status": 0
	},
	"traceId": "aab4f5a504f2afc7"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
code	999	未知服务异常

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

