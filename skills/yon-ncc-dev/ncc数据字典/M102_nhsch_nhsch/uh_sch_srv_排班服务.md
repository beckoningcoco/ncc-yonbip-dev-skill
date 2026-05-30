# |<<

**排班服务 (uh_sch_srv / com.yonyou.yh.nhis.sch.schsrv.vo.UhSchSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6268.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schsrv | 排班服务主键 | pk_schsrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_schcate | 排班分类 | pk_schcate | varchar(50) |  | 字符串 (String) |
| 5 | code_schsrv | 排班服务编码 | code_schsrv | varchar(30) |  | 字符串 (String) |
| 6 | name_schsrv | 排班服务名称 | name_schsrv | varchar(50) |  | 多语文本 (MultiLangText) |
| 7 | mnecode | 输入码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(20) |  | 字符串 (String) |
| 9 | pk_ticketrules | 排班生成规则 | pk_ticketrules | varchar(20) |  | 排班_号表生成规则 (SchRuleVO) |
| 10 | stopflag | 停用标志 | stopflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 11 | pk_srvtype | 服务类型 | pk_srvtype | char(20) |  | 字符串 (String) |
| 12 | flag_stop | 停止标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) | N |
| 13 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 33 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 34 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 35 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 36 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |