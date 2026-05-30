# |<<

**组织职能映射关系 (org_funrelation / nc.vo.relation.FuncRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4072.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_func_relation | 关系主键 | pk_func_relation | char(20) | √ | 主键 (UFID) |
| 2 | function_id | 组织职能 | function_id | varchar(50) |  | 字符串 (String) |
| 3 | function_code | 职能编码 | function_code | varchar(50) |  | 字符串 (String) |
| 4 | function_name | 显示名称 | function_name | varchar(200) |  | 多语文本 (MultiLangText) |