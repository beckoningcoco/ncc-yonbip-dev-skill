# |<<

**医嘱用法 (bd_term_usage / com.yonyou.nhis.bd.pub2.srv.vo.TermUsageVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1010.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usage | 用法主键 | pk_usage | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_father | 上级编码 | pk_father | char(20) |  | 主键 (UFID) |
| 8 | dt_excardtype | 对应执行卡类型 | dt_excardtype | varchar(50) |  | 字符串 (String) |
| 9 | flag_pivas | 配液标志 | flag_pivas | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 12 | flag_st | 试敏 | flag_st | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |