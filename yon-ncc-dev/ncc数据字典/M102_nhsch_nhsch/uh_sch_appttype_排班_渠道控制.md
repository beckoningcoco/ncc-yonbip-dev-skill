# |<<

**排班_渠道控制 (uh_sch_appttype / com.yonyou.yh.nhis.sch.sch.vo.SchApptTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6258.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schappttype | 排班预约渠道主键 | pk_schappttype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_sch | 排班主键 | pk_sch | varchar(20) |  | 排班预约_排班 (SchVO) |
| 5 | pk_appttype | 预约渠道 | pk_appttype | varchar(20) |  | 预约渠道维护 (AppttypeVO) |
| 6 | pk_schpool | 对应排班号源池 | pk_schpool | char(20) |  | 字符串 (String) |
| 7 | ticketnos | 可使用的票号串 | ticketnos | varchar(4000) |  | 字符串 (String) |
| 8 | stopflag | 停止标志 | stopflag | char(1) |  | 布尔类型 (UFBoolean) |
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