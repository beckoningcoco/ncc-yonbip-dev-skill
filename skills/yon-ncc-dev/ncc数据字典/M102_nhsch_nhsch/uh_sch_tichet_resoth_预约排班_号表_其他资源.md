# |<<

**预约排班_号表_其他资源 (uh_sch_tichet_resoth / com.yonyou.yh.nhis.sch.sch.vo.SchTicketResOthVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6275.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ticketresoth | 排班号表其它资源主键 | pk_ticketresoth | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | ticketno | 排队号 | ticketno | int |  | 整数 (Integer) |
| 5 | pk_res | 其它资源 | pk_res | varchar(20) |  | 排班资源 (SchResVO) |
| 6 | pk_resrole | 角色 | pk_resrole | varchar(20) |  | 角色 (Role) |
| 7 | dt_resrole | 角色编码 | dt_resrole | varchar(50) |  | 字符串 (String) |
| 8 | pk_schticket | 排班号表主键 | pk_schticket | varchar(20) |  | 预约排班_号表 (SchTicketVO) |
| 9 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 29 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 30 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 31 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 32 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |