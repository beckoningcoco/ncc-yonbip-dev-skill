# |<<

**组织结构_预算统计体系成员 (org_bssmember / nc.vo.corg.BudgetStatStruMemberWithCodeNameVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4017.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bssmember | 预算统计体系成员主键 | pk_bssmember | char(20) | √ | 主键 (UFID) |
| 2 | pk_bosmember | 预算组织体系成员主键 | pk_bosmember | varchar(20) |  | 组织结构_预算组织体系成员 (budgetorgstrumember) |
| 3 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 4 | pk_bos | 预算组织体系主键 | pk_bos | char(20) | √ | 组织结构_预算组织体系 (budgetorgstru) |
| 5 | pk_org | 对应组织 | pk_org | char(20) | √ | 组织 (org) |
| 6 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |