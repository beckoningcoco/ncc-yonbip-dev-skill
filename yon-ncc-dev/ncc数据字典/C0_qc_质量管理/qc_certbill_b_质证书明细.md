# |<<

**质证书明细 (qc_certbill_b / nc.vo.qc.c006.entity.CertItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4826.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_certificate_b | 质证书明细主键 | pk_certificate_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | pk_srcmaterial | 物料 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | vmemob | 备注 | vmemob | varchar(181) |  | 字符串 (String) |
| 6 | csourcetypecode | 来源单据类型 | csourcetypecode | varchar(20) |  | 字符串 (String) |
| 7 | vsourcecode | 来源单据号 | vsourcecode | varchar(40) |  | 字符串 (String) |
| 8 | csourceid | 来源单据 | csourceid | varchar(20) |  | 主键 (UFID) |
| 9 | csourcebid | 来源单据明细 | csourcebid | varchar(20) |  | 主键 (UFID) |
| 10 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 11 | vsourcetrantype | 来源交易类型 | vsourcetrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | cfirstid | 源头单据主键 | cfirstid | varchar(20) |  | 主键 (UFID) |
| 13 | cfirstbid | 源头单据明细 | cfirstbid | varchar(20) |  | 主键 (UFID) |
| 14 | cfirsttypecode | 源头单据类型 | cfirsttypecode | varchar(20) |  | 字符串 (String) |
| 15 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 16 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 17 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 18 | pk_rccustomer | 收货客户 | pk_rccustomer | varchar(20) |  | 客户基本信息 (customer) |
| 19 | frowtype | 行属性 | frowtype | int |  | 行属性 (frowtype) |  | 0=产品; |