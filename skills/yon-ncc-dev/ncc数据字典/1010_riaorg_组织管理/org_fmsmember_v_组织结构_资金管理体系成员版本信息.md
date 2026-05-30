# |<<

**组织结构_资金管理体系成员版本信息 (org_fmsmember_v / nc.vo.vorg.FundManaSystemMemberVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 成员版本主键 | pk_vid | char(20) | √ | 组织结构_资金管理体系成员版本信息 (fundmanasystemmember_v) |
| 2 | pk_fmsmember | 资金管理体系成员主键 | pk_fmsmember | char(20) | √ | 主键 (UFID) |
| 3 | pk_org | 对应组织 | pk_org | char(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_fms | 资金管理体系主键 | pk_fms | char(20) | √ | 组织结构_资金管理体系 (fundmanasystem) |
| 6 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |