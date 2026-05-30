# |<<

**组织结构_报表组织体系成员含编码名称 (org_rmsmember / nc.vo.corg.ReportManaStruMemberWithCodeNameVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4158.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rmsmember | 报表组织体系成员主键 | pk_rmsmember | char(20) | √ | 主键 (UFID) |
| 2 | pk_rms | 报表组织体系主键 | pk_rms | varchar(20) |  | 组织结构_报表组织体系 (reportmanastru) |
| 3 | pk_org | 对应组织 | pk_org | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 4 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 5 | pk_fathermember | 上级成员 | pk_fathermember | varchar(20) |  | 组织结构_报表组织体系成员 (reportmanastrumember) |
| 6 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |