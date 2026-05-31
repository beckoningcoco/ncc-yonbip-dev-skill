# |<<

**uh_rpt_report (uh_rpt_report / com.yonyou.yh.nhis.rpt.vo.RptReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6252.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_report | 主键 | pk_report | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | code | 编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | mnecode | 助记码 | mnecode | varchar(30) |  | 字符串 (String) |
| 7 | wbcode | 五笔码 | wbcode | varchar(30) |  | 字符串 (String) |
| 8 | othcode | 其他码 | othcode | varchar(30) |  | 字符串 (String) |
| 9 | report_data | 报表数据 | report_data | image |  | BLOB (BLOB) |
| 10 | report_sql | 报表sql | report_sql | varchar(50) |  | 字符串 (String) |
| 11 | name2 | 名称2 | name2 | varchar(50) |  | 字符串 (String) |
| 12 | name3 | 名称3 | name3 | varchar(50) |  | 字符串 (String) |
| 13 | name4 | 名称4 | name4 | varchar(50) |  | 字符串 (String) |
| 14 | name5 | 名称5 | name5 | varchar(50) |  | 字符串 (String) |
| 15 | name6 | 名称6 | name6 | varchar(50) |  | 字符串 (String) |
| 16 | flag_active | 生效标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 20 | modifier | 最后修改人 | modifier | char(20) |  | 主键 (UFID) |
| 21 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |