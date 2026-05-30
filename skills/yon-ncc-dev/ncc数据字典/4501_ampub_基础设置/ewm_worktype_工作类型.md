# |<<

**工作类型 (ewm_worktype / nc.vo.am.worktype.WorktypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1979.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_worktype | 工作类型标识 | pk_worktype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | worktype_code | 编码 | worktype_code | varchar(40) |  | 字符串 (String) |
| 6 | worktype_name | 名称 | worktype_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |