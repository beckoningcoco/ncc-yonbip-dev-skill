# |<<

**薪资结账表 (wa_periodstate / nc.vo.wa.periodsate.WaPeriodstateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6345.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_periodstate | 薪资结账表主键 | pk_periodstate | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_class | 薪资类别表主键 | pk_wa_class | varchar(20) |  | 薪资方案 (WaClassVO) |
| 3 | pk_wa_period | 薪资期间主键 | pk_wa_period | varchar(20) |  | 薪资期间 (PeriodVO) |
| 4 | checkflag | 审核标志 | checkflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | enableflag | 启用标志 | enableflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | caculateflag | 计算标志 | caculateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | payoffflag | 发放标志 | payoffflag | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | accountmark | 结帐标志 | accountmark | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | operatorid | 操作员ID | operatorid | varchar(20) |  | 用户 (user) |
| 10 | daccdate | 操作日期 | daccdate | char(10) |  | 日期 (UFDate) |
| 11 | vpaycomment | 发放说明 | vpaycomment | varchar(2000) |  | 字符串 (String) |
| 12 | cpaydate | 到帐日期 | cpaydate | char(10) |  | 日期 (UFDate) |
| 13 | cpreclassid | 上一个发放类别 | cpreclassid | varchar(20) |  | 薪资方案 (WaClassVO) |
| 14 | isapproved | 是否审批通过 | isapproved | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 16 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 17 | classtype | 方案类型 | classtype | int |  | 整数 (Integer) |
| 18 | isapporve | 发放数据需审批 | isapporve | varchar(1) |  | 布尔类型 (UFBoolean) |