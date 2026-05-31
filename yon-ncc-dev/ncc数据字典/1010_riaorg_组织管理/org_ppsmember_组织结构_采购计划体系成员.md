# |<<

**组织结构_采购计划体系成员 (org_ppsmember / nc.vo.corg.PurPlanStruMemberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4131.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ppsmember | 采购计划体系成员主键 | pk_ppsmember | char(20) | √ | 主键 (UFID) |
| 2 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 3 | pk_pps | 采购计划体系主键 | pk_pps | char(20) | √ | 组织结构_采购计划体系 (purplanstru) |
| 4 | pk_org | 对应组织 | pk_org | char(20) | √ | 组织 (org) |
| 5 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 6 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |