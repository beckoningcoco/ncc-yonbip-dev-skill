# |<<

**打印方案 (iufo_taskprintscheme / nc.vo.iufo.task.TaskPrintSchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3521.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskprintscheme | 主键 | pk_taskprintscheme | char(20) | √ | 主键 (UFID) |
| 2 | name | 打印方案名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | printset | 设置 | printset | varchar(1024) |  | 字符串 (String) |
| 4 | pk_task | 任务主键 | pk_task | varchar(50) |  | 字符串 (String) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | org | 组织 | org | varchar(50) |  | 字符串 (String) |
| 8 | printsetcontent | 打印设置内容 | printsetcontent | image |  | BLOB (BLOB) |
| 9 | defaultscheme | 默认打印方案 | defaultscheme | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | scheme_type | 方案类型 | scheme_type | int |  | 整数 (Integer) |
| 11 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |