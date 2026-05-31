# |<<

**险种期间 (bm_periodstate / nc.vo.bm.period.BmPeriodstateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1232.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_periodstate | 险种期间状态主键 | pk_periodstate | char(20) | √ | 主键 (UFID) |
| 2 | pk_bm_class | 险种类别PK | pk_bm_class | varchar(20) |  | 险种 (bmclass) |
| 3 | pk_bm_period | 险种期间 | pk_bm_period | varchar(20) |  | 险种期间 (BmPeriodVO) |
| 4 | recacuflag | 计算标志 | recacuflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | checkflag | 审核标志 | checkflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | accountmark | 结帐标志 | accountmark | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | operatorid | 操作员 | operatorid | varchar(20) |  | 用户 (user) |
| 8 | daccountdate | 结帐日期 | daccountdate | char(19) |  | 日期 (UFDate) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | enableflag | 生效标示 | enableflag | char(1) |  | 布尔类型 (UFBoolean) |