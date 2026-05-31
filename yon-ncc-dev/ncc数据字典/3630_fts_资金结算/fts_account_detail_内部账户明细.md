# |<<

**内部账户明细 (fts_account_detail / nc.vo.fts.account.AccDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2297.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account_detail | 主键 | pk_account_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_ownerorg | 本方组织 | pk_ownerorg | varchar(20) |  | 组织 (org) |
| 3 | pk_ownerorg_v | 本方组织版本 | pk_ownerorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 4 | pk_account | 本方账户 | pk_account | varchar(20) |  | 内部账户 (bd_accid) |
| 5 | sourcesystem | 来源系统 | sourcesystem | varchar(50) |  | 来源系统 (enum) |  | FTS=资金结算; |