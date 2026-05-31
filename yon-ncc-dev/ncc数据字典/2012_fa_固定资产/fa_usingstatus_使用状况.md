# |<<

**使用状况 (fa_usingstatus / nc.vo.fa.usingstatus.UsingStatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2070.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usingstatus | 使用状况主键 | pk_usingstatus | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | status_code | 使用状况编码 | status_code | varchar(40) |  | 字符串 (String) |
| 5 | status_name | 使用状况名称 | status_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 6 | statuslevel | 使用状况编码级次 | statuslevel | int |  | 整数 (Integer) |
| 7 | innercode | 内部编码 | innercode | varchar(60) |  | 字符串 (String) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |