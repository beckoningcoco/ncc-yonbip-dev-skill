# |<<

**编制分类 (om_budget_type / nc.vo.hrp.budgetset.BudgetTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3927.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget_type | 主健 | pk_budget_type | char(20) | √ | 主键 (UFID) |
| 2 | typecode | 编制分类编码 | typecode | varchar(20) |  | 字符串 (String) |
| 3 | typename | 编制分类名称 | typename | varchar(128) |  | 字符串 (String) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | tabname | 对应表名 | tabname | varchar(128) |  | 字符串 (String) |
| 7 | fldname | 对应字段名 | fldname | varchar(128) |  | 字符串 (String) |
| 8 | refmodel | 参照类型 | refmodel | varchar(200) |  | 字符串 (String) |
| 9 | remark | 备注 | remark | varchar(512) |  | 字符串 (String) |
| 10 | resfolder | 资源文件夹 | resfolder | varchar(512) |  | 字符串 (String) |
| 11 | resid | 资源ID | resid | varchar(200) |  | 字符串 (String) |