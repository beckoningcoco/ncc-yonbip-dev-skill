# |<<

**工单优先级 (ewm_priority / nc.vo.am.wopriority.WoPriorityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1950.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priority | 工单优先级标识 | pk_priority | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | prior_code | 编码 | prior_code | varchar(40) |  | 字符串 (String) |
| 4 | prior_name | 名称 | prior_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 5 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |