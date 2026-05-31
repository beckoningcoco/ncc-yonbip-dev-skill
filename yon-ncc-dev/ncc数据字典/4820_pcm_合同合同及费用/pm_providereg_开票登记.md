# |<<

**开票登记 (pm_providereg / nc.vo.pcm.provideregister.ProvideRegisterHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4519.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_providereg | 开票登记主键 | pk_providereg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | src_pk_transitype | 来源交易类型主键 | src_pk_transitype | varchar(50) |  | 字符串 (String) |
| 6 | src_transi_type | 来源交易类型 | src_transi_type | varchar(50) |  | 字符串 (String) |
| 7 | src_bill_type | 来源单据类型 | src_bill_type | varchar(50) |  | 字符串 (String) |
| 8 | src_bill_code | 来源单据编码 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 9 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(50) |  | 字符串 (String) |
| 10 | bill_code | 单据编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 11 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |