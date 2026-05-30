# |<<

**工作记录 (hi_psnjob / nc.vo.hi.psndoc.PsnJobVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2597.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnjob | 工作记录 | pk_psnjob | char(20) | √ | 主键 (UFID) |
| 2 | clerkcode | 员工号 | clerkcode | varchar(40) | √ | 字符串 (String) |
| 3 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织_业务单元_行政组织 (adminorg) |
| 4 | psntype | 人员类型 | psntype | int |  | 人员类型 (PsnType) | 0 | 0=员工; |