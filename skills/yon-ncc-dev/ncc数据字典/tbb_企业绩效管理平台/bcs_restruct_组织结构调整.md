# |<<

**组织结构调整 (bcs_restruct / nc.vo.bcs.restruct.RestructInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/282.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | pk_entity_temp | 临时主体 | pk_entity_temp | varchar(36) | √ | 组织 (org) |
| 3 | pk_entity_front | 被处置或注销的主体 | pk_entity_front | varchar(36) |  | 组织 (org) |
| 4 | pk_hbscheme | 合并方案 | pk_hbscheme | varchar(20) | √ | 业务合并方案 (bcs_hbscheme) |
| 5 | pk_curr | 币种 | pk_curr | varchar(20) |  | 币种 (currtype) |
| 6 | isedit | 是否可编辑 | isedit | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | predate | 期间 | predate | varchar(50) |  | 字符串 (String) |
| 8 | startdate | 组织体系版本生效日期 | startdate | char(19) |  | 日期 (UFDate) |
| 9 | targetperiods | 目标期间 | targetperiods | varchar(200) |  | 字符串 (String) |
| 10 | exeperiods | 执行期间 | exeperiods | varchar(200) |  | 字符串 (String) |
| 11 | pk_sheets | 表单范围 | pk_sheets | image |  | BLOB (BLOB) |
| 12 | canmodifier | 取消执行用户 | canmodifier | varchar(20) |  | 用户 (user) |
| 13 | canmodifiedtime | 取消执行时间 | canmodifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | key1 | 关键字1 | key1 | varchar(50) |  | 字符串 (String) |
| 15 | key2 | 关键字2 | key2 | varchar(50) |  | 字符串 (String) |
| 16 | key3 | 关键字3 | key3 | varchar(50) |  | 字符串 (String) |
| 17 | key4 | 关键字4 | key4 | varchar(50) |  | 字符串 (String) |
| 18 | key5 | 关键字5 | key5 | varchar(50) |  | 字符串 (String) |
| 19 | key6 | 关键字6 | key6 | varchar(50) |  | 字符串 (String) |
| 20 | key7 | 关键字7 | key7 | varchar(50) |  | 字符串 (String) |
| 21 | key8 | 关键字8 | key8 | varchar(50) |  | 字符串 (String) |
| 22 | key9 | 关键字9 | key9 | varchar(50) |  | 字符串 (String) |
| 23 | key10 | 关键字10 | key10 | varchar(50) |  | 字符串 (String) |
| 24 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 25 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 26 | modifier | 执行用户 | modifier | varchar(20) |  | 用户 (user) |
| 27 | modifiedtime | 执行时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |