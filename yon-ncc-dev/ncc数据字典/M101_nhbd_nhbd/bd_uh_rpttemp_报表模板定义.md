# |<<

**报表模板定义 (bd_uh_rpttemp / com.yonyou.yh.nhis.bd.rpt.vo.UhRpttempVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1103.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rpttemp | 主键 | pk_rpttemp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 字符串 (String) |
| 4 | code | 编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | dt_rpttype | 模板类型 | dt_rpttype | char(1) |  | 字符串 (String) |
| 7 | mnecode | 助记码 | mnecode | varchar(30) |  | 字符串 (String) |
| 8 | data_temp | 报表数据 | data_temp | image |  | BLOB (BLOB) |
| 9 | path_temp | 存放路径 | path_temp | varchar(256) |  | 字符串 (String) |
| 10 | sql_temp | 模板SQL | sql_temp | text(0) |  | BLOB (BLOB) |
| 11 | sql_order | sql排序条件 | sql_order | varchar(50) |  | 字符串 (String) |
| 12 | flag_replace | sql查询条件是否执行替换 | flag_replace | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | flag_sys | 系统标志 | flag_sys | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 16 | creator | 创建人 | creator | char(20) |  | 字符串 (String) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 最后修改人 | modifier | char(20) |  | 字符串 (String) |
| 19 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |