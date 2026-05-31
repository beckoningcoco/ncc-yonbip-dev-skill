# |<<

**血清学检查 (uh_oc_expose_report_ts / com.yonyou.yh.nhis.cn.hims.vo.OcExposeReportFuTslistVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6139.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oc_expose_report_ts | 主键 | pk_oc_expose_report_ts | char(50) | √ | 主键 (UFID) |
| 2 | test_time | 时间点 | test_time | varchar(50) |  | 字符串 (String) |
| 3 | pk_test_time | 时间点主键 | pk_test_time | varchar(50) |  | 字符串 (String) |
| 4 | test_name | 检验项目 | test_name | varchar(50) |  | 字符串 (String) |
| 5 | pk_test | 检验项目主键 | pk_test | varchar(50) |  | 字符串 (String) |
| 6 | test_date | 检验日期 | test_date | varchar(50) |  | 字符串 (String) |
| 7 | test_result | 检验结果 | test_result | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |