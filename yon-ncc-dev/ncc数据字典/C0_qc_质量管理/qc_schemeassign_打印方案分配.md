# |<<

**打印方案分配 (qc_schemeassign / nc.vo.qc.printscheme.entity.PrintSchemeAssignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4868.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schemeassign | 打印方案分配 | pk_schemeassign | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心（OID） | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 5 | pk_printscheme | 打印方案 | pk_printscheme | varchar(20) |  | 打印方案 (qc_printscheme) |
| 6 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | vinnercode | 物料分类内部码 | vinnercode | varchar(200) |  | 字符串 (String) |