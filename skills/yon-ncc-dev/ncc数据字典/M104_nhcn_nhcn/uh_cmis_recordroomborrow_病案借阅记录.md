# |<<

**病案借阅记录 (uh_cmis_recordroomborrow / com.yonyou.yh.nhis.cn.cmis.borrow.vo.RecordRoomBorrowVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5955.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recordroomborrow | 主键 | pk_recordroomborrow | char(20) | √ | 主键 (UFID) |
| 2 | cardtime | 归档年度 | cardtime | varchar(50) |  | 字符串 (String) |
| 3 | cardnumber | 病案号码 | cardnumber | varchar(50) |  | 字符串 (String) |
| 4 | patiname | 患者姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 5 | sex | 性别 | sex | varchar(50) |  | 字符串 (String) |
| 6 | cndiag | 主要诊断 | cndiag | varchar(50) |  | 字符串 (String) |
| 7 | ordop | 手术名称 | ordop | varchar(50) |  | 字符串 (String) |
| 8 | outdate | 出院日期 | outdate | char(19) |  | 日期 (UFDate) |
| 9 | outdept | 出院科室 | outdept | varchar(50) |  | 字符串 (String) |
| 10 | cardquality | 病案质量 | cardquality | varchar(50) |  | 字符串 (String) |
| 11 | borrow_status | 借阅状态 | borrow_status | varchar(50) |  | 字符串 (String) |
| 12 | pk_borrow_name | 借阅人 | pk_borrow_name | varchar(50) |  | 字符串 (String) |
| 13 | pk_borrow_dept | 所在科室 | pk_borrow_dept | varchar(50) |  | 字符串 (String) |
| 14 | borrow_purpose | 借阅用途 | borrow_purpose | varchar(50) |  | 字符串 (String) |
| 15 | start_date | 借阅日期 | start_date | char(19) |  | 日期 (UFDate) |
| 16 | borrow_day | 借阅天数 | borrow_day | varchar(50) |  | 字符串 (String) |
| 17 | end_date | 应还日期 | end_date | char(19) |  | 日期 (UFDate) |
| 18 | return_date | 归还日期 | return_date | char(19) |  | 日期 (UFDate) |
| 19 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 20 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 21 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 22 | return_creator | 归还经办人 | return_creator | varchar(50) |  | 字符串 (String) |
| 23 | urge_num | 催还次数 | urge_num | int |  | 整数 (Integer) |
| 24 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 25 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 26 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 27 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 28 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 29 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 30 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 31 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 32 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 33 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 34 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 35 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 36 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 37 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 38 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 39 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 40 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 41 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 42 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 43 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |
| 44 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 45 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 46 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 47 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |