# |<<

**账簿初始化 (fa_initaccbook / nc.vo.fa.initaccbook.InitAccbookHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2026.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initaccbook | 主键 | pk_initaccbook | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) | HI |
| 6 | pk_accbookfrom | 来源账簿 | pk_accbookfrom | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 7 | pk_accbookto | 目的账簿 | pk_accbookto | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 8 | accperiodto | 目的会计期间 | accperiodto | varchar(50) |  | 字符串 (String) |
| 9 | card_flag | 导入卡片属性 | card_flag | int |  | 导入卡片属性 (enum) |  | 0=在役卡片; |