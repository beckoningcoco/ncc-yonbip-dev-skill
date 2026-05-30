# |<<

**决策会议形式设置 (scapto_decidemeetingform / nc.vo.scapto.decidemeetingform.DecideMeetingFormVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5117.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_decidemeetingform | 主键 | pk_decidemeetingform | char(20) | √ | 主键 (UFID) |
| 2 | code | 决策会议形式编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 决策会议形式名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_decidesubjecttype | 对应决策主体 | pk_decidesubjecttype | varchar(20) |  | 决策主体类型设置 (DecideSubjectTypeVO) |
| 5 | enablestate | 启用状态 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bispreset | 预置标志 | bispreset | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | memo | 备注 | memo | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 9 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 10 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 12 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 32 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 33 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 34 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 35 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |