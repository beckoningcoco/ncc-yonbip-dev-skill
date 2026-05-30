# |<<

**医技预约黑名单 (uh_ex_med_black_list / com.yonyou.yh.nhis.sch.med.vo.MedBlackListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6080.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_medblacklist | 黑名单主键 | pk_medblacklist | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_pati | 患者主键 | pk_pati | varchar(50) |  | 字符串 (String) |
| 5 | limit_days | 限制预约天数 | limit_days | int |  | 整数 (Integer) |
| 6 | limit_start_date | 限制预约开始日期 | limit_start_date | varchar(50) |  | 字符串 (String) |
| 7 | limit_end_date | 限制预约结束日期 | limit_end_date | varchar(50) |  | 字符串 (String) |
| 8 | blacklist_status | 黑名单状态 | blacklist_status | int |  | 整数 (Integer) |
| 9 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 10 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 11 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 12 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 13 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 14 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 15 | def6 | 自定义项6 | def6 | varchar(50) |  | 字符串 (String) |
| 16 | def7 | 自定义项7 | def7 | varchar(50) |  | 字符串 (String) |
| 17 | def8 | 自定义项8 | def8 | varchar(50) |  | 字符串 (String) |
| 18 | def9 | 自定义项9 | def9 | varchar(50) |  | 字符串 (String) |
| 19 | def10 | 自定义项10 | def10 | varchar(50) |  | 字符串 (String) |
| 20 | def11 | 自定义项11 | def11 | varchar(50) |  | 字符串 (String) |
| 21 | def12 | 自定义项12 | def12 | varchar(50) |  | 字符串 (String) |
| 22 | def13 | 自定义项13 | def13 | varchar(50) |  | 字符串 (String) |
| 23 | def14 | 自定义项14 | def14 | varchar(50) |  | 字符串 (String) |
| 24 | def15 | 自定义项15 | def15 | varchar(50) |  | 字符串 (String) |
| 25 | def16 | 自定义项16 | def16 | varchar(50) |  | 字符串 (String) |
| 26 | def17 | 自定义项17 | def17 | varchar(50) |  | 字符串 (String) |
| 27 | def18 | 自定义项18 | def18 | varchar(50) |  | 字符串 (String) |
| 28 | def19 | 自定义项19 | def19 | varchar(50) |  | 字符串 (String) |
| 29 | def20 | 自定义项20 | def20 | varchar(50) |  | 字符串 (String) |
| 30 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 31 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 32 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 33 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |