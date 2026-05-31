# |<<

**坏账计提规则 (arap_bdprovisionrule / nccloud.vo.arap.bdprovisionrule.BdProVisionRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/161.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdprovisionrule | 主键 | pk_bdprovisionrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | code | 规则编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 规则名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | provisiontype | 计提方式 | provisiontype | int |  | 计提方式 (provisionTypeEnum) |  | 0=销货百分比法; |