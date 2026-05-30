# |<<

**年卡维护 (bd_uh_yearcard / nc.vo.nhbd.yearcard.DBYearCardVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1145.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_yearcard_id | 年卡主键 | pk_yearcard_id | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 年卡编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 年卡名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | yearcarddays | 天数 | yearcarddays | int |  | 整数 (Integer) |
| 7 | flag_active | 是否激活 | flag_active | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |