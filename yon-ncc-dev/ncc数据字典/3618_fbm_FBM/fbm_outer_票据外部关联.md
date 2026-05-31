# |<<

**票据外部关联 (fbm_outer / nc.vo.fbm.outer.OuterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2141.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_outer | 主键 | pk_outer | char(20) | √ | 主键 (UFID) |
| 2 | pk_busibill | 业务单据主键 | pk_busibill | char(20) |  | 主键 (UFID) |
| 3 | pk_billtypecode | 业务单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 4 | pk_outerbill_h | 外部单据主表主键 | pk_outerbill_h | char(20) |  | 主键 (UFID) |
| 5 | pk_outerbill_b | 外部单据子表主键 | pk_outerbill_b | char(20) |  | 主键 (UFID) |
| 6 | outerdjdl | 外部单据大类 | outerdjdl | varchar(30) |  | 字符串 (String) |
| 7 | outerbilltype | 外部单据类型 | outerbilltype | varchar(30) |  | 字符串 (String) |
| 8 | outerstatus | 外部单据状态 | outerstatus | varchar(50) |  | 字符串 (String) |
| 9 | pk_register | 登记单主键 | pk_register | char(20) |  | 主键 (UFID) |
| 10 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 13 | usesystem | 占用系统 | usesystem | varchar(50) |  | 字符串 (String) |
| 14 | pk_supplier | 供应商主键 | pk_supplier | varchar(50) |  | 字符串 (String) |
| 15 | pk_settle_h | 结算信息主表主键 | pk_settle_h | varchar(20) |  | 字符串 (String) |
| 16 | pk_settle_b | 结算信息子表主键 | pk_settle_b | varchar(20) |  | 字符串 (String) |