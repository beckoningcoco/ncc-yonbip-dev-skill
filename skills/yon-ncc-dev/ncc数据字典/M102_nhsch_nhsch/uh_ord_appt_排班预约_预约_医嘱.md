# |<<

**排班预约_预约_医嘱 (uh_ord_appt / com.yonyou.yh.nhis.sch.appt.vo.OrdApptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6140.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordappt | 医嘱预约主键 | pk_ordappt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_dept | 对应科室 | pk_dept | varchar(50) |  | 字符串 (String) |
| 5 | code_msp | 对应医技资源 | code_msp | varchar(30) |  | 字符串 (String) |
| 6 | code_ord | 对应医嘱 | code_ord | varchar(50) |  | 字符串 (String) |
| 7 | flag_exec | 执行标志 | flag_exec | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | date_exec | 执行日期 | date_exec | varchar(50) |  | 字符串 (String) |
| 9 | pk_exordtype | 执行类型 | pk_exordtype | varchar(20) |  | 执行类型(自定义档案) (Defdoc-050301) |
| 10 | dt_exordtype | 执行类型编码 | dt_exordtype | varchar(50) |  | 字符串 (String) |
| 11 | code_exec | 执行编码 | code_exec | varchar(50) |  | 字符串 (String) |
| 12 | pk_schappt | 排班预约主键 | pk_schappt | varchar(50) |  | 字符串 (String) |
| 13 | pk_pvtype | 就诊流程 | pk_pvtype | varchar(50) |  | 字符串 (String) |
| 14 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 34 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 35 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 36 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 37 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |