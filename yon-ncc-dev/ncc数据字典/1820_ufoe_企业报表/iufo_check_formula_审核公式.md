# |<<

**审核公式 (iufo_check_formula / nc.vo.iufo.check.CheckFormulaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3401.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_check_formula | 审核公式主键 | pk_check_formula | char(20) | √ | 主键 (UFID) |
| 2 | name | 审核公式名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | formula | 审核公式内容 | formula | varchar(1024) | √ | 字符串 (String) |
| 4 | note | 说明 | note | varchar(1024) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | sealflag | 封存标记 | sealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | usedflag | 启用标记 | usedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_check_schema | 审核方案主键 | pk_check_schema | char(20) | √ | 审核方案 (CheckSchemaVO) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |