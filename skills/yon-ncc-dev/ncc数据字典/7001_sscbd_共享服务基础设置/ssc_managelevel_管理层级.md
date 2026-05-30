# |<<

**管理层级 (ssc_managelevel / nc.vo.ssc.task.laderule.SSCManageLevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5520.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_managelevel | 主键 | pk_managelevel | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_共享服务中心 (sscorg) |
| 5 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 6 | id | 管理层级ID | id | varchar(50) |  | 字符串 (String) |
| 7 | priority | 优先级 | priority | int |  | 整数 (Integer) |
| 8 | parentaccessor | 上级ID获取器 | parentaccessor | varchar(200) |  | 字符串 (String) |