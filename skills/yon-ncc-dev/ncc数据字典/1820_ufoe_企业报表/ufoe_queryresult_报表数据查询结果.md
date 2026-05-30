# |<<

**报表数据查询结果 (ufoe_queryresult / nc.vo.iufo.repdataquery.RepDataQueryResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5907.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_result | 主键 | pk_result | char(20) | √ | 主键 (UFID) |
| 2 | alone_id | AloneID | alone_id | varchar(32) | √ | 字符串 (String) |
| 3 | pk_report | 报表 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 5 | keyword1 | 关键字值1 | keyword1 | varchar(50) |  | 字符串 (String) |
| 6 | keyword2 | 关键字值2 | keyword2 | varchar(50) |  | 字符串 (String) |
| 7 | keyword3 | 关键字值3 | keyword3 | varchar(50) |  | 字符串 (String) |
| 8 | keyword4 | 关键字值4 | keyword4 | varchar(50) |  | 字符串 (String) |
| 9 | keyword5 | 关键字值5 | keyword5 | varchar(50) |  | 字符串 (String) |
| 10 | keyword6 | 关键字值6 | keyword6 | varchar(50) |  | 字符串 (String) |
| 11 | keyword7 | 关键字值7 | keyword7 | varchar(50) |  | 字符串 (String) |
| 12 | keyword8 | 关键字值8 | keyword8 | varchar(50) |  | 字符串 (String) |
| 13 | keyword9 | 关键字值9 | keyword9 | varchar(50) |  | 字符串 (String) |
| 14 | keyword10 | 关键字值10 | keyword10 | varchar(50) |  | 字符串 (String) |
| 15 | inputstate | 录入标志 | inputstate | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | inputperson | 录入人 | inputperson | varchar(20) |  | 用户 (user) |
| 17 | inputtime | 录入时间 | inputtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | muscommflag | 必报标志 | muscommflag | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | musinputflag | 必录标志 | musinputflag | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | repcheckperson | 表内审核人 | repcheckperson | varchar(20) |  | 用户 (user) |
| 21 | repchecktime | 表内审核时间 | repchecktime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | taskcheckperson | 任务审核人 | taskcheckperson | varchar(20) |  | 用户 (user) |
| 23 | taskchecktime | 任务审核时间 | taskchecktime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | reqbackflag | 请求退回标志 | reqbackflag | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | reqbackperson | 请求退回人 | reqbackperson | varchar(20) |  | 用户 (user) |
| 26 | reqbacktime | 请求退回时间 | reqbacktime | char(19) |  | 日期时间 (UFDateTime) |
| 27 | hastenflag | 催报标志 | hastenflag | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | hastenperson | 催报人 | hastenperson | varchar(20) |  | 用户 (user) |
| 29 | hastentime | 催报时间 | hastentime | char(19) |  | 日期时间 (UFDateTime) |
| 30 | lastoperation | 最后上报动作 | lastoperation | int |  | 报送动作 (CommitActionEnum) |  | 22=上报; |