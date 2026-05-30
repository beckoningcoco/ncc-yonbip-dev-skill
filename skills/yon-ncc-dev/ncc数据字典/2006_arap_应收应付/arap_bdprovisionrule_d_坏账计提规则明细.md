# |<<

**坏账计提规则明细 (arap_bdprovisionrule_d / nccloud.vo.arap.bdprovisionrule.BdProvisionRuleDVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/162.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdprovisionrule_d | 主键 | pk_bdprovisionrule_d | char(20) | √ | 主键 (UFID) |
| 2 | pk_bdprovisionrule | 规则主键 | pk_bdprovisionrule | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | initperiod | 期初期间 | initperiod | varchar(50) |  | 字符串 (String) |
| 6 | enablestate | 启用标志 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |