# |<<

**交班总结(医生) (uh_ex_connect_doc / com.yonyou.yh.nhis.ex.ns.vo.UhExConnectDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6063.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_connect_doc | 主键 | pk_connect_doc | char(20) | √ | 主键 (UFID) |
| 2 | pk_connect_doc | 主键 | pk_connect_doc | char(20) | √ | 主键 (UFID) |
| 3 | pk_connect | 交班记录主键 | pk_connect | varchar(20) | √ | 交接班记录表 (UhExConnect) |
| 4 | pk_pvdept | 患者所在科室 | pk_pvdept | varchar(20) | √ | 患者就诊_科室病区 (pvbannerdept) |
| 5 | pk_pv | 患者主键 | pk_pv | varchar(20) | √ | 患者就诊 (pvbanner) |
| 6 | describe | 交班内容及注意事项 | describe | varchar(1000) | √ | 字符串 (String) |
| 7 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 8 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 9 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 10 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 11 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 12 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 13 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 14 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 15 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 16 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 17 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 18 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 19 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 20 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 21 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 22 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 23 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 24 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 25 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 26 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 27 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 28 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |
| 29 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 30 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 31 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 32 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |