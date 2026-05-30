# |<<

**社保数据 (bm_data / nc.vo.bm.data.BmDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1223.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bm_data | 社保数据表主键 | pk_bm_data | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc | 人员基本信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 3 | pk_psnjob | 人员工作记录 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 4 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 字符串 (String) |
| 5 | assgid | 任职关系ID | assgid | int |  | 整数 (Integer) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 8 | pk_bm_class | 险种 | pk_bm_class | varchar(20) |  | 险种 (bmclass) |
| 9 | cyear | 年度 | cyear | char(4) |  | 主键 (UFID) |
| 10 | cperiod | 期间 | cperiod | char(2) |  | 主键 (UFID) |
| 11 | caculateflag | 计算标志 | caculateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | checkflag | 审核标志 | checkflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | bmaccountno | 社保账号 | bmaccountno | varchar(40) |  | 字符串 (String) |
| 14 | paylocation | 缴交地 | paylocation | varchar(20) |  | 缴交地规则 (locationrule) |
| 15 | dbegindate | 开户日期 | dbegindate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 16 | accountstate | 账户状态 | accountstate | char(50) |  | 账户状态 (BmAccountstatus) |  | 0=正常; |