# |<<

**文档设置 (ipm_bd_documentset / nc.vo.ipmbd.documentset.DocumentSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3169.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_documentset | 文档设置主键 | pk_documentset | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | code | 规则编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 规则名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | investattr | 投资属性 | investattr | varchar(50) |  | 投资属性-带基金 (InvesttypeWithFundEnum) |  | 1=固定资产投资; |