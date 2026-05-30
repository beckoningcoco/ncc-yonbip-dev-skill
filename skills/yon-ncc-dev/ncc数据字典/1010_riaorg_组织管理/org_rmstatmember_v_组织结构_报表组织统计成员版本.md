# |<<

**组织结构_报表组织统计成员版本 (org_rmstatmember_v / nc.vo.vorg.ReportManaStatMemberVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4160.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 成员版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_rmstatmember | 报表组织统计成员主键 | pk_rmstatmember | varchar(20) | √ | 字符串 (String) |
| 3 | pk_rmsmember | 报表组织体系成员主键 | pk_rmsmember | varchar(20) |  | 字符串 (String) |
| 4 | pk_rms | 报表组织体系主键 | pk_rms | varchar(20) |  | 字符串 (String) |
| 5 | pk_org | 对应组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 6 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 字符串 (String) |
| 7 | pk_fathermember | 上级成员 | pk_fathermember | varchar(20) |  | 字符串 (String) |
| 8 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 9 | dataoriginflag | 分布式 | dataoriginflag | int |  | 整数 (Integer) |
| 10 | ismanageorg | 报表管理组织 | ismanageorg | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_entityorg | 对应实体组织 | pk_entityorg | varchar(20) |  | 字符串 (String) |
| 12 | entityorgtype | 实体组织类型 | entityorgtype | int |  | 整数 (Integer) |
| 13 | idx | 排列顺序 | idx | int |  | 整数 (Integer) |
| 14 | vname | 版本名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 15 | vno | 版本号 | vno | varchar(50) |  | 字符串 (String) |
| 16 | vstartdate | 版本生效时间 | vstartdate | char(19) |  | 日期 (UFDate) |
| 17 | venddate | 版本失效时间 | venddate | char(19) |  | 日期 (UFDate) |
| 18 | islastversion | 是否最新版本 | islastversion | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | pk_svid | 体系版本主键 | pk_svid | varchar(20) |  | 字符串 (String) |
| 20 | pk_orgvid | 组织版本主键 | pk_orgvid | char(20) |  | 主键 (UFID) |
| 21 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifier | 最后修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 24 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |