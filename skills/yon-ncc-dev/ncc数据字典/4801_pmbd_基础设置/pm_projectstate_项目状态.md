# |<<

**项目状态 (pm_projectstate / nc.vo.pmbd.projectstate.ProjectStateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4516.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectstate | 项目状态主键 | pk_projectstate | char(20) | √ | 主键 (UFID) |
| 2 | state_code | 状态编码 | state_code | varchar(200) |  | 字符串 (String) |
| 3 | state_name | 状态名称 | state_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | state_sort | 状态分类 | state_sort | int |  | 状态分类 (statesort) |  | 1=立项; |