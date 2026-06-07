---
title: "异构对接单保存并提交"
apiId: "e150988beee045cbad3f4e00d89fb600"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Heterogeneous Interconnection Document"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Heterogeneous Interconnection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 异构对接单保存并提交

> `ContentType	application/json` 请求方式	POST | 分类: Heterogeneous Interconnection Document (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/dockingorder/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 单据数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| bizUnit | string | 否 | 是 | 业务单元编码 示例：bizuint1 |
| code | string | 否 | 是 | 单据编号 示例：261X2021092900XX |
| transType | string | 否 | 是 | 交易类型编码 示例：NCC_TYBXD |
| vouchdate | string | 否 | 是 | 单据日期 示例：2022-03-28 00:00:00 |
| billMaker | string | 否 | 是 | 提单人姓名 示例：张三 |
| billId | string | 否 | 是 | 异构系统单据id 示例：1001ZG100000000014GG |
| sourceSystem | string | 否 | 是 | 注册业务系统编码 示例：NCC |
| billData | string | 否 | 否 | 来源单据数据, JSON字符串 |
| defines | object | 否 | 否 | 自由自定义项（1-60） |

## 3. 请求示例

Url: /yonbip/ssc/dockingorder/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"bizUnit": "bizuint1",
		"code": "261X2021092900XX",
		"transType": "NCC_TYBXD",
		"vouchdate": "2022-03-28 00:00:00",
		"billMaker": "张三",
		"billId": "1001ZG100000000014GG",
		"sourceSystem": "NCC",
		"billData": "",
		"defines": {
			"define1": "自由自定义项1"
		}
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| bizUnit | string | 否 | 业务单元id 示例：2673627186484224 |
| code | string | 否 | 单据编号 示例：261X2021092900111 |
| transType | string | 否 | 交易类型id 示例：1415777488851697664 |
| vouchdate | string | 否 | 单据日期 示例：2022-03-28 00:00:00 |
| billMaker | string | 否 | 提单人 示例：张三1 |
| billId | string | 否 | 来源系统单据id 示例：1451435664605184002 |
| sourceSystem | string | 否 | 注册业务系统id 示例：1451370879328976899 |
| billData | string | 否 | 来源系统单据数据，JSON字符串 |
| isWfControlled | boolean | 否 | 是否被审批流控制，true：已被审批流控制，false：未被审批流控制 示例：true |
| verifystate | long | 否 | 审批状态，0：待提交，1：审批中，2：审批完成，3：不通过流程终止，4：驳回到制单 示例：0 |
| returncount | long | 否 | 退回次数 示例：0 |
| status | long | 否 | 单据状态，0：待提交，1：审批完成，2：已关闭，3：审批中，4：锁定 示例：0 |
| id | string | 否 | 单据id 示例：2714641218605568 |
| creator | string | 否 | 创建人 示例：00 |
| creatorId | long | 否 | 创建人id 示例：2642607388260864 |
| createTime | string | 否 | 创建时间 示例：2022-04-02 16:35:51 |
| createDate | string | 否 | 创建日期 示例：2022-04-02 16:35:51 |
| modifier | string | 否 | 修改人 示例：00 |
| modifierId | long | 否 | 修改人id 示例：2642607388260864 |
| modifyTime | string | 否 | 修改时间 示例：2022-04-02 16:35:51 |
| modifyDate | string | 否 | 修改日期 示例：2022-04-02 16:35:51 |
| pubts | string | 否 | 时间戳 示例：2022-04-02 16:35:52 |
| tenant | long | 否 | 租户id 示例：2642143614636288 |
| ytenant | string | 否 | 租户id 示例：0000KZGF6CFMDGGMXK0000 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"bizUnit": "2673627186484224",
		"code": "261X2021092900111",
		"transType": "1415777488851697664",
		"vouchdate": "2022-03-28 00:00:00",
		"billMaker": "张三1",
		"billId": "1451435664605184002",
		"sourceSystem": "1451370879328976899",
		"billData": "",
		"isWfControlled": true,
		"verifystate": 0,
		"returncount": 0,
		"status": 0,
		"id": "2714641218605568",
		"creator": "00",
		"creatorId": 2642607388260864,
		"createTime": "2022-04-02 16:35:51",
		"createDate": "2022-04-02 16:35:51",
		"modifier": "00",
		"modifierId": 2642607388260864,
		"modifyTime": "2022-04-02 16:35:51",
		"modifyDate": "2022-04-02 16:35:51",
		"pubts": "2022-04-02 16:35:52",
		"tenant": 2642143614636288,
		"ytenant": "0000KZGF6CFMDGGMXK0000"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023000500036	服务端逻辑异常	请联系系统管理员

1023020400087	1.未找到流程定义! 2.活动上找不到用户	审批流错误信息

1023020400088	非待提交状态，无法正常提交单据

1023020400089	未匹配到注册业务系统，请检查

1023020400090	注册业务系统已被停用，请启用后再同步数据

1023020400091	非待提交状态，不允许更新单据数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-10-09

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

