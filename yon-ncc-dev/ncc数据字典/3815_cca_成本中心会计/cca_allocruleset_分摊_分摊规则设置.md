# |<<

**分摊_分摊规则设置 (cca_allocruleset / nc.vo.cca.rulescheme.allocruleset.AllocRuleSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1272.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allocruleset | 主键 | pk_allocruleset | char(20) | √ | 主键 (UFID) |
| 2 | code | 规则编码 | code | varchar(200) |  | 字符串 (String) |
| 3 | name | 规则名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | vname | 版本名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 8 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 9 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 10 | pk_controlarea | 管控范围 | pk_controlarea | varchar(20) |  | 管控范围 (controlarea) |
| 11 | pk_vid | 版本主键 | pk_vid | varchar(50) |  | 字符串 (String) |
| 12 | pk_accchart | 科目表 | pk_accchart | varchar(20) |  | 科目表 (accchart) |
| 13 | pk_factorchart | 要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 14 | pk_origin | 原始方案主键 | pk_origin | varchar(50) |  | 字符串 (String) |
| 15 | alloccontent | 分摊内容 | alloccontent | int |  | 分摊内容 (alloccontent) |  | 0=金额; |