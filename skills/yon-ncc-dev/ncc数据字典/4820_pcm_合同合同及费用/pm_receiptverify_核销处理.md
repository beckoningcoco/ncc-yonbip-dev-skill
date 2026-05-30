# |<<

**核销处理 (pm_receiptverify / nc.vo.pcm.receiptverify.ReceiptVerifyHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4525.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiptverify | 核销处理主键 | pk_receiptverify | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | bill_code | 核销编号 | bill_code | varchar(50) |  | 字符串 (String) |
| 6 | bill_type | 单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 7 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |