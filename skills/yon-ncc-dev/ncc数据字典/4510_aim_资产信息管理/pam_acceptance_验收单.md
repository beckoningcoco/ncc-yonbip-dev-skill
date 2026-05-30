# |<<

**验收单 (pam_acceptance / nc.vo.aim.acceptance.AcceptanceHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4210.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_acceptance | 验收单主键 | pk_acceptance | char(20) | √ | 主键 (UFID) |
| 2 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 3 | check_opinion | 审批意见 | check_opinion | varchar(200) |  | 字符串 (String) |
| 4 | accept_opinion | 验收结论 | accept_opinion | varchar(200) |  | 字符串 (String) |
| 5 | audittime | 审批时间 | audittime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | auditor | 审批人 | auditor | varchar(20) |  | 用户 (user) |
| 7 | pk_recorder | 经办人 | pk_recorder | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | acceptpositon | 验收地点 | acceptpositon | varchar(1000) |  | 字符串 (String) |
| 9 | pk_supplier | 供货单位 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | acceptdate | 验收日期 | acceptdate | char(19) |  | 日期 (UFDate) |
| 11 | bill_code | 验收单单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 12 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |