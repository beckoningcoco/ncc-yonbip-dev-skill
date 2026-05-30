# |<<

**排班_号表生成规则 (uh_sch_ticketrules / com.yonyou.yh.nhis.sch.rule.vo.SchRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6278.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ticketrules | 逻辑主键 | pk_ticketrules | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | rulecode | 规则编码 | rulecode | varchar(30) |  | 字符串 (String) |
| 5 | rulename | 规则名称 | rulename | varchar(50) |  | 多语文本 (MultiLangText) |
| 6 | pk_ticketrule | 规则类型 | pk_ticketrule | varchar(20) |  | 号表生成规则类型(自定义档案) (Defdoc-020001) |
| 7 | dt_ticketrule | 规则类型编码 | dt_ticketrule | varchar(20) |  | 字符串 (String) |
| 8 | ticketstart | 开始号码 | ticketstart | int |  | 整数 (Integer) |
| 9 | ticketsend | 结束号码 | ticketsend | int |  | 整数 (Integer) |
| 10 | tickets | 号表枚举 | tickets | varchar(256) |  | 字符串 (String) |
| 11 | func | 外挂函数 | func | varchar(256) |  | 字符串 (String) |
| 12 | flag_stop | 停用标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) | N |
| 13 | pk_schcate | 规则分类 | pk_schcate | varchar(20) |  | 字符串 (String) |
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
| 34 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 35 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 36 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |
| 37 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |