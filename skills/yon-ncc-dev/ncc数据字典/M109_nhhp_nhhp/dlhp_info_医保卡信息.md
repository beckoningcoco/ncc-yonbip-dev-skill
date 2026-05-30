# |<<

**医保卡信息 (dlhp_info / com.yonyou.yh.nhis.hp.dalian.vo.DlHpInfo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1701.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hp | 读卡信息主键 | pk_hp | char(20) | √ | 主键 (UFID) |
| 2 | pk_pv | 就诊主键 | pk_pv | varchar(50) | √ | 字符串 (String) |
| 3 | codeorg | 医院编码 | codeorg | varchar(50) |  | 字符串 (String) |
| 4 | outpatinum | 子门诊号 | outpatinum | varchar(50) |  | 字符串 (String) |
| 5 | ssn | 保险编号 | ssn | varchar(50) |  | 字符串 (String) |
| 6 | curenum | 治疗序号 | curenum | varchar(50) |  | 字符串 (String) |
| 7 | flag_active | 启用标识 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_group | 集团主键 | pk_group | varchar(50) |  | 字符串 (String) |
| 9 | pk_org | 机构主键 | pk_org | varchar(50) |  | 字符串 (String) |
| 10 | zgclitype | 职工就医类别 | zgclitype | varchar(1) |  | 字符串 (String) |
| 11 | acc_base | 基本个人账户余额 | acc_base | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | acc_sub | 补助个人账户余额 | acc_sub | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | amt_ins | 统筹累计 | amt_ins | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | amt_chronic | 门诊慢性病统筹累计 | amt_chronic | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | amt_month | 月缴费基数 | amt_month | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | eu_status | 账户状态 | eu_status | varchar(50) |  | 字符串 (String) |
| 17 | type_hp1 | 参保类别1 | type_hp1 | varchar(50) |  | 字符串 (String) |
| 18 | type_hp2 | 参保类别2 | type_hp2 | varchar(50) |  | 字符串 (String) |
| 19 | type_hp3 | 参保类别3 | type_hp3 | varchar(50) |  | 字符串 (String) |
| 20 | type_hp4 | 参保类别4 | type_hp4 | varchar(50) |  | 字符串 (String) |
| 21 | type_hp5 | 参保类别5 | type_hp5 | varchar(50) |  | 字符串 (String) |
| 22 | ipcount | 住院次数累计 | ipcount | int |  | 整数 (Integer) |
| 23 | homebedcount | 家床次数累计 | homebedcount | int |  | 整数 (Integer) |
| 24 | hprtn | 医保返回字符串 | hprtn | varchar(50) |  | 字符串 (String) |
| 25 | def1 | 冗余字段def1 | def1 | varchar(50) |  | 字符串 (String) |
| 26 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |
| 27 | def3 | def3 | def3 | varchar(50) |  | 字符串 (String) |
| 28 | def4 | def4 | def4 | varchar(50) |  | 字符串 (String) |
| 29 | def5 | def5 | def5 | varchar(50) |  | 字符串 (String) |
| 30 | def6 | def6 | def6 | varchar(50) |  | 字符串 (String) |
| 31 | def7 | def7 | def7 | varchar(50) |  | 字符串 (String) |
| 32 | def8 | def8 | def8 | varchar(50) |  | 字符串 (String) |
| 33 | def9 | def9 | def9 | varchar(50) |  | 字符串 (String) |