# |<<

**日报患者明细 (uh_mdr_dar_dt / nc.vo.nhex.warddailyv2.WardDailyDt)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6125.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mdrdar_dt | 主键 | pk_mdrdar_dt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pv | 就诊主键 | pk_pv | char(20) |  | 字符串 (String) |
| 5 | pk_pati | 患者主键 | pk_pati | char(20) |  | 字符串 (String) |
| 6 | patiname | 患者姓名 | patiname | varchar(50) |  | 字符串 (String) |
| 7 | pvcode | 住院号 | pvcode | varchar(50) |  | 字符串 (String) |
| 8 | flag_mi | 手工录入 | flag_mi | char(1) |  | 字符串 (String) |
| 9 | note | 备注 | note | varchar(100) |  | 字符串 (String) |
| 10 | eu_type | 类型 | eu_type | char(1) |  | 字符串 (String) |
| 11 | pk_sex | 性别主键 | pk_sex | char(20) |  | 字符串 (String) |
| 12 | dt_sex | 性别 | dt_sex | varchar(10) |  | 字符串 (String) |
| 13 | bedcode | 床号 | bedcode | varchar(50) |  | 字符串 (String) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |