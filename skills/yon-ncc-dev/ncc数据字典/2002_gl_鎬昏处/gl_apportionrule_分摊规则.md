# |<<

**分摊规则 (gl_apportionrule / nc.vo.gl.apportion.ApportionRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2348.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apportionrule | 分摊规则标识 | pk_apportionrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_unit | 业务单元 | pk_unit | varchar(20) |  | 组织 (org) |
| 5 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 6 | code | 规则编码 | code | varchar(40) | √ | 字符串 (String) |
| 7 | name | 规则名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 8 | apportiontype | 分摊方式 | apportiontype | varchar(2) | √ | 分摊方式 (apportiontype) |  | 1=手工设置; |