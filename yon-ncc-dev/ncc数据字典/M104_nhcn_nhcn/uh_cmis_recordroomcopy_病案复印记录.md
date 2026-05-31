# |<<

**病案复印记录 (uh_cmis_recordroomcopy / com.yonyou.yh.nhis.cn.cmis.copy.vo.RecordRoomCopyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5956.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recordroomcopy | 主键 | pk_recordroomcopy | char(20) | √ | 主键 (UFID) |
| 2 | copy_name | 复印人姓名 | copy_name | varchar(50) |  | 字符串 (String) |
| 3 | copy_idno | 复印者证件号码 | copy_idno | varchar(50) |  | 字符串 (String) |
| 4 | copy_company | 复印者所在单位 | copy_company | varchar(50) |  | 字符串 (String) |
| 5 | copy_num | 复印张数 | copy_num | int |  | 整数 (Integer) |
| 6 | copy_date | 复印日期 | copy_date | char(19) |  | 日期 (UFDate) |
| 7 | copy_purpose | 复印用途 | copy_purpose | varchar(50) |  | 字符串 (String) |
| 8 | cardnumber | 病案号码 | cardnumber | varchar(50) |  | 字符串 (String) |
| 9 | cardtime | 病案年度 | cardtime | varchar(50) |  | 字符串 (String) |
| 10 | patiname | 患者姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 11 | sex | 性别 | sex | varchar(50) |  | 字符串 (String) |
| 12 | idno | 证件号码 | idno | varchar(50) |  | 字符串 (String) |
| 13 | outdate | 出院日期 | outdate | char(19) |  | 日期 (UFDate) |
| 14 | outdept | 出院科室 | outdept | varchar(50) |  | 字符串 (String) |
| 15 | nocode | 复印序号 | nocode | varchar(50) |  | 字符串 (String) |
| 16 | copy_content | 复印内容 | copy_content | varchar(50) |  | 字符串 (String) |
| 17 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 18 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 19 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 20 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 21 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 22 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 23 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 24 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 25 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 26 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 27 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 28 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 29 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 30 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 31 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 32 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 33 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 34 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 35 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 36 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 37 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 38 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 39 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |
| 40 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 41 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 42 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 43 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |